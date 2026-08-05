package com.truecaller.premium.data;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public enum PremiumScope {
    NONE("NoneScope"),
    PAID_PREMIUM("paid_premium"),
    OFFER_WALL("offerwall"),
    PROMOTION("promotion"),
    CUSTOMER_SUPPORT("customer_support"),
    PRO_CAMPAIGNS("pro-campaigns"),
    GIVE_AWAY("giveaway_premium"),
    REFERRALS("referrals"),
    PARTNER("partner"),
    TC_PAY("tc-pay"),
    TC_SUPPORT("tc-support"),
    TESTING("testing"),
    OTHER("Other"),
    UNRECOGNIZED("UNRECOGNIZED");

    private final java.lang.String scope;

    PremiumScope(java.lang.String str) {
        this.scope = str;
    }

    @androidx.annotation.NonNull
    public static com.truecaller.premium.data.PremiumScope fromRemote(@androidx.annotation.Nullable java.lang.String str) {
        for (com.truecaller.premium.data.PremiumScope premiumScope : values()) {
            if (jj3.bar.g(premiumScope.scope, str)) {
                return premiumScope;
            }
        }
        return NONE;
    }

    @androidx.annotation.NonNull
    public java.lang.String getScope() {
        return this.scope;
    }
}
