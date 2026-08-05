package com.truecaller.browser.extension.remote;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* synthetic */ class bar implements kotlin.jvm.functions.Function0 {
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, p31.bar] */
    /* JADX WARN: Type inference failed for: r1v1, types: [j31.n, java.lang.Object] */
    public final java.lang.Object invoke() {
        ?? obj = new java.lang.Object();
        obj.a(com.truecaller.common.network.util.KnownEndpoints.EMAIL_VERIFICATION_GRPC);
        ?? obj2 = new java.lang.Object();
        obj2.b(com.truecaller.common.network.util.AuthRequirement.REQUIRED, (java.lang.String) null);
        obj2.e(com.truecaller.common.network.interceptor.useragent.UserAgentType.WEB_NATIVE);
        okhttp3.OkHttpClient a = p31.baz.a((j31.n) obj2);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(a, "client");
        ((p31.bar) obj).g = a;
        obj.g(com.truecaller.browser.extension.remote.a.class);
        return (com.truecaller.browser.extension.remote.a) obj.d(com.truecaller.browser.extension.remote.a.class);
    }
}
