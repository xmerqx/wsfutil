package com.j2.cs.webservices.metrofax.server.fusemail;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.io.IOUtils;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DecompressingHttpClient;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.conn.PoolingClientConnectionManager;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.j2.cs.webservices.metrofax.server.conn.WebServiceSocketFactory;
import com.j2.cs.webservices.metrofax.server.json.JsonIntegerTypeAdapter;
import com.j2.cs.webservices.metrofax.server.json.JsonLongTypeAdapter;
import com.j2.cs.webservices.metrofax.server.util.StringHelper;
import com.j2.cs.webservices.metrofax.shared.exception.ElectricMailException;


public class FusemailProxy {
	
	private HttpPost httpPost, httpPostCompressed;
    private HttpClient httpClient;
    private Gson gson;
    

    private String apiUrl = "https://imap4.electric.net/mailapi/getMailJSON";
    private String apiVersion = "1.1";
    private String apiDownloadUrl;

    private String apiLogin;
    private String apiPassword; 
    private String apiDefaultFolder = "INBOX";
    private String apiUploadFolder = "FILEUPLOADS";
    private int connectTimeout = 60000;
    private int socketTimeout = 60000;
    private int logLimit = 512;
    private int maxConnectionsTotal=10;
    private int maxConnectionsPerRoute=10;
    private boolean useWorkaround=false;
    private boolean useAttachmentExpiration=false;
    
public FusemailProxy(){
	initializeInstance();
}
    
public void initializeInstance() {
    	
        PlainSocketFactory plainSocketFactory = PlainSocketFactory.getSocketFactory();
        SSLSocketFactory sslSocketFactory = WebServiceSocketFactory.getSocketFactory();
        
        SchemeRegistry schemeReg = new SchemeRegistry();
        schemeReg.register(new Scheme("http", 80, plainSocketFactory));
        schemeReg.register(new Scheme("https", 443, sslSocketFactory));
        PoolingClientConnectionManager  conMgr = new PoolingClientConnectionManager(schemeReg);
        conMgr.setMaxTotal(maxConnectionsTotal);
        conMgr.setDefaultMaxPerRoute(maxConnectionsPerRoute);
        
        HttpParams httpParams = new BasicHttpParams();
        HttpConnectionParams.setConnectionTimeout(httpParams, connectTimeout);
        HttpConnectionParams.setSoTimeout(httpParams, socketTimeout);
        

        httpClient = new DecompressingHttpClient(new DefaultHttpClient(conMgr, httpParams));

        httpPost = new HttpPost(apiUrl);
        httpPost.setHeader("Connection", "TE,close");
        httpPost.setHeader("Accept","application/json");
        httpPost.setHeader("Content-Type","application/json");
        
        httpPostCompressed = new HttpPost(apiUrl);
        httpPostCompressed.setHeader("Connection", "TE,close");
        httpPostCompressed.setHeader("Accept","application/json");
        httpPostCompressed.setHeader("Content-Type","application/json");
        httpPostCompressed.setHeader("Accept-Encoding","gzip");
        
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapter(Long.class, new JsonLongTypeAdapter()).
                registerTypeAdapter(long.class, new JsonLongTypeAdapter()).
                registerTypeAdapter(Integer.class, new JsonIntegerTypeAdapter()).
                disableHtmlEscaping();
        gson = gsonBuilder.create();
    }


public List<ElectricMailHeader> getMailByHeaderSubstring(String mailbox, String headerName, String headerValue,
		String offset, String limit) throws ElectricMailException {
	getMailResponse emResult = null;
	
	ElectricMailRequest request = new ElectricMailRequest(
            ElectricMailApiKeys.GET_MAIL_X_HEADER, 
            apiVersion,
            apiLogin,
            apiPassword,
            mailbox,
            StringHelper.createSubstringHeaderTag(headerName, headerValue),
            offset,
            limit);

    InputStream response = postElectricMailRequest(request);
    if (response != null) {
        try {
            emResult = gson.fromJson(new BufferedReader(new InputStreamReader(response)), getMailResponse.class);
        } catch (JsonParseException jpe) {
            throw new ElectricMailException(jpe);
        } finally {
            IOUtils.closeQuietly(response);
        }
    }
    
    if (emResult == null) {
        throw new ElectricMailException("Unable to retreive JSON object.");
    } else if (emResult.getError() != null) {
        throw new ElectricMailException(emResult.getError().getMessage());
    }
	
    return new ArrayList<ElectricMailHeader>(Arrays.asList(emResult.getResult()));
}

private InputStream postElectricMailRequest(ElectricMailRequest request)  {
    String json = gson.toJson(request, ElectricMailRequest.class);
    return postElectricMailJsonString(json);
}

private InputStream postElectricMailJsonString(String json) {
    InputStream responseStream = null;
    StringBuilder responseLog = new StringBuilder();
    int responseStatus = 0;
    try {
    	httpPost.setEntity(new StringEntity(json));
        HttpResponse response = httpClient.execute(httpPost);
        responseStatus = response.getStatusLine().getStatusCode();
        if (HttpStatus.SC_OK == responseStatus) {
            responseStream = response.getEntity().getContent();
            
        } else {
            
            String exceptionMessage = String.format("HTTP Exception: %d %s", responseStatus, responseLog);
            IOUtils.closeQuietly(responseStream);
            throw new ElectricMailException(exceptionMessage);
            
        }            
    } catch (UnsupportedEncodingException uee) {
        // TODO this needs to be fixed....
        
    } catch (IOException ioe) {
        // TODO this needs to be fixed....
    	ioe.printStackTrace();
        
    } catch (NullPointerException npe) {
        // TODO this needs to be fixed....
        
    } 
    
    return responseStream;
}

class getMailResponse {
    private String version;
    private ElectricMailHeader[] result;
    private ElectricMailError error;
    
    public ElectricMailError getError() {
        return error;
    }

    public ElectricMailHeader[] getResult() {
        return result;
    }

    public String getVersion() {
        return version;
    }
}

class ElectricMailError {
    private String name;
    private String message;
    private String code;

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public String getName() {
        return name;
    }
}

class ElectricMailRequest {
    String method;
    String version;
    String[] params;
    String caller = "WebServices";
    
    ElectricMailRequest(String method, String version, String ... params) {
        this.method = method;
        this.version = version;
        this.params = params;
    }
}

}
