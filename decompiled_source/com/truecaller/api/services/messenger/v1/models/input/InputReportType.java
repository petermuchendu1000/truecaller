package com.truecaller.api.services.messenger.v1.models.input;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public enum InputReportType implements com.google.protobuf.Internal.EnumLite {
    UNKNOWN_REPORT_TYPE(0),
    READ(1),
    RECEIVED(2),
    MID_DISMISSED(3),
    READ_AFTER_MID_DISMISSED(4),
    UNRECOGNIZED(-1);

    public static final int MID_DISMISSED_VALUE = 3;
    public static final int READ_AFTER_MID_DISMISSED_VALUE = 4;
    public static final int READ_VALUE = 1;
    public static final int RECEIVED_VALUE = 2;
    public static final int UNKNOWN_REPORT_TYPE_VALUE = 0;
    private static final com.google.protobuf.Internal.EnumLiteMap<com.truecaller.api.services.messenger.v1.models.input.InputReportType> internalValueMap = new java.lang.Object();
    private final int value;

    InputReportType(int i) {
        this.value = i;
    }

    public static com.truecaller.api.services.messenger.v1.models.input.InputReportType forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return null;
                        }
                        return READ_AFTER_MID_DISMISSED;
                    }
                    return MID_DISMISSED;
                }
                return RECEIVED;
            }
            return READ;
        }
        return UNKNOWN_REPORT_TYPE;
    }

    public static com.google.protobuf.Internal.EnumLiteMap<com.truecaller.api.services.messenger.v1.models.input.InputReportType> internalGetValueMap() {
        return internalValueMap;
    }

    public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
        return te0.l2.a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @java.lang.Deprecated
    public static com.truecaller.api.services.messenger.v1.models.input.InputReportType valueOf(int i) {
        return forNumber(i);
    }
}
