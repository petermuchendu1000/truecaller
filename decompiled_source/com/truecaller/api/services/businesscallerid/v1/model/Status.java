package com.truecaller.api.services.businesscallerid.v1.model;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public enum Status implements com.google.protobuf.Internal.EnumLite {
    UNKNOWN(0),
    SUCCESS(1),
    INTERNAL_ERROR(2),
    INVALID_PUSHID(3),
    UNRECOGNIZED(-1);

    public static final int INTERNAL_ERROR_VALUE = 2;
    public static final int INVALID_PUSHID_VALUE = 3;
    public static final int SUCCESS_VALUE = 1;
    public static final int UNKNOWN_VALUE = 0;
    private static final com.google.protobuf.Internal.EnumLiteMap<com.truecaller.api.services.businesscallerid.v1.model.Status> internalValueMap = new java.lang.Object();
    private final int value;

    Status(int i) {
        this.value = i;
    }

    public static com.truecaller.api.services.businesscallerid.v1.model.Status forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return INVALID_PUSHID;
                }
                return INTERNAL_ERROR;
            }
            return SUCCESS;
        }
        return UNKNOWN;
    }

    public static com.google.protobuf.Internal.EnumLiteMap<com.truecaller.api.services.businesscallerid.v1.model.Status> internalGetValueMap() {
        return internalValueMap;
    }

    public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
        return ie0.a.a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @java.lang.Deprecated
    public static com.truecaller.api.services.businesscallerid.v1.model.Status valueOf(int i) {
        return forNumber(i);
    }
}
