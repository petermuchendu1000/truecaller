package com.truecaller.api.services.callerid.v1.model;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public enum Badge implements com.google.protobuf.Internal.EnumLite {
    UNKNOWN(0),
    AMBASSADOR(1),
    VERIFIED(2),
    PREMIUM(3),
    GOLD(4),
    USER(5),
    PRIORITY(6),
    VERIFIED_BUSINESS(7),
    CRED(8),
    UNRECOGNIZED(-1);

    public static final int AMBASSADOR_VALUE = 1;
    public static final int CRED_VALUE = 8;
    public static final int GOLD_VALUE = 4;
    public static final int PREMIUM_VALUE = 3;
    public static final int PRIORITY_VALUE = 6;
    public static final int UNKNOWN_VALUE = 0;
    public static final int USER_VALUE = 5;
    public static final int VERIFIED_BUSINESS_VALUE = 7;
    public static final int VERIFIED_VALUE = 2;
    private static final com.google.protobuf.Internal.EnumLiteMap<com.truecaller.api.services.callerid.v1.model.Badge> internalValueMap = new java.lang.Object();
    private final int value;

    Badge(int i) {
        this.value = i;
    }

    public static com.truecaller.api.services.callerid.v1.model.Badge forNumber(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return AMBASSADOR;
            case 2:
                return VERIFIED;
            case 3:
                return PREMIUM;
            case 4:
                return GOLD;
            case 5:
                return USER;
            case 6:
                return PRIORITY;
            case 7:
                return VERIFIED_BUSINESS;
            case 8:
                return CRED;
            default:
                return null;
        }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<com.truecaller.api.services.callerid.v1.model.Badge> internalGetValueMap() {
        return internalValueMap;
    }

    public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
        return ke0.baz.a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @java.lang.Deprecated
    public static com.truecaller.api.services.callerid.v1.model.Badge valueOf(int i) {
        return forNumber(i);
    }
}
