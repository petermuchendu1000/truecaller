package com.truecaller.ads.auctionengine.publicapi;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public enum AuctionResponse$AuctionResult$ResultCase {
    GAM_AD_RESPONSE(1),
    PARTNER_BID(2),
    RESULT_NOT_SET(0);

    private final int value;

    AuctionResponse$AuctionResult$ResultCase(int i) {
        this.value = i;
    }

    public static com.truecaller.ads.auctionengine.publicapi.AuctionResponse$AuctionResult$ResultCase forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return PARTNER_BID;
            }
            return GAM_AD_RESPONSE;
        }
        return RESULT_NOT_SET;
    }

    public int getNumber() {
        return this.value;
    }

    @java.lang.Deprecated
    public static com.truecaller.ads.auctionengine.publicapi.AuctionResponse$AuctionResult$ResultCase valueOf(int i) {
        return forNumber(i);
    }
}
