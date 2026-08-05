package com.truecaller.bizmon.dynamicCalls.worker;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000fBA\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0006\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/truecaller/bizmon/dynamicCalls/worker/BizDynamicCallerInfoSyncWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "params", "Lqc3/bar;", "Lhi0/d;", "bizDynamicContactsManager", "Lqo1/qux;", "bizMonFeaturesInventory", "Lhi0/bar;", "bizDynamicContactProvider", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lqc3/bar;Lqc3/bar;Lhi0/bar;)V", "lf/bar", "bizmon_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class BizDynamicCallerInfoSyncWorker extends androidx.work.CoroutineWorker {
    public static final com.google.gson.Gson d = new com.google.gson.Gson();
    public final qc3.bar a;
    public final qc3.bar b;
    public final hi0.bar c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BizDynamicCallerInfoSyncWorker(@org.jetbrains.annotations.NotNull android.content.Context context, @org.jetbrains.annotations.NotNull androidx.work.WorkerParameters workerParameters, @org.jetbrains.annotations.NotNull qc3.bar barVar, @org.jetbrains.annotations.NotNull qc3.bar barVar2, @org.jetbrains.annotations.NotNull hi0.bar barVar3) {
        super(context, workerParameters);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workerParameters, "params");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "bizDynamicContactsManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar2, "bizMonFeaturesInventory");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar3, "bizDynamicContactProvider");
        this.a = barVar;
        this.b = barVar2;
        this.c = barVar3;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object doWork(df3.bar barVar) {
        mi0.baz bazVar;
        int i;
        try {
            if (barVar instanceof mi0.baz) {
                bazVar = (mi0.baz) barVar;
                int i2 = bazVar.z;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    bazVar.z = i2 - Integer.MIN_VALUE;
                    java.lang.Object obj = bazVar.x;
                    ef3.bar barVar2 = ef3.bar.a;
                    i = bazVar.z;
                    if (i == 0) {
                        if (i == 1) {
                            od.p.E(obj);
                        } else {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        od.p.E(obj);
                        if (!((qo1.qux) this.b.get()).f()) {
                            nd.q qVar = new nd.q();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(qVar, "failure(...)");
                            return qVar;
                        }
                        java.lang.String e = getInputData().e("dci_Data");
                        if (e != null) {
                            ji0.baz bazVar2 = (ji0.baz) d.fromJson(e, ji0.baz.class);
                            hi0.d dVar = (hi0.d) this.a.get();
                            kotlin.jvm.internal.Intrinsics.d(bazVar2);
                            bazVar.z = 1;
                            if (dVar.d(bazVar2, bazVar) == barVar2) {
                                return barVar2;
                            }
                        } else {
                            throw new java.lang.IllegalArgumentException("Required value was null.");
                        }
                    }
                    ((hi0.baz) this.c).b();
                    return nd.t.a();
                }
            }
            if (i == 0) {
            }
            ((hi0.baz) this.c).b();
            return nd.t.a();
        } catch (java.io.IOException unused) {
            return new java.lang.Object();
        } catch (java.lang.RuntimeException e2) {
            com.truecaller.log.AssertionUtil.reportThrowableButNeverCrash(new java.lang.Exception("Failed to solve DCI data", e2));
            return new nd.q();
        } catch (com.google.gson.v unused2) {
            return new nd.q();
        }
        bazVar = new mi0.baz(this, (ff3.qux) barVar);
        java.lang.Object obj2 = bazVar.x;
        ef3.bar barVar22 = ef3.bar.a;
        i = bazVar.z;
    }
}
