package com.truecaller.api.services.messenger.v1.models;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public enum ReactionContent$ValueCase {
    EMOJI(1),
    VALUE_NOT_SET(0);

    private final int value;

    ReactionContent$ValueCase(int i) {
        this.value = i;
    }

    public static com.truecaller.api.services.messenger.v1.models.ReactionContent$ValueCase forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                return null;
            }
            return EMOJI;
        }
        return VALUE_NOT_SET;
    }

    public int getNumber() {
        return this.value;
    }

    @java.lang.Deprecated
    public static com.truecaller.api.services.messenger.v1.models.ReactionContent$ValueCase valueOf(int i) {
        return forNumber(i);
    }
}
