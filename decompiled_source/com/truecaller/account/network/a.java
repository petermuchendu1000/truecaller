package com.truecaller.account.network;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class a implements okhttp3.Interceptor {
    public final okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(chain, "chain");
        okhttp3.internal.http.RealInterceptorChain realInterceptorChain = (okhttp3.internal.http.RealInterceptorChain) chain;
        okhttp3.Request.Builder c = realInterceptorChain.e.c();
        c.a("clientSecret", "lvc22mp3l1sfv6ujg83rd17btt");
        return realInterceptorChain.a(c.b());
    }
}
