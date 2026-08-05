package com.truecaller.ads.config.publicapi;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public enum AdSource$SourceType implements com.google.protobuf.Internal.EnumLite {
    GAM(0),
    TAS(1),
    PARTNER_SDK(2),
    UNRECOGNIZED(-1);

    public static final int GAM_VALUE = 0;
    public static final int PARTNER_SDK_VALUE = 2;
    public static final int TAS_VALUE = 1;
    private static final com.google.protobuf.Internal.EnumLiteMap<com.truecaller.ads.config.publicapi.AdSource$SourceType> internalValueMap = new java.lang.Object();
    private final int value;

    AdSource$SourceType(int i) {
        this.value = i;
    }

    public static com.truecaller.ads.config.publicapi.AdSource$SourceType forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return PARTNER_SDK;
            }
            return TAS;
        }
        return GAM;
    }

    public static com.google.protobuf.Internal.EnumLiteMap<com.truecaller.ads.config.publicapi.AdSource$SourceType> internalGetValueMap() {
        return internalValueMap;
    }

    public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
        return p40.a.a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @java.lang.Deprecated
    public static com.truecaller.ads.config.publicapi.AdSource$SourceType valueOf(int i) {
        return forNumber(i);
    }
}
