package com.truecaller.messaging.notifications;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class g {
    public final kotlin.coroutines.CoroutineContext a;
    public final android.content.ContentResolver b;
    public final y12.a c;
    public final y12.a0 d;
    public final qc3.bar e;
    public final fe3.bar f;

    public g(kotlin.coroutines.CoroutineContext coroutineContext, android.content.ContentResolver contentResolver, y12.a aVar, y12.a0 a0Var, qc3.bar barVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineContext, "ioContext");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contentResolver, "contentResolver");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(aVar, "cursorsFactory");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(a0Var, "messagesStorageQueryHelper");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "messagesStorage");
        this.a = coroutineContext;
        this.b = contentResolver;
        this.c = aVar;
        this.d = a0Var;
        this.e = barVar;
        this.f = fg3.h0.b(fg3.r0.b.plus(fg3.h0.e()));
    }

    public final void a(com.truecaller.messaging.data.types.Message message, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "nonDmaMessage");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "successHandler");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function12, "failureHandler");
        fg3.h0.J(this.f, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new ag2.qux(this, message, function1, function12, (df3.bar) null, 29), 3);
    }
}
