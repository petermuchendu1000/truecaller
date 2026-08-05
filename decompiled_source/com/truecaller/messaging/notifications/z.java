package com.truecaller.messaging.notifications;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class z {
    public final android.content.Context a;
    public final u62.i b;
    public final s62.d c;

    public z(android.content.Context context, u62.i iVar, s62.d dVar) {
        this.a = context;
        this.b = iVar;
        this.c = dVar;
    }

    public final android.app.Notification a(com.truecaller.data.entity.messaging.Participant participant, java.lang.String str) {
        int i;
        int i2;
        int i3 = participant.s;
        if (!participant.t() && participant.b == 1) {
            return null;
        }
        android.content.Context context = this.a;
        f6.f0 f0Var = new f6.f0(context, str);
        f0Var.Q.icon = 2131232903;
        f0Var.D = context.getColor(2131099683);
        if (participant.t() && i3 > 0) {
            i = 2132019676;
        } else {
            i = 2132019674;
        }
        f0Var.e = f6.f0.e(java.lang.String.format(context.getString(i), ak.r0.E(participant)));
        if (participant.t() && i3 > 0) {
            i2 = 2132019675;
        } else {
            i2 = 2132019673;
        }
        f0Var.f = f6.f0.e(context.getString(i2));
        int i4 = com.truecaller.messaging.smspermission.SmsPermissionActivity.f0;
        android.content.Context context2 = this.a;
        android.content.Intent b = com.appsflyer.internal.e.b(context2, com.truecaller.messaging.smspermission.SmsPermissionActivity.class, "AppUserInteraction.Context", "pushNotification-messagingPromo");
        b.putExtra("success_intent", (android.os.Parcelable) null);
        f0Var.g = ((s62.f) this.c).k(com.truecaller.analytics.common.event.PushNotificationSource.MobileLocal.getType(), 0, 335544320, context2, b.addFlags(268435456), "pushNotification-messagingPromo");
        f0Var.f(true);
        return this.b.a(f0Var, new a93.c(15, this, participant));
    }
}
