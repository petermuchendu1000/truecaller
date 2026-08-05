package com.truecaller.search.global;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/search/global/q0;", "Landroidx/fragment/app/t;", "<init>", "()V", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class q0 extends androidx.fragment.app.t implements bd3.qux {
    public yc3.h c;
    public volatile yc3.d e;
    public p.c3 h;
    public d62.bar i;
    public qo1.r j;
    public boolean d = false;
    public final java.lang.Object f = new java.lang.Object();
    public boolean g = false;

    public final void S4() {
        if (this.c == null) {
            this.c = new yc3.h(super/*androidx.fragment.app.Fragment*/.getContext(), (androidx.fragment.app.Fragment) this);
            this.d = cu0.j1.x(super/*androidx.fragment.app.Fragment*/.getContext());
        }
    }

    public final void T4() {
        if (!this.g) {
            this.g = true;
            tx.w wVar = ((com.truecaller.search.global.r0) X3()).f;
            tx.c0 c0Var = wVar.b;
            this.h = c0Var.h4();
            this.i = (d62.bar) c0Var.a4.get();
            this.j = (qo1.r) wVar.V3.get();
        }
    }

    @Override // bd3.baz
    public final java.lang.Object X3() {
        if (this.e == null) {
            synchronized (this.f) {
                try {
                    if (this.e == null) {
                        this.e = new yc3.d((androidx.fragment.app.Fragment) this);
                    }
                } finally {
                }
            }
        }
        return this.e.X3();
    }

    public final android.content.Context getContext() {
        if (super/*androidx.fragment.app.Fragment*/.getContext() == null && !this.d) {
            return null;
        }
        S4();
        return this.c;
    }

    public final androidx.lifecycle.q1 getDefaultViewModelProviderFactory() {
        return bf0.s2.J(this, super/*androidx.fragment.app.Fragment*/.getDefaultViewModelProviderFactory());
    }

    public final void onAttach(android.content.Context context) {
        super.onAttach(context);
        S4();
        T4();
    }

    public final android.app.Dialog onCreateDialog(android.os.Bundle bundle) {
        java.lang.String str;
        java.lang.String string;
        android.view.LayoutInflater layoutInflater = requireActivity().getLayoutInflater();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(layoutInflater, "getLayoutInflater(...)");
        androidx.cardview.widget.CardView inflate = yy.qux.F(layoutInflater, true).inflate(2131559045, (android.view.ViewGroup) null, false);
        int i = 2131366539;
        android.widget.TextView textView = (android.widget.TextView) df0.qux.o(2131366539, inflate);
        if (textView != null) {
            i = 2131366540;
            android.widget.TextView textView2 = (android.widget.TextView) df0.qux.o(2131366540, inflate);
            if (textView2 != null) {
                i = 2131366541;
                if (((android.widget.ImageView) df0.qux.o(2131366541, inflate)) != null) {
                    i = 2131366542;
                    if (((android.widget.TextView) df0.qux.o(2131366542, inflate)) != null) {
                        i = 2131366543;
                        if (((android.widget.TextView) df0.qux.o(2131366543, inflate)) != null) {
                            androidx.cardview.widget.CardView cardView = inflate;
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(new d91.w(cardView, textView, textView2, 0), "inflate(...)");
                            i.e create = new i.d(requireActivity()).setView(cardView).create();
                            android.graphics.drawable.ColorDrawable colorDrawable = new android.graphics.drawable.ColorDrawable(0);
                            android.content.Context requireContext = requireContext();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                            android.graphics.drawable.InsetDrawable insetDrawable = new android.graphics.drawable.InsetDrawable((android.graphics.drawable.Drawable) colorDrawable, a.bar.o(24, requireContext));
                            android.view.Window window = create.getWindow();
                            if (window != null) {
                                window.setBackgroundDrawable(insetDrawable);
                            }
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(create, "apply(...)");
                            android.os.Bundle arguments = getArguments();
                            if (arguments != null) {
                                str = arguments.getString("softThrottleToken");
                            } else {
                                str = null;
                            }
                            textView.setOnClickListener(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.d(this, 5));
                            qo1.s sVar = this.j;
                            if (sVar != null) {
                                if (sVar.b.a("featurePremiumReward", com.truecaller.featuretoggles.FeatureState.DISABLED)) {
                                    string = getString(2132023395);
                                } else {
                                    string = getString(2132023398);
                                }
                                textView2.setText(string);
                                textView2.setOnClickListener(new ah1.bar(13, str, this));
                                d62.bar barVar = this.i;
                                if (barVar != null) {
                                    barVar.a("globalSearch", "ThrottlingMessageShown");
                                    return create;
                                }
                                kotlin.jvm.internal.Intrinsics.n("softThrottleAnalytics");
                                throw null;
                            }
                            kotlin.jvm.internal.Intrinsics.n("searchFeaturesInventory");
                            throw null;
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }

    public final android.view.LayoutInflater onGetLayoutInflater(android.os.Bundle bundle) {
        android.view.LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new yc3.h(onGetLayoutInflater, (androidx.fragment.app.Fragment) this));
    }

    public final void onAttach(android.app.Activity activity) {
        super/*androidx.fragment.app.Fragment*/.onAttach(activity);
        yc3.h hVar = this.c;
        fj.a.i(hVar == null || yc3.d.c(hVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new java.lang.Object[0]);
        S4();
        T4();
    }
}
