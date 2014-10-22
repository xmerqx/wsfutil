package com.j2.cs.webservices.metrofax.server;

import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.j2.cs.webservices.metrofax.server.fusemail.ElectricMailHeader;
import com.j2.cs.webservices.metrofax.server.fusemail.FusemailProxy;
import com.j2.cs.webservices.metrofax.server.id.MetroFaxFaxId;
import com.j2.cs.webservices.metrofax.server.json.JsonIntegerTypeAdapter;
import com.j2.cs.webservices.metrofax.server.json.JsonLongTypeAdapter;
import com.j2.cs.webservices.metrofax.shared.exception.ElectricMailException;

public class FuseMailAccessModule {
	private final FusemailProxy fp = new FusemailProxy();
	private static String FUSEMAIL_MAILBOX_DOMAIN_INBOUND;// = "@messages.efax.com";
	private static String FUSEMAIL_MAILBOX_DOMAIN_OUTBOUND;// = "@send.messages.efax.com";
	private static String INBOUND_HEADER_NAME;// = "Message-ID";
	private static String OUTBOUND_HEADER_NAME;// = "X-J2Id";
	private final Gson gson;
	
	public static void init(String inboundDomain, String outboundDomain, 
			String inboundHeader, String outboundHeader){
		
		FUSEMAIL_MAILBOX_DOMAIN_INBOUND = inboundDomain;
		FUSEMAIL_MAILBOX_DOMAIN_OUTBOUND = outboundDomain;
		INBOUND_HEADER_NAME = inboundHeader;
		OUTBOUND_HEADER_NAME = outboundHeader;
		
		System.out.println("Initialized Fusemail Access Module");
		
	}
	
	public FuseMailAccessModule(){
		GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapter(Long.class, new JsonLongTypeAdapter()).
                registerTypeAdapter(long.class, new JsonLongTypeAdapter()).
                registerTypeAdapter(Integer.class, new JsonIntegerTypeAdapter()).
                disableHtmlEscaping();
        gson = gsonBuilder.create();
		
	}
	
	public String getFusemailMessage(String serviceKey, String did,
			String faxId, boolean isInbound){
		
		String result = "";
		
		//decode the fax id
		MetroFaxFaxId decodedId = new MetroFaxFaxId(Long.valueOf(faxId));
		long messageId = decodedId.getMessageId();		
		
		//depending on inbound or outbound, we'll call a specific retrieval method
		if(isInbound)
		{
			result= this.getInboundMessage(did, Long.toString(messageId));
		}
		else
		{
			result = this.getOutboundMessage(serviceKey, Long.toString(messageId));
		}
		
		
		return result;
		
	}
	
	private String getInboundMessage(String did, String timestamp) throws ElectricMailException{
		String result = "";
		String mailbox = did+FUSEMAIL_MAILBOX_DOMAIN_INBOUND;
		 List<ElectricMailHeader> list= 
				 this.fp.getMailByHeaderSubstring(mailbox, INBOUND_HEADER_NAME, timestamp, "0", "1");
		 
		 if(list!=null&&!list.isEmpty())
		 {
			 result = this.createResultMessageFromHeader(list.get(0));
		 }
		 else
		 {
			 result = "Unable to find Message in Fusemail.";
		 }
		 
		
		return result;
	}
	
	private String getOutboundMessage(String serviceKey, String faxId) throws ElectricMailException{
		String result = "";
		String mailbox = serviceKey+FUSEMAIL_MAILBOX_DOMAIN_OUTBOUND;
		 List<ElectricMailHeader> list= 
				 this.fp.getMailByHeaderSubstring(mailbox, OUTBOUND_HEADER_NAME, faxId, "0", "1");
		 
		 if(list!=null&&!list.isEmpty())
		 {
			 result = this.createResultMessageFromHeader(list.get(0));
		 }
		 else
		 {
			 result = "Unable to find Message in Fusemail.";
		 }
		 
		
		return result;
	}
	
	private String createResultMessageFromHeader(ElectricMailHeader header){
		String result = "";		
				
		result = gson.toJson(header);
		System.out.println(header);
		
		return result;
	}
	

}
