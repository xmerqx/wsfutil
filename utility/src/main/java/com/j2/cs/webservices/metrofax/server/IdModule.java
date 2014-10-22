package com.j2.cs.webservices.metrofax.server;

import com.j2.cs.webservices.metrofax.server.id.MetroFaxFaxId;
import com.j2.cs.webservices.metrofax.server.id.MetroFaxTrackingNumber;
import com.j2.cs.webservices.metrofax.shared.Tuple;

public class IdModule {
	
	public Tuple<String, String> decodeFaxID(String faxID){
		Tuple<String, String> result;
		
		MetroFaxFaxId faxId = new MetroFaxFaxId(Long.valueOf(faxID));
		String serviceKey = Long.toString(faxId.getServiceKey());
		String messageId = Long.toString(faxId.getMessageId());
		
		result = new Tuple<String, String>(serviceKey, messageId);
		
		return result;
	}
	
	public Tuple<String, String> decodeTrackingNumber(String trkNum){
		Tuple<String, String> result;
		
		MetroFaxTrackingNumber trackingNumber = 
				new MetroFaxTrackingNumber(Long.valueOf(trkNum));
		String serviceKey = Long.toString(trackingNumber.getServiceKey());
		String messageId = Long.toString(trackingNumber.getTransactionId());
		
		result = new Tuple<String, String>(serviceKey, messageId);
		
		return result;
	}
	
	public String encodeFaxId(String serviceKey, String timeStamp){
		String faxId = "";
		MetroFaxFaxId metroFaxFaxId = 
				new MetroFaxFaxId(Long.valueOf(serviceKey), Long.valueOf(timeStamp));
		
		faxId = Long.toString(metroFaxFaxId.getFaxId());
		
		
		return faxId;
	}
	
	
	
	

}
