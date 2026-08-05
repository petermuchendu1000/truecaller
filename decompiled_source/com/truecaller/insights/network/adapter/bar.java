package com.truecaller.insights.network.adapter;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final /* synthetic */ class bar implements kotlin.jvm.functions.Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ bar(java.lang.Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, p31.bar] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, p31.bar] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, p31.bar] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, p31.bar] */
    public final java.lang.Object invoke() {
        switch (this.a) {
            case 0:
                com.truecaller.insights.network.adapter.qux quxVar = (com.truecaller.insights.network.adapter.qux) this.b;
                ?? obj = new java.lang.Object();
                obj.a(com.truecaller.common.network.util.KnownEndpoints.INSIGHT_CATEGORIZER);
                obj.g(com.truecaller.insights.network.adapter.baz.class);
                obj.f(new pw1.bar(quxVar.a.c()));
                obj.c(30, java.util.concurrent.TimeUnit.SECONDS);
                return (com.truecaller.insights.network.adapter.baz) obj.d(com.truecaller.insights.network.adapter.baz.class);
            case 1:
                com.truecaller.insights.network.adapter.qux quxVar2 = (com.truecaller.insights.network.adapter.qux) this.b;
                ?? obj2 = new java.lang.Object();
                obj2.a(com.truecaller.common.network.util.KnownEndpoints.INSIGHT_CATEGORIZER);
                obj2.g(com.truecaller.insights.network.adapter.a.class);
                obj2.f(new pw1.bar(quxVar2.a.c()));
                obj2.c(30, java.util.concurrent.TimeUnit.SECONDS);
                return (com.truecaller.insights.network.adapter.a) obj2.d(com.truecaller.insights.network.adapter.a.class);
            case 2:
                com.truecaller.insights.network.adapter.qux quxVar3 = (com.truecaller.insights.network.adapter.qux) this.b;
                ?? obj3 = new java.lang.Object();
                obj3.a(com.truecaller.common.network.util.KnownEndpoints.INSIGHT_FEATURE_REGISTRY);
                obj3.g(com.truecaller.insights.network.adapter.b.class);
                obj3.f(new pw1.bar(quxVar3.a.c()));
                obj3.c(30, java.util.concurrent.TimeUnit.SECONDS);
                return (com.truecaller.insights.network.adapter.b) obj3.d(com.truecaller.insights.network.adapter.b.class);
            default:
                com.truecaller.insights.network.adapter.d dVar = (com.truecaller.insights.network.adapter.d) this.b;
                ?? obj4 = new java.lang.Object();
                obj4.a(com.truecaller.common.network.util.KnownEndpoints.INSIGHT_CATEGORIZER);
                obj4.g(com.truecaller.insights.network.adapter.c.class);
                obj4.f(new pw1.bar(dVar.a.c()));
                obj4.c(30, java.util.concurrent.TimeUnit.SECONDS);
                ow1.bar barVar = (ow1.bar) dVar.b.getValue();
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "factory");
                ((p31.bar) obj4).f = barVar;
                return (com.truecaller.insights.network.adapter.c) obj4.d(com.truecaller.insights.network.adapter.c.class);
        }
    }
}
