package com.truecaller.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/truecaller/ui/n1;", "Landroidx/lifecycle/n1;", "stats_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class n1 extends androidx.lifecycle.n1 {
    public final wt.l b;
    public final a52.bar c;
    public final r31.bar d;
    public final t41.m e;
    public final u03.baz f;
    public final nc0.bar g;
    public final oo1.f h;
    public final ig3.h2 i;
    public final ig3.q1 j;
    public final ig3.v1 k;
    public final ig3.p1 l;
    public final ig3.v1 m;
    public final ig3.p1 n;
    public final java.util.List o;
    public final ig3.h2 p;
    public final ig3.h2 q;
    public final ig3.v1 r;
    public final ig3.p1 s;
    public com.truecaller.ui.UserHomeStats t;

    public n1(wt.l lVar, a52.bar barVar, r31.bar barVar2, t41.m mVar, u03.baz bazVar, nc0.bar barVar3, oo1.f fVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lVar, "statsFetcher");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "statsHelper");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar2, "coreSettings");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mVar, "imageRenderer");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bazVar, "clock");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar3, "analytics");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fVar, "featuresRegistry");
        this.b = lVar;
        this.c = barVar;
        this.d = barVar2;
        this.e = mVar;
        this.f = bazVar;
        this.g = barVar3;
        this.h = fVar;
        ig3.h2 c = ig3.w1.c(new com.truecaller.ui.j1(false));
        this.i = c;
        this.j = new ig3.q1(c);
        ig3.v1 b = ig3.w1.b(1, 0, (hg3.bar) null, 6);
        this.k = b;
        this.l = new ig3.p1(b);
        ig3.v1 b2 = ig3.w1.b(1, 0, (hg3.bar) null, 6);
        this.m = b2;
        this.n = new ig3.p1(b2);
        this.o = kotlin.collections.y.j(new com.truecaller.stats.StatsPeriod[]{com.truecaller.stats.StatsPeriod.LAST_30_DAYS, com.truecaller.stats.StatsPeriod.LAST_3_MONTH, com.truecaller.stats.StatsPeriod.LAST_6_MONTH, com.truecaller.stats.StatsPeriod.THIS_YEAR, com.truecaller.stats.StatsPeriod.ALL_TIME});
        ig3.h2 c2 = ig3.w1.c(0);
        this.p = c2;
        this.q = c2;
        ig3.v1 b3 = ig3.w1.b(1, 0, (hg3.bar) null, 6);
        this.r = b3;
        this.s = new ig3.p1(b3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x00af, code lost:
    
        if (r1 == r10) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    /* JADX WARN: Type inference failed for: r2v2, types: [hi3.e, qx2.tf] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object o(com.truecaller.ui.n1 n1Var, com.truecaller.stats.StatsPeriod statsPeriod, com.truecaller.ui.StatsType statsType, ff3.qux quxVar) {
        com.truecaller.ui.m1 m1Var;
        java.lang.Object obj;
        ef3.bar barVar;
        int i;
        int i2;
        com.truecaller.ui.StatsType statsType2;
        long j;
        long j2;
        java.lang.Integer num;
        int i3;
        float c;
        com.truecaller.ui.StatsType statsType3;
        java.lang.String str;
        java.lang.Integer num2;
        int i4;
        java.lang.String str2;
        float f;
        int i5;
        int i6;
        java.lang.Integer num3;
        int i7;
        int i8;
        java.lang.String str3;
        int i9;
        wt.l lVar = n1Var.b;
        u03.baz bazVar = n1Var.f;
        if (quxVar instanceof com.truecaller.ui.m1) {
            m1Var = (com.truecaller.ui.m1) quxVar;
            int i10 = m1Var.G;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                m1Var.G = i10 - Integer.MIN_VALUE;
                com.truecaller.ui.m1 m1Var2 = m1Var;
                obj = m1Var2.E;
                barVar = ef3.bar.a;
                i = m1Var2.G;
                if (i == 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                int i11 = m1Var2.C;
                                f = m1Var2.D;
                                i5 = m1Var2.B;
                                java.lang.String str4 = m1Var2.y;
                                com.truecaller.ui.StatsType statsType4 = m1Var2.x;
                                od.p.E(obj);
                                str2 = str4;
                                statsType3 = statsType4;
                                i2 = 0;
                                i6 = i11;
                                num3 = (java.lang.Integer) obj;
                                if (num3 == null) {
                                    i7 = num3.intValue();
                                } else {
                                    i7 = i2;
                                }
                                i8 = com.truecaller.ui.o1.a[n1Var.p().ordinal()];
                                if (i8 == 1) {
                                    if (i8 != 2) {
                                        if (i8 != 3) {
                                            if (i8 != 4) {
                                                if (i8 == 5) {
                                                    str3 = "AllTime";
                                                } else {
                                                    throw new java.lang.RuntimeException();
                                                }
                                            } else {
                                                str3 = "365";
                                            }
                                        } else {
                                            str3 = "180";
                                        }
                                    } else {
                                        str3 = "90";
                                    }
                                } else {
                                    str3 = "30";
                                }
                                int b = qf3.a.b(f);
                                java.lang.String str5 = str3;
                                com.truecaller.ui.UserHomeStats userHomeStats = new com.truecaller.ui.UserHomeStats(str5, i5, b, i6, i7);
                                int i12 = i7;
                                i9 = com.truecaller.ui.l1.a[statsType3.ordinal()];
                                if (i9 == 1 && i9 != 2) {
                                    if (i9 == 3) {
                                        n1Var.t = userHomeStats;
                                    } else {
                                        throw new java.lang.RuntimeException();
                                    }
                                } else {
                                    ?? eVar = new hi3.e(qx2.uf.k, qx2.uf.l);
                                    java.lang.String value = statsType3.getValue();
                                    bi3.j0[] j0VarArr = ((hi3.e) eVar).b;
                                    hi3.e.d(j0VarArr[2], value);
                                    eVar.e = value;
                                    boolean[] zArr = ((hi3.e) eVar).c;
                                    zArr[2] = true;
                                    bi3.j0 j0Var = j0VarArr[3];
                                    eVar.f = str5;
                                    zArr[3] = true;
                                    bi3.j0 j0Var2 = j0VarArr[4];
                                    eVar.g = i5;
                                    zArr[4] = true;
                                    bi3.j0 j0Var3 = j0VarArr[5];
                                    eVar.h = b;
                                    zArr[5] = true;
                                    bi3.j0 j0Var4 = j0VarArr[6];
                                    eVar.i = i6;
                                    zArr[6] = true;
                                    bi3.j0 j0Var5 = j0VarArr[7];
                                    eVar.j = i12;
                                    zArr[7] = true;
                                    qx2.uf e = eVar.e();
                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(e, "build(...)");
                                    j71.g.K(e, n1Var.g);
                                }
                                com.truecaller.ui.g1 g1Var = new com.truecaller.ui.g1(2131233319, 2130970571, 2130970589, 2132023430, java.lang.String.valueOf(i5), false);
                                com.truecaller.ui.g1 g1Var2 = new com.truecaller.ui.g1(2131233317, 2130970569, 2130970586, 2132023432, str2, false);
                                com.truecaller.ui.g1 g1Var3 = new com.truecaller.ui.g1(2131233321, 2130970634, 2130970585, 2132023434, java.lang.String.valueOf(i6), false);
                                com.truecaller.ui.g1 g1Var4 = new com.truecaller.ui.g1(2131233320, 2130970570, 2130970594, 2132023431, java.lang.String.valueOf(i12), true);
                                com.truecaller.ui.g1[] g1VarArr = new com.truecaller.ui.g1[4];
                                g1VarArr[i2] = g1Var;
                                g1VarArr[1] = g1Var2;
                                g1VarArr[2] = g1Var3;
                                g1VarArr[3] = g1Var4;
                                return kotlin.collections.y.j(g1VarArr);
                            }
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        float f2 = m1Var2.D;
                        int i14 = m1Var2.B;
                        j2 = m1Var2.A;
                        long j3 = m1Var2.z;
                        java.lang.String str6 = m1Var2.y;
                        i2 = 0;
                        com.truecaller.ui.StatsType statsType5 = m1Var2.x;
                        od.p.E(obj);
                        c = f2;
                        statsType3 = statsType5;
                        str = str6;
                        i3 = i14;
                        j = j3;
                        num2 = (java.lang.Integer) obj;
                        if (num2 == null) {
                            i4 = num2.intValue();
                        } else {
                            i4 = i2;
                        }
                        m1Var2.x = statsType3;
                        m1Var2.y = str;
                        m1Var2.z = j;
                        m1Var2.A = j2;
                        m1Var2.B = i3;
                        m1Var2.D = c;
                        m1Var2.C = i4;
                        m1Var2.G = 3;
                        int i15 = i4;
                        obj = fg3.h0.W((kotlin.coroutines.CoroutineContext) lVar.b, new com.moloco.sdk.internal.services.analytics.bar(lVar, j, j2, (df3.bar) null, 5), m1Var2);
                        if (obj != barVar) {
                            str2 = str;
                            f = c;
                            i5 = i3;
                            i6 = i15;
                            num3 = (java.lang.Integer) obj;
                            if (num3 == null) {
                            }
                            i8 = com.truecaller.ui.o1.a[n1Var.p().ordinal()];
                            if (i8 == 1) {
                            }
                            int b2 = qf3.a.b(f);
                            java.lang.String str52 = str3;
                            com.truecaller.ui.UserHomeStats userHomeStats2 = new com.truecaller.ui.UserHomeStats(str52, i5, b2, i6, i7);
                            int i122 = i7;
                            i9 = com.truecaller.ui.l1.a[statsType3.ordinal()];
                            if (i9 == 1) {
                            }
                            ?? eVar2 = new hi3.e(qx2.uf.k, qx2.uf.l);
                            java.lang.String value2 = statsType3.getValue();
                            bi3.j0[] j0VarArr2 = ((hi3.e) eVar2).b;
                            hi3.e.d(j0VarArr2[2], value2);
                            eVar2.e = value2;
                            boolean[] zArr2 = ((hi3.e) eVar2).c;
                            zArr2[2] = true;
                            bi3.j0 j0Var6 = j0VarArr2[3];
                            eVar2.f = str52;
                            zArr2[3] = true;
                            bi3.j0 j0Var22 = j0VarArr2[4];
                            eVar2.g = i5;
                            zArr2[4] = true;
                            bi3.j0 j0Var32 = j0VarArr2[5];
                            eVar2.h = b2;
                            zArr2[5] = true;
                            bi3.j0 j0Var42 = j0VarArr2[6];
                            eVar2.i = i6;
                            zArr2[6] = true;
                            bi3.j0 j0Var52 = j0VarArr2[7];
                            eVar2.j = i122;
                            zArr2[7] = true;
                            qx2.uf e2 = eVar2.e();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(e2, "build(...)");
                            j71.g.K(e2, n1Var.g);
                            com.truecaller.ui.g1 g1Var5 = new com.truecaller.ui.g1(2131233319, 2130970571, 2130970589, 2132023430, java.lang.String.valueOf(i5), false);
                            com.truecaller.ui.g1 g1Var22 = new com.truecaller.ui.g1(2131233317, 2130970569, 2130970586, 2132023432, str2, false);
                            com.truecaller.ui.g1 g1Var32 = new com.truecaller.ui.g1(2131233321, 2130970634, 2130970585, 2132023434, java.lang.String.valueOf(i6), false);
                            com.truecaller.ui.g1 g1Var42 = new com.truecaller.ui.g1(2131233320, 2130970570, 2130970594, 2132023431, java.lang.String.valueOf(i122), true);
                            com.truecaller.ui.g1[] g1VarArr2 = new com.truecaller.ui.g1[4];
                            g1VarArr2[i2] = g1Var5;
                            g1VarArr2[1] = g1Var22;
                            g1VarArr2[2] = g1Var32;
                            g1VarArr2[3] = g1Var42;
                            return kotlin.collections.y.j(g1VarArr2);
                        }
                        return barVar;
                    }
                    i2 = 0;
                    long j4 = m1Var2.A;
                    long j5 = m1Var2.z;
                    com.truecaller.ui.StatsType statsType6 = m1Var2.x;
                    od.p.E(obj);
                    j2 = j4;
                    j = j5;
                    statsType2 = statsType6;
                } else {
                    i2 = 0;
                    od.p.E(obj);
                    ((u03.qux) bazVar).getClass();
                    long currentTimeMillis = java.lang.System.currentTimeMillis() - jk3.bar.S(statsPeriod, bazVar);
                    long currentTimeMillis2 = java.lang.System.currentTimeMillis();
                    statsType2 = statsType;
                    m1Var2.x = statsType2;
                    m1Var2.z = currentTimeMillis;
                    m1Var2.A = currentTimeMillis2;
                    m1Var2.G = 1;
                    j = currentTimeMillis;
                    j2 = currentTimeMillis2;
                    obj = fg3.h0.W((kotlin.coroutines.CoroutineContext) lVar.b, new vt2.c(lVar, j, j2, null, 1), m1Var2);
                }
                num = (java.lang.Integer) obj;
                if (num == null) {
                    i3 = num.intValue();
                } else {
                    i3 = i2;
                }
                oo1.f fVar = n1Var.h;
                c = fVar.a1.n(fVar, oo1.f.i1[108]).c(29.4f) * i3;
                java.lang.String f3 = n1Var.c.f(c);
                m1Var2.x = statsType2;
                m1Var2.y = f3;
                m1Var2.z = j;
                m1Var2.A = j2;
                m1Var2.B = i3;
                m1Var2.D = c;
                m1Var2.G = 2;
                obj = fg3.h0.W((kotlin.coroutines.CoroutineContext) lVar.b, new vt2.c(lVar, j, j2, null, 0), m1Var2);
                if (obj != barVar) {
                    statsType3 = statsType2;
                    str = f3;
                    num2 = (java.lang.Integer) obj;
                    if (num2 == null) {
                    }
                    m1Var2.x = statsType3;
                    m1Var2.y = str;
                    m1Var2.z = j;
                    m1Var2.A = j2;
                    m1Var2.B = i3;
                    m1Var2.D = c;
                    m1Var2.C = i4;
                    m1Var2.G = 3;
                    int i152 = i4;
                    obj = fg3.h0.W((kotlin.coroutines.CoroutineContext) lVar.b, new com.moloco.sdk.internal.services.analytics.bar(lVar, j, j2, (df3.bar) null, 5), m1Var2);
                    if (obj != barVar) {
                    }
                }
                return barVar;
            }
        }
        m1Var = new com.truecaller.ui.m1(n1Var, quxVar);
        com.truecaller.ui.m1 m1Var22 = m1Var;
        obj = m1Var22.E;
        barVar = ef3.bar.a;
        i = m1Var22.G;
        if (i == 0) {
        }
        num = (java.lang.Integer) obj;
        if (num == null) {
        }
        oo1.f fVar2 = n1Var.h;
        c = fVar2.a1.n(fVar2, oo1.f.i1[108]).c(29.4f) * i3;
        java.lang.String f32 = n1Var.c.f(c);
        m1Var22.x = statsType2;
        m1Var22.y = f32;
        m1Var22.z = j;
        m1Var22.A = j2;
        m1Var22.B = i3;
        m1Var22.D = c;
        m1Var22.G = 2;
        obj = fg3.h0.W((kotlin.coroutines.CoroutineContext) lVar.b, new vt2.c(lVar, j, j2, null, 0), m1Var22);
        if (obj != barVar) {
        }
        return barVar;
    }

    public final com.truecaller.stats.StatsPeriod p() {
        java.lang.String i = this.d.i("stats_preferred_period", "LAST_30_DAYS");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(i, "getString(...)");
        return com.truecaller.stats.StatsPeriod.valueOf(i);
    }
}
