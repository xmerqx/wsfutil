package com.j2.cs.webservices.metrofax.server.id;

import com.google.common.primitives.Ints;





/**
 * Created by andres.gama on 6/24/2014.
 */
public class MetroFaxFaxId {


    private long serviceKey;
    private long messageId;
    private int serviceKeyHash;
    private int messageIdHash;
    private long faxId;

    public MetroFaxFaxId(long serviceKey, long messageId) {
        this.serviceKey = serviceKey;
        this.messageId = messageId;
        this.serviceKeyHash = createServiceKeyHash(serviceKey);
        this.messageIdHash = createMessageIdHash(messageId);
        this.faxId = createFaxId(serviceKeyHash, messageIdHash);
    }

    public MetroFaxFaxId(long faxId) {
        this.faxId = faxId;
        this.serviceKeyHash = getServiceKeyHashFromfaxId(faxId);
        this.serviceKey = serviceKeyHash;
        this.messageIdHash = getMessageIdHashFromfaxId(faxId);
        this.messageId = messageIdHash;
    }

    public long getFaxId() {
        return faxId;
    }

    public long getServiceKey() {
        return serviceKey;
    }

    public long getServiceKeyWithOverflow() {
        return (long)(serviceKeyHash + Integer.MAX_VALUE);
    }

    public long getMessageIdWithOverflow() {
        return (long)(messageIdHash + Integer.MAX_VALUE);
    }

    public long getMessageId() {
        return messageId;
    }

    public boolean isOverflowValue(long value) {
        return (value > Integer.MAX_VALUE);
    }

    protected int createServiceKeyHash(long serviceKeyValue) {
        int value = 0;
        try {
            value = Ints.checkedCast(serviceKeyValue);
        } catch (IllegalArgumentException iae) {
            value = Ints.saturatedCast(serviceKeyValue - Integer.MAX_VALUE);
        }
        return value;
    }

    protected int createMessageIdHash(long messageIdValue) {
        int value = 0;
        try {
            value = Ints.checkedCast(messageIdValue);
        } catch (IllegalArgumentException iae) {
            value = Ints.saturatedCast(messageIdValue - Integer.MAX_VALUE);
        }
        return value;
    }

    protected long createFaxId(int serviceKeyHashValue, int messageIdHashValue) {
        return (((long)serviceKeyHashValue) << 32) | (messageIdHashValue & 0xffffffffL);
    }

    protected int getServiceKeyHashFromfaxId(long faxIdValue) {
        return (int)(faxIdValue >> 32);
    }

    protected int getMessageIdHashFromfaxId(long faxId) {
        return (int)faxId;
    }
}
