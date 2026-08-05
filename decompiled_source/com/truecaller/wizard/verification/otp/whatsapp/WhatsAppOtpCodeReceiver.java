package com.truecaller.wizard.verification.otp.whatsapp;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class WhatsAppOtpCodeReceiver extends android.content.BroadcastReceiver {
    public volatile boolean a = false;
    public final java.lang.Object b = new java.lang.Object();
    public com.truecaller.wizard.verification.otp.whatsapp.qux c;

    public final void a(android.content.Context context, android.content.Intent intent) {
        com.truecaller.analytics.technical.AppStartTracker.onBroadcastReceive(this, context, intent);
        if (!this.a) {
            synchronized (this.b) {
                try {
                    if (!this.a) {
                        this.c = (com.truecaller.wizard.verification.otp.whatsapp.qux) ((com.truecaller.wizard.verification.otp.whatsapp.bar) o40.bar.k(context)).H.b.b5.get();
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
            if (quxVar != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "intent");
                quxVar.a(intent);
                java.lang.String stringExtra = intent.getStringExtra("code");
                if (stringExtra != null) {
                    com.truecaller.wizard.verification.otp.whatsapp.qux quxVar2 = this.c;
                    if (quxVar2 != null) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stringExtra, "otp");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("WhatsAppZeroTap", com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_AD_TYPE);
                        pv0.b bVar = quxVar2.d;
                        if (bVar != null) {
                            bVar.invoke(stringExtra, "WhatsAppZeroTap");
                            return;
                        }
                        return;
                    }
                    kotlin.jvm.internal.Intrinsics.n("whatsAppOtpHelper");
                    throw null;
                }
                return;
            }
            kotlin.jvm.internal.Intrinsics.n("whatsAppOtpHelper");
            throw null;
        }
    }
}
