package com.truecaller.messaging.transport.im;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0016B_\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0012\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\b\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/truecaller/messaging/transport/im/FetchLinkPreviewWorker;", "Landroidx/work/Worker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "Lo22/baz;", "linkMetaDataExtractor", "Lqc3/bar;", "Ly12/o0;", "readMessageStorage", "Le42/s;", "transportManager", "Lxd0/qux;", "Le42/g;", "messagesProcessor", "Lnc0/bar;", "analytics", "Lqo1/k;", "messagingFeaturesInventory", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lo22/baz;Lqc3/bar;Le42/s;Lqc3/bar;Lnc0/bar;Lqo1/k;)V", "df0/qux", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class FetchLinkPreviewWorker extends androidx.work.Worker {
    public final o22.baz a;
    public final qc3.bar b;
    public final e42.s c;
    public final qc3.bar d;
    public final nc0.bar e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FetchLinkPreviewWorker(@org.jetbrains.annotations.NotNull android.content.Context context, @org.jetbrains.annotations.NotNull androidx.work.WorkerParameters workerParameters, @org.jetbrains.annotations.NotNull o22.baz bazVar, @org.jetbrains.annotations.NotNull qc3.bar barVar, @org.jetbrains.annotations.NotNull e42.s sVar, @org.jetbrains.annotations.NotNull qc3.bar barVar2, @org.jetbrains.annotations.NotNull nc0.bar barVar3, @org.jetbrains.annotations.NotNull qo1.k kVar) {
        super(context, workerParameters);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workerParameters, "workerParams");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bazVar, "linkMetaDataExtractor");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "readMessageStorage");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sVar, "transportManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar2, "messagesProcessor");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar3, "analytics");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kVar, "messagingFeaturesInventory");
        this.a = bazVar;
        this.b = barVar;
        this.c = sVar;
        this.d = barVar2;
        this.e = barVar3;
    }

    public final nd.t doWork() {
        long d = getInputData().d("message_id", -1L);
        java.lang.Long valueOf = java.lang.Long.valueOf(d);
        if (d == -1) {
            valueOf = null;
        }
        if (valueOf != null) {
            long longValue = valueOf.longValue();
            java.lang.String e = getInputData().e("text");
            if (e != null) {
                if (e.length() <= 0) {
                    e = null;
                }
                if (e != null) {
                    b1.n2 n2Var = new b1.n2(this, e, (df3.bar) null);
                    kotlin.coroutines.d dVar = kotlin.coroutines.d.a;
                    o22.bar barVar = (o22.bar) fg3.h0.O(dVar, n2Var);
                    if (barVar == null) {
                        nd.s a = nd.t.a();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a, "success(...)");
                        return a;
                    }
                    com.truecaller.messaging.data.types.Message message = (com.truecaller.messaging.data.types.Message) fg3.h0.O(dVar, new b1.n2(this, longValue, barVar, (df3.bar) null, 13));
                    if (message == null) {
                        nd.s a2 = nd.t.a();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a2, "success(...)");
                        return a2;
                    }
                    if (!(message.n instanceof com.truecaller.messaging.transport.im.ImTransportInfo)) {
                        nd.s a3 = nd.t.a();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a3, "success(...)");
                        return a3;
                    }
                    e42.g gVar = (e42.g) ((xd0.qux) this.d.get()).a();
                    e42.r g = ((e42.w) this.c).g(2);
                    android.content.Intent intent = new android.content.Intent("update_message");
                    intent.putExtra("message", message);
                    kotlin.Unit unit = kotlin.Unit.a;
                    gVar.b(g, intent, 0).q();
                    nd.s a4 = nd.t.a();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a4, "success(...)");
                    return a4;
                }
            }
            nd.s a5 = nd.t.a();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a5, "success(...)");
            return a5;
        }
        nd.s a6 = nd.t.a();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a6, "success(...)");
        return a6;
    }
}
