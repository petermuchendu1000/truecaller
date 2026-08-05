package com.truecaller.callhistory;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001:\u0001\u000eB5\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/truecaller/callhistory/CallHistoryFullSyncWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "params", "Lsu0/b;", "callHistoryManager", "Lhw0/a;", "callingSettings", "Lwu0/a;", "performanceAnalyticsHelper", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lsu0/b;Lhw0/a;Lwu0/a;)V", "su0/baz", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class CallHistoryFullSyncWorker extends androidx.work.CoroutineWorker {
    public static final su0.baz d = new java.lang.Object();
    public final su0.b a;
    public final hw0.a b;
    public final wu0.a c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CallHistoryFullSyncWorker(@org.jetbrains.annotations.NotNull android.content.Context context, @org.jetbrains.annotations.NotNull androidx.work.WorkerParameters workerParameters, @org.jetbrains.annotations.NotNull su0.b bVar, @org.jetbrains.annotations.NotNull hw0.a aVar, @org.jetbrains.annotations.NotNull wu0.a aVar2) {
        super(context, workerParameters);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workerParameters, "params");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bVar, "callHistoryManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(aVar, "callingSettings");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(aVar2, "performanceAnalyticsHelper");
        this.a = bVar;
        this.b = aVar;
        this.c = aVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x01bd, code lost:
    
        if (((hw0.q) r0).l(true, r6) == r7) goto L61;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01af A[Catch: RuntimeException -> 0x0043, CancellationException -> 0x0046, TryCatch #2 {CancellationException -> 0x0046, RuntimeException -> 0x0043, blocks: (B:13:0x003c, B:15:0x01c0, B:17:0x01c8, B:18:0x01d4, B:24:0x0053, B:26:0x01a7, B:28:0x01af, B:31:0x01dc, B:33:0x01e6, B:34:0x01f0, B:37:0x006a, B:41:0x00c4, B:45:0x00fa, B:47:0x0102, B:48:0x0117, B:51:0x010c, B:56:0x012c, B:61:0x0084, B:67:0x00a3), top: B:7:0x0032 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01dc A[Catch: RuntimeException -> 0x0043, CancellationException -> 0x0046, TryCatch #2 {CancellationException -> 0x0046, RuntimeException -> 0x0043, blocks: (B:13:0x003c, B:15:0x01c0, B:17:0x01c8, B:18:0x01d4, B:24:0x0053, B:26:0x01a7, B:28:0x01af, B:31:0x01dc, B:33:0x01e6, B:34:0x01f0, B:37:0x006a, B:41:0x00c4, B:45:0x00fa, B:47:0x0102, B:48:0x0117, B:51:0x010c, B:56:0x012c, B:61:0x0084, B:67:0x00a3), top: B:7:0x0032 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c4 A[Catch: RuntimeException -> 0x0043, CancellationException -> 0x0046, TryCatch #2 {CancellationException -> 0x0046, RuntimeException -> 0x0043, blocks: (B:13:0x003c, B:15:0x01c0, B:17:0x01c8, B:18:0x01d4, B:24:0x0053, B:26:0x01a7, B:28:0x01af, B:31:0x01dc, B:33:0x01e6, B:34:0x01f0, B:37:0x006a, B:41:0x00c4, B:45:0x00fa, B:47:0x0102, B:48:0x0117, B:51:0x010c, B:56:0x012c, B:61:0x0084, B:67:0x00a3), top: B:7:0x0032 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0102 A[Catch: RuntimeException -> 0x0043, CancellationException -> 0x0046, TryCatch #2 {CancellationException -> 0x0046, RuntimeException -> 0x0043, blocks: (B:13:0x003c, B:15:0x01c0, B:17:0x01c8, B:18:0x01d4, B:24:0x0053, B:26:0x01a7, B:28:0x01af, B:31:0x01dc, B:33:0x01e6, B:34:0x01f0, B:37:0x006a, B:41:0x00c4, B:45:0x00fa, B:47:0x0102, B:48:0x0117, B:51:0x010c, B:56:0x012c, B:61:0x0084, B:67:0x00a3), top: B:7:0x0032 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x010c A[Catch: RuntimeException -> 0x0043, CancellationException -> 0x0046, TryCatch #2 {CancellationException -> 0x0046, RuntimeException -> 0x0043, blocks: (B:13:0x003c, B:15:0x01c0, B:17:0x01c8, B:18:0x01d4, B:24:0x0053, B:26:0x01a7, B:28:0x01af, B:31:0x01dc, B:33:0x01e6, B:34:0x01f0, B:37:0x006a, B:41:0x00c4, B:45:0x00fa, B:47:0x0102, B:48:0x0117, B:51:0x010c, B:56:0x012c, B:61:0x0084, B:67:0x00a3), top: B:7:0x0032 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x012c A[Catch: RuntimeException -> 0x0043, CancellationException -> 0x0046, TryCatch #2 {CancellationException -> 0x0046, RuntimeException -> 0x0043, blocks: (B:13:0x003c, B:15:0x01c0, B:17:0x01c8, B:18:0x01d4, B:24:0x0053, B:26:0x01a7, B:28:0x01af, B:31:0x01dc, B:33:0x01e6, B:34:0x01f0, B:37:0x006a, B:41:0x00c4, B:45:0x00fa, B:47:0x0102, B:48:0x0117, B:51:0x010c, B:56:0x012c, B:61:0x0084, B:67:0x00a3), top: B:7:0x0032 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0034  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x0128 -> B:38:0x006d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object doWork(df3.bar barVar) {
        su0.a aVar;
        int i;
        java.lang.String str;
        boolean z;
        long currentTimeMillis;
        long j;
        long j2;
        int i2;
        int i3;
        long j3;
        int i4;
        int i5;
        long j4;
        long j5;
        su0.g0 g0Var;
        long j6;
        long j7;
        long j8;
        try {
            if (barVar instanceof su0.a) {
                aVar = (su0.a) barVar;
                int i6 = aVar.E;
                if ((i6 & Integer.MIN_VALUE) != 0) {
                    aVar.E = i6 - Integer.MIN_VALUE;
                    java.lang.Object obj = aVar.C;
                    ef3.bar barVar2 = ef3.bar.a;
                    i = aVar.E;
                    if (i != 0) {
                        str = "hasMatchingEntries";
                        z = false;
                        od.p.E(obj);
                        if (getRunAttemptCount() == 3) {
                            return wi0.bar.u("failure(...)");
                        }
                        wu0.b bVar = (wu0.b) this.c;
                        bVar.c = bVar.a.d("expCallLogSyncFull");
                        currentTimeMillis = java.lang.System.currentTimeMillis();
                        j = Long.MAX_VALUE;
                        j2 = Long.MAX_VALUE;
                        i2 = 0;
                        i3 = 0;
                        if (j <= 0) {
                        }
                        return barVar2;
                    }
                    if (i == 1) {
                        str = "hasMatchingEntries";
                        z = false;
                        j5 = aVar.B;
                        j4 = aVar.A;
                        i5 = aVar.y;
                        long j9 = aVar.z;
                        int i7 = aVar.x;
                        od.p.E(obj);
                        i4 = i7;
                        j3 = j9;
                        g0Var = (su0.g0) obj;
                        long j11 = j5;
                        if (g0Var instanceof su0.f0) {
                        }
                        aVar.x = i4;
                        aVar.z = j3;
                        aVar.y = i5;
                        aVar.A = j6;
                        aVar.B = j7;
                        aVar.E = 2;
                        if (fg3.h0.a0(aVar) == barVar2) {
                        }
                        i2 = i4;
                        long j12 = j3;
                        i3 = i5;
                        j2 = j7;
                        j = j6;
                        currentTimeMillis = j12;
                        if (j <= 0) {
                        }
                        return barVar2;
                    }
                    if (i != 2) {
                        if (i != 3) {
                            if (i == 4) {
                                od.p.E(obj);
                                str = "hasMatchingEntries";
                                wu0.b bVar2 = (wu0.b) this.c;
                                u03.y yVar = bVar2.c;
                                if (yVar != null) {
                                    yVar.a(str, java.lang.String.valueOf(true));
                                    yVar.a = true;
                                }
                                bVar2.c = null;
                                return nd.t.a();
                            }
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        j8 = aVar.z;
                        od.p.E(obj);
                        str = "hasMatchingEntries";
                        z = false;
                        if (!yp.d0.D((java.lang.Boolean) obj)) {
                            hw0.a aVar2 = this.b;
                            aVar.z = j8;
                            aVar.E = 4;
                        } else {
                            java.lang.String str2 = str;
                            wu0.b bVar3 = (wu0.b) this.c;
                            u03.y yVar2 = bVar3.c;
                            if (yVar2 != null) {
                                yVar2.a(str2, java.lang.String.valueOf(z));
                                yVar2.a = true;
                            }
                            bVar3.c = null;
                            return new java.lang.Object();
                        }
                    } else {
                        j7 = aVar.B;
                        str = "hasMatchingEntries";
                        j6 = aVar.A;
                        z = false;
                        i5 = aVar.y;
                        j3 = aVar.z;
                        i4 = aVar.x;
                        od.p.E(obj);
                        i2 = i4;
                        long j122 = j3;
                        i3 = i5;
                        j2 = j7;
                        j = j6;
                        currentTimeMillis = j122;
                        if (j <= 0) {
                            su0.b bVar4 = this.a;
                            aVar.x = i2;
                            aVar.z = currentTimeMillis;
                            aVar.y = i3;
                            aVar.A = j;
                            aVar.B = j2;
                            int i8 = i2;
                            aVar.E = 1;
                            su0.f fVar = (su0.f) bVar4;
                            long j13 = j;
                            long j14 = j2;
                            obj = fg3.h0.W(fVar.a, new su0.e(fVar, j13, j14, null, 0), aVar);
                            if (obj != barVar2) {
                                i5 = i3;
                                j4 = j13;
                                i4 = i8;
                                j3 = currentTimeMillis;
                                j5 = j14;
                                g0Var = (su0.g0) obj;
                                long j112 = j5;
                                if (g0Var instanceof su0.f0) {
                                    j6 = ((su0.f0) g0Var).a;
                                    j7 = ((su0.f0) g0Var).b;
                                } else {
                                    if (g0Var instanceof su0.e0) {
                                        j6 = -1;
                                    } else {
                                        j6 = j4;
                                    }
                                    j7 = j112;
                                }
                                aVar.x = i4;
                                aVar.z = j3;
                                aVar.y = i5;
                                aVar.A = j6;
                                aVar.B = j7;
                                aVar.E = 2;
                                if (fg3.h0.a0(aVar) == barVar2) {
                                }
                                i2 = i4;
                                long j1222 = j3;
                                i3 = i5;
                                j2 = j7;
                                j = j6;
                                currentTimeMillis = j1222;
                                if (j <= 0) {
                                    long currentTimeMillis2 = java.lang.System.currentTimeMillis() - currentTimeMillis;
                                    ((su0.f) this.a).e();
                                    android.content.Context applicationContext = getApplicationContext();
                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(applicationContext, "context");
                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(com.truecaller.service.MissedCallsNotificationWorker.class, "workerClass");
                                    nd.y d2 = new f6.v0(com.truecaller.service.MissedCallsNotificationWorker.class).d();
                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(applicationContext, "context");
                                    od.n k = od.n.k(applicationContext);
                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(k, "getInstance(...)");
                                    nd.l lVar = nd.l.b;
                                    k.g("javaClass", lVar, d2);
                                    android.content.Context applicationContext2 = getApplicationContext();
                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(applicationContext2, "getApplicationContext(...)");
                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(applicationContext2, "context");
                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(com.truecaller.service.vbmissedcall.VerifiedBusinessMissedCallNotificationWorker.class, "workerClass");
                                    nd.y d3 = new f6.v0(com.truecaller.service.vbmissedcall.VerifiedBusinessMissedCallNotificationWorker.class).d();
                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(applicationContext2, "context");
                                    od.n k2 = od.n.k(applicationContext2);
                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(k2, "getInstance(...)");
                                    k2.g("verified_business_missed_call_notification_work", lVar, d3);
                                    su0.b bVar5 = this.a;
                                    aVar.z = currentTimeMillis2;
                                    aVar.E = 3;
                                    su0.f fVar2 = (su0.f) bVar5;
                                    obj = fg3.h0.W(fVar2.a, new su0.c(fVar2, null, 0), aVar);
                                    if (obj != barVar2) {
                                        j8 = currentTimeMillis2;
                                        if (!yp.d0.D((java.lang.Boolean) obj)) {
                                        }
                                    }
                                }
                            }
                        }
                        return barVar2;
                    }
                }
            }
            if (i != 0) {
            }
        } catch (java.util.concurrent.CancellationException e) {
            throw e;
        } catch (java.lang.RuntimeException e2) {
            com.truecaller.log.AssertionUtil.reportThrowableButNeverCrash(e2);
            return new java.lang.Object();
        }
        aVar = new su0.a(this, (ff3.qux) barVar);
        java.lang.Object obj2 = aVar.C;
        ef3.bar barVar22 = ef3.bar.a;
        i = aVar.E;
    }
}
