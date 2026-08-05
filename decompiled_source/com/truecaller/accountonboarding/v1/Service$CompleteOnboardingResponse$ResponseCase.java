package com.truecaller.accountonboarding.v1;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public enum Service$CompleteOnboardingResponse$ResponseCase {
    ONBOARDED(1),
    ERROR(2),
    RESPONSE_NOT_SET(0);

    private final int value;

    Service$CompleteOnboardingResponse$ResponseCase(int i) {
        this.value = i;
    }

    public static com.truecaller.accountonboarding.v1.Service$CompleteOnboardingResponse$ResponseCase forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return ERROR;
            }
            return ONBOARDED;
        }
        return RESPONSE_NOT_SET;
    }

    public int getNumber() {
        return this.value;
    }

    @java.lang.Deprecated
    public static com.truecaller.accountonboarding.v1.Service$CompleteOnboardingResponse$ResponseCase valueOf(int i) {
        return forNumber(i);
    }
}
