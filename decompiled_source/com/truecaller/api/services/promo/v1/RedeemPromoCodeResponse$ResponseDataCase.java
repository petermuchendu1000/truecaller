package com.truecaller.api.services.promo.v1;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public enum RedeemPromoCodeResponse$ResponseDataCase {
    PREMIUM_SHOP_PROPERTIES(3),
    RESPONSEDATA_NOT_SET(0);

    private final int value;

    RedeemPromoCodeResponse$ResponseDataCase(int i) {
        this.value = i;
    }

    public static com.truecaller.api.services.promo.v1.RedeemPromoCodeResponse$ResponseDataCase forNumber(int i) {
        if (i != 0) {
            if (i != 3) {
                return null;
            }
            return PREMIUM_SHOP_PROPERTIES;
        }
        return RESPONSEDATA_NOT_SET;
    }

    public int getNumber() {
        return this.value;
    }

    @java.lang.Deprecated
    public static com.truecaller.api.services.promo.v1.RedeemPromoCodeResponse$ResponseDataCase valueOf(int i) {
        return forNumber(i);
    }
}
