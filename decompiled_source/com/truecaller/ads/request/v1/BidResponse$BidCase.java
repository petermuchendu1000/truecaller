package com.truecaller.ads.request.v1;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public enum BidResponse$BidCase {
    SEAT_BID(2),
    NBR(3),
    BID_NOT_SET(0);

    private final int value;

    BidResponse$BidCase(int i) {
        this.value = i;
    }

    public static com.truecaller.ads.request.v1.BidResponse$BidCase forNumber(int i) {
        if (i != 0) {
            if (i != 2) {
                if (i != 3) {
                    return null;
                }
                return NBR;
            }
            return SEAT_BID;
        }
        return BID_NOT_SET;
    }

    public int getNumber() {
        return this.value;
    }

    @java.lang.Deprecated
    public static com.truecaller.ads.request.v1.BidResponse$BidCase valueOf(int i) {
        return forNumber(i);
    }
}
