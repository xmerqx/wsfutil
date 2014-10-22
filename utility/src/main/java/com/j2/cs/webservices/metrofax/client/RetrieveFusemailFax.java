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
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.RadioButton;
import com.google.gwt.user.client.ui.TextArea;
import com.j2.cs.webservices.metrofax.server.util.StringHelper;
import com.j2.cs.webservices.metrofax.client.UtilityServiceAsync;

/**
 * @author christian.banzon
 *
 */
public class RetrieveFusemailFax extends Composite{
	
	private final UtilityServiceAsync service;
	private static RetrieveFusemailFaxUiBinder uiBinder = GWT
			.create(RetrieveFusemailFaxUiBinder.class);
	@UiField TextBox serviceKeyField;
	@UiField TextBox didField;
	@UiField TextBox faxIdField;
	@UiField RadioButton inboundRadio;
	@UiField RadioButton outboundRadio;
	@UiField Button retrieveButton;
	@UiField TextArea resultText;

	interface RetrieveFusemailFaxUiBinder extends
			UiBinder<Widget, RetrieveFusemailFax> {
	}

	/**
	 * Because this class has a default constructor, it can
	 * be used as a binder template. In other words, it can be used in other
	 * *.ui.xml files as follows:
	 * <ui:UiBinder xmlns:ui="urn:ui:com.google.gwt.uibinder"
	 *   xmlns:g="urn:import:**user's package**">
	 *  <g:**UserClassName**>Hello!</g:**UserClassName>
	 * </ui:UiBinder>
	 * Note that depending on the widget that is used, it may be necessary to
	 * implement HasHTML instead of HasText.
	 */
	public RetrieveFusemailFax(UtilityServiceAsync service) {
		initWidget(uiBinder.createAndBindUi(this));
		this.service = service;
		serviceKeyField.getElement().setPropertyString("placeholder", "Service Key");
		didField.getElement().setPropertyString("placeholder", "DID");
		faxIdField.getElement().setPropertyString("placeholder", "Fax ID");
		resultText.setReadOnly(true);
		resultText.getElement().getStyle().setProperty("maxWidth", "673px");
		resultText.getElement().getStyle().setProperty("maxHeight", "98px");
		resultText.getElement().getStyle().setProperty("minWidth", "673px");
		resultText.getElement().getStyle().setProperty("minHeight", "98px");
		inboundRadio.setValue(true);
		
		
	}


	@UiHandler("retrieveButton")
	void onRetrieveButtonClick(ClickEvent event) {
		//validate input
		boolean allValuesFilled = validateInput();
		
		if(!allValuesFilled){
			//if all values aren't filled in, we return an error
			Window.alert("Please enter all values for Fax ID, Service Key, and DID");
			return;
		}
		else{
			this.callRetrieveFusemailMessage();
		}
		
		
	}
	
	boolean validateInput(){
		boolean result = true;
		
		//check faxID
		String faxID = this.faxIdField.getText();
		if(this.isBlank(faxID)){
			result = false;
		}		
		
		//check ServiceKey
		String serviceKey = this.serviceKeyField.getText();
		if(this.isBlank(serviceKey)){
			result = false;
		}	
		//check DID
		String did = this.didField.getText();
		if(this.isBlank(did)){
			result = false;
		}	
		
		return result;
	}
	
	void callRetrieveFusemailMessage(){
		this.service.getFusemailMessage(this.serviceKeyField.getText(), 
				this.didField.getText(), this.faxIdField.getText(), 
				this.inboundRadio.getValue(), new AsyncCallback<String>(){

					public void onFailure(Throwable caught) {
						Window.alert("Error Retrieving Fusemail Message: "+caught.getMessage());
						
					}

					public void onSuccess(String result) {
						RetrieveFusemailFax.this.resultText.setText(result);
						
					}
		
		});
	}
	
	private boolean isBlank(String string){
		if(string == null || string.isEmpty()){
			return true;
		}
		else{
			return false;
		}
	}
}
