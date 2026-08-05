package com.truecaller.ui;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/truecaller/ui/b1;", "Landroidx/fragment/app/Fragment;", "Lys2/baz;", "<init>", "()V", "com/truecaller/ui/t0", "stats_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class b1 extends a42.bar implements ys2.baz {
    public final j13.bar i;
    public final androidx.lifecycle.o1 j;
    public final kotlin.Lazy k;
    public com.truecaller.ui.s0 l;
    public com.truecaller.ui.e1 m;
    public static final /* synthetic */ kotlin.reflect.KProperty[] o = {kotlin.jvm.internal.k0.a.property1(new kotlin.jvm.internal.a0("binding", 0, "getBinding()Lcom/truecaller/stats/databinding/FragmentStatsBinding;", com.truecaller.ui.b1.class))};
    public static final com.truecaller.ui.t0 n = new java.lang.Object();

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.jvm.functions.Function1] */
    public b1() {
        super(8);
        ?? obj = new java.lang.Object();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter((java.lang.Object) obj, "viewBinder");
        this.i = new j13.bar(obj);
        kotlin.Lazy lazy = kotlin.LazyKt.lazy(kotlin.k.c, new com.truecaller.ui.z0(new com.truecaller.ui.z0(this, 0), 1));
        this.j = new androidx.lifecycle.o1(kotlin.jvm.internal.k0.a.getOrCreateKotlinClass(com.truecaller.ui.n1.class), new com.truecaller.ui.a1(lazy, 0), new az1.b(7, this, lazy), new com.truecaller.ui.a1(lazy, 1));
        this.k = kotlin.LazyKt.lazy(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.bar(this, 24));
    }

    @Override // ys2.baz
    public final void I4() {
        b6("com.twitter.android");
    }

    @Override // ys2.baz
    public final void U3() {
        b6("com.facebook.orca");
    }

    public final wt2.bar Z5() {
        return (wt2.bar) this.i.getValue(this, o[0]);
    }

    public final com.truecaller.ui.n1 a6() {
        return (com.truecaller.ui.n1) this.j.getValue();
    }

    @Override // ys2.baz
    public final void b3() {
        b6("com.whatsapp");
    }

    public final void b6(java.lang.String str) {
        com.truecaller.ui.UserHomeStats userHomeStats;
        androidx.fragment.app.FragmentActivity activity;
        android.net.Uri uri = (android.net.Uri) kotlin.collections.CollectionsKt.e0(a6().s.a.a());
        if (uri != null && (userHomeStats = a6().t) != null && (activity = getActivity()) != null) {
            java.lang.String string = getResources().getString(2132023429);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "<this>");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(string, "title");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri, "shareImageUri");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter("image/png", "mimeType");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userHomeStats, "stats");
            try {
                activity.startActivity(ze0.q.P(activity, ze0.q.k(uri, string, str), string, userHomeStats));
            } catch (android.content.ActivityNotFoundException unused) {
            }
        }
    }

    @Override // ys2.baz
    public final void f4() {
        b6(requireActivity().getPackageName());
    }

    @Override // ys2.baz
    public final void m4() {
        b6(null);
    }

    public final android.view.View onCreateView(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        return yy.qux.F(layoutInflater, true).inflate(2131559233, viewGroup, false);
    }

    public final void onViewCreated(android.view.View view, android.os.Bundle bundle) {
        boolean z;
        java.lang.Object value;
        com.truecaller.stats.StatsPeriod statsPeriod;
        int i;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
        super/*androidx.fragment.app.Fragment*/.onViewCreated(view, bundle);
        android.os.Bundle arguments = getArguments();
        if (arguments != null) {
            z = arguments.getBoolean("EXTRA_CAN_SHARE_STATS");
        } else {
            z = false;
        }
        androidx.recyclerview.widget.RecyclerView recyclerView = Z5().d;
        android.content.Context requireContext = requireContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        int i2 = 1;
        recyclerView.addItemDecoration(new cr.a(yy.qux.v(requireContext, true)));
        this.l = new com.truecaller.ui.s0();
        androidx.recyclerview.widget.RecyclerView recyclerView2 = Z5().d;
        com.truecaller.ui.s0 s0Var = this.l;
        df3.bar barVar = null;
        if (s0Var != null) {
            recyclerView2.setAdapter(s0Var);
            Z5().c.setOnClickListener(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.d(this, 6));
            kk3.m.z(Z5().c, getString(2132023428));
            androidx.appcompat.widget.AppCompatSpinner appCompatSpinner = Z5().b;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(appCompatSpinner, "periodPicker");
            int dimensionPixelSize = getResources().getDimensionPixelSize(2131165629);
            java.lang.Object parent = appCompatSpinner.getParent();
            kotlin.jvm.internal.Intrinsics.e(parent, "null cannot be cast to non-null type android.view.View");
            android.view.View view2 = (android.view.View) parent;
            int i3 = 5;
            view2.post(new bx.q0(appCompatSpinner, dimensionPixelSize, view2, 5));
            this.m = new com.truecaller.ui.e1();
            kotlin.Lazy lazy = this.k;
            androidx.recyclerview.widget.RecyclerView recyclerView3 = ((wt2.baz) lazy.getValue()).c;
            com.truecaller.ui.e1 e1Var = this.m;
            if (e1Var != null) {
                recyclerView3.setAdapter(e1Var);
                ((wt2.baz) lazy.getValue()).b.setText(getResources().getString(2132022330));
                androidx.lifecycle.d0 viewLifecycleOwner = getViewLifecycleOwner();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                fg3.h0.J(androidx.lifecycle.g1.j(viewLifecycleOwner), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new com.truecaller.ui.v0(this, barVar, i2), 3);
                androidx.lifecycle.d0 viewLifecycleOwner2 = getViewLifecycleOwner();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
                fg3.h0.J(androidx.lifecycle.g1.j(viewLifecycleOwner2), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new com.truecaller.ui.v0(this, barVar, 3), 3);
                androidx.lifecycle.d0 viewLifecycleOwner3 = getViewLifecycleOwner();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "getViewLifecycleOwner(...)");
                fg3.h0.J(androidx.lifecycle.g1.j(viewLifecycleOwner3), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new com.truecaller.ui.v0(this, barVar, i3), 3);
                java.util.List<com.truecaller.stats.StatsPeriod> list = a6().o;
                java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.z.q(list, 10));
                for (com.truecaller.stats.StatsPeriod statsPeriod2 : list) {
                    android.content.res.Resources resources = getResources();
                    int i4 = com.truecaller.ui.c1.a[statsPeriod2.ordinal()];
                    if (i4 != 1) {
                        if (i4 != 2) {
                            if (i4 != 3) {
                                if (i4 != 4) {
                                    if (i4 == 5) {
                                        i = 2132022330;
                                    } else {
                                        throw new java.lang.RuntimeException();
                                    }
                                } else {
                                    i = 2132022334;
                                }
                            } else {
                                i = 2132022333;
                            }
                        } else {
                            i = 2132022332;
                        }
                    } else {
                        i = 2132022331;
                    }
                    arrayList.add(resources.getString(i));
                }
                android.widget.ArrayAdapter arrayAdapter = new android.widget.ArrayAdapter(requireContext(), 2131560257, arrayList);
                arrayAdapter.setDropDownViewResource(2131560256);
                Z5().b.setAdapter(arrayAdapter);
                Z5().b.setOnItemSelectedListener(new com.truecaller.ui.x0(this));
                androidx.lifecycle.d0 viewLifecycleOwner4 = getViewLifecycleOwner();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner4, "getViewLifecycleOwner(...)");
                fg3.h0.J(androidx.lifecycle.g1.j(viewLifecycleOwner4), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new com.truecaller.ui.v0(this, barVar, 7), 3);
                androidx.lifecycle.d0 viewLifecycleOwner5 = getViewLifecycleOwner();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner5, "getViewLifecycleOwner(...)");
                fg3.h0.J(androidx.lifecycle.g1.j(viewLifecycleOwner5), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new com.truecaller.ui.v0(this, barVar, 9), 3);
                com.truecaller.ui.n1 a6 = a6();
                ig3.h2 h2Var = a6.i;
                do {
                    value = h2Var.getValue();
                    ((com.truecaller.ui.j1) value).getClass();
                } while (!h2Var.n(value, new com.truecaller.ui.j1(z)));
                int indexOf = a6.o.indexOf(a6.p());
                ig3.h2 h2Var2 = a6.p;
                java.lang.Integer valueOf = java.lang.Integer.valueOf(indexOf);
                h2Var2.getClass();
                h2Var2.p((java.lang.Object) null, valueOf);
                if (z) {
                    statsPeriod = a6.p();
                } else {
                    statsPeriod = com.truecaller.stats.StatsPeriod.ALL_TIME;
                }
                com.truecaller.stats.StatsPeriod statsPeriod3 = statsPeriod;
                com.truecaller.ui.StatsType statsType = com.truecaller.ui.StatsType.SHOWN;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(statsPeriod3, "statsPeriod");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(statsType, "statsType");
                fg3.h0.J(androidx.lifecycle.g1.l(a6), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new a93.t(a6, statsPeriod3, statsType, barVar, 12), 3);
                if (z) {
                    fg3.h0.J(androidx.lifecycle.g1.l(a6), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new com.truecaller.data.country.f(a6, (df3.bar) null, 16), 3);
                    return;
                }
                return;
            }
            kotlin.jvm.internal.Intrinsics.n("listAdapter");
            throw null;
        }
        kotlin.jvm.internal.Intrinsics.n("adapter");
        throw null;
    }

    @Override // ys2.baz
    public final void r3() {
        com.truecaller.ui.UserHomeStats userHomeStats;
        androidx.fragment.app.FragmentActivity activity;
        android.net.Uri uri = (android.net.Uri) kotlin.collections.CollectionsKt.e0(a6().s.a.a());
        if (uri != null && (userHomeStats = a6().t) != null && (activity = getActivity()) != null) {
            java.lang.String string = getResources().getString(2132023429);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "<this>");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri, "imageUri");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(string, "title");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userHomeStats, "stats");
            android.content.Intent P = ze0.q.P(activity, ze0.q.i(activity, uri), string, userHomeStats);
            activity.grantUriPermission("com.instagram.android", uri, 1);
            if (activity.getPackageManager().resolveActivity(P, 0) != null) {
                activity.startActivityForResult(P, 0);
            }
        }
    }
}
