package com.truecaller.wizard.verification;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class q extends android.content.BroadcastReceiver {
    public final com.truecaller.wizard.verification.s1 a;

    public q(com.truecaller.wizard.verification.s1 s1Var) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(s1Var, "verificationPresenter");
        this.a = s1Var;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        java.lang.String str;
        java.lang.Integer num;
        java.lang.String str2;
        java.lang.String str3;
        android.telephony.SmsMessage createFromPdu;
        java.lang.Integer num2;
        java.lang.Boolean bool;
        com.truecaller.analytics.technical.AppStartTracker.onBroadcastReceive(this, context, intent);
        java.lang.Integer num3 = null;
        if (intent != null) {
            str = intent.getStringExtra("com.truecaller.wizard.SMS_PHONE_NUMBER");
        } else {
            str = null;
        }
        if (intent != null) {
            num = java.lang.Integer.valueOf(intent.getIntExtra("com.truecaller.wizard.SMS_ATTEMPT_NUMBER", -1));
        } else {
            num = null;
        }
        if (intent != null) {
            str2 = intent.getAction();
        } else {
            str2 = null;
        }
        boolean equals = "com.truecaller.wizard.SEND_SMS".equals(str2);
        com.truecaller.wizard.verification.s1 s1Var = this.a;
        if (equals) {
            if (intent.hasExtra("errorCode")) {
                num2 = java.lang.Integer.valueOf(intent.getIntExtra("errorCode", 0));
            } else {
                num2 = null;
            }
            if (intent.hasExtra("noDefault")) {
                bool = java.lang.Boolean.valueOf(intent.getBooleanExtra("noDefault", false));
            } else {
                bool = null;
            }
            int intExtra = intent.getIntExtra("resultCode", 0);
            lf2.r.m(s1Var.J, (kotlin.coroutines.CoroutineContext) null, new com.truecaller.wizard.verification.x0(s1Var, 2), new com.truecaller.wizard.verification.e1(s1Var, intExtra, (df3.bar) null), (com.truecaller.wizard.verification.g0) null, 9);
            s1Var.n.g0(java.lang.String.valueOf(intExtra), str, num, s1Var.N, num2, bool);
            return;
        }
        if (intent != null) {
            str3 = intent.getAction();
        } else {
            str3 = null;
        }
        if ("com.truecaller.wizard.SMS_DELIVERY".equals(str3)) {
            s1Var.getClass();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "intent");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "intent");
            byte[] byteArrayExtra = intent.getByteArrayExtra("pdu");
            java.lang.String stringExtra = intent.getStringExtra("format");
            if (byteArrayExtra != null) {
                if (stringExtra != null) {
                    createFromPdu = android.telephony.SmsMessage.createFromPdu(byteArrayExtra, stringExtra);
                } else {
                    createFromPdu = android.telephony.SmsMessage.createFromPdu(byteArrayExtra);
                }
                if (createFromPdu != null) {
                    num3 = java.lang.Integer.valueOf(createFromPdu.getStatus());
                }
            }
            if (num3 != null) {
                int intValue = num3.intValue();
                f43.baz bazVar = s1Var.n;
                java.lang.String valueOf = java.lang.String.valueOf(intValue);
                java.lang.String str4 = s1Var.N;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(valueOf, "status");
                ((nc0.bar) bazVar.b).d(new n93.e("Delivered", valueOf, (java.lang.String) bazVar.f, (com.truecaller.wizard.WizardVerificationMode) bazVar.c, str4, str, num));
            }
        }
    }
}
