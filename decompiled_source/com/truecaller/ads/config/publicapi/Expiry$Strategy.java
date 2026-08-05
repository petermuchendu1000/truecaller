package com.truecaller.ads.config.publicapi;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public enum Expiry$Strategy implements com.google.protobuf.Internal.EnumLite {
    CONSUMPTION(0),
    TIME_BASED(1),
    UNRECOGNIZED(-1);

    public static final int CONSUMPTION_VALUE = 0;
    public static final int TIME_BASED_VALUE = 1;
    private static final com.google.protobuf.Internal.EnumLiteMap<com.truecaller.ads.config.publicapi.Expiry$Strategy> internalValueMap = new java.lang.Object();
    private final int value;

    Expiry$Strategy(int i) {
        this.value = i;
    }

    public static com.truecaller.ads.config.publicapi.Expiry$Strategy forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                return null;
            }
            return TIME_BASED;
        }
        return CONSUMPTION;
    }

    public static com.google.protobuf.Internal.EnumLiteMap<com.truecaller.ads.config.publicapi.Expiry$Strategy> internalGetValueMap() {
        return internalValueMap;
    }

    public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
        return p40.s.a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @java.lang.Deprecated
    public static com.truecaller.ads.config.publicapi.Expiry$Strategy valueOf(int i) {
        return forNumber(i);
    }
}
