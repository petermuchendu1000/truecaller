package com.truecaller.wizard.verification.otp.whatsapp;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class WhatsAppOtpErrorReceiver extends android.content.BroadcastReceiver {
    public volatile boolean a = false;
    public final java.lang.Object b = new java.lang.Object();
    public com.truecaller.wizard.verification.otp.whatsapp.qux c;

    public final void a(android.content.Context context, android.content.Intent intent) {
        com.truecaller.analytics.technical.AppStartTracker.onBroadcastReceive(this, context, intent);
        if (!this.a) {
            synchronized (this.b) {
                try {
                    if (!this.a) {
                        this.c = (com.truecaller.wizard.verification.otp.whatsapp.qux) ((com.truecaller.wizard.verification.otp.whatsapp.baz) o40.bar.k(context)).H.b.b5.get();
                        this.a = true;
                    }
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        com.truecaller.analytics.technical.AppStartTracker.onBroadcastReceive(this, context, intent);
        a(context, intent);
        if (intent != null) {
            com.truecaller.wizard.verification.otp.whatsapp.qux quxVar = this.c;
            android.content.Intent intent2 = null;
            if (quxVar != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "intent");
                if (quxVar.a(intent)) {
                    intent2 = intent;
                }
                if (intent2 != null) {
                    final java.lang.String stringExtra = intent.getStringExtra(com.truecaller.suspension.data.UnSuspendAccountSuccessResponseDto.REASON_ERROR);
                    final java.lang.String stringExtra2 = intent.getStringExtra("error_message");
                    com.truecaller.log.AssertionUtil.reportThrowableButNeverCrash(new java.lang.Throwable(stringExtra, stringExtra2) { // from class: com.truecaller.wizard.verification.otp.whatsapp.WhatsAppOtpHelperImpl$WhatsAppOtpAutofillError
                        {
                            super(h8.s0.q(stringExtra, ":", stringExtra2));
                        }
                    });
                    return;
                }
                return;
            }
            kotlin.jvm.internal.Intrinsics.n("otpHelper");
            throw null;
        }
    }
}
