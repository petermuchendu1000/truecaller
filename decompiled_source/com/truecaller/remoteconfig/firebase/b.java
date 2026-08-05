package com.truecaller.remoteconfig.firebase;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class b {
    public final android.content.Context a;
    public final kotlin.coroutines.CoroutineContext b;
    public final u03.q c;

    public b(android.content.Context context, kotlin.coroutines.CoroutineContext coroutineContext, u03.q qVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "appContext");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineContext, "ioContext");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(qVar, "gsonUtil");
        this.a = context;
        this.b = coroutineContext;
        this.c = qVar;
    }
}
