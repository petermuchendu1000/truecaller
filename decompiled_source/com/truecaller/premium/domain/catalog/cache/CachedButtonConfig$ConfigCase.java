package com.truecaller.premium.domain.catalog.cache;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public enum CachedButtonConfig$ConfigCase {
    SUBSCRIPTION(1),
    GIVEAWAY(2),
    ENGAGEMENT(3),
    CONFIG_NOT_SET(0);

    private final int value;

    CachedButtonConfig$ConfigCase(int i) {
        this.value = i;
    }

    public static com.truecaller.premium.domain.catalog.cache.CachedButtonConfig$ConfigCase forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return ENGAGEMENT;
                }
                return GIVEAWAY;
            }
            return SUBSCRIPTION;
        }
        return CONFIG_NOT_SET;
    }

    public int getNumber() {
        return this.value;
    }

    @java.lang.Deprecated
    public static com.truecaller.premium.domain.catalog.cache.CachedButtonConfig$ConfigCase valueOf(int i) {
        return forNumber(i);
    }
}
