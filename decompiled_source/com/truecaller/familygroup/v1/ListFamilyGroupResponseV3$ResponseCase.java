package com.truecaller.familygroup.v1;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public enum ListFamilyGroupResponseV3$ResponseCase {
    OK(2),
    NOTMODIFIED(3),
    RESPONSE_NOT_SET(0);

    private final int value;

    ListFamilyGroupResponseV3$ResponseCase(int i) {
        this.value = i;
    }

    public static com.truecaller.familygroup.v1.ListFamilyGroupResponseV3$ResponseCase forNumber(int i) {
        if (i != 0) {
            if (i != 2) {
                if (i != 3) {
                    return null;
                }
                return NOTMODIFIED;
            }
            return OK;
        }
        return RESPONSE_NOT_SET;
    }

    public int getNumber() {
        return this.value;
    }

    @java.lang.Deprecated
    public static com.truecaller.familygroup.v1.ListFamilyGroupResponseV3$ResponseCase valueOf(int i) {
        return forNumber(i);
    }
}
