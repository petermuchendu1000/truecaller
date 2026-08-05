package com.truecaller.notificationchannels.tracking;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class bar implements f.baz {
    public final /* synthetic */ com.truecaller.notificationchannels.tracking.Hilt_NotificationTrackingActivity a;

    public bar(com.truecaller.notificationchannels.tracking.Hilt_NotificationTrackingActivity hilt_NotificationTrackingActivity) {
        this.a = hilt_NotificationTrackingActivity;
    }

    public final void a(androidx.activity.ComponentActivity componentActivity) {
        com.truecaller.notificationchannels.tracking.Hilt_NotificationTrackingActivity hilt_NotificationTrackingActivity = this.a;
        if (!hilt_NotificationTrackingActivity.c0) {
            hilt_NotificationTrackingActivity.c0 = true;
            tx.e eVar = (com.truecaller.notificationchannels.tracking.baz) hilt_NotificationTrackingActivity.X3();
            com.truecaller.notificationchannels.tracking.NotificationTrackingActivity notificationTrackingActivity = (com.truecaller.notificationchannels.tracking.NotificationTrackingActivity) hilt_NotificationTrackingActivity;
            tx.w wVar = eVar.f;
            notificationTrackingActivity.d0 = (nc0.bar) wVar.Y.get();
            notificationTrackingActivity.e0 = (nc0.l1) wVar.O2.get();
            notificationTrackingActivity.f0 = (qo1.m) wVar.F2.get();
        }
    }
}
