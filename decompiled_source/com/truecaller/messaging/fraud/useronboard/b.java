package com.truecaller.messaging.fraud.useronboard;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class b implements f.baz {
    public final /* synthetic */ com.truecaller.messaging.fraud.useronboard.Hilt_FraudOnboardNotificationActionActivity a;

    public b(com.truecaller.messaging.fraud.useronboard.Hilt_FraudOnboardNotificationActionActivity hilt_FraudOnboardNotificationActionActivity) {
        this.a = hilt_FraudOnboardNotificationActionActivity;
    }

    public final void a(androidx.activity.ComponentActivity componentActivity) {
        com.truecaller.messaging.fraud.useronboard.Hilt_FraudOnboardNotificationActionActivity hilt_FraudOnboardNotificationActionActivity = this.a;
        if (!hilt_FraudOnboardNotificationActionActivity.c0) {
            hilt_FraudOnboardNotificationActionActivity.c0 = true;
            tx.e eVar = (com.truecaller.messaging.fraud.useronboard.qux) hilt_FraudOnboardNotificationActionActivity.X3();
            com.truecaller.messaging.fraud.useronboard.FraudOnboardNotificationActionActivity fraudOnboardNotificationActionActivity = (com.truecaller.messaging.fraud.useronboard.FraudOnboardNotificationActionActivity) hilt_FraudOnboardNotificationActionActivity;
            tx.w wVar = eVar.f;
            fraudOnboardNotificationActionActivity.d0 = (kv1.i) wVar.E9.get();
            fraudOnboardNotificationActionActivity.e0 = cd3.baz.a(wVar.af);
        }
    }
}
