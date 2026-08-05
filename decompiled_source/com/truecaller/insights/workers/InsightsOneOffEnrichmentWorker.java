package com.truecaller.insights.workers;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0015BS\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lcom/truecaller/insights/workers/InsightsOneOffEnrichmentWorker;", "Lcom/truecaller/background_work/TrackedWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "params", "Lnc0/bar;", "analytics", "Lqo1/m;", "platformFeaturesInventory", "Lkt1/bar;", "enrichmentManager", "Llu1/k;", "insightsSyncStatusManager", "Lix1/d;", "insightsStatusProvider", "Lqc3/bar;", "Lzr1/g;", "insightsAnalyticsManager", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lnc0/bar;Lqo1/m;Lkt1/bar;Llu1/k;Lix1/d;Lqc3/bar;)V", "lz1/bar", "core_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class InsightsOneOffEnrichmentWorker extends com.truecaller.background_work.TrackedWorker {
    public final nc0.bar a;
    public final qo1.m b;
    public final kt1.bar c;
    public final lu1.k d;
    public final ix1.d e;
    public final qc3.bar f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InsightsOneOffEnrichmentWorker(@org.jetbrains.annotations.NotNull android.content.Context context, @org.jetbrains.annotations.NotNull androidx.work.WorkerParameters workerParameters, @org.jetbrains.annotations.NotNull nc0.bar barVar, @org.jetbrains.annotations.NotNull qo1.m mVar, @org.jetbrains.annotations.NotNull kt1.bar barVar2, @org.jetbrains.annotations.NotNull lu1.k kVar, @org.jetbrains.annotations.NotNull ix1.d dVar, @org.jetbrains.annotations.NotNull qc3.bar barVar3) {
        super(context, workerParameters);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workerParameters, "params");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "analytics");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mVar, "platformFeaturesInventory");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar2, "enrichmentManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kVar, "insightsSyncStatusManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dVar, "insightsStatusProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar3, "insightsAnalyticsManager");
        this.a = barVar;
        this.b = mVar;
        this.c = barVar2;
        this.d = kVar;
        this.e = dVar;
        this.f = barVar3;
    }

    public static final void e() {
        lz1.bar.b();
    }

    /* renamed from: a, reason: from getter */
    public final nc0.bar getA() {
        return this.a;
    }

    /* renamed from: b, reason: from getter */
    public final qo1.m getB() {
        return this.b;
    }

    public final boolean c() {
        hz1.d dVar = ((lu1.l) this.d).a;
        if (dVar.a.getInt("insightsReSyncStatus", 0) == 4 || dVar.a.getInt("insightsReSyncStatus", 0) == 5) {
            kt1.h hVar = (kt1.h) this.c;
            if (((java.lang.Boolean) fg3.h0.O(hVar.j, new be1.w(hVar, null, 17))).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public final nd.t d() {
        long j;
        try {
            ix1.e eVar = (ix1.e) this.e;
            boolean h = eVar.h();
            kt1.bar barVar = this.c;
            if (h && !eVar.k) {
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                kt1.h hVar = (kt1.h) barVar;
                ea.c cVar = hVar.h;
                fj.a.c = cVar.F("linking/link_seed.json");
                fj.a.d = cVar.F("linking/prune_seed.json");
                fj.a.e = true;
                fg3.h0.O(hVar.j, new jp2.b(hVar, (df3.bar) null, 20));
                j = java.lang.System.currentTimeMillis() - currentTimeMillis;
            } else {
                j = 0;
            }
            try {
                ((kt1.h) barVar).d();
            } catch (java.lang.Exception e) {
                java.text.SimpleDateFormat simpleDateFormat = bt1.baz.a;
                java.lang.String message = e.getMessage();
                if (message == null) {
                    message = "Error linking account numbers";
                }
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
                java.lang.RuntimeException runtimeException = new java.lang.RuntimeException(message);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(runtimeException, "e");
                o82.a.C(runtimeException);
            }
            nd.b0 b0Var = new nd.b0();
            nd.g inputData = getInputData();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(inputData, "getInputData(...)");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inputData, "data");
            b0Var.c(inputData.a);
            b0Var.d("linking_model_time", j);
            return new nd.s(b0Var.a());
        } catch (java.lang.Exception e2) {
            e2.getLocalizedMessage();
            if (!getInputData().c().isEmpty()) {
                ((lu1.l) this.d).a.l(3);
            }
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter("", "feature");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter("", "eventCategory");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter("", "eventInfo");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter("", "context");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter("", "actionType");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter("", "actionInfo");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(linkedHashMap, "propertyMap");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter("rerun_sms_event", "<set-?>");
            kotlin.Pair pair = new kotlin.Pair("enrichment_status", "false");
            java.lang.String e3 = getInputData().e("re_run_context");
            if (e3 == null) {
                e3 = "UNKNOWN";
            }
            java.util.LinkedHashMap j2 = kotlin.collections.r0.j(new kotlin.Pair[]{pair, new kotlin.Pair("re_run_context", e3), new kotlin.Pair("rerun_status", "true")});
            j2.putAll(kotlin.collections.r0.i(new kotlin.Pair[]{new kotlin.Pair("parsed_message_count", java.lang.String.valueOf(kotlin.collections.CollectionsKt.x0(kotlin.collections.y.j(new java.lang.Integer[]{java.lang.Integer.valueOf(getInputData().b("rerun_catg_bank", 0)), java.lang.Integer.valueOf(getInputData().b("rerun_catg_bill", 0)), java.lang.Integer.valueOf(getInputData().b("rerun_catg_event", 0)), java.lang.Integer.valueOf(getInputData().b("rerun_catg_OTP", 0)), java.lang.Integer.valueOf(getInputData().b("rerun_catg_notif", 0)), java.lang.Integer.valueOf(getInputData().b("rerun_catg_travel", 0)), java.lang.Integer.valueOf(getInputData().b("rerun_catg_offers", 0)), java.lang.Integer.valueOf(getInputData().b("rerun_catg_delivery", 0))})))), new kotlin.Pair("message_count", java.lang.String.valueOf(getInputData().b("message_count", 0))), new kotlin.Pair("parsing_time", java.lang.String.valueOf(getInputData().d("parsing_time", 0L))), new kotlin.Pair("rerun_exception_count", java.lang.String.valueOf(getInputData().b("rerun_exception_count", 0)))}));
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(j2, "<set-?>");
            ((zr1.g) this.f.get()).e(new vu1.baz(new com.truecaller.insights.database.models.analytics.SimpleAnalyticsModel("rerun_sms_event", "", "", "", "", "", 0L, null, false, 448, null), kotlin.collections.r0.q(j2)));
            return new nd.q();
        }
    }
}
