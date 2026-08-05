package com.truecaller.messaging.notifications.mass;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B[\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/truecaller/messaging/notifications/mass/MassDndWorker;", "Lcom/truecaller/background_work/TrackedWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "params", "Lnc0/bar;", "analytics", "Lqo1/m;", "platformFeaturesInventory", "Lh32/bar;", "massDndChecker", "Landroid/content/ContentResolver;", "contentResolver", "Ly12/a;", "cursorFactory", "Ly12/a0;", "queryHelper", "Lqc3/bar;", "Lcom/truecaller/messaging/notifications/d0;", "regularMessagingNotificationsManager", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lnc0/bar;Lqo1/m;Lh32/bar;Landroid/content/ContentResolver;Ly12/a;Ly12/a0;Lqc3/bar;)V", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class MassDndWorker extends com.truecaller.background_work.TrackedWorker {
    public final nc0.bar a;
    public final qo1.m b;
    public final h32.bar c;
    public final android.content.ContentResolver d;
    public final y12.a e;
    public final y12.a0 f;
    public final qc3.bar g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MassDndWorker(@org.jetbrains.annotations.NotNull android.content.Context context, @org.jetbrains.annotations.NotNull androidx.work.WorkerParameters workerParameters, @org.jetbrains.annotations.NotNull nc0.bar barVar, @org.jetbrains.annotations.NotNull qo1.m mVar, @org.jetbrains.annotations.NotNull h32.bar barVar2, @org.jetbrains.annotations.NotNull android.content.ContentResolver contentResolver, @org.jetbrains.annotations.NotNull y12.a aVar, @org.jetbrains.annotations.NotNull y12.a0 a0Var, @org.jetbrains.annotations.NotNull qc3.bar barVar3) {
        super(context, workerParameters);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workerParameters, "params");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "analytics");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mVar, "platformFeaturesInventory");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar2, "massDndChecker");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contentResolver, "contentResolver");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(aVar, "cursorFactory");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(a0Var, "queryHelper");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar3, "regularMessagingNotificationsManager");
        this.a = barVar;
        this.b = mVar;
        this.c = barVar2;
        this.d = contentResolver;
        this.e = aVar;
        this.f = a0Var;
        this.g = barVar3;
    }

    /* renamed from: a, reason: from getter */
    public final nc0.bar getA() {
        return this.a;
    }

    /* renamed from: b, reason: from getter */
    public final qo1.m getB() {
        return this.b;
    }

    public final boolean c() {
        return ((qo1.l) ((h32.baz) this.c).a).a.a("featureMassIMDND", com.truecaller.featuretoggles.FeatureState.DISABLED);
    }

    public final nd.t d() {
        java.util.ArrayList arrayList;
        h32.bar barVar;
        a22.l d;
        android.net.Uri x = h81.a.x();
        kotlin.Unit unit = kotlin.Unit.a;
        android.database.Cursor query = this.d.query(x, null, "read = 0 AND info24 = 0 AND transport = 2 AND info12 = 1", null, null);
        if (query != null && (d = ((y12.b) this.e).d(query)) != null) {
            try {
                arrayList = new java.util.ArrayList();
                while (d.moveToNext()) {
                    arrayList.add(d.h());
                }
                d.close();
            } finally {
            }
        } else {
            arrayList = kotlin.collections.h0.a;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = arrayList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            barVar = this.c;
            if (!hasNext) {
                break;
            }
            com.truecaller.messaging.data.types.Message message = (com.truecaller.messaging.data.types.Message) it.next();
            kotlin.jvm.internal.Intrinsics.d(message);
            if (((h32.baz) barVar).a(message)) {
                arrayList2.add(message);
            }
        }
        if (!arrayList2.isEmpty()) {
            java.lang.Object obj = this.g.get();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
            ((com.truecaller.messaging.notifications.g0) ((com.truecaller.messaging.notifications.d0) obj)).i(((y12.b0) this.f).c(arrayList2), null, null, null, null);
            h32.baz bazVar = (h32.baz) barVar;
            bazVar.getClass();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(arrayList2, "messages");
            java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.z.q(arrayList2, 10));
            java.util.Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                arrayList3.add(java.lang.String.valueOf(((com.truecaller.messaging.data.types.Message) it2.next()).a));
            }
            android.content.ContentResolver contentResolver = bazVar.d;
            android.net.Uri w = h81.a.w();
            android.content.ContentValues contentValues = new android.content.ContentValues();
            contentValues.put("info24", (java.lang.Integer) 1);
            kotlin.Unit unit2 = kotlin.Unit.a;
            contentResolver.update(w, contentValues, bar.t("_id IN (", kotlin.collections.CollectionsKt.b0(arrayList3, ",", (java.lang.String) null, (java.lang.String) null, (kotlin.jvm.functions.Function1) null, 62), ")"), null);
        }
        nd.s a = nd.t.a();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a, "success(...)");
        return a;
    }
}
