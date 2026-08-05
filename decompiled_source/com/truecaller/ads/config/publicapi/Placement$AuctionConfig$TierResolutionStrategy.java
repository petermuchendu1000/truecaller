package com.truecaller.ads.config.publicapi;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public enum Placement$AuctionConfig$TierResolutionStrategy implements com.google.protobuf.Internal.EnumLite {
    EAGER(0),
    EAGER_THEN_YIELD(1),
    YIELD(2),
    UNRECOGNIZED(-1);

    public static final int EAGER_THEN_YIELD_VALUE = 1;
    public static final int EAGER_VALUE = 0;
    public static final int YIELD_VALUE = 2;
    private static final com.google.protobuf.Internal.EnumLiteMap<com.truecaller.ads.config.publicapi.Placement$AuctionConfig$TierResolutionStrategy> internalValueMap = new java.lang.Object();
    private final int value;

    Placement$AuctionConfig$TierResolutionStrategy(int i) {
        this.value = i;
    }

    public static com.truecaller.ads.config.publicapi.Placement$AuctionConfig$TierResolutionStrategy forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return YIELD;
            }
            return EAGER_THEN_YIELD;
        }
        return EAGER;
    }

    public static com.google.protobuf.Internal.EnumLiteMap<com.truecaller.ads.config.publicapi.Placement$AuctionConfig$TierResolutionStrategy> internalGetValueMap() {
        return internalValueMap;
    }

    public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
        return p40.s0.a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @java.lang.Deprecated
    public static com.truecaller.ads.config.publicapi.Placement$AuctionConfig$TierResolutionStrategy valueOf(int i) {
        return forNumber(i);
    }
}
