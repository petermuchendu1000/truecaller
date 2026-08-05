package com.truecaller.ads.request.v1;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public enum BidResponse$SeatBid$Bid$VideoTapBehaviour implements com.google.protobuf.Internal.EnumLite {
    TapToUnmute(0),
    TapToRedirect(1),
    UNRECOGNIZED(-1);

    public static final int TapToRedirect_VALUE = 1;
    public static final int TapToUnmute_VALUE = 0;
    private static final com.google.protobuf.Internal.EnumLiteMap<com.truecaller.ads.request.v1.BidResponse$SeatBid$Bid$VideoTapBehaviour> internalValueMap = new java.lang.Object();
    private final int value;

    BidResponse$SeatBid$Bid$VideoTapBehaviour(int i) {
        this.value = i;
    }

    public static com.truecaller.ads.request.v1.BidResponse$SeatBid$Bid$VideoTapBehaviour forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                return null;
            }
            return TapToRedirect;
        }
        return TapToUnmute;
    }

    public static com.google.protobuf.Internal.EnumLiteMap<com.truecaller.ads.request.v1.BidResponse$SeatBid$Bid$VideoTapBehaviour> internalGetValueMap() {
        return internalValueMap;
    }

    public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
        return y90.h6.a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @java.lang.Deprecated
    public static com.truecaller.ads.request.v1.BidResponse$SeatBid$Bid$VideoTapBehaviour valueOf(int i) {
        return forNumber(i);
    }
}
