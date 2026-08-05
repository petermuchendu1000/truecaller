package com.truecaller.search.v1.models;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public enum BusinessMessageType implements com.google.protobuf.Internal.EnumLite {
    BUSINESS_MESSAGE_TYPE_UNSPECIFIED(0),
    BUSINESS_MESSAGE_TYPE_CALL_REASON(1),
    UNRECOGNIZED(-1);

    public static final int BUSINESS_MESSAGE_TYPE_CALL_REASON_VALUE = 1;
    public static final int BUSINESS_MESSAGE_TYPE_UNSPECIFIED_VALUE = 0;
    private static final com.google.protobuf.Internal.EnumLiteMap<com.truecaller.search.v1.models.BusinessMessageType> internalValueMap = new java.lang.Object();
    private final int value;

    BusinessMessageType(int i) {
        this.value = i;
    }

    public static com.truecaller.search.v1.models.BusinessMessageType forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                return null;
            }
            return BUSINESS_MESSAGE_TYPE_CALL_REASON;
        }
        return BUSINESS_MESSAGE_TYPE_UNSPECIFIED;
    }

    public static com.google.protobuf.Internal.EnumLiteMap<com.truecaller.search.v1.models.BusinessMessageType> internalGetValueMap() {
        return internalValueMap;
    }

    public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
        return sp2.b0.a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @java.lang.Deprecated
    public static com.truecaller.search.v1.models.BusinessMessageType valueOf(int i) {
        return forNumber(i);
    }
}
