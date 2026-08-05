package com.truecaller.gov_services.ui.main;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/truecaller/gov_services/ui/main/CallingGovServicesActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "", "<init>", "()V", "h02/qux", "gov-services_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class CallingGovServicesActivity extends com.truecaller.gov_services.ui.main.Hilt_CallingGovServicesActivity {
    public static final /* synthetic */ int s0 = 0;
    public kotlin.coroutines.CoroutineContext e0;
    public p81.b f0;
    public p81.bar g0;
    public u03.b h0;
    public ae.i i0;
    public yp1.baz j0;
    public nd1.bar k0;
    public qc3.bar l0;
    public d91.q0 m0;
    public final ho2.d o0;
    public final ah1.qux p0;
    public final ah3.i q0;
    public final kotlin.Lazy r0;
    public final /* synthetic */ i.d0 d0 = new i.d0(0, 22);
    public final androidx.lifecycle.o1 n0 = new androidx.lifecycle.o1(kotlin.jvm.internal.k0.a.getOrCreateKotlinClass(kq1.m.class), new kq1.d(this, 1), new kq1.d(this, 0), new kq1.d(this, 2));

    public CallingGovServicesActivity() {
        kotlin.collections.h0 h0Var = kotlin.collections.h0.a;
        this.o0 = new ho2.d(h0Var, new kq1.a(this, 2));
        this.p0 = new ah1.qux(h0Var, new kq1.a(this, 3));
        this.q0 = new ah3.i((java.lang.Object) null);
        this.r0 = kotlin.LazyKt.lazy(new kq1.baz(this, 0));
    }

    public final void onActivityResult(int i, int i2, android.content.Intent intent) {
        super/*androidx.fragment.app.FragmentActivity*/.onActivityResult(i, i2, intent);
        if (i == 10000 && i2 == -1) {
            d91.q0 q0Var = this.m0;
            if (q0Var != null) {
                ((com.truecaller.gov_services.ui.main.view.RegionSelectionView) ((d91.d) q0Var.i).d).G(true);
            } else {
                kotlin.jvm.internal.Intrinsics.n("binding");
                throw null;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v21, types: [com.truecaller.gov_services.ui.main.view.RegionSelectionView, android.view.View] */
    @Override // com.truecaller.gov_services.ui.main.Hilt_CallingGovServicesActivity
    public final void onCreate(android.os.Bundle bundle) {
        java.lang.String str;
        android.os.Bundle extras;
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        final int i = 1;
        yy.qux.B(this, true, ex2.a.a);
        super.onCreate(bundle);
        df3.bar barVar = null;
        final int i2 = 0;
        androidx.constraintlayout.widget.ConstraintLayout inflate = getLayoutInflater().inflate(2131558455, (android.view.ViewGroup) null, false);
        int i3 = 2131362764;
        androidx.compose.ui.platform.ComposeView o = df0.qux.o(2131362764, inflate);
        if (o != null) {
            androidx.constraintlayout.widget.ConstraintLayout constraintLayout = inflate;
            i3 = 2131363308;
            com.google.android.material.button.MaterialButton o2 = df0.qux.o(2131363308, inflate);
            if (o2 != null) {
                i3 = 2131363484;
                androidx.constraintlayout.widget.ConstraintLayout o3 = df0.qux.o(2131363484, inflate);
                if (o3 != null) {
                    androidx.constraintlayout.widget.ConstraintLayout constraintLayout2 = o3;
                    int i4 = 2131363539;
                    com.truecaller.gov_services.ui.main.view.ChipButton chipButton = (com.truecaller.gov_services.ui.main.view.ChipButton) df0.qux.o(2131363539, o3);
                    if (chipButton != null) {
                        i4 = 2131363909;
                        if (((android.widget.HorizontalScrollView) df0.qux.o(2131363909, o3)) != null) {
                            i4 = 2131364953;
                            com.truecaller.gov_services.ui.main.view.ChipButton chipButton2 = (com.truecaller.gov_services.ui.main.view.ChipButton) df0.qux.o(2131364953, o3);
                            if (chipButton2 != null) {
                                i4 = 2131364969;
                                androidx.recyclerview.widget.RecyclerView o4 = df0.qux.o(2131364969, o3);
                                if (o4 != null) {
                                    i4 = 2131366441;
                                    androidx.appcompat.widget.AppCompatTextView o5 = df0.qux.o(2131366441, o3);
                                    if (o5 != null) {
                                        d91.d dVar = new d91.d(constraintLayout2, constraintLayout2, chipButton, chipButton2, o4, o5);
                                        i3 = 2131363691;
                                        if (df0.qux.o(2131363691, inflate) != null) {
                                            i3 = 2131363693;
                                            if (df0.qux.o(2131363693, inflate) != null) {
                                                i3 = 2131363697;
                                                if (df0.qux.o(2131363697, inflate) != null) {
                                                    i3 = 2131364341;
                                                    androidx.constraintlayout.widget.Group o6 = df0.qux.o(2131364341, inflate);
                                                    if (o6 != null) {
                                                        i3 = 2131364643;
                                                        android.view.View o7 = df0.qux.o(2131364643, inflate);
                                                        if (o7 != null) {
                                                            d41.a a = d41.a.a(o7);
                                                            i3 = 2131365005;
                                                            com.google.android.material.progressindicator.CircularProgressIndicator o8 = df0.qux.o(2131365005, inflate);
                                                            if (o8 != null) {
                                                                i3 = 2131365040;
                                                                androidx.core.widget.NestedScrollView o9 = df0.qux.o(2131365040, inflate);
                                                                if (o9 != null) {
                                                                    int i5 = 2131364967;
                                                                    androidx.recyclerview.widget.RecyclerView o10 = df0.qux.o(2131364967, o9);
                                                                    if (o10 != null) {
                                                                        i5 = 2131364978;
                                                                        androidx.recyclerview.widget.RecyclerView o11 = df0.qux.o(2131364978, o9);
                                                                        if (o11 != null) {
                                                                            androidx.core.widget.NestedScrollView nestedScrollView = o9;
                                                                            i5 = 2131365926;
                                                                            if (df0.qux.o(2131365926, o9) != null) {
                                                                                i5 = 2131366029;
                                                                                com.truecaller.gov_services.ui.main.view.RegionSelectionView regionSelectionView = (com.truecaller.gov_services.ui.main.view.RegionSelectionView) df0.qux.o(2131366029, o9);
                                                                                if (regionSelectionView != null) {
                                                                                    i5 = 2131367412;
                                                                                    android.view.View o13 = df0.qux.o(2131367412, o9);
                                                                                    if (o13 != null) {
                                                                                        d91.d dVar2 = new d91.d(nestedScrollView, o10, o11, nestedScrollView, regionSelectionView, o13);
                                                                                        i3 = 2131367108;
                                                                                        com.google.android.material.appbar.MaterialToolbar o14 = df0.qux.o(2131367108, inflate);
                                                                                        if (o14 != null) {
                                                                                            d91.q0 q0Var = new d91.q0(constraintLayout, o, constraintLayout, o2, dVar, o6, a, o8, dVar2, o14);
                                                                                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(q0Var, "inflate(...)");
                                                                                            this.m0 = q0Var;
                                                                                            setContentView(constraintLayout);
                                                                                            d91.q0 q0Var2 = this.m0;
                                                                                            if (q0Var2 != null) {
                                                                                                setSupportActionBar(q0Var2.j);
                                                                                                d91.q0 q0Var3 = this.m0;
                                                                                                if (q0Var3 != null) {
                                                                                                    androidx.constraintlayout.widget.ConstraintLayout constraintLayout3 = q0Var3.b;
                                                                                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(constraintLayout3, "getRoot(...)");
                                                                                                    ak.r0.i(constraintLayout3, com.truecaller.common.ui.insets.InsetType.SystemBars);
                                                                                                    i.baz supportActionBar = getSupportActionBar();
                                                                                                    if (supportActionBar != null) {
                                                                                                        supportActionBar.A(2132021651);
                                                                                                        supportActionBar.p(true);
                                                                                                    }
                                                                                                    getOnBackPressedDispatcher().a(this, new ah.h0(this, 16));
                                                                                                    k0.h hVar = new k0.h(this, 7);
                                                                                                    d91.q0 q0Var4 = this.m0;
                                                                                                    if (q0Var4 != null) {
                                                                                                        d41.a aVar = (d41.a) q0Var4.g;
                                                                                                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(aVar, "includeSearchToolbar");
                                                                                                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(aVar, "toolbarTcxSearchBinding");
                                                                                                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hVar, "listener");
                                                                                                        i.d0 d0Var = this.d0;
                                                                                                        d0Var.F(aVar, hVar);
                                                                                                        d41.a aVar2 = (d41.a) d0Var.b;
                                                                                                        if (aVar2 != null) {
                                                                                                            aVar2.e.setHint(2132021613);
                                                                                                            d91.q0 q0Var5 = this.m0;
                                                                                                            if (q0Var5 != null) {
                                                                                                                ((androidx.constraintlayout.widget.ConstraintLayout) q0Var5.d).setOnClickListener(new android.view.View.OnClickListener(this) { // from class: kq1.bar
                                                                                                                    public final /* synthetic */ com.truecaller.gov_services.ui.main.CallingGovServicesActivity b;

                                                                                                                    {
                                                                                                                        this.b = this;
                                                                                                                    }

                                                                                                                    @Override // android.view.View.OnClickListener
                                                                                                                    public final void onClick(android.view.View view) {
                                                                                                                        long j;
                                                                                                                        int i6 = i2;
                                                                                                                        int i7 = 1;
                                                                                                                        com.truecaller.gov_services.ui.main.CallingGovServicesActivity callingGovServicesActivity = this.b;
                                                                                                                        switch (i6) {
                                                                                                                            case 0:
                                                                                                                                int i8 = com.truecaller.gov_services.ui.main.CallingGovServicesActivity.s0;
                                                                                                                                kq1.m t0 = callingGovServicesActivity.t0();
                                                                                                                                ig3.h2 h2Var = t0.r;
                                                                                                                                if (h2Var.getValue() instanceof kq1.q) {
                                                                                                                                    h2Var.p((java.lang.Object) null, kq1.r.a);
                                                                                                                                    fg3.h0.J(androidx.lifecycle.g1.l(t0), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new kq1.h(t0, null, i7), 3);
                                                                                                                                    return;
                                                                                                                                }
                                                                                                                                return;
                                                                                                                            case 1:
                                                                                                                                int i9 = com.truecaller.gov_services.ui.main.CallingGovServicesActivity.s0;
                                                                                                                                h0.s sVar = nq1.bar.l;
                                                                                                                                androidx.fragment.app.g1 supportFragmentManager = callingGovServicesActivity.getSupportFragmentManager();
                                                                                                                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                                                                                                                                sVar.getClass();
                                                                                                                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(supportFragmentManager, "fragmentManager");
                                                                                                                                if (supportFragmentManager.G("StateSelectionBottomSheet") == null) {
                                                                                                                                    new nq1.bar().show(supportFragmentManager, "StateSelectionBottomSheet");
                                                                                                                                    supportFragmentManager.B(true);
                                                                                                                                    supportFragmentManager.I();
                                                                                                                                    return;
                                                                                                                                }
                                                                                                                                return;
                                                                                                                            case 2:
                                                                                                                                int i10 = com.truecaller.gov_services.ui.main.CallingGovServicesActivity.s0;
                                                                                                                                h02.qux quxVar = jq1.bar.l;
                                                                                                                                androidx.fragment.app.g1 supportFragmentManager2 = callingGovServicesActivity.getSupportFragmentManager();
                                                                                                                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(supportFragmentManager2, "getSupportFragmentManager(...)");
                                                                                                                                quxVar.getClass();
                                                                                                                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(supportFragmentManager2, "fragmentManager");
                                                                                                                                new jq1.bar().show(supportFragmentManager2, "GovLevelSelectionBottomSheet");
                                                                                                                                return;
                                                                                                                            default:
                                                                                                                                int i11 = com.truecaller.gov_services.ui.main.CallingGovServicesActivity.s0;
                                                                                                                                h02.qux quxVar2 = iq1.e.m;
                                                                                                                                androidx.fragment.app.g1 supportFragmentManager3 = callingGovServicesActivity.getSupportFragmentManager();
                                                                                                                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(supportFragmentManager3, "getSupportFragmentManager(...)");
                                                                                                                                fq1.o oVar = callingGovServicesActivity.t0().v;
                                                                                                                                long j2 = -1;
                                                                                                                                if (oVar != null) {
                                                                                                                                    j = oVar.a;
                                                                                                                                } else {
                                                                                                                                    j = -1;
                                                                                                                                }
                                                                                                                                fq1.bar barVar2 = callingGovServicesActivity.t0().w;
                                                                                                                                if (barVar2 != null) {
                                                                                                                                    j2 = barVar2.c;
                                                                                                                                }
                                                                                                                                quxVar2.getClass();
                                                                                                                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(supportFragmentManager3, "fragmentManager");
                                                                                                                                iq1.e eVar = new iq1.e();
                                                                                                                                android.os.Bundle bundle2 = new android.os.Bundle();
                                                                                                                                bundle2.putLong("paramSelectedStateId", j);
                                                                                                                                bundle2.putLong("paramSelectedCategoryId", j2);
                                                                                                                                eVar.setArguments(bundle2);
                                                                                                                                eVar.show(supportFragmentManager3, "GovDistrictSelectionBottomSheet");
                                                                                                                                return;
                                                                                                                        }
                                                                                                                    }
                                                                                                                });
                                                                                                                d91.d dVar3 = (d91.d) q0Var5.i;
                                                                                                                ?? r7 = (com.truecaller.gov_services.ui.main.view.RegionSelectionView) dVar3.d;
                                                                                                                androidx.recyclerview.widget.RecyclerView recyclerView = dVar3.c;
                                                                                                                r7.setOnLocationErrorCallback(new kq1.a(this, i));
                                                                                                                r7.setOnClickListener(new android.view.View.OnClickListener(this) { // from class: kq1.bar
                                                                                                                    public final /* synthetic */ com.truecaller.gov_services.ui.main.CallingGovServicesActivity b;

                                                                                                                    {
                                                                                                                        this.b = this;
                                                                                                                    }

                                                                                                                    @Override // android.view.View.OnClickListener
                                                                                                                    public final void onClick(android.view.View view) {
                                                                                                                        long j;
                                                                                                                        int i6 = i;
                                                                                                                        int i7 = 1;
                                                                                                                        com.truecaller.gov_services.ui.main.CallingGovServicesActivity callingGovServicesActivity = this.b;
                                                                                                                        switch (i6) {
                                                                                                                            case 0:
                                                                                                                                int i8 = com.truecaller.gov_services.ui.main.CallingGovServicesActivity.s0;
                                                                                                                                kq1.m t0 = callingGovServicesActivity.t0();
                                                                                                                                ig3.h2 h2Var = t0.r;
                                                                                                                                if (h2Var.getValue() instanceof kq1.q) {
                                                                                                                                    h2Var.p((java.lang.Object) null, kq1.r.a);
                                                                                                                                    fg3.h0.J(androidx.lifecycle.g1.l(t0), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new kq1.h(t0, null, i7), 3);
                                                                                                                                    return;
                                                                                                                                }
                                                                                                                                return;
                                                                                                                            case 1:
                                                                                                                                int i9 = com.truecaller.gov_services.ui.main.CallingGovServicesActivity.s0;
                                                                                                                                h0.s sVar = nq1.bar.l;
                                                                                                                                androidx.fragment.app.g1 supportFragmentManager = callingGovServicesActivity.getSupportFragmentManager();
                                                                                                                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                                                                                                                                sVar.getClass();
                                                                                                                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(supportFragmentManager, "fragmentManager");
                                                                                                                                if (supportFragmentManager.G("StateSelectionBottomSheet") == null) {
                                                                                                                                    new nq1.bar().show(supportFragmentManager, "StateSelectionBottomSheet");
                                                                                                                                    supportFragmentManager.B(true);
                                                                                                                                    supportFragmentManager.I();
                                                                                                                                    return;
                                                                                                                                }
                                                                                                                                return;
                                                                                                                            case 2:
                                                                                                                                int i10 = com.truecaller.gov_services.ui.main.CallingGovServicesActivity.s0;
                                                                                                                                h02.qux quxVar = jq1.bar.l;
                                                                                                                                androidx.fragment.app.g1 supportFragmentManager2 = callingGovServicesActivity.getSupportFragmentManager();
                                                                                                                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(supportFragmentManager2, "getSupportFragmentManager(...)");
                                                                                                                                quxVar.getClass();
                                                                                                                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(supportFragmentManager2, "fragmentManager");
                                                                                                                                new jq1.bar().show(supportFragmentManager2, "GovLevelSelectionBottomSheet");
                                                                                                                                return;
                                                                                                                            default:
                                                                                                                                int i11 = com.truecaller.gov_services.ui.main.CallingGovServicesActivity.s0;
                                                                                                                                h02.qux quxVar2 = iq1.e.m;
                                                                                                                                androidx.fragment.app.g1 supportFragmentManager3 = callingGovServicesActivity.getSupportFragmentManager();
                                                                                                                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(supportFragmentManager3, "getSupportFragmentManager(...)");
                                                                                                                                fq1.o oVar = callingGovServicesActivity.t0().v;
                                                                                                                                long j2 = -1;
                                                                                                                                if (oVar != null) {
                                                                                                                                    j = oVar.a;
                                                                                                                                } else {
                                                                                                                                    j = -1;
                                                                                                                                }
                                                                                                                                fq1.bar barVar2 = callingGovServicesActivity.t0().w;
                                                                                                                                if (barVar2 != null) {
                                                                                                                                    j2 = barVar2.c;
                                                                                                                                }
                                                                                                                                quxVar2.getClass();
                                                                                                                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(supportFragmentManager3, "fragmentManager");
                                                                                                                                iq1.e eVar = new iq1.e();
                                                                                                                                android.os.Bundle bundle2 = new android.os.Bundle();
                                                                                                                                bundle2.putLong("paramSelectedStateId", j);
                                                                                                                                bundle2.putLong("paramSelectedCategoryId", j2);
                                                                                                                                eVar.setArguments(bundle2);
                                                                                                                                eVar.show(supportFragmentManager3, "GovDistrictSelectionBottomSheet");
                                                                                                                                return;
                                                                                                                        }
                                                                                                                    }
                                                                                                                });
                                                                                                                r7.setOnLongClickListener(new aw2.c(this, dVar3));
                                                                                                                androidx.recyclerview.widget.RecyclerView recyclerView2 = (androidx.recyclerview.widget.RecyclerView) dVar3.e;
                                                                                                                recyclerView2.setAdapter(this.o0);
                                                                                                                recyclerView2.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(gj.m.a0(recyclerView2), 0, false));
                                                                                                                recyclerView.setAdapter(this.p0);
                                                                                                                recyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(gj.m.a0(recyclerView)));
                                                                                                                android.view.View view = dVar3.g;
                                                                                                                android.app.Activity O = ye0.k.O(this);
                                                                                                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(recyclerView, "listCategory");
                                                                                                                view.setOnTouchListener(new kq1.n(O, recyclerView, new i7.qux(28, this, dVar3)));
                                                                                                                d91.d dVar4 = (d91.d) q0Var5.e;
                                                                                                                final int i6 = 2;
                                                                                                                ((com.truecaller.gov_services.ui.main.view.ChipButton) dVar4.d).setOnClickListener(new android.view.View.OnClickListener(this) { // from class: kq1.bar
                                                                                                                    public final /* synthetic */ com.truecaller.gov_services.ui.main.CallingGovServicesActivity b;

                                                                                                                    {
                                                                                                                        this.b = this;
                                                                                                                    }

                                                                                                                    @Override // android.view.View.OnClickListener
                                                                                                                    public final void onClick(android.view.View view2) {
                                                                                                                        long j;
                                                                                                                        int i63 = i6;
                                                                                                                        int i7 = 1;
                                                                                                                        com.truecaller.gov_services.ui.main.CallingGovServicesActivity callingGovServicesActivity = this.b;
                                                                                                                        switch (i63) {
                                                                                                                            case 0:
                                                                                                                                int i8 = com.truecaller.gov_services.ui.main.CallingGovServicesActivity.s0;
                                                                                                                                kq1.m t0 = callingGovServicesActivity.t0();
                                                                                                                                ig3.h2 h2Var = t0.r;
                                                                                                                                if (h2Var.getValue() instanceof kq1.q) {
                                                                                                                                    h2Var.p((java.lang.Object) null, kq1.r.a);
                                                                                                                                    fg3.h0.J(androidx.lifecycle.g1.l(t0), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new kq1.h(t0, null, i7), 3);
                                                                                                                                    return;
                                                                                                                                }
                                                                                                                                return;
                                                                                                                            case 1:
                                                                                                                                int i9 = com.truecaller.gov_services.ui.main.CallingGovServicesActivity.s0;
                                                                                                                                h0.s sVar = nq1.bar.l;
                                                                                                                                androidx.fragment.app.g1 supportFragmentManager = callingGovServicesActivity.getSupportFragmentManager();
                                                                                                                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                                                                                                                                sVar.getClass();
                                                                                                                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(supportFragmentManager, "fragmentManager");
                                                                                                                                if (supportFragmentManager.G("StateSelectionBottomSheet") == null) {
                                                                                                                                    new nq1.bar().show(supportFragmentManager, "StateSelectionBottomSheet");
                                                                                                                                    supportFragmentManager.B(true);
                                                                                                                                    supportFragmentManager.I();
                                                                                                                                    return;
                                                                                                                                }
                                                                                                                                return;
                                                                                                                            case 2:
                                                                                                                                int i10 = com.truecaller.gov_services.ui.main.CallingGovServicesActivity.s0;
                                                                                                                                h02.qux quxVar = jq1.bar.l;
                                                                                                                                androidx.fragment.app.g1 supportFragmentManager2 = callingGovServicesActivity.getSupportFragmentManager();
                                                                                                                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(supportFragmentManager2, "getSupportFragmentManager(...)");
                                                                                                                                quxVar.getClass();
                                                                                                                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(supportFragmentManager2, "fragmentManager");
                                                                                                                                new jq1.bar().show(supportFragmentManager2, "GovLevelSelectionBottomSheet");
                                                                                                                                return;
                                                                                                                            default:
                                                                                                                                int i11 = com.truecaller.gov_services.ui.main.CallingGovServicesActivity.s0;
                                                                                                                                h02.qux quxVar2 = iq1.e.m;
                                                                                                                                androidx.fragment.app.g1 supportFragmentManager3 = callingGovServicesActivity.getSupportFragmentManager();
                                                                                                                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(supportFragmentManager3, "getSupportFragmentManager(...)");
                                                                                                                                fq1.o oVar = callingGovServicesActivity.t0().v;
                                                                                                                                long j2 = -1;
                                                                                                                                if (oVar != null) {
                                                                                                                                    j = oVar.a;
                                                                                                                                } else {
                                                                                                                                    j = -1;
                                                                                                                                }
                                                                                                                                fq1.bar barVar2 = callingGovServicesActivity.t0().w;
                                                                                                                                if (barVar2 != null) {
                                                                                                                                    j2 = barVar2.c;
                                                                                                                                }
                                                                                                                                quxVar2.getClass();
                                                                                                                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(supportFragmentManager3, "fragmentManager");
                                                                                                                                iq1.e eVar = new iq1.e();
                                                                                                                                android.os.Bundle bundle2 = new android.os.Bundle();
                                                                                                                                bundle2.putLong("paramSelectedStateId", j);
                                                                                                                                bundle2.putLong("paramSelectedCategoryId", j2);
                                                                                                                                eVar.setArguments(bundle2);
                                                                                                                                eVar.show(supportFragmentManager3, "GovDistrictSelectionBottomSheet");
                                                                                                                                return;
                                                                                                                        }
                                                                                                                    }
                                                                                                                });
                                                                                                                final int i7 = 3;
                                                                                                                ((com.truecaller.gov_services.ui.main.view.ChipButton) dVar4.f).setOnClickListener(new android.view.View.OnClickListener(this) { // from class: kq1.bar
                                                                                                                    public final /* synthetic */ com.truecaller.gov_services.ui.main.CallingGovServicesActivity b;

                                                                                                                    {
                                                                                                                        this.b = this;
                                                                                                                    }

                                                                                                                    @Override // android.view.View.OnClickListener
                                                                                                                    public final void onClick(android.view.View view2) {
                                                                                                                        long j;
                                                                                                                        int i63 = i7;
                                                                                                                        int i72 = 1;
                                                                                                                        com.truecaller.gov_services.ui.main.CallingGovServicesActivity callingGovServicesActivity = this.b;
                                                                                                                        switch (i63) {
                                                                                                                            case 0:
                                                                                                                                int i8 = com.truecaller.gov_services.ui.main.CallingGovServicesActivity.s0;
                                                                                                                                kq1.m t0 = callingGovServicesActivity.t0();
                                                                                                                                ig3.h2 h2Var = t0.r;
                                                                                                                                if (h2Var.getValue() instanceof kq1.q) {
                                                                                                                                    h2Var.p((java.lang.Object) null, kq1.r.a);
                                                                                                                                    fg3.h0.J(androidx.lifecycle.g1.l(t0), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new kq1.h(t0, null, i72), 3);
                                                                                                                                    return;
                                                                                                                                }
                                                                                                                                return;
                                                                                                                            case 1:
                                                                                                                                int i9 = com.truecaller.gov_services.ui.main.CallingGovServicesActivity.s0;
                                                                                                                                h0.s sVar = nq1.bar.l;
                                                                                                                                androidx.fragment.app.g1 supportFragmentManager = callingGovServicesActivity.getSupportFragmentManager();
                                                                                                                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                                                                                                                                sVar.getClass();
                                                                                                                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(supportFragmentManager, "fragmentManager");
                                                                                                                                if (supportFragmentManager.G("StateSelectionBottomSheet") == null) {
                                                                                                                                    new nq1.bar().show(supportFragmentManager, "StateSelectionBottomSheet");
                                                                                                                                    supportFragmentManager.B(true);
                                                                                                                                    supportFragmentManager.I();
                                                                                                                                    return;
                                                                                                                                }
                                                                                                                                return;
                                                                                                                            case 2:
                                                                                                                                int i10 = com.truecaller.gov_services.ui.main.CallingGovServicesActivity.s0;
                                                                                                                                h02.qux quxVar = jq1.bar.l;
                                                                                                                                androidx.fragment.app.g1 supportFragmentManager2 = callingGovServicesActivity.getSupportFragmentManager();
                                                                                                                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(supportFragmentManager2, "getSupportFragmentManager(...)");
                                                                                                                                quxVar.getClass();
                                                                                                                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(supportFragmentManager2, "fragmentManager");
                                                                                                                                new jq1.bar().show(supportFragmentManager2, "GovLevelSelectionBottomSheet");
                                                                                                                                return;
                                                                                                                            default:
                                                                                                                                int i11 = com.truecaller.gov_services.ui.main.CallingGovServicesActivity.s0;
                                                                                                                                h02.qux quxVar2 = iq1.e.m;
                                                                                                                                androidx.fragment.app.g1 supportFragmentManager3 = callingGovServicesActivity.getSupportFragmentManager();
                                                                                                                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(supportFragmentManager3, "getSupportFragmentManager(...)");
                                                                                                                                fq1.o oVar = callingGovServicesActivity.t0().v;
                                                                                                                                long j2 = -1;
                                                                                                                                if (oVar != null) {
                                                                                                                                    j = oVar.a;
                                                                                                                                } else {
                                                                                                                                    j = -1;
                                                                                                                                }
                                                                                                                                fq1.bar barVar2 = callingGovServicesActivity.t0().w;
                                                                                                                                if (barVar2 != null) {
                                                                                                                                    j2 = barVar2.c;
                                                                                                                                }
                                                                                                                                quxVar2.getClass();
                                                                                                                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(supportFragmentManager3, "fragmentManager");
                                                                                                                                iq1.e eVar = new iq1.e();
                                                                                                                                android.os.Bundle bundle2 = new android.os.Bundle();
                                                                                                                                bundle2.putLong("paramSelectedStateId", j);
                                                                                                                                bundle2.putLong("paramSelectedCategoryId", j2);
                                                                                                                                eVar.setArguments(bundle2);
                                                                                                                                eVar.show(supportFragmentManager3, "GovDistrictSelectionBottomSheet");
                                                                                                                                return;
                                                                                                                        }
                                                                                                                    }
                                                                                                                });
                                                                                                                androidx.recyclerview.widget.RecyclerView recyclerView3 = dVar4.c;
                                                                                                                recyclerView3.setAdapter((lq1.qux) this.r0.getValue());
                                                                                                                recyclerView3.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(gj.m.a0(recyclerView3)));
                                                                                                                recyclerView3.addOnScrollListener(new kq1.c(this));
                                                                                                                if (this.h0 != null) {
                                                                                                                    ig3.w1.F(new androidx.room.o(25, t0().u, new kq1.b(this, barVar, i2)), androidx.lifecycle.g1.j(this));
                                                                                                                    ig3.w1.F(new androidx.room.o(25, t0().s, new kq1.b(this, barVar, i)), androidx.lifecycle.g1.j(this));
                                                                                                                    android.content.Intent intent = getIntent();
                                                                                                                    if (intent == null || (extras = intent.getExtras()) == null || (str = extras.getString("entryPointContext")) == null) {
                                                                                                                        str = "profile";
                                                                                                                    }
                                                                                                                    yp1.baz bazVar = this.j0;
                                                                                                                    if (bazVar != null) {
                                                                                                                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "entryPointContext");
                                                                                                                        bd.bar.u(bazVar.a, "governmentServices", str);
                                                                                                                        d91.q0 q0Var6 = this.m0;
                                                                                                                        if (q0Var6 != null) {
                                                                                                                            androidx.compose.ui.platform.ComposeView composeView = q0Var6.c;
                                                                                                                            composeView.setViewCompositionStrategy(k4.r1.e);
                                                                                                                            composeView.setContent(new d3.qux(1996427712, new kq1.qux(this, i6), true));
                                                                                                                            return;
                                                                                                                        }
                                                                                                                        kotlin.jvm.internal.Intrinsics.n("binding");
                                                                                                                        throw null;
                                                                                                                    }
                                                                                                                    kotlin.jvm.internal.Intrinsics.n("analytics");
                                                                                                                    throw null;
                                                                                                                }
                                                                                                                kotlin.jvm.internal.Intrinsics.n("deviceInfoUtil");
                                                                                                                throw null;
                                                                                                            }
                                                                                                            kotlin.jvm.internal.Intrinsics.n("binding");
                                                                                                            throw null;
                                                                                                        }
                                                                                                        kotlin.jvm.internal.Intrinsics.n("searchToolbarBinding");
                                                                                                        throw null;
                                                                                                    }
                                                                                                    kotlin.jvm.internal.Intrinsics.n("binding");
                                                                                                    throw null;
                                                                                                }
                                                                                                kotlin.jvm.internal.Intrinsics.n("binding");
                                                                                                throw null;
                                                                                            }
                                                                                            kotlin.jvm.internal.Intrinsics.n("binding");
                                                                                            throw null;
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    throw new java.lang.NullPointerException("Missing required view with ID: ".concat(o9.getResources().getResourceName(i5)));
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    throw new java.lang.NullPointerException("Missing required view with ID: ".concat(o3.getResources().getResourceName(i4)));
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i3)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean onCreateOptionsMenu(android.view.Menu menu) {
        android.view.MenuItem findItem;
        getMenuInflater().inflate(2131689513, menu);
        if (menu != null && (findItem = menu.findItem(2131361951)) != null) {
            findItem.setVisible(t0().s.getValue() instanceof kq1.p);
        }
        return super/*android.app.Activity*/.onCreateOptionsMenu(menu);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean onOptionsItemSelected(android.view.MenuItem menuItem) {
        kq1.p pVar;
        java.lang.Boolean bool;
        java.lang.Boolean bool2;
        java.lang.Boolean bool3;
        java.lang.String str;
        boolean z;
        boolean z2;
        boolean z3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(menuItem, "item");
        if (menuItem.getItemId() == 2131361951) {
            kq1.m t0 = t0();
            u03.g0 g0Var = t0.b;
            ig3.h2 h2Var = t0.r;
            java.lang.Object value = h2Var.getValue();
            if (value instanceof kq1.p) {
                pVar = (kq1.p) value;
            } else {
                pVar = null;
            }
            if (pVar != null) {
                fq1.n nVar = pVar.b;
                if (pVar.a.d) {
                    str = g0Var.h(2132019039, new java.lang.Object[0]);
                } else {
                    if (nVar != null) {
                        if (nVar.a == com.truecaller.gov_services.data.GovLevel.STATE_HELPLINE) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        bool = java.lang.Boolean.valueOf(z3);
                    } else {
                        bool = null;
                    }
                    if (yp.d0.D(bool)) {
                        str = g0Var.h(2132019039, new java.lang.Object[0]);
                    } else {
                        if (nVar != null) {
                            if (nVar.a == com.truecaller.gov_services.data.GovLevel.STATE) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            bool2 = java.lang.Boolean.valueOf(z2);
                        } else {
                            bool2 = null;
                        }
                        if (yp.d0.D(bool2)) {
                            fq1.m mVar = pVar.c;
                            if (mVar != null) {
                                str = mVar.b;
                            } else {
                                str = null;
                            }
                        } else {
                            if (nVar != null) {
                                if (nVar.a == com.truecaller.gov_services.data.GovLevel.CENTRAL) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                bool3 = java.lang.Boolean.valueOf(z);
                            } else {
                                bool3 = null;
                            }
                            if (yp.d0.D(bool3)) {
                                str = g0Var.h(2132021648, new java.lang.Object[0]);
                            } else {
                                str = "";
                            }
                        }
                    }
                }
                java.lang.String h = g0Var.h(2132023381, new java.lang.Object[]{str});
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(h, "let(...)");
                java.util.List list = pVar.e;
                h2Var.p((java.lang.Object) null, new kq1.s("", false, pVar, h, list));
                t0.p.cancel((java.util.concurrent.CancellationException) null);
                t0.p = fg3.h0.J(androidx.lifecycle.g1.l(t0), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new kk1.c0(t0, pVar, list, (df3.bar) null), 3);
            }
            this.d0.G();
        }
        return super/*android.app.Activity*/.onOptionsItemSelected(menuItem);
    }

    public final boolean onSupportNavigateUp() {
        return u0();
    }

    public final kq1.m t0() {
        return (kq1.m) this.n0.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean u0() {
        long j;
        java.lang.Object obj;
        if (t0().s.getValue() instanceof kq1.s) {
            this.d0.d(false);
        }
        kq1.m t0 = t0();
        ig3.h2 h2Var = t0.r;
        kq1.v vVar = (kq1.v) h2Var.getValue();
        if (vVar instanceof kq1.s) {
            t0.p.cancel((java.util.concurrent.CancellationException) null);
            h2Var.o(((kq1.s) vVar).c);
        } else if (vVar instanceof kq1.p) {
            t0.o.cancel((java.util.concurrent.CancellationException) null);
            fq1.o oVar = t0.v;
            if (oVar != null) {
                j = oVar.a;
            } else {
                j = -1;
            }
            if (j == -1) {
                obj = kq1.u.a;
            } else {
                obj = kq1.t.a;
            }
            h2Var.p((java.lang.Object) null, obj);
        } else {
            finish();
            return true;
        }
        d91.q0 q0Var = this.m0;
        if (q0Var != null) {
            ((d91.d) q0Var.e).c.scrollToPosition(0);
            return false;
        }
        kotlin.jvm.internal.Intrinsics.n("binding");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [com.truecaller.gov_services.ui.main.view.ChipButton, android.view.View, java.lang.Object] */
    public final void v0(java.lang.Integer num, java.lang.String str) {
        boolean z;
        d91.q0 q0Var = this.m0;
        java.lang.String str2 = null;
        if (q0Var != null) {
            d91.d dVar = (d91.d) q0Var.e;
            if (num != null) {
                str2 = getString(num.intValue());
            }
            com.truecaller.gov_services.ui.main.view.ChipButton chipButton = (com.truecaller.gov_services.ui.main.view.ChipButton) dVar.d;
            ?? r3 = (com.truecaller.gov_services.ui.main.view.ChipButton) dVar.f;
            chipButton.setText(str2);
            androidx.constraintlayout.widget.ConstraintLayout constraintLayout = (com.truecaller.gov_services.ui.main.view.ChipButton) dVar.d;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(constraintLayout, "levelButton");
            boolean z2 = false;
            if (num != null) {
                z = true;
            } else {
                z = false;
            }
            gj.m.k0(constraintLayout, z);
            r3.setText(str);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue((java.lang.Object) r3, "districtButton");
            if (str != null) {
                z2 = true;
            }
            gj.m.k0((android.view.View) r3, z2);
            return;
        }
        kotlin.jvm.internal.Intrinsics.n("binding");
        throw null;
    }

    public final void w0(boolean z, boolean z2, boolean z3) {
        d91.q0 q0Var = this.m0;
        if (q0Var != null) {
            d91.d dVar = (d91.d) q0Var.i;
            androidx.core.widget.NestedScrollView nestedScrollView = dVar.f;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(nestedScrollView, "mainContent");
            gj.m.k0(nestedScrollView, z);
            android.view.View view = dVar.g;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(view, "viewCategoryClick");
            gj.m.k0(view, !z2);
            ah1.qux quxVar = this.p0;
            quxVar.n = z2;
            quxVar.notifyDataSetChanged();
            androidx.constraintlayout.widget.ConstraintLayout constraintLayout = (androidx.constraintlayout.widget.ConstraintLayout) ((d91.d) q0Var.e).e;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(constraintLayout, "detailsContent");
            gj.m.k0(constraintLayout, z3);
            return;
        }
        kotlin.jvm.internal.Intrinsics.n("binding");
        throw null;
    }

    public final void x0(java.lang.String str) {
        boolean z;
        d91.q0 q0Var = this.m0;
        if (q0Var != null) {
            androidx.appcompat.widget.AppCompatTextView appCompatTextView = ((d91.d) q0Var.e).g;
            kotlin.jvm.internal.Intrinsics.d(appCompatTextView);
            if (str != null) {
                z = true;
            } else {
                z = false;
            }
            gj.m.k0(appCompatTextView, z);
            appCompatTextView.setText(str);
            return;
        }
        kotlin.jvm.internal.Intrinsics.n("binding");
        throw null;
    }
}
