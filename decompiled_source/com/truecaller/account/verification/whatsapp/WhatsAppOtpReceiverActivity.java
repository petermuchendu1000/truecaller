package com.truecaller.account.verification.whatsapp;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/account/verification/whatsapp/WhatsAppOtpReceiverActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class WhatsAppOtpReceiverActivity extends com.truecaller.account.verification.whatsapp.Hilt_WhatsAppOtpReceiverActivity {
    public com.truecaller.wizard.verification.otp.whatsapp.qux d0;
    public cd3.bar e0;
    public q83.qux f0;
    public q83.a g0;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.account.verification.whatsapp.Hilt_WhatsAppOtpReceiverActivity
    public final void onCreate(android.os.Bundle bundle) {
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        super.onCreate(bundle);
        com.truecaller.wizard.verification.otp.whatsapp.qux quxVar = this.d0;
        if (quxVar != null) {
            android.content.Intent intent = getIntent();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "intent");
            quxVar.a(intent);
            java.lang.String stringExtra = intent.getStringExtra("code");
            if (stringExtra == null) {
                return;
            }
            com.truecaller.wizard.verification.otp.whatsapp.qux quxVar2 = this.d0;
            if (quxVar2 != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stringExtra, "otp");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter("WhatsAppAutofill", com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.TYPE_COLUMN);
                pv0.b bVar = quxVar2.d;
                if (bVar != null) {
                    bVar.invoke(stringExtra, "WhatsAppAutofill");
                } else {
                    cd3.bar barVar = this.e0;
                    if (barVar != null) {
                        if (!((n11.l) barVar.get()).j()) {
                            q83.qux quxVar3 = this.f0;
                            if (quxVar3 != null) {
                                if (!quxVar3.b()) {
                                    if (this.g0 != null) {
                                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this, "activity");
                                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stringExtra, "otp");
                                        android.os.Bundle bundle2 = new android.os.Bundle();
                                        bundle2.putString("com.truecaller.wizard.WHATSAPP_OTP", stringExtra);
                                        com.truecaller.wizard.api.WizardStartContext wizardStartContext = com.truecaller.wizard.api.WizardStartContext.WHATSAPP_AUTOFILL;
                                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("WizardActivity", "getSimpleName(...)");
                                        w91.a.a(new java.lang.Object[]{"WizardActivity start. Class ", "WizardActivity"});
                                        android.content.Intent intent2 = new android.content.Intent((android.content.Context) this, (java.lang.Class<?>) com.truecaller.wizard.WizardActivity.class);
                                        intent2.putExtra("extraStartContext", wizardStartContext.getValue());
                                        intent2.putExtras(bundle2);
                                        intent2.addFlags(65536);
                                        intent2.addFlags(67108864);
                                        startActivity(intent2);
                                    } else {
                                        kotlin.jvm.internal.Intrinsics.n("wizardLauncher");
                                        throw null;
                                    }
                                }
                            } else {
                                kotlin.jvm.internal.Intrinsics.n("wizard");
                                throw null;
                            }
                        }
                        y90.m6.Q(this, com.truecaller.bottombar.BottomBarButtonType.CALLS, "whatsAppAutofill", 8);
                    } else {
                        kotlin.jvm.internal.Intrinsics.n("accountManager");
                        throw null;
                    }
                }
                finish();
                return;
            }
            kotlin.jvm.internal.Intrinsics.n("whatsAppOtpHelper");
            throw null;
        }
        kotlin.jvm.internal.Intrinsics.n("whatsAppOtpHelper");
        throw null;
    }
}
