package com.truecaller.api.services.messenger.v1.models;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public enum NotificationSettings$ValueCase {
    MUTED(1),
    WHITELISTED(2),
    MENTION_ONLY(3),
    VALUE_NOT_SET(0);

    private final int value;

    NotificationSettings$ValueCase(int i) {
        this.value = i;
    }

    public static com.truecaller.api.services.messenger.v1.models.NotificationSettings$ValueCase forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return MENTION_ONLY;
                }
                return WHITELISTED;
            }
            return MUTED;
        }
        return VALUE_NOT_SET;
    }

    public int getNumber() {
        return this.value;
    }

    @java.lang.Deprecated
    public static com.truecaller.api.services.messenger.v1.models.NotificationSettings$ValueCase valueOf(int i) {
        return forNumber(i);
    }
}
