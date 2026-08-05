package com.truecaller.nationalidverification;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public enum FinishAadhaarVerificationResponse$ResultCase {
    FINISH_VERIFICATION_INFO(1),
    FINISH_VERIFICATION_FAILURE(2),
    RESULT_NOT_SET(0);

    private final int value;

    FinishAadhaarVerificationResponse$ResultCase(int i) {
        this.value = i;
    }

    public static com.truecaller.nationalidverification.FinishAadhaarVerificationResponse$ResultCase forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return FINISH_VERIFICATION_FAILURE;
            }
            return FINISH_VERIFICATION_INFO;
        }
        return RESULT_NOT_SET;
    }

    public int getNumber() {
        return this.value;
    }

    @java.lang.Deprecated
    public static com.truecaller.nationalidverification.FinishAadhaarVerificationResponse$ResultCase valueOf(int i) {
        return forNumber(i);
    }
}
