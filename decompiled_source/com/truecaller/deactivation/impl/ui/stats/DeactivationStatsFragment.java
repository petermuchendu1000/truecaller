package com.truecaller.deactivation.impl.ui.stats;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/deactivation/impl/ui/stats/DeactivationStatsFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "impl_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class DeactivationStatsFragment extends r91.f {
    public static final /* synthetic */ kotlin.reflect.KProperty[] l = {kotlin.jvm.internal.k0.a.property1(new kotlin.jvm.internal.a0("binding", 0, "getBinding()Lcom/truecaller/deactivation/impl/databinding/FragmentDeactivationStatsBinding;", com.truecaller.deactivation.impl.ui.stats.DeactivationStatsFragment.class))};
    public final j13.bar i;
    public final androidx.lifecycle.o1 j;
    public j01.qux k;

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.jvm.functions.Function1] */
    public DeactivationStatsFragment() {
        super(9);
        ?? obj = new java.lang.Object();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter((java.lang.Object) obj, "viewBinder");
        this.i = new j13.bar((kotlin.jvm.functions.Function1) obj);
        kotlin.Lazy lazy = kotlin.LazyKt.lazy(kotlin.k.c, new u91.b(new u91.b(this, 0), 1));
        this.j = new androidx.lifecycle.o1(kotlin.jvm.internal.k0.a.getOrCreateKotlinClass(u91.h.class), new tf1.qux(lazy, 5), new sz1.b(10, this, lazy), new tf1.qux(lazy, 6));
    }

    public final h91.a Z5() {
        return (h91.a) this.i.a(this, l[0]);
    }

    public final u91.h a6() {
        return (u91.h) this.j.getValue();
    }

    public final void onViewCreated(android.view.View view, android.os.Bundle bundle) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        final int i = 0;
        final int i2 = 1;
        df3.bar barVar = null;
        if (bundle == null) {
            androidx.fragment.app.g1 childFragmentManager = getChildFragmentManager();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            childFragmentManager.getClass();
            androidx.fragment.app.bar barVar2 = new androidx.fragment.app.bar(childFragmentManager);
            com.truecaller.ui.b1.n.getClass();
            com.truecaller.ui.b1 b1Var = new com.truecaller.ui.b1();
            b1Var.setArguments(ue0.i.t(new kotlin.Pair[]{new kotlin.Pair("EXTRA_CAN_SHARE_STATS", java.lang.Boolean.FALSE)}));
            barVar2.g(2131366641, b1Var, (java.lang.String) null);
            barVar2.l();
        }
        Z5().c.setOnClickListener(new android.view.View.OnClickListener(this) { // from class: u91.bar
            public final /* synthetic */ com.truecaller.deactivation.impl.ui.stats.DeactivationStatsFragment b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                l91.d dVar;
                int i3 = i;
                com.truecaller.deactivation.impl.ui.stats.DeactivationStatsFragment deactivationStatsFragment = this.b;
                switch (i3) {
                    case 0:
                        kotlin.reflect.KProperty[] kPropertyArr = com.truecaller.deactivation.impl.ui.stats.DeactivationStatsFragment.l;
                        u91.h a6 = deactivationStatsFragment.a6();
                        a6.e.e(u91.e.a);
                        a6.b.e("contributionDetails");
                        return;
                    case 1:
                        kotlin.reflect.KProperty[] kPropertyArr2 = com.truecaller.deactivation.impl.ui.stats.DeactivationStatsFragment.l;
                        u91.h a63 = deactivationStatsFragment.a6();
                        a63.e.e(u91.e.b);
                        f63.qux.y(a63.b, "contributionDetails");
                        return;
                    default:
                        kotlin.reflect.KProperty[] kPropertyArr3 = com.truecaller.deactivation.impl.ui.stats.DeactivationStatsFragment.l;
                        u91.h a64 = deactivationStatsFragment.a6();
                        ig3.v1 v1Var = a64.e;
                        boolean a = ((qo1.s) a64.c).b.a("featureNewDeactivationLiveChat", com.truecaller.featuretoggles.FeatureState.DISABLED);
                        if (a) {
                            v1Var.e(u91.e.c);
                        } else {
                            v1Var.e(u91.e.d);
                        }
                        if (a) {
                            dVar = l91.d.e;
                        } else {
                            dVar = l91.d.g;
                        }
                        a64.b.f(dVar, "contributionDetails");
                        return;
                }
            }
        });
        Z5().d.setOnClickListener(new android.view.View.OnClickListener(this) { // from class: u91.bar
            public final /* synthetic */ com.truecaller.deactivation.impl.ui.stats.DeactivationStatsFragment b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                l91.d dVar;
                int i3 = i2;
                com.truecaller.deactivation.impl.ui.stats.DeactivationStatsFragment deactivationStatsFragment = this.b;
                switch (i3) {
                    case 0:
                        kotlin.reflect.KProperty[] kPropertyArr = com.truecaller.deactivation.impl.ui.stats.DeactivationStatsFragment.l;
                        u91.h a6 = deactivationStatsFragment.a6();
                        a6.e.e(u91.e.a);
                        a6.b.e("contributionDetails");
                        return;
                    case 1:
                        kotlin.reflect.KProperty[] kPropertyArr2 = com.truecaller.deactivation.impl.ui.stats.DeactivationStatsFragment.l;
                        u91.h a63 = deactivationStatsFragment.a6();
                        a63.e.e(u91.e.b);
                        f63.qux.y(a63.b, "contributionDetails");
                        return;
                    default:
                        kotlin.reflect.KProperty[] kPropertyArr3 = com.truecaller.deactivation.impl.ui.stats.DeactivationStatsFragment.l;
                        u91.h a64 = deactivationStatsFragment.a6();
                        ig3.v1 v1Var = a64.e;
                        boolean a = ((qo1.s) a64.c).b.a("featureNewDeactivationLiveChat", com.truecaller.featuretoggles.FeatureState.DISABLED);
                        if (a) {
                            v1Var.e(u91.e.c);
                        } else {
                            v1Var.e(u91.e.d);
                        }
                        if (a) {
                            dVar = l91.d.e;
                        } else {
                            dVar = l91.d.g;
                        }
                        a64.b.f(dVar, "contributionDetails");
                        return;
                }
            }
        });
        final int i3 = 2;
        Z5().b.setOnClickListener(new android.view.View.OnClickListener(this) { // from class: u91.bar
            public final /* synthetic */ com.truecaller.deactivation.impl.ui.stats.DeactivationStatsFragment b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                l91.d dVar;
                int i33 = i3;
                com.truecaller.deactivation.impl.ui.stats.DeactivationStatsFragment deactivationStatsFragment = this.b;
                switch (i33) {
                    case 0:
                        kotlin.reflect.KProperty[] kPropertyArr = com.truecaller.deactivation.impl.ui.stats.DeactivationStatsFragment.l;
                        u91.h a6 = deactivationStatsFragment.a6();
                        a6.e.e(u91.e.a);
                        a6.b.e("contributionDetails");
                        return;
                    case 1:
                        kotlin.reflect.KProperty[] kPropertyArr2 = com.truecaller.deactivation.impl.ui.stats.DeactivationStatsFragment.l;
                        u91.h a63 = deactivationStatsFragment.a6();
                        a63.e.e(u91.e.b);
                        f63.qux.y(a63.b, "contributionDetails");
                        return;
                    default:
                        kotlin.reflect.KProperty[] kPropertyArr3 = com.truecaller.deactivation.impl.ui.stats.DeactivationStatsFragment.l;
                        u91.h a64 = deactivationStatsFragment.a6();
                        ig3.v1 v1Var = a64.e;
                        boolean a = ((qo1.s) a64.c).b.a("featureNewDeactivationLiveChat", com.truecaller.featuretoggles.FeatureState.DISABLED);
                        if (a) {
                            v1Var.e(u91.e.c);
                        } else {
                            v1Var.e(u91.e.d);
                        }
                        if (a) {
                            dVar = l91.d.e;
                        } else {
                            dVar = l91.d.g;
                        }
                        a64.b.f(dVar, "contributionDetails");
                        return;
                }
            }
        });
        androidx.lifecycle.d0 viewLifecycleOwner = getViewLifecycleOwner();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        fg3.h0.J(androidx.lifecycle.g1.j(viewLifecycleOwner), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new u91.qux(this, barVar, i2), 3);
        androidx.lifecycle.d0 viewLifecycleOwner2 = getViewLifecycleOwner();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        fg3.h0.J(androidx.lifecycle.g1.j(viewLifecycleOwner2), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new u91.qux(this, barVar, 3), 3);
    }
}
