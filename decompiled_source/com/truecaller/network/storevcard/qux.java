package com.truecaller.network.storevcard;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public abstract class qux {
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, p31.bar] */
    /* JADX WARN: Type inference failed for: r1v1, types: [okhttp3.Interceptor, java.lang.Object] */
    public static wj3.a a(java.lang.String str) {
        ?? obj = new java.lang.Object();
        obj.a(com.truecaller.common.network.util.KnownEndpoints.PHONEBOOK);
        obj.f((okhttp3.Interceptor) new java.lang.Object());
        return ((com.truecaller.network.storevcard.baz) obj.d(com.truecaller.network.storevcard.baz.class)).a(okhttp3.RequestBody.create(p31.b.a, str));
    }
}
