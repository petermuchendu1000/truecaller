package com.truecaller.ui;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class x0 implements android.widget.AdapterView.OnItemSelectedListener {
    public final /* synthetic */ com.truecaller.ui.b1 a;

    public x0(com.truecaller.ui.b1 b1Var) {
        this.a = b1Var;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(android.widget.AdapterView adapterView, android.view.View view, int i, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adapterView, "parent");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
        com.truecaller.ui.t0 t0Var = com.truecaller.ui.b1.n;
        com.truecaller.ui.n1 a6 = this.a.a6();
        com.truecaller.stats.StatsPeriod p = a6.p();
        java.util.List list = a6.o;
        if (p == list.get(i)) {
            return;
        }
        com.truecaller.stats.StatsPeriod statsPeriod = (com.truecaller.stats.StatsPeriod) list.get(i);
        a6.d.n("stats_preferred_period", statsPeriod.name());
        ig3.h2 h2Var = a6.p;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i);
        h2Var.getClass();
        h2Var.p((java.lang.Object) null, valueOf);
        com.truecaller.stats.StatsPeriod p2 = a6.p();
        com.truecaller.ui.StatsType statsType = com.truecaller.ui.StatsType.FILTER_CHANGED;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "statsPeriod");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(statsType, "statsType");
        fg3.h0.J(androidx.lifecycle.g1.l(a6), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new a93.t(a6, p2, statsType, (df3.bar) null, 12), 3);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(android.widget.AdapterView adapterView) {
    }
}
