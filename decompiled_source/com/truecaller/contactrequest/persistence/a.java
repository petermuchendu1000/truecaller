package com.truecaller.contactrequest.persistence;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class a extends androidx.room.f0 {
    public final kotlin.coroutines.CoroutineContext a;
    public final com.truecaller.contactrequest.persistence.bar b;
    public final javax.inject.Provider c;
    public final kotlin.Lazy d;

    public a(kotlin.coroutines.CoroutineContext coroutineContext, com.truecaller.contactrequest.persistence.bar barVar, cd3.bar barVar2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineContext, "asyncContext");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "contactRequestSharePrefHelper");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar2, "contactRequestDao");
        this.a = coroutineContext;
        this.b = barVar;
        this.c = barVar2;
        this.d = kotlin.LazyKt.lazy(new t2.e(this, 12));
    }

    public final void a(sc.bar barVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "db");
        super.a(barVar);
        fg3.h0.J((fg3.e0) this.d.getValue(), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new com.truecaller.contactrequest.persistence.qux(this, null), 3);
    }
}
