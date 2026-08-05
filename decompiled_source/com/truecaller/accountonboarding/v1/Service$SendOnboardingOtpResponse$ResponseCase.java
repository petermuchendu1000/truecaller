package com.truecaller.accountonboarding.v1;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public enum Service$SendOnboardingOtpResponse$ResponseCase {
    ONBOARDED(2),
    ATTESTATIONREQUIRED(3),
    EXPECTINGOTP(4),
    ERROR(5),
    BACKUPFOUND(6),
    RESPONSE_NOT_SET(0);

    private final int value;

    Service$SendOnboardingOtpResponse$ResponseCase(int i) {
        this.value = i;
    }

    public static com.truecaller.accountonboarding.v1.Service$SendOnboardingOtpResponse$ResponseCase forNumber(int i) {
        if (i != 0) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            if (i != 6) {
                                return null;
                            }
                            return BACKUPFOUND;
                        }
                        return ERROR;
                    }
                    return EXPECTINGOTP;
                }
                return ATTESTATIONREQUIRED;
            }
            return ONBOARDED;
        }
        return RESPONSE_NOT_SET;
    }

    public int getNumber() {
        return this.value;
    }

    @java.lang.Deprecated
    public static com.truecaller.accountonboarding.v1.Service$SendOnboardingOtpResponse$ResponseCase valueOf(int i) {
        return forNumber(i);
    }
}
