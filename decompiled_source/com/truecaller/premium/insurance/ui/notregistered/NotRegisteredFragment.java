package com.truecaller.premium.insurance.ui.notregistered;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/premium/insurance/ui/notregistered/NotRegisteredFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class NotRegisteredFragment extends a42.bar {
    public static final /* synthetic */ kotlin.reflect.KProperty[] l = {kotlin.jvm.internal.k0.a.property1(new kotlin.jvm.internal.a0("binding", 0, "getBinding()Lcom/truecaller/premium/databinding/FragmentInsuranceNotRegisteredBinding;", com.truecaller.premium.insurance.ui.notregistered.NotRegisteredFragment.class))};
    public final j13.bar i;
    public final androidx.lifecycle.o1 j;
    public final b80.f k;

    public NotRegisteredFragment() {
        super(29);
        j23.b bVar = new j23.b(5);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bVar, "viewBinder");
        this.i = new j13.bar(bVar);
        kotlin.Lazy lazy = kotlin.LazyKt.lazy(kotlin.k.c, new k91.d(new k91.d(this, 1), 2));
        this.j = new androidx.lifecycle.o1(kotlin.jvm.internal.k0.a.getOrCreateKotlinClass(kb2.i.class), new iq1.c(lazy, 19), new iq1.d(20, this, lazy), new iq1.c(lazy, 20));
        this.k = new b80.f(this, 1);
    }

    public final l92.baz Z5() {
        return (l92.baz) this.i.a(this, l[0]);
    }

    public final kb2.i a6() {
        return (kb2.i) this.j.getValue();
    }

    public final void b6() {
        c6(false);
        android.widget.ProgressBar progressBar = Z5().h;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
        gj.m.j0(progressBar);
    }

    public final void c6(boolean z) {
        android.widget.LinearLayout linearLayout = Z5().b;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(linearLayout, "buttonsContainer");
        gj.m.k0(linearLayout, z);
        android.widget.ScrollView scrollView = Z5().e;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(scrollView, "mainScrollContainer");
        gj.m.i0(scrollView, z);
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
            requireActivity2.addMenuProvider(this.k, viewLifecycleOwner, androidx.lifecycle.s.e);
            return;
        }
        throw new java.lang.IllegalArgumentException("Required value was null.");
    }

    public final void onViewCreated(android.view.View view, android.os.Bundle bundle) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        kb2.i a6 = a6();
        a6.getClass();
        fg3.h0.J(androidx.lifecycle.g1.l(a6), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new gh1.m(a6, null, 12), 3);
        b6();
        c6(false);
        pe0.j.s(this, a6().k, new kb2.bar(this, 1));
        pe0.j.u(this, a6().i, new kb2.bar(this, 0));
        android.widget.Button button = Z5().i;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(button, "registerButton");
        mf0.o.F(button, 0L, new jm2.p(this, 9));
        Z5().j.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
    }
}
