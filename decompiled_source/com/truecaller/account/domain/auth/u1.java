package com.truecaller.account.domain.auth;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class u1 implements okhttp3.Interceptor {
    public final qc3.bar a;
    public final t52.qux b;

    public u1(qc3.bar barVar, t52.qux quxVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "credentialsChecker");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(quxVar, "crossDomainSupport");
        this.a = barVar;
        this.b = quxVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) {
        java.lang.Integer num;
        com.truecaller.common.network.util.KnownEndpoints knownEndpoints;
        java.lang.String str;
        okhttp3.ResponseBody responseBody;
        zh3.f source;
        zh3.g S;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(chain, "chain");
        okhttp3.internal.http.RealInterceptorChain realInterceptorChain = (okhttp3.internal.http.RealInterceptorChain) chain;
        okhttp3.Request request = realInterceptorChain.e;
        boolean a = this.b.a(h31.d.a(request));
        okhttp3.Response a2 = realInterceptorChain.a(request);
        if (a2.d == 401 && !a) {
            try {
                responseBody = a2.g;
            } catch (java.lang.Exception unused) {
            }
            if (responseBody != null && (source = responseBody.source()) != null) {
                source.v(2147483647L);
                zh3.d u = source.u();
                if (u != null && (S = u.S()) != null) {
                    com.truecaller.account.domain.auth.v1 v1Var = (com.truecaller.account.domain.auth.v1) new com.google.gson.Gson().fromJson(S.x(), com.truecaller.account.domain.auth.v1.class);
                    if (v1Var != null) {
                        num = java.lang.Integer.valueOf(v1Var.getStatusCode());
                        knownEndpoints = (com.truecaller.common.network.util.KnownEndpoints) request.d(com.truecaller.common.network.util.KnownEndpoints.class);
                        com.truecaller.account.domain.auth.b1 b1Var = (com.truecaller.account.domain.auth.b1) this.a.get();
                        java.lang.String str2 = request.a.i;
                        if (knownEndpoints == null) {
                            str = knownEndpoints.getKey();
                        } else {
                            str = null;
                        }
                        com.truecaller.account.domain.auth.d1 d1Var = (com.truecaller.account.domain.auth.d1) b1Var;
                        d1Var.getClass();
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "requestUrl");
                        fg3.h0.J(d1Var.a, d1Var.b, (fg3.f0) null, new com.truecaller.account.domain.auth.c1(d1Var, str, str2, num, null), 2);
                    }
                }
            }
            num = null;
            knownEndpoints = (com.truecaller.common.network.util.KnownEndpoints) request.d(com.truecaller.common.network.util.KnownEndpoints.class);
            com.truecaller.account.domain.auth.b1 b1Var2 = (com.truecaller.account.domain.auth.b1) this.a.get();
            java.lang.String str22 = request.a.i;
            if (knownEndpoints == null) {
            }
            com.truecaller.account.domain.auth.d1 d1Var2 = (com.truecaller.account.domain.auth.d1) b1Var2;
            d1Var2.getClass();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str22, "requestUrl");
            fg3.h0.J(d1Var2.a, d1Var2.b, (fg3.f0) null, new com.truecaller.account.domain.auth.c1(d1Var2, str, str22, num, null), 2);
        }
        return a2;
    }
}
