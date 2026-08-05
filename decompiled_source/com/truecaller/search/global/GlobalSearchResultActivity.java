package com.truecaller.search.global;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public class GlobalSearchResultActivity extends com.truecaller.search.global.Hilt_GlobalSearchResultActivity {
    public static final /* synthetic */ int D0 = 0;
    public android.view.View A0;
    public android.view.View B0;
    public boolean C0 = true;
    public com.truecaller.search.global.m j0;
    public tx.c k0;
    public q83.a l0;
    public qo1.r m0;
    public com.truecaller.search.global.h0 n0;
    public androidx.appcompat.widget.Toolbar o0;
    public androidx.appcompat.widget.Toolbar p0;
    public android.view.View q0;
    public android.widget.TextView r0;
    public android.widget.TextView s0;
    public com.truecaller.common.ui.EditBase t0;
    public android.view.View u0;
    public android.widget.EditText v0;
    public android.widget.TextView w0;
    public android.view.View x0;
    public android.view.View y0;
    public android.view.View z0;

    /* JADX WARN: Multi-variable type inference failed */
    public final void A0(boolean z) {
        int i;
        if (z) {
            i = 3;
        } else {
            i = 0;
        }
        if (this.t0.getImeOptions() != i) {
            this.t0.setImeOptions(i);
            ((android.view.inputmethod.InputMethodManager) getSystemService("input_method")).restartInput(this.t0);
        }
    }

    public final void onBackPressed() {
        com.truecaller.search.global.m mVar = this.j0;
        if (mVar != null) {
            com.truecaller.search.global.a0 a0Var = mVar.i;
            if (a0Var != null) {
                ((com.truecaller.search.global.h0) a0Var).h2();
                return;
            } else {
                kotlin.jvm.internal.Intrinsics.n("mGlobalSearchPresenter");
                throw null;
            }
        }
        x0();
        super/*androidx.activity.ComponentActivity*/.onBackPressed();
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x02e6, code lost:
    
        if (r1.contains(ax1.bar.r(r4, "ENGLISH", r2, r4, "toLowerCase(...)")) == false) goto L46;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x047c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x04c2  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x04cc  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x04ee  */
    /* JADX WARN: Type inference failed for: r1v64, types: [java.lang.Object, wt.l] */
    /* JADX WARN: Type inference failed for: r1v77, types: [android.content.Context, com.truecaller.search.global.GlobalSearchResultActivity] */
    /* JADX WARN: Type inference failed for: r1v79, types: [android.content.Context, com.truecaller.search.global.GlobalSearchResultActivity] */
    /* JADX WARN: Type inference failed for: r7v12, types: [uk2.t, java.lang.Object] */
    @Override // com.truecaller.ui.FragmentActivityBase, com.truecaller.ui.Hilt_FragmentActivityBase
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCreate(android.os.Bundle bundle) {
        com.truecaller.search.global.h0 h0Var;
        boolean z;
        i.baz supportActionBar;
        ?? r1;
        java.lang.Integer b;
        android.view.animation.Animation animation;
        android.view.animation.Animation animation2;
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        final int i = 1;
        yy.qux.B(this, true, ex2.a.a);
        super.onCreate(bundle);
        setContentView(2131558479);
        this.o0 = findViewById(2131366290);
        this.q0 = findViewById(2131366291);
        this.p0 = findViewById(2131365368);
        this.r0 = (android.widget.TextView) findViewById(2131367057);
        this.s0 = (android.widget.TextView) findViewById(2131366703);
        this.t0 = findViewById(2131366284);
        this.z0 = findViewById(2131362708);
        this.x0 = findViewById(2131366322);
        this.y0 = findViewById(2131363550);
        this.u0 = findViewById(2131362701);
        this.v0 = (android.widget.EditText) findViewById(2131362191);
        this.w0 = (android.widget.TextView) findViewById(2131366268);
        this.A0 = findViewById(2131362686);
        this.B0 = findViewById(2131363169);
        ak.r0.i(findViewById(2131367115), com.truecaller.common.ui.insets.InsetType.StatusBar);
        ak.r0.i(findViewById(2131363169), com.truecaller.common.ui.insets.InsetType.NavigationBar);
        final int i2 = 0;
        this.A0.setOnClickListener(new android.view.View.OnClickListener(this) { // from class: com.truecaller.search.global.j0
            public final /* synthetic */ com.truecaller.search.global.GlobalSearchResultActivity b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r7v17, types: [com.truecaller.sdk.bar, com.truecaller.search.global.h0] */
            /* JADX WARN: Type inference failed for: r7v5, types: [com.truecaller.sdk.bar, com.truecaller.search.global.h0] */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                java.lang.Object obj;
                boolean z2;
                int i3;
                switch (i2) {
                    case 0:
                        this.b.n0.h2();
                        return;
                    case 1:
                        ?? r7 = this.b.n0;
                        if (r7.v && (obj = r7.a) != null) {
                            com.truecaller.search.global.m mVar = (com.truecaller.search.global.m) ((com.truecaller.search.global.i0) obj);
                            android.content.Context requireContext = mVar.requireContext();
                            com.truecaller.scanner.NumberDetectorProcessor$ScanType numberDetectorProcessor$ScanType = com.truecaller.scanner.NumberDetectorProcessor$ScanType.SCAN_PHONE;
                            android.content.Intent intent = new android.content.Intent(requireContext, (java.lang.Class<?>) com.truecaller.scanner.NumberScannerActivity.class);
                            intent.putExtra("scan_type", numberDetectorProcessor$ScanType);
                            mVar.startActivityForResult(intent, 100);
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter("SEARCH_scanNumber", "action");
                            nc0.u1.e(new rc0.b("SEARCH_scanNumber", (java.lang.String) null, "globalSearch"), r7.q);
                            return;
                        }
                        return;
                    case 2:
                        com.truecaller.search.global.h0 h0Var2 = this.b.n0;
                        h0Var2.getClass();
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("ClearSearch", "action");
                        nc0.u1.e(new rc0.b("ClearSearch", (java.lang.String) null, "globalSearch"), h0Var2.q);
                        return;
                    case 3:
                        tx.baz bazVar = this.b.n0;
                        com.truecaller.log.AssertionUtil.isNotNull(bazVar.a, new java.lang.String[0]);
                        com.truecaller.search.global.i0 i0Var = (com.truecaller.search.global.i0) bazVar.a;
                        if (i0Var != null) {
                            com.truecaller.search.global.m mVar2 = (com.truecaller.search.global.m) i0Var;
                            new e41.i(mVar2.requireActivity(), new com.truecaller.search.global.h(mVar2, 0)).show();
                            return;
                        }
                        return;
                    default:
                        ?? r72 = this.b.n0;
                        if (!((qo1.r) r72.M.get()).g()) {
                            int i4 = 0;
                            com.truecaller.log.AssertionUtil.isNotNull(r72.a, new java.lang.String[0]);
                            com.truecaller.log.AssertionUtil.isNotNull(r72.X, new java.lang.String[0]);
                            com.truecaller.search.global.GlobalSearchResultActivity globalSearchResultActivity = r72.X;
                            if (globalSearchResultActivity != null && !globalSearchResultActivity.u0.isSelected()) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            com.truecaller.search.global.GlobalSearchResultActivity globalSearchResultActivity2 = r72.X;
                            if (globalSearchResultActivity2 != null) {
                                globalSearchResultActivity2.u0.setSelected(z2);
                            }
                            com.truecaller.search.global.GlobalSearchResultActivity globalSearchResultActivity3 = r72.X;
                            if (globalSearchResultActivity3 != null) {
                                android.view.View view2 = globalSearchResultActivity3.y0;
                                if (z2) {
                                    i3 = 0;
                                } else {
                                    i3 = 8;
                                }
                                view2.setVisibility(i3);
                                android.view.View view3 = globalSearchResultActivity3.x0;
                                if (!z2) {
                                    i4 = 8;
                                }
                                view3.setVisibility(i4);
                            }
                            com.truecaller.analytics.common.event.ViewActionEvent.GlobalSearch globalSearch = com.truecaller.analytics.common.event.ViewActionEvent.GlobalSearch.SELECT_LOCATION_FILTER;
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter("globalSearch", "context");
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(globalSearch, "action");
                            java.lang.String value = globalSearch.getValue();
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "action");
                            nc0.u1.e(new rc0.b(value, (java.lang.String) null, "globalSearch"), r72.q);
                            return;
                        }
                        return;
                }
            }
        });
        android.widget.ImageView imageView = (android.widget.ImageView) this.u0;
        android.graphics.drawable.Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            android.graphics.drawable.Drawable mutate = drawable.mutate();
            imageView.setImageDrawable(mutate);
            mutate.setTintList(bi3.a.t(2130969571, this));
            mutate.invalidateSelf();
        }
        final int i3 = 2;
        android.widget.TextView.OnEditorActionListener cVar = new c41.c(this, 2);
        final int i4 = 4;
        final int i5 = 3;
        if (this.m0.g()) {
            this.u0.setVisibility(8);
            this.y0.setVisibility(8);
            this.x0.setVisibility(8);
        } else {
            this.w0.setOnClickListener(new android.view.View.OnClickListener(this) { // from class: com.truecaller.search.global.j0
                public final /* synthetic */ com.truecaller.search.global.GlobalSearchResultActivity b;

                {
                    this.b = this;
                }

                /* JADX WARN: Type inference failed for: r7v17, types: [com.truecaller.sdk.bar, com.truecaller.search.global.h0] */
                /* JADX WARN: Type inference failed for: r7v5, types: [com.truecaller.sdk.bar, com.truecaller.search.global.h0] */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    java.lang.Object obj;
                    boolean z2;
                    int i32;
                    switch (i5) {
                        case 0:
                            this.b.n0.h2();
                            return;
                        case 1:
                            ?? r7 = this.b.n0;
                            if (r7.v && (obj = r7.a) != null) {
                                com.truecaller.search.global.m mVar = (com.truecaller.search.global.m) ((com.truecaller.search.global.i0) obj);
                                android.content.Context requireContext = mVar.requireContext();
                                com.truecaller.scanner.NumberDetectorProcessor$ScanType numberDetectorProcessor$ScanType = com.truecaller.scanner.NumberDetectorProcessor$ScanType.SCAN_PHONE;
                                android.content.Intent intent = new android.content.Intent(requireContext, (java.lang.Class<?>) com.truecaller.scanner.NumberScannerActivity.class);
                                intent.putExtra("scan_type", numberDetectorProcessor$ScanType);
                                mVar.startActivityForResult(intent, 100);
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter("SEARCH_scanNumber", "action");
                                nc0.u1.e(new rc0.b("SEARCH_scanNumber", (java.lang.String) null, "globalSearch"), r7.q);
                                return;
                            }
                            return;
                        case 2:
                            com.truecaller.search.global.h0 h0Var2 = this.b.n0;
                            h0Var2.getClass();
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter("ClearSearch", "action");
                            nc0.u1.e(new rc0.b("ClearSearch", (java.lang.String) null, "globalSearch"), h0Var2.q);
                            return;
                        case 3:
                            tx.baz bazVar = this.b.n0;
                            com.truecaller.log.AssertionUtil.isNotNull(bazVar.a, new java.lang.String[0]);
                            com.truecaller.search.global.i0 i0Var = (com.truecaller.search.global.i0) bazVar.a;
                            if (i0Var != null) {
                                com.truecaller.search.global.m mVar2 = (com.truecaller.search.global.m) i0Var;
                                new e41.i(mVar2.requireActivity(), new com.truecaller.search.global.h(mVar2, 0)).show();
                                return;
                            }
                            return;
                        default:
                            ?? r72 = this.b.n0;
                            if (!((qo1.r) r72.M.get()).g()) {
                                int i42 = 0;
                                com.truecaller.log.AssertionUtil.isNotNull(r72.a, new java.lang.String[0]);
                                com.truecaller.log.AssertionUtil.isNotNull(r72.X, new java.lang.String[0]);
                                com.truecaller.search.global.GlobalSearchResultActivity globalSearchResultActivity = r72.X;
                                if (globalSearchResultActivity != null && !globalSearchResultActivity.u0.isSelected()) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                com.truecaller.search.global.GlobalSearchResultActivity globalSearchResultActivity2 = r72.X;
                                if (globalSearchResultActivity2 != null) {
                                    globalSearchResultActivity2.u0.setSelected(z2);
                                }
                                com.truecaller.search.global.GlobalSearchResultActivity globalSearchResultActivity3 = r72.X;
                                if (globalSearchResultActivity3 != null) {
                                    android.view.View view2 = globalSearchResultActivity3.y0;
                                    if (z2) {
                                        i32 = 0;
                                    } else {
                                        i32 = 8;
                                    }
                                    view2.setVisibility(i32);
                                    android.view.View view3 = globalSearchResultActivity3.x0;
                                    if (!z2) {
                                        i42 = 8;
                                    }
                                    view3.setVisibility(i42);
                                }
                                com.truecaller.analytics.common.event.ViewActionEvent.GlobalSearch globalSearch = com.truecaller.analytics.common.event.ViewActionEvent.GlobalSearch.SELECT_LOCATION_FILTER;
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter("globalSearch", "context");
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(globalSearch, "action");
                                java.lang.String value = globalSearch.getValue();
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "action");
                                nc0.u1.e(new rc0.b(value, (java.lang.String) null, "globalSearch"), r72.q);
                                return;
                            }
                            return;
                    }
                }
            });
            this.u0.setOnClickListener(new android.view.View.OnClickListener(this) { // from class: com.truecaller.search.global.j0
                public final /* synthetic */ com.truecaller.search.global.GlobalSearchResultActivity b;

                {
                    this.b = this;
                }

                /* JADX WARN: Type inference failed for: r7v17, types: [com.truecaller.sdk.bar, com.truecaller.search.global.h0] */
                /* JADX WARN: Type inference failed for: r7v5, types: [com.truecaller.sdk.bar, com.truecaller.search.global.h0] */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    java.lang.Object obj;
                    boolean z2;
                    int i32;
                    switch (i4) {
                        case 0:
                            this.b.n0.h2();
                            return;
                        case 1:
                            ?? r7 = this.b.n0;
                            if (r7.v && (obj = r7.a) != null) {
                                com.truecaller.search.global.m mVar = (com.truecaller.search.global.m) ((com.truecaller.search.global.i0) obj);
                                android.content.Context requireContext = mVar.requireContext();
                                com.truecaller.scanner.NumberDetectorProcessor$ScanType numberDetectorProcessor$ScanType = com.truecaller.scanner.NumberDetectorProcessor$ScanType.SCAN_PHONE;
                                android.content.Intent intent = new android.content.Intent(requireContext, (java.lang.Class<?>) com.truecaller.scanner.NumberScannerActivity.class);
                                intent.putExtra("scan_type", numberDetectorProcessor$ScanType);
                                mVar.startActivityForResult(intent, 100);
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter("SEARCH_scanNumber", "action");
                                nc0.u1.e(new rc0.b("SEARCH_scanNumber", (java.lang.String) null, "globalSearch"), r7.q);
                                return;
                            }
                            return;
                        case 2:
                            com.truecaller.search.global.h0 h0Var2 = this.b.n0;
                            h0Var2.getClass();
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter("ClearSearch", "action");
                            nc0.u1.e(new rc0.b("ClearSearch", (java.lang.String) null, "globalSearch"), h0Var2.q);
                            return;
                        case 3:
                            tx.baz bazVar = this.b.n0;
                            com.truecaller.log.AssertionUtil.isNotNull(bazVar.a, new java.lang.String[0]);
                            com.truecaller.search.global.i0 i0Var = (com.truecaller.search.global.i0) bazVar.a;
                            if (i0Var != null) {
                                com.truecaller.search.global.m mVar2 = (com.truecaller.search.global.m) i0Var;
                                new e41.i(mVar2.requireActivity(), new com.truecaller.search.global.h(mVar2, 0)).show();
                                return;
                            }
                            return;
                        default:
                            ?? r72 = this.b.n0;
                            if (!((qo1.r) r72.M.get()).g()) {
                                int i42 = 0;
                                com.truecaller.log.AssertionUtil.isNotNull(r72.a, new java.lang.String[0]);
                                com.truecaller.log.AssertionUtil.isNotNull(r72.X, new java.lang.String[0]);
                                com.truecaller.search.global.GlobalSearchResultActivity globalSearchResultActivity = r72.X;
                                if (globalSearchResultActivity != null && !globalSearchResultActivity.u0.isSelected()) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                com.truecaller.search.global.GlobalSearchResultActivity globalSearchResultActivity2 = r72.X;
                                if (globalSearchResultActivity2 != null) {
                                    globalSearchResultActivity2.u0.setSelected(z2);
                                }
                                com.truecaller.search.global.GlobalSearchResultActivity globalSearchResultActivity3 = r72.X;
                                if (globalSearchResultActivity3 != null) {
                                    android.view.View view2 = globalSearchResultActivity3.y0;
                                    if (z2) {
                                        i32 = 0;
                                    } else {
                                        i32 = 8;
                                    }
                                    view2.setVisibility(i32);
                                    android.view.View view3 = globalSearchResultActivity3.x0;
                                    if (!z2) {
                                        i42 = 8;
                                    }
                                    view3.setVisibility(i42);
                                }
                                com.truecaller.analytics.common.event.ViewActionEvent.GlobalSearch globalSearch = com.truecaller.analytics.common.event.ViewActionEvent.GlobalSearch.SELECT_LOCATION_FILTER;
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter("globalSearch", "context");
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(globalSearch, "action");
                                java.lang.String value = globalSearch.getValue();
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "action");
                                nc0.u1.e(new rc0.b(value, (java.lang.String) null, "globalSearch"), r72.q);
                                return;
                            }
                            return;
                    }
                }
            });
            android.widget.TextView textView = this.w0;
            int i6 = m03.v.b;
            android.graphics.drawable.Drawable[] compoundDrawables = textView.getCompoundDrawables();
            for (android.graphics.drawable.Drawable drawable2 : compoundDrawables) {
                if (drawable2 != null) {
                    drawable2.setTint(bi3.a.s(textView.getContext(), 2130971025));
                }
            }
            textView.setCompoundDrawables(compoundDrawables[0], compoundDrawables[1], compoundDrawables[2], compoundDrawables[3]);
            this.v0.addTextChangedListener(new y6.l(new a63.f(this, i5)));
            this.v0.setOnEditorActionListener(cVar);
        }
        this.z0.setOnClickListener(new android.view.View.OnClickListener(this) { // from class: com.truecaller.search.global.j0
            public final /* synthetic */ com.truecaller.search.global.GlobalSearchResultActivity b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r7v17, types: [com.truecaller.sdk.bar, com.truecaller.search.global.h0] */
            /* JADX WARN: Type inference failed for: r7v5, types: [com.truecaller.sdk.bar, com.truecaller.search.global.h0] */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                java.lang.Object obj;
                boolean z2;
                int i32;
                switch (i) {
                    case 0:
                        this.b.n0.h2();
                        return;
                    case 1:
                        ?? r7 = this.b.n0;
                        if (r7.v && (obj = r7.a) != null) {
                            com.truecaller.search.global.m mVar = (com.truecaller.search.global.m) ((com.truecaller.search.global.i0) obj);
                            android.content.Context requireContext = mVar.requireContext();
                            com.truecaller.scanner.NumberDetectorProcessor$ScanType numberDetectorProcessor$ScanType = com.truecaller.scanner.NumberDetectorProcessor$ScanType.SCAN_PHONE;
                            android.content.Intent intent = new android.content.Intent(requireContext, (java.lang.Class<?>) com.truecaller.scanner.NumberScannerActivity.class);
                            intent.putExtra("scan_type", numberDetectorProcessor$ScanType);
                            mVar.startActivityForResult(intent, 100);
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter("SEARCH_scanNumber", "action");
                            nc0.u1.e(new rc0.b("SEARCH_scanNumber", (java.lang.String) null, "globalSearch"), r7.q);
                            return;
                        }
                        return;
                    case 2:
                        com.truecaller.search.global.h0 h0Var2 = this.b.n0;
                        h0Var2.getClass();
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("ClearSearch", "action");
                        nc0.u1.e(new rc0.b("ClearSearch", (java.lang.String) null, "globalSearch"), h0Var2.q);
                        return;
                    case 3:
                        tx.baz bazVar = this.b.n0;
                        com.truecaller.log.AssertionUtil.isNotNull(bazVar.a, new java.lang.String[0]);
                        com.truecaller.search.global.i0 i0Var = (com.truecaller.search.global.i0) bazVar.a;
                        if (i0Var != null) {
                            com.truecaller.search.global.m mVar2 = (com.truecaller.search.global.m) i0Var;
                            new e41.i(mVar2.requireActivity(), new com.truecaller.search.global.h(mVar2, 0)).show();
                            return;
                        }
                        return;
                    default:
                        ?? r72 = this.b.n0;
                        if (!((qo1.r) r72.M.get()).g()) {
                            int i42 = 0;
                            com.truecaller.log.AssertionUtil.isNotNull(r72.a, new java.lang.String[0]);
                            com.truecaller.log.AssertionUtil.isNotNull(r72.X, new java.lang.String[0]);
                            com.truecaller.search.global.GlobalSearchResultActivity globalSearchResultActivity = r72.X;
                            if (globalSearchResultActivity != null && !globalSearchResultActivity.u0.isSelected()) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            com.truecaller.search.global.GlobalSearchResultActivity globalSearchResultActivity2 = r72.X;
                            if (globalSearchResultActivity2 != null) {
                                globalSearchResultActivity2.u0.setSelected(z2);
                            }
                            com.truecaller.search.global.GlobalSearchResultActivity globalSearchResultActivity3 = r72.X;
                            if (globalSearchResultActivity3 != null) {
                                android.view.View view2 = globalSearchResultActivity3.y0;
                                if (z2) {
                                    i32 = 0;
                                } else {
                                    i32 = 8;
                                }
                                view2.setVisibility(i32);
                                android.view.View view3 = globalSearchResultActivity3.x0;
                                if (!z2) {
                                    i42 = 8;
                                }
                                view3.setVisibility(i42);
                            }
                            com.truecaller.analytics.common.event.ViewActionEvent.GlobalSearch globalSearch = com.truecaller.analytics.common.event.ViewActionEvent.GlobalSearch.SELECT_LOCATION_FILTER;
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter("globalSearch", "context");
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(globalSearch, "action");
                            java.lang.String value = globalSearch.getValue();
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "action");
                            nc0.u1.e(new rc0.b(value, (java.lang.String) null, "globalSearch"), r72.q);
                            return;
                        }
                        return;
                }
            }
        });
        this.t0.setClearIconVisibilityListener(new com.google.firebase.crashlytics.internal.concurrency.baz(this, 17));
        this.t0.setOnEditorActionListener(cVar);
        this.t0.addTextChangedListener(new com.truecaller.search.global.k0(this));
        this.t0.setOnClearIconClickListener(new android.view.View.OnClickListener(this) { // from class: com.truecaller.search.global.j0
            public final /* synthetic */ com.truecaller.search.global.GlobalSearchResultActivity b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r7v17, types: [com.truecaller.sdk.bar, com.truecaller.search.global.h0] */
            /* JADX WARN: Type inference failed for: r7v5, types: [com.truecaller.sdk.bar, com.truecaller.search.global.h0] */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                java.lang.Object obj;
                boolean z2;
                int i32;
                switch (i3) {
                    case 0:
                        this.b.n0.h2();
                        return;
                    case 1:
                        ?? r7 = this.b.n0;
                        if (r7.v && (obj = r7.a) != null) {
                            com.truecaller.search.global.m mVar = (com.truecaller.search.global.m) ((com.truecaller.search.global.i0) obj);
                            android.content.Context requireContext = mVar.requireContext();
                            com.truecaller.scanner.NumberDetectorProcessor$ScanType numberDetectorProcessor$ScanType = com.truecaller.scanner.NumberDetectorProcessor$ScanType.SCAN_PHONE;
                            android.content.Intent intent = new android.content.Intent(requireContext, (java.lang.Class<?>) com.truecaller.scanner.NumberScannerActivity.class);
                            intent.putExtra("scan_type", numberDetectorProcessor$ScanType);
                            mVar.startActivityForResult(intent, 100);
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter("SEARCH_scanNumber", "action");
                            nc0.u1.e(new rc0.b("SEARCH_scanNumber", (java.lang.String) null, "globalSearch"), r7.q);
                            return;
                        }
                        return;
                    case 2:
                        com.truecaller.search.global.h0 h0Var2 = this.b.n0;
                        h0Var2.getClass();
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("ClearSearch", "action");
                        nc0.u1.e(new rc0.b("ClearSearch", (java.lang.String) null, "globalSearch"), h0Var2.q);
                        return;
                    case 3:
                        tx.baz bazVar = this.b.n0;
                        com.truecaller.log.AssertionUtil.isNotNull(bazVar.a, new java.lang.String[0]);
                        com.truecaller.search.global.i0 i0Var = (com.truecaller.search.global.i0) bazVar.a;
                        if (i0Var != null) {
                            com.truecaller.search.global.m mVar2 = (com.truecaller.search.global.m) i0Var;
                            new e41.i(mVar2.requireActivity(), new com.truecaller.search.global.h(mVar2, 0)).show();
                            return;
                        }
                        return;
                    default:
                        ?? r72 = this.b.n0;
                        if (!((qo1.r) r72.M.get()).g()) {
                            int i42 = 0;
                            com.truecaller.log.AssertionUtil.isNotNull(r72.a, new java.lang.String[0]);
                            com.truecaller.log.AssertionUtil.isNotNull(r72.X, new java.lang.String[0]);
                            com.truecaller.search.global.GlobalSearchResultActivity globalSearchResultActivity = r72.X;
                            if (globalSearchResultActivity != null && !globalSearchResultActivity.u0.isSelected()) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            com.truecaller.search.global.GlobalSearchResultActivity globalSearchResultActivity2 = r72.X;
                            if (globalSearchResultActivity2 != null) {
                                globalSearchResultActivity2.u0.setSelected(z2);
                            }
                            com.truecaller.search.global.GlobalSearchResultActivity globalSearchResultActivity3 = r72.X;
                            if (globalSearchResultActivity3 != null) {
                                android.view.View view2 = globalSearchResultActivity3.y0;
                                if (z2) {
                                    i32 = 0;
                                } else {
                                    i32 = 8;
                                }
                                view2.setVisibility(i32);
                                android.view.View view3 = globalSearchResultActivity3.x0;
                                if (!z2) {
                                    i42 = 8;
                                }
                                view3.setVisibility(i42);
                            }
                            com.truecaller.analytics.common.event.ViewActionEvent.GlobalSearch globalSearch = com.truecaller.analytics.common.event.ViewActionEvent.GlobalSearch.SELECT_LOCATION_FILTER;
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter("globalSearch", "context");
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(globalSearch, "action");
                            java.lang.String value = globalSearch.getValue();
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "action");
                            nc0.u1.e(new rc0.b(value, (java.lang.String) null, "globalSearch"), r72.q);
                            return;
                        }
                        return;
                }
            }
        });
        android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(this, 2130772065);
        android.view.animation.Animation loadAnimation2 = android.view.animation.AnimationUtils.loadAnimation(this, 2130772071);
        android.view.animation.Animation loadAnimation3 = android.view.animation.AnimationUtils.loadAnimation(this, 2130772073);
        boolean a = mz1.bar.a();
        if (!this.m0.g()) {
            android.view.View view = this.u0;
            if (a) {
                animation2 = loadAnimation2;
            } else {
                animation2 = loadAnimation;
            }
            view.startAnimation(animation2);
        }
        if (this.C0 && this.z0.getVisibility() == 0) {
            android.view.View view2 = this.z0;
            if (a) {
                animation = loadAnimation2;
            } else {
                animation = loadAnimation;
            }
            view2.startAnimation(animation);
        }
        android.view.View view3 = this.A0;
        if (!a) {
            loadAnimation = loadAnimation2;
        }
        view3.startAnimation(loadAnimation);
        this.B0.startAnimation(loadAnimation3);
        com.truecaller.analytics.AppEvents.GlobalSearch.NavigationSource t = ee0.l.t(getIntent(), "ARG_NAVIGATION_SOURCE", com.truecaller.analytics.AppEvents.GlobalSearch.NavigationSource.class);
        tx.d dVar = this.k0.a;
        tx.w wVar = dVar.b;
        tx.e eVar = dVar.e;
        kotlin.coroutines.CoroutineContext coroutineContext = (kotlin.coroutines.CoroutineContext) wVar.V1.get();
        tx.v vVar = wVar.P;
        tx.c0 c0Var = wVar.b;
        kotlin.coroutines.CoroutineContext coroutineContext2 = (kotlin.coroutines.CoroutineContext) vVar.get();
        u03.b bVar = (u03.b) wVar.O.get();
        m03.s sVar = (m03.s) wVar.v1.get();
        c62.q qVar = (c62.q) wVar.t4.get();
        ah.n A2 = wVar.A2();
        u03.f0 f0Var = (u03.f0) wVar.q9.get();
        cd3.b bVar2 = eVar.B0;
        tx.w wVar2 = eVar.f;
        lp2.b bVar3 = (lp2.b) bVar2.get();
        com.truecaller.search.global.d dVar2 = (com.truecaller.search.global.d) eVar.I0.get();
        xf2.baz bazVar = (xf2.baz) c0Var.a.E7.get();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bazVar, "availabilityManager");
        es.baz.l(bazVar);
        android.os.Handler handler = new android.os.Handler();
        m03.l lVar = (m03.l) c0Var.G6.get();
        nc0.bar barVar = (nc0.bar) wVar.Y.get();
        xz1.q qVar2 = (xz1.q) wVar.L0.get();
        com.truecaller.search.global.a1 a1Var = (com.truecaller.search.global.a1) eVar.J0.get();
        to1.g gVar = (to1.g) wVar.r3.get();
        kp2.bar barVar2 = (kp2.bar) eVar.K0.get();
        r03.d W2 = c0Var.W2();
        com.truecaller.scanner.b bVar4 = (com.truecaller.scanner.b) wVar2.b.H6.get();
        x42.a aVar = bVar4.a;
        if (bVar4.c.d("featureNumberScanner", false) && aVar.d(x42.b.c) && (b = aVar.b()) != null) {
            if (b.intValue() >= com.truecaller.scanner.c.b) {
                java.util.Set set = com.truecaller.scanner.c.a;
                ((u03.c) bVar4.b).getClass();
                java.lang.String str = android.os.Build.DEVICE;
                java.util.Locale locale = java.util.Locale.ENGLISH;
            }
            z = true;
            m03.p pVar = (m03.p) wVar.K1.get();
            q81.b bVar5 = (q81.b) wVar.S5.get();
            e00.k kVar = (e00.k) wVar.z7.get();
            java.lang.String a2 = ((s90.baz) wVar2.ea.get()).a("numberOrNameSearchAdUnitId");
            fg0.bar barVar3 = (fg0.bar) wVar.Tg.get();
            nt2.h hVar = (nt2.h) wVar.O5.get();
            p02.z3 z3Var = (p02.z3) eVar.L0.get();
            t41.t tVar = (t41.t) wVar.A1.get();
            s42.baz bazVar2 = (s42.baz) eVar.M0.get();
            nt2.k kVar2 = (nt2.k) c0Var.I6.get();
            s32.d dVar3 = (s32.d) wVar.p9.get();
            tx.w wVar3 = c0Var.a;
            dq1.h hVar2 = new dq1.h((nu1.w0) wVar3.T3.get(), (yw1.l) wVar3.E8.get());
            fx1.b bVar6 = (fx1.b) wVar3.h9.get();
            zr1.g gVar2 = (zr1.g) wVar3.F8.get();
            boolean z2 = z;
            yw1.l lVar2 = (yw1.l) wVar3.E8.get();
            fx1.b bVar7 = (fx1.b) wVar3.h9.get();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lVar2, "smartSmsFeatureFilter");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bVar7, "binder");
            ?? obj = new java.lang.Object();
            obj.a = lVar2;
            obj.b = bVar7;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hVar2, "infoCardDataSource");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bVar6, "binder");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gVar2, "insightsAnalyticsManager");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter((java.lang.Object) obj, "searchMessageSmartCardBinder");
            ?? obj2 = new java.lang.Object();
            ((wt.l) obj2).a = hVar2;
            ((wt.l) obj2).b = bVar6;
            ((wt.l) obj2).c = gVar2;
            ((wt.l) obj2).d = obj;
            ((wt.l) obj2).e = new java.util.LinkedHashMap();
            ((wt.l) obj2).f = new java.util.LinkedHashMap();
            ix1.d dVar4 = (ix1.d) wVar.D3.get();
            vf2.bar barVar4 = (vf2.bar) wVar.Wb.get();
            qc3.bar a3 = cd3.baz.a(wVar.x6);
            qc3.bar a4 = cd3.baz.a(wVar.v0);
            qc3.bar a5 = cd3.baz.a(wVar.V3);
            a53.bar H4 = c0Var.H4();
            com.truecaller.search.global.SearchResultOrder searchResultOrder = (com.truecaller.search.global.SearchResultOrder) ((android.app.Activity) eVar.i.a).getIntent().getSerializableExtra("ARG_RESULT_ORDER");
            es.baz.l(searchResultOrder);
            h0Var = new com.truecaller.search.global.h0(coroutineContext, coroutineContext2, bVar, sVar, qVar, A2, f0Var, bVar3, dVar2, t, bazVar, handler, lVar, barVar, qVar2, a1Var, gVar, barVar2, W2, z2, pVar, bVar5, kVar, a2, barVar3, hVar, z3Var, tVar, bazVar2, kVar2, dVar3, obj2, dVar4, barVar4, a3, a4, a5, H4, searchResultOrder, wVar.U(), (qo1.qux) wVar.d4.get(), jp2.g.a(), (n11.g) wVar.F1.get(), cd3.baz.a(c0Var.a4), (n32.bar) wVar.w9.get(), cd3.baz.a(wVar.d5), (com.truecaller.search.global.i1) c0Var.J6.get());
            this.n0 = h0Var;
            h0Var.X = this;
            if (((qo1.k) h0Var.L.get()).e()) {
                int i7 = com.truecaller.search.global.d0.a[h0Var.O.ordinal()];
                if (i7 != 1 && i7 != 2) {
                    if ((i7 == 3 || i7 == 4 || i7 == 5) && (r1 = h0Var.X) != 0) {
                        r1.t0.setHint(ak.r0.j(2132018920, (android.content.Context) r1));
                    }
                } else {
                    ?? r12 = h0Var.X;
                    if (r12 != 0) {
                        r12.t0.setHint(ak.r0.j(2132018919, (android.content.Context) r12));
                    }
                }
            }
            setSupportActionBar(this.o0);
            supportActionBar = getSupportActionBar();
            if (supportActionBar != null) {
                supportActionBar.t(false);
            }
            if (bundle != null) {
                com.truecaller.search.global.m mVar = new com.truecaller.search.global.m();
                this.j0 = mVar;
                com.truecaller.search.global.h0 h0Var2 = this.n0;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(h0Var2, "presenter");
                mVar.i = h0Var2;
                androidx.fragment.app.g1 supportFragmentManager = getSupportFragmentManager();
                androidx.fragment.app.bar j = bar.j(supportFragmentManager, supportFragmentManager);
                j.g(2131363169, this.j0, "SEARCH_RESULT_TAG");
                j.l();
                return;
            }
            com.truecaller.search.global.m G = getSupportFragmentManager().G("SEARCH_RESULT_TAG");
            this.j0 = G;
            com.truecaller.search.global.h0 h0Var3 = this.n0;
            G.getClass();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(h0Var3, "presenter");
            G.i = h0Var3;
            return;
        }
        z = false;
        m03.p pVar2 = (m03.p) wVar.K1.get();
        q81.b bVar52 = (q81.b) wVar.S5.get();
        e00.k kVar3 = (e00.k) wVar.z7.get();
        java.lang.String a22 = ((s90.baz) wVar2.ea.get()).a("numberOrNameSearchAdUnitId");
        fg0.bar barVar32 = (fg0.bar) wVar.Tg.get();
        nt2.h hVar3 = (nt2.h) wVar.O5.get();
        p02.z3 z3Var2 = (p02.z3) eVar.L0.get();
        t41.t tVar2 = (t41.t) wVar.A1.get();
        s42.baz bazVar22 = (s42.baz) eVar.M0.get();
        nt2.k kVar22 = (nt2.k) c0Var.I6.get();
        s32.d dVar32 = (s32.d) wVar.p9.get();
        tx.w wVar32 = c0Var.a;
        dq1.h hVar22 = new dq1.h((nu1.w0) wVar32.T3.get(), (yw1.l) wVar32.E8.get());
        fx1.b bVar62 = (fx1.b) wVar32.h9.get();
        zr1.g gVar22 = (zr1.g) wVar32.F8.get();
        boolean z22 = z;
        yw1.l lVar22 = (yw1.l) wVar32.E8.get();
        fx1.b bVar72 = (fx1.b) wVar32.h9.get();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lVar22, "smartSmsFeatureFilter");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bVar72, "binder");
        ?? obj3 = new java.lang.Object();
        obj3.a = lVar22;
        obj3.b = bVar72;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hVar22, "infoCardDataSource");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bVar62, "binder");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gVar22, "insightsAnalyticsManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter((java.lang.Object) obj3, "searchMessageSmartCardBinder");
        ?? obj22 = new java.lang.Object();
        ((wt.l) obj22).a = hVar22;
        ((wt.l) obj22).b = bVar62;
        ((wt.l) obj22).c = gVar22;
        ((wt.l) obj22).d = obj3;
        ((wt.l) obj22).e = new java.util.LinkedHashMap();
        ((wt.l) obj22).f = new java.util.LinkedHashMap();
        ix1.d dVar42 = (ix1.d) wVar.D3.get();
        vf2.bar barVar42 = (vf2.bar) wVar.Wb.get();
        qc3.bar a32 = cd3.baz.a(wVar.x6);
        qc3.bar a42 = cd3.baz.a(wVar.v0);
        qc3.bar a52 = cd3.baz.a(wVar.V3);
        a53.bar H42 = c0Var.H4();
        com.truecaller.search.global.SearchResultOrder searchResultOrder2 = (com.truecaller.search.global.SearchResultOrder) ((android.app.Activity) eVar.i.a).getIntent().getSerializableExtra("ARG_RESULT_ORDER");
        es.baz.l(searchResultOrder2);
        h0Var = new com.truecaller.search.global.h0(coroutineContext, coroutineContext2, bVar, sVar, qVar, A2, f0Var, bVar3, dVar2, t, bazVar, handler, lVar, barVar, qVar2, a1Var, gVar, barVar2, W2, z22, pVar2, bVar52, kVar3, a22, barVar32, hVar3, z3Var2, tVar2, bazVar22, kVar22, dVar32, obj22, dVar42, barVar42, a32, a42, a52, H42, searchResultOrder2, wVar.U(), (qo1.qux) wVar.d4.get(), jp2.g.a(), (n11.g) wVar.F1.get(), cd3.baz.a(c0Var.a4), (n32.bar) wVar.w9.get(), cd3.baz.a(wVar.d5), (com.truecaller.search.global.i1) c0Var.J6.get());
        this.n0 = h0Var;
        h0Var.X = this;
        if (((qo1.k) h0Var.L.get()).e()) {
        }
        setSupportActionBar(this.o0);
        supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
        }
        if (bundle != null) {
        }
    }

    @Override // com.truecaller.ui.FragmentActivityBase, com.truecaller.ui.Hilt_FragmentActivityBase
    public final void onDestroy() {
        super.onDestroy();
        this.n0.X = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void w0() {
        u6.c2 a2Var;
        android.view.Window window = getWindow();
        po1.baz bazVar = new po1.baz(this.t0);
        int i = android.os.Build.VERSION.SDK_INT;
        if (i >= 35) {
            a2Var = new u6.c2(window, bazVar);
        } else if (i >= 30) {
            a2Var = new u6.c2(window, bazVar);
        } else if (i >= 26) {
            a2Var = new u6.a2(window, bazVar);
        } else {
            a2Var = new u6.a2(window, bazVar);
        }
        a2Var.x(8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void x0() {
        android.view.animation.Animation animation;
        android.view.animation.Animation animation2;
        android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(this, 2130772066);
        android.view.animation.Animation loadAnimation2 = android.view.animation.AnimationUtils.loadAnimation(this, 2130772072);
        android.view.animation.Animation loadAnimation3 = android.view.animation.AnimationUtils.loadAnimation(this, 2130772060);
        boolean a = mz1.bar.a();
        if (!this.m0.g()) {
            android.view.View view = this.u0;
            if (a) {
                animation2 = loadAnimation;
            } else {
                animation2 = loadAnimation2;
            }
            view.startAnimation(animation2);
        }
        if (this.C0 && this.z0.getVisibility() == 0) {
            android.view.View view2 = this.z0;
            if (a) {
                animation = loadAnimation;
            } else {
                animation = loadAnimation2;
            }
            view2.startAnimation(animation);
        }
        android.view.View view3 = this.A0;
        if (a) {
            loadAnimation = loadAnimation2;
        }
        view3.startAnimation(loadAnimation);
        this.B0.startAnimation(loadAnimation3);
    }

    public final void y0(boolean z) {
        int i = 0;
        if (z) {
            setSupportActionBar(this.p0);
            i.baz supportActionBar = getSupportActionBar();
            if (supportActionBar != null) {
                supportActionBar.t(false);
            }
        }
        androidx.appcompat.widget.Toolbar toolbar = this.p0;
        if (!z) {
            i = 8;
        }
        toolbar.setVisibility(i);
    }

    public final void z0(boolean z) {
        int i = 0;
        if (z) {
            setSupportActionBar(this.o0);
            i.baz supportActionBar = getSupportActionBar();
            if (supportActionBar != null) {
                supportActionBar.t(false);
            }
        }
        android.view.View view = this.q0;
        if (!z) {
            i = 8;
        }
        view.setVisibility(i);
    }
}
