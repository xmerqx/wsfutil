/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j2.cs.webservices.metrofax.server.fusemail;

/**
 *
 * @author andres.gama
 */
public class ElectricMailApiKeys {
    
    public static final String GET_ADS = "getAds";
    public static final String GET_ACCOUNT_INFO_SCRIPT = "getAccountInfoScript";
    public static final String GET_SEARCH_ACCT_INFO_SCRIPT = "getSearchAcctInfoScript";
    public static final String DOWNLOAD_FAXES = "downloadFaxes";
    public static final String DELETE_FOLDER = "deleteFolder";
    public static final String FORWARD_MESSAGES = "forwardMessages";
    public static final String SAVE_TAG = "saveTag";
    public static final String SEARCH_MAIL = "searchMail";
    public static final String CREATE_FOLDER = "createFolder";
    public static final String RENAME_FOLDER = "renameFolder";
    public static final String GET_FOLDERS = "getFolders";
    public static final String GET_FOLDER_MSG_COUNT = "getFolderMessageCount";
    public static final String GET_MAIL = "getMail";
    public static final String GET_MAIL_JUST_ARRIVED = "getMailJustArrived";
    public static final String GET_FOLDER_COUNT = "getFolderCount";
    public static final String DELETE_MSG = "deleteMessage";
    public static final String DELETE_TAG = "deleteTag";
    public static final String GET_MESSAGE_BODY = "getMessageBody";
    public static final String GET_MESSAGE_TAGS = "getMessageTags";
    public static final String MOVE_MESSAGE = "moveMessage";
    public static final String GET_OCR_OUTPUT_FOR_MESSAGE = "getOCROutputForMessage";
    public static final String DOWNLOAD_FAX = "download";
    public static final String DOWNLOAD_ZIP = "download_zipped";
    public static final String CREATE_SESSION = "createSession";
    public static final String SID_PARAM = "sid";
    public static final String MID_PARAM = "mid";
    public static final String UPLOAD_BASE_64 = "storeFileBase64";
    public static final String GET_MAIL_X_HEADER = "getMailXHeader";
    public static final String GET_MAIL_X_HEADER_COUNT = "getMailXHeaderCount";
    public static final String SET_MESSAGE_SEEN_FLAG = "setMessageSeenFlag";
    public static final String GET_FILE_DATA_BY_MID = "getFaxByMessageId";
    public static final String GET_MAILS = "getMails";
    public static final String GET_MAIL_LIFETIME = "getMailLifetime";
    

    public static final String[] ACTIONS_WITH_PARAM_CHECK = new String[]{DELETE_FOLDER, FORWARD_MESSAGES,
            SAVE_TAG, SEARCH_MAIL, CREATE_FOLDER, RENAME_FOLDER};

    public static final String[] FORBIDDEN_FOLDER_NAMES = new String[]{"inbox", "trash"};
    
}
