package com.truecaller.service;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public enum bar extends com.truecaller.service.AlarmReceiver.AlarmType {
    @Override // com.truecaller.service.AlarmReceiver.AlarmType
    public final android.app.Notification getNotification(android.content.Context context) {
        android.app.Notification createNotification;
        int i = com.truecaller.notifications.support.NotificationTrampolineActivity.n0;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("com.truecaller.intent.action.SHARE", "notificationName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("Opened", "notificationType");
        android.content.Intent c = p7.bar.c(context, "com.truecaller.intent.action.SHARE", "Opened", (qx2.mi) null);
        bo.p a = ((s62.g) com.truecaller.service.AlarmReceiver.g(context).A3.get()).a();
        a.b = 2131366085;
        createNotification = com.truecaller.service.AlarmReceiver.AlarmType.createNotification(context, context.getString(2132017196), context.getString(2132018121), a.e(com.truecaller.analytics.common.event.PushNotificationSource.MobileLocal.getType(), "UpgradeNotification", c));
        return createNotification;
    }
}
