package com.truecaller.settings.impl.ui.call_assistant.router;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/settings/impl/ui/call_assistant/router/CallAssistantSettingsRouterFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "impl_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class CallAssistantSettingsRouterFragment extends androidx.fragment.app.Fragment implements bd3.qux {
    public yc3.h c;
    public boolean d;
    public volatile yc3.d e;
    public final java.lang.Object f;
    public boolean g;
    public final androidx.lifecycle.o1 h;
    public final rb.g i;
    public p7.baz j;
    public qr2.qux k;

    public CallAssistantSettingsRouterFragment() {
        super(2131559128);
        this.d = false;
        this.f = new java.lang.Object();
        this.g = false;
        kotlin.Lazy lazy = kotlin.LazyKt.lazy(kotlin.k.c, new rq0.a(new rr2.bar(this, 1), 1));
        kotlin.jvm.internal.l0 l0Var = kotlin.jvm.internal.k0.a;
        this.h = new androidx.lifecycle.o1(l0Var.getOrCreateKotlinClass(rr2.a.class), new qs2.d(lazy, 6), new nu2.a(23, this, lazy), new qs2.d(lazy, 7));
        this.i = new rb.g(l0Var.getOrCreateKotlinClass(rr2.baz.class), new rr2.bar(this, 0));
    }

    public final void R4() {
        if (this.c == null) {
            this.c = new yc3.h(super.getContext(), this);
            this.d = cu0.j1.x(super.getContext());
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [p7.baz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [qr2.qux, java.lang.Object] */
    public final void S4() {
        if (!this.g) {
            this.g = true;
            ((rr2.qux) X3()).getClass();
            this.j = new java.lang.Object();
            this.k = new java.lang.Object();
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

    public final android.view.LayoutInflater onGetLayoutInflater(android.os.Bundle bundle) {
        android.view.LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new yc3.h(onGetLayoutInflater, this));
    }

    public final void onViewCreated(android.view.View view, android.os.Bundle bundle) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        if (bundle != null) {
            return;
        }
        pe0.j.u(this, ((rr2.a) this.h.getValue()).c, new nu2.e(this, 28));
    }

    public final void onAttach(android.app.Activity activity) {
        super.onAttach(activity);
        yc3.h hVar = this.c;
        fj.a.i(hVar == null || yc3.d.c(hVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new java.lang.Object[0]);
        R4();
        S4();
    }
}
