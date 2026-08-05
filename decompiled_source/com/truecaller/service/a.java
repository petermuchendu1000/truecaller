package com.truecaller.service;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public enum a extends com.truecaller.service.AlarmReceiver.AlarmType {
    @Override // com.truecaller.service.AlarmReceiver.AlarmType
    public final android.app.Notification getNotification(android.content.Context context) {
        android.app.Notification createNotification;
        boolean z = tx.a1.G;
        tx.a1 a = r11.bar.a();
        tx.w g = com.truecaller.service.AlarmReceiver.g(context);
        if (a.d()) {
            tx.w wVar = g;
            if (!((e92.g) wVar.c8.get()).c(com.truecaller.premium.data.feature.PremiumFeature.EXTENDED_SPAM_BLOCKING, false)) {
                android.content.SharedPreferences.Editor edit = ((to1.g) wVar.r3.get()).a.edit();
                edit.putBoolean("filter_updateNeeded", true);
                edit.apply();
                android.content.Intent a2 = ((uq2.baz) wVar.Xb.get()).a(context, new com.truecaller.settings.api.SettingsLaunchConfig(false, true), com.truecaller.settings.api.SettingsCategory.SETTINGS_BLOCK, null);
                bo.p a3 = ((s62.g) com.truecaller.service.AlarmReceiver.g(context).A3.get()).a();
                a3.b = 2131366086;
                createNotification = com.truecaller.service.AlarmReceiver.AlarmType.createNotification(context, context.getString(2132017196), context.getString(2132018129), a3.e(com.truecaller.analytics.common.event.PushNotificationSource.MobileLocal.getType(), "UpgradeNotification", a2));
                return createNotification;
            }
        }
        return null;
    }
}
