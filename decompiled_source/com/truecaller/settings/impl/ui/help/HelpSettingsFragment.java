package com.truecaller.settings.impl.ui.help;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/settings/impl/ui/help/HelpSettingsFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "impl_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class HelpSettingsFragment extends androidx.fragment.app.Fragment implements bd3.qux {
    public yc3.h c;
    public volatile yc3.d e;
    public final androidx.lifecycle.o1 h;
    public rs2.bar i;
    public js2.c j;
    public final kotlin.Lazy k;
    public final kotlin.Lazy l;
    public final kotlin.Lazy m;
    public final kotlin.Lazy n;
    public final kotlin.Lazy o;
    public boolean d = false;
    public final java.lang.Object f = new java.lang.Object();
    public boolean g = false;

    public HelpSettingsFragment() {
        kotlin.Lazy lazy = kotlin.LazyKt.lazy(kotlin.k.c, new hv2.baz(new hv2.baz(this, 18), 19));
        this.h = new androidx.lifecycle.o1(kotlin.jvm.internal.k0.a.getOrCreateKotlinClass(js2.d.class), new iq1.c(lazy, 11), new iq1.d(9, this, lazy), new iq1.c(lazy, 12));
        this.k = o82.a.q(this, com.truecaller.settings.impl.ui.help.HelpSettings$Support$ChatWithUs.a);
        this.l = o82.a.q(this, com.truecaller.settings.impl.ui.help.HelpSettings$Support$Faq.a);
        this.m = o82.a.q(this, com.truecaller.settings.impl.ui.help.HelpSettings$Support$SendFeedback.a);
        this.n = o82.a.q(this, com.truecaller.settings.impl.ui.help.HelpSettings$Support$TruetalksCommunity.a);
        this.o = o82.a.q(this, com.truecaller.settings.impl.ui.help.HelpSettings$Rate$RateOnGooglePlay.a);
    }

    public final js2.c R4() {
        js2.c cVar = this.j;
        if (cVar != null) {
            return cVar;
        }
        kotlin.jvm.internal.Intrinsics.n("navigator");
        throw null;
    }

    public final void S4() {
        if (this.c == null) {
            this.c = new yc3.h(super.getContext(), this);
            this.d = cu0.j1.x(super.getContext());
        }
    }

    public final void T4() {
        if (!this.g) {
            this.g = true;
            tx.p pVar = (js2.a) X3();
            this.i = (rs2.bar) pVar.O.get();
            this.j = (js2.c) pVar.w4.get();
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
        S4();
        return this.c;
    }

    public final androidx.lifecycle.q1 getDefaultViewModelProviderFactory() {
        return bf0.s2.J(this, super.getDefaultViewModelProviderFactory());
    }

    public final void onAttach(android.content.Context context) {
        super.onAttach(context);
        S4();
        T4();
    }

    public final android.view.View onCreateView(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        return new android.widget.FrameLayout(requireContext());
    }

    public final android.view.LayoutInflater onGetLayoutInflater(android.os.Bundle bundle) {
        android.view.LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new yc3.h(onGetLayoutInflater, this));
    }

    public final void onViewCreated(android.view.View view, android.os.Bundle bundle) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        androidx.appcompat.app.AppCompatActivity requireActivity = requireActivity();
        kotlin.jvm.internal.Intrinsics.e(requireActivity, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        i.baz supportActionBar = requireActivity.getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.B(getString(2132023229));
            rs2.bar barVar = this.i;
            if (barVar != null) {
                androidx.lifecycle.o1 o1Var = this.h;
                ro0.f.d(barVar, ((js2.d) o1Var.getValue()).d, new jq0.baz(this, 1));
                pe0.j.u(this, ((js2.d) o1Var.getValue()).f, new jf1.k(this, 2));
                return;
            }
            kotlin.jvm.internal.Intrinsics.n("searchSettingUiHandler");
            throw null;
        }
        throw new java.lang.IllegalArgumentException("Required value was null.");
    }

    public final void onAttach(android.app.Activity activity) {
        super.onAttach(activity);
        yc3.h hVar = this.c;
        fj.a.i(hVar == null || yc3.d.c(hVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new java.lang.Object[0]);
        S4();
        T4();
    }
}
