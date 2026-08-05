package com.truecaller.ads.request.v1;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public enum BidResponse$SeatBid$Bid$AdmBehaviour$MutePosition implements com.google.protobuf.Internal.EnumLite {
    TopLeft(0),
    TopRight(1),
    BottomRight(2),
    UNRECOGNIZED(-1);

    public static final int BottomRight_VALUE = 2;

    @java.lang.Deprecated
    public static final int TopLeft_VALUE = 0;
    public static final int TopRight_VALUE = 1;
    private static final com.google.protobuf.Internal.EnumLiteMap<com.truecaller.ads.request.v1.BidResponse$SeatBid$Bid$AdmBehaviour$MutePosition> internalValueMap = new java.lang.Object();
    private final int value;

    BidResponse$SeatBid$Bid$AdmBehaviour$MutePosition(int i) {
        this.value = i;
    }

    public static com.truecaller.ads.request.v1.BidResponse$SeatBid$Bid$AdmBehaviour$MutePosition forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return BottomRight;
            }
            return TopRight;
        }
        return TopLeft;
    }

    public static com.google.protobuf.Internal.EnumLiteMap<com.truecaller.ads.request.v1.BidResponse$SeatBid$Bid$AdmBehaviour$MutePosition> internalGetValueMap() {
        return internalValueMap;
    }

    public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
        return y90.g2.a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @java.lang.Deprecated
    public static com.truecaller.ads.request.v1.BidResponse$SeatBid$Bid$AdmBehaviour$MutePosition valueOf(int i) {
        return forNumber(i);
    }
}
