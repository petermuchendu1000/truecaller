package com.truecaller.api.services.promo.v1;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public enum RedeemPromoCodeResponse$ResultCase {
    FAILURE(1),
    SUCCESS(2),
    RESULT_NOT_SET(0);

    private final int value;

    RedeemPromoCodeResponse$ResultCase(int i) {
        this.value = i;
    }

    public static com.truecaller.api.services.promo.v1.RedeemPromoCodeResponse$ResultCase forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return SUCCESS;
            }
            return FAILURE;
        }
        return RESULT_NOT_SET;
    }

    public int getNumber() {
        return this.value;
    }

    @java.lang.Deprecated
    public static com.truecaller.api.services.promo.v1.RedeemPromoCodeResponse$ResultCase valueOf(int i) {
        return forNumber(i);
    }
}
