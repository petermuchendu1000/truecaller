package com.truecaller.settings.impl.ui.voicemail;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006²\u0006\f\u0010\u0005\u001a\u00020\u00048\nX\u008a\u0084\u0002"}, d2 = {"Lcom/truecaller/settings/impl/ui/voicemail/VoicemailSettingsFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Lss2/g;", "uiState", "impl_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class VoicemailSettingsFragment extends androidx.fragment.app.Fragment implements bd3.qux {
    public yc3.h c;
    public volatile yc3.d e;
    public rs2.bar h;
    public final androidx.lifecycle.o1 i;
    public final rb.g j;
    public boolean d = false;
    public final java.lang.Object f = new java.lang.Object();
    public boolean g = false;

    public VoicemailSettingsFragment() {
        kotlin.Lazy lazy = kotlin.LazyKt.lazy(kotlin.k.c, new rq0.a(new ss2.a(this, 1), 11));
        kotlin.jvm.internal.l0 l0Var = kotlin.jvm.internal.k0.a;
        this.i = new androidx.lifecycle.o1(l0Var.getOrCreateKotlinClass(ss2.k.class), new qs2.d(lazy, 16), new nu2.a(29, this, lazy), new qs2.d(lazy, 17));
        this.j = new rb.g(l0Var.getOrCreateKotlinClass(ss2.b.class), new ss2.a(this, 0));
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
            tx.p pVar = (ss2.c) X3();
            this.h = (rs2.bar) pVar.O.get();
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

    public final void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        ss2.k kVar = (ss2.k) this.i.getValue();
        java.lang.String str = ((ss2.b) this.j.getValue()).a;
        kVar.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "analyticsContext");
        if (kVar.i) {
            return;
        }
        kVar.i = true;
        bb2.m mVar = kVar.c;
        mVar.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "analyticsContext");
        bd.bar.u(mVar.a(), "CTVoicemailSettings", str);
    }

    public final android.view.View onCreateView(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        android.view.View inflate = layoutInflater.inflate(2131559230, viewGroup, false);
        androidx.compose.ui.platform.ComposeView findViewById = inflate.findViewById(2131363098);
        findViewById.setViewCompositionStrategy(k4.r1.e);
        findViewById.setContent(new d3.qux(619734450, new ss2.qux(this, 0), true));
        return inflate;
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
            supportActionBar.B(getString(2132023366));
            rs2.bar barVar = this.h;
            if (barVar != null) {
                ro0.f.d(barVar, ((ss2.k) this.i.getValue()).g, new s20.bar(14));
                androidx.lifecycle.d0 viewLifecycleOwner = getViewLifecycleOwner();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                fg3.h0.J(androidx.lifecycle.g1.j(viewLifecycleOwner), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new sr0.bar(this, (df3.bar) null, 2), 3);
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
