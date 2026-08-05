package com.truecaller.ads.request.v1;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public enum BidResponse$SeatBid$Bid$CountDown$CountDownPosition implements com.google.protobuf.Internal.EnumLite {
    TopRight(0),
    BottomRight(1),
    BottomLeft(2),
    TopLeft(3),
    UNRECOGNIZED(-1);

    public static final int BottomLeft_VALUE = 2;
    public static final int BottomRight_VALUE = 1;
    public static final int TopLeft_VALUE = 3;
    public static final int TopRight_VALUE = 0;
    private static final com.google.protobuf.Internal.EnumLiteMap<com.truecaller.ads.request.v1.BidResponse$SeatBid$Bid$CountDown$CountDownPosition> internalValueMap = new java.lang.Object();
    private final int value;

    BidResponse$SeatBid$Bid$CountDown$CountDownPosition(int i) {
        this.value = i;
    }

    public static com.truecaller.ads.request.v1.BidResponse$SeatBid$Bid$CountDown$CountDownPosition forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return TopLeft;
                }
                return BottomLeft;
            }
            return BottomRight;
        }
        return TopRight;
    }

    public static com.google.protobuf.Internal.EnumLiteMap<com.truecaller.ads.request.v1.BidResponse$SeatBid$Bid$CountDown$CountDownPosition> internalGetValueMap() {
        return internalValueMap;
    }

    public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
        return y90.l3.a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @java.lang.Deprecated
    public static com.truecaller.ads.request.v1.BidResponse$SeatBid$Bid$CountDown$CountDownPosition valueOf(int i) {
        return forNumber(i);
    }
}
