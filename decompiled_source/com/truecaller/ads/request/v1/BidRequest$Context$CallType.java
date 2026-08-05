package com.truecaller.ads.request.v1;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public enum BidRequest$Context$CallType implements com.google.protobuf.Internal.EnumLite {
    BLOCKED(0),
    SPAM(1),
    REPORTED(2),
    GOVERNMENT_SERVICES(3),
    SMALL_BUSINESS(4),
    PHONEBOOK_CONTACT(5),
    IDENTIFIED_CONTACT(6),
    UNKNOWN_CONTACT(7),
    VERIFIED_BUSINESS(8),
    PRIORITY_CALL(9),
    GOLD(10),
    PREMIUM(11),
    VERIFIED_BUSINESS_WITH_SPAM(12),
    SMALL_BUSINESS_WITH_SPAM(13),
    VERIFIED_BUSINESS_BLOCKED_CONTACT(14),
    SMALL_BUSINESS_BLOCKED_CONTACT(15),
    PRIORITY_CALL_BLOCKED_CONTACT(16),
    UNRECOGNIZED(-1);

    public static final int BLOCKED_VALUE = 0;
    public static final int GOLD_VALUE = 10;
    public static final int GOVERNMENT_SERVICES_VALUE = 3;
    public static final int IDENTIFIED_CONTACT_VALUE = 6;
    public static final int PHONEBOOK_CONTACT_VALUE = 5;
    public static final int PREMIUM_VALUE = 11;
    public static final int PRIORITY_CALL_BLOCKED_CONTACT_VALUE = 16;
    public static final int PRIORITY_CALL_VALUE = 9;
    public static final int REPORTED_VALUE = 2;
    public static final int SMALL_BUSINESS_BLOCKED_CONTACT_VALUE = 15;
    public static final int SMALL_BUSINESS_VALUE = 4;
    public static final int SMALL_BUSINESS_WITH_SPAM_VALUE = 13;
    public static final int SPAM_VALUE = 1;
    public static final int UNKNOWN_CONTACT_VALUE = 7;
    public static final int VERIFIED_BUSINESS_BLOCKED_CONTACT_VALUE = 14;
    public static final int VERIFIED_BUSINESS_VALUE = 8;
    public static final int VERIFIED_BUSINESS_WITH_SPAM_VALUE = 12;
    private static final com.google.protobuf.Internal.EnumLiteMap<com.truecaller.ads.request.v1.BidRequest$Context$CallType> internalValueMap = new java.lang.Object();
    private final int value;

    BidRequest$Context$CallType(int i) {
        this.value = i;
    }

    public static com.truecaller.ads.request.v1.BidRequest$Context$CallType forNumber(int i) {
        switch (i) {
            case 0:
                return BLOCKED;
            case 1:
                return SPAM;
            case 2:
                return REPORTED;
            case 3:
                return GOVERNMENT_SERVICES;
            case 4:
                return SMALL_BUSINESS;
            case 5:
                return PHONEBOOK_CONTACT;
            case 6:
                return IDENTIFIED_CONTACT;
            case 7:
                return UNKNOWN_CONTACT;
            case 8:
                return VERIFIED_BUSINESS;
            case 9:
                return PRIORITY_CALL;
            case 10:
                return GOLD;
            case 11:
                return PREMIUM;
            case 12:
                return VERIFIED_BUSINESS_WITH_SPAM;
            case 13:
                return SMALL_BUSINESS_WITH_SPAM;
            case 14:
                return VERIFIED_BUSINESS_BLOCKED_CONTACT;
            case 15:
                return SMALL_BUSINESS_BLOCKED_CONTACT;
            case 16:
                return PRIORITY_CALL_BLOCKED_CONTACT;
            default:
                return null;
        }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<com.truecaller.ads.request.v1.BidRequest$Context$CallType> internalGetValueMap() {
        return internalValueMap;
    }

    public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
        return y90.f.a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @java.lang.Deprecated
    public static com.truecaller.ads.request.v1.BidRequest$Context$CallType valueOf(int i) {
        return forNumber(i);
    }
}
