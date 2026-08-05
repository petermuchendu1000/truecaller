package com.truecaller.premium.engine.api.v1.shared;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public enum ButtonData$ButtonDataValueCase {
    BUTTON_V1(1),
    BUTTON_PAYMENT(2),
    GIVEAWAY(3),
    ENGAGEMENT(4),
    BUTTONDATAVALUE_NOT_SET(0);

    private final int value;

    ButtonData$ButtonDataValueCase(int i) {
        this.value = i;
    }

    public static com.truecaller.premium.engine.api.v1.shared.ButtonData$ButtonDataValueCase forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return null;
                        }
                        return ENGAGEMENT;
                    }
                    return GIVEAWAY;
                }
                return BUTTON_PAYMENT;
            }
            return BUTTON_V1;
        }
        return BUTTONDATAVALUE_NOT_SET;
    }

    public int getNumber() {
        return this.value;
    }

    @java.lang.Deprecated
    public static com.truecaller.premium.engine.api.v1.shared.ButtonData$ButtonDataValueCase valueOf(int i) {
        return forNumber(i);
    }
}
