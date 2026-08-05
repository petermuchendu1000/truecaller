package com.truecaller.account.domain.auth;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class u implements okhttp3.Interceptor {
    public final kotlin.coroutines.CoroutineContext a;
    public final boolean b;
    public final n11.l c;
    public final qc3.bar d;
    public final t52.bar e;
    public final qo1.i f;
    public final com.truecaller.account.domain.auth.a0 g;
    public final java.lang.String h;
    public final nc0.bar i;
    public final kotlin.Lazy j;

    public u(kotlin.coroutines.CoroutineContext coroutineContext, boolean z, n11.l lVar, qc3.bar barVar, t52.bar barVar2, qo1.i iVar, com.truecaller.account.domain.auth.a0 a0Var, java.lang.String str, nc0.bar barVar3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineContext, "ioContext");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lVar, "accountManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "temporaryAuthTokenManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar2, "crossDomainSupport");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iVar, "identityFeaturesInventory");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(a0Var, "authTokenProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar3, "analytics");
        this.a = coroutineContext;
        this.b = z;
        this.c = lVar;
        this.d = barVar;
        this.e = barVar2;
        this.f = iVar;
        this.g = a0Var;
        this.h = str;
        this.i = barVar3;
        this.j = kotlin.LazyKt.lazy(new com.truecaller.account.domain.auth.f(this, 3));
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [kotlin.jvm.internal.j0, java.lang.Object] */
    public final okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) {
        java.lang.String str;
        java.lang.String str2;
        nc0.bar barVar = this.i;
        n11.o oVar = this.c;
        qo1.i iVar = this.f;
        boolean z = this.b;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(chain, "chain");
        try {
            ?? obj = new java.lang.Object();
            okhttp3.Request request = ((okhttp3.internal.http.RealInterceptorChain) chain).e;
            ((kotlin.jvm.internal.j0) obj).a = request;
            com.truecaller.common.network.util.KnownEndpoints knownEndpoints = (com.truecaller.common.network.util.KnownEndpoints) request.d(com.truecaller.common.network.util.KnownEndpoints.class);
            boolean a = this.e.a(h31.d.a((okhttp3.Request) ((kotlin.jvm.internal.j0) obj).a));
            java.lang.String str3 = this.h;
            if (str3 == null) {
                if (a) {
                    str3 = ((n11.h) this.d.get()).b();
                } else {
                    str3 = null;
                    if (z && iVar.b.a("featureJwtAuth", com.truecaller.featuretoggles.FeatureState.ENABLED_ALPHA_DEBUG) && knownEndpoints != null) {
                        str3 = (java.lang.String) com.mbridge.msdk.config.component.common.express.operator.baz.i(j0.b.q((fg3.e0) this.j.getValue(), (kotlin.coroutines.CoroutineContext) null, new com.truecaller.account.domain.auth.t(this, knownEndpoints, obj, null), 3));
                    } else if (z) {
                        n11.o oVar2 = oVar;
                        synchronized (oVar2.n) {
                            try {
                                n11.bar e = oVar2.e();
                                if (e != null && (str2 = e.a) != null) {
                                    str = oVar2.k(str2);
                                    str3 = str;
                                }
                            } finally {
                            }
                        }
                    } else {
                        n11.bar e2 = oVar.e();
                        if (e2 != null) {
                            str = e2.a;
                            str3 = str;
                        }
                    }
                }
            }
            boolean j = oVar.j();
            if (str3 != null) {
                okhttp3.HttpUrl.Builder f = ((okhttp3.Request) ((kotlin.jvm.internal.j0) obj).a).a.f();
                f.a("encoding", "json");
                okhttp3.HttpUrl b = f.b();
                okhttp3.Request.Builder c = ((okhttp3.Request) ((kotlin.jvm.internal.j0) obj).a).c();
                c.a("Authorization", "Bearer ".concat(str3));
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(b, "url");
                c.a = b;
                ((kotlin.jvm.internal.j0) obj).a = c.b();
            } else {
                if (a) {
                    cy.c cVar = new cy.c();
                    com.truecaller.log.AssertionUtil.reportThrowableButNeverCrash(cVar);
                    if (iVar.a.a("logAccountExceptions_71454", com.truecaller.featuretoggles.FeatureState.DISABLED)) {
                        nc0.u1.e(new ky.bar(cVar.a, j, com.truecaller.account.domain.auth.analytics.NetworkType.REST, ((okhttp3.Request) ((kotlin.jvm.internal.j0) obj).a).a.h()), barVar);
                        throw cVar;
                    }
                    throw cVar;
                }
                if (z) {
                    java.lang.String format = java.lang.String.format("Bug in application code. Unauthorized request to %s, you should not do these requests if not everything is initialized. This is to prevent that (potentially lots of) bad backend requests are made.", java.util.Arrays.copyOf(new java.lang.Object[]{((okhttp3.Request) ((kotlin.jvm.internal.j0) obj).a).a.h()}, 1));
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                    cy.d dVar = new cy.d(format, j);
                    com.truecaller.log.AssertionUtil.reportThrowableButNeverCrash(dVar);
                    if (iVar.a.a("logAccountExceptions_71454", com.truecaller.featuretoggles.FeatureState.DISABLED)) {
                        nc0.u1.e(new ky.bar(dVar.b, j, com.truecaller.account.domain.auth.analytics.NetworkType.REST, ((okhttp3.Request) ((kotlin.jvm.internal.j0) obj).a).a.h()), barVar);
                        throw dVar;
                    }
                    throw dVar;
                }
            }
            return ((okhttp3.internal.http.RealInterceptorChain) chain).a((okhttp3.Request) ((kotlin.jvm.internal.j0) obj).a);
        } catch (java.lang.SecurityException e3) {
            throw new java.io.IOException(e3);
        }
    }
}
