package com.truecaller.service;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public enum baz extends com.truecaller.service.AlarmReceiver.AlarmType {
    @Override // com.truecaller.service.AlarmReceiver.AlarmType
    public final android.app.Notification getNotification(android.content.Context context) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (com.truecaller.service.AlarmReceiver.j == null) {
            try {
                com.truecaller.service.AlarmReceiver.j = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            }
        }
        if (currentTimeMillis - com.truecaller.service.AlarmReceiver.j.firstInstallTime > 15552000000L) {
            return com.truecaller.service.AlarmReceiver.AlarmType.TYPE_20DAYS.getNotification(context);
        }
        return null;
    }
}
