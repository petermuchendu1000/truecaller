package com.truecaller.api.services.callerid.v1.model;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public enum Phone$ValueCase {
    PHONE(1),
    NONNORMALIZEDPHONE(2),
    VALUE_NOT_SET(0);

    private final int value;

    Phone$ValueCase(int i) {
        this.value = i;
    }

    public static com.truecaller.api.services.callerid.v1.model.Phone$ValueCase forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return NONNORMALIZEDPHONE;
            }
            return PHONE;
        }
        return VALUE_NOT_SET;
    }

    public int getNumber() {
        return this.value;
    }

    @java.lang.Deprecated
    public static com.truecaller.api.services.callerid.v1.model.Phone$ValueCase valueOf(int i) {
        return forNumber(i);
    }
}
