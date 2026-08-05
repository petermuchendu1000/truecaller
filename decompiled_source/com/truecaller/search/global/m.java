package com.truecaller.search.global;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/truecaller/search/global/m;", "Landroidx/fragment/app/Fragment;", "Lcom/truecaller/search/global/i0;", "<init>", "()V", "b91/c", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class m extends a42.bar implements com.truecaller.search.global.i0 {
    public com.truecaller.search.global.a0 i;
    public com.truecaller.search.global.p0 j;
    public androidx.recyclerview.widget.RecyclerView k;
    public u03.baz l;
    public xf2.baz m;
    public qw2.a0 n;
    public qc3.bar o;
    public u03.b0 p;
    public e70.c q;
    public nd1.bar r;
    public rp2.c s;
    public qo1.v t;
    public com.truecaller.search.global.i1 u;
    public boolean v;
    public boolean w;
    public final g.baz x;
    public final g.baz y;

    public m() {
        super(7);
        g.baz registerForActivityResult = registerForActivityResult(new androidx.fragment.app.a1(6), new com.truecaller.search.global.g(this, 0));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(registerForActivityResult, "registerForActivityResult(...)");
        this.x = registerForActivityResult;
        g.baz registerForActivityResult2 = registerForActivityResult(new s32.a("globalSearch"), new com.truecaller.search.global.g(this, 1));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(registerForActivityResult2, "registerForActivityResult(...)");
        this.y = registerForActivityResult2;
    }

    public final void Z5(java.lang.String str, java.lang.Boolean bool) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "searchToken");
        if (isAdded()) {
            android.content.Context requireContext = requireContext();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requireContext, "context");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "searchTerm");
            od.n z = os0.bar.z(requireContext, "context", requireContext, "getInstance(...)");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(com.truecaller.whosearchedforme.ExactSearchLoggerWorker.class, "workerClass");
            f6.v0 v0Var = new f6.v0(com.truecaller.whosearchedforme.ExactSearchLoggerWorker.class);
            kotlin.Pair[] pairArr = {new kotlin.Pair("ExtraSearchTerm", str), new kotlin.Pair("ExtraIsInPhonebookContact", bool)};
            nd.b0 b0Var = new nd.b0();
            for (int i = 0; i < 2; i++) {
                kotlin.Pair pair = pairArr[i];
                b0Var.b((java.lang.String) pair.a, pair.b);
            }
            z.g("ExactSearchLoggerWorker", nd.l.a, v0Var.y(b0Var.a()).d());
        }
    }

    public final void a6(boolean z) {
        if (z) {
            com.truecaller.search.global.w wVar = new com.truecaller.search.global.w();
            androidx.fragment.app.g1 childFragmentManager = getChildFragmentManager();
            childFragmentManager.getClass();
            androidx.fragment.app.bar barVar = new androidx.fragment.app.bar(childFragmentManager);
            barVar.g(2131364460, wVar, "TAG_HISTORY_FRAGMENT");
            barVar.o();
            return;
        }
        androidx.fragment.app.Fragment G = getChildFragmentManager().G("TAG_HISTORY_FRAGMENT");
        if (G != null) {
            androidx.fragment.app.g1 childFragmentManager2 = getChildFragmentManager();
            childFragmentManager2.getClass();
            androidx.fragment.app.bar barVar2 = new androidx.fragment.app.bar(childFragmentManager2);
            barVar2.s(G);
            barVar2.o();
        }
    }

    public final void b6(java.lang.String str, com.truecaller.analytics.AppEvents.GlobalSearch.NavigationSource navigationSource) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "searchToken");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationSource, "navigationSource");
        androidx.fragment.app.FragmentActivity requireActivity = requireActivity();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        b91.c.p(requireActivity, str, com.truecaller.search.global.SearchResultOrder.ORDER_CGMT, (android.view.View) null, navigationSource, 96);
        finish();
    }

    public final void c6() {
        com.truecaller.search.global.p0 p0Var = this.j;
        if (p0Var != null) {
            p0Var.notifyDataSetChanged();
        } else {
            kotlin.jvm.internal.Intrinsics.n("mAdapter");
            throw null;
        }
    }

    public final void finish() {
        if (!this.v && getActivity() != null) {
            androidx.fragment.app.FragmentActivity activity = getActivity();
            if (activity == null || !activity.isFinishing()) {
                this.v = true;
                requireActivity().supportFinishAfterTransition();
            }
        }
    }

    public final void onActivityResult(int i, int i2, android.content.Intent intent) {
        android.os.Bundle extras;
        java.util.ArrayList<java.lang.String> stringArrayList;
        super/*androidx.fragment.app.Fragment*/.onActivityResult(i, i2, intent);
        tx.baz bazVar = this.i;
        if (bazVar != null) {
            tx.baz bazVar2 = (com.truecaller.search.global.h0) bazVar;
            if (i == 100 && i2 == -1 && intent != null && (extras = intent.getExtras()) != null && (stringArrayList = extras.getStringArrayList("extra_results")) != null) {
                int i3 = 1;
                if (stringArrayList.size() > 1) {
                    com.truecaller.search.global.i0 i0Var = (com.truecaller.search.global.i0) bazVar2.a;
                    if (i0Var != null) {
                        com.truecaller.search.global.m mVar = (com.truecaller.search.global.m) i0Var;
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stringArrayList, "numbers");
                        i.d dVar = new i.d(mVar.requireActivity());
                        dVar.k(2132022884);
                        dVar.a(new com.truecaller.scanner.i(mVar.requireActivity(), stringArrayList), new com.truecaller.qa.i(i3, mVar, stringArrayList));
                        i.e create = dVar.create();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(create, "create(...)");
                        create.show();
                        return;
                    }
                    return;
                }
                com.truecaller.search.global.i0 i0Var2 = (com.truecaller.search.global.i0) bazVar2.a;
                if (i0Var2 != null) {
                    java.lang.String str = stringArrayList.get(0);
                    if (str == null) {
                        str = "";
                    }
                    ((com.truecaller.search.global.m) i0Var2).b6(str, com.truecaller.analytics.AppEvents.GlobalSearch.NavigationSource.NUMBER_SCAN_AUTOMATIC);
                    return;
                }
                return;
            }
            return;
        }
        kotlin.jvm.internal.Intrinsics.n("mGlobalSearchPresenter");
        throw null;
    }

    public final android.view.View onCreateView(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        return yy.qux.F(layoutInflater, true).inflate(2131561030, viewGroup, false);
    }

    public final void onDestroy() {
        super/*androidx.fragment.app.Fragment*/.onDestroy();
        com.truecaller.search.global.a0 a0Var = this.i;
        if (a0Var != null) {
            ((com.truecaller.search.global.h0) a0Var).m1();
        } else {
            kotlin.jvm.internal.Intrinsics.n("mGlobalSearchPresenter");
            throw null;
        }
    }

    public final void onPause() {
        super/*androidx.fragment.app.Fragment*/.onPause();
        com.truecaller.search.global.a0 a0Var = this.i;
        if (a0Var != null) {
            com.truecaller.search.global.h0 h0Var = (com.truecaller.search.global.h0) a0Var;
            if (!h0Var.p0 && (!h0Var.c0.isEmpty() || !h0Var.b0.isEmpty())) {
                h0Var.G.c();
            }
            if (h0Var.I.i.a.a("featureInsightsSearchSmartCards", com.truecaller.featuretoggles.FeatureState.DISABLED)) {
                wt.l lVar = h0Var.H;
                java.util.LinkedHashMap linkedHashMap = (java.util.LinkedHashMap) lVar.f;
                java.util.Iterator it = linkedHashMap.values().iterator();
                while (it.hasNext()) {
                    ((zr1.g) lVar.c).e((vu1.baz) it.next());
                }
                linkedHashMap.clear();
            }
            xf2.baz bazVar = this.m;
            if (bazVar != null) {
                ((mp2.baz) bazVar).e();
                return;
            } else {
                kotlin.jvm.internal.Intrinsics.n("mAvailabilityManager");
                throw null;
            }
        }
        kotlin.jvm.internal.Intrinsics.n("mGlobalSearchPresenter");
        throw null;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.truecaller.sdk.bar, com.truecaller.search.global.h0] */
    public final void onResume() {
        boolean z;
        com.truecaller.search.global.i0 i0Var;
        com.truecaller.search.global.GlobalSearchResultActivity globalSearchResultActivity;
        super/*androidx.fragment.app.Fragment*/.onResume();
        com.truecaller.search.global.a0 a0Var = this.i;
        if (a0Var != null) {
            ?? r0 = (com.truecaller.search.global.h0) a0Var;
            com.truecaller.search.global.d dVar = r0.l;
            boolean z2 = r0.p0;
            boolean b = r0.G.b();
            r0.p0 = b;
            if (b != z2) {
                r0.C2(r0.e0);
            }
            boolean z3 = true;
            if (r0.Z && (globalSearchResultActivity = r0.X) != null) {
                globalSearchResultActivity.z0(false);
                com.truecaller.search.global.GlobalSearchResultActivity globalSearchResultActivity2 = r0.X;
                if (globalSearchResultActivity2 != null) {
                    globalSearchResultActivity2.y0(true);
                }
            }
            com.truecaller.search.global.x0 x0Var = dVar.c;
            if (!r0.e2() && ((qo1.k) r0.L.get()).a.a("featureHideSMSIfNoPermissionGiven", com.truecaller.featuretoggles.FeatureState.DISABLED)) {
                z = true;
            } else {
                z = false;
            }
            x0Var.i = z;
            boolean p = ((u03.c) r0.e).p();
            if (!r0.e2() || p) {
                z3 = false;
            }
            dVar.c.j = z3;
            if (p && !r0.q0 && (i0Var = (com.truecaller.search.global.i0) r0.a) != null) {
                ((com.truecaller.search.global.m) i0Var).c6();
            }
            r0.q0 = p;
            xf2.baz bazVar = this.m;
            if (bazVar != null) {
                ((mp2.baz) bazVar).f();
                return;
            } else {
                kotlin.jvm.internal.Intrinsics.n("mAvailabilityManager");
                throw null;
            }
        }
        kotlin.jvm.internal.Intrinsics.n("mGlobalSearchPresenter");
        throw null;
    }

    public final void onStart() {
        super/*androidx.fragment.app.Fragment*/.onStart();
        com.truecaller.search.global.a0 a0Var = this.i;
        if (a0Var != null) {
            ((mp2.baz) ((com.truecaller.search.global.h0) a0Var).n).f();
        } else {
            kotlin.jvm.internal.Intrinsics.n("mGlobalSearchPresenter");
            throw null;
        }
    }

    public final void onStop() {
        super/*androidx.fragment.app.Fragment*/.onStop();
        com.truecaller.search.global.a0 a0Var = this.i;
        if (a0Var != null) {
            ((mp2.baz) ((com.truecaller.search.global.h0) a0Var).n).e();
        } else {
            kotlin.jvm.internal.Intrinsics.n("mGlobalSearchPresenter");
            throw null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [com.truecaller.search.global.GlobalSearchResultActivity, android.app.Activity] */
    /* JADX WARN: Type inference failed for: r1v3, types: [com.truecaller.sdk.bar, com.truecaller.search.global.h0] */
    public final void onViewCreated(android.view.View view, android.os.Bundle bundle) {
        ?? r0;
        u6.c2 a2Var;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
        super/*androidx.fragment.app.Fragment*/.onViewCreated(view, bundle);
        androidx.recyclerview.widget.RecyclerView findViewById = view.findViewById(2131366019);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.k = findViewById;
        com.truecaller.search.global.l lVar = new com.truecaller.search.global.l(this);
        com.bumptech.glide.j d = com.bumptech.glide.baz.b(getContext()).d(this);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(d, "with(...)");
        com.truecaller.search.global.a0 a0Var = this.i;
        df3.bar barVar = null;
        if (a0Var != null) {
            xf2.baz bazVar = this.m;
            if (bazVar != null) {
                u03.baz bazVar2 = this.l;
                if (bazVar2 != null) {
                    qc3.bar barVar2 = this.o;
                    if (barVar2 != null) {
                        u03.b0 b0Var = this.p;
                        if (b0Var != null) {
                            this.j = new com.truecaller.search.global.p0(d, a0Var, bazVar, bazVar2, lVar, barVar2, b0Var);
                            androidx.recyclerview.widget.RecyclerView recyclerView = this.k;
                            if (recyclerView != null) {
                                recyclerView.addOnScrollListener(new com.truecaller.search.global.i(this));
                                androidx.recyclerview.widget.RecyclerView recyclerView2 = this.k;
                                if (recyclerView2 != null) {
                                    android.content.Context requireContext = requireContext();
                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                                    recyclerView2.addItemDecoration(new com.truecaller.search.global.o(requireContext));
                                    com.truecaller.search.global.p0 p0Var = this.j;
                                    if (p0Var != null) {
                                        p0Var.n = new com.truecaller.search.global.g(this, 2);
                                        androidx.recyclerview.widget.RecyclerView recyclerView3 = this.k;
                                        if (recyclerView3 != null) {
                                            recyclerView3.setAdapter(p0Var);
                                            com.truecaller.search.global.a0 a0Var2 = this.i;
                                            if (a0Var2 != null) {
                                                ((com.truecaller.search.global.h0) a0Var2).u0(this);
                                                android.content.Intent intent = requireActivity().getIntent();
                                                com.truecaller.search.global.a0 a0Var3 = this.i;
                                                if (a0Var3 != null) {
                                                    kotlin.jvm.internal.Intrinsics.d(intent);
                                                    ?? r1 = (com.truecaller.search.global.h0) a0Var3;
                                                    xz1.r rVar = r1.r;
                                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "intent");
                                                    com.truecaller.log.AssertionUtil.isNotNull(r1.a, new java.lang.String[0]);
                                                    com.truecaller.log.AssertionUtil.isNotNull(r1.X, new java.lang.String[0]);
                                                    m03.l lVar2 = r1.p;
                                                    int i = 1;
                                                    if (!((qo1.r) r1.M.get()).g()) {
                                                        java.lang.String stringExtra = intent.getStringExtra("ARG_SEARCH_COUNTRY");
                                                        if (jj3.bar.i(stringExtra)) {
                                                            r1.E2(t41.f.a(((m03.m) lVar2).a), true);
                                                        } else {
                                                            intent.removeExtra("ARG_SEARCH_COUNTRY");
                                                            ((m03.m) lVar2).getClass();
                                                            r1.E2(((com.truecaller.data.country.g) t41.f.a.getValue()).a(stringExtra), false);
                                                        }
                                                    }
                                                    java.lang.String stringExtra2 = intent.getStringExtra("ARG_SEARCH_TEXT");
                                                    if (!jj3.bar.i(stringExtra2)) {
                                                        com.truecaller.search.global.GlobalSearchResultActivity globalSearchResultActivity = r1.X;
                                                        if (globalSearchResultActivity != null) {
                                                            globalSearchResultActivity.t0.setText(stringExtra2);
                                                            com.truecaller.common.ui.EditBase editBase = globalSearchResultActivity.t0;
                                                            editBase.setSelection(editBase.getText().length());
                                                        }
                                                        r1.l2(stringExtra2);
                                                        boolean booleanExtra = intent.getBooleanExtra("ARG_FORCE_NUMBER_SEARCH", false);
                                                        if (((qo1.k) r1.L.get()).e() && r1.f2() && booleanExtra) {
                                                            r1.y2(0L, true);
                                                        }
                                                        intent.removeExtra("ARG_SEARCH_TEXT");
                                                    } else {
                                                        r1.w2();
                                                    }
                                                    boolean booleanExtra2 = intent.getBooleanExtra("ARG_SHOW_KEYBOARD", true);
                                                    if (!r1.Z && booleanExtra2 && (r0 = r1.X) != 0) {
                                                        r0.t0.requestFocus();
                                                        android.view.Window window = r0.getWindow();
                                                        po1.baz bazVar3 = new po1.baz(r0.t0);
                                                        int i2 = android.os.Build.VERSION.SDK_INT;
                                                        if (i2 >= 35) {
                                                            a2Var = new u6.c2(window, bazVar3);
                                                        } else if (i2 >= 30) {
                                                            a2Var = new u6.c2(window, bazVar3);
                                                        } else if (i2 >= 26) {
                                                            a2Var = new u6.a2(window, bazVar3);
                                                        } else {
                                                            a2Var = new u6.a2(window, bazVar3);
                                                        }
                                                        a2Var.R(8);
                                                    }
                                                    xz1.r rVar2 = rVar;
                                                    if (rVar2.D("addressFieldBlinkedCount", 0L) < 3) {
                                                        rVar2.e0("addressFieldBlinkedCount", rVar2.D("addressFieldBlinkedCount", 0L) + 1);
                                                    }
                                                    androidx.lifecycle.d0 viewLifecycleOwner = getViewLifecycleOwner();
                                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                                                    fg3.h0.J(androidx.lifecycle.g1.j(viewLifecycleOwner), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new com.truecaller.search.global.k(this, barVar, i), 3);
                                                    return;
                                                }
                                                kotlin.jvm.internal.Intrinsics.n("mGlobalSearchPresenter");
                                                throw null;
                                            }
                                            kotlin.jvm.internal.Intrinsics.n("mGlobalSearchPresenter");
                                            throw null;
                                        }
                                        kotlin.jvm.internal.Intrinsics.n("mRecyclerView");
                                        throw null;
                                    }
                                    kotlin.jvm.internal.Intrinsics.n("mAdapter");
                                    throw null;
                                }
                                kotlin.jvm.internal.Intrinsics.n("mRecyclerView");
                                throw null;
                            }
                            kotlin.jvm.internal.Intrinsics.n("mRecyclerView");
                            throw null;
                        }
                        kotlin.jvm.internal.Intrinsics.n("resourceProvider");
                        throw null;
                    }
                    kotlin.jvm.internal.Intrinsics.n("messagingFeaturesInventory");
                    throw null;
                }
                kotlin.jvm.internal.Intrinsics.n("mClock");
                throw null;
            }
            kotlin.jvm.internal.Intrinsics.n("mAvailabilityManager");
            throw null;
        }
        kotlin.jvm.internal.Intrinsics.n("mGlobalSearchPresenter");
        throw null;
    }
}
