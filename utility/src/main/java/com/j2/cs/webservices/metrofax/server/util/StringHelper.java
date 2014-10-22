/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j2.cs.webservices.metrofax.server.util;


import java.util.*;
/**
 *
 * @author andres.gama
 */
public class StringHelper {
    
    public static boolean isBlank(String input) {
        return (input == null || input.trim().isEmpty());
    }
    
    public static boolean isNotBlank(String input) {
        return (input != null && !input.trim().isEmpty());
    }
    
    public static int parseInt(String input) {
        int result = 0;
        try {
            result = Integer.parseInt(input);
        } catch (Exception e) {
            
        }
        
        return result;
    }
    
    public static long parseLong(String input) {
        long result = 0;
        try {
            result = Long.parseLong(input);
        } catch (NumberFormatException nfe) {
            
        }
        
        return result;
    }
    
    public static String convertCollectionToQuotedCsvString(Collection<String> collection) {
        if (collection == null) {
            return null;
        }
        if (collection.isEmpty()) {
            return "";
        }
        
        StringBuilder csvQuotedList = new StringBuilder();
        Iterator it = collection.iterator();
        if (it.hasNext()) {
            csvQuotedList.append("'").append(it.next()).append("'");
        }
        while (it.hasNext()) {
            csvQuotedList.append(",").append("'").append(it.next()).append("'");
        }
        
        return csvQuotedList.toString();
    }
    
    public static List<String> convertCsvStringToList(String csvList) {
        List<String> list = new ArrayList();
        
        if (csvList == null) {
            return null;
        }
        if (csvList.isEmpty()) {
            return list;
        }
        String arr[] = csvList.split(",");
        for (int i=0; i<arr.length; i++) {
           list.add(arr[i].trim());
        }
        return list;
    }
    
    public static Set<String> convertCsvStringToSet(String csvList) {
        Set<String> set = new HashSet();
        
        if (csvList == null) {
            return null;
        }
        if (csvList.isEmpty()) {
            return set;
        }
        
        String arr[] = csvList.split(",");
        for (int i=0; i<arr.length; i++) {
            set.add(arr[i].trim());
        }
        
        return set;
    }
    
    public static String convertCollectionToCsvString(Collection<String> collection) {
        if (collection == null) {
            return null;
        }
        if (collection.isEmpty()) {
            return "";
        }
        StringBuilder csvList = new StringBuilder();
        Iterator it = collection.iterator();
        if (it.hasNext()) {
            csvList.append(it.next());
        }
        while (it.hasNext()) {
            csvList.append(",").append(it.next());
        }
        
        return csvList.toString();
    }    
    
    
    public static String createGuidTag(String guid)
    {
    	StringBuilder sb = new StringBuilder();
    	sb.append("GUID='").append(guid).append("'");
    	
    	return sb.toString();
    }
    
    public static String createTransactionIdTag(String transactionId)
    {
    	StringBuilder sb = new StringBuilder();
    	sb.append("X-J2TransactionId='").append(transactionId).append("'");
    	
    	return sb.toString();
    }
    
    public static String createHeaderTag(String headerName, String headerValue)
    {
    	StringBuilder sb = new StringBuilder();
    	sb.append(headerName).append("='").append(headerValue).append("'");
    	
    	return sb.toString();
    }
    
    public static String createHeaderTag(String headerName, List<String> values)
    {
    	StringBuilder sb = new StringBuilder();
    	sb.append(headerName).append("=");
    	int numberOfMids = values.size();
    	
    	for(int i=0;i<numberOfMids;i++)
    	{
    		if(i>0)
    		{
    			sb.append(",");
    		}
    		
    		sb.append(values.get(i));
    	}
    	
    	
    	
    	return sb.toString();
    }
    
    
    public static String createSubstringHeaderTag(String headerName, String headerValue)
    {
    	StringBuilder sb = new StringBuilder();
    	sb.append(headerName).append("=like'").append(headerValue).append("'");
    	
    	return sb.toString();
    }
}
