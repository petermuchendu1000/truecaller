package com.truecaller.api.services.messenger.v1.models.input;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public enum InputNotificationSettings$ValueCase {
    DEFAULT(1),
    MUTED(2),
    WHITELISTED(3),
    MENTION_ONLY(4),
    VALUE_NOT_SET(0);

    private final int value;

    InputNotificationSettings$ValueCase(int i) {
        this.value = i;
    }

    public static com.truecaller.api.services.messenger.v1.models.input.InputNotificationSettings$ValueCase forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return null;
                        }
                        return MENTION_ONLY;
                    }
                    return WHITELISTED;
                }
                return MUTED;
            }
            return DEFAULT;
        }
        return VALUE_NOT_SET;
    }

    public int getNumber() {
        return this.value;
    }

    @java.lang.Deprecated
    public static com.truecaller.api.services.messenger.v1.models.input.InputNotificationSettings$ValueCase valueOf(int i) {
        return forNumber(i);
    }
}
