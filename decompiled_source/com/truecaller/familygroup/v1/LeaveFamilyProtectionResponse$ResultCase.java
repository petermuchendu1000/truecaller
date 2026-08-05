package com.truecaller.familygroup.v1;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public enum LeaveFamilyProtectionResponse$ResultCase {
    FAILURE(1),
    SUCCESS(2),
    RESULT_NOT_SET(0);

    private final int value;

    LeaveFamilyProtectionResponse$ResultCase(int i) {
        this.value = i;
    }

    public static com.truecaller.familygroup.v1.LeaveFamilyProtectionResponse$ResultCase forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return SUCCESS;
            }
            return FAILURE;
        }
        return RESULT_NOT_SET;
    }

    public int getNumber() {
        return this.value;
    }

    @java.lang.Deprecated
    public static com.truecaller.familygroup.v1.LeaveFamilyProtectionResponse$ResultCase valueOf(int i) {
        return forNumber(i);
    }
}
