package com.truecaller.ads.request.v1;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public enum BidResponse$SeatBid$Bid$CampaignPriority implements com.google.protobuf.Internal.EnumLite {
    Roadblock(0),
    Standard(1),
    PricePriority(2),
    House(3),
    UNRECOGNIZED(-1);

    public static final int House_VALUE = 3;
    public static final int PricePriority_VALUE = 2;
    public static final int Roadblock_VALUE = 0;
    public static final int Standard_VALUE = 1;
    private static final com.google.protobuf.Internal.EnumLiteMap<com.truecaller.ads.request.v1.BidResponse$SeatBid$Bid$CampaignPriority> internalValueMap = new java.lang.Object();
    private final int value;

    BidResponse$SeatBid$Bid$CampaignPriority(int i) {
        this.value = i;
    }

    public static com.truecaller.ads.request.v1.BidResponse$SeatBid$Bid$CampaignPriority forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return House;
                }
                return PricePriority;
            }
            return Standard;
        }
        return Roadblock;
    }

    public static com.google.protobuf.Internal.EnumLiteMap<com.truecaller.ads.request.v1.BidResponse$SeatBid$Bid$CampaignPriority> internalGetValueMap() {
        return internalValueMap;
    }

    public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
        return y90.a3.a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @java.lang.Deprecated
    public static com.truecaller.ads.request.v1.BidResponse$SeatBid$Bid$CampaignPriority valueOf(int i) {
        return forNumber(i);
    }
}
