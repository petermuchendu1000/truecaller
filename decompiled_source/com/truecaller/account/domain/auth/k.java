package com.truecaller.account.domain.auth;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class k {
    public final com.truecaller.account.domain.auth.g a;
    public final q11.bar b;
    public final kotlin.Lazy c;

    public k(com.truecaller.account.domain.auth.g gVar, q11.bar barVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gVar, "storeFactory");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "accountSettings");
        this.a = gVar;
        this.b = barVar;
        this.c = kotlin.LazyKt.lazy(new com.truecaller.account.domain.auth.f(this, 1));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:1|(2:3|(9:5|6|7|(1:(1:10)(2:19|20))(9:21|(5:24|(3:27|(1:29)(3:30|31|32)|25)|33|34|22)|35|36|(2:39|37)|40|41|42|(1:44))|11|12|(1:14)|15|16))|47|6|7|(0)(0)|11|12|(0)|15|16) */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0028, code lost:
    
        r13 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x015c, code lost:
    
        r14 = kotlin.q.b;
        r14 = od.p.o(r13);
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object a(com.truecaller.account.domain.auth.z0 z0Var, ff3.qux quxVar) {
        com.truecaller.account.domain.auth.h hVar;
        int i;
        java.lang.Throwable a;
        if (quxVar instanceof com.truecaller.account.domain.auth.h) {
            hVar = (com.truecaller.account.domain.auth.h) quxVar;
            int i2 = hVar.z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hVar.z = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = hVar.x;
                ef3.bar barVar = ef3.bar.a;
                i = hVar.z;
                if (i == 0) {
                    if (i == 1) {
                        od.p.E(obj);
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    java.util.Map map = z0Var.c;
                    java.util.ArrayList arrayList = new java.util.ArrayList(map.size());
                    for (java.util.Map.Entry entry : map.entrySet()) {
                        com.truecaller.account.domain.auth.g1 e = com.truecaller.account.domain.auth.h1.e();
                        e.b((java.lang.String) entry.getKey());
                        int i3 = 0;
                        for (java.lang.Object obj2 : (java.lang.Iterable) entry.getValue()) {
                            int i4 = i3 + 1;
                            if (i3 >= 0) {
                                com.truecaller.account.domain.auth.p1 p1Var = (com.truecaller.account.domain.auth.p1) obj2;
                                com.truecaller.account.domain.auth.x0 f = com.truecaller.account.domain.auth.y0.f();
                                f.a(p1Var.a);
                                java.lang.String pattern = p1Var.b.a.a.pattern();
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(pattern, "pattern(...)");
                                f.b(pattern);
                                e.a(i3, (com.truecaller.account.domain.auth.y0) f.build());
                                i3 = i4;
                            } else {
                                kotlin.collections.y.p();
                                throw null;
                            }
                        }
                        arrayList.add((com.truecaller.account.domain.auth.h1) e.build());
                    }
                    com.truecaller.account.domain.auth.baz j = com.truecaller.account.domain.auth.qux.j();
                    j.e();
                    j.b(z0Var.a);
                    j.c(z0Var.b);
                    j.a(arrayList);
                    com.truecaller.account.domain.auth.qux quxVar2 = (com.truecaller.account.domain.auth.qux) j.build();
                    java.util.Map map2 = z0Var.d;
                    java.util.ArrayList arrayList2 = new java.util.ArrayList(map2.size());
                    for (java.util.Map.Entry entry2 : map2.entrySet()) {
                        java.lang.Object key = entry2.getKey();
                        com.truecaller.account.domain.auth.w j2 = com.truecaller.account.domain.auth.x.j();
                        j2.e(((com.truecaller.account.domain.auth.o1) entry2.getValue()).a);
                        j2.c((java.lang.String) entry2.getKey());
                        j2.a(((com.truecaller.account.domain.auth.o1) entry2.getValue()).c);
                        j2.b(((com.truecaller.account.domain.auth.o1) entry2.getValue()).b);
                        arrayList2.add(new kotlin.Pair(key, j2.build()));
                    }
                    java.util.Map p = kotlin.collections.r0.p(arrayList2);
                    com.truecaller.account.domain.auth.b g = com.truecaller.account.domain.auth.d.g();
                    g.b(quxVar2);
                    g.a(p);
                    com.truecaller.account.domain.auth.d dVar = (com.truecaller.account.domain.auth.d) g.build();
                    t7.e eVar = (t7.e) this.c.getValue();
                    kotlin.o oVar = kotlin.q.b;
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.c cVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.c(dVar, (df3.bar) null, 2);
                    hVar.z = 1;
                    obj = eVar.a(cVar, hVar);
                    if (obj == barVar) {
                        return barVar;
                    }
                }
                com.truecaller.account.domain.auth.d o = (com.truecaller.account.domain.auth.d) obj;
                kotlin.o oVar2 = kotlin.q.b;
                a = kotlin.q.a(o);
                if (a != null) {
                    com.truecaller.log.AssertionUtil.reportThrowableButNeverCrash(a);
                }
                return kotlin.Unit.a;
            }
        }
        hVar = new com.truecaller.account.domain.auth.h(this, quxVar);
        java.lang.Object obj3 = hVar.x;
        ef3.bar barVar2 = ef3.bar.a;
        i = hVar.z;
        if (i == 0) {
        }
        com.truecaller.account.domain.auth.d o2 = (com.truecaller.account.domain.auth.d) obj3;
        kotlin.o oVar22 = kotlin.q.b;
        a = kotlin.q.a(o2);
        if (a != null) {
        }
        return kotlin.Unit.a;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:1|(2:3|(9:5|6|7|(1:(1:10)(2:19|20))(3:21|22|(1:24))|11|12|(1:14)|15|16))|27|6|7|(0)(0)|11|12|(0)|15|16) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0027, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0053, code lost:
    
        r0 = kotlin.q.b;
        r7 = od.p.o(r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object b(ff3.qux quxVar) {
        com.truecaller.account.domain.auth.i iVar;
        int i;
        java.lang.Throwable a;
        if (quxVar instanceof com.truecaller.account.domain.auth.i) {
            iVar = (com.truecaller.account.domain.auth.i) quxVar;
            int i2 = iVar.z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                iVar.z = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = iVar.x;
                ef3.bar barVar = ef3.bar.a;
                i = iVar.z;
                if (i == 0) {
                    if (i == 1) {
                        od.p.E(obj);
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    t7.e eVar = (t7.e) this.c.getValue();
                    kotlin.o oVar = kotlin.q.b;
                    int i3 = 2;
                    bt0.f fVar = new bt0.f(i3, i3, null);
                    iVar.z = 1;
                    obj = eVar.a(fVar, iVar);
                    if (obj == barVar) {
                        return barVar;
                    }
                }
                com.truecaller.account.domain.auth.d o = (com.truecaller.account.domain.auth.d) obj;
                kotlin.o oVar2 = kotlin.q.b;
                a = kotlin.q.a(o);
                if (a != null) {
                    com.truecaller.log.AssertionUtil.reportThrowableButNeverCrash(a);
                }
                return kotlin.Unit.a;
            }
        }
        iVar = new com.truecaller.account.domain.auth.i(this, quxVar);
        java.lang.Object obj2 = iVar.x;
        ef3.bar barVar2 = ef3.bar.a;
        i = iVar.z;
        if (i == 0) {
        }
        com.truecaller.account.domain.auth.d o2 = (com.truecaller.account.domain.auth.d) obj2;
        kotlin.o oVar22 = kotlin.q.b;
        a = kotlin.q.a(o2);
        if (a != null) {
        }
        return kotlin.Unit.a;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:1|(2:3|(11:5|6|7|(1:(1:10)(2:48|49))(3:50|51|(1:53))|11|12|(1:14)|15|(1:17)|18|(3:20|(1:22)|(10:24|(1:26)|27|(5:30|(2:33|31)|34|35|28)|36|37|(2:40|38)|41|42|43)(1:45))(1:46)))|56|6|7|(0)(0)|11|12|(0)|15|(0)|18|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x002b, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0054, code lost:
    
        r2 = kotlin.q.b;
        r0 = od.p.o(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object c(ff3.qux quxVar) {
        com.truecaller.account.domain.auth.j jVar;
        int i;
        com.truecaller.account.domain.auth.d o;
        java.lang.Throwable a;
        com.truecaller.account.domain.auth.d dVar;
        if (quxVar instanceof com.truecaller.account.domain.auth.j) {
            jVar = (com.truecaller.account.domain.auth.j) quxVar;
            int i2 = jVar.z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jVar.z = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = jVar.x;
                ef3.bar barVar = ef3.bar.a;
                i = jVar.z;
                if (i == 0) {
                    if (i == 1) {
                        od.p.E(obj);
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    t7.e eVar = (t7.e) this.c.getValue();
                    kotlin.o oVar = kotlin.q.b;
                    ig3.i data = eVar.getData();
                    jVar.z = 1;
                    obj = ig3.w1.B(data, jVar);
                    if (obj == barVar) {
                        return barVar;
                    }
                }
                o = (com.truecaller.account.domain.auth.d) obj;
                kotlin.o oVar2 = kotlin.q.b;
                a = kotlin.q.a(o);
                if (a != null) {
                    com.truecaller.log.AssertionUtil.reportThrowableButNeverCrash(a);
                }
                if (o instanceof kotlin.p) {
                    o = null;
                }
                dVar = o;
                if (dVar != null) {
                    return null;
                }
                com.truecaller.account.domain.auth.qux d = dVar.d();
                if (d.i() == 0) {
                    d = null;
                }
                if (d == null) {
                    return null;
                }
                long f = dVar.d().f();
                long i3 = dVar.d().i();
                com.google.protobuf.Internal.ProtobufList<com.truecaller.account.domain.auth.h1> h = dVar.d().h();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(h, "getEndpointList(...)");
                int i4 = 10;
                int b = kotlin.collections.q0.b(kotlin.collections.z.q(h, 10));
                if (b < 16) {
                    b = 16;
                }
                java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(b);
                for (com.truecaller.account.domain.auth.h1 h1Var : h) {
                    java.lang.String name = h1Var.getName();
                    com.google.protobuf.Internal.ProtobufList<com.truecaller.account.domain.auth.y0> d2 = h1Var.d();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(d2, "getSpecsList(...)");
                    java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.z.q(d2, i4));
                    for (com.truecaller.account.domain.auth.y0 y0Var : d2) {
                        java.lang.String d3 = y0Var.d();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(d3, "getId(...)");
                        java.lang.String e = y0Var.e();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(e, "getPath(...)");
                        arrayList.add(new com.truecaller.account.domain.auth.p1(d3, new com.truecaller.account.domain.auth.n1(new kotlin.text.Regex(e))));
                    }
                    linkedHashMap.put(name, arrayList);
                    i4 = 10;
                }
                java.util.Map f2 = dVar.f();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(f2, "getTokensMap(...)");
                java.util.ArrayList arrayList2 = new java.util.ArrayList(f2.size());
                for (java.util.Map.Entry entry : f2.entrySet()) {
                    java.lang.Object key = entry.getKey();
                    java.lang.String i5 = ((com.truecaller.account.domain.auth.x) entry.getValue()).i();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(i5, "getToken(...)");
                    arrayList2.add(new kotlin.Pair(key, new com.truecaller.account.domain.auth.o1(i5, ((com.truecaller.account.domain.auth.x) entry.getValue()).h(), ((com.truecaller.account.domain.auth.x) entry.getValue()).f())));
                }
                return new com.truecaller.account.domain.auth.z0(f, i3, linkedHashMap, kotlin.collections.r0.p(arrayList2));
            }
        }
        jVar = new com.truecaller.account.domain.auth.j(this, quxVar);
        java.lang.Object obj2 = jVar.x;
        ef3.bar barVar2 = ef3.bar.a;
        i = jVar.z;
        if (i == 0) {
        }
        o = (com.truecaller.account.domain.auth.d) obj2;
        kotlin.o oVar22 = kotlin.q.b;
        a = kotlin.q.a(o);
        if (a != null) {
        }
        if (o instanceof kotlin.p) {
        }
        dVar = o;
        if (dVar != null) {
        }
    }

    public final com.truecaller.account.domain.auth.k1 d() {
        f13.b bVar = this.b;
        java.lang.String h = bVar.h("installationId");
        java.lang.Long valueOf = java.lang.Long.valueOf(bVar.f("installationIdFetchTime", 0L));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(valueOf, "getLong(...)");
        long longValue = valueOf.longValue();
        java.lang.Long valueOf2 = java.lang.Long.valueOf(bVar.f("installationIdTtl", 0L));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(valueOf2, "getLong(...)");
        return new com.truecaller.account.domain.auth.k1(h, longValue, valueOf2.longValue());
    }

    public final void e(com.truecaller.account.domain.auth.k1 k1Var) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(k1Var, "value");
        java.lang.String str = k1Var.a;
        f13.b bVar = this.b;
        bVar.n("installationId", str);
        bVar.m("installationIdFetchTime", k1Var.b);
        bVar.m("installationIdTtl", k1Var.c);
    }
}
