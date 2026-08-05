package com.truecaller.service;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public enum b extends com.truecaller.service.AlarmReceiver.AlarmType {
    @Override // com.truecaller.service.AlarmReceiver.AlarmType
    public final android.app.Notification getNotification(android.content.Context context) {
        android.app.Notification createNotification;
        android.content.Intent intent = new android.content.Intent("android.settings.ACTION_NOTIFICATION_LISTENER_SETTINGS");
        bo.p a = ((s62.g) com.truecaller.service.AlarmReceiver.g(context).A3.get()).a();
        a.b = 2131366083;
        createNotification = com.truecaller.service.AlarmReceiver.AlarmType.createNotification(context, context.getString(2132017237), context.getString(2132018120), a.e(com.truecaller.analytics.common.event.PushNotificationSource.MobileLocal.getType(), "UpgradeNotification", intent));
        return createNotification;
    }

    @Override // com.truecaller.service.AlarmReceiver.AlarmType
    public final boolean shouldShow(android.content.Context context) {
        boolean z;
        jq2.b bVar = (jq2.b) com.truecaller.service.AlarmReceiver.g(context).L2.get();
        u03.z c3 = com.truecaller.service.AlarmReceiver.g(context).c3();
        if (bVar.o0() == com.truecaller.calling_common.settings.CallingSettings.BlockMethod.Mute && !c3.h()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            r33.bar k3 = com.truecaller.service.AlarmReceiver.g(context).k3();
            com.truecaller.premium.util.NotificationAccessSource notificationAccessSource = com.truecaller.premium.util.NotificationAccessSource.NOTIFICATION_RING_SILENT;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(notificationAccessSource, "source");
            k3.a.push("NotificationAccessRequested", kotlin.collections.q0.c(new kotlin.Pair("Source", notificationAccessSource.name())));
        }
        return z;
    }
}
