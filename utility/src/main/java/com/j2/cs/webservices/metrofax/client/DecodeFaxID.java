/**
 * 
 */
package com.j2.cs.webservices.metrofax.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.LongBox;
import com.j2.cs.webservices.metrofax.shared.Tuple;
import com.google.gwt.user.client.ui.CheckBox;


/**
 * @author christian.banzon
 *
 */
public class DecodeFaxID extends Composite implements HasText {
	private final UtilityServiceAsync service;

	private static DecodeFaxIDUiBinder uiBinder = GWT
			.create(DecodeFaxIDUiBinder.class);
	@UiField VerticalPanel verticalPanel;
	@UiField Button button;
	@UiField TextBox serviceKeyLabel;
	@UiField TextBox messageIdField;
	@UiField LongBox faxIdField;
	@UiField CheckBox encodeBox;

	interface DecodeFaxIDUiBinder extends UiBinder<Widget, DecodeFaxID> {
	}

	
	public DecodeFaxID(UtilityServiceAsync service) {
		this.service = service;
		initWidget(uiBinder.createAndBindUi(this));
		this.faxIdField.getElement().setPropertyString("placeholder", "Fax ID");
		this.serviceKeyLabel.setReadOnly(true);
		this.messageIdField.setReadOnly(true);
	}
	

	public void setText(String text) {
		button.setText(text);
	}

	/**
	 * Gets invoked when the default constructor is called
	 * and a string is provided in the ui.xml file.
	 */
	public String getText() {
		return button.getText();
	}
	@UiHandler("button")
	void onButtonClick(ClickEvent event) {
		if(this.encodeBox.getValue()){
			this.callEncodeFaxId();
		}
		else{
			this.callDecodeFaxId();
		}
		
		
	}
	
	void callEncodeFaxId(){
		if(!this.verifyInput())
		{
			Window.alert("Please enter ServiceKey and Timestamp/Message-ID");
		}
		else
		{
			this.service.encodeFaxId(this.serviceKeyLabel.getText(),
					this.messageIdField.getText(),
					new AsyncCallback<String>(){

						public void onFailure(Throwable caught) {
							Window.alert("Error retrieving Decoded Fax ID");
							
						}

						public void onSuccess(String result) {
							DecodeFaxID.this.faxIdField.setText(result);
							
						}
				
			});
		}
	}
	
	void callDecodeFaxId(){
		if(!this.verifyInput())
		{
			Window.alert("Please enter Fax ID");
		}
		else
		{
			this.service.decodeFaxId(this.faxIdField.getText(), 
					new AsyncCallback<Tuple<String, String>>(){

						public void onFailure(Throwable caught) {
							Window.alert("Error retrieving Decoded Fax ID");
							
						}

						public void onSuccess(Tuple<String, String> result) {
							DecodeFaxID.this.serviceKeyLabel.setText(result.getA());
							DecodeFaxID.this.messageIdField.setText(result.getB());
							
						}
				
			});
		}
	}
	
	boolean verifyInput(){
		boolean result = true;
		
		if(this.encodeBox.getValue()){
			if(this.isBlank(this.serviceKeyLabel.getText()) ||
					this.isBlank(this.messageIdField.getText()) ){
				result = false;
			}
		}
		
		else if(this.isBlank(this.faxIdField.getText())){
			result = false;
		}
		
		return result;
	}
	
	private boolean isBlank(String string){
		if(string == null || string.isEmpty()){
			return true;
		}
		else{
			return false;
		}
	}
	
	@UiHandler("encodeBox")
	void onEncodeBoxClick(ClickEvent event) {
		if(this.encodeBox.getValue())
		{
			this.faxIdField.setReadOnly(true);
			this.serviceKeyLabel.setReadOnly(false);
			this.messageIdField.setReadOnly(false);
			this.button.setText("Encode");
		}
		else if(!this.encodeBox.getValue())
		{
			this.faxIdField.setReadOnly(false);
			this.serviceKeyLabel.setReadOnly(true);
			this.messageIdField.setReadOnly(true);
			this.button.setText("Decode");
		}
	}
}
