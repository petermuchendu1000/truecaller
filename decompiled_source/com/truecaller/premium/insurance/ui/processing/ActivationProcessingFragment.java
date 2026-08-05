package com.truecaller.premium.insurance.ui.processing;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/premium/insurance/ui/processing/ActivationProcessingFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class ActivationProcessingFragment extends androidx.fragment.app.Fragment implements bd3.qux {
    public yc3.h c;
    public volatile yc3.d e;
    public final androidx.lifecycle.o1 h;
    public final b80.f i;
    public boolean d = false;
    public final java.lang.Object f = new java.lang.Object();
    public boolean g = false;

    public ActivationProcessingFragment() {
        kotlin.Lazy lazy = kotlin.LazyKt.lazy(kotlin.k.c, new k91.d(new k91.d(this, 14), 15));
        this.h = new androidx.lifecycle.o1(kotlin.jvm.internal.k0.a.getOrCreateKotlinClass(mb2.c.class), new iq1.c(lazy, 26), new iq1.d(25, this, lazy), new iq1.c(lazy, 27));
        this.i = new b80.f(this, 2);
    }

    public final void R4() {
        if (this.c == null) {
            this.c = new yc3.h(super.getContext(), this);
            this.d = cu0.j1.x(super.getContext());
        }
    }

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
        if (this.g) {
            return;
        }
        this.g = true;
        ((mb2.qux) X3()).getClass();
    }

    public final android.view.View onCreateView(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        android.content.Context requireContext = requireContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        androidx.compose.ui.platform.ComposeView composeView = new androidx.compose.ui.platform.ComposeView(requireContext, (android.util.AttributeSet) null, 0, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        composeView.setViewCompositionStrategy(k4.r1.e);
        composeView.setContent(new d3.qux(336952060, new mb2.bar(this, 0), true));
        return composeView;
    }

    public final android.view.LayoutInflater onGetLayoutInflater(android.os.Bundle bundle) {
        android.view.LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new yc3.h(onGetLayoutInflater, this));
    }

    public final void onResume() {
        java.lang.String str;
        super.onResume();
        androidx.appcompat.app.AppCompatActivity requireActivity = requireActivity();
        kotlin.jvm.internal.Intrinsics.e(requireActivity, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        i.baz supportActionBar = requireActivity.getSupportActionBar();
        if (supportActionBar != null) {
            android.os.Bundle arguments = getArguments();
            if (arguments != null) {
                str = arguments.getString("FRAGMENT_TOOLBAR_TITLE");
            } else {
                str = null;
            }
            supportActionBar.B(str);
            supportActionBar.v(0);
            androidx.fragment.app.FragmentActivity requireActivity2 = requireActivity();
            androidx.lifecycle.d0 viewLifecycleOwner = getViewLifecycleOwner();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            requireActivity2.addMenuProvider(this.i, viewLifecycleOwner, androidx.lifecycle.s.e);
            return;
        }
        throw new java.lang.IllegalArgumentException("Required value was null.");
    }

    public final void onViewCreated(android.view.View view, android.os.Bundle bundle) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        pe0.j.u(this, ((mb2.c) this.h.getValue()).e, new jf1.k(this, 20));
    }

    public final void onAttach(android.app.Activity activity) {
        super.onAttach(activity);
        yc3.h hVar = this.c;
        fj.a.i(hVar == null || yc3.d.c(hVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new java.lang.Object[0]);
        R4();
        if (this.g) {
            return;
        }
        this.g = true;
        ((mb2.qux) X3()).getClass();
    }
}
