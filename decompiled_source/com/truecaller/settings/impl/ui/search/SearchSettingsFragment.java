package com.truecaller.settings.impl.ui.search;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/settings/impl/ui/search/SearchSettingsFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "impl_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class SearchSettingsFragment extends kc0.t {
    public static final /* synthetic */ kotlin.reflect.KProperty[] l = {kotlin.jvm.internal.k0.a.property1(new kotlin.jvm.internal.a0("binding", 0, "getBinding()Lcom/truecaller/settings/impl/databinding/FragmentSearchSettingsBinding;", com.truecaller.settings.impl.ui.search.SearchSettingsFragment.class))};
    public final j13.bar i;
    public final androidx.lifecycle.o1 j;
    public rs2.baz k;

    public SearchSettingsFragment() {
        super(26);
        nr0.a aVar = new nr0.a(21);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(aVar, "viewBinder");
        this.i = new j13.bar(aVar);
        kotlin.Lazy lazy = kotlin.LazyKt.lazy(kotlin.k.c, new ob2.b(new ob2.b(this, 21), 22));
        this.j = new androidx.lifecycle.o1(kotlin.jvm.internal.k0.a.getOrCreateKotlinClass(qs2.t.class), new nb2.c(lazy, 29), new nu2.a(17, this, lazy), new qs2.d(lazy, 0));
    }

    public final wq2.a a6() {
        return (wq2.a) this.i.getValue(this, l[0]);
    }

    public final void onPause() {
        androidx.appcompat.app.AppCompatActivity requireActivity = requireActivity();
        kotlin.jvm.internal.Intrinsics.e(requireActivity, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        i.baz supportActionBar = requireActivity.getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.D();
        }
        super/*androidx.fragment.app.Fragment*/.onPause();
    }

    public final void onResume() {
        super/*androidx.fragment.app.Fragment*/.onResume();
        androidx.appcompat.app.AppCompatActivity requireActivity = requireActivity();
        kotlin.jvm.internal.Intrinsics.e(requireActivity, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        i.baz supportActionBar = requireActivity.getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.g();
        }
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [or2.z0, java.lang.Object] */
    public final void onViewCreated(android.view.View view, android.os.Bundle bundle) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
        super/*androidx.fragment.app.Fragment*/.onViewCreated(view, bundle);
        com.google.android.material.appbar.AppBarLayout appBarLayout = a6().c.b;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(appBarLayout, "getRoot(...)");
        ak.r0.i(appBarLayout, com.truecaller.common.ui.insets.InsetType.StatusBar);
        com.google.android.material.appbar.MaterialToolbar materialToolbar = (com.google.android.material.appbar.MaterialToolbar) a6().c.d;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(materialToolbar, "toolbar");
        rb.e0 i = cu0.j1.i(this);
        rb.b0 j = i.j();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(j, "navGraph");
        java.util.HashSet hashSet = new java.util.HashSet();
        int i2 = rb.b0.o;
        hashSet.add(java.lang.Integer.valueOf(yy.baz.r(j).h));
        ?? obj = new java.lang.Object();
        obj.a = hashSet;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(materialToolbar, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(i, "navController");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter((java.lang.Object) obj, "configuration");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(materialToolbar, "toolbar");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(i, "navController");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter((java.lang.Object) obj, "configuration");
        ub.qux quxVar = new ub.qux(materialToolbar, (or2.z0) obj);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(quxVar, "listener");
        i.q.add(quxVar);
        kotlin.collections.p pVar = i.g;
        if (!pVar.isEmpty()) {
            rb.n nVar = (rb.n) pVar.last();
            quxVar.a(i, nVar.b, nVar.c);
        }
        materialToolbar.setNavigationOnClickListener(new ty1.bar(2, i, (java.lang.Object) obj));
        com.truecaller.common.ui.EditBase editBase = a6().c.c;
        editBase.addTextChangedListener(new com.truecaller.common.ui.d(this, 14));
        editBase.requestFocus();
        gj.m.v0(editBase, 2, true);
        dp0.b bVar = new dp0.b(new pt2.a(this, 10));
        a6().d.setAdapter(bVar);
        pe0.j.u(this, ((qs2.t) this.j.getValue()).f, new pi1.f(12, this, bVar));
    }
}
