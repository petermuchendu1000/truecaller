package com.truecaller.ads.config.publicapi;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public enum AdSource$SourceTypeCase {
    GAMSOURCE(2),
    TASSOURCE(3),
    PARTNERSOURCE(4),
    SOURCETYPE_NOT_SET(0);

    private final int value;

    AdSource$SourceTypeCase(int i) {
        this.value = i;
    }

    public static com.truecaller.ads.config.publicapi.AdSource$SourceTypeCase forNumber(int i) {
        if (i != 0) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return null;
                    }
                    return PARTNERSOURCE;
                }
                return TASSOURCE;
            }
            return GAMSOURCE;
        }
        return SOURCETYPE_NOT_SET;
    }

    public int getNumber() {
        return this.value;
    }

    @java.lang.Deprecated
    public static com.truecaller.ads.config.publicapi.AdSource$SourceTypeCase valueOf(int i) {
        return forNumber(i);
    }
}
