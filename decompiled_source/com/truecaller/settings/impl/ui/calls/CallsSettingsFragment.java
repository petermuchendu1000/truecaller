package com.truecaller.settings.impl.ui.calls;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/settings/impl/ui/calls/CallsSettingsFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "impl_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class CallsSettingsFragment extends androidx.fragment.app.Fragment implements bd3.qux {
    public final kotlin.Lazy A;
    public final kotlin.Lazy B;
    public final kotlin.Lazy C;
    public final kotlin.Lazy D;
    public final kotlin.Lazy E;
    public final kotlin.Lazy F;
    public final kotlin.Lazy G;
    public final kotlin.Lazy H;
    public yc3.h c;
    public volatile yc3.d e;
    public final androidx.lifecycle.o1 h;
    public wi.qux i;
    public rs2.bar j;
    public ut0.a k;
    public i82.t l;
    public qb2.u m;
    public final kotlin.Lazy n;
    public final kotlin.Lazy o;
    public final kotlin.Lazy p;
    public final kotlin.Lazy q;
    public final kotlin.Lazy r;
    public final kotlin.Lazy s;
    public final kotlin.Lazy t;
    public final kotlin.Lazy u;
    public final kotlin.Lazy v;
    public final kotlin.Lazy w;
    public final kotlin.Lazy x;
    public final kotlin.Lazy y;
    public final kotlin.Lazy z;
    public boolean d = false;
    public final java.lang.Object f = new java.lang.Object();
    public boolean g = false;

    public CallsSettingsFragment() {
        kotlin.Lazy lazy = kotlin.LazyKt.lazy(kotlin.k.c, new rq0.a(new rq0.a(this, 9), 10));
        this.h = new androidx.lifecycle.o1(kotlin.jvm.internal.k0.a.getOrCreateKotlinClass(sr2.u0.class), new qs2.d(lazy, 14), new nu2.a(28, this, lazy), new qs2.d(lazy, 15));
        this.n = o82.a.q(this, com.truecaller.settings.impl.ui.calls.CallsSettings$CallerIdOptions$Appearance.a);
        this.o = o82.a.q(this, com.truecaller.settings.impl.ui.calls.CallsSettings$CallerIdOptions$ShowForPhonebookContacts.a);
        this.p = o82.a.q(this, com.truecaller.settings.impl.ui.calls.CallsSettings$AcsOptions$HideAcsForPbContacts.a);
        this.q = o82.a.q(this, com.truecaller.settings.impl.ui.calls.CallsSettings$AcsOptions$HideAcsForNonPbContacts.a);
        this.r = o82.a.q(this, com.truecaller.settings.impl.ui.calls.CallsSettings$CallIdentificationOptions$IdentifyCalls.a);
        this.s = o82.a.q(this, com.truecaller.settings.impl.ui.calls.CallsSettings$SimManagementOptions$DefaultSim.a);
        this.t = o82.a.q(this, com.truecaller.settings.impl.ui.calls.CallsSettings$CallHistoryOptions$CallMethod.a);
        this.u = o82.a.q(this, com.truecaller.settings.impl.ui.calls.CallsSettings$CallHistoryOptions$GroupCalls.a);
        this.v = o82.a.q(this, com.truecaller.settings.impl.ui.calls.CallsSettings$CallHistoryOptions$FrequentlyCalled.a);
        this.w = o82.a.q(this, com.truecaller.settings.impl.ui.calls.CallsSettings$CallHistoryOptions$ShowOtherCalls.a);
        this.x = o82.a.q(this, com.truecaller.settings.impl.ui.calls.CallsSettings$PhoneCallsOptions$AnnounceCalls.a);
        this.y = o82.a.q(this, com.truecaller.settings.impl.ui.calls.CallsSettings$PhoneCallsOptions$DeclineMessage.a);
        this.z = o82.a.q(this, com.truecaller.settings.impl.ui.calls.CallsSettings$DialPadOptions$Feedback.a);
        this.A = o82.a.q(this, com.truecaller.settings.impl.ui.calls.CallsSettings$DialPadOptions$SpeedDial.a);
        this.B = o82.a.q(this, com.truecaller.settings.impl.ui.calls.CallsSettings$DialAssistOptions$DialAssist.a);
        this.C = o82.a.q(this, com.truecaller.settings.impl.ui.calls.CallsSettings$NotificationOptions$CallAlert.a);
        this.D = o82.a.q(this, com.truecaller.settings.impl.ui.calls.CallsSettings$NotificationOptions$MissedCall.a);
        this.E = o82.a.q(this, com.truecaller.settings.impl.ui.calls.CallsSettings$NotificationOptions$RemindMissedCalls.a);
        this.F = o82.a.q(this, com.truecaller.settings.impl.ui.calls.CallsSettings$NotificationOptions$VBMissedCall.a);
        this.G = o82.a.q(this, com.truecaller.settings.impl.ui.calls.CallsSettings$CallRecordingOptions$TranscriptionAndSummary.a);
        this.H = o82.a.q(this, com.truecaller.settings.impl.ui.calls.CallsSettings$AiCallScannerOptions$ShowScannerButton.a);
    }

    public final wi.qux R4() {
        wi.qux quxVar = this.i;
        if (quxVar != null) {
            return quxVar;
        }
        kotlin.jvm.internal.Intrinsics.n("callingSettingsHelper");
        throw null;
    }

    public final sr2.u0 S4() {
        return (sr2.u0) this.h.getValue();
    }

    public final void T4() {
        if (this.c == null) {
            this.c = new yc3.h(super.getContext(), this);
            this.d = cu0.j1.x(super.getContext());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x00e1, code lost:
    
        throw new java.lang.IllegalStateException(k9.d.q("Context does not implement ", kotlin.jvm.internal.k0.a.getOrCreateKotlinClass(androidx.appcompat.app.AppCompatActivity.class).getQualifiedName()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x008a, code lost:
    
        ((androidx.appcompat.app.AppCompatActivity) r3).getLifecycle().a(new iy2.baz(r2, 0));
        r9.i = r2;
        r9.j = (rs2.bar) r0.O.get();
        r0 = r0.f;
        r9.k = new ut0.a(r0.b.W(), 0);
        r9.l = (i82.t) r0.bc.get();
        r9.m = (qb2.u) r0.zi.get();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00c9, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0074, code lost:
    
        if ((r3 instanceof androidx.appcompat.app.AppCompatActivity) != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0079, code lost:
    
        if ((r3 instanceof android.content.ContextWrapper) == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x007b, code lost:
    
        r3 = ((android.content.ContextWrapper) r3).getBaseContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, "getBaseContext(...)");
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0088, code lost:
    
        if ((r3 instanceof androidx.appcompat.app.AppCompatActivity) == false) goto L18;
     */
    /* JADX WARN: Type inference failed for: r2v0, types: [wi.qux, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void U4() {
        if (!this.g) {
            this.g = true;
            tx.p pVar = (sr2.u) X3();
            tx.e eVar = pVar.h;
            android.content.Context context = (android.content.Context) eVar.i.a;
            tx.w wVar = eVar.f;
            u62.b bVar = (u62.b) wVar.Vb.get();
            uq2.baz bazVar = (uq2.baz) wVar.Xb.get();
            yd0.a aVar = (yd0.a) wVar.Fq.get();
            tx.c0 c0Var = wVar.b;
            yd0.qux quxVar = (yd0.qux) c0Var.C3.get();
            op1.e eVar2 = (op1.e) c0Var.r4.get();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bVar, "notificationAccessRequester");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bazVar, "settingsRouter");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(aVar, "announceCallerIdManager");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(quxVar, "announceCallerId");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eVar2, "ghostCallManager");
            ?? obj = new java.lang.Object();
            ((wi.qux) obj).a = context;
            ((wi.qux) obj).b = bVar;
            ((wi.qux) obj).c = bazVar;
            ((wi.qux) obj).d = aVar;
            ((wi.qux) obj).e = quxVar;
            ((wi.qux) obj).f = eVar2;
        }
    }

    @Override // bd3.baz
    public final java.lang.Object X3() {
        if (this.e == null) {
            synchronized (this.f) {
                try {
                    if (this.e == null) {
                        this.e = new yc3.d(this);
                    }
                } finally {
                }
            }
        }
        return this.e.X3();
    }

    public final android.content.Context getContext() {
        if (super.getContext() == null && !this.d) {
            return null;
        }
        T4();
        return this.c;
    }

    public final androidx.lifecycle.q1 getDefaultViewModelProviderFactory() {
        return bf0.s2.J(this, super.getDefaultViewModelProviderFactory());
    }

    public final void onAttach(android.content.Context context) {
        super.onAttach(context);
        T4();
        U4();
    }

    public final android.view.View onCreateView(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        return new android.widget.FrameLayout(requireContext());
    }

    public final android.view.LayoutInflater onGetLayoutInflater(android.os.Bundle bundle) {
        android.view.LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new yc3.h(onGetLayoutInflater, this));
    }

    public final void onResume() {
        super.onResume();
        sr2.u0 S4 = S4();
        S4.getClass();
        fg3.h0.J(androidx.lifecycle.g1.l(S4), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new sr2.r0(S4, null, 0), 3);
        sr2.u0 S42 = S4();
        S42.getClass();
        fg3.h0.J(androidx.lifecycle.g1.l(S42), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new sr2.q0(S42, null, 0), 3);
    }

    public final void onViewCreated(android.view.View view, android.os.Bundle bundle) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        androidx.appcompat.app.AppCompatActivity requireActivity = requireActivity();
        kotlin.jvm.internal.Intrinsics.e(requireActivity, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        i.baz supportActionBar = requireActivity.getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.B(getString(2132023197));
            rs2.bar barVar = this.j;
            if (barVar != null) {
                ro0.f.d(barVar, S4().n, new sr2.o(this, 0));
                pe0.j.u(this, S4().p, new sr2.s(this, 1));
                return;
            } else {
                kotlin.jvm.internal.Intrinsics.n("searchSettingUiHandler");
                throw null;
            }
        }
        throw new java.lang.IllegalArgumentException("Required value was null.");
    }

    public final void onAttach(android.app.Activity activity) {
        super.onAttach(activity);
        yc3.h hVar = this.c;
        fj.a.i(hVar == null || yc3.d.c(hVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new java.lang.Object[0]);
        T4();
        U4();
    }
}
