package com.truecaller.data.country;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class n implements com.truecaller.data.country.d {
    public final kotlin.coroutines.CoroutineContext a;
    public final com.truecaller.data.country.g b;

    public n(kotlin.coroutines.CoroutineContext coroutineContext, com.truecaller.data.country.g gVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineContext, "ioContext");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gVar, "countryRepositoryDelegate");
        this.a = coroutineContext;
        this.b = gVar;
    }

    public final java.lang.Object a(java.lang.String str, ff3.qux quxVar) {
        return fg3.h0.W(this.a, new com.truecaller.data.country.i(this, str, null), quxVar);
    }

    public final java.lang.Object b(java.lang.String str, ff3.qux quxVar) {
        return fg3.h0.W(this.a, new com.truecaller.data.country.k(this, str, null), quxVar);
    }
}
