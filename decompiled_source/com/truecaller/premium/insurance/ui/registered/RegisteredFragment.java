package com.truecaller.premium.insurance.ui.registered;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/premium/insurance/ui/registered/RegisteredFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class RegisteredFragment extends kc0.t {
    public static final /* synthetic */ kotlin.reflect.KProperty[] l = {kotlin.jvm.internal.k0.a.property1(new kotlin.jvm.internal.a0("binding", 0, "getBinding()Lcom/truecaller/premium/databinding/FragmentInsuranceRegisteredBinding;", com.truecaller.premium.insurance.ui.registered.RegisteredFragment.class))};
    public final androidx.lifecycle.o1 i;
    public final j13.bar j;
    public final b80.f k;

    public RegisteredFragment() {
        super(16);
        kotlin.Lazy lazy = kotlin.LazyKt.lazy(kotlin.k.c, new ob2.b(new ob2.b(this, 0), 1));
        this.i = new androidx.lifecycle.o1(kotlin.jvm.internal.k0.a.getOrCreateKotlinClass(ob2.o.class), new nb2.c(lazy, 10), new nu2.a(5, this, lazy), new nb2.c(lazy, 11));
        nr0.a aVar = new nr0.a(4);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(aVar, "viewBinder");
        this.j = new j13.bar(aVar);
        this.k = new b80.f(this, 4);
    }

    public final l92.qux a6() {
        return (l92.qux) this.j.a(this, l[0]);
    }

    public final ob2.o b6() {
        return (ob2.o) this.i.getValue();
    }

    public final void c6() {
        d6(false);
        android.widget.ProgressBar progressBar = a6().n;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
        gj.m.j0(progressBar);
    }

    public final void d6(boolean z) {
        l92.qux a6 = a6();
        android.widget.LinearLayout linearLayout = a6.b;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(linearLayout, "buttonsContainer");
        gj.m.k0(linearLayout, z);
        android.widget.ScrollView scrollView = a6.l;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(scrollView, "mainScrollContainer");
        gj.m.k0(scrollView, z);
    }

    public final void onResume() {
        java.lang.String str;
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
            requireActivity2.addMenuProvider(this.k, viewLifecycleOwner, androidx.lifecycle.s.e);
            super/*androidx.fragment.app.Fragment*/.onResume();
            return;
        }
        throw new java.lang.IllegalArgumentException("Required value was null.");
    }

    public final void onViewCreated(android.view.View view, android.os.Bundle bundle) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
        super/*androidx.fragment.app.Fragment*/.onViewCreated(view, bundle);
        ob2.o b6 = b6();
        b6.getClass();
        fg3.h0.J(androidx.lifecycle.g1.l(b6), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new b12.r(b6, null, 20), 3);
        c6();
        d6(false);
        pe0.j.u(this, b6().g, new ob2.a(this, 0));
        pe0.j.s(this, b6().i, new ob2.a(this, 1));
    }
}
