package com.truecaller.api.services.messenger.v1.models.input;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public enum InputSpan$Tag$ValueCase {
    BOOLEAN_VALUE(1),
    STRING_VALUE(2),
    LONG_VALUE(3),
    VALUE_NOT_SET(0);

    private final int value;

    InputSpan$Tag$ValueCase(int i) {
        this.value = i;
    }

    public static com.truecaller.api.services.messenger.v1.models.input.InputSpan$Tag$ValueCase forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return LONG_VALUE;
                }
                return STRING_VALUE;
            }
            return BOOLEAN_VALUE;
        }
        return VALUE_NOT_SET;
    }

    public int getNumber() {
        return this.value;
    }

    @java.lang.Deprecated
    public static com.truecaller.api.services.messenger.v1.models.input.InputSpan$Tag$ValueCase valueOf(int i) {
        return forNumber(i);
    }
}
