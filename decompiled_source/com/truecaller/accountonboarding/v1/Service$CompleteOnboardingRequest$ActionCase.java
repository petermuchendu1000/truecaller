package com.truecaller.accountonboarding.v1;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public enum Service$CompleteOnboardingRequest$ActionCase {
    SKIP(5),
    INSTALLATIONINFO(6),
    ACTION_NOT_SET(0);

    private final int value;

    Service$CompleteOnboardingRequest$ActionCase(int i) {
        this.value = i;
    }

    public static com.truecaller.accountonboarding.v1.Service$CompleteOnboardingRequest$ActionCase forNumber(int i) {
        if (i != 0) {
            if (i != 5) {
                if (i != 6) {
                    return null;
                }
                return INSTALLATIONINFO;
            }
            return SKIP;
        }
        return ACTION_NOT_SET;
    }

    public int getNumber() {
        return this.value;
    }

    @java.lang.Deprecated
    public static com.truecaller.accountonboarding.v1.Service$CompleteOnboardingRequest$ActionCase valueOf(int i) {
        return forNumber(i);
    }
}
