package com.truecaller.settings.impl.ui.premium;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/truecaller/settings/impl/ui/premium/PremiumSettingsFragment;", "Landroidx/fragment/app/Fragment;", "Lpe2/j;", "<init>", "()V", "impl_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class PremiumSettingsFragment extends androidx.fragment.app.Fragment implements pe2.j, bd3.qux {
    public yc3.h c;
    public volatile yc3.d e;
    public rs2.bar h;
    public ms2.s i;
    public ag0.qux j;
    public final g.baz k;
    public final androidx.lifecycle.o1 l;
    public ns2.a m;
    public boolean d = false;
    public final java.lang.Object f = new java.lang.Object();
    public boolean g = false;

    public PremiumSettingsFragment() {
        g.baz registerForActivityResult = registerForActivityResult(new androidx.fragment.app.a1(11), new jc3.bar(this, 26));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(registerForActivityResult, "registerForActivityResult(...)");
        this.k = registerForActivityResult;
        kotlin.Lazy lazy = kotlin.LazyKt.lazy(kotlin.k.c, new k91.d(new k91.d(this, 16), 17));
        this.l = new androidx.lifecycle.o1(kotlin.jvm.internal.k0.a.getOrCreateKotlinClass(ms2.a0.class), new iq1.c(lazy, 28), new iq1.d(26, this, lazy), new iq1.c(lazy, 29));
    }

    public final void B2(com.truecaller.premium.ui.embedded.EmbeddedPurchaseViewStateListener.EmbeddedPurchaseViewState embeddedPurchaseViewState) {
        java.lang.Object value;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(embeddedPurchaseViewState, "state");
        ms2.a0 S4 = S4();
        fc.baz bazVar = S4.c;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(embeddedPurchaseViewState, "state");
        switch (ms2.w.b[embeddedPurchaseViewState.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                bazVar.a = true;
                ig3.h2 h2Var = (ig3.h2) bazVar.g;
                do {
                    value = h2Var.getValue();
                } while (!h2Var.n(value, ms2.t.a((ms2.t) value, false, 126975)));
                ms2.a0.r(S4, 3);
                return;
            case 9:
            case 10:
                S4.o = false;
                bazVar.a = false;
                ms2.a0.r(S4, 3);
                return;
            case 11:
                S4.o = true;
                ms2.a0.r(S4, 2);
                return;
            case 12:
                S4.o = false;
                ms2.a0.r(S4, 2);
                fg3.h0.J(androidx.lifecycle.g1.l(S4), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new ms2.v(S4, null, 3), 3);
                return;
            case 13:
                fg3.h0.J(androidx.lifecycle.g1.l(S4), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new ms2.v(S4, null, 4), 3);
                return;
            default:
                bazVar.a = false;
                ms2.a0.r(S4, 3);
                return;
        }
    }

    public final ms2.s R4() {
        ms2.s sVar = this.i;
        if (sVar != null) {
            return sVar;
        }
        kotlin.jvm.internal.Intrinsics.n("premiumSettingsNavigator");
        throw null;
    }

    public final ms2.a0 S4() {
        return (ms2.a0) this.l.getValue();
    }

    public final void T4() {
        if (this.c == null) {
            this.c = new yc3.h(super.getContext(), this);
            this.d = cu0.j1.x(super.getContext());
        }
    }

    public final void U4() {
        if (!this.g) {
            this.g = true;
            tx.p pVar = (ms2.f) X3();
            this.h = (rs2.bar) pVar.O.get();
            this.i = (ms2.s) pVar.y4.get();
            this.j = new ag0.qux((nc0.bar) pVar.f.b.a.Y.get(), 8);
        }
    }

    public final void V4() {
        android.content.Context requireContext = requireContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        this.m = new ns2.a(requireContext);
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -1);
        ns2.a aVar = this.m;
        if (aVar != null) {
            aVar.setLayoutParams(layoutParams);
        }
        android.view.View requireView = requireView();
        kotlin.jvm.internal.Intrinsics.e(requireView, "null cannot be cast to non-null type android.widget.FrameLayout");
        ((android.widget.FrameLayout) requireView).addView(this.m);
        W4(true);
    }

    public final void W4(boolean z) {
        ns2.a aVar = this.m;
        if (aVar != null) {
            aVar.a(z);
        }
        ns2.a aVar2 = this.m;
        if (aVar2 != null) {
            gj.m.k0(aVar2, z);
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

    public final void onDestroy() {
        super.onDestroy();
        ((tq2.qux) S4().c.b).b = null;
    }

    public final android.view.LayoutInflater onGetLayoutInflater(android.os.Bundle bundle) {
        android.view.LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new yc3.h(onGetLayoutInflater, this));
    }

    public final void onResume() {
        super.onResume();
        ms2.a0 S4 = S4();
        if (!S4.o) {
            ms2.a0.r(S4, 3);
        }
    }

    public final void onViewCreated(android.view.View view, android.os.Bundle bundle) {
        androidx.appcompat.app.AppCompatActivity appCompatActivity;
        i.baz bazVar;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
        androidx.appcompat.app.AppCompatActivity requireActivity = requireActivity();
        if (requireActivity instanceof androidx.appcompat.app.AppCompatActivity) {
            appCompatActivity = requireActivity;
        } else {
            appCompatActivity = null;
        }
        if (appCompatActivity != null) {
            bazVar = appCompatActivity.getSupportActionBar();
        } else {
            bazVar = null;
        }
        if (bazVar != null) {
            bazVar.B(getString(2132023308));
        }
        V4();
        rs2.bar barVar = this.h;
        if (barVar != null) {
            int i = 1;
            ro0.f.d(barVar, S4().j, new ms2.c(this, i));
            pe0.j.u(this, S4().n, new ms2.e(this, 0));
            pe0.j.s(this, S4().l, new ms2.e(this, i));
            return;
        }
        kotlin.jvm.internal.Intrinsics.n("searchSettingUiHandler");
        throw null;
    }

    public final void onAttach(android.app.Activity activity) {
        super.onAttach(activity);
        yc3.h hVar = this.c;
        fj.a.i(hVar == null || yc3.d.c(hVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new java.lang.Object[0]);
        T4();
        U4();
    }
}
