package com.truecaller.api.services.searchwarnings.v1;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public enum SupernovaFeature$ValueCase {
    DOUBLEVALUE(2),
    LONGVALUE(3),
    STRINGVALUE(4),
    BOOLEANVALUE(5),
    VALUE_NOT_SET(0);

    private final int value;

    SupernovaFeature$ValueCase(int i) {
        this.value = i;
    }

    public static com.truecaller.api.services.searchwarnings.v1.SupernovaFeature$ValueCase forNumber(int i) {
        if (i != 0) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            return null;
                        }
                        return BOOLEANVALUE;
                    }
                    return STRINGVALUE;
                }
                return LONGVALUE;
            }
            return DOUBLEVALUE;
        }
        return VALUE_NOT_SET;
    }

    public int getNumber() {
        return this.value;
    }

    @java.lang.Deprecated
    public static com.truecaller.api.services.searchwarnings.v1.SupernovaFeature$ValueCase valueOf(int i) {
        return forNumber(i);
    }
}
