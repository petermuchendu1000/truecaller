package com.truecaller.profile.impl.remote;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class e extends ff3.g implements kotlin.jvm.functions.Function2 {
    public java.lang.Object A;
    public java.lang.Object B;
    public final /* synthetic */ java.lang.Object C;
    public final /* synthetic */ int x;
    public int y;
    public java.lang.Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(androidx.lifecycle.n1 n1Var, df3.bar barVar, int i) {
        super(2, barVar);
        this.x = i;
        this.C = n1Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0109, code lost:
    
        if (r1.emit(r0, r13) != r2) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00c1, code lost:
    
        if (r6 == r2) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0071, code lost:
    
        if (r14 == r2) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0060, code lost:
    
        if (r14 == r2) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final java.lang.Object c(java.lang.Object obj) {
        android.net.Uri uri;
        d71.g gVar;
        java.lang.Object obj2;
        long j;
        android.net.Uri uri2;
        com.truecaller.data.entity.Contact contact;
        h71.j hVar;
        android.net.Uri uri3 = (android.net.Uri) this.C;
        f71.x xVar = (f71.x) this.B;
        ef3.bar barVar = ef3.bar.a;
        int i = this.y;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i == 5) {
                                od.p.E(obj);
                                return kotlin.Unit.a;
                            }
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        uri2 = (android.net.Uri) this.z;
                        od.p.E(obj);
                        contact = (com.truecaller.data.entity.Contact) obj;
                        ig3.v1 v1Var = xVar.z;
                        if (contact == null) {
                            hVar = new h71.j(contact, (vz1.baz) null);
                        } else {
                            hVar = new h71.h(uri2, (vz1.baz) null, false, 14);
                        }
                        this.z = null;
                        this.A = null;
                        this.y = 5;
                    } else {
                        d71.g gVar2 = (d71.g) this.A;
                        android.net.Uri uri4 = (android.net.Uri) this.z;
                        od.p.E(obj);
                        gVar = gVar2;
                        uri = uri4;
                        f71.x.t(xVar, new d71.j(uri3));
                        c71.y yVar = xVar.n;
                        java.lang.Long l = gVar.a;
                        if (l != null) {
                            j = l.longValue();
                        } else {
                            j = 0;
                        }
                        yVar.b(j, (java.lang.String) null);
                        this.z = uri;
                        this.A = null;
                        this.y = 4;
                        obj = f71.x.p(xVar, gVar, this);
                        if (obj != barVar) {
                            uri2 = uri;
                            contact = (com.truecaller.data.entity.Contact) obj;
                            ig3.v1 v1Var2 = xVar.z;
                            if (contact == null) {
                            }
                            this.z = null;
                            this.A = null;
                            this.y = 5;
                        }
                        return barVar;
                    }
                } else {
                    uri = (android.net.Uri) this.z;
                    od.p.E(obj);
                    gVar = (d71.g) obj;
                    java.lang.String str = gVar.d;
                    java.lang.String str2 = gVar.e;
                    java.util.List list = gVar.f;
                    java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.z.q(list, 10));
                    java.util.Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((com.truecaller.contacteditor.api.model.PhoneNumber) it.next()).a);
                    }
                    this.z = uri;
                    this.A = gVar;
                    this.y = 3;
                    h71.s sVar = ((h71.u) xVar.x.getValue()).h;
                    if (sVar.a && sVar.b) {
                        obj2 = xVar.q.u(str, str2, arrayList, this);
                    } else {
                        obj2 = java.lang.Boolean.FALSE;
                    }
                }
            } else {
                od.p.E(obj);
            }
        } else {
            od.p.E(obj);
            this.y = 1;
            obj = fg3.h0.W(xVar.b, new f71.w(xVar, uri3, (df3.bar) null, 0), this);
        }
        uri = (android.net.Uri) obj;
        ah.n nVar = xVar.e;
        this.z = uri;
        this.y = 2;
        obj = nVar.L(uri3, this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x005f, code lost:
    
        if (ig3.w1.m((ig3.i) r10, r1, r9) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0061, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0046, code lost:
    
        if (r10 == r0) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final java.lang.Object f(java.lang.Object obj) {
        g01.c cVar = (g01.c) this.A;
        java.util.Map.Entry entry = (java.util.Map.Entry) this.B;
        fg3.e0 e0Var = (fg3.e0) this.z;
        ef3.bar barVar = ef3.bar.a;
        int i = this.y;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    od.p.E(obj);
                    return kotlin.Unit.a;
                }
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od.p.E(obj);
        } else {
            od.p.E(obj);
            rz0.f fVar = cVar.g;
            java.lang.String str = (java.lang.String) entry.getKey();
            java.lang.String str2 = ((g01.qux) entry.getValue()).a;
            this.z = e0Var;
            this.y = 1;
            obj = fVar.b(str, str2, this);
        }
        ce2.i iVar = new ce2.i((kotlin.jvm.internal.j0) this.C, cVar, entry, e0Var, (df3.bar) null, 6);
        this.z = null;
        this.y = 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0229, code lost:
    
        if (kotlin.Unit.a == r5) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x022b, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0046, code lost:
    
        if (r6 == r5) goto L62;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final java.lang.Object g(java.lang.Object obj) {
        java.lang.Object a;
        h10.h hVar;
        h10.a aVar;
        h10.e eVar;
        com.truecaller.ads.analytics.c cVar;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        qx2.n nVar;
        o00.z zVar;
        java.lang.String str4;
        g10.m0 m0Var = (g10.m0) this.B;
        qc3.bar barVar = ((g10.m) this.A).k;
        java.lang.Object obj2 = this.z;
        g10.z zVar2 = (g10.z) this.C;
        kotlin.Unit unit = ef3.bar.a;
        int i = this.y;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    od.p.E(obj);
                    return kotlin.Unit.a;
                }
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od.p.E(obj);
            a = obj;
            if (((java.lang.Boolean) a).booleanValue()) {
                g40.baz bazVar = (g40.baz) barVar.get();
                h10.i iVar = (h10.b) obj2;
                this.y = 2;
                qc3.bar barVar2 = bazVar.a;
                com.truecaller.ads.auctionstrategy.model.AuctionStrategyConfig auctionStrategyConfig = m0Var.l;
                if (auctionStrategyConfig == null) {
                    zVar2.n(iVar);
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter("Auction -> Auction config is not available for " + iVar.c + " - " + m0Var.b(), "message");
                    kotlin.Unit unit2 = kotlin.Unit.a;
                } else {
                    h10.i iVar2 = iVar;
                    double d = iVar2.d;
                    double d2 = iVar2.d;
                    java.lang.String str5 = iVar2.c;
                    if (((float) d) >= auctionStrategyConfig.getTagPrice()) {
                        zVar2.n(iVar);
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("Auction -> " + str5 + " with " + d2 + " won the auction against " + auctionStrategyConfig.getTagPrice(), "message");
                        kotlin.Unit unit3 = kotlin.Unit.a;
                    } else {
                        bazVar.f.put(auctionStrategyConfig.getPlacement(), iVar);
                        s70.n nVar2 = new s70.n((float) d2, auctionStrategyConfig.getTagPrice());
                        zVar2.x(nVar2);
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("Auction -> " + str5 + " with " + d2 + " lost the auction against " + auctionStrategyConfig.getTagPrice(), "message");
                        kotlin.Unit unit4 = kotlin.Unit.a;
                        java.lang.String str6 = iVar2.c;
                        int code = com.truecaller.ads.analytics.AdRequestEventStatus.FAILURE.getCode();
                        java.lang.String name = iVar.n().name();
                        java.lang.String str7 = null;
                        if (iVar instanceof h10.h) {
                            hVar = (h10.h) iVar;
                        } else {
                            hVar = null;
                        }
                        if (hVar != null) {
                            aVar = ((h10.i) hVar).a;
                        } else {
                            aVar = null;
                        }
                        if (aVar instanceof h10.e) {
                            eVar = (h10.e) aVar;
                        } else {
                            eVar = null;
                        }
                        if (eVar != null) {
                            cVar = com.truecaller.ads.util.y0.w(eVar.p(), eVar.h());
                        } else {
                            cVar = null;
                        }
                        java.lang.String valueOf = java.lang.String.valueOf(d2);
                        java.lang.Long l = new java.lang.Long(auctionStrategyConfig.getReqTime());
                        java.lang.String c = ((u03.x) ((u03.w) barVar2.get())).c();
                        ((u03.qux) ((u03.baz) bazVar.b.get())).getClass();
                        java.lang.Long l2 = new java.lang.Long(java.lang.System.currentTimeMillis());
                        java.lang.String c2 = ((u03.x) ((u03.w) barVar2.get())).c();
                        java.lang.Integer num = new java.lang.Integer(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.ASSET_RESPONSE_DATA_ERROR_VALUE);
                        java.lang.String str8 = m0Var.b;
                        o00.bar barVar3 = m0Var.h;
                        java.util.List list = m0Var.f;
                        if (list != null && (str4 = (java.lang.String) kotlin.collections.CollectionsKt.firstOrNull(list)) != null) {
                            java.lang.Object obj3 = bazVar.d.get();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj3, "get(...)");
                            str = ((com.truecaller.ads.util.s0) obj3).a(str4, true);
                        } else {
                            str = null;
                        }
                        if (list != null) {
                            str2 = (java.lang.String) kotlin.collections.CollectionsKt.firstOrNull(list);
                        } else {
                            str2 = null;
                        }
                        java.lang.String str9 = m0Var.a;
                        java.lang.String str10 = m0Var.d;
                        int code2 = com.truecaller.ads.analytics.AdRequestEventSSP.AD_ROUTER_ON_GAM_API.getCode();
                        int code3 = com.truecaller.ads.analytics.AdRequestEventServedType.NETWORK.getCode();
                        java.util.List list2 = m0Var.c;
                        long longValue = l.longValue();
                        long longValue2 = l2.longValue();
                        if (barVar3 != null) {
                            str3 = barVar3.a;
                        } else {
                            str3 = null;
                        }
                        if (m0Var.k != null) {
                            java.lang.String str11 = m0Var.k;
                            if (barVar3 != null && (zVar = barVar3.e) != null) {
                                str7 = zVar.a;
                            }
                            nVar = new qx2.n(str11, null, null, null, str7);
                        } else {
                            nVar = null;
                        }
                        ((r90.bar) bazVar.c.get()).b(new com.truecaller.ads.analytics.j(str8, str, str2, str9, str10, code2, str6, code, code3, list2, name, cVar, valueOf, (java.lang.String) null, (java.util.List) null, longValue, longValue2, c, c2, num, ((z00.bar) nVar2).b, str3, nVar, (java.lang.Integer) null, (java.lang.String) null, 25190400));
                    }
                }
            } else {
                zVar2.n((h10.b) obj2);
            }
            return kotlin.Unit.a;
        }
        od.p.E(obj);
        if (obj2 instanceof h10.b) {
            g40.baz bazVar2 = (g40.baz) barVar.get();
            com.truecaller.ads.auctionstrategy.model.AuctionStrategyConfig auctionStrategyConfig2 = m0Var.l;
            this.y = 1;
            a = bazVar2.a(auctionStrategyConfig2);
        } else {
            if (obj2 instanceof z00.bar) {
                zVar2.x((z00.bar) obj2);
            } else {
                zVar2.x(s70.g0.d);
            }
            return kotlin.Unit.a;
        }
    }

    private final java.lang.Object j(java.lang.Object obj) {
        ef3.bar barVar = ef3.bar.a;
        int i = this.y;
        if (i != 0) {
            if (i == 1) {
                od.p.E(obj);
            } else {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            od.p.E(obj);
            androidx.lifecycle.t lifecycle = ((androidx.lifecycle.d0) this.z).getLifecycle();
            androidx.lifecycle.s sVar = androidx.lifecycle.s.d;
            eo2.q qVar = new eo2.q((androidx.lifecycle.n1) this.A, (r2.m6) this.B, (android.content.res.Resources) this.C, (df3.bar) null, 19);
            this.y = 1;
            if (androidx.lifecycle.g1.m(lifecycle, sVar, qVar, this) == barVar) {
                return barVar;
            }
        }
        return kotlin.Unit.a;
    }

    private final java.lang.Object k(java.lang.Object obj) {
        y7.baz bazVar = (y7.baz) this.A;
        ef3.bar barVar = ef3.bar.a;
        od.p.E(obj);
        bazVar.h(ga2.l.f, ((ga2.l) this.B).c.toJson((md2.bar[]) this.C));
        bazVar.h(ga2.l.g, new java.lang.Long(java.lang.System.currentTimeMillis()));
        bazVar.h(ga2.l.h, new java.lang.Integer(this.y));
        bazVar.h(ga2.l.i, (java.lang.String) this.z);
        return kotlin.Unit.a;
    }

    private final java.lang.Object l(java.lang.Object obj) {
        ef3.bar barVar = ef3.bar.a;
        int i = this.y;
        if (i != 0) {
            if (i == 1) {
                od.p.E(obj);
            } else {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            od.p.E(obj);
            androidx.lifecycle.d0 d0Var = (androidx.lifecycle.d0) this.z;
            androidx.lifecycle.s sVar = androidx.lifecycle.s.c;
            eo2.q qVar = new eo2.q((gh1.g) this.A, (e.g) this.B, (kotlin.jvm.functions.Function0) this.C, (df3.bar) null, 24);
            this.y = 1;
            if (androidx.lifecycle.g1.n(d0Var, sVar, qVar, this) == barVar) {
                return barVar;
            }
        }
        return kotlin.Unit.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00cf, code lost:
    
        if (gn1.o.q(r0, r12, r11) == r2) goto L32;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ba  */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Set, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.Set, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v11, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r8v8, types: [java.util.Set] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x008e -> B:17:0x00b8). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00a9 -> B:13:0x00ac). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final java.lang.Object m(java.lang.Object obj) {
        java.util.LinkedHashSet linkedHashSet;
        java.util.Iterator it;
        java.util.LinkedHashSet linkedHashSet2;
        gn1.p pVar;
        java.util.LinkedHashSet linkedHashSet3;
        gn1.o oVar = (gn1.o) this.C;
        eq.m0 m0Var = oVar.c;
        ef3.bar barVar = ef3.bar.a;
        int i = this.y;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        od.p.E(obj);
                        return kotlin.Unit.a;
                    }
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gn1.p pVar2 = (gn1.p) this.B;
                java.util.Iterator it3 = (java.util.Iterator) this.A;
                java.util.Set set = (java.util.Set) this.z;
                od.p.E(obj);
                java.util.LinkedHashSet linkedHashSet4 = set;
                if (!((java.lang.Boolean) obj).booleanValue()) {
                    linkedHashSet4.add(pVar2);
                }
                it = it3;
                linkedHashSet3 = linkedHashSet4;
                linkedHashSet = linkedHashSet3;
                if (!it.hasNext()) {
                    pVar = (gn1.p) it.next();
                    com.truecaller.familyprotect.api.protectionconfig.model.FamilyAutoRejectSource familyAutoRejectSource = pVar.a;
                    this.z = linkedHashSet;
                    this.A = it;
                    this.B = pVar;
                    this.y = 1;
                    java.lang.Object i2 = m0Var.i(familyAutoRejectSource, this);
                    if (i2 != barVar) {
                        linkedHashSet2 = linkedHashSet;
                        obj = i2;
                        linkedHashSet3 = linkedHashSet2;
                        if (((java.lang.Boolean) obj).booleanValue()) {
                            this.z = linkedHashSet2;
                            this.A = it;
                            this.B = pVar;
                            this.y = 2;
                            obj = ((ca2.baz) m0Var.c).b(this);
                            if (obj != barVar) {
                                gn1.p pVar3 = pVar;
                                it3 = it;
                                pVar2 = pVar3;
                                linkedHashSet4 = linkedHashSet2;
                                if (!((java.lang.Boolean) obj).booleanValue()) {
                                }
                                it = it3;
                                linkedHashSet3 = linkedHashSet4;
                            }
                        }
                        linkedHashSet = linkedHashSet3;
                        if (!it.hasNext()) {
                            java.util.Set g = kotlin.collections.a1.g((java.util.Set) oVar.j, linkedHashSet);
                            this.z = null;
                            this.A = null;
                            this.B = null;
                            this.y = 3;
                        }
                    }
                }
                return barVar;
            }
            gn1.p pVar4 = (gn1.p) this.B;
            java.util.Iterator it4 = (java.util.Iterator) this.A;
            java.util.Set set2 = (java.util.Set) this.z;
            od.p.E(obj);
            pVar = pVar4;
            it = it4;
            linkedHashSet2 = set2;
            linkedHashSet3 = linkedHashSet2;
            if (((java.lang.Boolean) obj).booleanValue()) {
            }
            linkedHashSet = linkedHashSet3;
            if (!it.hasNext()) {
            }
            return barVar;
        }
        od.p.E(obj);
        linkedHashSet = new java.util.LinkedHashSet();
        it = oVar.j.iterator();
        if (!it.hasNext()) {
        }
        return barVar;
    }

    private final java.lang.Object n(java.lang.Object obj) {
        eo1.b bVar;
        com.truecaller.favourite_contacts.analytics.FavouriteContactsPerformanceTracker.TraceType traceType;
        go1.t tVar;
        ef3.bar barVar = ef3.bar.a;
        int i = this.y;
        if (i != 0) {
            if (i == 1) {
                tVar = (go1.t) this.B;
                traceType = (com.truecaller.favourite_contacts.analytics.FavouriteContactsPerformanceTracker.TraceType) this.A;
                bVar = (eo1.b) this.z;
                try {
                    od.p.E(obj);
                } catch (java.lang.Throwable th) {
                    th = th;
                    bVar.a(traceType);
                    throw th;
                }
            } else {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            od.p.E(obj);
            go1.t tVar2 = (go1.t) this.C;
            eo1.b bVar2 = tVar2.f;
            com.truecaller.favourite_contacts.analytics.FavouriteContactsPerformanceTracker.TraceType traceType2 = com.truecaller.favourite_contacts.analytics.FavouriteContactsPerformanceTracker.TraceType.FAVOURITE_CONTACTS_LOADING_TRACE;
            bVar2.getClass();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(traceType2, "traceType");
            bVar2.b.put(traceType2, bVar2.a.d(traceType2.name()));
            try {
                ao1.b bVar3 = tVar2.b;
                this.z = bVar2;
                this.A = traceType2;
                this.B = tVar2;
                this.y = 1;
                java.lang.Object W = fg3.h0.W(bVar3.b, new ao1.bar(bVar3, (df3.bar) null), this);
                if (W == barVar) {
                    return barVar;
                }
                tVar = tVar2;
                obj = W;
                bVar = bVar2;
                traceType = traceType2;
            } catch (java.lang.Throwable th3) {
                th = th3;
                bVar = bVar2;
                traceType = traceType2;
                bVar.a(traceType);
                throw th;
            }
        }
        java.lang.Iterable iterable = (java.lang.Iterable) obj;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.z.q(iterable, 10));
        java.util.Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(new go1.k((com.truecaller.favorite_contacts_data.data.ContactFavoriteInfo) it.next()));
        }
        if (arrayList.isEmpty()) {
            ig3.h2 h2Var = tVar.h;
            go1.g gVar = go1.g.a;
            h2Var.getClass();
            h2Var.p((java.lang.Object) null, gVar);
        } else {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.addAll(arrayList);
            arrayList2.add(go1.j.a);
            ig3.h2 h2Var2 = tVar.h;
            go1.h hVar = new go1.h(arrayList2);
            h2Var2.getClass();
            h2Var2.p((java.lang.Object) null, hVar);
            fg3.h0.J(androidx.lifecycle.g1.l(tVar), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new go1.s(tVar, (df3.bar) null, 0), 3);
        }
        kotlin.Unit unit = kotlin.Unit.a;
        bVar.a(traceType);
        return kotlin.Unit.a;
    }

    private final java.lang.Object o(java.lang.Object obj) {
        ef3.bar barVar = ef3.bar.a;
        int i = this.y;
        if (i != 0) {
            if (i == 1) {
                od.p.E(obj);
            } else {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            od.p.E(obj);
            dn2.r rVar = ((go2.p) this.z).e;
            ym2.d0 d0Var = (ym2.d0) qn2.bar.a.invoke((pn2.e) this.A);
            kn2.bar barVar2 = (kn2.bar) this.B;
            l02.bar barVar3 = ln2.bar.b;
            com.truecaller.scamfeed.domain.entities.comments.CommentInfo commentInfo = (com.truecaller.scamfeed.domain.entities.comments.CommentInfo) barVar3.invoke(barVar2);
            java.util.List list = (java.util.List) this.C;
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.z.q(list, 10));
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add((com.truecaller.scamfeed.domain.entities.comments.CommentInfo) barVar3.invoke((kn2.bar) it.next()));
            }
            this.y = 1;
            if (rVar.d(d0Var, commentInfo, arrayList, this) == barVar) {
                return barVar;
            }
        }
        return kotlin.Unit.a;
    }

    public final df3.bar create(java.lang.Object obj, df3.bar barVar) {
        switch (this.x) {
            case 0:
                return new com.truecaller.profile.impl.remote.e((okhttp3.RequestBody) this.A, (com.truecaller.profile.impl.remote.g) this.B, (com.truecaller.profile.api.model.ImageSource) this.C, barVar, 0);
            case 1:
                return new com.truecaller.profile.impl.remote.e((v2.t0) this.A, (r2.m6) this.B, (com.truecaller.rewardprogram.impl.ui.qa.RewardProgramQaActivity) this.C, barVar, 1);
            case 2:
                return new com.truecaller.profile.impl.remote.e((androidx.lifecycle.d0) this.z, (com.truecaller.voicemail.presentation.deactivate.h) this.A, (r2.m6) this.B, (android.content.res.Resources) this.C, barVar, 2);
            case 3:
                return new com.truecaller.profile.impl.remote.e(this.A, this.B, this.C, (java.lang.String) this.z, barVar, 3);
            case 4:
                return new com.truecaller.profile.impl.remote.e((cu0.y) this.A, (android.content.Context) this.B, (android.os.Bundle) this.C, barVar, 4);
            case 5:
                return new com.truecaller.profile.impl.remote.e((d23.l) this.A, (java.lang.String) this.z, (androidx.media3.exoplayer.ExoPlayer) this.B, (java.lang.String) this.C, barVar);
            case 6:
                return new com.truecaller.profile.impl.remote.e((androidx.lifecycle.d0) this.z, (d53.k) this.A, (rb.e0) this.B, (kotlin.jvm.functions.Function0) this.C, barVar, 6);
            case 7:
                com.truecaller.profile.impl.remote.e eVar = new com.truecaller.profile.impl.remote.e((dn2.j0) this.B, (ym2.baz) this.C, barVar, 7);
                eVar.A = obj;
                return eVar;
            case 8:
                return new com.truecaller.profile.impl.remote.e((java.lang.String) this.z, (com.truecaller.service.Receiver) this.A, (android.content.Context) this.B, (android.content.Intent) this.C, barVar, 8);
            case 9:
                return new com.truecaller.profile.impl.remote.e((e53.n) this.z, (r2.m6) this.A, (android.content.res.Resources) this.B, (k4.r0) this.C, barVar, 9);
            case 10:
                return new com.truecaller.profile.impl.remote.e((r1.u) this.z, (ea0.a0) this.A, (ea0.u) this.B, (com.truecaller.ads.api.model.ad.AdPlacement) this.C, barVar, 10);
            case 11:
                return new com.truecaller.profile.impl.remote.e((r1.u) this.z, (zf3.baz) this.A, (ea0.u) this.B, (com.truecaller.ads.api.model.ad.AdPlacement) this.C, barVar, 11);
            case 12:
                return new com.truecaller.profile.impl.remote.e((ei0.v) this.B, (fg3.e0) this.C, barVar, 12);
            case 13:
                com.truecaller.profile.impl.remote.e eVar2 = new com.truecaller.profile.impl.remote.e((c1.qux) this.A, (kotlin.jvm.functions.Function0) this.B, (v2.a2) this.C, barVar, 13);
                eVar2.z = obj;
                return eVar2;
            case 14:
                return new com.truecaller.profile.impl.remote.e(this.A, this.B, this.C, (java.lang.String) this.z, barVar, 14);
            case 15:
                com.truecaller.profile.impl.remote.e eVar3 = new com.truecaller.profile.impl.remote.e((kotlin.jvm.functions.Function1) this.A, (f2.baz) this.B, (f2.a0) this.C, barVar, 15);
                eVar3.z = obj;
                return eVar3;
            case 16:
                return new com.truecaller.profile.impl.remote.e((f2.a1) this.z, (g2.s) this.A, (d4.w) this.B, (da0.baz) this.C, barVar, 16);
            case 17:
                com.truecaller.profile.impl.remote.e eVar4 = new com.truecaller.profile.impl.remote.e((re0.s0) this.B, (f42.z0) this.C, barVar, 17);
                eVar4.A = obj;
                return eVar4;
            case 18:
                return new com.truecaller.profile.impl.remote.e((java.lang.String[]) this.B, (f70.qux) this.C, barVar, 18);
            case 19:
                return new com.truecaller.profile.impl.remote.e((f71.x) this.B, (android.net.Uri) this.C, barVar, 19);
            case 20:
                return new com.truecaller.profile.impl.remote.e((kj1.bar) this.A, (com.truecaller.enterpriseinfo.api.model.ContactType) this.B, (java.lang.String) this.z, (java.lang.String) this.C, this.y, barVar);
            case 21:
                com.truecaller.profile.impl.remote.e eVar5 = new com.truecaller.profile.impl.remote.e((g01.c) this.A, (java.util.Map.Entry) this.B, (kotlin.jvm.internal.j0) this.C, barVar, 21);
                eVar5.z = obj;
                return eVar5;
            case 22:
                return new com.truecaller.profile.impl.remote.e(this.z, (g10.m) this.A, (g10.m0) this.B, (g10.z) this.C, barVar, 22);
            case 23:
                return new com.truecaller.profile.impl.remote.e((androidx.lifecycle.d0) this.z, (g53.d) this.A, (r2.m6) this.B, (android.content.res.Resources) this.C, barVar, 23);
            case 24:
                com.truecaller.profile.impl.remote.e eVar6 = new com.truecaller.profile.impl.remote.e((ga2.l) this.B, (md2.bar[]) this.C, this.y, (java.lang.String) this.z, barVar);
                eVar6.A = obj;
                return eVar6;
            case 25:
                return new com.truecaller.profile.impl.remote.e((androidx.lifecycle.d0) this.z, (gh1.g) this.A, (e.g) this.B, (kotlin.jvm.functions.Function0) this.C, barVar, 25);
            case 26:
                return new com.truecaller.profile.impl.remote.e((gn1.o) this.C, barVar, 26);
            case 27:
                return new com.truecaller.profile.impl.remote.e((go1.t) this.C, barVar, 27);
            case 28:
                return new com.truecaller.profile.impl.remote.e((go2.p) this.z, (pn2.e) this.A, (kn2.bar) this.B, (java.util.List) this.C, barVar, 28);
            default:
                return new com.truecaller.profile.impl.remote.e((go2.z2) this.z, (pn2.e) this.A, (kn2.bar) this.B, (kn2.bar) this.C, barVar, 29);
        }
    }

    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        switch (this.x) {
            case 0:
                return create((fg3.e0) obj, (df3.bar) obj2).invokeSuspend(kotlin.Unit.a);
            case 1:
                return create((fg3.e0) obj, (df3.bar) obj2).invokeSuspend(kotlin.Unit.a);
            case 2:
                return create((fg3.e0) obj, (df3.bar) obj2).invokeSuspend(kotlin.Unit.a);
            case 3:
                return create((fg3.e0) obj, (df3.bar) obj2).invokeSuspend(kotlin.Unit.a);
            case 4:
                return create((fg3.e0) obj, (df3.bar) obj2).invokeSuspend(kotlin.Unit.a);
            case 5:
                return create((fg3.e0) obj, (df3.bar) obj2).invokeSuspend(kotlin.Unit.a);
            case 6:
                return create((fg3.e0) obj, (df3.bar) obj2).invokeSuspend(kotlin.Unit.a);
            case 7:
                return create((ig3.j) obj, (df3.bar) obj2).invokeSuspend(kotlin.Unit.a);
            case 8:
                return create((fg3.e0) obj, (df3.bar) obj2).invokeSuspend(kotlin.Unit.a);
            case 9:
                return create((fg3.e0) obj, (df3.bar) obj2).invokeSuspend(kotlin.Unit.a);
            case 10:
                return create((fg3.e0) obj, (df3.bar) obj2).invokeSuspend(kotlin.Unit.a);
            case 11:
                return create((fg3.e0) obj, (df3.bar) obj2).invokeSuspend(kotlin.Unit.a);
            case 12:
                return create((java.util.Map) obj, (df3.bar) obj2).invokeSuspend(kotlin.Unit.a);
            case 13:
                return create((fg3.e0) obj, (df3.bar) obj2).invokeSuspend(kotlin.Unit.a);
            case 14:
                return create((fg3.e0) obj, (df3.bar) obj2).invokeSuspend(kotlin.Unit.a);
            case 15:
                create((k4.l0) obj, (df3.bar) obj2).invokeSuspend(kotlin.Unit.a);
                return ef3.bar.a;
            case 16:
                return create((fg3.e0) obj, (df3.bar) obj2).invokeSuspend(kotlin.Unit.a);
            case 17:
                return create((fg3.e0) obj, (df3.bar) obj2).invokeSuspend(kotlin.Unit.a);
            case 18:
                return create((fg3.e0) obj, (df3.bar) obj2).invokeSuspend(kotlin.Unit.a);
            case 19:
                return create((fg3.e0) obj, (df3.bar) obj2).invokeSuspend(kotlin.Unit.a);
            case 20:
                return create((fg3.e0) obj, (df3.bar) obj2).invokeSuspend(kotlin.Unit.a);
            case 21:
                return create((fg3.e0) obj, (df3.bar) obj2).invokeSuspend(kotlin.Unit.a);
            case 22:
                return create((fg3.e0) obj, (df3.bar) obj2).invokeSuspend(kotlin.Unit.a);
            case 23:
                return create((fg3.e0) obj, (df3.bar) obj2).invokeSuspend(kotlin.Unit.a);
            case 24:
                return create((y7.baz) obj, (df3.bar) obj2).invokeSuspend(kotlin.Unit.a);
            case 25:
                return create((fg3.e0) obj, (df3.bar) obj2).invokeSuspend(kotlin.Unit.a);
            case 26:
                return create((fg3.e0) obj, (df3.bar) obj2).invokeSuspend(kotlin.Unit.a);
            case 27:
                return create((fg3.e0) obj, (df3.bar) obj2).invokeSuspend(kotlin.Unit.a);
            case 28:
                return create((fg3.e0) obj, (df3.bar) obj2).invokeSuspend(kotlin.Unit.a);
            default:
                return create((fg3.e0) obj, (df3.bar) obj2).invokeSuspend(kotlin.Unit.a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:153:0x048b  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x04be  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x015c  */
    /* JADX WARN: Type inference failed for: r17v0, types: [kotlin.jvm.internal.i0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v41, types: [kotlin.jvm.internal.h0, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.String string;
        com.truecaller.rewardprogram.impl.ui.qa.RewardProgramQaActivity rewardProgramQaActivity;
        java.lang.Object value;
        cu0.f a;
        boolean z;
        com.truecaller.blocking.FilterMatch filterMatch;
        java.lang.Object b;
        java.lang.Object W;
        z9.e0 e0Var;
        java.lang.Object xVar;
        kotlin.jvm.internal.h0 h0Var;
        java.lang.Object a2;
        java.lang.Object c;
        ei0.v vVar;
        jg0.b bVar;
        java.lang.Object e;
        java.lang.String str;
        java.util.List h0;
        java.lang.Object b2;
        j70.bar barVar;
        java.lang.Object a3;
        com.truecaller.ads.keywords.model.AdCampaignsRestDto adCampaignsRestDto;
        switch (this.x) {
            case 0:
                int i = 0;
                pg2.bar barVar2 = pg2.bar.a;
                com.truecaller.profile.impl.remote.g gVar = (com.truecaller.profile.impl.remote.g) this.B;
                ef3.bar barVar3 = ef3.bar.a;
                int i2 = this.y;
                try {
                    if (i2 != 0) {
                        if (i2 == 1) {
                            string = (java.lang.String) this.z;
                            od.p.E(obj);
                        } else {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        od.p.E(obj);
                        com.truecaller.profile.impl.remote.baz bazVar = (com.truecaller.profile.impl.remote.baz) p40.l.k(com.truecaller.common.network.util.KnownEndpoints.IMAGES, com.truecaller.profile.impl.remote.baz.class);
                        okhttp3.RequestBody requestBody = (okhttp3.RequestBody) this.A;
                        int i3 = com.truecaller.profile.impl.remote.b.a[((com.truecaller.profile.api.model.ImageSource) this.C).ordinal()];
                        if (i3 != 1) {
                            if (i3 == 2) {
                                i = 3;
                            } else {
                                throw new java.lang.RuntimeException();
                            }
                        }
                        wj3.k0 H = bazVar.a(requestBody, i).H();
                        java.lang.Object obj2 = H.b;
                        okhttp3.Response response = H.a;
                        okhttp3.ResponseBody responseBody = (okhttp3.ResponseBody) obj2;
                        if (response.k() && responseBody != null) {
                            string = responseBody.string();
                            if (kotlin.jvm.internal.Intrinsics.b(string, "ignored")) {
                                return pg2.baz.a;
                            }
                            qg2.bar barVar4 = (qg2.bar) gVar.c.get();
                            this.z = string;
                            this.y = 1;
                            xg2.a aVar = (xg2.a) barVar4;
                            java.lang.Object W2 = fg3.h0.W(aVar.b, new xg2.baz(aVar, null, 1), this);
                            if (W2 != barVar3) {
                                W2 = kotlin.Unit.a;
                            }
                            if (W2 == barVar3) {
                                return barVar3;
                            }
                        } else {
                            int i4 = response.d;
                            if (i4 == 400) {
                                return pg2.qux.a;
                            }
                            if (i4 == 404) {
                                return pg2.a.a;
                            }
                            return barVar2;
                        }
                    }
                    return new pg2.b(string);
                } catch (java.io.IOException unused) {
                    return barVar2;
                }
            case 1:
                ef3.bar barVar5 = ef3.bar.a;
                int i5 = this.y;
                if (i5 != 0) {
                    if (i5 == 1) {
                        rewardProgramQaActivity = (com.truecaller.rewardprogram.impl.ui.qa.RewardProgramQaActivity) this.z;
                        od.p.E(obj);
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    v2.t0 t0Var = (v2.t0) this.A;
                    int i6 = com.truecaller.rewardprogram.impl.ui.qa.RewardProgramQaActivity.e0;
                    java.lang.String str2 = (java.lang.String) t0Var.getValue();
                    if (str2 != null) {
                        r2.m6 m6Var = (r2.m6) this.B;
                        com.truecaller.rewardprogram.impl.ui.qa.RewardProgramQaActivity rewardProgramQaActivity2 = (com.truecaller.rewardprogram.impl.ui.qa.RewardProgramQaActivity) this.C;
                        this.z = rewardProgramQaActivity2;
                        this.y = 1;
                        if (r2.m6.b(m6Var, str2, (java.lang.String) null, (r2.g6) null, this, 14) != barVar5) {
                            rewardProgramQaActivity = rewardProgramQaActivity2;
                        } else {
                            return barVar5;
                        }
                    }
                    return kotlin.Unit.a;
                }
                int i7 = com.truecaller.rewardprogram.impl.ui.qa.RewardProgramQaActivity.e0;
                ig3.h2 h2Var = rewardProgramQaActivity.s0().j;
                do {
                    value = h2Var.getValue();
                } while (!h2Var.n(value, (java.lang.Object) null));
                return kotlin.Unit.a;
            case 2:
                ef3.bar barVar6 = ef3.bar.a;
                int i8 = this.y;
                if (i8 != 0) {
                    if (i8 == 1) {
                        od.p.E(obj);
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    androidx.lifecycle.d0 d0Var = (androidx.lifecycle.d0) this.z;
                    androidx.lifecycle.s sVar = androidx.lifecycle.s.d;
                    com.truecaller.editprofile.impl.ui.legacy.m mVar = new com.truecaller.editprofile.impl.ui.legacy.m((com.truecaller.voicemail.presentation.deactivate.h) this.A, (r2.m6) this.B, (android.content.res.Resources) this.C, (df3.bar) null, 9);
                    this.y = 1;
                    if (androidx.lifecycle.g1.n(d0Var, sVar, mVar, this) == barVar6) {
                        return barVar6;
                    }
                }
                return kotlin.Unit.a;
            case 3:
                ef3.bar barVar7 = ef3.bar.a;
                int i9 = this.y;
                if (i9 != 0) {
                    if (i9 == 1) {
                        od.p.E(obj);
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    androidx.lifecycle.d0 d0Var2 = (androidx.lifecycle.d0) this.A;
                    androidx.lifecycle.s sVar2 = androidx.lifecycle.s.d;
                    com.truecaller.editprofile.impl.ui.legacy.m mVar2 = new com.truecaller.editprofile.impl.ui.legacy.m((ct0.l) this.B, (rb.e0) this.C, (java.lang.String) this.z, (df3.bar) null, 11);
                    this.y = 1;
                    if (androidx.lifecycle.g1.n(d0Var2, sVar2, mVar2, this) == barVar7) {
                        return barVar7;
                    }
                }
                return kotlin.Unit.a;
            case 4:
                ef3.bar barVar8 = ef3.bar.a;
                int i10 = this.y;
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5) {
                            od.p.E(obj);
                            return kotlin.Unit.a;
                        }
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    a = (cu0.f) this.z;
                    od.p.E(obj);
                    b = obj;
                    filterMatch = (com.truecaller.blocking.FilterMatch) b;
                } else {
                    od.p.E(obj);
                    cu0.y yVar = (cu0.y) this.A;
                    yVar.u0 = true;
                    yVar.m0 = (android.content.Context) this.B;
                    cu0.y yVar2 = (cu0.y) this.A;
                    fg3.k2 k2Var = yVar2.p0;
                    if (k2Var == null || !k2Var.isActive()) {
                        yVar2.p0 = fg3.h0.J(yVar2, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new cu0.q(yVar2, (df3.bar) null, 0), 3);
                    }
                    a = cu0.e.a((android.os.Bundle) this.C);
                    if (a != null) {
                        cu0.y yVar3 = (cu0.y) this.A;
                        java.lang.String str3 = a.b;
                        if (yVar3.f.b() && !yVar3.j.b(str3)) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!yVar3.U.h()) {
                            if (z && yVar3.y.g("android.permission.READ_PHONE_STATE")) {
                                z = true;
                            } else {
                                z = false;
                            }
                        }
                        if (!z) {
                            ((cu0.y) this.A).o();
                        } else {
                            int i11 = a.a;
                            if (i11 != 0) {
                                if (i11 != 1) {
                                    if (i11 != 2) {
                                        if (i11 == 3) {
                                            ((cu0.n1) ((cu0.y) this.A).X.get()).a = false;
                                            cu0.y yVar4 = (cu0.y) this.A;
                                            java.lang.String str4 = a.b;
                                            this.z = null;
                                            this.y = 5;
                                            if (cu0.y.d(yVar4, str4, this) == barVar8) {
                                                return barVar8;
                                            }
                                        }
                                    } else {
                                        ((cu0.n1) ((cu0.y) this.A).X.get()).a = true;
                                        cu0.y yVar5 = (cu0.y) this.A;
                                        java.lang.String str5 = a.b;
                                        int i12 = a.c;
                                        java.lang.String str6 = a.d;
                                        this.z = null;
                                        this.y = 4;
                                        if (cu0.y.c(yVar5, str5, i12, str6, this) == barVar8) {
                                            return barVar8;
                                        }
                                    }
                                } else {
                                    filterMatch = a.g;
                                    if (filterMatch == null) {
                                        ij0.e eVar = ((cu0.y) this.A).r;
                                        this.z = a;
                                        this.y = 1;
                                        b = eVar.b(this);
                                        if (b == barVar8) {
                                            return barVar8;
                                        }
                                        filterMatch = (com.truecaller.blocking.FilterMatch) b;
                                    }
                                }
                            } else {
                                cu0.y yVar6 = (cu0.y) this.A;
                                cu0.n0 n0Var = yVar6.B;
                                com.truecaller.callerid.CallerIdPerformanceTracker.TraceType traceType = com.truecaller.callerid.CallerIdPerformanceTracker.TraceType.CIDMGR_ONOUTGOINGCALL;
                                a10.k kVar = new a10.k(yVar6, a, (df3.bar) null, 13);
                                this.z = null;
                                this.y = 3;
                                if (n0Var.a(traceType, kVar, this) == barVar8) {
                                    return barVar8;
                                }
                            }
                        }
                        return kotlin.Unit.a;
                    }
                    throw new java.lang.IllegalArgumentException("Required value was null.");
                }
                com.truecaller.blocking.FilterMatch filterMatch2 = filterMatch;
                cu0.y yVar7 = (cu0.y) this.A;
                java.lang.String str7 = a.b;
                int i14 = a.c;
                java.lang.String str8 = a.d;
                int i15 = a.e;
                long j = a.f;
                this.z = null;
                this.y = 2;
                if (cu0.y.f(yVar7, str7, i14, str8, i15, j, filterMatch2, this) == barVar8) {
                    return barVar8;
                }
                return kotlin.Unit.a;
            case 5:
                d23.l lVar = (d23.l) this.A;
                androidx.media3.exoplayer.ExoPlayer exoPlayer = (androidx.media3.exoplayer.ExoPlayer) this.B;
                ef3.bar barVar9 = ef3.bar.a;
                int i16 = this.y;
                try {
                    if (i16 != 0) {
                        if (i16 == 1) {
                            od.p.E(obj);
                            W = obj;
                        } else {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        od.p.E(obj);
                        fg3.b0 b0Var = lVar.g;
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.qux quxVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.qux(lVar, (java.lang.String) this.C, (df3.bar) null, 28);
                        this.y = 1;
                        W = fg3.h0.W(b0Var, quxVar, this);
                        if (W == barVar9) {
                            return barVar9;
                        }
                    }
                    e0Var = (z9.e0) W;
                } catch (java.lang.Exception unused2) {
                    exoPlayer.setPlayWhenReady(false);
                }
                if (!kotlin.jvm.internal.Intrinsics.b(lVar.h.getValue(), (java.lang.String) this.z)) {
                    return kotlin.Unit.a;
                }
                exoPlayer.setMediaSource(e0Var);
                exoPlayer.prepare();
                exoPlayer.setPlayWhenReady(true);
                return kotlin.Unit.a;
            case 6:
                ef3.bar barVar10 = ef3.bar.a;
                int i17 = this.y;
                if (i17 != 0) {
                    if (i17 == 1) {
                        od.p.E(obj);
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    androidx.lifecycle.d0 d0Var3 = (androidx.lifecycle.d0) this.z;
                    androidx.lifecycle.s sVar3 = androidx.lifecycle.s.d;
                    com.truecaller.editprofile.impl.ui.legacy.m mVar3 = new com.truecaller.editprofile.impl.ui.legacy.m((d53.k) this.A, (rb.e0) this.B, (kotlin.jvm.functions.Function0) this.C, (df3.bar) null, 15);
                    this.y = 1;
                    if (androidx.lifecycle.g1.n(d0Var3, sVar3, mVar3, this) == barVar10) {
                        return barVar10;
                    }
                }
                return kotlin.Unit.a;
            case 7:
                ym2.baz bazVar2 = (ym2.baz) this.C;
                ig3.j jVar = (ig3.j) this.A;
                ef3.bar barVar11 = ef3.bar.a;
                int i18 = this.y;
                try {
                } catch (java.lang.Exception e2) {
                    com.truecaller.log.AssertionUtil.reportThrowableButNeverCrash(e2);
                }
                if (i18 != 0) {
                    if (i18 != 1) {
                        if (i18 == 2) {
                            od.p.E(obj);
                            return kotlin.Unit.a;
                        }
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.jvm.internal.h0 h0Var2 = (kotlin.jvm.internal.h0) this.z;
                    od.p.E(obj);
                    xVar = obj;
                    h0Var = h0Var2;
                } else {
                    od.p.E(obj);
                    ?? obj3 = new java.lang.Object();
                    ((kotlin.jvm.internal.h0) obj3).a = 1;
                    jm2.s sVar4 = (jm2.s) ((dn2.j0) this.B).b.get();
                    java.lang.String str9 = bazVar2.a;
                    java.lang.String str10 = bazVar2.b;
                    boolean z2 = bazVar2.d;
                    java.util.ArrayList arrayList = bazVar2.e;
                    boolean z3 = bazVar2.c;
                    this.A = jVar;
                    this.z = obj3;
                    this.y = 1;
                    sVar4.getClass();
                    ?? obj4 = new java.lang.Object();
                    xVar = new ig3.x(ig3.w1.h(new jm2.b(sVar4, str9, str10, z2, z3, arrayList, obj4, null)), new jm2.c((kotlin.jvm.internal.i0) obj4, (df3.bar) null));
                    h0Var = obj3;
                    if (xVar == barVar11) {
                        return barVar11;
                    }
                }
                a61.a aVar2 = new a61.a(jVar, bazVar2, h0Var, 4);
                this.A = null;
                this.z = null;
                this.y = 2;
                if (((ig3.i) xVar).collect(aVar2, this) == barVar11) {
                    return barVar11;
                }
                return kotlin.Unit.a;
            case 8:
                android.content.Intent intent = (android.content.Intent) this.C;
                android.content.Context context = (android.content.Context) this.B;
                com.truecaller.service.Receiver receiver = (com.truecaller.service.Receiver) this.A;
                ef3.bar barVar12 = ef3.bar.a;
                int i19 = this.y;
                if (i19 != 0) {
                    if (i19 == 1 || i19 == 2) {
                        od.p.E(obj);
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    java.lang.String str11 = (java.lang.String) this.z;
                    if (str11 != null) {
                        df3.bar barVar13 = null;
                        switch (str11.hashCode()) {
                            case -1326089125:
                                if (str11.equals("android.intent.action.PHONE_STATE")) {
                                    this.y = 1;
                                    int i20 = com.truecaller.service.Receiver.i;
                                    w91.a.a(new java.lang.Object[]{"Receiver.handlePhoneStateChanged"});
                                    cu0.n0 n0Var2 = receiver.d;
                                    if (n0Var2 != null) {
                                        java.lang.Object a4 = n0Var2.a(com.truecaller.callerid.CallerIdPerformanceTracker.TraceType.RCVR_PHONESTATEHANDLER_STATE_CHG, new dq2.j(receiver, context, intent, barVar13, 1), this);
                                        if (a4 != barVar12) {
                                            a4 = kotlin.Unit.a;
                                        }
                                        if (a4 == barVar12) {
                                            return barVar12;
                                        }
                                    } else {
                                        kotlin.jvm.internal.Intrinsics.n("performanceTracker");
                                        throw null;
                                    }
                                }
                                break;
                            case -1304749796:
                                if (str11.equals("com.truecaller.intent.action.PHONE_NOTIFICATION_CANCELLED")) {
                                    int intExtra = intent.getIntExtra("notificationType", 3);
                                    int i21 = com.truecaller.service.Receiver.i;
                                    if (intExtra == 3) {
                                        new z62.b(context).f();
                                        break;
                                    } else {
                                        new z62.b(context).i(intExtra);
                                        if (intExtra == 1) {
                                            nc0.l1 l1Var = receiver.h;
                                            if (l1Var != null) {
                                                l1Var.c("notificationBlockedCall", "Dismissed", new qx2.mi("", "Body"));
                                                break;
                                            } else {
                                                kotlin.jvm.internal.Intrinsics.n("searchAnalyticsManager");
                                                throw null;
                                            }
                                        }
                                    }
                                }
                                break;
                            case -19011148:
                                if (str11.equals("android.intent.action.LOCALE_CHANGED")) {
                                    nz1.b bVar2 = receiver.f;
                                    if (bVar2 != null) {
                                        bVar2.d(context);
                                        s62.f fVar = receiver.e;
                                        if (fVar != null) {
                                            fVar.c(true);
                                            s62.f fVar2 = receiver.e;
                                            if (fVar2 != null) {
                                                s62.f fVar3 = fVar2;
                                                fg3.h0.J(fVar3.e, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new r23.d(fVar3, barVar13, 6), 3);
                                                break;
                                            } else {
                                                kotlin.jvm.internal.Intrinsics.n("systemNotificationManager");
                                                throw null;
                                            }
                                        } else {
                                            kotlin.jvm.internal.Intrinsics.n("systemNotificationManager");
                                            throw null;
                                        }
                                    } else {
                                        kotlin.jvm.internal.Intrinsics.n("localizationManager");
                                        throw null;
                                    }
                                }
                                break;
                            case 1901012141:
                                if (str11.equals("android.intent.action.NEW_OUTGOING_CALL")) {
                                    this.y = 2;
                                    int i22 = com.truecaller.service.Receiver.i;
                                    w91.a.a(new java.lang.Object[]{"Receiver.handleNewOutgoingCall"});
                                    cu0.n0 n0Var3 = receiver.d;
                                    if (n0Var3 != null) {
                                        java.lang.Object a5 = n0Var3.a(com.truecaller.callerid.CallerIdPerformanceTracker.TraceType.RCVR_PHONESTATEHANDLER_OUTGOING, new dq2.j(receiver, context, intent, barVar13, 0), this);
                                        if (a5 != barVar12) {
                                            a5 = kotlin.Unit.a;
                                        }
                                        if (a5 == barVar12) {
                                            return barVar12;
                                        }
                                    } else {
                                        kotlin.jvm.internal.Intrinsics.n("performanceTracker");
                                        throw null;
                                    }
                                }
                                break;
                        }
                    }
                }
                return kotlin.Unit.a;
            case 9:
                e53.n nVar = (e53.n) this.z;
                ef3.bar barVar14 = ef3.bar.a;
                int i24 = this.y;
                if (i24 != 0) {
                    if (i24 == 1) {
                        od.p.E(obj);
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    ig3.d I = ig3.w1.I(nVar.i);
                    a63.w wVar = new a63.w((r2.m6) this.A, (android.content.res.Resources) this.B, nVar, (k4.r0) this.C, (df3.bar) null, 24);
                    this.y = 1;
                    if (ig3.w1.m(I, wVar, this) == barVar14) {
                        return barVar14;
                    }
                }
                return kotlin.Unit.a;
            case 10:
                com.truecaller.ads.api.model.ad.AdPlacement adPlacement = (com.truecaller.ads.api.model.ad.AdPlacement) this.C;
                ea0.u uVar = (ea0.u) this.B;
                r1.u uVar2 = (r1.u) this.z;
                ef3.bar barVar15 = ef3.bar.a;
                int i25 = this.y;
                if (i25 != 0) {
                    if (i25 != 1) {
                        if (i25 == 2) {
                            od.p.E(obj);
                            uVar.o(adPlacement);
                        } else {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        od.p.E(obj);
                        uVar.o(adPlacement);
                    }
                } else {
                    od.p.E(obj);
                    if (uVar2.m() <= 0) {
                        return kotlin.Unit.a;
                    }
                    ea0.x xVar2 = (ea0.a0) this.A;
                    if (xVar2 instanceof ea0.z) {
                        int d = uf3.p.d(0, 0, java.lang.Math.max(0, uVar2.m() - 1));
                        this.y = 1;
                        if (r1.u.u(uVar2, d, this) == barVar15) {
                            return barVar15;
                        }
                        uVar.o(adPlacement);
                    } else if (xVar2 instanceof ea0.x) {
                        int d2 = uf3.p.d(xVar2.a, 0, java.lang.Math.max(0, uVar2.m() - 1));
                        if (uVar2.d.a() != d2) {
                            c1.l1 u = c1.a.u(500, 0, (c1.t) null, 6);
                            this.y = 2;
                            if (r1.u.g(uVar2, d2, u, this, 2) == barVar15) {
                                return barVar15;
                            }
                        }
                        uVar.o(adPlacement);
                    } else if (!kotlin.jvm.internal.Intrinsics.b(xVar2, ea0.y.a)) {
                        throw new java.lang.RuntimeException();
                    }
                }
                return kotlin.Unit.a;
            case 11:
                ef3.bar barVar16 = ef3.bar.a;
                int i26 = this.y;
                if (i26 != 0) {
                    if (i26 == 1) {
                        od.p.E(obj);
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    ig3.i t = ig3.w1.t(androidx.compose.runtime.a.n(new ea0.b((r1.u) this.z, 0)));
                    zf3.baz bazVar3 = (zf3.baz) this.A;
                    ea0.c cVar = new ea0.c((ea0.u) this.B, (com.truecaller.ads.api.model.ad.AdPlacement) this.C, 0);
                    this.y = 1;
                    java.lang.Object collect = t.collect(new ag2.e(17, cVar, bazVar3), this);
                    if (collect != barVar16) {
                        collect = kotlin.Unit.a;
                    }
                    if (collect == barVar16) {
                        return barVar16;
                    }
                }
                return kotlin.Unit.a;
            case 12:
                ei0.v vVar2 = (ei0.v) this.B;
                qc3.bar barVar17 = vVar2.c;
                ef3.bar barVar18 = ef3.bar.a;
                int i27 = this.y;
                if (i27 != 0) {
                    if (i27 != 1) {
                        if (i27 == 2) {
                            vVar2 = (ei0.v) this.A;
                            ei0.v vVar3 = (ei0.v) this.z;
                            od.p.E(obj);
                            vVar = vVar3;
                            c = obj;
                            vVar2.l = (jg0.b) c;
                            bVar = vVar.l;
                            qc3.bar barVar19 = vVar.f;
                            if (bVar == null) {
                                ig3.h2 h2Var2 = vVar.i;
                                h2Var2.getClass();
                                h2Var2.p((java.lang.Object) null, bVar);
                                vVar.r(ei0.r.a);
                                vVar.p(com.truecaller.bizmon.banner.analytics.BizVerifiedCampaignAction.SHOWN);
                                if (((qg0.d) barVar19.get()).c(bVar)) {
                                    qg0.d dVar = (qg0.d) barVar19.get();
                                    ((u03.qux) vVar.g).getClass();
                                    dVar.b(java.lang.System.currentTimeMillis(), bVar);
                                }
                            } else {
                                vVar.o();
                            }
                            return kotlin.Unit.a;
                        }
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.p.E(obj);
                    a2 = obj;
                } else {
                    od.p.E(obj);
                    jg0.e eVar2 = (jg0.e) barVar17.get();
                    this.y = 1;
                    a2 = eVar2.a("cid");
                    if (a2 == barVar18) {
                        return barVar18;
                    }
                }
                og0.bar barVar20 = (og0.bar) a2;
                if (barVar20 != null) {
                    jg0.e eVar3 = (jg0.e) barVar17.get();
                    com.truecaller.data.entity.Contact contact = new com.truecaller.data.entity.Contact();
                    barVar20.a(com.truecaller.bizmon.banner.analytics.BizVerifiedCampaignDisplayType.FCID_V2);
                    kotlin.Unit unit = kotlin.Unit.a;
                    this.z = vVar2;
                    this.A = vVar2;
                    this.y = 2;
                    c = eVar3.c(contact, barVar20);
                    if (c != barVar18) {
                        vVar = vVar2;
                        vVar2.l = (jg0.b) c;
                        bVar = vVar.l;
                        qc3.bar barVar192 = vVar.f;
                        if (bVar == null) {
                        }
                        return kotlin.Unit.a;
                    }
                    return barVar18;
                }
                vVar2.o();
                return kotlin.Unit.a;
            case 13:
                fg3.e0 e0Var2 = (fg3.e0) this.z;
                ef3.bar barVar21 = ef3.bar.a;
                int i28 = this.y;
                if (i28 != 0) {
                    if (i28 != 1) {
                        if (i28 == 2) {
                            od.p.E(obj);
                            ((kotlin.jvm.functions.Function0) this.B).invoke();
                            return kotlin.Unit.a;
                        }
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.p.E(obj);
                } else {
                    od.p.E(obj);
                    fg3.h0.J(e0Var2, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new e1.g0((v2.a2) this.C, (df3.bar) null, 10), 3);
                    c1.qux quxVar2 = (c1.qux) this.A;
                    h5.c cVar2 = new h5.c(ek0.baz.b);
                    c1.l1 u2 = c1.a.u(300, 300, (c1.t) null, 4);
                    this.z = null;
                    this.y = 1;
                    if (c1.qux.c(quxVar2, cVar2, u2, (java.lang.Float) null, (kotlin.jvm.functions.Function1) null, this, 12) == barVar21) {
                        return barVar21;
                    }
                }
                c1.qux quxVar3 = (c1.qux) this.A;
                h5.c cVar3 = new h5.c(ek0.baz.a);
                c1.r0 t2 = c1.a.t(0.3f, 250.0f, (java.lang.Object) null, 4);
                this.z = null;
                this.y = 2;
                if (c1.qux.c(quxVar3, cVar3, t2, (java.lang.Float) null, (kotlin.jvm.functions.Function1) null, this, 12) == barVar21) {
                    return barVar21;
                }
                ((kotlin.jvm.functions.Function0) this.B).invoke();
                return kotlin.Unit.a;
            case 14:
                g10.m0 m0Var = (g10.m0) this.C;
                s70.k kVar2 = (s70.k) this.B;
                f10.baz bazVar4 = (f10.baz) this.A;
                ef3.bar barVar22 = ef3.bar.a;
                int i29 = this.y;
                if (i29 != 0) {
                    if (i29 == 1) {
                        od.p.E(obj);
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    java.lang.String str12 = kVar2.f;
                    if (str12 == null) {
                        str12 = m0Var.a;
                    }
                    java.lang.String str13 = kVar2.b;
                    java.lang.String str14 = m0Var.b;
                    java.lang.String str15 = kVar2.a;
                    java.lang.String str16 = kVar2.c;
                    java.lang.String a6 = ((com.truecaller.ads.util.k) bazVar4.b.get()).a();
                    java.lang.String str17 = kVar2.d;
                    java.lang.String b3 = kVar2.e.b();
                    java.lang.String str18 = bazVar4.e;
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str12, com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_AD_UNIT_ID);
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str13, "partnerId");
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str14, "trackerId");
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str15, "renderId");
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str16, "adType");
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str18, "appVersion");
                    java.util.LinkedHashMap j2 = kotlin.collections.r0.j(new kotlin.Pair[]{new kotlin.Pair("auid", str12), new kotlin.Pair("partnerId", str13), new kotlin.Pair("publisherId", "734f7b23d66740c0abcca5ec9c532200"), new kotlin.Pair("trackerId", str14), new kotlin.Pair("renderId", str15), new kotlin.Pair("param", str16), new kotlin.Pair("requestType", "tc_sdk"), new kotlin.Pair("appVersion", str18)});
                    if (a6 != null) {
                        j2.put("gaid", a6);
                    }
                    if (str17 != null) {
                        j2.put("ecpm", str17);
                    }
                    j2.put(com.unity3d.mediation.impression.LevelPlayImpressionData.IMPRESSION_DATA_KEY_PLACEMENT, b3);
                    b00.bar barVar23 = new b00.bar(bazVar4, (java.lang.String) this.z, j2, (df3.bar) null, 4);
                    this.y = 1;
                    if (ak.r0.h0(barVar23, this) == barVar22) {
                        return barVar22;
                    }
                }
                return kotlin.Unit.a;
            case 15:
                ef3.bar barVar24 = ef3.bar.a;
                int i30 = this.y;
                if (i30 != 0) {
                    if (i30 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.p.E(obj);
                } else {
                    od.p.E(obj);
                    a63.w wVar2 = new a63.w((k4.l0) this.z, (kotlin.jvm.functions.Function1) this.A, (f2.baz) this.B, (f2.a0) this.C, (df3.bar) null, 28);
                    this.y = 1;
                    if (fg3.h0.q(wVar2, this) == barVar24) {
                        return barVar24;
                    }
                }
                throw new java.lang.RuntimeException();
            case 16:
                ef3.bar barVar25 = ef3.bar.a;
                int i31 = this.y;
                if (i31 != 0) {
                    if (i31 == 1) {
                        od.p.E(obj);
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    f2.a1 a1Var = (f2.a1) this.z;
                    k1.h hVar = a1Var.x;
                    g2.s sVar5 = (g2.s) this.A;
                    d4.w wVar3 = (d4.w) this.B;
                    da0.baz bazVar5 = (da0.baz) this.C;
                    f2.u0 u0Var = new f2.u0(a1Var, 11);
                    this.y = 1;
                    sVar5.getClass();
                    java.lang.Object e3 = i1.t3.e(wVar3, new g2.t(hVar, sVar5, (df3.bar) null), new a2.q(bazVar5, sVar5, u0Var, 26), this);
                    if (e3 != barVar25) {
                        e3 = kotlin.Unit.a;
                    }
                    if (e3 != barVar25) {
                        e3 = kotlin.Unit.a;
                    }
                    if (e3 != barVar25) {
                        e3 = kotlin.Unit.a;
                    }
                    if (e3 == barVar25) {
                        return barVar25;
                    }
                }
                return kotlin.Unit.a;
            case 17:
                f42.z0 z0Var = (f42.z0) this.C;
                re0.s0 s0Var = (re0.s0) this.B;
                fg3.e0 e0Var3 = (fg3.e0) this.A;
                ef3.bar barVar26 = ef3.bar.a;
                int i32 = this.y;
                if (i32 != 0) {
                    if (i32 == 1) {
                        java.lang.String str19 = (java.lang.String) this.z;
                        od.p.E(obj);
                        e = obj;
                        str = str19;
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    java.lang.String c2 = s0Var.e().c();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(c2, "getId(...)");
                    se0.k3 e4 = s0Var.e();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(e4, "getSender(...)");
                    com.truecaller.data.entity.messaging.Participant a0 = ap1.d.a0(e4, (java.lang.Boolean) null, (java.lang.Integer) null, 15);
                    ij0.e eVar4 = z0Var.h;
                    java.lang.String str20 = a0.e;
                    this.A = e0Var3;
                    this.z = c2;
                    this.y = 1;
                    e = eVar4.e(str20, true, (java.lang.String) null, this);
                    if (e != barVar26) {
                        str = c2;
                    } else {
                        return barVar26;
                    }
                }
                if (((com.truecaller.blocking.FilterMatch) e).a()) {
                    return kotlin.Unit.a;
                }
                fg3.h0.J(e0Var3, z0Var.a, (fg3.f0) null, new c12.d(str, z0Var, s0Var, (df3.bar) null, 6), 2);
                return kotlin.Unit.a;
            case 18:
                f70.qux quxVar4 = (f70.qux) this.C;
                qc3.bar barVar27 = quxVar4.b;
                ef3.bar barVar28 = ef3.bar.a;
                int i34 = this.y;
                if (i34 != 0) {
                    if (i34 != 1) {
                        if (i34 != 2) {
                            if (i34 == 3) {
                                od.p.E(obj);
                                return kotlin.Unit.a;
                            }
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        j70.bar barVar29 = (j70.bar) this.A;
                        od.p.E(obj);
                        barVar = barVar29;
                        a3 = obj;
                        adCampaignsRestDto = (com.truecaller.ads.keywords.model.AdCampaignsRestDto) a3;
                        if (adCampaignsRestDto != null) {
                            g70.b bVar3 = (g70.b) barVar27.get();
                            this.z = null;
                            this.A = null;
                            this.y = 3;
                            bVar3.getClass();
                            java.lang.Object z4 = com.truecaller.ads.util.y0.z(new g70.a(bVar3, barVar, adCampaignsRestDto, (df3.bar) null), this);
                            if (z4 != barVar28) {
                                z4 = kotlin.Unit.a;
                            }
                            if (z4 == barVar28) {
                                return barVar28;
                            }
                        }
                        return kotlin.Unit.a;
                    }
                    h0 = (java.lang.Iterable) this.z;
                    od.p.E(obj);
                    b2 = obj;
                } else {
                    od.p.E(obj);
                    h0 = kotlin.collections.v.h0((java.lang.String[]) this.B);
                    g70.b bVar4 = (g70.b) barVar27.get();
                    this.z = h0;
                    this.y = 1;
                    b2 = bVar4.b(this);
                    if (b2 == barVar28) {
                        return barVar28;
                    }
                }
                java.util.List i0 = kotlin.collections.CollectionsKt.i0(h0, (java.lang.Iterable) b2);
                if (!i0.isEmpty()) {
                    j70.bar barVar30 = j70.bar.c;
                    com.moloco.sdk.internal.publisher.nativead.model.d dVar2 = new com.moloco.sdk.internal.publisher.nativead.model.d();
                    java.lang.String[] strArr = (java.lang.String[]) i0.toArray(new java.lang.String[0]);
                    dVar2.a((java.lang.String[]) java.util.Arrays.copyOf(strArr, strArr.length));
                    barVar = new j70.bar(dVar2);
                    com.truecaller.ads.keywords.network.c cVar4 = (com.truecaller.ads.keywords.network.c) quxVar4.c.get();
                    this.z = null;
                    this.A = barVar;
                    this.y = 2;
                    a3 = cVar4.a(barVar, this);
                    if (a3 == barVar28) {
                        return barVar28;
                    }
                    adCampaignsRestDto = (com.truecaller.ads.keywords.model.AdCampaignsRestDto) a3;
                    if (adCampaignsRestDto != null) {
                    }
                }
                return kotlin.Unit.a;
            case 19:
                return c(obj);
            case 20:
                ef3.bar barVar31 = ef3.bar.a;
                od.p.E(obj);
                kj1.bar barVar32 = (kj1.bar) this.A;
                com.truecaller.enterpriseinfo.api.model.ContactType contactType = (com.truecaller.enterpriseinfo.api.model.ContactType) this.B;
                java.lang.String str21 = (java.lang.String) this.z;
                java.lang.String str22 = (java.lang.String) this.C;
                int i35 = this.y;
                barVar32.getClass();
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contactType, "contactType");
                fg3.h0.J(androidx.lifecycle.g1.l(barVar32), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new bu1.e(barVar32, com.truecaller.enterpriseinfo.api.internal.analytics.EnterpriseInfoAction.SHOWN, contactType, str21, str22, i35, (df3.bar) null), 3);
                return kotlin.Unit.a;
            case 21:
                return f(obj);
            case 22:
                return g(obj);
            case 23:
                return j(obj);
            case 24:
                return k(obj);
            case 25:
                return l(obj);
            case 26:
                return m(obj);
            case 27:
                return n(obj);
            case 28:
                return o(obj);
            default:
                ef3.bar barVar33 = ef3.bar.a;
                int i36 = this.y;
                if (i36 != 0) {
                    if (i36 == 1) {
                        od.p.E(obj);
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    dn2.r rVar = ((go2.z2) this.z).d;
                    java.lang.String str23 = ((pn2.e) this.A).a;
                    kn2.bar barVar34 = (kn2.bar) this.B;
                    l02.bar barVar35 = ln2.bar.b;
                    com.truecaller.scamfeed.domain.entities.comments.CommentInfo commentInfo = (com.truecaller.scamfeed.domain.entities.comments.CommentInfo) barVar35.invoke(barVar34);
                    com.truecaller.scamfeed.domain.entities.comments.CommentInfo commentInfo2 = (com.truecaller.scamfeed.domain.entities.comments.CommentInfo) barVar35.invoke((kn2.bar) this.C);
                    this.y = 1;
                    if (rVar.h(str23, commentInfo, commentInfo2, this) == barVar33) {
                        return barVar33;
                    }
                }
                return kotlin.Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(d23.l lVar, java.lang.String str, androidx.media3.exoplayer.ExoPlayer exoPlayer, java.lang.String str2, df3.bar barVar) {
        super(2, barVar);
        this.x = 5;
        this.A = lVar;
        this.z = str;
        this.B = exoPlayer;
        this.C = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(ga2.l lVar, md2.bar[] barVarArr, int i, java.lang.String str, df3.bar barVar) {
        super(2, barVar);
        this.x = 24;
        this.B = lVar;
        this.C = barVarArr;
        this.y = i;
        this.z = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(java.lang.Object obj, java.lang.Object obj2, df3.bar barVar, int i) {
        super(2, barVar);
        this.x = i;
        this.B = obj;
        this.C = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, df3.bar barVar, int i) {
        super(2, barVar);
        this.x = i;
        this.A = obj;
        this.B = obj2;
        this.C = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, df3.bar barVar, int i) {
        super(2, barVar);
        this.x = i;
        this.z = obj;
        this.A = obj2;
        this.B = obj3;
        this.C = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.String str, df3.bar barVar, int i) {
        super(2, barVar);
        this.x = i;
        this.A = obj;
        this.B = obj2;
        this.C = obj3;
        this.z = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(kj1.bar barVar, com.truecaller.enterpriseinfo.api.model.ContactType contactType, java.lang.String str, java.lang.String str2, int i, df3.bar barVar2) {
        super(2, barVar2);
        this.x = 20;
        this.A = barVar;
        this.B = contactType;
        this.z = str;
        this.C = str2;
        this.y = i;
    }
}
