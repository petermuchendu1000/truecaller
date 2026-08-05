package com.truecaller.videocallerid.worker;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/truecaller/videocallerid/worker/VideoCallerIdCachingWorker;", "Lcom/truecaller/background_work/TrackedWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "video-caller-id_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class VideoCallerIdCachingWorker extends com.truecaller.background_work.TrackedWorker {
    public nc0.bar a;
    public qo1.m b;
    public r23.b c;
    public e23.bar d;
    public t23.f e;
    public f23.a f;
    public qo1.qux g;
    public final java.util.ArrayList h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoCallerIdCachingWorker(@org.jetbrains.annotations.NotNull android.content.Context context, @org.jetbrains.annotations.NotNull androidx.work.WorkerParameters workerParameters) {
        super(context, workerParameters);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workerParameters, "params");
        this.h = new java.util.ArrayList();
    }

    public final nc0.bar a() {
        nc0.bar barVar = this.a;
        if (barVar != null) {
            return barVar;
        }
        kotlin.jvm.internal.Intrinsics.n("analytics");
        throw null;
    }

    public final qo1.m b() {
        qo1.m mVar = this.b;
        if (mVar != null) {
            return mVar;
        }
        kotlin.jvm.internal.Intrinsics.n("platformFeaturesInventory");
        throw null;
    }

    public final boolean c() {
        qo1.a aVar = this.g;
        if (aVar != null) {
            return aVar.k();
        }
        kotlin.jvm.internal.Intrinsics.n("bizmonFeaturesInventory");
        throw null;
    }

    public final nd.t d() {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String e = getInputData().e("url_data");
        if (e == null) {
            nd.s a = nd.t.a();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a, "success(...)");
            return a;
        }
        java.lang.String e2 = getInputData().e("id_data");
        long d = getInputData().d("podp_data", 0L);
        java.lang.String e3 = getInputData().e("context_data");
        if (e3 == null) {
            str = "";
        } else {
            str = e3;
        }
        boolean a2 = getInputData().a("is_business", false);
        java.lang.String e4 = getInputData().e("business_number");
        java.lang.String e5 = getInputData().e("business_vid_id");
        if (e5 == null) {
            str2 = "";
        } else {
            str2 = e5;
        }
        java.lang.Object O = fg3.h0.O(kotlin.coroutines.d.a, new t23.d(getInputData().a("cache_first_frame_as_thumbnail", false), this, e, e2, a2, str2, e4, str, d, null));
        kotlin.jvm.internal.Intrinsics.d(O);
        return (nd.t) O;
    }
}
