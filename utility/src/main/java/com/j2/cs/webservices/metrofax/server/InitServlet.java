package com.j2.cs.webservices.metrofax.server;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

import com.j2.cs.webservices.metrofax.server.fusemail.FusemailProxy;

public class InitServlet extends HttpServlet {
	private static final String propertiesFileName = "Initialization.properties";

	public void init() throws ServletException
	{
		System.out.println("Init servlet loaded");
		try {
			Properties prop = new Properties();
			prop.load(this.getClass().getResourceAsStream(propertiesFileName));
			
			this.initializeFuseMailAccessModule(prop);
			this.initializeFuseMailProxy(prop);
			
		} catch (IOException e) {
			throw new ServletException("Initialization.properties file nto found in classpath!");
		}
	}
	
	private void initializeFuseMailAccessModule(Properties prop)
	{
		String inboundDomain = prop.getProperty("FUSEMAIL_MAILBOX_DOMAIN_INBOUND");
		String outboundDomain = prop.getProperty("FUSEMAIL_MAILBOX_DOMAIN_OUTBOUND");
		String inboundHeader = prop.getProperty("INBOUND_HEADER_NAME");
		String outboundHeader = prop.getProperty("OUTBOUND_HEADER_NAME");
		
		FuseMailAccessModule.init(inboundDomain, outboundDomain, inboundHeader, outboundHeader);
	}
	
	private void initializeFuseMailProxy(Properties prop)
	{
		String url = prop.getProperty("API_URL");
		
		FusemailProxy.init(url);
	}

}
