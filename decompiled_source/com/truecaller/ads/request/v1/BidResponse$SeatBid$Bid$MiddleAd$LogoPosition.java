package com.truecaller.ads.request.v1;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public enum BidResponse$SeatBid$Bid$MiddleAd$LogoPosition implements com.google.protobuf.Internal.EnumLite {
    TopLeft(0),
    TopMiddle(1),
    TopRight(2),
    MiddleLeft(3),
    Center(4),
    MiddleRight(5),
    BottomLeft(6),
    BottomMiddle(7),
    BottomRight(8),
    Start(9),
    End(10),
    UNRECOGNIZED(-1);

    public static final int BottomLeft_VALUE = 6;
    public static final int BottomMiddle_VALUE = 7;
    public static final int BottomRight_VALUE = 8;
    public static final int Center_VALUE = 4;
    public static final int End_VALUE = 10;
    public static final int MiddleLeft_VALUE = 3;
    public static final int MiddleRight_VALUE = 5;
    public static final int Start_VALUE = 9;
    public static final int TopLeft_VALUE = 0;
    public static final int TopMiddle_VALUE = 1;
    public static final int TopRight_VALUE = 2;
    private static final com.google.protobuf.Internal.EnumLiteMap<com.truecaller.ads.request.v1.BidResponse$SeatBid$Bid$MiddleAd$LogoPosition> internalValueMap = new java.lang.Object();
    private final int value;

    BidResponse$SeatBid$Bid$MiddleAd$LogoPosition(int i) {
        this.value = i;
    }

    public static com.truecaller.ads.request.v1.BidResponse$SeatBid$Bid$MiddleAd$LogoPosition forNumber(int i) {
        switch (i) {
            case 0:
                return TopLeft;
            case 1:
                return TopMiddle;
            case 2:
                return TopRight;
            case 3:
                return MiddleLeft;
            case 4:
                return Center;
            case 5:
                return MiddleRight;
            case 6:
                return BottomLeft;
            case 7:
                return BottomMiddle;
            case 8:
                return BottomRight;
            case 9:
                return Start;
            case 10:
                return End;
            default:
                return null;
        }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<com.truecaller.ads.request.v1.BidResponse$SeatBid$Bid$MiddleAd$LogoPosition> internalGetValueMap() {
        return internalValueMap;
    }

    public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
        return y90.k4.a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @java.lang.Deprecated
    public static com.truecaller.ads.request.v1.BidResponse$SeatBid$Bid$MiddleAd$LogoPosition valueOf(int i) {
        return forNumber(i);
    }
}
