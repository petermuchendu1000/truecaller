package com.truecaller.ads.util;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class qux {
    public final qc3.bar a;
    public final qc3.bar b;
    public final qc3.bar c;
    public final qc3.bar d;
    public final s90.bar e;
    public final qc3.bar f;
    public final javax.inject.Provider g;
    public final kotlin.Lazy h;
    public final kotlin.Lazy i;

    public qux(qc3.bar barVar, qc3.bar barVar2, qc3.bar barVar3, qc3.bar barVar4, qc3.bar barVar5, s90.bar barVar6, qc3.bar barVar7, javax.inject.Provider provider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "configManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar2, "featuresRegistry");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar3, "adsProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar4, "adsFeaturesInventory");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar5, "unitConfigProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar6, "adRequestIdGenerator");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar7, "acsCallIdHelper");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(provider, "adRouterAdsProvider");
        this.a = barVar;
        this.b = barVar3;
        this.c = barVar4;
        this.d = barVar5;
        this.e = barVar6;
        this.f = barVar7;
        this.g = provider;
        final int i = 0;
        this.h = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0(this) { // from class: com.truecaller.ads.util.bar
            public final /* synthetic */ com.truecaller.ads.util.qux b;

            {
                this.b = this;
            }

            public final java.lang.Object invoke() {
                switch (i) {
                    case 0:
                        return ((q40.c) this.b.a.get()).a();
                    default:
                        return ((com.truecaller.ads.configmanagement.model.AdsPriorityConfig) this.b.h.getValue()).getPriority();
                }
            }
        });
        final int i2 = 1;
        this.i = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0(this) { // from class: com.truecaller.ads.util.bar
            public final /* synthetic */ com.truecaller.ads.util.qux b;

            {
                this.b = this;
            }

            public final java.lang.Object invoke() {
                switch (i2) {
                    case 0:
                        return ((q40.c) this.b.a.get()).a();
                    default:
                        return ((com.truecaller.ads.configmanagement.model.AdsPriorityConfig) this.b.h.getValue()).getPriority();
                }
            }
        });
    }

    public final com.truecaller.ads.configmanagement.model.AdPriority a() {
        return (com.truecaller.ads.configmanagement.model.AdPriority) this.i.getValue();
    }

    public final java.lang.Object b(boolean z, ff3.qux quxVar) {
        fg3.j jVar = new fg3.j(1, ef3.e.b(quxVar));
        jVar.s();
        if (!((qo1.bar) this.c.get()).g()) {
            ak.e1.I(jVar, new com.truecaller.ads.util.w(new z00.bar(4, "Internal ads disabled", null)));
        } else {
            java.lang.Object obj = this.g.get();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
            g10.bar barVar = (g10.bar) obj;
            r90.g gVar = (r90.g) this.d.get();
            java.lang.String a = this.e.a();
            kotlin.ranges.IntRange intRange = g10.m0.x;
            java.util.List p = ye0.e0.p();
            if (!z) {
                p = kotlin.collections.CollectionsKt.l0(p, (java.util.List) g10.m0.R.getValue());
            }
            f63.qux.j(barVar, gVar.d(new w90.bar(a, "pacsTop", p, null, "AFTERCALL_TOP", "afterCallTopAdUnitId", new o00.bar(((e00.qux) this.f.get()).a, 5, null, null, null, null, null, null, null, 0, 8184), (java.util.List) g10.m0.S.getValue(), false, null, 3120)), new com.google.android.gms.internal.auth.e(23, this, jVar), false, "requestSource", 4);
        }
        java.lang.Object r = jVar.r();
        if (r == ef3.bar.a) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(quxVar, "frame");
        }
        return r;
    }

    public final java.lang.Object c(o00.b0 b0Var, ff3.qux quxVar) {
        fg3.j jVar = new fg3.j(1, ef3.e.b(quxVar));
        jVar.s();
        qc3.bar barVar = this.b;
        if (((r90.d) ((r90.a) barVar.get())).g(b0Var)) {
            ak.e1.I(jVar, com.truecaller.ads.util.c0.a);
        } else {
            ((r90.d) ((r90.a) barVar.get())).k(b0Var, new com.truecaller.ads.util.baz(this, jVar, 0), "pacsTop");
        }
        java.lang.Object r = jVar.r();
        if (r == ef3.bar.a) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(quxVar, "frame");
        }
        return r;
    }
}
