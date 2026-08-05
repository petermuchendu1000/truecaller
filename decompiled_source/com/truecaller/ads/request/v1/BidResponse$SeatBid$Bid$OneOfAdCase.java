package com.truecaller.ads.request.v1;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public enum BidResponse$SeatBid$Bid$OneOfAdCase {
    AD(2),
    NBR(3),
    PMD_BID(5),
    ONEOFAD_NOT_SET(0);

    private final int value;

    BidResponse$SeatBid$Bid$OneOfAdCase(int i) {
        this.value = i;
    }

    public static com.truecaller.ads.request.v1.BidResponse$SeatBid$Bid$OneOfAdCase forNumber(int i) {
        if (i != 0) {
            if (i != 5) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return NBR;
                }
                return AD;
            }
            return PMD_BID;
        }
        return ONEOFAD_NOT_SET;
    }

    public int getNumber() {
        return this.value;
    }

    @java.lang.Deprecated
    public static com.truecaller.ads.request.v1.BidResponse$SeatBid$Bid$OneOfAdCase valueOf(int i) {
        return forNumber(i);
    }
}
