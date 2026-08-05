package com.truecaller.messaging.messaginglist.v2.worker;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001BC\b\u0001\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/truecaller/messaging/messaginglist/v2/worker/ConversationMarkAsReadWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "params", "Lkotlin/coroutines/CoroutineContext;", "asyncContext", "Lqc3/bar;", "Ls62/d;", "notificationManager", "Lt22/n0;", "conversationListManager", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lkotlin/coroutines/CoroutineContext;Lqc3/bar;Lqc3/bar;)V", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class ConversationMarkAsReadWorker extends androidx.work.CoroutineWorker {
    public final android.content.Context a;
    public final kotlin.coroutines.CoroutineContext b;
    public final qc3.bar c;
    public final qc3.bar d;
    public final kotlin.Lazy e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConversationMarkAsReadWorker(@org.jetbrains.annotations.NotNull android.content.Context context, @org.jetbrains.annotations.NotNull androidx.work.WorkerParameters workerParameters, @javax.inject.Named("IO") @org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext coroutineContext, @org.jetbrains.annotations.NotNull qc3.bar barVar, @org.jetbrains.annotations.NotNull qc3.bar barVar2) {
        super(context, workerParameters);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workerParameters, "params");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineContext, "asyncContext");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "notificationManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar2, "conversationListManager");
        this.a = context;
        this.b = coroutineContext;
        this.c = barVar;
        this.d = barVar2;
        this.e = kotlin.LazyKt.lazy(new bf1.h(this, 29));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:1|(2:3|(5:5|6|7|(1:(1:(3:11|12|13)(2:15|16))(2:17|18))(3:22|23|(2:25|21)(1:26))|19))|29|6|7|(0)(0)|19) */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0054, code lost:
    
        if (r2.setForeground((nd.m) r7, r0) != r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x002a, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0057, code lost:
    
        com.truecaller.log.AssertionUtil.reportThrowableButNeverCrash(r7);
        r4 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object a(ff3.qux quxVar) {
        c32.baz bazVar;
        int i;
        com.truecaller.messaging.messaginglist.v2.worker.ConversationMarkAsReadWorker conversationMarkAsReadWorker;
        if (quxVar instanceof c32.baz) {
            bazVar = (c32.baz) quxVar;
            int i2 = bazVar.A;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bazVar.A = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = bazVar.y;
                ef3.bar barVar = ef3.bar.a;
                i = bazVar.A;
                boolean z = true;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            od.p.E(obj);
                            return java.lang.Boolean.valueOf(z);
                        }
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    conversationMarkAsReadWorker = bazVar.x;
                    od.p.E(obj);
                } else {
                    od.p.E(obj);
                    bazVar.x = this;
                    bazVar.A = 1;
                    obj = getForegroundInfo(bazVar);
                    if (obj != barVar) {
                        conversationMarkAsReadWorker = this;
                    } else {
                        return barVar;
                    }
                }
                bazVar.x = null;
                bazVar.A = 2;
            }
        }
        bazVar = new c32.baz(this, quxVar);
        java.lang.Object obj2 = bazVar.y;
        ef3.bar barVar2 = ef3.bar.a;
        i = bazVar.A;
        boolean z2 = true;
        if (i == 0) {
        }
        bazVar.x = null;
        bazVar.A = 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x007c, code lost:
    
        if (r9 != r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007e, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0048, code lost:
    
        if (r9 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object doWork(df3.bar barVar) {
        c32.bar barVar2;
        java.lang.Object obj;
        int i;
        if (barVar instanceof c32.bar) {
            barVar2 = (c32.bar) barVar;
            int i2 = barVar2.z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                barVar2.z = i2 - Integer.MIN_VALUE;
                obj = barVar2.x;
                java.lang.Object obj2 = ef3.bar.a;
                i = barVar2.z;
                qc3.bar barVar3 = this.c;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            od.p.E(obj);
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "withContext(...)");
                            nd.t tVar = (nd.t) obj;
                            ((s62.f) ((s62.d) barVar3.get())).a(2131365074, com.truecaller.analytics.common.event.PushNotificationSource.MobileLocal.getType(), "conversationMarkAsRead");
                            return tVar;
                        }
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.p.E(obj);
                } else {
                    od.p.E(obj);
                    barVar2.z = 1;
                    obj = a(barVar2);
                }
                if (!((java.lang.Boolean) obj).booleanValue()) {
                    ((s62.f) ((s62.d) barVar3.get())).v(2131365074, (android.app.Notification) this.e.getValue(), com.truecaller.analytics.common.event.PushNotificationSource.MobileLocal.getType(), "conversationMarkAsRead");
                }
                b42.h hVar = new b42.h(this, null, 27);
                barVar2.z = 2;
                obj = fg3.h0.W(this.b, hVar, barVar2);
            }
        }
        barVar2 = new c32.bar(this, (ff3.qux) barVar);
        obj = barVar2.x;
        java.lang.Object obj22 = ef3.bar.a;
        i = barVar2.z;
        qc3.bar barVar32 = this.c;
        if (i == 0) {
        }
        if (!((java.lang.Boolean) obj).booleanValue()) {
        }
        b42.h hVar2 = new b42.h(this, null, 27);
        barVar2.z = 2;
        obj = fg3.h0.W(this.b, hVar2, barVar2);
    }

    public final java.lang.Object getForegroundInfo(df3.bar barVar) {
        int i = android.os.Build.VERSION.SDK_INT;
        kotlin.Lazy lazy = this.e;
        if (i >= 29) {
            return new nd.m(2131365074, (android.app.Notification) lazy.getValue(), 1);
        }
        return new nd.m(2131365074, (android.app.Notification) lazy.getValue(), 0);
    }
}
