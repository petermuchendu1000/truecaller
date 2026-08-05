package com.truecaller.api.services.comments.model;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public enum NumberType implements com.google.protobuf.Internal.EnumLite {
    UNKNOWN_NUMBER_TYPE(0),
    PHONE_NUMBER(1),
    SENDER_ID(2),
    IM_ID(3),
    UNRECOGNIZED(-1);

    public static final int IM_ID_VALUE = 3;
    public static final int PHONE_NUMBER_VALUE = 1;
    public static final int SENDER_ID_VALUE = 2;
    public static final int UNKNOWN_NUMBER_TYPE_VALUE = 0;
    private static final com.google.protobuf.Internal.EnumLiteMap<com.truecaller.api.services.comments.model.NumberType> internalValueMap = new java.lang.Object();
    private final int value;

    NumberType(int i) {
        this.value = i;
    }

    public static com.truecaller.api.services.comments.model.NumberType forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return IM_ID;
                }
                return SENDER_ID;
            }
            return PHONE_NUMBER;
        }
        return UNKNOWN_NUMBER_TYPE;
    }

    public static com.google.protobuf.Internal.EnumLiteMap<com.truecaller.api.services.comments.model.NumberType> internalGetValueMap() {
        return internalValueMap;
    }

    public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
        return me0.i0.a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @java.lang.Deprecated
    public static com.truecaller.api.services.comments.model.NumberType valueOf(int i) {
        return forNumber(i);
    }
}
