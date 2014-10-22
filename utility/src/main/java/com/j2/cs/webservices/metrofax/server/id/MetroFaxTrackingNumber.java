package com.j2.cs.webservices.metrofax.server.id;

import com.google.common.primitives.Ints;




/**
 * Created by andres.gama on 6/23/2014.
 */
public class MetroFaxTrackingNumber {

    

    private long serviceKey;
    private long transactionId;
    private int serviceKeyHash;
    private int transactionIdHash;
    private long trackingNumber;


    public MetroFaxTrackingNumber(long serviceKey, long transactionId) {
        this.serviceKey = serviceKey;
        this.transactionId = transactionId;
        this.serviceKeyHash = createServiceKeyHash(serviceKey);
        this.transactionIdHash = createTransactionIdHash(transactionId);
        this.trackingNumber = createTrackingNumber(serviceKeyHash, transactionIdHash);
    }

    public MetroFaxTrackingNumber(long trackingNumber) {
        this.trackingNumber = trackingNumber;
        this.serviceKeyHash = getServiceKeyHashFromTrackingNumber(trackingNumber);
        this.serviceKey = serviceKeyHash;
        this.transactionIdHash = getTransactionIdHashFromTrackingNumber(trackingNumber);
        this.transactionId = transactionIdHash;
    }

    public long getTrackingNumber() {
        return trackingNumber;
    }

    public long getServiceKey() {
        return serviceKey;
    }

    public long getServiceKeyWithOverflow() {
        return (long)(serviceKeyHash + Integer.MAX_VALUE);
    }

    public long getTransactionIdWithOverflow() {
        return (long)(transactionIdHash + Integer.MAX_VALUE);
    }

    public long getTransactionId() {
        return transactionId;
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

    protected int createTransactionIdHash(long transactionIdValue) {
        int value = 0;
        try {
            value = Ints.checkedCast(transactionIdValue);
        } catch (IllegalArgumentException iae) {
            value = Ints.saturatedCast(transactionIdValue - Integer.MAX_VALUE);
        }
        return value;
    }

    protected long createTrackingNumber(int serviceKeyHashValue, int transactionIdHashValue) {
        return (((long)serviceKeyHashValue) << 32) | (transactionIdHashValue & 0xffffffffL);
    }

    protected int getServiceKeyHashFromTrackingNumber(long trackingNumberValue) {
        return (int)(trackingNumberValue >> 32);
    }

    protected int getTransactionIdHashFromTrackingNumber(long trackingNumber) {
        return (int)trackingNumber;
    }
}
