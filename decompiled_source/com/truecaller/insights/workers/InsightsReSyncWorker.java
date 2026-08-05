package com.truecaller.insights.workers;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0017Ba\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0010¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lcom/truecaller/insights/workers/InsightsReSyncWorker;", "Lcom/truecaller/background_work/TrackedWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "params", "Lnc0/bar;", "analytics", "Lqo1/m;", "platformFeaturesInventory", "Lix1/d;", "insightsStatusProvider", "Llu1/k;", "insightsSyncStatusManager", "Llu1/a;", "insightsSyncManager", "Lqc3/bar;", "Ls62/d;", "notificationManager", "Lzr1/g;", "insightsAnalyticsManager", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lnc0/bar;Lqo1/m;Lix1/d;Llu1/k;Llu1/a;Lqc3/bar;Lqc3/bar;)V", "lz1/bar", "core_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class InsightsReSyncWorker extends com.truecaller.background_work.TrackedWorker {
    public final android.content.Context a;
    public final nc0.bar b;
    public final qo1.m c;
    public final ix1.d d;
    public final lu1.k e;
    public final lu1.a f;
    public final qc3.bar g;
    public final qc3.bar h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InsightsReSyncWorker(@org.jetbrains.annotations.NotNull android.content.Context context, @org.jetbrains.annotations.NotNull androidx.work.WorkerParameters workerParameters, @org.jetbrains.annotations.NotNull nc0.bar barVar, @org.jetbrains.annotations.NotNull qo1.m mVar, @org.jetbrains.annotations.NotNull ix1.d dVar, @org.jetbrains.annotations.NotNull lu1.k kVar, @org.jetbrains.annotations.NotNull lu1.a aVar, @org.jetbrains.annotations.NotNull qc3.bar barVar2, @org.jetbrains.annotations.NotNull qc3.bar barVar3) {
        super(context, workerParameters);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workerParameters, "params");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "analytics");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mVar, "platformFeaturesInventory");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dVar, "insightsStatusProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kVar, "insightsSyncStatusManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(aVar, "insightsSyncManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar2, "notificationManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar3, "insightsAnalyticsManager");
        this.a = context;
        this.b = barVar;
        this.c = mVar;
        this.d = dVar;
        this.e = kVar;
        this.f = aVar;
        this.g = barVar2;
        this.h = barVar3;
    }

    public static final void e() {
        lz1.bar.c("re_run_context_qa_menu", true, false);
    }

    /* renamed from: a, reason: from getter */
    public final nc0.bar getB() {
        return this.b;
    }

    /* renamed from: b, reason: from getter */
    public final qo1.m getC() {
        return this.c;
    }

    public final boolean c() {
        return ((ix1.e) this.d).p();
    }

    public final nd.t d() {
        lu1.k kVar = this.e;
        try {
            boolean a = getInputData().a("re_run_param_clean", false);
            boolean a2 = getInputData().a("re_run_param_notify", false);
            hz1.d dVar = ((lu1.l) kVar).a;
            if (dVar.a.getInt("insightsReSyncStatus", 0) == 3) {
                dVar.l(6);
            } else {
                dVar.l(2);
            }
            return (nd.t) fg3.h0.O(kotlin.coroutines.d.a, new cr0.n(this, a2, a, (df3.bar) null, 1));
        } catch (java.lang.Exception e) {
            e.getLocalizedMessage();
            ((lu1.l) kVar).a.l(3);
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter("", "feature");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter("", "eventCategory");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter("", "eventInfo");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter("", "context");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter("", "actionType");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter("", "actionInfo");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(linkedHashMap, "propertyMap");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter("rerun_sms_event", "<set-?>");
            kotlin.Pair pair = new kotlin.Pair("rerun_status", "false");
            kotlin.Pair pair2 = new kotlin.Pair("enrichment_status", "false");
            java.lang.String e2 = getInputData().e("re_run_context");
            if (e2 == null) {
                e2 = "UNKNOWN";
            }
            java.util.LinkedHashMap j = kotlin.collections.r0.j(new kotlin.Pair[]{pair, pair2, new kotlin.Pair("re_run_context", e2)});
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(j, "<set-?>");
            ((zr1.g) this.h.get()).e(new vu1.baz(new com.truecaller.insights.database.models.analytics.SimpleAnalyticsModel("rerun_sms_event", "", "", "", "", "", 0L, null, false, 448, null), kotlin.collections.r0.q(j)));
            bt1.baz.b(null, e);
            return new nd.q();
        }
    }
}
