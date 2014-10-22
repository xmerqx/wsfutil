package com.j2.cs.webservices.metrofax.client;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import com.j2.cs.webservices.metrofax.shared.Tuple;
import com.j2.cs.webservices.metrofax.shared.exception.ElectricMailException;

/**
 * The client-side stub for the RPC service.
 */
@RemoteServiceRelativePath("util")
public interface UtilityService extends RemoteService {

	String getFusemailMessage(String serviceKey, String did, String faxId, boolean isInbound) throws IllegalArgumentException, ElectricMailException;
	Tuple<String, String> decodeFaxId(String faxId) throws IllegalArgumentException;
	Tuple<String, String> decodeTrackingNumber(String faxId)throws IllegalArgumentException;
	String encodeFaxId(String serviceKey, String timeStamp)throws IllegalArgumentException;
}
