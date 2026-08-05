package com.truecaller.rewardprogram.impl.ui.qa;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/truecaller/rewardprogram/impl/ui/qa/j;", "Landroidx/lifecycle/n1;", "impl_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class j extends androidx.lifecycle.n1 {
    public final lk2.n b;
    public final dq1.h c;
    public final wt.l d;
    public final d3.g e;
    public final o02.baz f;
    public final wt.l g;
    public final kr0.o h;
    public final hx1.b i;
    public final ig3.h2 j;
    public final ig3.q1 k;

    public j(lk2.n nVar, dq1.h hVar, wt.l lVar, d3.g gVar, o02.baz bazVar, wt.l lVar2, kr0.o oVar, hx1.b bVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nVar, "localDataSource");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hVar, "contributionsRepo");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lVar, "recurringTasksRepo");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gVar, "bonusTasksRepo");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bazVar, "maybeGrantClaimableRewardUseCase");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lVar2, "collectRecurringTaskUseCase");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(oVar, "deleteRewardUseCase");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bVar, "joinRewardProgramRepo");
        this.b = nVar;
        this.c = hVar;
        this.d = lVar;
        this.e = gVar;
        this.f = bazVar;
        this.g = lVar2;
        this.h = oVar;
        this.i = bVar;
        ig3.h2 c = ig3.w1.c((java.lang.Object) null);
        this.j = c;
        this.k = new ig3.q1(c);
    }

    public final void o(java.lang.String str, kotlin.jvm.functions.Function1 function1) {
        fg3.h0.J(androidx.lifecycle.g1.l(this), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new com.truecaller.editprofile.impl.ui.legacy.m(function1, this, str, (df3.bar) null), 3);
    }
}
