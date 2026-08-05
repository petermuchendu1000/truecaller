package com.truecaller.insights.workers;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001BK\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/truecaller/insights/workers/InsightsResyncEventLogWorker;", "Lcom/truecaller/background_work/TrackedWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "params", "Lnc0/bar;", "analytics", "Lqo1/m;", "platformFeaturesInventory", "Lix1/d;", "insightsStatusProvider", "Llu1/k;", "insightsSyncStatusManager", "Lqc3/bar;", "Lzr1/g;", "insightsAnalyticsManager", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lnc0/bar;Lqo1/m;Lix1/d;Llu1/k;Lqc3/bar;)V", "core_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class InsightsResyncEventLogWorker extends com.truecaller.background_work.TrackedWorker {
    public final nc0.bar a;
    public final qo1.m b;
    public final ix1.d c;
    public final lu1.k d;
    public final qc3.bar e;
    public final java.util.LinkedHashMap f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InsightsResyncEventLogWorker(@org.jetbrains.annotations.NotNull android.content.Context context, @org.jetbrains.annotations.NotNull androidx.work.WorkerParameters workerParameters, @org.jetbrains.annotations.NotNull nc0.bar barVar, @org.jetbrains.annotations.NotNull qo1.m mVar, @org.jetbrains.annotations.NotNull ix1.d dVar, @org.jetbrains.annotations.NotNull lu1.k kVar, @org.jetbrains.annotations.NotNull qc3.bar barVar2) {
        super(context, workerParameters);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workerParameters, "params");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "analytics");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mVar, "platformFeaturesInventory");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dVar, "insightsStatusProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kVar, "insightsSyncStatusManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar2, "insightsAnalyticsManager");
        this.a = barVar;
        this.b = mVar;
        this.c = dVar;
        this.d = kVar;
        this.e = barVar2;
        this.f = new java.util.LinkedHashMap();
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
        return ((ix1.e) this.c).p();
    }

    public final nd.t d() {
        try {
            e();
            this.f.put("linking_model_time", java.lang.String.valueOf(getInputData().d("linking_model_time", 0L)));
            f();
            nd.s a = nd.t.a();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a, "success(...)");
            return a;
        } catch (java.lang.Exception e) {
            bt1.baz.b(null, e);
            ((lu1.l) this.d).a.l(3);
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter("", "feature");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter("", "eventCategory");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter("", "eventInfo");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter("", "context");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter("", "actionType");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter("", "actionInfo");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(linkedHashMap, "propertyMap");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter("rerun_sms_event", "<set-?>");
            java.util.LinkedHashMap j = kotlin.collections.r0.j(new kotlin.Pair[]{new kotlin.Pair("rerun_status", "true"), new kotlin.Pair("enrichment_status", "true"), new kotlin.Pair("pay_pdo_link_status", "true"), new kotlin.Pair("status_message", "EVENT_LOGGER_FAILED")});
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(j, "<set-?>");
            ((zr1.g) this.e.get()).e(new vu1.baz(new com.truecaller.insights.database.models.analytics.SimpleAnalyticsModel("rerun_sms_event", "", "", "", "", "", 0L, null, false, 448, null), kotlin.collections.r0.q(j)));
            nd.q qVar = new nd.q();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(qVar, "failure(...)");
            return qVar;
        }
    }

    public final void e() {
        this.f.putAll(kotlin.collections.r0.i(new kotlin.Pair[]{new kotlin.Pair("parsed_message_count", java.lang.String.valueOf(kotlin.collections.CollectionsKt.x0(kotlin.collections.y.j(new java.lang.Integer[]{java.lang.Integer.valueOf(getInputData().b("rerun_catg_bank", 0)), java.lang.Integer.valueOf(getInputData().b("rerun_catg_bill", 0)), java.lang.Integer.valueOf(getInputData().b("rerun_catg_event", 0)), java.lang.Integer.valueOf(getInputData().b("rerun_catg_OTP", 0)), java.lang.Integer.valueOf(getInputData().b("rerun_catg_notif", 0)), java.lang.Integer.valueOf(getInputData().b("rerun_catg_travel", 0)), java.lang.Integer.valueOf(getInputData().b("rerun_catg_offers", 0)), java.lang.Integer.valueOf(getInputData().b("rerun_catg_delivery", 0))})))), new kotlin.Pair("message_count", java.lang.String.valueOf(getInputData().b("message_count", 0))), new kotlin.Pair("parsing_time", java.lang.String.valueOf(getInputData().d("parsing_time", 0L))), new kotlin.Pair("rerun_exception_count", java.lang.String.valueOf(getInputData().b("rerun_exception_count", 0)))}));
    }

    public final void f() {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("", "feature");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("", "eventCategory");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("", "eventInfo");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("", "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("", "actionType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("", "actionInfo");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(linkedHashMap, "propertyMap");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("rerun_sms_event", "<set-?>");
        kotlin.Pair pair = new kotlin.Pair("enrichment_status", "true");
        java.lang.String e = getInputData().e("re_run_context");
        if (e == null) {
            e = "UNKNOWN";
        }
        java.util.LinkedHashMap j = kotlin.collections.r0.j(new kotlin.Pair[]{pair, new kotlin.Pair("re_run_context", e), new kotlin.Pair("rerun_status", "true")});
        j.putAll(this.f);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(j, "<set-?>");
        ((zr1.g) this.e.get()).e(new vu1.baz(new com.truecaller.insights.database.models.analytics.SimpleAnalyticsModel("rerun_sms_event", "", "", "", "", "", 0L, null, false, 448, null), kotlin.collections.r0.q(j)));
    }
}
