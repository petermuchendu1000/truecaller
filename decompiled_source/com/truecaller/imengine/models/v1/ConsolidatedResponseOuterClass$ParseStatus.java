package com.truecaller.imengine.models.v1;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public enum ConsolidatedResponseOuterClass$ParseStatus implements com.google.protobuf.Internal.EnumLite {
    DEFAULT(0),
    SUCCESS(1),
    UNSUPPORTED(2),
    ERROR(3),
    UNRECOGNIZED(-1);

    public static final int DEFAULT_VALUE = 0;
    public static final int ERROR_VALUE = 3;
    public static final int SUCCESS_VALUE = 1;
    public static final int UNSUPPORTED_VALUE = 2;
    private static final com.google.protobuf.Internal.EnumLiteMap<com.truecaller.imengine.models.v1.ConsolidatedResponseOuterClass$ParseStatus> internalValueMap = new java.lang.Object();
    private final int value;

    ConsolidatedResponseOuterClass$ParseStatus(int i) {
        this.value = i;
    }

    public static com.truecaller.imengine.models.v1.ConsolidatedResponseOuterClass$ParseStatus forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return ERROR;
                }
                return UNSUPPORTED;
            }
            return SUCCESS;
        }
        return DEFAULT;
    }

    public static com.google.protobuf.Internal.EnumLiteMap<com.truecaller.imengine.models.v1.ConsolidatedResponseOuterClass$ParseStatus> internalGetValueMap() {
        return internalValueMap;
    }

    public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
        return fr1.b.a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @java.lang.Deprecated
    public static com.truecaller.imengine.models.v1.ConsolidatedResponseOuterClass$ParseStatus valueOf(int i) {
        return forNumber(i);
    }
}
