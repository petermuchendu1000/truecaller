package com.truecaller.wizard.verification;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t²\u0006\f\u0010\b\u001a\u00020\u00078\nX\u008a\u0084\u0002"}, d2 = {"Lcom/truecaller/wizard/verification/l0;", "Lq83/q;", "Lcom/truecaller/wizard/verification/u1;", "Lq93/b;", "Lcom/truecaller/wizard/verification/v;", "<init>", "()V", "Lcom/truecaller/wizard/verification/v1;", "uiState", "domain_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class l0 extends com.truecaller.wizard.verification.d implements com.truecaller.wizard.verification.u1, q93.b, com.truecaller.wizard.verification.v {
    public com.truecaller.wizard.verification.otp.sms.ReverseOtpDialog n;
    public com.truecaller.wizard.verification.s1 o;
    public qo1.i p;
    public final kotlin.Lazy q;
    public final kotlin.Lazy r;

    public l0() {
        super(0);
        final int i = 0;
        this.q = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0(this) { // from class: com.truecaller.wizard.verification.i0
            public final /* synthetic */ com.truecaller.wizard.verification.l0 b;

            {
                this.b = this;
            }

            public final java.lang.Object invoke() {
                switch (i) {
                    case 0:
                        qo1.i iVar = this.b.p;
                        if (iVar != null) {
                            return java.lang.Boolean.valueOf(iVar.a.a("composeVerificationMessage_64656", com.truecaller.featuretoggles.FeatureState.ENABLED_ALPHA_DEBUG));
                        }
                        kotlin.jvm.internal.Intrinsics.n("identityFeaturesInventory");
                        throw null;
                    case 1:
                        return new com.truecaller.wizard.verification.q(this.b.d5());
                    default:
                        this.b.d5().q2();
                        return kotlin.Unit.a;
                }
            }
        });
        final int i2 = 1;
        this.r = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0(this) { // from class: com.truecaller.wizard.verification.i0
            public final /* synthetic */ com.truecaller.wizard.verification.l0 b;

            {
                this.b = this;
            }

            public final java.lang.Object invoke() {
                switch (i2) {
                    case 0:
                        qo1.i iVar = this.b.p;
                        if (iVar != null) {
                            return java.lang.Boolean.valueOf(iVar.a.a("composeVerificationMessage_64656", com.truecaller.featuretoggles.FeatureState.ENABLED_ALPHA_DEBUG));
                        }
                        kotlin.jvm.internal.Intrinsics.n("identityFeaturesInventory");
                        throw null;
                    case 1:
                        return new com.truecaller.wizard.verification.q(this.b.d5());
                    default:
                        this.b.d5().q2();
                        return kotlin.Unit.a;
                }
            }
        });
    }

    public final com.truecaller.wizard.verification.s1 d5() {
        com.truecaller.wizard.verification.s1 s1Var = this.o;
        if (s1Var != null) {
            return s1Var;
        }
        kotlin.jvm.internal.Intrinsics.n("presenter");
        throw null;
    }

    public final void e5(com.truecaller.wizard.verification.otp.sms.ReverseOtpDialog.State state) {
        if (isStateSaved()) {
            return;
        }
        com.truecaller.wizard.verification.otp.sms.ReverseOtpDialog reverseOtpDialog = this.n;
        if (reverseOtpDialog != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "state");
            reverseOtpDialog.c = state;
            reverseOtpDialog.S4();
        } else {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "state");
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("state", state);
            com.truecaller.wizard.verification.otp.sms.ReverseOtpDialog reverseOtpDialog2 = new com.truecaller.wizard.verification.otp.sms.ReverseOtpDialog();
            reverseOtpDialog2.setArguments(bundle);
            this.n = reverseOtpDialog2;
            reverseOtpDialog2.show(getChildFragmentManager(), (java.lang.String) null);
        }
        d5().v2();
    }

    @Override // q83.q
    public final void l(int i) {
        android.widget.Toast.makeText(getContext(), i, 1).show();
    }

    public final android.view.View onCreateView(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        return yy.qux.F(layoutInflater, true).inflate(2131561149, viewGroup, false);
    }

    @Override // q83.q
    public final void onDestroyView() {
        android.view.View view = getView();
        if (view != null) {
            gj.m.v0(view, 2, false);
        }
        androidx.localbroadcastmanager.content.LocalBroadcastManager.getInstance(requireContext()).unregisterReceiver((com.truecaller.wizard.verification.q) this.r.getValue());
        com.truecaller.wizard.verification.otp.sms.ReverseOtpDialog reverseOtpDialog = this.n;
        if (reverseOtpDialog != null) {
            reverseOtpDialog.dismissAllowingStateLoss();
        }
        d5().m1();
        super.onDestroyView();
    }

    public final void onStart() {
        super.onStart();
        com.truecaller.wizard.verification.s1 d5 = d5();
        lf2.r.m(d5.J, (kotlin.coroutines.CoroutineContext) null, new com.truecaller.wizard.verification.x0(d5, 3), new com.truecaller.wizard.verification.e1(d5, (df3.bar) null, 1), (com.truecaller.wizard.verification.g0) null, 9);
    }

    public final void onViewCreated(android.view.View view, android.os.Bundle bundle) {
        d.h0 onBackPressedDispatcher;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        android.view.View findViewById = view.findViewById(2131366178);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        ak.r0.i(findViewById, com.truecaller.common.ui.insets.InsetType.SystemBars);
        androidx.fragment.app.FragmentActivity activity = getActivity();
        if (activity != null && (onBackPressedDispatcher = activity.getOnBackPressedDispatcher()) != null) {
            ge0.i.m(onBackPressedDispatcher, this, new com.truecaller.wizard.verification.g0(this, 0), 2);
        }
        android.content.IntentFilter intentFilter = new android.content.IntentFilter();
        intentFilter.addAction("com.truecaller.wizard.SEND_SMS");
        intentFilter.addAction("com.truecaller.wizard.SMS_DELIVERY");
        androidx.localbroadcastmanager.content.LocalBroadcastManager.getInstance(requireContext()).registerReceiver((com.truecaller.wizard.verification.q) this.r.getValue(), intentFilter);
        d5().u0(this);
        androidx.compose.ui.platform.ComposeView findViewById2 = view.findViewById(2131363095);
        findViewById2.setKeepScreenOn(true);
        findViewById2.setViewCompositionStrategy(k4.r1.e);
        findViewById2.setContent(new d3.qux(-1920202637, new kotlin.jvm.functions.Function2() { // from class: com.truecaller.wizard.verification.h0
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                boolean z;
                com.truecaller.wizard.verification.f0 f0Var;
                v2.n nVar = (v2.n) obj;
                int intValue = ((java.lang.Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (nVar.P(intValue & 1, z)) {
                    com.truecaller.wizard.verification.l0 l0Var = com.truecaller.wizard.verification.l0.this;
                    v2.t0 r = mf0.o.r(l0Var.d5().h0, nVar, 0, 7);
                    com.truecaller.wizard.verification.s sVar = ((com.truecaller.wizard.verification.v1) r.getValue()).a;
                    if (((java.lang.Boolean) l0Var.q.getValue()).booleanValue()) {
                        f0Var = ((com.truecaller.wizard.verification.v1) r.getValue()).b;
                    } else {
                        f0Var = null;
                    }
                    com.truecaller.wizard.verification.s1 d5 = l0Var.d5();
                    boolean h = nVar.h(d5);
                    java.lang.Object M = nVar.M();
                    v2.c cVar = v2.k.a;
                    if (h || M == cVar) {
                        com.truecaller.blockinglevel.presentation.qux quxVar = new com.truecaller.blockinglevel.presentation.qux(0, d5, com.truecaller.wizard.verification.s1.class, "onDropCallIconClicked", "onDropCallIconClicked()V", 0, 15);
                        nVar.k0(quxVar);
                        M = quxVar;
                    }
                    kotlin.jvm.functions.Function0 function0 = (kotlin.reflect.KFunction) M;
                    com.truecaller.wizard.verification.s1 d52 = l0Var.d5();
                    boolean h2 = nVar.h(d52);
                    java.lang.Object M2 = nVar.M();
                    if (h2 || M2 == cVar) {
                        com.truecaller.blockinglevel.presentation.qux quxVar2 = new com.truecaller.blockinglevel.presentation.qux(0, d52, com.truecaller.wizard.verification.s1.class, "onOpenWhatsAppButtonClicked", "onOpenWhatsAppButtonClicked()V", 0, 18);
                        nVar.k0(quxVar2);
                        M2 = quxVar2;
                    }
                    kotlin.jvm.functions.Function0 function02 = (kotlin.reflect.KFunction) M2;
                    com.truecaller.wizard.verification.s1 d54 = l0Var.d5();
                    boolean h3 = nVar.h(d54);
                    java.lang.Object M3 = nVar.M();
                    if (h3 || M3 == cVar) {
                        com.truecaller.blockinglevel.presentation.qux quxVar3 = new com.truecaller.blockinglevel.presentation.qux(0, d54, com.truecaller.wizard.verification.s1.class, "onSendSmsButtonClicked", "onSendSmsButtonClicked()V", 0, 19);
                        nVar.k0(quxVar3);
                        M3 = quxVar3;
                    }
                    kotlin.jvm.functions.Function0 function03 = (kotlin.reflect.KFunction) M3;
                    com.truecaller.wizard.verification.s1 d55 = l0Var.d5();
                    boolean h4 = nVar.h(d55);
                    java.lang.Object M4 = nVar.M();
                    if (h4 || M4 == cVar) {
                        com.truecaller.blockinglevel.presentation.qux quxVar4 = new com.truecaller.blockinglevel.presentation.qux(0, d55, com.truecaller.wizard.verification.s1.class, "onCountDownCancelClicked", "onCountDownCancelClicked()V", 0, 20);
                        nVar.k0(quxVar4);
                        M4 = quxVar4;
                    }
                    kotlin.jvm.functions.Function0 function04 = (kotlin.reflect.KFunction) M4;
                    boolean h5 = nVar.h(l0Var);
                    java.lang.Object M5 = nVar.M();
                    if (h5 || M5 == cVar) {
                        M5 = new com.truecaller.wizard.verification.j0(l0Var);
                        nVar.k0(M5);
                    }
                    r83.a aVar = (r83.a) M5;
                    com.truecaller.wizard.verification.s1 d56 = l0Var.d5();
                    boolean h6 = nVar.h(d56);
                    java.lang.Object M6 = nVar.M();
                    if (h6 || M6 == cVar) {
                        com.truecaller.blockinglevel.presentation.qux quxVar5 = new com.truecaller.blockinglevel.presentation.qux(0, d56, com.truecaller.wizard.verification.s1.class, "onDialogDismissed", "onDialogDismissed()V", 0, 21);
                        nVar.k0(quxVar5);
                        M6 = quxVar5;
                    }
                    kotlin.jvm.functions.Function0 function05 = (kotlin.reflect.KFunction) M6;
                    com.truecaller.wizard.verification.s1 d57 = l0Var.d5();
                    boolean h7 = nVar.h(d57);
                    java.lang.Object M7 = nVar.M();
                    if (h7 || M7 == cVar) {
                        com.truecaller.blockinglevel.presentation.qux quxVar6 = new com.truecaller.blockinglevel.presentation.qux(0, d57, com.truecaller.wizard.verification.s1.class, "onReverseOtpDialogShown", "onReverseOtpDialogShown()V", 0, 22);
                        nVar.k0(quxVar6);
                        M7 = quxVar6;
                    }
                    kotlin.jvm.functions.Function0 function06 = (kotlin.reflect.KFunction) M7;
                    com.truecaller.wizard.verification.s1 d58 = l0Var.d5();
                    boolean h8 = nVar.h(d58);
                    java.lang.Object M8 = nVar.M();
                    if (h8 || M8 == cVar) {
                        M8 = new cc2.i0(1, d58, com.truecaller.wizard.verification.s1.class, "onReverseOtpDialogDismissed", "onReverseOtpDialogDismissed(Z)V", 0, 22);
                        nVar.k0(M8);
                    }
                    kotlin.jvm.functions.Function1 function1 = (kotlin.reflect.KFunction) M8;
                    com.truecaller.wizard.verification.s1 d59 = l0Var.d5();
                    boolean h9 = nVar.h(d59);
                    java.lang.Object M9 = nVar.M();
                    if (h9 || M9 == cVar) {
                        M9 = new com.truecaller.blockinglevel.presentation.qux(0, d59, com.truecaller.wizard.verification.s1.class, "onSendWhatsAppMessageClicked", "onSendWhatsAppMessageClicked()V", 0, 23);
                        nVar.k0(M9);
                    }
                    kotlin.jvm.functions.Function0 function07 = (kotlin.reflect.KFunction) M9;
                    com.truecaller.wizard.verification.s1 d510 = l0Var.d5();
                    boolean h10 = nVar.h(d510);
                    java.lang.Object M10 = nVar.M();
                    if (h10 || M10 == cVar) {
                        M10 = new com.truecaller.blockinglevel.presentation.qux(0, d510, com.truecaller.wizard.verification.s1.class, "onContinueWithPhoneNumberHintClicked", "onContinueWithPhoneNumberHintClicked()V", 0, 16);
                        nVar.k0(M10);
                    }
                    kotlin.jvm.functions.Function0 function08 = (kotlin.reflect.KFunction) M10;
                    com.truecaller.wizard.verification.s1 d511 = l0Var.d5();
                    boolean h11 = nVar.h(d511);
                    java.lang.Object M11 = nVar.M();
                    if (h11 || M11 == cVar) {
                        M11 = new com.truecaller.blockinglevel.presentation.qux(0, d511, com.truecaller.wizard.verification.s1.class, "onCancelPhoneNumberHintClicked", "onCancelPhoneNumberHintClicked()V", 0, 17);
                        nVar.k0(M11);
                    }
                    kotlin.jvm.functions.Function0 function09 = (kotlin.reflect.KFunction) M11;
                    com.truecaller.wizard.verification.s1 d512 = l0Var.d5();
                    boolean h12 = nVar.h(d512);
                    java.lang.Object M12 = nVar.M();
                    if (h12 || M12 == cVar) {
                        M12 = new cc2.i0(1, d512, com.truecaller.wizard.verification.s1.class, "onContactSupportPressed", "onContactSupportPressed(Lcom/truecaller/wizard/verification/VerificationMessage;)V", 0, 21);
                        nVar.k0(M12);
                    }
                    s93.bar.o(sVar, f0Var, function0, function03, function04, function02, aVar, function05, function06, function1, function07, function08, function09, (kotlin.reflect.KFunction) M12, nVar, 0);
                } else {
                    nVar.S();
                }
                return kotlin.Unit.a;
            }
        }, true));
        androidx.lifecycle.d0 viewLifecycleOwner = getViewLifecycleOwner();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        fg3.h0.J(androidx.lifecycle.g1.j(viewLifecycleOwner), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new com.truecaller.wizard.verification.k0(this, null, 1), 3);
    }
}
