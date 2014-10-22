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
import com.google.gwt.user.client.ui.LongBox;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;
import com.j2.cs.webservices.metrofax.shared.Tuple;

/**
 * @author christian.banzon
 *
 */
public class DecodeTrackingNumber extends Composite {
	private final UtilityServiceAsync service;

	private static DecodeTrackingNumberUiBinder uiBinder = GWT
			.create(DecodeTrackingNumberUiBinder.class);

	interface DecodeTrackingNumberUiBinder extends
			UiBinder<Widget, DecodeTrackingNumber> {
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
	public DecodeTrackingNumber(UtilityServiceAsync service) {
		
		this.service = service;
		initWidget(uiBinder.createAndBindUi(this));
		this.trackingNumberField.getElement().setPropertyString("placeholder", "Tracking Number");
		this.serviceKeyField.setReadOnly(false);
		this.transactionIdField.setReadOnly(false);
	}

	@UiField
	Button button;
	@UiField
	LongBox trackingNumberField;
	@UiField
	TextBox serviceKeyField;
	@UiField
	TextBox transactionIdField;

	

	@UiHandler("button")
	void onClick(ClickEvent e) {
		this.callDecodeTrackingNumber();
	}

	public void setText(String text) {
		button.setText(text);
	}

	
	private void callDecodeTrackingNumber()
	{
		if(!this.verifyInput())
		{
			Window.alert("Please enter Tracking Number");
		}
		else
		{
			this.service.decodeFaxId(this.trackingNumberField.getText(), 
					new AsyncCallback<Tuple<String, String>>(){

						public void onFailure(Throwable caught) {
							Window.alert("Error retrieving Decoded Tracking Number");
							
						}

						public void onSuccess(Tuple<String, String> result) {
							DecodeTrackingNumber.this.serviceKeyField.setText(result.getA());
							DecodeTrackingNumber.this.transactionIdField.setText(result.getB());
							
						}
				
			});
		}
	}
	
	boolean verifyInput(){
		boolean result = true;
		
		if(this.isBlank(this.trackingNumberField.getText())){
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

}
