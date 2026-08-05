package com.truecaller.messaging.nudgetosend;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B%\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/truecaller/messaging/nudgetosend/MessageToNudgeWorker;", "Landroidx/work/Worker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "params", "Lj32/qux;", "messageToNudgeHelper", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lj32/qux;)V", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class MessageToNudgeWorker extends androidx.work.Worker {
    public final j32.qux a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageToNudgeWorker(@org.jetbrains.annotations.NotNull android.content.Context context, @org.jetbrains.annotations.NotNull androidx.work.WorkerParameters workerParameters, @org.jetbrains.annotations.NotNull j32.qux quxVar) {
        super(context, workerParameters);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workerParameters, "params");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(quxVar, "messageToNudgeHelper");
        this.a = quxVar;
    }

    public final nd.t doWork() {
        java.util.ArrayList arrayList;
        boolean z;
        a22.l lVar;
        ah.n nVar = this.a;
        qc3.bar barVar = (qc3.bar) nVar.e;
        y12.a aVar = (y12.a) nVar.a;
        ah.k0 k0Var = (ah.k0) nVar.h;
        t41.r0 r0Var = (t41.r0) nVar.f;
        xz1.r rVar = (xz1.r) ((xz1.q) nVar.c);
        if (r0Var.a(java.util.concurrent.TimeUnit.DAYS, rVar.D("nudgeToSendNotificationTimestamp", 0L), 1L) || ((qo1.l) ((qo1.k) nVar.g)).a.a("featureNudgeToSendAsSMSExpanded", com.truecaller.featuretoggles.FeatureState.DISABLED)) {
            android.database.Cursor query = ((android.content.ContentResolver) nVar.b).query(h81.e.a.buildUpon().appendEncodedPath("message_to_nudge").build(), null, null, null, null);
            if (query != null) {
                ((y12.b) aVar).getClass();
                a22.j jVar = new a22.j(query);
                try {
                    arrayList = new java.util.ArrayList();
                    while (jVar.moveToNext()) {
                        arrayList.add(new c22.i(jVar.getLong(jVar.a), jVar.getInt(jVar.c), jVar.getString(jVar.d), jVar.getLong(jVar.b)));
                    }
                    jVar.close();
                } finally {
                }
            } else {
                arrayList = kotlin.collections.h0.a;
            }
            if (!arrayList.isEmpty()) {
                boolean J = k0Var.J();
                java.util.ArrayList<c22.i> arrayList2 = arrayList;
                for (c22.i iVar : arrayList2) {
                    if (iVar.c == 3) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if ((!z) & k0Var.J()) {
                        android.database.Cursor query2 = ((android.content.ContentResolver) nVar.b).query(h81.a.s(iVar.b), null, ia0.bar.j(iVar.a, "_id = "), null, null);
                        if (query2 != null) {
                            lVar = ((y12.b) aVar).d(query2);
                        } else {
                            lVar = null;
                        }
                        if (lVar != null) {
                            while (lVar.moveToNext()) {
                                try {
                                    com.truecaller.messaging.data.types.Message h = lVar.h();
                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(h, "getMessage(...)");
                                    if (!k0Var.Y(h, "conversation-nudgeSendAsSms")) {
                                        nVar.u0(iVar);
                                    } else {
                                        ((y12.v) ((xd0.qux) barVar.get()).a()).u(h.a);
                                    }
                                } finally {
                                }
                            }
                            kotlin.Unit unit = kotlin.Unit.a;
                            lVar.close();
                        } else {
                            continue;
                        }
                    } else {
                        nVar.u0(iVar);
                    }
                }
                y12.v vVar = (y12.v) ((xd0.qux) barVar.get()).a();
                java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.z.q(arrayList2, 10));
                java.util.Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    arrayList3.add(java.lang.Long.valueOf(((c22.i) it.next()).b));
                }
                vVar.h(arrayList3, J);
                rVar.e0("nudgeToSendNotificationTimestamp", java.lang.System.currentTimeMillis());
            }
        }
        nd.s a = nd.t.a();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a, "success(...)");
        return a;
    }
}
