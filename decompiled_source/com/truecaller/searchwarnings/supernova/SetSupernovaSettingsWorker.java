package com.truecaller.searchwarnings.supernova;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B%\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/truecaller/searchwarnings/supernova/SetSupernovaSettingsWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "params", "Lyp2/h;", "supernovaSettingRepository", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lyp2/h;)V", "search-warnings_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class SetSupernovaSettingsWorker extends androidx.work.CoroutineWorker {
    public final yp2.h a;
    public final kotlin.Lazy b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetSupernovaSettingsWorker(@org.jetbrains.annotations.NotNull android.content.Context context, @org.jetbrains.annotations.NotNull androidx.work.WorkerParameters workerParameters, @org.jetbrains.annotations.NotNull yp2.h hVar) {
        super(context, workerParameters);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workerParameters, "params");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hVar, "supernovaSettingRepository");
        this.a = hVar;
        this.b = kotlin.LazyKt.lazy(new yf0.i4(this, 4));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object a(ff3.qux quxVar) {
        yp2.g gVar;
        int i;
        yp2.f fVar;
        if (quxVar instanceof yp2.g) {
            gVar = (yp2.g) quxVar;
            int i2 = gVar.z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gVar.z = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = gVar.x;
                ef3.bar barVar = ef3.bar.a;
                i = gVar.z;
                if (i == 0) {
                    if (i == 1) {
                        od.p.E(obj);
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    boolean booleanValue = ((java.lang.Boolean) this.b.getValue()).booleanValue();
                    gVar.z = 1;
                    v03.qux quxVar2 = (v03.qux) this.a;
                    obj = fg3.h0.W((kotlin.coroutines.CoroutineContext) quxVar2.b, new bf1.k(quxVar2, booleanValue, (df3.bar) null, 22), gVar);
                    if (obj == barVar) {
                        return barVar;
                    }
                }
                fVar = (yp2.f) obj;
                if (!(fVar instanceof yp2.e)) {
                    nd.s a = nd.t.a();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a, "success(...)");
                    return a;
                }
                if (fVar instanceof yp2.d) {
                    return com.ironsource.adqualitysdk.sdk.i.bar.q("retry(...)");
                }
                if (kotlin.jvm.internal.Intrinsics.b(fVar, yp2.c.a)) {
                    return com.ironsource.adqualitysdk.sdk.i.bar.q("retry(...)");
                }
                throw new java.lang.RuntimeException();
            }
        }
        gVar = new yp2.g(this, quxVar);
        java.lang.Object obj2 = gVar.x;
        ef3.bar barVar2 = ef3.bar.a;
        i = gVar.z;
        if (i == 0) {
        }
        fVar = (yp2.f) obj2;
        if (!(fVar instanceof yp2.e)) {
        }
    }

    public final java.lang.Object doWork(df3.bar barVar) {
        return a((ff3.qux) barVar);
    }
}
