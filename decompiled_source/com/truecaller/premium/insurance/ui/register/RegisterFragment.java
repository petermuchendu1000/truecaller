package com.truecaller.premium.insurance.ui.register;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/premium/insurance/ui/register/RegisterFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class RegisterFragment extends androidx.fragment.app.Fragment implements bd3.qux {
    public yc3.h c;
    public volatile yc3.d e;
    public final androidx.lifecycle.o1 i;
    public boolean d = false;
    public final java.lang.Object f = new java.lang.Object();
    public boolean g = false;
    public final b80.f h = new b80.f(this, 3);

    public RegisterFragment() {
        kotlin.Lazy lazy = kotlin.LazyKt.lazy(kotlin.k.c, new k91.d(new k91.d(this, 19), 20));
        this.i = new androidx.lifecycle.o1(kotlin.jvm.internal.k0.a.getOrCreateKotlinClass(nb2.s.class), new nb2.c(lazy, 0), new iq1.d(28, this, lazy), new nb2.c(lazy, 1));
    }

    public final nb2.s R4() {
        return (nb2.s) this.i.getValue();
    }

    public final void S4() {
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
        S4();
        return this.c;
    }

    public final androidx.lifecycle.q1 getDefaultViewModelProviderFactory() {
        return bf0.s2.J(this, super.getDefaultViewModelProviderFactory());
    }

    public final void onAttach(android.content.Context context) {
        super.onAttach(context);
        S4();
        if (this.g) {
            return;
        }
        this.g = true;
        ((nb2.e) X3()).getClass();
    }

    public final android.view.View onCreateView(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        android.content.Context requireContext = requireContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        androidx.compose.ui.platform.ComposeView composeView = new androidx.compose.ui.platform.ComposeView(requireContext, (android.util.AttributeSet) null, 0, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        composeView.setViewCompositionStrategy(k4.r1.e);
        composeView.setContent(new d3.qux(603975148, new nb2.b(this, 0), true));
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
            supportActionBar.v(0);
            android.os.Bundle arguments = getArguments();
            if (arguments != null) {
                str = arguments.getString("FRAGMENT_TOOLBAR_TITLE");
            } else {
                str = null;
            }
            supportActionBar.B(str);
            androidx.fragment.app.FragmentActivity requireActivity2 = requireActivity();
            androidx.lifecycle.d0 viewLifecycleOwner = getViewLifecycleOwner();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            requireActivity2.addMenuProvider(this.h, viewLifecycleOwner, androidx.lifecycle.s.e);
            return;
        }
        throw new java.lang.IllegalArgumentException("Required value was null.");
    }

    public final void onViewCreated(android.view.View view, android.os.Bundle bundle) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        pe0.j.u(this, R4().n, new jf1.k(this, 27));
        androidx.fragment.app.FragmentActivity requireActivity = requireActivity();
        androidx.lifecycle.d0 viewLifecycleOwner = getViewLifecycleOwner();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        requireActivity.addMenuProvider(this.h, viewLifecycleOwner, androidx.lifecycle.s.e);
        ll.baz.y(this, "SalutationResultCode", new nb2.b(this, 1));
    }

    public final void onAttach(android.app.Activity activity) {
        super.onAttach(activity);
        yc3.h hVar = this.c;
        fj.a.i(hVar == null || yc3.d.c(hVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new java.lang.Object[0]);
        S4();
        if (this.g) {
            return;
        }
        this.g = true;
        ((nb2.e) X3()).getClass();
    }
}
