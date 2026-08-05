package com.truecaller.familygroup.v1;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public enum InviteeResponse$ResultCase {
    FAILURE(2),
    SUCCESS(3),
    RESULT_NOT_SET(0);

    private final int value;

    InviteeResponse$ResultCase(int i) {
        this.value = i;
    }

    public static com.truecaller.familygroup.v1.InviteeResponse$ResultCase forNumber(int i) {
        if (i != 0) {
            if (i != 2) {
                if (i != 3) {
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
    public static com.truecaller.familygroup.v1.InviteeResponse$ResultCase valueOf(int i) {
        return forNumber(i);
    }
}
