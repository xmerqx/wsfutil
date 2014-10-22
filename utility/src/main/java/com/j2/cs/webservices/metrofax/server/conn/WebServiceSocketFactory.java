/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j2.cs.webservices.metrofax.server.conn;

import java.io.IOException;
import java.net.Socket;
 
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
 
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.params.HttpParams;


/**
 *
 * @author andres.gama
 */
public class WebServiceSocketFactory extends SSLSocketFactory {

    
    private String sslEnabledProtocols = "SSLv3,TLSv1";

    private static final WebServiceSocketFactory DEFAULT_FACTORY = getDefaultSocketFactory();
    
    private static WebServiceSocketFactory getDefaultSocketFactory() {
        SSLContext sslContext = null;
        try {
            sslContext = SSLContext.getDefault();
        } catch (Exception e) {
           
        } 
        return new WebServiceSocketFactory(sslContext);
    }
    
    public static WebServiceSocketFactory getSocketFactory() {
        return DEFAULT_FACTORY;
    }
    
    public WebServiceSocketFactory(SSLContext sslContext) {
        super(sslContext);
    }
    
    public void setSslEnabledProtocols(String sslEnabledProtocols) {
        this.sslEnabledProtocols = sslEnabledProtocols;
    }
    
    @Override
    public Socket createSocket(HttpParams params) throws IOException {
        SSLSocket socket = (SSLSocket) super.createSocket(params);
        String[]  enabledProtocols = sslEnabledProtocols.split(",");
        socket.setEnabledProtocols(enabledProtocols);
        return socket;
    }
    
}