package com.truecaller.api.services.messenger.v1.models.input;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public enum InputSpan$Log$ValueCase {
    TEXT(2),
    VALUE_NOT_SET(0);

    private final int value;

    InputSpan$Log$ValueCase(int i) {
        this.value = i;
    }

    public static com.truecaller.api.services.messenger.v1.models.input.InputSpan$Log$ValueCase forNumber(int i) {
        if (i != 0) {
            if (i != 2) {
                return null;
            }
            return TEXT;
        }
        return VALUE_NOT_SET;
    }

    public int getNumber() {
        return this.value;
    }

    @java.lang.Deprecated
    public static com.truecaller.api.services.messenger.v1.models.input.InputSpan$Log$ValueCase valueOf(int i) {
        return forNumber(i);
    }
}
