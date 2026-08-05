package com.truecaller.ads.config.publicapi;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public enum Flow$AuctionType implements com.google.protobuf.Internal.EnumLite {
    FIRST_COME_FIRST_SERVE(0),
    ECPM(1),
    FCFS_ECPM_HYBRID(2),
    UNRECOGNIZED(-1);

    public static final int ECPM_VALUE = 1;
    public static final int FCFS_ECPM_HYBRID_VALUE = 2;
    public static final int FIRST_COME_FIRST_SERVE_VALUE = 0;
    private static final com.google.protobuf.Internal.EnumLiteMap<com.truecaller.ads.config.publicapi.Flow$AuctionType> internalValueMap = new java.lang.Object();
    private final int value;

    Flow$AuctionType(int i) {
        this.value = i;
    }

    public static com.truecaller.ads.config.publicapi.Flow$AuctionType forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return FCFS_ECPM_HYBRID;
            }
            return ECPM;
        }
        return FIRST_COME_FIRST_SERVE;
    }

    public static com.google.protobuf.Internal.EnumLiteMap<com.truecaller.ads.config.publicapi.Flow$AuctionType> internalGetValueMap() {
        return internalValueMap;
    }

    public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
        return p40.w.a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @java.lang.Deprecated
    public static com.truecaller.ads.config.publicapi.Flow$AuctionType valueOf(int i) {
        return forNumber(i);
    }
}
