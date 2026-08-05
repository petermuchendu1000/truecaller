package com.truecaller.notificationchannels.tracking;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public abstract /* synthetic */ class a {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[com.truecaller.analytics.common.event.PushNotificationAction.values().length];
        try {
            iArr[com.truecaller.analytics.common.event.PushNotificationAction.Clicked.ordinal()] = 1;
        } catch (java.lang.NoSuchFieldError unused) {
        }
        try {
            iArr[com.truecaller.analytics.common.event.PushNotificationAction.LeftButton.ordinal()] = 2;
        } catch (java.lang.NoSuchFieldError unused2) {
        }
        try {
            iArr[com.truecaller.analytics.common.event.PushNotificationAction.MiddleButton.ordinal()] = 3;
        } catch (java.lang.NoSuchFieldError unused3) {
        }
        try {
            iArr[com.truecaller.analytics.common.event.PushNotificationAction.RightButton.ordinal()] = 4;
        } catch (java.lang.NoSuchFieldError unused4) {
        }
        try {
            iArr[com.truecaller.analytics.common.event.PushNotificationAction.Dismissed.ordinal()] = 5;
        } catch (java.lang.NoSuchFieldError unused5) {
        }
        try {
            iArr[com.truecaller.analytics.common.event.PushNotificationAction.Deleted.ordinal()] = 6;
        } catch (java.lang.NoSuchFieldError unused6) {
        }
        a = iArr;
    }
}
