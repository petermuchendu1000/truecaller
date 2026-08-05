package com.truecaller.api.services.messenger.v1.models.input;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public enum InputMessageContent$Audio$ExtCase {
    MUSIC(5),
    PODCAST(6),
    EXT_NOT_SET(0);

    private final int value;

    InputMessageContent$Audio$ExtCase(int i) {
        this.value = i;
    }

    public static com.truecaller.api.services.messenger.v1.models.input.InputMessageContent$Audio$ExtCase forNumber(int i) {
        if (i != 0) {
            if (i != 5) {
                if (i != 6) {
                    return null;
                }
                return PODCAST;
            }
            return MUSIC;
        }
        return EXT_NOT_SET;
    }

    public int getNumber() {
        return this.value;
    }

    @java.lang.Deprecated
    public static com.truecaller.api.services.messenger.v1.models.input.InputMessageContent$Audio$ExtCase valueOf(int i) {
        return forNumber(i);
    }
}
