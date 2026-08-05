package com.truecaller.ads.analytics;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class baz implements com.truecaller.ads.analytics.bar {
    public final qc3.bar a;
    public final qc3.bar b;
    public final qc3.bar c;
    public final kotlin.Lazy d;
    public com.truecaller.ads.analytics.p e;
    public java.lang.Long f;

    public baz(qc3.bar barVar, qc3.bar barVar2, qc3.bar barVar3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "clock");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar2, "adsAnalytics");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar3, "featuresConfig");
        this.a = barVar;
        this.b = barVar2;
        this.c = barVar3;
        this.d = kotlin.LazyKt.lazy(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.bar(this, 6));
    }

    public final void a(com.truecaller.ads.analytics.qux quxVar, com.truecaller.ads.analytics.o oVar) {
        com.truecaller.ads.analytics.p pVar;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(quxVar, "position");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(oVar, "screenSize");
        if (this.e != null) {
            ((u03.baz) this.a.get()).getClass();
            this.f = java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime());
        }
        com.truecaller.ads.analytics.p pVar2 = this.e;
        com.truecaller.ads.analytics.p pVar3 = null;
        if (pVar2 != null) {
            pVar = com.truecaller.ads.analytics.p.a(pVar2, null, quxVar, null, 47);
        } else {
            pVar = null;
        }
        this.e = pVar;
        if (pVar != null) {
            pVar3 = com.truecaller.ads.analytics.p.a(pVar, null, null, oVar, 31);
        }
        this.e = pVar3;
    }

    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, qx2.f] */
    /* JADX WARN: Type inference failed for: r12v1, types: [qx2.wh, java.lang.Object] */
    public final void b() {
        java.lang.Long l;
        java.lang.Boolean bool;
        com.truecaller.ads.analytics.p pVar;
        com.truecaller.ads.analytics.p pVar2;
        boolean z;
        if (this.e != null) {
            java.lang.Long l2 = this.f;
            if (l2 != null) {
                long longValue = l2.longValue();
                ((u03.baz) this.a.get()).getClass();
                l = java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - longValue);
            } else {
                l = null;
            }
            if (l != null) {
                if (l.longValue() < ((java.lang.Number) this.d.getValue()).longValue()) {
                    z = true;
                } else {
                    z = false;
                }
                bool = java.lang.Boolean.valueOf(z);
            } else {
                bool = null;
            }
            com.truecaller.ads.analytics.p pVar3 = this.e;
            if (pVar3 != null) {
                pVar = com.truecaller.ads.analytics.p.a(pVar3, l, null, null, 55);
            } else {
                pVar = null;
            }
            this.e = pVar;
            if (yp.d0.D(bool) && (pVar2 = this.e) != null) {
                com.truecaller.ads.analytics.o oVar = pVar2.f;
                com.truecaller.ads.analytics.qux quxVar = pVar2.e;
                java.lang.Long l3 = pVar2.d;
                if (l3 != null && quxVar != null && oVar != null) {
                    java.lang.String str = pVar2.a;
                    java.lang.String str2 = pVar2.b;
                    java.lang.String str3 = pVar2.c;
                    long longValue2 = l3.longValue();
                    long j = quxVar.a;
                    long j2 = quxVar.b;
                    ?? obj = new java.lang.Object();
                    ((qx2.f) obj).a = j;
                    ((qx2.f) obj).b = j2;
                    long j3 = oVar.a;
                    long j4 = oVar.b;
                    ?? obj2 = new java.lang.Object();
                    ((qx2.wh) obj2).a = j3;
                    ((qx2.wh) obj2).b = j4;
                    com.truecaller.ads.analytics.g gVar = new com.truecaller.ads.analytics.g(str, str2, str3, longValue2, obj, obj2);
                    r90.baz bazVar = (r90.baz) ((r90.bar) this.b.get());
                    bazVar.getClass();
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gVar, "event");
                    ((nc0.a) ((nc0.bar) bazVar.a.get())).d(gVar);
                    kotlin.Unit unit = kotlin.Unit.a;
                    this.e = null;
                    this.f = null;
                }
            }
        }
    }

    public final void c(h10.b bVar, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bVar, "ad");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "adUnitId");
        this.e = new com.truecaller.ads.analytics.p(((h10.i) bVar).b, str);
    }

    public final void d(u90.a aVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(aVar, "ad");
        t90.f fVar = ((u90.baz) aVar).b;
        this.e = new com.truecaller.ads.analytics.p(fVar.a, fVar.b.a);
    }
}
