package com.truecaller.searchwarnings.supernova;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\fB-\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/truecaller/searchwarnings/supernova/GetSupernovaSettingsWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "params", "Lyp2/h;", "supernovaSettingRepository", "Lr31/bar;", "coreSettings", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lyp2/h;Lr31/bar;)V", "ye0/e0", "search-warnings_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class GetSupernovaSettingsWorker extends androidx.work.CoroutineWorker {
    public final yp2.h a;
    public final r31.bar b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetSupernovaSettingsWorker(@org.jetbrains.annotations.NotNull android.content.Context context, @org.jetbrains.annotations.NotNull androidx.work.WorkerParameters workerParameters, @org.jetbrains.annotations.NotNull yp2.h hVar, @org.jetbrains.annotations.NotNull r31.bar barVar) {
        super(context, workerParameters);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workerParameters, "params");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hVar, "supernovaSettingRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "coreSettings");
        this.a = hVar;
        this.b = barVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object doWork(df3.bar barVar) {
        yp2.b bVar;
        int i;
        yp2.a aVar;
        if (barVar instanceof yp2.b) {
            bVar = (yp2.b) barVar;
            int i2 = bVar.z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.z = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = bVar.x;
                ef3.bar barVar2 = ef3.bar.a;
                i = bVar.z;
                boolean z = true;
                if (i == 0) {
                    if (i == 1) {
                        od.p.E(obj);
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    bVar.z = 1;
                    v03.qux quxVar = (v03.qux) this.a;
                    obj = fg3.h0.W((kotlin.coroutines.CoroutineContext) quxVar.b, new vb.b3(quxVar, (df3.bar) null, 25), bVar);
                    if (obj == barVar2) {
                        return barVar2;
                    }
                }
                aVar = (yp2.a) obj;
                if (!(aVar instanceof yp2.qux)) {
                    if (((yp2.qux) aVar).a != com.truecaller.api.services.searchwarnings.v1.models.SupernovaStatus.OPTED_IN) {
                        z = false;
                    }
                    this.b.k("supernovaOptIn", z);
                    return nd.t.a();
                }
                if (aVar instanceof yp2.baz) {
                    return com.ironsource.adqualitysdk.sdk.i.bar.q("retry(...)");
                }
                if (kotlin.jvm.internal.Intrinsics.b(aVar, yp2.bar.a)) {
                    return com.ironsource.adqualitysdk.sdk.i.bar.q("retry(...)");
                }
                throw new java.lang.RuntimeException();
            }
        }
        bVar = new yp2.b(this, (ff3.qux) barVar);
        java.lang.Object obj2 = bVar.x;
        ef3.bar barVar22 = ef3.bar.a;
        i = bVar.z;
        boolean z2 = true;
        if (i == 0) {
        }
        aVar = (yp2.a) obj2;
        if (!(aVar instanceof yp2.qux)) {
        }
    }
}
