package com.truecaller.api.services.messenger.v1.models;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public enum ReportType implements com.google.protobuf.Internal.EnumLite {
    UNKNOWN_REPORT_TYPE(0),
    READ(1),
    RECEIVED(2),
    UNRECOGNIZED(-1);

    public static final int READ_VALUE = 1;
    public static final int RECEIVED_VALUE = 2;
    public static final int UNKNOWN_REPORT_TYPE_VALUE = 0;
    private static final com.google.protobuf.Internal.EnumLiteMap<com.truecaller.api.services.messenger.v1.models.ReportType> internalValueMap = new java.lang.Object();
    private final int value;

    ReportType(int i) {
        this.value = i;
    }

    public static com.truecaller.api.services.messenger.v1.models.ReportType forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return RECEIVED;
            }
            return READ;
        }
        return UNKNOWN_REPORT_TYPE;
    }

    public static com.google.protobuf.Internal.EnumLiteMap<com.truecaller.api.services.messenger.v1.models.ReportType> internalGetValueMap() {
        return internalValueMap;
    }

    public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
        return se0.u3.a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @java.lang.Deprecated
    public static com.truecaller.api.services.messenger.v1.models.ReportType valueOf(int i) {
        return forNumber(i);
    }
}
