package com.truecaller.premium.engine.v1.shared.client.rules;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public enum RuleDetails$DetailsCase {
    EVENTRULE(1),
    DETAILS_NOT_SET(0);

    private final int value;

    RuleDetails$DetailsCase(int i) {
        this.value = i;
    }

    public static com.truecaller.premium.engine.v1.shared.client.rules.RuleDetails$DetailsCase forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                return null;
            }
            return EVENTRULE;
        }
        return DETAILS_NOT_SET;
    }

    public int getNumber() {
        return this.value;
    }

    @java.lang.Deprecated
    public static com.truecaller.premium.engine.v1.shared.client.rules.RuleDetails$DetailsCase valueOf(int i) {
        return forNumber(i);
    }
}
