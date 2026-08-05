package com.truecaller.ads.request.v1;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public enum BidResponse$NoBidReason implements com.google.protobuf.Internal.EnumLite {
    UNKNOWN_ERROR(0),
    TECHNICAL_ERROR(1),
    INVALID_REQUEST(2),
    KNOWN_WEB_SPIDER(3),
    SUSPECTED_NONHUMAN_TRAFFIC(4),
    CLOUD_DATACENTER_PROXYIP(5),
    UNSUPPORTED_DEVICE(6),
    BLOCKED_PUBLISHER(7),
    UNMATCHED_USER(8),
    DAILY_READER_CAP(9),
    DAILY_DOMAIN_CAP(10),
    UNRECOGNIZED(-1);

    public static final int BLOCKED_PUBLISHER_VALUE = 7;
    public static final int CLOUD_DATACENTER_PROXYIP_VALUE = 5;
    public static final int DAILY_DOMAIN_CAP_VALUE = 10;
    public static final int DAILY_READER_CAP_VALUE = 9;
    public static final int INVALID_REQUEST_VALUE = 2;
    public static final int KNOWN_WEB_SPIDER_VALUE = 3;
    public static final int SUSPECTED_NONHUMAN_TRAFFIC_VALUE = 4;
    public static final int TECHNICAL_ERROR_VALUE = 1;
    public static final int UNKNOWN_ERROR_VALUE = 0;
    public static final int UNMATCHED_USER_VALUE = 8;
    public static final int UNSUPPORTED_DEVICE_VALUE = 6;
    private static final com.google.protobuf.Internal.EnumLiteMap<com.truecaller.ads.request.v1.BidResponse$NoBidReason> internalValueMap = new java.lang.Object();
    private final int value;

    BidResponse$NoBidReason(int i) {
        this.value = i;
    }

    public static com.truecaller.ads.request.v1.BidResponse$NoBidReason forNumber(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_ERROR;
            case 1:
                return TECHNICAL_ERROR;
            case 2:
                return INVALID_REQUEST;
            case 3:
                return KNOWN_WEB_SPIDER;
            case 4:
                return SUSPECTED_NONHUMAN_TRAFFIC;
            case 5:
                return CLOUD_DATACENTER_PROXYIP;
            case 6:
                return UNSUPPORTED_DEVICE;
            case 7:
                return BLOCKED_PUBLISHER;
            case 8:
                return UNMATCHED_USER;
            case 9:
                return DAILY_READER_CAP;
            case 10:
                return DAILY_DOMAIN_CAP;
            default:
                return null;
        }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<com.truecaller.ads.request.v1.BidResponse$NoBidReason> internalGetValueMap() {
        return internalValueMap;
    }

    public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
        return y90.z1.a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @java.lang.Deprecated
    public static com.truecaller.ads.request.v1.BidResponse$NoBidReason valueOf(int i) {
        return forNumber(i);
    }
}
