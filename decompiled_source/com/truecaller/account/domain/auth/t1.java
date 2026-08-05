package com.truecaller.account.domain.auth;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class t1 implements gd3.e {
    public final /* synthetic */ int a = 4;
    public final java.lang.Object b;
    public final java.lang.Object c;

    public t1(com.truecaller.qa.x xVar, gd0.b bVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(xVar, "qaMenuSettings");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bVar, "clientIdHolder");
        this.b = xVar;
        this.c = bVar;
    }

    public final gd3.d a(gd3.n1 n1Var, gd3.qux quxVar, gd3.a aVar) {
        switch (this.a) {
            case 0:
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(n1Var, "method");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(aVar, "next");
                return new com.truecaller.account.domain.auth.s1(quxVar, this, n1Var, aVar.g(n1Var, quxVar));
            case 1:
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(aVar, "next");
                return new oj0.qux(this, aVar.g(n1Var, quxVar), 1);
            case 2:
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(n1Var, "method");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(aVar, "next");
                if (((r72.b) ((qc3.bar) this.b).get()).d.get()) {
                    return ((r72.qux) this.c).a(n1Var, quxVar, aVar);
                }
                return new ei1.baz(aVar.g(n1Var, quxVar), 1);
            case 3:
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(n1Var, "method");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(aVar, "next");
                return new oj0.qux(this, aVar.g(n1Var, quxVar), 4);
            default:
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(aVar, "next");
                if (((com.truecaller.qa.x) this.b).z("isLoggingInspectorEnabled", false)) {
                    return new oj0.qux(this, aVar.g(n1Var, quxVar), 5);
                }
                gd3.d g = aVar.g(n1Var, quxVar);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(g, "newCall(...)");
                return g;
        }
    }

    public t1(ok1.qux quxVar, fg3.e0 e0Var) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(quxVar, "cacheControlHeaderPersister");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(e0Var, "appScope");
        this.b = quxVar;
        this.c = e0Var;
    }

    public t1(qc3.bar barVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "credentialsChecker");
        this.b = barVar;
        this.c = new kotlin.text.Regex("401/(\\d+)\\s");
    }

    public t1(qc3.bar barVar, r72.qux quxVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "networkPerformanceTracker");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(quxVar, "grpcNetworkPerformanceInterceptor");
        this.b = barVar;
        this.c = quxVar;
    }

    public t1(fg3.e0 e0Var, qc3.bar barVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "stats");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(e0Var, "scope");
        this.b = barVar;
        this.c = e0Var;
    }
}
