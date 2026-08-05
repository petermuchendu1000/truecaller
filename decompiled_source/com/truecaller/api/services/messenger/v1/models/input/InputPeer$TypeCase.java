package com.truecaller.api.services.messenger.v1.models.input;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public enum InputPeer$TypeCase {
    USER(1),
    GROUP(2),
    TYPE_NOT_SET(0);

    private final int value;

    InputPeer$TypeCase(int i) {
        this.value = i;
    }

    public static com.truecaller.api.services.messenger.v1.models.input.InputPeer$TypeCase forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return GROUP;
            }
            return USER;
        }
        return TYPE_NOT_SET;
    }

    public int getNumber() {
        return this.value;
    }

    @java.lang.Deprecated
    public static com.truecaller.api.services.messenger.v1.models.input.InputPeer$TypeCase valueOf(int i) {
        return forNumber(i);
    }
}
