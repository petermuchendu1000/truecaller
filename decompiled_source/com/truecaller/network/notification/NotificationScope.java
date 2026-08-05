package com.truecaller.network.notification;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public enum NotificationScope {
    LOCAL(-1, ""),
    GLOBAL(1, "global"),
    PERSONAL(2, "personal");

    public final java.lang.String stringValue;
    public final int value;

    NotificationScope(int i, java.lang.String str) {
        this.value = i;
        this.stringValue = str;
    }

    @androidx.annotation.NonNull
    public static com.truecaller.network.notification.NotificationScope valueOf(int i) {
        for (com.truecaller.network.notification.NotificationScope notificationScope : values()) {
            if (notificationScope.value == i) {
                return notificationScope;
            }
        }
        throw new java.lang.IllegalArgumentException(bar.k(i, "Unknown NotificationScope value, "));
    }
}
