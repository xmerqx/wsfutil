package com.j2.cs.webservices.metrofax.server;

import java.util.List;
import java.util.UUID;









import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.j2.cs.webservices.metrofax.client.UtilityService;
import com.j2.cs.webservices.metrofax.server.id.MetroFaxFaxId;
import com.j2.cs.webservices.metrofax.server.id.MetroFaxTrackingNumber;
import com.j2.cs.webservices.metrofax.shared.Tuple;
import com.j2.cs.webservices.metrofax.shared.exception.ElectricMailException;

/**
 * The server-side implementation of the RPC service.
 */
@SuppressWarnings("serial")
public class UtilityServiceImpl extends RemoteServiceServlet implements
		UtilityService {
	
	private final FuseMailAccessModule fusemailModule = new FuseMailAccessModule();
	private final IdModule idModule = new IdModule();

	public String translateGuid(String input) throws IllegalArgumentException {
		
		UUID uuid = null;
        String mid = null;
        String serviceKey = null;
        
        uuid = UUID.fromString(input);
        mid = Long.toString(uuid.getLeastSignificantBits());
        serviceKey = Long.toString(uuid.getMostSignificantBits());


		return "Service Key: "+serviceKey+"\n"+"MID: "+mid;
	}
	
	public Tuple<String,String> decodeTrackingNumber(String input) throws IllegalArgumentException {
		
		Tuple<String,String> result = this.idModule.decodeTrackingNumber(input);
		return result;
		
	}
	
	public Tuple<String,String> decodeFaxId(String input) throws IllegalArgumentException {
		Tuple<String,String> result = this.idModule.decodeFaxID(input);
		return result;
		
	}	
	
	public String encodeFaxId(String serviceKey, String timestamp) throws IllegalArgumentException {
		String result = this.idModule.encodeFaxId(serviceKey, timestamp);
		return result;
		
	}	
	
	public String getFusemailMessage(String serviceKey, String did,
			String faxId, boolean isInbound) throws IllegalArgumentException, ElectricMailException {
		// TODO Auto-generated method stub
		String result = this.fusemailModule.getFusemailMessage(serviceKey, did, faxId, isInbound);
		return result;
	}


}
