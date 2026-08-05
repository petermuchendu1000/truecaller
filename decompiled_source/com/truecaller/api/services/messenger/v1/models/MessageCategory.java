package com.truecaller.api.services.messenger.v1.models;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public enum MessageCategory implements com.google.protobuf.Internal.EnumLite {
    PRIVATE(0),
    SERVICE(1),
    TRANSACTIONAL(2),
    PROMO(3),
    OTHER_BUSINESS(4),
    OTP(5),
    INBOX(6),
    UNRECOGNIZED(-1);

    public static final int INBOX_VALUE = 6;
    public static final int OTHER_BUSINESS_VALUE = 4;
    public static final int OTP_VALUE = 5;
    public static final int PRIVATE_VALUE = 0;
    public static final int PROMO_VALUE = 3;
    public static final int SERVICE_VALUE = 1;
    public static final int TRANSACTIONAL_VALUE = 2;
    private static final com.google.protobuf.Internal.EnumLiteMap<com.truecaller.api.services.messenger.v1.models.MessageCategory> internalValueMap = new java.lang.Object();
    private final int value;

    MessageCategory(int i) {
        this.value = i;
    }

    public static com.truecaller.api.services.messenger.v1.models.MessageCategory forNumber(int i) {
        switch (i) {
            case 0:
                return PRIVATE;
            case 1:
                return SERVICE;
            case 2:
                return TRANSACTIONAL;
            case 3:
                return PROMO;
            case 4:
                return OTHER_BUSINESS;
            case 5:
                return OTP;
            case 6:
                return INBOX;
            default:
                return null;
        }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<com.truecaller.api.services.messenger.v1.models.MessageCategory> internalGetValueMap() {
        return internalValueMap;
    }

    public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
        return se0.l0.a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @java.lang.Deprecated
    public static com.truecaller.api.services.messenger.v1.models.MessageCategory valueOf(int i) {
        return forNumber(i);
    }
}
