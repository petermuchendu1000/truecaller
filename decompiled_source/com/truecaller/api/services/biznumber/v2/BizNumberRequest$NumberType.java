package com.truecaller.api.services.biznumber.v2;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public enum BizNumberRequest$NumberType implements com.google.protobuf.Internal.EnumLite {
    VERIFIED(0),
    TOP(1),
    UNRECOGNIZED(-1);

    public static final int TOP_VALUE = 1;
    public static final int VERIFIED_VALUE = 0;
    private static final com.google.protobuf.Internal.EnumLiteMap<com.truecaller.api.services.biznumber.v2.BizNumberRequest$NumberType> internalValueMap = new java.lang.Object();
    private final int value;

    BizNumberRequest$NumberType(int i) {
        this.value = i;
    }

    public static com.truecaller.api.services.biznumber.v2.BizNumberRequest$NumberType forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                return null;
            }
            return TOP;
        }
        return VERIFIED;
    }

    public static com.google.protobuf.Internal.EnumLiteMap<com.truecaller.api.services.biznumber.v2.BizNumberRequest$NumberType> internalGetValueMap() {
        return internalValueMap;
    }

    public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
        return ge0.d.a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @java.lang.Deprecated
    public static com.truecaller.api.services.biznumber.v2.BizNumberRequest$NumberType valueOf(int i) {
        return forNumber(i);
    }
}
