package com.truecaller.settings.impl.ui.about;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/settings/impl/ui/about/AboutSettingsFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "impl_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class AboutSettingsFragment extends androidx.fragment.app.Fragment implements bd3.qux {
    public yc3.h c;
    public volatile yc3.d e;
    public final androidx.lifecycle.o1 h;
    public rs2.bar i;
    public dr2.i j;
    public final kotlin.Lazy k;
    public final kotlin.Lazy l;
    public final kotlin.Lazy m;
    public final kotlin.Lazy n;
    public final kotlin.Lazy o;
    public boolean d = false;
    public final java.lang.Object f = new java.lang.Object();
    public boolean g = false;

    public AboutSettingsFragment() {
        kotlin.Lazy lazy = kotlin.LazyKt.lazy(kotlin.k.c, new ad2.a(new ad2.a(this, 24), 25));
        this.h = new androidx.lifecycle.o1(kotlin.jvm.internal.k0.a.getOrCreateKotlinClass(dr2.k.class), new az1.a(lazy, 18), new az1.b(12, this, lazy), new az1.a(lazy, 19));
        this.k = o82.a.q(this, com.truecaller.settings.impl.ui.about.AboutSettings$AppInfo$Version.a);
        this.l = o82.a.q(this, com.truecaller.settings.impl.ui.about.AboutSettings$AppInfo$UserId.a);
        this.m = o82.a.q(this, com.truecaller.settings.impl.ui.about.AboutSettings$AppInfo$DebugId.a);
        this.n = o82.a.q(this, com.truecaller.settings.impl.ui.about.AboutSettings$AppInfo$ThirdPartyLibs.a);
        this.o = o82.a.q(this, com.truecaller.settings.impl.ui.about.AboutSettings$Terms$TermsOfService.a);
    }

    public final void R4() {
        if (this.c == null) {
            this.c = new yc3.h(super.getContext(), this);
            this.d = cu0.j1.x(super.getContext());
        }
    }

    public final void S4() {
        if (!this.g) {
            this.g = true;
            tx.p pVar = (dr2.d) X3();
            this.i = (rs2.bar) pVar.O.get();
            this.j = (dr2.i) pVar.r4.get();
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
        R4();
        return this.c;
    }

    public final androidx.lifecycle.q1 getDefaultViewModelProviderFactory() {
        return bf0.s2.J(this, super.getDefaultViewModelProviderFactory());
    }

    public final void onAttach(android.content.Context context) {
        super.onAttach(context);
        R4();
        S4();
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
            supportActionBar.B(getString(2132022922));
            rs2.bar barVar = this.i;
            if (barVar != null) {
                androidx.lifecycle.o1 o1Var = this.h;
                ro0.f.d(barVar, ((dr2.k) o1Var.getValue()).e, new cu0.h(this, 21));
                pe0.j.s(this, ((dr2.k) o1Var.getValue()).c.g, new dr2.c(this, 0));
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
        R4();
        S4();
    }
}
