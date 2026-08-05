package com.truecaller.ads.config.publicapi;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public enum Placement$AuctionConfig$BackfillResolutionStrategy implements com.google.protobuf.Internal.EnumLite {
    BACKFILL_YIELD(0),
    BACKFILL_EAGER(1),
    UNRECOGNIZED(-1);

    public static final int BACKFILL_EAGER_VALUE = 1;
    public static final int BACKFILL_YIELD_VALUE = 0;
    private static final com.google.protobuf.Internal.EnumLiteMap<com.truecaller.ads.config.publicapi.Placement$AuctionConfig$BackfillResolutionStrategy> internalValueMap = new java.lang.Object();
    private final int value;

    Placement$AuctionConfig$BackfillResolutionStrategy(int i) {
        this.value = i;
    }

    public static com.truecaller.ads.config.publicapi.Placement$AuctionConfig$BackfillResolutionStrategy forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                return null;
            }
            return BACKFILL_EAGER;
        }
        return BACKFILL_YIELD;
    }

    public static com.google.protobuf.Internal.EnumLiteMap<com.truecaller.ads.config.publicapi.Placement$AuctionConfig$BackfillResolutionStrategy> internalGetValueMap() {
        return internalValueMap;
    }

    public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
        return p40.h0.a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @java.lang.Deprecated
    public static com.truecaller.ads.config.publicapi.Placement$AuctionConfig$BackfillResolutionStrategy valueOf(int i) {
        return forNumber(i);
    }
}
