package com.truecaller.service;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public enum qux extends com.truecaller.service.AlarmReceiver.AlarmType {
    @Override // com.truecaller.service.AlarmReceiver.AlarmType
    public final android.app.Notification getNotification(android.content.Context context) {
        to1.g gVar = (to1.g) com.truecaller.service.AlarmReceiver.g(context).r3.get();
        if (!gVar.g() && !gVar.h()) {
            for (com.truecaller.service.AlarmReceiver.AlarmType alarmType : com.truecaller.service.AlarmReceiver.g) {
                z62.d.n(0L, alarmType.name());
            }
            com.truecaller.service.AlarmReceiver.e(context, false);
            return null;
        }
        return null;
    }
}
