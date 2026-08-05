package com.truecaller.familyprotect.domain.status.worker;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B-\b\u0001\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/truecaller/familyprotect/domain/status/worker/BatteryStatusWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "params", "Llk1/a;", "localDataSource", "Lqj1/baz;", "repository", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Llk1/a;Lqj1/baz;)V", "domain_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class BatteryStatusWorker extends androidx.work.CoroutineWorker {
    public final lk1.a a;
    public final qj1.baz b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BatteryStatusWorker(@org.jetbrains.annotations.NotNull android.content.Context context, @org.jetbrains.annotations.NotNull androidx.work.WorkerParameters workerParameters, @org.jetbrains.annotations.NotNull lk1.a aVar, @org.jetbrains.annotations.NotNull qj1.baz bazVar) {
        super(context, workerParameters);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workerParameters, "params");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(aVar, "localDataSource");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bazVar, "repository");
        this.a = aVar;
        this.b = bazVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00bc, code lost:
    
        if (r13 == r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x007b, code lost:
    
        if (r13 != r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x005c, code lost:
    
        if (r13 == r1) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object doWork(df3.bar barVar) {
        dm1.baz bazVar;
        int i;
        com.truecaller.familyprotect.api.status.battery.BatteryLevel batteryLevel;
        boolean z;
        if (barVar instanceof dm1.baz) {
            bazVar = (dm1.baz) barVar;
            int i2 = bazVar.B;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bazVar.B = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = bazVar.z;
                java.lang.Object obj2 = ef3.bar.a;
                i = bazVar.B;
                lk1.a aVar = this.a;
                if (i == 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                if (i == 4) {
                                    od.p.E(obj);
                                    return nd.t.a();
                                }
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            z = bazVar.y;
                            od.p.E(obj);
                            if (!((java.lang.Boolean) obj).booleanValue()) {
                                bazVar.x = null;
                                bazVar.y = z;
                                bazVar.B = 4;
                                java.lang.Object obj3 = ((lk1.n) aVar).a.get();
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj3, "get(...)");
                                java.lang.Object W = ef0.a.W((t7.e) obj3, lk1.n.t, true, bazVar);
                                if (W != obj2) {
                                    W = kotlin.Unit.a;
                                }
                            } else {
                                if (getRunAttemptCount() < 3) {
                                    return new java.lang.Object();
                                }
                                return new nd.q();
                            }
                        } else {
                            batteryLevel = bazVar.x;
                            od.p.E(obj);
                            boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
                            bazVar.x = null;
                            bazVar.y = booleanValue;
                            bazVar.B = 3;
                            java.lang.Object t = this.b.t(batteryLevel, booleanValue, bazVar);
                            if (t != obj2) {
                                z = booleanValue;
                                obj = t;
                                if (!((java.lang.Boolean) obj).booleanValue()) {
                                }
                            }
                            return obj2;
                        }
                    } else {
                        od.p.E(obj);
                    }
                } else {
                    od.p.E(obj);
                    bazVar.B = 1;
                    obj = ((lk1.n) aVar).a(bazVar);
                }
                batteryLevel = (com.truecaller.familyprotect.api.status.battery.BatteryLevel) obj;
                bazVar.x = batteryLevel;
                bazVar.B = 2;
                java.lang.Object obj4 = ((lk1.n) aVar).a.get();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj4, "get(...)");
                obj = ef0.a.z((t7.e) obj4, lk1.n.r, false, bazVar);
            }
        }
        bazVar = new dm1.baz(this, (ff3.qux) barVar);
        java.lang.Object obj5 = bazVar.z;
        java.lang.Object obj22 = ef3.bar.a;
        i = bazVar.B;
        lk1.a aVar2 = this.a;
        if (i == 0) {
        }
        batteryLevel = (com.truecaller.familyprotect.api.status.battery.BatteryLevel) obj5;
        bazVar.x = batteryLevel;
        bazVar.B = 2;
        java.lang.Object obj42 = ((lk1.n) aVar2).a.get();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj42, "get(...)");
        obj5 = ef0.a.z((t7.e) obj42, lk1.n.r, false, bazVar);
    }
}
