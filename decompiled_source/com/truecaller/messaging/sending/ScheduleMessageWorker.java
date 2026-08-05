package com.truecaller.messaging.sending;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001Bg\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0006\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/truecaller/messaging/sending/ScheduleMessageWorker;", "Landroidx/work/Worker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "params", "Lqc3/bar;", "Lxd0/qux;", "Ly12/v;", "messagesStorage", "Ly12/o0;", "readMessageStorage", "Lx32/k;", "draftSender", "Lnc0/bar;", "analytics", "Lu03/b;", "deviceInfoUtil", "Lnd/j0;", "workManager", "Lqo1/k;", "messagingFeaturesInventory", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lqc3/bar;Lqc3/bar;Lx32/k;Lnc0/bar;Lu03/b;Lnd/j0;Lqo1/k;)V", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class ScheduleMessageWorker extends androidx.work.Worker {
    public final qc3.bar a;
    public final qc3.bar b;
    public final x32.k c;
    public final nc0.bar d;
    public final u03.b e;
    public final nd.j0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScheduleMessageWorker(@org.jetbrains.annotations.NotNull android.content.Context context, @org.jetbrains.annotations.NotNull androidx.work.WorkerParameters workerParameters, @org.jetbrains.annotations.NotNull qc3.bar barVar, @org.jetbrains.annotations.NotNull qc3.bar barVar2, @org.jetbrains.annotations.NotNull x32.k kVar, @org.jetbrains.annotations.NotNull nc0.bar barVar3, @org.jetbrains.annotations.NotNull u03.b bVar, @org.jetbrains.annotations.NotNull nd.j0 j0Var, @org.jetbrains.annotations.NotNull qo1.k kVar2) {
        super(context, workerParameters);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workerParameters, "params");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "messagesStorage");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar2, "readMessageStorage");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kVar, "draftSender");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar3, "analytics");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bVar, "deviceInfoUtil");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(j0Var, "workManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kVar2, "messagingFeaturesInventory");
        this.a = barVar;
        this.b = barVar2;
        this.c = kVar;
        this.d = barVar3;
        this.e = bVar;
        this.f = j0Var;
    }

    /* JADX WARN: Type inference failed for: r9v4, types: [qx2.gd, java.lang.Object, ci3.m] */
    public final nd.t doWork() {
        boolean z;
        java.util.Iterator it;
        boolean z2;
        java.lang.CharSequence charSequence;
        qx2.lh lhVar;
        com.truecaller.tracking.events.ClientHeaderV2 clientHeaderV2;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.Iterator it2 = ((java.lang.Iterable) fg3.h0.O(kotlin.coroutines.d.a, new x32.s(this, currentTimeMillis, null, 0))).iterator();
        while (it2.hasNext()) {
            com.truecaller.messaging.data.types.Message message = (com.truecaller.messaging.data.types.Message) it2.next();
            boolean B = a.bar.B(message);
            qc3.bar barVar = this.a;
            if (B) {
                ((y12.v) ((xd0.qux) barVar.get()).a()).E(message.a).q();
                c22.f b = message.b();
                b.Q = -1L;
                b.R = 0L;
                message = b.a();
            }
            int i = message.l;
            long j = message.a;
            org.joda.time.DateTime dateTime = message.f;
            if (dateTime.C(24).i() < currentTimeMillis) {
                ((y12.v) ((xd0.qux) barVar.get()).a()).T(i, j).q();
                it = it2;
                z = true;
            } else {
                c22.b bVar = new c22.b();
                z = true;
                z = true;
                bVar.c.add(message.c);
                bVar.d = message.a();
                bVar.k = message.K;
                bVar.e = a.bar.M(message);
                com.truecaller.messaging.data.types.Draft draft = new com.truecaller.messaging.data.types.Draft(bVar);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(draft, "build(...)");
                com.truecaller.messaging.data.types.Entity[] entityArr = message.o;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(entityArr, "entities");
                java.util.ArrayList arrayList = new java.util.ArrayList();
                int length = entityArr.length;
                int i2 = 0;
                while (i2 < length) {
                    com.truecaller.messaging.data.types.Entity entity = entityArr[i2];
                    java.util.Iterator it3 = it2;
                    if (entity instanceof com.truecaller.messaging.data.types.BinaryEntity) {
                        arrayList.add(entity);
                    }
                    i2++;
                    it2 = it3;
                }
                it = it2;
                java.util.List w = y90.m6.w(draft, arrayList);
                java.lang.String str = message.m;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "simToken");
                if (i == 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                yb0.i a = ((x32.l) this.c).a(str, w, z2, false, false);
                if (a instanceof x32.e) {
                    wi0.bar.C(this.c, (x32.e) a, false, "conversation", dateTime.i(), 16).q();
                    ((y12.v) ((xd0.qux) barVar.get()).a()).b0(j).q();
                } else {
                    ((y12.v) ((xd0.qux) barVar.get()).a()).T(i, j).q();
                }
            }
            long i3 = currentTimeMillis - dateTime.i();
            java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.MILLISECONDS;
            int seconds = (int) timeUnit.toSeconds(i3);
            int minutes = (int) timeUnit.toMinutes(i3);
            int hours = (int) timeUnit.toHours(i3);
            if (seconds <= 10) {
                charSequence = "0-10sec";
            } else if (seconds <= 30) {
                charSequence = "11-30sec";
            } else if (seconds <= 60) {
                charSequence = "31-60sec";
            } else if (minutes <= 2) {
                charSequence = "1-2min";
            } else if (minutes <= 5) {
                charSequence = "3-5min";
            } else if (minutes <= 10) {
                charSequence = "6-10min";
            } else if (minutes <= 30) {
                charSequence = "11-30min";
            } else if (minutes <= 60) {
                charSequence = "31-60min";
            } else if (hours <= 3) {
                charSequence = "1-3h";
            } else if (hours <= 12) {
                charSequence = "4-12h";
            } else if (hours <= 24) {
                charSequence = "13-24h";
            } else {
                charSequence = "24h+";
            }
            bi3.y0 y0Var = qx2.gd.e;
            hi3.a aVar = qx2.gd.f;
            bi3.j0[] j0VarArr = (bi3.j0[]) y0Var.v().toArray(new bi3.j0[0]);
            boolean[] zArr = new boolean[j0VarArr.length];
            bi3.j0 j0Var = j0VarArr[2];
            zArr[2] = z;
            java.lang.CharSequence valueOf = java.lang.String.valueOf(this.e.t());
            hi3.e.d(j0VarArr[3], valueOf);
            zArr[3] = z;
            try {
                ?? obj = new java.lang.Object();
                if (zArr[0]) {
                    lhVar = null;
                } else {
                    bi3.j0 j0Var2 = j0VarArr[0];
                    lhVar = (qx2.lh) aVar.g(j0Var2.f, aVar.j(j0Var2));
                }
                ((qx2.gd) obj).a = lhVar;
                if (zArr[z ? 1 : 0]) {
                    clientHeaderV2 = null;
                } else {
                    bi3.j0 j0Var3 = j0VarArr[z ? 1 : 0];
                    clientHeaderV2 = (com.truecaller.tracking.events.ClientHeaderV2) aVar.g(j0Var3.f, aVar.j(j0Var3));
                }
                ((qx2.gd) obj).b = clientHeaderV2;
                if (!zArr[2]) {
                    bi3.j0 j0Var4 = j0VarArr[2];
                    charSequence = (java.lang.CharSequence) aVar.g(j0Var4.f, aVar.j(j0Var4));
                }
                ((qx2.gd) obj).c = charSequence;
                if (!zArr[3]) {
                    bi3.j0 j0Var5 = j0VarArr[3];
                    valueOf = (java.lang.CharSequence) aVar.g(j0Var5.f, aVar.j(j0Var5));
                }
                ((qx2.gd) obj).d = valueOf;
                this.d.c((ci3.m) obj);
                it2 = it;
            } catch (bi3.bar e) {
                throw e;
            } catch (java.lang.Exception e2) {
                throw new java.lang.RuntimeException(e2);
            }
        }
        com.truecaller.messaging.data.types.Message message2 = (com.truecaller.messaging.data.types.Message) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) fg3.h0.O(kotlin.coroutines.d.a, new x32.s(this, currentTimeMillis, null, 1)));
        if (message2 != null) {
            long i4 = message2.f.i();
            nd.j0 j0Var6 = this.f;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(j0Var6, "workManager");
            nd.l lVar = nd.l.a;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(com.truecaller.messaging.sending.ScheduleMessageWorker.class, "workerClass");
            j0Var6.g("ScheduleMessage", lVar, new f6.v0(com.truecaller.messaging.sending.ScheduleMessageWorker.class).x(java.lang.Math.max(i4 - java.lang.System.currentTimeMillis(), 0L), java.util.concurrent.TimeUnit.MILLISECONDS).d());
        }
        nd.s a2 = nd.t.a();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a2, "success(...)");
        return a2;
    }
}
