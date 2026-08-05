package com.truecaller.data.country;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class c {
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, p31.bar] */
    /* JADX WARN: Type inference failed for: r2v0, types: [j31.n, java.lang.Object] */
    public static wj3.a a(java.lang.String str) {
        ?? obj = new java.lang.Object();
        obj.a(com.truecaller.common.network.util.KnownEndpoints.ACCOUNT);
        obj.g(com.truecaller.data.country.b.class);
        ?? obj2 = new java.lang.Object();
        ((j31.n) obj2).b = new j31.c(false);
        okhttp3.OkHttpClient a = p31.baz.a((j31.n) obj2);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(a, "client");
        ((p31.bar) obj).g = a;
        return ((com.truecaller.data.country.b) obj.d(com.truecaller.data.country.b.class)).get(str);
    }
}
