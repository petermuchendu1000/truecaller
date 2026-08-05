package com.truecaller.filters.sync;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0010B?\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/truecaller/filters/sync/FilterSettingsUploadWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "params", "Ln11/l;", "accountManager", "Lej0/baz;", "filterManager", "Lbn0/bar;", "callAssistantScreenSpamModeUpdater", "Lqo1/b;", "callAssistantFeaturesInventory", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Ln11/l;Lej0/baz;Lbn0/bar;Lqo1/b;)V", "oj3/e", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class FilterSettingsUploadWorker extends androidx.work.CoroutineWorker {
    public final n11.l a;
    public final ej0.baz b;
    public final bn0.bar c;
    public final qo1.b d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FilterSettingsUploadWorker(@org.jetbrains.annotations.NotNull android.content.Context context, @org.jetbrains.annotations.NotNull androidx.work.WorkerParameters workerParameters, @org.jetbrains.annotations.NotNull n11.l lVar, @org.jetbrains.annotations.NotNull ej0.baz bazVar, @org.jetbrains.annotations.Nullable bn0.bar barVar, @org.jetbrains.annotations.NotNull qo1.b bVar) {
        super(context, workerParameters);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workerParameters, "params");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lVar, "accountManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bazVar, "filterManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bVar, "callAssistantFeaturesInventory");
        this.a = lVar;
        this.b = bazVar;
        this.c = barVar;
        this.d = bVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:1|(2:3|(9:5|6|7|(1:(1:10)(2:21|22))(2:23|(2:25|26)(2:27|(2:29|30)(6:31|(2:33|(1:35))|12|(2:15|16)|19|20)))|11|12|(2:15|16)|19|20))|37|6|7|(0)(0)|11|12|(0)|19|20) */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object doWork(df3.bar barVar) {
        ap1.f fVar;
        int i;
        if (barVar instanceof ap1.f) {
            fVar = (ap1.f) barVar;
            int i2 = fVar.z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fVar.z = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = fVar.x;
                ef3.bar barVar2 = ef3.bar.a;
                i = fVar.z;
                boolean z = true;
                if (i == 0) {
                    if (i == 1) {
                        od.p.E(obj);
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    if (((qo1.c) this.d).b.a("featureAssistantSettingsForSpamCalls", com.truecaller.featuretoggles.FeatureState.ENABLED_ALPHA_DEBUG)) {
                        nd.s a = nd.t.a();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a, "success(...)");
                        return a;
                    }
                    if (!this.a.j()) {
                        nd.s a2 = nd.t.a();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a2, "success(...)");
                        return a2;
                    }
                    pr0.j jVar = this.c;
                    if (jVar != null) {
                        fVar.z = 1;
                        obj = jVar.d(fVar);
                        if (obj == barVar2) {
                            return barVar2;
                        }
                    }
                    if (!((to1.f) this.b).g() && z) {
                        nd.s a3 = nd.t.a();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a3, "success(...)");
                        return a3;
                    }
                    return wi0.bar.u("failure(...)");
                }
                z = ((java.lang.Boolean) obj).booleanValue();
                if (!((to1.f) this.b).g()) {
                    nd.s a33 = nd.t.a();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a33, "success(...)");
                    return a33;
                }
                return wi0.bar.u("failure(...)");
            }
        }
        fVar = new ap1.f(this, (ff3.qux) barVar);
        java.lang.Object obj2 = fVar.x;
        ef3.bar barVar22 = ef3.bar.a;
        i = fVar.z;
        boolean z2 = true;
        if (i == 0) {
        }
        z2 = ((java.lang.Boolean) obj2).booleanValue();
        if (!((to1.f) this.b).g()) {
        }
        return wi0.bar.u("failure(...)");
    }
}
