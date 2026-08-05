package com.truecaller.ads.config.publicapi;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public enum Placement$AuctionConfig$EmitMode implements com.google.protobuf.Internal.EnumLite {
    PROGRESSIVE(0),
    BATCH(1),
    UNRECOGNIZED(-1);

    public static final int BATCH_VALUE = 1;
    public static final int PROGRESSIVE_VALUE = 0;
    private static final com.google.protobuf.Internal.EnumLiteMap<com.truecaller.ads.config.publicapi.Placement$AuctionConfig$EmitMode> internalValueMap = new java.lang.Object();
    private final int value;

    Placement$AuctionConfig$EmitMode(int i) {
        this.value = i;
    }

    public static com.truecaller.ads.config.publicapi.Placement$AuctionConfig$EmitMode forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                return null;
            }
            return BATCH;
        }
        return PROGRESSIVE;
    }

    public static com.google.protobuf.Internal.EnumLiteMap<com.truecaller.ads.config.publicapi.Placement$AuctionConfig$EmitMode> internalGetValueMap() {
        return internalValueMap;
    }

    public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
        return p40.k0.a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @java.lang.Deprecated
    public static com.truecaller.ads.config.publicapi.Placement$AuctionConfig$EmitMode valueOf(int i) {
        return forNumber(i);
    }
}
