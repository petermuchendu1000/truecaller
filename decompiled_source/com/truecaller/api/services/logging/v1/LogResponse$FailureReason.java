package com.truecaller.api.services.logging.v1;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public enum LogResponse$FailureReason implements com.google.protobuf.Internal.EnumLite {
    UNKNOWN(0),
    INTERNAL(1),
    EVENT_NOT_FOUND(2),
    EVENT_DECODE_ERROR(3),
    SCHEMA_ID_TOO_OLD(4),
    NO_COMMON_HEADER(5),
    NO_CLIENT_HEADER(6),
    UNRECOGNIZED(-1);

    public static final int EVENT_DECODE_ERROR_VALUE = 3;
    public static final int EVENT_NOT_FOUND_VALUE = 2;
    public static final int INTERNAL_VALUE = 1;
    public static final int NO_CLIENT_HEADER_VALUE = 6;
    public static final int NO_COMMON_HEADER_VALUE = 5;
    public static final int SCHEMA_ID_TOO_OLD_VALUE = 4;
    public static final int UNKNOWN_VALUE = 0;
    private static final com.google.protobuf.Internal.EnumLiteMap<com.truecaller.api.services.logging.v1.LogResponse$FailureReason> internalValueMap = new java.lang.Object();
    private final int value;

    LogResponse$FailureReason(int i) {
        this.value = i;
    }

    public static com.truecaller.api.services.logging.v1.LogResponse$FailureReason forNumber(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return INTERNAL;
            case 2:
                return EVENT_NOT_FOUND;
            case 3:
                return EVENT_DECODE_ERROR;
            case 4:
                return SCHEMA_ID_TOO_OLD;
            case 5:
                return NO_COMMON_HEADER;
            case 6:
                return NO_CLIENT_HEADER;
            default:
                return null;
        }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<com.truecaller.api.services.logging.v1.LogResponse$FailureReason> internalGetValueMap() {
        return internalValueMap;
    }

    public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
        return pe0.g.a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @java.lang.Deprecated
    public static com.truecaller.api.services.logging.v1.LogResponse$FailureReason valueOf(int i) {
        return forNumber(i);
    }
}
