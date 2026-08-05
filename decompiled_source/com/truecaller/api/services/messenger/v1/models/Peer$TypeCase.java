package com.truecaller.api.services.messenger.v1.models;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public enum Peer$TypeCase {
    USER(1),
    GROUP(2),
    TYPE_NOT_SET(0);

    private final int value;

    Peer$TypeCase(int i) {
        this.value = i;
    }

    public static com.truecaller.api.services.messenger.v1.models.Peer$TypeCase forNumber(int i) {
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
    public static com.truecaller.api.services.messenger.v1.models.Peer$TypeCase valueOf(int i) {
        return forNumber(i);
    }
}
