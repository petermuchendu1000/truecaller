package com.truecaller.ads.config.publicapi;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public enum Placement$AuctionConfig$ConfigV2Case {
    PRIORITY_CONFIG(3),
    SERVER_AUCTION_CONFIG(4),
    CONFIGV2_NOT_SET(0);

    private final int value;

    Placement$AuctionConfig$ConfigV2Case(int i) {
        this.value = i;
    }

    public static com.truecaller.ads.config.publicapi.Placement$AuctionConfig$ConfigV2Case forNumber(int i) {
        if (i != 0) {
            if (i != 3) {
                if (i != 4) {
                    return null;
                }
                return SERVER_AUCTION_CONFIG;
            }
            return PRIORITY_CONFIG;
        }
        return CONFIGV2_NOT_SET;
    }

    public int getNumber() {
        return this.value;
    }

    @java.lang.Deprecated
    public static com.truecaller.ads.config.publicapi.Placement$AuctionConfig$ConfigV2Case valueOf(int i) {
        return forNumber(i);
    }
}
