package com.truecaller.api.services.messenger.v1.models.input;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public enum InputNotificationScope$ValueCase {
    PHONE_NUMBER(1),
    GROUP_ID(2),
    IM_ID(3),
    VALUE_NOT_SET(0);

    private final int value;

    InputNotificationScope$ValueCase(int i) {
        this.value = i;
    }

    public static com.truecaller.api.services.messenger.v1.models.input.InputNotificationScope$ValueCase forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return IM_ID;
                }
                return GROUP_ID;
            }
            return PHONE_NUMBER;
        }
        return VALUE_NOT_SET;
    }

    public int getNumber() {
        return this.value;
    }

    @java.lang.Deprecated
    public static com.truecaller.api.services.messenger.v1.models.input.InputNotificationScope$ValueCase valueOf(int i) {
        return forNumber(i);
    }
}
