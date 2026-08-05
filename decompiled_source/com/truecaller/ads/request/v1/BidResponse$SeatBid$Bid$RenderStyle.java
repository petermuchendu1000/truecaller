package com.truecaller.ads.request.v1;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public enum BidResponse$SeatBid$Bid$RenderStyle implements com.google.protobuf.Internal.EnumLite {
    STANDARD(0),
    TRANSPARENT(1),
    UNRECOGNIZED(-1);

    public static final int STANDARD_VALUE = 0;
    public static final int TRANSPARENT_VALUE = 1;
    private static final com.google.protobuf.Internal.EnumLiteMap<com.truecaller.ads.request.v1.BidResponse$SeatBid$Bid$RenderStyle> internalValueMap = new java.lang.Object();
    private final int value;

    BidResponse$SeatBid$Bid$RenderStyle(int i) {
        this.value = i;
    }

    public static com.truecaller.ads.request.v1.BidResponse$SeatBid$Bid$RenderStyle forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                return null;
            }
            return TRANSPARENT;
        }
        return STANDARD;
    }

    public static com.google.protobuf.Internal.EnumLiteMap<com.truecaller.ads.request.v1.BidResponse$SeatBid$Bid$RenderStyle> internalGetValueMap() {
        return internalValueMap;
    }

    public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
        return y90.h5.a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @java.lang.Deprecated
    public static com.truecaller.ads.request.v1.BidResponse$SeatBid$Bid$RenderStyle valueOf(int i) {
        return forNumber(i);
    }
}
