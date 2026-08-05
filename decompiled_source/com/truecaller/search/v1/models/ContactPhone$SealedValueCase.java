package com.truecaller.search.v1.models;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public enum ContactPhone$SealedValueCase {
    OPEN_PHONE_NUMBER(1),
    SENDER_ID(2),
    ENCRYPTED_PHONE_NUMBER(3),
    SEALEDVALUE_NOT_SET(0);

    private final int value;

    ContactPhone$SealedValueCase(int i) {
        this.value = i;
    }

    public static com.truecaller.search.v1.models.ContactPhone$SealedValueCase forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return ENCRYPTED_PHONE_NUMBER;
                }
                return SENDER_ID;
            }
            return OPEN_PHONE_NUMBER;
        }
        return SEALEDVALUE_NOT_SET;
    }

    public int getNumber() {
        return this.value;
    }

    @java.lang.Deprecated
    public static com.truecaller.search.v1.models.ContactPhone$SealedValueCase valueOf(int i) {
        return forNumber(i);
    }
}
