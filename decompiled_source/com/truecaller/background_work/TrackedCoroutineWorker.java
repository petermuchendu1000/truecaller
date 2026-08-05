package com.truecaller.background_work;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/truecaller/background_work/TrackedCoroutineWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "background-work_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public abstract class TrackedCoroutineWorker extends androidx.work.CoroutineWorker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrackedCoroutineWorker(@org.jetbrains.annotations.NotNull android.content.Context context, @org.jetbrains.annotations.NotNull androidx.work.WorkerParameters workerParameters) {
        super(context, workerParameters);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workerParameters, "params");
    }

    public abstract nc0.bar a();

    /* renamed from: b */
    public abstract qo1.m getB();

    public abstract java.lang.Object c(df3.bar barVar);

    public abstract java.lang.Object d(df3.bar barVar);

    /* JADX WARN: Removed duplicated region for block: B:15:0x00f1 A[Catch: Exception -> 0x0036, TRY_LEAVE, TryCatch #1 {Exception -> 0x0036, blocks: (B:12:0x0031, B:13:0x00a9, B:15:0x00f1), top: B:11:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0071 A[Catch: Exception -> 0x0047, TryCatch #0 {Exception -> 0x0047, blocks: (B:26:0x0043, B:27:0x0069, B:29:0x0071, B:31:0x0096), top: B:25:0x0043 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0096 A[Catch: Exception -> 0x0047, TRY_LEAVE, TryCatch #0 {Exception -> 0x0047, blocks: (B:26:0x0043, B:27:0x0069, B:29:0x0071, B:31:0x0096), top: B:25:0x0043 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object doWork(df3.bar barVar) {
        uf0.k kVar;
        java.lang.Object obj;
        int i;
        java.lang.String str;
        java.lang.Exception e;
        java.lang.String str2;
        long j;
        if (barVar instanceof uf0.k) {
            kVar = (uf0.k) barVar;
            int i2 = kVar.B;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kVar.B = i2 - Integer.MIN_VALUE;
                obj = kVar.z;
                ef3.bar barVar2 = ef3.bar.a;
                i = kVar.B;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            j = kVar.y;
                            str = kVar.x;
                            try {
                                od.p.E(obj);
                                nd.t tVar = (nd.t) obj;
                                long elapsedRealtime = android.os.SystemClock.elapsedRealtime() - j;
                                java.lang.String str3 = "Worker " + str + " finished with result " + f40.d0.i(tVar) + " after " + elapsedRealtime + " ms";
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.MESSAGE_COLUMN);
                                w91.a.a(new java.lang.Object[]{str3});
                                if (getB().a.a("featureWorkManagerLog_38345", com.truecaller.featuretoggles.FeatureState.DISABLED)) {
                                    nc0.u1.e(new uf0.n(str, f40.d0.i(tVar), elapsedRealtime), a());
                                }
                                return tVar;
                            } catch (java.lang.Exception e2) {
                                e = e2;
                                com.truecaller.log.AssertionUtil.reportThrowableButNeverCrash(new c73.d1(k9.d.q("Failure in ", str), e));
                                throw e;
                            }
                        }
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str2 = kVar.x;
                    try {
                        od.p.E(obj);
                    } catch (java.lang.Exception e3) {
                        e = e3;
                        str = str2;
                        com.truecaller.log.AssertionUtil.reportThrowableButNeverCrash(new c73.d1(k9.d.q("Failure in ", str), e));
                        throw e;
                    }
                } else {
                    od.p.E(obj);
                    java.lang.String simpleName = getClass().getSimpleName();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
                    try {
                        kVar.x = simpleName;
                        kVar.B = 1;
                        java.lang.Object c = c(kVar);
                        if (c != barVar2) {
                            str2 = simpleName;
                            obj = c;
                        }
                        return barVar2;
                    } catch (java.lang.Exception e4) {
                        str = simpleName;
                        e = e4;
                        com.truecaller.log.AssertionUtil.reportThrowableButNeverCrash(new c73.d1(k9.d.q("Failure in ", str), e));
                        throw e;
                    }
                }
                if (((java.lang.Boolean) obj).booleanValue()) {
                    java.lang.String str4 = "Worker " + str2 + " was not run";
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.MESSAGE_COLUMN);
                    w91.a.a(new java.lang.Object[]{str4});
                    nd.s a = nd.t.a();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a, "success(...)");
                    return a;
                }
                long elapsedRealtime2 = android.os.SystemClock.elapsedRealtime();
                kVar.x = str2;
                kVar.y = elapsedRealtime2;
                kVar.B = 2;
                obj = d(kVar);
                if (obj != barVar2) {
                    str = str2;
                    j = elapsedRealtime2;
                    nd.t tVar2 = (nd.t) obj;
                    long elapsedRealtime3 = android.os.SystemClock.elapsedRealtime() - j;
                    java.lang.String str32 = "Worker " + str + " finished with result " + f40.d0.i(tVar2) + " after " + elapsedRealtime3 + " ms";
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str32, com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.MESSAGE_COLUMN);
                    w91.a.a(new java.lang.Object[]{str32});
                    if (getB().a.a("featureWorkManagerLog_38345", com.truecaller.featuretoggles.FeatureState.DISABLED)) {
                    }
                    return tVar2;
                }
                return barVar2;
            }
        }
        kVar = new uf0.k(this, (ff3.qux) barVar);
        obj = kVar.z;
        ef3.bar barVar22 = ef3.bar.a;
        i = kVar.B;
        if (i == 0) {
        }
        if (((java.lang.Boolean) obj).booleanValue()) {
        }
    }
}
