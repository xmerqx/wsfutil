/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j2.cs.webservices.metrofax.server.fusemail;

import java.io.Serializable;
import com.google.gson.annotations.SerializedName;

/**
 *
 * @author andres.gama
 */
public class ElectricMailHeader implements Serializable {
    
    
@SerializedName("X-J2BillingCode") private String j2BillingCode;
@SerializedName("FILE") private String file;
@SerializedName("X-J2-Message-Date") private String j2MessageDate;
@SerializedName("X-J2RecipientFaxNumber") private String j2RecipientFaxNumber;
@SerializedName("X-J2-Message-Format") private String j2MessageFormat;
@SerializedName("flag_read") private Integer flagRead;
@SerializedName("tag") private String tag;
@SerializedName("X-J2BId") private String j2BId;
@SerializedName("Subject") private String subject;
@SerializedName("X-J2-Servicekey") private long j2Servicekey;
@SerializedName("X-J2-Fax-Csid-Remote") private String j2FaxCsidRemote;
@SerializedName("X-Env-From") private String envFrom;
@SerializedName("X-J2-Fax-Mode") private String j2FaxMode;
@SerializedName("Date") private String date;
@SerializedName("date_received") private Long dateReceived;
@SerializedName("CustomerID") private Long customerId;
@SerializedName("To") private String to;
@SerializedName("X-Origin-IP") private String originIp;
@SerializedName("X-J2-Customerkey") private Long j2Customerkey;
@SerializedName("X-J2-Fax-Pages") private Integer j2FaxPages;
@SerializedName("Message_Id") private String messageId;
@SerializedName("X-J2TransactionId") private String j2TransactionId;
@SerializedName("X-J2Id") private String j2Id;
@SerializedName("folder") private String folder;
@SerializedName("size") private Integer size;
@SerializedName("mid") private Integer mid;
@SerializedName("X-J2FaxResultCode") private String j2FaxResultCode;
@SerializedName("X-J2SDate") private String j2SendDate;
@SerializedName("filename") private String filename;
@SerializedName("Message-Id") private String inboundMessageId;
@SerializedName("From") private String from;
@SerializedName("X-J2-Caller-Id") private String j2CallerId;
@SerializedName("GUID") private String guid;
@SerializedName("ORIGINALFILENAME") private String originalFileName;
@SerializedName("MD5SUM") private String md5Sum;
@SerializedName("IMGBASE64DATA") private String fileData;
@SerializedName("X-J2FaxSubject") private String j2FaxSubject;
@SerializedName("Message-ID") private String prodInboundMessageId;

    public String getProdInboundMessageId() {
	return prodInboundMessageId;
}

public void setProdInboundMessageId(String prodInboundMessageId) {
	this.prodInboundMessageId = prodInboundMessageId;
}

	public String getGuid() {
	return guid;
	}
	
	public void setGuid(String guid) {
		this.guid = guid;
	}
	
	public String getOriginalFileName() {
		return originalFileName;
	}
	
	public void setOriginalFileName(String originalFileName) {
		this.originalFileName = originalFileName;
	}
	
	public String getMd5Sum() {
		return md5Sum;
	}
	
	public void setMd5Sum(String md5Sum) {
		this.md5Sum = md5Sum;
	}

	public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Long getDateReceived() {
        return dateReceived;
    }

    public void setDateReceived(Long dateReceived) {
        this.dateReceived = dateReceived;
    }

    public String getEnvFrom() {
        return envFrom;
    }

    public void setEnvFrom(String envFrom) {
        this.envFrom = envFrom;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public Integer getFlagRead() {
        return flagRead;
    }

    public void setFlagRead(Integer flagRead) {
        this.flagRead = flagRead;
    }

    public String getFolder() {
        return folder;
    }

    public void setFolder(String folder) {
        this.folder = folder;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getInboundMessageId() {
        return inboundMessageId;
    }

    public void setInboundMessageId(String inboundMessageId) {
        this.inboundMessageId = inboundMessageId;
    }

    public String getJ2BId() {
        return j2BId;
    }

    public void setJ2BId(String j2BId) {
        this.j2BId = j2BId;
    }

    public String getJ2BillingCode() {
        return j2BillingCode;
    }

    public void setJ2BillingCode(String j2BillingCode) {
        this.j2BillingCode = j2BillingCode;
    }

    public String getJ2CallerId() {
        return j2CallerId;
    }

    public void setJ2CallerId(String j2CallerId) {
        this.j2CallerId = j2CallerId;
    }

    public Long getJ2Customerkey() {
    	return this.j2Customerkey;
    }

    public void setJ2Customerkey(Long j2Customerkey) {
        this.j2Customerkey = j2Customerkey;
    }

    public String getJ2FaxCsidRemote() {
        return j2FaxCsidRemote;
    }

    public void setJ2FaxCsidRemote(String j2FaxCsidRemote) {
        this.j2FaxCsidRemote = j2FaxCsidRemote;
    }

    public String getJ2FaxMode() {
        return j2FaxMode;
    }

    public void setJ2FaxMode(String j2FaxMode) {
        this.j2FaxMode = j2FaxMode;
    }

    public Integer getJ2FaxPages() {
    	int result = 0;
    	if(this.j2FaxPages!=null)
    	{
    		result = Integer.valueOf(j2FaxPages);
    	}
    	 		
    	
        return result;
    }

    public void setJ2FaxPages(Integer j2FaxPages) {
        this.j2FaxPages = j2FaxPages;
    }

    public String getJ2FaxResultCode() {
        return j2FaxResultCode;
    }

    public void setJ2FaxResultCode(String j2FaxResultCode) {
        this.j2FaxResultCode = j2FaxResultCode;
    }

    public String getJ2Id() {
        return j2Id;
    }

    public void setJ2Id(String j2Id) {
        this.j2Id = j2Id;
    }

    public String getJ2MessageDate() {
        return j2MessageDate;
    }

    public void setJ2MessageDate(String j2MessageDate) {
        this.j2MessageDate = j2MessageDate;
    }

    public String getJ2MessageFormat() {
        return j2MessageFormat;
    }

    public void setJ2MessageFormat(String j2MessageFormat) {
        this.j2MessageFormat = j2MessageFormat;
    }

    public String getJ2RecipientFaxNumber() {
        return j2RecipientFaxNumber;
    }

    public void setJ2RecipientFaxNumber(String j2RecipientFaxNumber) {
        this.j2RecipientFaxNumber = j2RecipientFaxNumber;
    }

    public String getJ2SendDate() {
        return j2SendDate;
    }

    public void setJ2SendDate(String j2SendDate) {
        this.j2SendDate = j2SendDate;
    }

    public long getJ2Servicekey() {
        return j2Servicekey;
    }

    public void setJ2Servicekey(long j2Servicekey) {
        this.j2Servicekey = j2Servicekey;
    }

    public String getJ2TransactionId() {
        return j2TransactionId;
    }

    public void setJ2TransactionId(String j2TransactionId) {
        this.j2TransactionId = j2TransactionId;
    }

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public String getOriginIp() {
        return originIp;
    }

    public void setOriginIp(String originIp) {
        this.originIp = originIp;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

	public String getFileData() {
		return fileData;
	}

	public void setFileData(String fileData) {
		this.fileData = fileData;
	}

	public String getJ2FaxSubject() {
		return j2FaxSubject;
	}

	public void setJ2FaxSubject(String j2FaxSubject) {
		this.j2FaxSubject = j2FaxSubject;
	}
}
