package com.truecaller.ads.auctionengine.publicapi;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public enum AdSource implements com.google.protobuf.Internal.EnumLite {
    GAM(0),
    TAS(1),
    PARTNER(2),
    UNRECOGNIZED(-1);

    public static final int GAM_VALUE = 0;
    public static final int PARTNER_VALUE = 2;
    public static final int TAS_VALUE = 1;
    private static final com.google.protobuf.Internal.EnumLiteMap<com.truecaller.ads.auctionengine.publicapi.AdSource> internalValueMap = new java.lang.Object();
    private final int value;

    AdSource(int i) {
        this.value = i;
    }

    public static com.truecaller.ads.auctionengine.publicapi.AdSource forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return PARTNER;
            }
            return TAS;
        }
        return GAM;
    }

    public static com.google.protobuf.Internal.EnumLiteMap<com.truecaller.ads.auctionengine.publicapi.AdSource> internalGetValueMap() {
        return internalValueMap;
    }

    public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
        return f40.baz.a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @java.lang.Deprecated
    public static com.truecaller.ads.auctionengine.publicapi.AdSource valueOf(int i) {
        return forNumber(i);
    }
}
