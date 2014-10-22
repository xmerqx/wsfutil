package com.j2.cs.webservices.metrofax.client;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.j2.cs.webservices.metrofax.shared.Tuple;
import com.j2.cs.webservices.metrofax.shared.exception.ElectricMailException;

/**
 * The async counterpart of <code>UtilityService</code>.
 */
public interface UtilityServiceAsync {


	void getFusemailMessage(String serviceKey, String did, String faxId,
			boolean isInbound, AsyncCallback<String> callback)
			throws IllegalArgumentException, ElectricMailException;
	
	void decodeFaxId(String faxId, 
			AsyncCallback<Tuple<String, String>> callback) 
			throws IllegalArgumentException;
	
	void decodeTrackingNumber(String faxId, 
			AsyncCallback<Tuple<String, String>> callback) 
			throws IllegalArgumentException;
	
	void encodeFaxId(String serviceKey, String timeStamp,
			AsyncCallback<String> callback)throws IllegalArgumentException;
}
