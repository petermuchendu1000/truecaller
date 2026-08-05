package com.truecaller.messaging.smspermission;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class bar implements f.baz {
    public final /* synthetic */ com.truecaller.messaging.smspermission.Hilt_SmsPermissionActivity a;

    public bar(com.truecaller.messaging.smspermission.Hilt_SmsPermissionActivity hilt_SmsPermissionActivity) {
        this.a = hilt_SmsPermissionActivity;
    }

    public final void a(androidx.activity.ComponentActivity componentActivity) {
        com.truecaller.messaging.smspermission.Hilt_SmsPermissionActivity hilt_SmsPermissionActivity = this.a;
        if (!hilt_SmsPermissionActivity.c0) {
            hilt_SmsPermissionActivity.c0 = true;
            tx.e eVar = (com.truecaller.messaging.smspermission.baz) hilt_SmsPermissionActivity.X3();
            com.truecaller.messaging.smspermission.SmsPermissionActivity smsPermissionActivity = (com.truecaller.messaging.smspermission.SmsPermissionActivity) hilt_SmsPermissionActivity;
            tx.e eVar2 = eVar;
            tx.w wVar = eVar2.f;
            u03.z zVar = (u03.z) wVar.M.get();
            u03.b bVar = (u03.b) wVar.O.get();
            bd3.qux quxVar = (android.app.Activity) eVar2.i.a;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(quxVar, "activity");
            java.lang.String stringExtra = ((com.truecaller.messaging.smspermission.SmsPermissionActivity) ((com.truecaller.messaging.smspermission.qux) quxVar)).getIntent().getStringExtra("AppUserInteraction.Context");
            com.truecaller.log.AssertionUtil.isNotNull(stringExtra, "Setting context should not be null. Use SmsPermissionActivity.createIntent().");
            es.baz.l(stringExtra);
            smsPermissionActivity.d0 = new be0.baz(zVar, bVar, stringExtra, (nc0.bar) wVar.Y.get());
            smsPermissionActivity.e0 = (qw2.a0) wVar.x6.get();
        }
    }
}
