package com.truecaller.common.cloudtelephony.autodial.worker;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B3\b\u0001\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/truecaller/common/cloudtelephony/autodial/worker/AutoDialWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "params", "Lb21/baz;", "autoDialHandler", "Lqc3/bar;", "Ls62/d;", "notificationManager", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lb21/baz;Lqc3/bar;)V", "common-cloud-telephony_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.LOWPOWERMODE_FIELD_NUMBER)
/* loaded from: /home/user/tc_decoded/classes2.dex */
public final class AutoDialWorker extends androidx.work.CoroutineWorker {
    public final android.content.Context a;
    public final b21.baz b;
    public final qc3.bar c;
    public final kotlin.Lazy d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoDialWorker(@org.jetbrains.annotations.NotNull android.content.Context context, @org.jetbrains.annotations.NotNull androidx.work.WorkerParameters workerParameters, @org.jetbrains.annotations.NotNull b21.baz bazVar, @org.jetbrains.annotations.NotNull qc3.bar barVar) {
        super(context, workerParameters);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workerParameters, "params");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bazVar, "autoDialHandler");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "notificationManager");
        this.a = context;
        this.b = bazVar;
        this.c = barVar;
        this.d = kotlin.LazyKt.lazy(new cu0.h(this, 5));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:1|(2:3|(5:5|6|7|(1:(1:(3:11|12|13)(2:15|16))(2:17|18))(3:22|23|(2:25|21)(1:26))|19))|29|6|7|(0)(0)|19) */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0054, code lost:
    
        if (r2.setForeground((nd.m) r6, r0) != r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x002a, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0057, code lost:
    
        o82.a.B("Failed to promote AutoDialWorker to foreground", r6);
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object a(ff3.qux quxVar) {
        d21.baz bazVar;
        int i;
        com.truecaller.common.cloudtelephony.autodial.worker.AutoDialWorker autoDialWorker;
        if (quxVar instanceof d21.baz) {
            bazVar = (d21.baz) quxVar;
            int i2 = bazVar.A;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bazVar.A = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = bazVar.y;
                ef3.bar barVar = ef3.bar.a;
                i = bazVar.A;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            od.p.E(obj);
                            return kotlin.Unit.a;
                        }
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    autoDialWorker = bazVar.x;
                    od.p.E(obj);
                } else {
                    od.p.E(obj);
                    bazVar.x = this;
                    bazVar.A = 1;
                    obj = getForegroundInfo(bazVar);
                    if (obj != barVar) {
                        autoDialWorker = this;
                    } else {
                        return barVar;
                    }
                }
                bazVar.x = null;
                bazVar.A = 2;
            }
        }
        bazVar = new d21.baz(this, quxVar);
        java.lang.Object obj2 = bazVar.y;
        ef3.bar barVar2 = ef3.bar.a;
        i = bazVar.A;
        if (i == 0) {
        }
        bazVar.x = null;
        bazVar.A = 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0071, code lost:
    
        if (r6 == r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0073, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0041, code lost:
    
        if (a(r0) == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object doWork(df3.bar barVar) {
        d21.bar barVar2;
        int i;
        java.lang.String e;
        if (barVar instanceof d21.bar) {
            barVar2 = (d21.bar) barVar;
            int i2 = barVar2.z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                barVar2.z = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = barVar2.x;
                java.lang.Object obj2 = ef3.bar.a;
                i = barVar2.z;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            od.p.E(obj);
                            b21.d dVar = (b21.d) obj;
                            if (!kotlin.jvm.internal.Intrinsics.b(dVar, b21.c.a) && !kotlin.jvm.internal.Intrinsics.b(dVar, b21.b.a)) {
                                throw new java.lang.RuntimeException();
                            }
                            nd.s a = nd.t.a();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a, "success(...)");
                            return a;
                        }
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.p.E(obj);
                } else {
                    od.p.E(obj);
                    barVar2.z = 1;
                }
                nd.g inputData = getInputData();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(inputData, "getInputData(...)");
                e = inputData.e("auto_dial_data");
                if (e == null) {
                    java.lang.Object fromJson = new com.google.gson.Gson().fromJson(e, com.truecaller.common.cloudtelephony.autodial.network.models.AutoDialData.class);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(fromJson, "fromJson(...)");
                    barVar2.z = 2;
                    obj = this.b.H((com.truecaller.common.cloudtelephony.autodial.network.models.AutoDialData) fromJson, barVar2);
                } else {
                    throw new java.lang.IllegalArgumentException("Required value was null.");
                }
            }
        }
        barVar2 = new d21.bar(this, (ff3.qux) barVar);
        java.lang.Object obj3 = barVar2.x;
        java.lang.Object obj22 = ef3.bar.a;
        i = barVar2.z;
        if (i == 0) {
        }
        nd.g inputData2 = getInputData();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(inputData2, "getInputData(...)");
        e = inputData2.e("auto_dial_data");
        if (e == null) {
        }
    }

    public final java.lang.Object getForegroundInfo(df3.bar barVar) {
        int i = android.os.Build.VERSION.SDK_INT;
        kotlin.Lazy lazy = this.d;
        if (i >= 29) {
            return new nd.m(2131362371, (android.app.Notification) lazy.getValue(), 1);
        }
        return new nd.m(2131362371, (android.app.Notification) lazy.getValue(), 0);
    }
}
