package com.truecaller.blockinglevel.presentation;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* synthetic */ class qux extends kotlin.jvm.internal.l implements kotlin.jvm.functions.Function0 {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qux(int i, java.lang.Object obj, java.lang.Class cls, java.lang.String str, java.lang.String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.b = i3;
    }

    public final java.lang.Object invoke() {
        java.lang.Object value;
        java.lang.Object value2;
        java.lang.Object value3;
        android.widget.FrameLayout frameLayout;
        switch (this.b) {
            case 0:
                ((com.truecaller.blockinglevel.presentation.f0) ((kotlin.jvm.internal.b) this).receiver).u();
                return kotlin.Unit.a;
            case 1:
                ((com.truecaller.blockinglevel.presentation.f0) ((kotlin.jvm.internal.b) this).receiver).u();
                return kotlin.Unit.a;
            case 2:
                ((com.truecaller.blockinglevel.presentation.f0) ((kotlin.jvm.internal.b) this).receiver).u();
                return kotlin.Unit.a;
            case 3:
                ((com.truecaller.blockinglevel.presentation.f0) ((kotlin.jvm.internal.b) this).receiver).u();
                return kotlin.Unit.a;
            case 4:
                ((com.truecaller.call_assistant.presentation.disable.AssistantDisableActivity) ((kotlin.jvm.internal.b) this).receiver).finish();
                return kotlin.Unit.a;
            case 5:
                com.truecaller.call_assistant.presentation.disable.g gVar = (com.truecaller.call_assistant.presentation.disable.g) ((kotlin.jvm.internal.b) this).receiver;
                gVar.getClass();
                fg3.h0.J(androidx.lifecycle.g1.l(gVar), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new com.truecaller.call_assistant.presentation.disable.c(gVar, null, 0), 3);
                return kotlin.Unit.a;
            case 6:
                ((com.truecaller.call_assistant.presentation.onboarding.AssistantOnboardingActivity) ((kotlin.jvm.internal.b) this).receiver).finish();
                return kotlin.Unit.a;
            case 7:
                com.truecaller.call_assistant.presentation.onboarding.h hVar = (com.truecaller.call_assistant.presentation.onboarding.h) ((kotlin.jvm.internal.b) this).receiver;
                hVar.getClass();
                fg3.h0.J(androidx.lifecycle.g1.l(hVar), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new com.truecaller.call_assistant.presentation.disable.c(hVar, null, 1), 3);
                return kotlin.Unit.a;
            case 8:
                ((com.truecaller.familyprotect.presentation.FamilyGroupMainActivity) ((kotlin.jvm.internal.b) this).receiver).finish();
                return kotlin.Unit.a;
            case 9:
                com.truecaller.familyprotect.presentation.FamilyGroupMainActivity familyGroupMainActivity = (com.truecaller.familyprotect.presentation.FamilyGroupMainActivity) ((kotlin.jvm.internal.b) this).receiver;
                uq2.baz bazVar = familyGroupMainActivity.d0;
                if (bazVar != null) {
                    k9.d.E(bazVar, familyGroupMainActivity, new com.truecaller.settings.api.SettingsLaunchConfig((java.lang.String) null, (java.lang.String) null, "familyProtect", false, true, false, 35, (kotlin.jvm.internal.DefaultConstructorMarker) null), com.truecaller.settings.api.SettingsCategory.SETTINGS_FAMILY_PROTECT);
                    return kotlin.Unit.a;
                }
                kotlin.jvm.internal.Intrinsics.n("settingsRouter");
                throw null;
            case 10:
                com.truecaller.familyprotect.presentation.FamilyGroupMainActivity familyGroupMainActivity2 = (com.truecaller.familyprotect.presentation.FamilyGroupMainActivity) ((kotlin.jvm.internal.b) this).receiver;
                i82.u uVar = familyGroupMainActivity2.i0;
                if (uVar != null) {
                    uVar.d(familyGroupMainActivity2, i82.r.F9);
                    return kotlin.Unit.a;
                }
                kotlin.jvm.internal.Intrinsics.n("premiumScreenNavigator");
                throw null;
            case 11:
                ((com.truecaller.voicemail.presentation.deactivate.VoicemailDeactivateActivity) ((kotlin.jvm.internal.b) this).receiver).finish();
                return kotlin.Unit.a;
            case 12:
                com.truecaller.voicemail.presentation.deactivate.h hVar2 = (com.truecaller.voicemail.presentation.deactivate.h) ((kotlin.jvm.internal.b) this).receiver;
                ig3.h2 h2Var = hVar2.e;
                do {
                    value = h2Var.getValue();
                } while (!h2Var.n(value, com.truecaller.voicemail.presentation.deactivate.c.a((com.truecaller.voicemail.presentation.deactivate.c) value, (java.lang.String) null, com.truecaller.voicemail.presentation.deactivate.DeactivationState.CALLING, false, false, 239)));
                m03.r.t(hVar2, new bf2.qux(hVar2, (df3.bar) null, 3));
                return kotlin.Unit.a;
            case 13:
                ig3.h2 h2Var2 = ((com.truecaller.voicemail.presentation.deactivate.h) ((kotlin.jvm.internal.b) this).receiver).e;
                do {
                    value2 = h2Var2.getValue();
                } while (!h2Var2.n(value2, com.truecaller.voicemail.presentation.deactivate.c.a((com.truecaller.voicemail.presentation.deactivate.c) value2, (java.lang.String) null, com.truecaller.voicemail.presentation.deactivate.DeactivationState.SUCCESS, false, false, 175)));
                return kotlin.Unit.a;
            case 14:
                ig3.h2 h2Var3 = ((com.truecaller.voicemail.presentation.deactivate.h) ((kotlin.jvm.internal.b) this).receiver).e;
                do {
                    value3 = h2Var3.getValue();
                } while (!h2Var3.n(value3, com.truecaller.voicemail.presentation.deactivate.c.a((com.truecaller.voicemail.presentation.deactivate.c) value3, (java.lang.String) null, com.truecaller.voicemail.presentation.deactivate.DeactivationState.IDLE, false, false, 175)));
                return kotlin.Unit.a;
            case 15:
                ((gd0.d) ((gd0.c) ((com.truecaller.wizard.verification.s1) ((kotlin.jvm.internal.b) this).receiver).n.e)).b("onDropCallAnimationClicked");
                return kotlin.Unit.a;
            case 16:
                ((com.truecaller.wizard.verification.s1) ((kotlin.jvm.internal.b) this).receiver).p2();
                return kotlin.Unit.a;
            case 17:
                ((com.truecaller.wizard.verification.s1) ((kotlin.jvm.internal.b) this).receiver).n2();
                return kotlin.Unit.a;
            case 18:
                com.truecaller.wizard.verification.s1 s1Var = (com.truecaller.wizard.verification.s1) ((kotlin.jvm.internal.b) this).receiver;
                f43.baz bazVar2 = s1Var.n;
                ((nc0.a) ((nc0.bar) bazVar2.b)).d(new gi0.b((java.lang.String) bazVar2.f, (com.truecaller.wizard.WizardVerificationMode) bazVar2.c, com.truecaller.account.network.TokenResponseDto.METHOD_REVERSE_WHATSAPP));
                ((gd0.d) ((gd0.c) bazVar2.e)).b("onReverseWhatsAppCtaClicked");
                s1Var.C2();
                return kotlin.Unit.a;
            case 19:
                com.truecaller.wizard.verification.s1 s1Var2 = (com.truecaller.wizard.verification.s1) ((kotlin.jvm.internal.b) this).receiver;
                f43.baz bazVar3 = s1Var2.n;
                gd0.c cVar = (gd0.c) bazVar3.e;
                fg3.k2 k2Var = s1Var2.b0;
                if (k2Var != null && k2Var.isActive()) {
                    bazVar3.d0(com.truecaller.startup_dialogs.analytics.StartupDialogEvent.Type.ReverseOtpCountdown, com.truecaller.startup_dialogs.analytics.StartupDialogEvent.Action.ClickedPositive);
                    ((gd0.d) cVar).b("onReverseOtpSendNow");
                } else {
                    ((nc0.a) ((nc0.bar) bazVar3.b)).d(new gi0.b((java.lang.String) bazVar3.f, (com.truecaller.wizard.WizardVerificationMode) bazVar3.c, com.truecaller.account.network.TokenResponseDto.METHOD_REVERSE_OTP));
                    ((gd0.d) cVar).b("onReverseOtpCtaClicked");
                }
                fg3.k2 k2Var2 = s1Var2.b0;
                if (k2Var2 != null) {
                    k2Var2.cancel((java.util.concurrent.CancellationException) null);
                }
                lf2.r.m(s1Var2.J, (kotlin.coroutines.CoroutineContext) null, new com.truecaller.wizard.verification.x0(s1Var2, 4), new com.truecaller.wizard.verification.e1(s1Var2, (df3.bar) null, 2), (com.truecaller.wizard.verification.g0) null, 9);
                return kotlin.Unit.a;
            case 20:
                com.truecaller.wizard.verification.s1 s1Var3 = (com.truecaller.wizard.verification.s1) ((kotlin.jvm.internal.b) this).receiver;
                f43.baz bazVar4 = s1Var3.n;
                fg3.k2 k2Var3 = s1Var3.b0;
                if (k2Var3 != null) {
                    k2Var3.cancel((java.util.concurrent.CancellationException) null);
                }
                ((gd0.d) ((gd0.c) bazVar4.e)).b("onReverseOtpCancelAutoSend");
                bazVar4.d0(com.truecaller.startup_dialogs.analytics.StartupDialogEvent.Type.ReverseOtpCountdown, com.truecaller.startup_dialogs.analytics.StartupDialogEvent.Action.ClickedNegative);
                return kotlin.Unit.a;
            case 21:
                ((com.truecaller.wizard.verification.s1) ((kotlin.jvm.internal.b) this).receiver).q2();
                return kotlin.Unit.a;
            case 22:
                ((com.truecaller.wizard.verification.s1) ((kotlin.jvm.internal.b) this).receiver).v2();
                return kotlin.Unit.a;
            case 23:
                com.truecaller.wizard.verification.s1 s1Var4 = (com.truecaller.wizard.verification.s1) ((kotlin.jvm.internal.b) this).receiver;
                s1Var4.n.d0(com.truecaller.startup_dialogs.analytics.StartupDialogEvent.Type.ReverseWhatsAppMessageNotSent, com.truecaller.startup_dialogs.analytics.StartupDialogEvent.Action.ClickedPositive);
                s1Var4.C2();
                return kotlin.Unit.a;
            case 24:
                ct0.l lVar = (ct0.l) ((kotlin.jvm.internal.b) this).receiver;
                lVar.getClass();
                fg3.h0.J(androidx.lifecycle.g1.l(lVar), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new ct0.j(lVar, null, 0), 3);
                return kotlin.Unit.a;
            case 25:
                ((d.h0) ((kotlin.jvm.internal.b) this).receiver).f();
                return kotlin.Unit.a;
            case 26:
                ((d.h0) ((kotlin.jvm.internal.b) this).receiver).f();
                return kotlin.Unit.a;
            case 27:
                ((com.truecaller.voicemail.presentation.onboarding.ui.VoicemailOnboardingActivity) ((kotlin.jvm.internal.b) this).receiver).finish();
                return kotlin.Unit.a;
            case y90.i1.DECISIONCONTEXT_FIELD_NUMBER /* 28 */:
                return ((android.content.Context) ((kotlin.jvm.internal.b) this).receiver).getAssets();
            default:
                wh.g gVar2 = ((dh.b) ((kotlin.jvm.internal.b) this).receiver).g;
                if (gVar2 != null && (frameLayout = gVar2.i) != null) {
                    frameLayout.setVisibility(0);
                }
                return kotlin.Unit.a;
        }
    }
}
