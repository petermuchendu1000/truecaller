package com.truecaller.ads.config.common;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public enum ConnectConfig$ConfigCase {
    CONNECT_ID(1),
    CONNECT_DETAILS(2),
    CONFIG_NOT_SET(0);

    private final int value;

    ConnectConfig$ConfigCase(int i) {
        this.value = i;
    }

    public static com.truecaller.ads.config.common.ConnectConfig$ConfigCase forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return CONNECT_DETAILS;
            }
            return CONNECT_ID;
        }
        return CONFIG_NOT_SET;
    }

    public int getNumber() {
        return this.value;
    }

    @java.lang.Deprecated
    public static com.truecaller.ads.config.common.ConnectConfig$ConfigCase valueOf(int i) {
        return forNumber(i);
    }
}
