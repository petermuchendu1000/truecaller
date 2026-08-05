package com.truecaller.account.domain.auth;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class v0 {
    public final kotlin.coroutines.CoroutineContext a;
    public final fg3.e0 b;
    public final com.truecaller.account.domain.auth.l c;
    public final com.truecaller.account.domain.auth.k d;
    public final ly.qux e;
    public final af.a f;
    public final pg3.a g;
    public final pg3.a h;

    public v0(kotlin.coroutines.CoroutineContext coroutineContext, fg3.e0 e0Var, com.truecaller.account.domain.auth.l lVar, com.truecaller.account.domain.auth.k kVar, ly.qux quxVar, af.a aVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineContext, "ioContext");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(e0Var, "appScope");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lVar, "authRemoteDataSource");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kVar, "authLocalDataSource");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(quxVar, "currentTimeProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(aVar, "loggingUtil");
        this.a = coroutineContext;
        this.b = e0Var;
        this.c = lVar;
        this.d = kVar;
        this.e = quxVar;
        this.f = aVar;
        this.g = pg3.b.a();
        this.h = pg3.b.a();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(6:5|6|(1:(2:70|(4:(1:(1:(7:75|76|77|16|17|18|19)(2:81|82))(8:83|84|85|50|(3:52|(2:54|16)|63)|17|18|19))(6:86|87|88|36|37|(4:39|40|18|19)(4:41|(1:56)(1:45)|46|(2:48|63)(6:49|50|(0)|17|18|19)))|80|24|25)(6:91|92|93|30|31|(3:33|(4:35|36|37|(0)(0))|63)(7:60|14|15|16|17|18|19)))(1:9))(3:96|(1:98)|63)|10|11|(4:26|27|(4:29|30|31|(0)(0))|63)(7:13|14|15|16|17|18|19)))|99|6|(0)(0)|10|11|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01b3, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01b4, code lost:
    
        r9 = null;
        r2 = r1;
     */
    /* JADX WARN: Not initialized variable reg: 13, insn: 0x006d: MOVE (r2 I:??[OBJECT, ARRAY]) = (r13 I:??[OBJECT, ARRAY]) (LINE:110), block:B:95:0x006c */
    /* JADX WARN: Removed duplicated region for block: B:13:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e3 A[Catch: all -> 0x01a1, TRY_LEAVE, TryCatch #1 {all -> 0x01a1, blocks: (B:31:0x00db, B:33:0x00e3), top: B:30:0x00db }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x010f A[Catch: all -> 0x0081, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x0081, blocks: (B:88:0x007c, B:39:0x010f, B:43:0x0120, B:45:0x0126), top: B:87:0x007c }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0114 A[Catch: all -> 0x019d, TRY_ENTER, TRY_LEAVE, TryCatch #7 {all -> 0x019d, blocks: (B:50:0x0153, B:52:0x0171, B:37:0x010b, B:41:0x0114, B:46:0x012d, B:56:0x012b), top: B:36:0x010b }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0171 A[Catch: all -> 0x019d, TRY_LEAVE, TryCatch #7 {all -> 0x019d, blocks: (B:50:0x0153, B:52:0x0171, B:37:0x010b, B:41:0x0114, B:46:0x012d, B:56:0x012b), top: B:36:0x010b }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object a(com.truecaller.account.domain.auth.v0 v0Var, ff3.qux quxVar) {
        com.truecaller.account.domain.auth.c0 c0Var;
        int i;
        pg3.a aVar;
        int i2;
        pg3.a aVar2;
        pg3.a aVar3;
        java.lang.String str;
        com.truecaller.account.network.ExchangeCredentialsResponseDto exchangeCredentialsResponseDto;
        int i3;
        int i4;
        com.truecaller.account.domain.auth.k kVar;
        int i5;
        java.lang.String str2;
        java.lang.String domain;
        com.truecaller.account.domain.auth.k1 k1Var;
        int i6;
        com.truecaller.account.network.ExchangeCredentialsResponseDto exchangeCredentialsResponseDto2;
        java.lang.String str3;
        java.lang.Object obj;
        pg3.a aVar4;
        java.lang.Object obj2;
        pg3.a aVar5;
        com.truecaller.account.domain.auth.k kVar2 = v0Var.d;
        if (quxVar instanceof com.truecaller.account.domain.auth.c0) {
            c0Var = (com.truecaller.account.domain.auth.c0) quxVar;
            int i7 = c0Var.I;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                c0Var.I = i7 - Integer.MIN_VALUE;
                java.lang.Object obj3 = c0Var.G;
                java.lang.Object obj4 = ef3.bar.a;
                i = c0Var.I;
                int i8 = 0;
                if (i == 0) {
                    if (i != 1) {
                        try {
                        } catch (java.lang.Throwable th) {
                            th = th;
                            obj2 = null;
                            aVar3 = aVar5;
                        }
                        if (i != 2) {
                            if (i != 3) {
                                if (i != 4) {
                                    if (i == 5) {
                                        str2 = c0Var.z;
                                        aVar3 = (pg3.bar) c0Var.x;
                                        try {
                                            od.p.E(obj3);
                                            aVar2 = aVar3;
                                            obj = null;
                                            aVar2.h(obj);
                                            return str2;
                                        } catch (java.lang.Throwable th2) {
                                            th = th2;
                                        }
                                    } else {
                                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                } else {
                                    int i9 = c0Var.F;
                                    int i11 = c0Var.E;
                                    i4 = c0Var.D;
                                    com.truecaller.account.domain.auth.k kVar3 = c0Var.C;
                                    java.lang.String str4 = c0Var.B;
                                    exchangeCredentialsResponseDto = c0Var.A;
                                    java.lang.String str5 = c0Var.z;
                                    pg3.a aVar6 = (pg3.bar) c0Var.x;
                                    od.p.E(obj3);
                                    kVar = kVar3;
                                    str = str4;
                                    i3 = i11;
                                    i5 = i9;
                                    str2 = str5;
                                    aVar2 = aVar6;
                                    kVar.e(new com.truecaller.account.domain.auth.k1(str, ((java.lang.Number) obj3).longValue(), java.util.concurrent.TimeUnit.SECONDS.toMillis(exchangeCredentialsResponseDto.getTtl())));
                                    domain = exchangeCredentialsResponseDto.getDomain();
                                    if (domain != null) {
                                        c0Var.x = (pg3.bar) aVar2;
                                        c0Var.y = null;
                                        c0Var.z = str2;
                                        c0Var.A = null;
                                        c0Var.B = null;
                                        c0Var.C = null;
                                        c0Var.D = i4;
                                        c0Var.E = i3;
                                        c0Var.F = i5;
                                        c0Var.I = 5;
                                        kVar2.b.n("networkDomain", domain);
                                        if (kotlin.Unit.a != obj4) {
                                            aVar3 = aVar2;
                                            aVar2 = aVar3;
                                        }
                                        return obj4;
                                    }
                                    obj = null;
                                    aVar2.h(obj);
                                    return str2;
                                }
                            } else {
                                i5 = c0Var.F;
                                i3 = c0Var.E;
                                i6 = c0Var.D;
                                k1Var = c0Var.y;
                                aVar2 = (pg3.bar) c0Var.x;
                                try {
                                    od.p.E(obj3);
                                } catch (java.lang.Throwable th3) {
                                    th = th3;
                                    aVar3 = aVar2;
                                }
                                try {
                                    exchangeCredentialsResponseDto2 = (com.truecaller.account.network.ExchangeCredentialsResponseDto) obj3;
                                    if (exchangeCredentialsResponseDto2 != null) {
                                        str2 = k1Var.a;
                                        obj = null;
                                        aVar2.h(obj);
                                        return str2;
                                    }
                                    if (kotlin.jvm.internal.Intrinsics.b(exchangeCredentialsResponseDto2.getState(), com.truecaller.account.network.ExchangeCredentialsResponseDto.STATE_EXCHANGED) && exchangeCredentialsResponseDto2.getInstallationId() != null) {
                                        str3 = exchangeCredentialsResponseDto2.getInstallationId();
                                    } else {
                                        str3 = k1Var.a;
                                    }
                                    ly.qux quxVar2 = v0Var.e;
                                    c0Var.x = (pg3.bar) aVar2;
                                    c0Var.y = null;
                                    c0Var.z = str3;
                                    c0Var.A = exchangeCredentialsResponseDto2;
                                    c0Var.B = str3;
                                    c0Var.C = kVar2;
                                    c0Var.D = i6;
                                    c0Var.E = i3;
                                    c0Var.F = i5;
                                    c0Var.I = 4;
                                    java.lang.Object b = quxVar2.b(c0Var);
                                    if (b != obj4) {
                                        exchangeCredentialsResponseDto = exchangeCredentialsResponseDto2;
                                        str = str3;
                                        i4 = i6;
                                        obj3 = b;
                                        kVar = kVar2;
                                        str2 = str;
                                        kVar.e(new com.truecaller.account.domain.auth.k1(str, ((java.lang.Number) obj3).longValue(), java.util.concurrent.TimeUnit.SECONDS.toMillis(exchangeCredentialsResponseDto.getTtl())));
                                        domain = exchangeCredentialsResponseDto.getDomain();
                                        if (domain != null) {
                                        }
                                        obj = null;
                                        aVar2.h(obj);
                                        return str2;
                                    }
                                    return obj4;
                                } catch (java.lang.Throwable th4) {
                                    th = th4;
                                    aVar3 = aVar2;
                                    obj2 = null;
                                    aVar3.h(obj2);
                                    throw th;
                                }
                            }
                            obj2 = null;
                            aVar3.h(obj2);
                            throw th;
                        }
                        int i12 = c0Var.F;
                        int i13 = c0Var.E;
                        i6 = c0Var.D;
                        k1Var = c0Var.y;
                        aVar4 = (pg3.bar) c0Var.x;
                        od.p.E(obj3);
                        i8 = i13;
                        i5 = i12;
                        try {
                            if (!((java.lang.Boolean) obj3).booleanValue()) {
                                com.truecaller.account.domain.auth.l lVar = v0Var.c;
                                java.lang.String str6 = k1Var.a;
                                c0Var.x = (pg3.bar) aVar4;
                                c0Var.y = k1Var;
                                c0Var.D = i6;
                                c0Var.E = i8;
                                c0Var.F = i5;
                                c0Var.I = 3;
                                com.truecaller.account.domain.auth.r rVar = (com.truecaller.account.domain.auth.r) lVar;
                                obj3 = rVar.b(rVar.f, new by2.a(13, rVar, str6), c0Var);
                                if (obj3 != obj4) {
                                    i3 = i8;
                                    aVar2 = aVar4;
                                    exchangeCredentialsResponseDto2 = (com.truecaller.account.network.ExchangeCredentialsResponseDto) obj3;
                                    if (exchangeCredentialsResponseDto2 != null) {
                                    }
                                }
                                return obj4;
                            }
                            aVar3 = aVar4;
                            try {
                                str2 = k1Var.a;
                                aVar2 = aVar3;
                                obj = null;
                                aVar2.h(obj);
                                return str2;
                            } catch (java.lang.Throwable th5) {
                                th = th5;
                                obj2 = null;
                                aVar3.h(obj2);
                                throw th;
                            }
                        } catch (java.lang.Throwable th6) {
                            th = th6;
                            aVar3 = aVar4;
                            obj2 = null;
                            aVar3.h(obj2);
                            throw th;
                        }
                    }
                    i2 = c0Var.D;
                    pg3.a aVar7 = (pg3.bar) c0Var.x;
                    od.p.E(obj3);
                    aVar = aVar7;
                } else {
                    od.p.E(obj3);
                    aVar = v0Var.h;
                    c0Var.x = aVar;
                    c0Var.D = 0;
                    c0Var.I = 1;
                    if (aVar.d(c0Var) != obj4) {
                        i2 = 0;
                    }
                    return obj4;
                }
                k1Var = kVar2.d();
                if (k1Var.a == null) {
                    try {
                        c0Var.x = (pg3.bar) aVar;
                        c0Var.y = k1Var;
                        c0Var.D = i2;
                        c0Var.E = 0;
                        c0Var.F = 0;
                        c0Var.I = 2;
                        java.lang.Object m = v0Var.m(k1Var, c0Var);
                        if (m != obj4) {
                            aVar4 = aVar;
                            obj3 = m;
                            i6 = i2;
                            i5 = 0;
                            if (!((java.lang.Boolean) obj3).booleanValue()) {
                            }
                        }
                        return obj4;
                    } catch (java.lang.Throwable th7) {
                        th = th7;
                        aVar3 = aVar;
                        obj2 = null;
                        aVar3.h(obj2);
                        throw th;
                    }
                }
                aVar3 = aVar;
                str2 = k1Var.a;
                aVar2 = aVar3;
                obj = null;
                aVar2.h(obj);
                return str2;
            }
        }
        c0Var = new com.truecaller.account.domain.auth.c0(v0Var, quxVar);
        java.lang.Object obj32 = c0Var.G;
        java.lang.Object obj42 = ef3.bar.a;
        i = c0Var.I;
        int i82 = 0;
        if (i == 0) {
        }
        k1Var = kVar2.d();
        if (k1Var.a == null) {
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:8:0x0029. Please report as an issue. */
    /* JADX WARN: Not initialized variable reg: 12, insn: 0x005b: MOVE (r2 I:??[OBJECT, ARRAY]) = (r12 I:??[OBJECT, ARRAY]) (LINE:92), block:B:122:0x005a */
    /* JADX WARN: Removed duplicated region for block: B:104:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0225 A[Catch: all -> 0x0290, TRY_LEAVE, TryCatch #0 {all -> 0x0290, blocks: (B:33:0x01f0, B:34:0x021f, B:36:0x0225), top: B:32:0x01f0 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0126 A[Catch: all -> 0x0096, TRY_ENTER, TryCatch #2 {all -> 0x0096, blocks: (B:61:0x0126, B:63:0x0146, B:67:0x0164, B:72:0x0187, B:77:0x01aa, B:79:0x01ba, B:100:0x0092), top: B:99:0x0092 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00f9 A[Catch: all -> 0x02d8, TryCatch #4 {all -> 0x02d8, blocks: (B:59:0x0122, B:64:0x014d, B:65:0x015e, B:69:0x0174, B:70:0x0181, B:74:0x0195, B:75:0x01a4, B:84:0x01c8, B:91:0x00f1, B:93:0x00f9, B:97:0x02db, B:102:0x00d3), top: B:101:0x00d3 }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02db A[Catch: all -> 0x02d8, TRY_ENTER, TRY_LEAVE, TryCatch #4 {all -> 0x02d8, blocks: (B:59:0x0122, B:64:0x014d, B:65:0x015e, B:69:0x0174, B:70:0x0181, B:74:0x0195, B:75:0x01a4, B:84:0x01c8, B:91:0x00f1, B:93:0x00f9, B:97:0x02db, B:102:0x00d3), top: B:101:0x00d3 }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Enum b(com.truecaller.account.domain.auth.v0 v0Var, ff3.qux quxVar) {
        com.truecaller.account.domain.auth.d0 d0Var;
        java.lang.Object obj;
        pg3.bar barVar;
        pg3.bar barVar2;
        pg3.bar barVar3;
        int i;
        java.lang.Object c;
        pg3.bar barVar4;
        int i2;
        int i3;
        java.lang.Object n;
        com.truecaller.account.domain.auth.z0 z0Var;
        com.truecaller.account.domain.auth.b0 b0Var;
        int i4;
        int i5;
        com.truecaller.account.network.m mVar;
        com.truecaller.account.domain.auth.z0 z0Var2;
        com.truecaller.account.domain.auth.z0 z0Var3;
        int i6;
        com.truecaller.account.network.m mVar2;
        int i7;
        int i8;
        java.util.LinkedHashMap linkedHashMap;
        java.lang.Object obj2;
        pg3.bar barVar5;
        java.util.Iterator it;
        com.truecaller.account.domain.auth.z0 z0Var4;
        com.truecaller.account.domain.auth.k kVar = v0Var.d;
        try {
            if (quxVar instanceof com.truecaller.account.domain.auth.d0) {
                d0Var = (com.truecaller.account.domain.auth.d0) quxVar;
                int i9 = d0Var.H;
                if ((i9 & Integer.MIN_VALUE) != 0) {
                    d0Var.H = i9 - Integer.MIN_VALUE;
                    java.lang.Object obj3 = d0Var.F;
                    ef3.bar barVar6 = ef3.bar.a;
                    int i11 = 0;
                    switch (d0Var.H) {
                        case 0:
                            od.p.E(obj3);
                            barVar3 = v0Var.g;
                            d0Var.x = barVar3;
                            d0Var.C = 0;
                            d0Var.H = 1;
                            if (barVar3.d(d0Var) != barVar6) {
                                i = 0;
                                try {
                                    d0Var.x = barVar3;
                                    d0Var.C = i;
                                    d0Var.D = 0;
                                    d0Var.H = 2;
                                    c = kVar.c(d0Var);
                                    if (c != barVar6) {
                                        barVar4 = barVar3;
                                        obj3 = c;
                                        i2 = i;
                                        i3 = 0;
                                        try {
                                            com.truecaller.account.domain.auth.z0 z0Var5 = (com.truecaller.account.domain.auth.z0) obj3;
                                            d0Var.x = barVar4;
                                            d0Var.y = z0Var5;
                                            d0Var.C = i2;
                                            d0Var.D = i3;
                                            d0Var.E = 0;
                                            d0Var.H = 3;
                                            n = v0Var.n(z0Var5, d0Var);
                                            if (n == barVar6) {
                                                z0Var = z0Var5;
                                                obj3 = n;
                                                if (!((java.lang.Boolean) obj3).booleanValue()) {
                                                    com.truecaller.account.domain.auth.l lVar = v0Var.c;
                                                    d0Var.x = barVar4;
                                                    d0Var.y = z0Var;
                                                    d0Var.C = i2;
                                                    d0Var.D = i3;
                                                    d0Var.E = i11;
                                                    d0Var.H = 4;
                                                    com.truecaller.account.domain.auth.r rVar = (com.truecaller.account.domain.auth.r) lVar;
                                                    obj3 = rVar.b(rVar.d, new com.truecaller.account.domain.auth.m(rVar, 1), d0Var);
                                                    if (obj3 != barVar6) {
                                                        int i12 = i11;
                                                        i4 = i3;
                                                        i5 = i12;
                                                        mVar = (com.truecaller.account.network.m) obj3;
                                                        if (mVar != null) {
                                                            af.a aVar = v0Var.f;
                                                            java.io.IOException iOException = new java.io.IOException() { // from class: com.truecaller.account.domain.auth.AuthTokenRepositoryImpl$FetchConfigException
                                                            };
                                                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iOException, "e");
                                                            fg3.h0.J((fg3.e0) aVar.b, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.c(iOException, (df3.bar) null, 1), 3);
                                                            b0Var = com.truecaller.account.domain.auth.b0.c;
                                                            obj2 = null;
                                                            barVar4.h(obj2);
                                                            return b0Var;
                                                        }
                                                        if (z0Var == null) {
                                                            z0Var2 = new com.truecaller.account.domain.auth.z0();
                                                        } else {
                                                            z0Var2 = z0Var;
                                                        }
                                                        java.util.Map config = mVar.getConfig();
                                                        java.util.ArrayList arrayList = new java.util.ArrayList();
                                                        java.util.Iterator it2 = config.entrySet().iterator();
                                                        while (it2.hasNext()) {
                                                            kotlin.collections.d0.v(arrayList, (java.lang.Iterable) ((java.util.Map.Entry) it2.next()).getValue());
                                                        }
                                                        java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.z.q(arrayList, 10));
                                                        java.util.Iterator it3 = arrayList.iterator();
                                                        while (it3.hasNext()) {
                                                            arrayList2.add(((com.truecaller.account.network.p) it3.next()).getKey());
                                                        }
                                                        java.util.Map map = z0Var2.d;
                                                        java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
                                                        for (java.util.Map.Entry entry : map.entrySet()) {
                                                            if (arrayList2.contains(entry.getKey())) {
                                                                linkedHashMap2.put(entry.getKey(), entry.getValue());
                                                            }
                                                        }
                                                        ly.qux quxVar2 = v0Var.e;
                                                        d0Var.x = barVar4;
                                                        d0Var.y = null;
                                                        d0Var.z = mVar;
                                                        d0Var.A = z0Var2;
                                                        d0Var.B = linkedHashMap2;
                                                        d0Var.C = i2;
                                                        d0Var.D = i4;
                                                        d0Var.E = i5;
                                                        d0Var.H = 5;
                                                        java.lang.Object b = quxVar2.b(d0Var);
                                                        if (b != barVar6) {
                                                            int i13 = i2;
                                                            z0Var3 = z0Var2;
                                                            i6 = i13;
                                                            mVar2 = mVar;
                                                            obj3 = b;
                                                            i7 = i5;
                                                            i8 = i4;
                                                            linkedHashMap = linkedHashMap2;
                                                            try {
                                                                long longValue = ((java.lang.Number) obj3).longValue();
                                                                com.truecaller.account.domain.auth.z0 z0Var6 = z0Var3;
                                                                long millis = java.util.concurrent.TimeUnit.SECONDS.toMillis(mVar2.getTtl()) + longValue;
                                                                java.util.Map config2 = mVar2.getConfig();
                                                                java.util.LinkedHashMap linkedHashMap3 = new java.util.LinkedHashMap(kotlin.collections.q0.b(config2.size()));
                                                                it = config2.entrySet().iterator();
                                                                while (it.hasNext()) {
                                                                    java.lang.Object next = it.next();
                                                                    java.lang.Object key = ((java.util.Map.Entry) next).getKey();
                                                                    java.lang.Iterable iterable = (java.lang.Iterable) ((java.util.Map.Entry) next).getValue();
                                                                    java.util.Iterator it4 = it;
                                                                    barVar5 = barVar4;
                                                                    try {
                                                                        java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.z.q(iterable, 10));
                                                                        java.util.Iterator it5 = iterable.iterator();
                                                                        while (it5.hasNext()) {
                                                                            com.truecaller.account.network.p pVar = (com.truecaller.account.network.p) it5.next();
                                                                            arrayList3.add(new com.truecaller.account.domain.auth.p1(pVar.getKey(), new com.truecaller.account.domain.auth.n1(new kotlin.text.Regex(pVar.getPath()))));
                                                                            it5 = it5;
                                                                            longValue = longValue;
                                                                        }
                                                                        linkedHashMap3.put(key, arrayList3);
                                                                        barVar4 = barVar5;
                                                                        it = it4;
                                                                        longValue = longValue;
                                                                    } catch (java.lang.Throwable th) {
                                                                        th = th;
                                                                        barVar2 = barVar5;
                                                                        obj = null;
                                                                        barVar2.h(obj);
                                                                        throw th;
                                                                    }
                                                                }
                                                                barVar5 = barVar4;
                                                                z0Var6.getClass();
                                                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(linkedHashMap3, "endpointConfig");
                                                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(linkedHashMap, "tokens");
                                                                z0Var4 = new com.truecaller.account.domain.auth.z0(longValue, millis, linkedHashMap3, linkedHashMap);
                                                                d0Var.x = barVar5;
                                                                d0Var.y = null;
                                                                d0Var.z = null;
                                                                d0Var.A = null;
                                                                d0Var.B = null;
                                                                d0Var.C = i6;
                                                                d0Var.D = i8;
                                                                d0Var.E = i7;
                                                                d0Var.H = 6;
                                                                if (kVar.a(z0Var4, d0Var) != barVar6) {
                                                                    barVar2 = barVar5;
                                                                    try {
                                                                        b0Var = com.truecaller.account.domain.auth.b0.b;
                                                                        barVar4 = barVar2;
                                                                        obj2 = null;
                                                                        barVar4.h(obj2);
                                                                        return b0Var;
                                                                    } catch (java.lang.Throwable th2) {
                                                                        th = th2;
                                                                        obj = null;
                                                                        barVar2.h(obj);
                                                                        throw th;
                                                                    }
                                                                }
                                                            } catch (java.lang.Throwable th3) {
                                                                th = th3;
                                                                barVar5 = barVar4;
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    b0Var = com.truecaller.account.domain.auth.b0.a;
                                                    obj2 = null;
                                                    barVar4.h(obj2);
                                                    return b0Var;
                                                }
                                            }
                                        } catch (java.lang.Throwable th4) {
                                            th = th4;
                                            barVar2 = barVar4;
                                            obj = null;
                                            barVar2.h(obj);
                                            throw th;
                                        }
                                    }
                                } catch (java.lang.Throwable th5) {
                                    th = th5;
                                    barVar2 = barVar3;
                                    obj = null;
                                    barVar2.h(obj);
                                    throw th;
                                }
                            }
                            return barVar6;
                        case 1:
                            i = d0Var.C;
                            pg3.bar barVar7 = d0Var.x;
                            od.p.E(obj3);
                            barVar3 = barVar7;
                            d0Var.x = barVar3;
                            d0Var.C = i;
                            d0Var.D = 0;
                            d0Var.H = 2;
                            c = kVar.c(d0Var);
                            if (c != barVar6) {
                            }
                            return barVar6;
                        case 2:
                            i3 = d0Var.D;
                            i2 = d0Var.C;
                            barVar4 = d0Var.x;
                            try {
                                od.p.E(obj3);
                                com.truecaller.account.domain.auth.z0 z0Var52 = (com.truecaller.account.domain.auth.z0) obj3;
                                d0Var.x = barVar4;
                                d0Var.y = z0Var52;
                                d0Var.C = i2;
                                d0Var.D = i3;
                                d0Var.E = 0;
                                d0Var.H = 3;
                                n = v0Var.n(z0Var52, d0Var);
                                if (n == barVar6) {
                                }
                            } catch (java.lang.Throwable th6) {
                                th = th6;
                                obj = null;
                                barVar2 = barVar4;
                                barVar2.h(obj);
                                throw th;
                            }
                            break;
                        case 3:
                            i11 = d0Var.E;
                            i3 = d0Var.D;
                            i2 = d0Var.C;
                            com.truecaller.account.domain.auth.z0 z0Var7 = d0Var.y;
                            pg3.bar barVar8 = d0Var.x;
                            od.p.E(obj3);
                            z0Var = z0Var7;
                            barVar4 = barVar8;
                            if (!((java.lang.Boolean) obj3).booleanValue()) {
                            }
                            break;
                        case 4:
                            i5 = d0Var.E;
                            i4 = d0Var.D;
                            i2 = d0Var.C;
                            com.truecaller.account.domain.auth.z0 z0Var8 = d0Var.y;
                            pg3.bar barVar9 = d0Var.x;
                            od.p.E(obj3);
                            z0Var = z0Var8;
                            barVar4 = barVar9;
                            mVar = (com.truecaller.account.network.m) obj3;
                            if (mVar != null) {
                            }
                            break;
                        case 5:
                            i7 = d0Var.E;
                            i8 = d0Var.D;
                            i6 = d0Var.C;
                            linkedHashMap = d0Var.B;
                            z0Var3 = d0Var.A;
                            com.truecaller.account.network.m mVar3 = d0Var.z;
                            pg3.bar barVar10 = d0Var.x;
                            od.p.E(obj3);
                            mVar2 = mVar3;
                            barVar4 = barVar10;
                            long longValue2 = ((java.lang.Number) obj3).longValue();
                            com.truecaller.account.domain.auth.z0 z0Var62 = z0Var3;
                            long millis2 = java.util.concurrent.TimeUnit.SECONDS.toMillis(mVar2.getTtl()) + longValue2;
                            java.util.Map config22 = mVar2.getConfig();
                            java.util.LinkedHashMap linkedHashMap32 = new java.util.LinkedHashMap(kotlin.collections.q0.b(config22.size()));
                            it = config22.entrySet().iterator();
                            while (it.hasNext()) {
                            }
                            barVar5 = barVar4;
                            z0Var62.getClass();
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(linkedHashMap32, "endpointConfig");
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(linkedHashMap, "tokens");
                            z0Var4 = new com.truecaller.account.domain.auth.z0(longValue2, millis2, linkedHashMap32, linkedHashMap);
                            d0Var.x = barVar5;
                            d0Var.y = null;
                            d0Var.z = null;
                            d0Var.A = null;
                            d0Var.B = null;
                            d0Var.C = i6;
                            d0Var.D = i8;
                            d0Var.E = i7;
                            d0Var.H = 6;
                            if (kVar.a(z0Var4, d0Var) != barVar6) {
                            }
                            return barVar6;
                        case 6:
                            barVar2 = d0Var.x;
                            try {
                                od.p.E(obj3);
                                b0Var = com.truecaller.account.domain.auth.b0.b;
                                barVar4 = barVar2;
                                obj2 = null;
                                barVar4.h(obj2);
                                return b0Var;
                            } catch (java.lang.Throwable th7) {
                                th = th7;
                                obj = null;
                                barVar2.h(obj);
                                throw th;
                            }
                        default:
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
            }
            switch (d0Var.H) {
            }
        } catch (java.lang.Throwable th8) {
            th = th8;
            obj = null;
            barVar2 = barVar;
        }
        d0Var = new com.truecaller.account.domain.auth.d0(v0Var, quxVar);
        java.lang.Object obj32 = d0Var.F;
        ef3.bar barVar62 = ef3.bar.a;
        int i112 = 0;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:8:0x0027. Please report as an issue. */
    /* JADX WARN: Not initialized variable reg: 11, insn: 0x0072: MOVE (r2 I:??[OBJECT, ARRAY]) = (r11 I:??[OBJECT, ARRAY]) (LINE:115), block:B:97:0x0072 */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x01c9 A[Catch: all -> 0x003f, TryCatch #4 {all -> 0x003f, blocks: (B:14:0x003a, B:15:0x01bd, B:17:0x01c9, B:18:0x01cd), top: B:13:0x003a }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0148 A[Catch: all -> 0x009b, TRY_LEAVE, TryCatch #3 {all -> 0x009b, blocks: (B:39:0x0144, B:41:0x0148, B:45:0x016e, B:46:0x0175, B:53:0x0111, B:55:0x0119, B:59:0x01d6, B:61:0x01da, B:63:0x01de, B:65:0x01e6, B:66:0x01ea, B:72:0x0097, B:73:0x00e2, B:75:0x00e6, B:77:0x00ea, B:78:0x00f2), top: B:71:0x0097 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0119 A[Catch: all -> 0x009b, TryCatch #3 {all -> 0x009b, blocks: (B:39:0x0144, B:41:0x0148, B:45:0x016e, B:46:0x0175, B:53:0x0111, B:55:0x0119, B:59:0x01d6, B:61:0x01da, B:63:0x01de, B:65:0x01e6, B:66:0x01ea, B:72:0x0097, B:73:0x00e2, B:75:0x00e6, B:77:0x00ea, B:78:0x00f2), top: B:71:0x0097 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01d6 A[Catch: all -> 0x009b, TRY_ENTER, TryCatch #3 {all -> 0x009b, blocks: (B:39:0x0144, B:41:0x0148, B:45:0x016e, B:46:0x0175, B:53:0x0111, B:55:0x0119, B:59:0x01d6, B:61:0x01da, B:63:0x01de, B:65:0x01e6, B:66:0x01ea, B:72:0x0097, B:73:0x00e2, B:75:0x00e6, B:77:0x00ea, B:78:0x00f2), top: B:71:0x0097 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.io.Serializable c(com.truecaller.account.domain.auth.v0 v0Var, java.lang.String str, ff3.qux quxVar) {
        com.truecaller.account.domain.auth.e0 e0Var;
        pg3.bar barVar;
        pg3.bar barVar2;
        pg3.bar barVar3;
        java.lang.String str2;
        int i;
        java.lang.Object c;
        pg3.bar barVar4;
        java.lang.String str3;
        int i2;
        com.truecaller.account.domain.auth.z0 z0Var;
        com.truecaller.account.domain.auth.o1 o1Var;
        java.lang.Object o;
        com.truecaller.account.domain.auth.z0 z0Var2;
        java.lang.String str4;
        java.util.Map map;
        java.lang.String str5;
        java.util.Map map2;
        com.truecaller.account.domain.auth.o1 o1Var2;
        int i3;
        int i4;
        java.util.Map map3;
        com.truecaller.account.domain.auth.z0 z0Var3;
        int i5;
        int i6;
        com.truecaller.account.domain.auth.z0 z0Var4;
        int i7;
        pg3.bar barVar5;
        java.lang.String str6;
        com.truecaller.account.domain.auth.z0 a;
        com.truecaller.account.domain.auth.z0 z0Var5;
        java.lang.String str7;
        com.truecaller.account.domain.auth.o1 o1Var3;
        java.lang.String str8;
        com.truecaller.account.domain.auth.k kVar = v0Var.d;
        try {
            if (quxVar instanceof com.truecaller.account.domain.auth.e0) {
                e0Var = (com.truecaller.account.domain.auth.e0) quxVar;
                int i8 = e0Var.G;
                if ((i8 & Integer.MIN_VALUE) != 0) {
                    e0Var.G = i8 - Integer.MIN_VALUE;
                    java.lang.Object obj = e0Var.E;
                    ef3.bar barVar6 = ef3.bar.a;
                    int i9 = 0;
                    switch (e0Var.G) {
                        case 0:
                            od.p.E(obj);
                            barVar3 = v0Var.g;
                            str2 = str;
                            e0Var.x = str2;
                            e0Var.y = barVar3;
                            e0Var.B = 0;
                            e0Var.G = 1;
                            if (barVar3.d(e0Var) != barVar6) {
                                i = 0;
                                try {
                                    e0Var.x = str2;
                                    e0Var.y = barVar3;
                                    e0Var.B = i;
                                    e0Var.C = 0;
                                    e0Var.G = 2;
                                    c = kVar.c(e0Var);
                                    if (c != barVar6) {
                                        barVar4 = barVar3;
                                        obj = c;
                                        str3 = str2;
                                        i2 = 0;
                                        z0Var = (com.truecaller.account.domain.auth.z0) obj;
                                        if (z0Var == null && (map = z0Var.d) != null) {
                                            o1Var = (com.truecaller.account.domain.auth.o1) map.get(str3);
                                        } else {
                                            o1Var = null;
                                        }
                                        e0Var.x = str3;
                                        e0Var.y = barVar4;
                                        e0Var.z = z0Var;
                                        e0Var.B = i;
                                        e0Var.C = i2;
                                        e0Var.D = 0;
                                        e0Var.G = 3;
                                        o = v0Var.o(o1Var, e0Var);
                                        if (o == barVar6) {
                                            java.lang.String str9 = str3;
                                            z0Var2 = z0Var;
                                            obj = o;
                                            str4 = str9;
                                            if (!((java.lang.Boolean) obj).booleanValue()) {
                                                com.truecaller.account.domain.auth.l lVar = v0Var.c;
                                                e0Var.x = str4;
                                                e0Var.y = barVar4;
                                                e0Var.z = z0Var2;
                                                e0Var.B = i;
                                                e0Var.C = i2;
                                                e0Var.D = i9;
                                                e0Var.G = 4;
                                                com.truecaller.account.domain.auth.r rVar = (com.truecaller.account.domain.auth.r) lVar;
                                                obj = rVar.b(rVar.e, new com.truecaller.account.domain.auth.m(rVar, 0), e0Var);
                                                if (obj != barVar6) {
                                                    int i11 = i9;
                                                    i3 = i2;
                                                    i4 = i11;
                                                    map3 = (java.util.Map) obj;
                                                    if (map3 != null) {
                                                        kotlin.Pair pair = new kotlin.Pair(com.truecaller.account.domain.auth.b0.c, (java.lang.Object) null);
                                                        af.a aVar = v0Var.f;
                                                        java.io.IOException iOException = new java.io.IOException() { // from class: com.truecaller.account.domain.auth.AuthTokenRepositoryImpl$FetchTokenException
                                                        };
                                                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iOException, "e");
                                                        fg3.h0.J((fg3.e0) aVar.b, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.c(iOException, (df3.bar) null, 1), 3);
                                                        barVar4.h((java.lang.Object) null);
                                                        return pair;
                                                    }
                                                    if (z0Var2 == null) {
                                                        z0Var3 = new com.truecaller.account.domain.auth.z0();
                                                    } else {
                                                        z0Var3 = z0Var2;
                                                    }
                                                    e0Var.x = str4;
                                                    e0Var.y = barVar4;
                                                    e0Var.z = null;
                                                    e0Var.A = z0Var3;
                                                    e0Var.B = i;
                                                    e0Var.C = i3;
                                                    e0Var.D = i4;
                                                    e0Var.G = 5;
                                                    obj = v0Var.p(map3, e0Var);
                                                    if (obj != barVar6) {
                                                        i5 = i4;
                                                        i6 = i3;
                                                        z0Var4 = z0Var3;
                                                        i7 = i;
                                                        barVar5 = barVar4;
                                                        str6 = str4;
                                                        a = com.truecaller.account.domain.auth.z0.a(z0Var4, 0L, (java.util.Map) obj, 7);
                                                        e0Var.x = str6;
                                                        e0Var.y = barVar5;
                                                        e0Var.z = null;
                                                        e0Var.A = a;
                                                        e0Var.B = i7;
                                                        e0Var.C = i6;
                                                        e0Var.D = i5;
                                                        e0Var.G = 6;
                                                        if (kVar.a(a, e0Var) != barVar6) {
                                                            z0Var5 = a;
                                                            barVar2 = barVar5;
                                                            str7 = str6;
                                                            com.truecaller.account.domain.auth.b0 b0Var = com.truecaller.account.domain.auth.b0.b;
                                                            o1Var3 = (com.truecaller.account.domain.auth.o1) z0Var5.d.get(str7);
                                                            if (o1Var3 == null) {
                                                                str8 = o1Var3.a;
                                                            } else {
                                                                str8 = null;
                                                            }
                                                            kotlin.Pair pair2 = new kotlin.Pair(b0Var, str8);
                                                            barVar2.h((java.lang.Object) null);
                                                            return pair2;
                                                        }
                                                    }
                                                }
                                            } else {
                                                com.truecaller.account.domain.auth.b0 b0Var2 = com.truecaller.account.domain.auth.b0.a;
                                                if (z0Var2 != null && (map2 = z0Var2.d) != null && (o1Var2 = (com.truecaller.account.domain.auth.o1) map2.get(str4)) != null) {
                                                    str5 = o1Var2.a;
                                                } else {
                                                    str5 = null;
                                                }
                                                kotlin.Pair pair3 = new kotlin.Pair(b0Var2, str5);
                                                barVar4.h((java.lang.Object) null);
                                                return pair3;
                                            }
                                        }
                                    }
                                } catch (java.lang.Throwable th) {
                                    th = th;
                                    barVar2 = barVar3;
                                    barVar2.h((java.lang.Object) null);
                                    throw th;
                                }
                            }
                            return barVar6;
                        case 1:
                            int i12 = e0Var.B;
                            pg3.bar barVar7 = e0Var.y;
                            java.lang.String str10 = e0Var.x;
                            od.p.E(obj);
                            barVar3 = barVar7;
                            i = i12;
                            str2 = str10;
                            e0Var.x = str2;
                            e0Var.y = barVar3;
                            e0Var.B = i;
                            e0Var.C = 0;
                            e0Var.G = 2;
                            c = kVar.c(e0Var);
                            if (c != barVar6) {
                            }
                            return barVar6;
                        case 2:
                            i2 = e0Var.C;
                            i = e0Var.B;
                            barVar4 = e0Var.y;
                            str3 = e0Var.x;
                            try {
                                od.p.E(obj);
                                z0Var = (com.truecaller.account.domain.auth.z0) obj;
                                if (z0Var == null) {
                                    break;
                                }
                                o1Var = null;
                                e0Var.x = str3;
                                e0Var.y = barVar4;
                                e0Var.z = z0Var;
                                e0Var.B = i;
                                e0Var.C = i2;
                                e0Var.D = 0;
                                e0Var.G = 3;
                                o = v0Var.o(o1Var, e0Var);
                                if (o == barVar6) {
                                }
                            } catch (java.lang.Throwable th2) {
                                th = th2;
                                barVar2 = barVar4;
                                barVar2.h((java.lang.Object) null);
                                throw th;
                            }
                            break;
                        case 3:
                            i9 = e0Var.D;
                            i2 = e0Var.C;
                            i = e0Var.B;
                            com.truecaller.account.domain.auth.z0 z0Var6 = e0Var.z;
                            pg3.bar barVar8 = e0Var.y;
                            str4 = e0Var.x;
                            od.p.E(obj);
                            z0Var2 = z0Var6;
                            barVar4 = barVar8;
                            if (!((java.lang.Boolean) obj).booleanValue()) {
                            }
                            break;
                        case 4:
                            i4 = e0Var.D;
                            i3 = e0Var.C;
                            i = e0Var.B;
                            com.truecaller.account.domain.auth.z0 z0Var7 = e0Var.z;
                            pg3.bar barVar9 = e0Var.y;
                            str4 = e0Var.x;
                            od.p.E(obj);
                            z0Var2 = z0Var7;
                            barVar4 = barVar9;
                            map3 = (java.util.Map) obj;
                            if (map3 != null) {
                            }
                            break;
                        case 5:
                            i5 = e0Var.D;
                            i6 = e0Var.C;
                            i7 = e0Var.B;
                            z0Var4 = e0Var.A;
                            barVar5 = e0Var.y;
                            str6 = e0Var.x;
                            try {
                                od.p.E(obj);
                                a = com.truecaller.account.domain.auth.z0.a(z0Var4, 0L, (java.util.Map) obj, 7);
                                e0Var.x = str6;
                                e0Var.y = barVar5;
                                e0Var.z = null;
                                e0Var.A = a;
                                e0Var.B = i7;
                                e0Var.C = i6;
                                e0Var.D = i5;
                                e0Var.G = 6;
                                if (kVar.a(a, e0Var) != barVar6) {
                                }
                                return barVar6;
                            } catch (java.lang.Throwable th3) {
                                th = th3;
                                barVar2 = barVar5;
                                barVar2.h((java.lang.Object) null);
                                throw th;
                            }
                        case 6:
                            z0Var5 = e0Var.A;
                            barVar2 = e0Var.y;
                            str7 = e0Var.x;
                            try {
                                od.p.E(obj);
                                com.truecaller.account.domain.auth.b0 b0Var3 = com.truecaller.account.domain.auth.b0.b;
                                o1Var3 = (com.truecaller.account.domain.auth.o1) z0Var5.d.get(str7);
                                if (o1Var3 == null) {
                                }
                                kotlin.Pair pair22 = new kotlin.Pair(b0Var3, str8);
                                barVar2.h((java.lang.Object) null);
                                return pair22;
                            } catch (java.lang.Throwable th4) {
                                th = th4;
                                barVar2.h((java.lang.Object) null);
                                throw th;
                            }
                        default:
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
            }
            switch (e0Var.G) {
            }
        } catch (java.lang.Throwable th5) {
            th = th5;
            barVar2 = barVar;
        }
        e0Var = new com.truecaller.account.domain.auth.e0(v0Var, quxVar);
        java.lang.Object obj2 = e0Var.E;
        ef3.bar barVar62 = ef3.bar.a;
        int i92 = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c2, code lost:
    
        if (r13 != r0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0098, code lost:
    
        if (r13 == r0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0068, code lost:
    
        if (r13 == r0) goto L21;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:8:0x0026. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object d(ff3.qux quxVar) {
        com.truecaller.account.domain.auth.g0 g0Var;
        int i;
        com.truecaller.account.domain.auth.z0 z0Var;
        com.truecaller.account.domain.auth.v0 v0Var;
        com.truecaller.account.domain.auth.AuthTokensState authTokensState;
        com.truecaller.account.domain.auth.AuthTokensState authTokensState2;
        java.lang.Integer num;
        com.truecaller.account.domain.auth.AuthTokensState authTokensState3;
        if (quxVar instanceof com.truecaller.account.domain.auth.g0) {
            g0Var = (com.truecaller.account.domain.auth.g0) quxVar;
            int i2 = g0Var.D;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                g0Var.D = i2 - Integer.MIN_VALUE;
                com.truecaller.account.domain.auth.g0 g0Var2 = g0Var;
                java.lang.Object obj = g0Var2.B;
                java.lang.Integer num2 = ef3.bar.a;
                i = g0Var2.D;
                kotlin.coroutines.CoroutineContext coroutineContext = this.a;
                com.truecaller.account.domain.auth.k kVar = this.d;
                switch (i) {
                    case 0:
                        od.p.E(obj);
                        g0Var2.D = 1;
                        obj = kVar.c(g0Var2);
                        break;
                    case 1:
                        od.p.E(obj);
                        com.truecaller.account.domain.auth.z0 z0Var2 = (com.truecaller.account.domain.auth.z0) obj;
                        if (z0Var2 != null) {
                            g0Var2.x = z0Var2;
                            g0Var2.D = 2;
                            java.lang.Object g = g(z0Var2, g0Var2);
                            if (g != num2) {
                                z0Var = z0Var2;
                                obj = g;
                                if (!((java.lang.Boolean) obj).booleanValue()) {
                                    long j = z0Var.b;
                                    long j2 = j - z0Var.a;
                                    g0Var2.x = z0Var;
                                    g0Var2.D = 5;
                                    v0Var = this;
                                    obj = v0Var.k(j, j2, g0Var2);
                                    break;
                                }
                            }
                            return num2;
                        }
                        v0Var = this;
                        com.truecaller.account.domain.auth.f0 f0Var = new com.truecaller.account.domain.auth.f0(this, null, 3);
                        g0Var2.x = null;
                        g0Var2.D = 3;
                        obj = fg3.h0.W(coroutineContext, f0Var, g0Var2);
                        break;
                    case 2:
                        com.truecaller.account.domain.auth.z0 z0Var3 = g0Var2.x;
                        od.p.E(obj);
                        z0Var = z0Var3;
                        if (!((java.lang.Boolean) obj).booleanValue()) {
                        }
                        v0Var = this;
                        com.truecaller.account.domain.auth.f0 f0Var2 = new com.truecaller.account.domain.auth.f0(this, null, 3);
                        g0Var2.x = null;
                        g0Var2.D = 3;
                        obj = fg3.h0.W(coroutineContext, f0Var2, g0Var2);
                        break;
                    case 3:
                        od.p.E(obj);
                        v0Var = this;
                        com.truecaller.account.domain.auth.AuthTokensState d = ((com.truecaller.account.domain.auth.b0) obj).d();
                        g0Var2.x = null;
                        g0Var2.y = d;
                        g0Var2.D = 4;
                        java.lang.Object c = kVar.c(g0Var2);
                        if (c != num2) {
                            authTokensState = d;
                            obj = c;
                            z0Var = (com.truecaller.account.domain.auth.z0) obj;
                            authTokensState2 = authTokensState;
                            g0Var2.x = null;
                            g0Var2.y = null;
                            g0Var2.z = z0Var;
                            g0Var2.A = authTokensState2;
                            g0Var2.D = 6;
                            com.truecaller.account.domain.auth.o oVar = ((com.truecaller.account.domain.auth.r) v0Var.c).d;
                            num = new java.lang.Integer(oVar.b + oVar.c);
                            if (num != num2) {
                                authTokensState3 = authTokensState2;
                                obj = num;
                                return new com.truecaller.account.domain.auth.a1(z0Var, authTokensState3, ((java.lang.Number) obj).intValue());
                            }
                        }
                        return num2;
                    case 4:
                        com.truecaller.account.domain.auth.AuthTokensState authTokensState4 = g0Var2.y;
                        od.p.E(obj);
                        authTokensState = authTokensState4;
                        v0Var = this;
                        z0Var = (com.truecaller.account.domain.auth.z0) obj;
                        authTokensState2 = authTokensState;
                        g0Var2.x = null;
                        g0Var2.y = null;
                        g0Var2.z = z0Var;
                        g0Var2.A = authTokensState2;
                        g0Var2.D = 6;
                        com.truecaller.account.domain.auth.o oVar2 = ((com.truecaller.account.domain.auth.r) v0Var.c).d;
                        num = new java.lang.Integer(oVar2.b + oVar2.c);
                        if (num != num2) {
                        }
                        return num2;
                    case 5:
                        com.truecaller.account.domain.auth.z0 z0Var4 = g0Var2.x;
                        od.p.E(obj);
                        z0Var = z0Var4;
                        v0Var = this;
                        if (((java.lang.Boolean) obj).booleanValue()) {
                            authTokensState2 = com.truecaller.account.domain.auth.AuthTokensState.STATE_ABOUT_TO_EXPIRE;
                            fg3.h0.J(v0Var.b, coroutineContext, (fg3.f0) null, new com.truecaller.account.domain.auth.f0(this, null, 2), 2);
                        } else {
                            authTokensState2 = com.truecaller.account.domain.auth.AuthTokensState.STATE_VALID;
                        }
                        g0Var2.x = null;
                        g0Var2.y = null;
                        g0Var2.z = z0Var;
                        g0Var2.A = authTokensState2;
                        g0Var2.D = 6;
                        com.truecaller.account.domain.auth.o oVar22 = ((com.truecaller.account.domain.auth.r) v0Var.c).d;
                        num = new java.lang.Integer(oVar22.b + oVar22.c);
                        if (num != num2) {
                        }
                        return num2;
                    case 6:
                        authTokensState3 = g0Var2.A;
                        com.truecaller.account.domain.auth.z0 z0Var5 = g0Var2.z;
                        od.p.E(obj);
                        z0Var = z0Var5;
                        return new com.truecaller.account.domain.auth.a1(z0Var, authTokensState3, ((java.lang.Number) obj).intValue());
                    default:
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        g0Var = new com.truecaller.account.domain.auth.g0(this, quxVar);
        com.truecaller.account.domain.auth.g0 g0Var22 = g0Var;
        java.lang.Object obj2 = g0Var22.B;
        java.lang.Integer num22 = ef3.bar.a;
        i = g0Var22.D;
        kotlin.coroutines.CoroutineContext coroutineContext2 = this.a;
        com.truecaller.account.domain.auth.k kVar2 = this.d;
        switch (i) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x004f, code lost:
    
        if (r7 == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object e(ff3.qux quxVar) {
        com.truecaller.account.domain.auth.h0 h0Var;
        java.lang.Object obj;
        int i;
        com.truecaller.account.domain.auth.k1 d;
        if (quxVar instanceof com.truecaller.account.domain.auth.h0) {
            h0Var = (com.truecaller.account.domain.auth.h0) quxVar;
            int i2 = h0Var.A;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                h0Var.A = i2 - Integer.MIN_VALUE;
                obj = h0Var.y;
                java.lang.Object obj2 = ef3.bar.a;
                i = h0Var.A;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            od.p.E(obj);
                            return obj;
                        }
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    d = h0Var.x;
                    od.p.E(obj);
                } else {
                    od.p.E(obj);
                    d = this.d.d();
                    if (d.a == null) {
                        return null;
                    }
                    h0Var.x = d;
                    h0Var.A = 1;
                    obj = m(d, h0Var);
                }
                if (!((java.lang.Boolean) obj).booleanValue()) {
                    com.truecaller.account.domain.auth.f0 f0Var = new com.truecaller.account.domain.auth.f0(this, null, 4);
                    h0Var.x = null;
                    h0Var.A = 2;
                    java.lang.Object W = fg3.h0.W(this.a, f0Var, h0Var);
                    if (W == obj2) {
                        return obj2;
                    }
                    return W;
                }
                return d.a;
            }
        }
        h0Var = new com.truecaller.account.domain.auth.h0(this, quxVar);
        obj = h0Var.y;
        java.lang.Object obj22 = ef3.bar.a;
        i = h0Var.A;
        if (i == 0) {
        }
        if (!((java.lang.Boolean) obj).booleanValue()) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x013b, code lost:
    
        if (r14 == r0) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c0, code lost:
    
        if (r14 == r0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ef, code lost:
    
        if (r14 == r0) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0080, code lost:
    
        if (r14 == r0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a5, code lost:
    
        if (r14 == r0) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object f(com.truecaller.account.domain.auth.z0 z0Var, java.lang.String str, ff3.qux quxVar) {
        com.truecaller.account.domain.auth.i0 i0Var;
        int i;
        com.truecaller.account.domain.auth.o1 o1Var;
        kotlin.Pair pair;
        com.truecaller.account.domain.auth.v0 v0Var;
        com.truecaller.account.domain.auth.AuthTokensState authTokensState;
        java.lang.String str2;
        if (quxVar instanceof com.truecaller.account.domain.auth.i0) {
            i0Var = (com.truecaller.account.domain.auth.i0) quxVar;
            int i2 = i0Var.D;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                i0Var.D = i2 - Integer.MIN_VALUE;
                com.truecaller.account.domain.auth.i0 i0Var2 = i0Var;
                java.lang.Object obj = i0Var2.B;
                ef3.bar barVar = ef3.bar.a;
                i = i0Var2.D;
                kotlin.coroutines.CoroutineContext coroutineContext = this.a;
                if (i == 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                if (i != 4) {
                                    if (i == 5) {
                                        authTokensState = i0Var2.A;
                                        str2 = i0Var2.z;
                                        od.p.E(obj);
                                    } else {
                                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                } else {
                                    o1Var = i0Var2.y;
                                    str = i0Var2.x;
                                    od.p.E(obj);
                                    v0Var = this;
                                    if (((java.lang.Boolean) obj).booleanValue()) {
                                        kotlin.Pair pair2 = new kotlin.Pair(com.truecaller.account.domain.auth.AuthTokensState.STATE_ABOUT_TO_EXPIRE, o1Var.a);
                                        fg3.h0.J(v0Var.b, coroutineContext, (fg3.f0) null, new com.truecaller.account.domain.auth.j0(this, str, null, 2), 2);
                                        pair = pair2;
                                    } else {
                                        pair = new kotlin.Pair(com.truecaller.account.domain.auth.AuthTokensState.STATE_VALID, o1Var.a);
                                    }
                                    authTokensState = (com.truecaller.account.domain.auth.AuthTokensState) pair.a;
                                    str2 = (java.lang.String) pair.b;
                                    i0Var2.x = null;
                                    i0Var2.y = null;
                                    i0Var2.z = str2;
                                    i0Var2.A = authTokensState;
                                    i0Var2.D = 5;
                                    com.truecaller.account.domain.auth.o oVar = ((com.truecaller.account.domain.auth.r) v0Var.c).e;
                                    obj = new java.lang.Integer(oVar.b + oVar.c);
                                }
                            } else {
                                o1Var = i0Var2.y;
                                od.p.E(obj);
                                kotlin.Pair pair3 = (kotlin.Pair) obj;
                                com.truecaller.account.domain.auth.b0 b0Var = (com.truecaller.account.domain.auth.b0) pair3.a;
                                java.lang.String str3 = (java.lang.String) pair3.b;
                                com.truecaller.account.domain.auth.AuthTokensState d = b0Var.d();
                                if (str3 == null) {
                                    str3 = o1Var.a;
                                }
                                v0Var = this;
                                pair = new kotlin.Pair(d, str3);
                                authTokensState = (com.truecaller.account.domain.auth.AuthTokensState) pair.a;
                                str2 = (java.lang.String) pair.b;
                                i0Var2.x = null;
                                i0Var2.y = null;
                                i0Var2.z = str2;
                                i0Var2.A = authTokensState;
                                i0Var2.D = 5;
                                com.truecaller.account.domain.auth.o oVar2 = ((com.truecaller.account.domain.auth.r) v0Var.c).e;
                                obj = new java.lang.Integer(oVar2.b + oVar2.c);
                            }
                        } else {
                            o1Var = i0Var2.y;
                            str = i0Var2.x;
                            od.p.E(obj);
                            if (((java.lang.Boolean) obj).booleanValue()) {
                                com.truecaller.account.domain.auth.j0 j0Var = new com.truecaller.account.domain.auth.j0(this, str, null, 1);
                                i0Var2.x = null;
                                i0Var2.y = o1Var;
                                i0Var2.D = 3;
                                obj = fg3.h0.W(coroutineContext, j0Var, i0Var2);
                            } else {
                                long j = o1Var.b;
                                long j2 = j - o1Var.c;
                                i0Var2.x = str;
                                i0Var2.y = o1Var;
                                i0Var2.D = 4;
                                v0Var = this;
                                obj = v0Var.k(j, j2, i0Var2);
                            }
                        }
                    } else {
                        od.p.E(obj);
                        kotlin.Pair pair4 = (kotlin.Pair) obj;
                        com.truecaller.account.domain.auth.b0 b0Var2 = (com.truecaller.account.domain.auth.b0) pair4.a;
                        pair = new kotlin.Pair(b0Var2.d(), (java.lang.String) pair4.b);
                        v0Var = this;
                        authTokensState = (com.truecaller.account.domain.auth.AuthTokensState) pair.a;
                        str2 = (java.lang.String) pair.b;
                        i0Var2.x = null;
                        i0Var2.y = null;
                        i0Var2.z = str2;
                        i0Var2.A = authTokensState;
                        i0Var2.D = 5;
                        com.truecaller.account.domain.auth.o oVar22 = ((com.truecaller.account.domain.auth.r) v0Var.c).e;
                        obj = new java.lang.Integer(oVar22.b + oVar22.c);
                    }
                } else {
                    od.p.E(obj);
                    o1Var = (com.truecaller.account.domain.auth.o1) z0Var.d.get(str);
                    if (o1Var == null) {
                        com.truecaller.account.domain.auth.j0 j0Var2 = new com.truecaller.account.domain.auth.j0(this, str, null, 0);
                        i0Var2.x = null;
                        i0Var2.y = null;
                        i0Var2.D = 1;
                        obj = fg3.h0.W(coroutineContext, j0Var2, i0Var2);
                    } else {
                        i0Var2.x = str;
                        i0Var2.y = o1Var;
                        i0Var2.D = 2;
                        obj = h(o1Var, i0Var2);
                    }
                    return barVar;
                }
                return new com.truecaller.account.domain.auth.q1(str2, authTokensState, ((java.lang.Number) obj).intValue());
            }
        }
        i0Var = new com.truecaller.account.domain.auth.i0(this, quxVar);
        com.truecaller.account.domain.auth.i0 i0Var22 = i0Var;
        java.lang.Object obj2 = i0Var22.B;
        ef3.bar barVar2 = ef3.bar.a;
        i = i0Var22.D;
        kotlin.coroutines.CoroutineContext coroutineContext2 = this.a;
        if (i == 0) {
        }
        return new com.truecaller.account.domain.auth.q1(str2, authTokensState, ((java.lang.Number) obj2).intValue());
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0045, code lost:
    
        if (r9 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object g(com.truecaller.account.domain.auth.z0 z0Var, ff3.qux quxVar) {
        com.truecaller.account.domain.auth.k0 k0Var;
        java.lang.Object obj;
        int i;
        if (quxVar instanceof com.truecaller.account.domain.auth.k0) {
            k0Var = (com.truecaller.account.domain.auth.k0) quxVar;
            int i2 = k0Var.A;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                k0Var.A = i2 - Integer.MIN_VALUE;
                obj = k0Var.y;
                java.lang.Object obj2 = ef3.bar.a;
                i = k0Var.A;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            od.p.E(obj);
                            return obj;
                        }
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z0Var = k0Var.x;
                    od.p.E(obj);
                } else {
                    od.p.E(obj);
                    long j = z0Var.b;
                    k0Var.x = z0Var;
                    k0Var.A = 1;
                    obj = i(j, k0Var);
                }
                if (((java.lang.Boolean) obj).booleanValue()) {
                    long j2 = z0Var.a;
                    k0Var.x = null;
                    k0Var.A = 2;
                    java.lang.Object j3 = j(j2, k0Var);
                    if (j3 == obj2) {
                        return obj2;
                    }
                    return j3;
                }
                return java.lang.Boolean.TRUE;
            }
        }
        k0Var = new com.truecaller.account.domain.auth.k0(this, quxVar);
        obj = k0Var.y;
        java.lang.Object obj22 = ef3.bar.a;
        i = k0Var.A;
        if (i == 0) {
        }
        if (((java.lang.Boolean) obj).booleanValue()) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0045, code lost:
    
        if (r9 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object h(com.truecaller.account.domain.auth.o1 o1Var, ff3.qux quxVar) {
        com.truecaller.account.domain.auth.l0 l0Var;
        java.lang.Object obj;
        int i;
        if (quxVar instanceof com.truecaller.account.domain.auth.l0) {
            l0Var = (com.truecaller.account.domain.auth.l0) quxVar;
            int i2 = l0Var.A;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                l0Var.A = i2 - Integer.MIN_VALUE;
                obj = l0Var.y;
                java.lang.Object obj2 = ef3.bar.a;
                i = l0Var.A;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            od.p.E(obj);
                            return obj;
                        }
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o1Var = l0Var.x;
                    od.p.E(obj);
                } else {
                    od.p.E(obj);
                    long j = o1Var.b;
                    l0Var.x = o1Var;
                    l0Var.A = 1;
                    obj = i(j, l0Var);
                }
                if (((java.lang.Boolean) obj).booleanValue()) {
                    long j2 = o1Var.c;
                    l0Var.x = null;
                    l0Var.A = 2;
                    java.lang.Object j3 = j(j2, l0Var);
                    if (j3 == obj2) {
                        return obj2;
                    }
                    return j3;
                }
                return java.lang.Boolean.TRUE;
            }
        }
        l0Var = new com.truecaller.account.domain.auth.l0(this, quxVar);
        obj = l0Var.y;
        java.lang.Object obj22 = ef3.bar.a;
        i = l0Var.A;
        if (i == 0) {
        }
        if (((java.lang.Boolean) obj).booleanValue()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object i(long j, ff3.qux quxVar) {
        com.truecaller.account.domain.auth.m0 m0Var;
        java.lang.Object obj;
        int i;
        if (quxVar instanceof com.truecaller.account.domain.auth.m0) {
            m0Var = (com.truecaller.account.domain.auth.m0) quxVar;
            int i2 = m0Var.A;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                m0Var.A = i2 - Integer.MIN_VALUE;
                obj = m0Var.y;
                ef3.bar barVar = ef3.bar.a;
                i = m0Var.A;
                boolean z = true;
                if (i == 0) {
                    if (i == 1) {
                        j = m0Var.x;
                        od.p.E(obj);
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    m0Var.x = j;
                    m0Var.A = 1;
                    obj = this.e.b(m0Var);
                    if (obj == barVar) {
                        return barVar;
                    }
                }
                if (((java.lang.Number) obj).longValue() <= j) {
                    z = false;
                }
                return java.lang.Boolean.valueOf(z);
            }
        }
        m0Var = new com.truecaller.account.domain.auth.m0(this, quxVar);
        obj = m0Var.y;
        ef3.bar barVar2 = ef3.bar.a;
        i = m0Var.A;
        boolean z2 = true;
        if (i == 0) {
        }
        if (((java.lang.Number) obj).longValue() <= j) {
        }
        return java.lang.Boolean.valueOf(z2);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object j(long j, ff3.qux quxVar) {
        com.truecaller.account.domain.auth.n0 n0Var;
        java.lang.Object obj;
        int i;
        if (quxVar instanceof com.truecaller.account.domain.auth.n0) {
            n0Var = (com.truecaller.account.domain.auth.n0) quxVar;
            int i2 = n0Var.A;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                n0Var.A = i2 - Integer.MIN_VALUE;
                obj = n0Var.y;
                ef3.bar barVar = ef3.bar.a;
                i = n0Var.A;
                boolean z = true;
                if (i == 0) {
                    if (i == 1) {
                        j = n0Var.x;
                        od.p.E(obj);
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    n0Var.x = j;
                    n0Var.A = 1;
                    obj = this.e.b(n0Var);
                    if (obj == barVar) {
                        return barVar;
                    }
                }
                if (j <= ((java.lang.Number) obj).longValue()) {
                    z = false;
                }
                return java.lang.Boolean.valueOf(z);
            }
        }
        n0Var = new com.truecaller.account.domain.auth.n0(this, quxVar);
        obj = n0Var.y;
        ef3.bar barVar2 = ef3.bar.a;
        i = n0Var.A;
        boolean z2 = true;
        if (i == 0) {
        }
        if (j <= ((java.lang.Number) obj).longValue()) {
        }
        return java.lang.Boolean.valueOf(z2);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object k(long j, long j2, ff3.qux quxVar) {
        com.truecaller.account.domain.auth.o0 o0Var;
        java.lang.Object obj;
        int i;
        double d;
        if (quxVar instanceof com.truecaller.account.domain.auth.o0) {
            o0Var = (com.truecaller.account.domain.auth.o0) quxVar;
            int i2 = o0Var.A;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                o0Var.A = i2 - Integer.MIN_VALUE;
                obj = o0Var.y;
                ef3.bar barVar = ef3.bar.a;
                i = o0Var.A;
                boolean z = true;
                if (i == 0) {
                    if (i == 1) {
                        d = o0Var.x;
                        od.p.E(obj);
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    d = j - (j2 * 0.1d);
                    o0Var.x = d;
                    o0Var.A = 1;
                    obj = this.e.b(o0Var);
                    if (obj == barVar) {
                        return barVar;
                    }
                }
                if (d >= ((java.lang.Number) obj).longValue()) {
                    z = false;
                }
                return java.lang.Boolean.valueOf(z);
            }
        }
        o0Var = new com.truecaller.account.domain.auth.o0(this, quxVar);
        obj = o0Var.y;
        ef3.bar barVar2 = ef3.bar.a;
        i = o0Var.A;
        boolean z2 = true;
        if (i == 0) {
        }
        if (d >= ((java.lang.Number) obj).longValue()) {
        }
        return java.lang.Boolean.valueOf(z2);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00cb A[Catch: all -> 0x011e, TryCatch #4 {all -> 0x011e, blocks: (B:30:0x009e, B:31:0x00c5, B:33:0x00cb, B:34:0x00ea, B:36:0x00f0), top: B:29:0x009e }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0153 A[Catch: all -> 0x0119, LOOP:2: B:46:0x014d->B:48:0x0153, LOOP_END, TryCatch #3 {all -> 0x0119, blocks: (B:39:0x00fe, B:43:0x0122, B:45:0x0134, B:46:0x014d, B:48:0x0153, B:50:0x0182), top: B:38:0x00fe }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object l(cy.qux quxVar, ff3.qux quxVar2) {
        com.truecaller.account.domain.auth.p0 p0Var;
        ef3.bar barVar;
        int i;
        cy.qux quxVar3;
        pg3.bar barVar2;
        int i2;
        pg3.bar barVar3;
        java.lang.Object b;
        cy.qux quxVar4;
        pg3.bar barVar4;
        java.util.Iterator it;
        com.truecaller.account.domain.auth.z0 z0Var;
        com.truecaller.account.domain.auth.k kVar;
        try {
            if (quxVar2 instanceof com.truecaller.account.domain.auth.p0) {
                p0Var = (com.truecaller.account.domain.auth.p0) quxVar2;
                int i3 = p0Var.D;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    p0Var.D = i3 - Integer.MIN_VALUE;
                    java.lang.Object obj = p0Var.B;
                    barVar = ef3.bar.a;
                    i = p0Var.D;
                    int i4 = 0;
                    if (i == 0) {
                        if (i != 1) {
                            if (i != 2) {
                                if (i == 3) {
                                    barVar3 = p0Var.y;
                                    try {
                                        od.p.E(obj);
                                        kotlin.Unit unit = kotlin.Unit.a;
                                        barVar3.h((java.lang.Object) null);
                                        return kotlin.Unit.a;
                                    } catch (java.lang.Throwable th) {
                                        th = th;
                                        barVar3.h((java.lang.Object) null);
                                        throw th;
                                    }
                                }
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            i4 = p0Var.A;
                            int i5 = p0Var.z;
                            pg3.bar barVar5 = p0Var.y;
                            cy.qux quxVar5 = p0Var.x;
                            try {
                                od.p.E(obj);
                                i2 = i5;
                                barVar2 = barVar5;
                                quxVar4 = quxVar5;
                                try {
                                    long longValue = ((java.lang.Number) obj).longValue();
                                    long millis = java.util.concurrent.TimeUnit.SECONDS.toMillis(quxVar4.a.a) + longValue;
                                    java.util.Map map = quxVar4.a.b;
                                    java.util.ArrayList arrayList = new java.util.ArrayList(map.size());
                                    it = map.entrySet().iterator();
                                    while (it.hasNext()) {
                                        java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
                                        java.lang.Object key = entry.getKey();
                                        java.lang.Iterable iterable = (java.lang.Iterable) entry.getValue();
                                        java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.z.q(iterable, 10));
                                        for (java.util.Iterator it2 = iterable.iterator(); it2.hasNext(); it2 = it2) {
                                            cy.a aVar = (cy.a) it2.next();
                                            java.util.Iterator it3 = it;
                                            barVar4 = barVar2;
                                            try {
                                                arrayList2.add(new com.truecaller.account.domain.auth.p1(aVar.a, new com.truecaller.account.domain.auth.n1(new kotlin.text.Regex(aVar.b))));
                                                it = it3;
                                                barVar2 = barVar4;
                                            } catch (java.lang.Throwable th2) {
                                                th = th2;
                                                barVar3 = barVar4;
                                                barVar3.h((java.lang.Object) null);
                                                throw th;
                                            }
                                        }
                                        arrayList.add(new kotlin.Pair(key, arrayList2));
                                        it = it;
                                        barVar2 = barVar2;
                                    }
                                    barVar4 = barVar2;
                                    java.util.Map p = kotlin.collections.r0.p(arrayList);
                                    java.util.Map map2 = quxVar4.b;
                                    java.util.ArrayList arrayList3 = new java.util.ArrayList(map2.size());
                                    for (java.util.Map.Entry entry2 : map2.entrySet()) {
                                        arrayList3.add(new kotlin.Pair(entry2.getKey(), new com.truecaller.account.domain.auth.o1(((cy.bar) entry2.getValue()).a, java.util.concurrent.TimeUnit.SECONDS.toMillis(((cy.bar) entry2.getValue()).b) + longValue, longValue)));
                                    }
                                    z0Var = new com.truecaller.account.domain.auth.z0(longValue, millis, p, kotlin.collections.r0.p(arrayList3));
                                    kVar = this.d;
                                    p0Var.x = null;
                                    p0Var.y = barVar4;
                                    p0Var.z = i2;
                                    p0Var.A = i4;
                                    p0Var.D = 3;
                                    if (kVar.a(z0Var, p0Var) != barVar) {
                                        barVar3 = barVar4;
                                        kotlin.Unit unit2 = kotlin.Unit.a;
                                        barVar3.h((java.lang.Object) null);
                                        return kotlin.Unit.a;
                                    }
                                    return barVar;
                                } catch (java.lang.Throwable th3) {
                                    th = th3;
                                    barVar4 = barVar2;
                                }
                            } catch (java.lang.Throwable th4) {
                                th = th4;
                                barVar3 = barVar5;
                                barVar3.h((java.lang.Object) null);
                                throw th;
                            }
                        } else {
                            int i6 = p0Var.z;
                            pg3.bar barVar6 = p0Var.y;
                            cy.qux quxVar6 = p0Var.x;
                            od.p.E(obj);
                            i2 = i6;
                            barVar2 = barVar6;
                            quxVar3 = quxVar6;
                        }
                    } else {
                        od.p.E(obj);
                        quxVar3 = quxVar;
                        p0Var.x = quxVar3;
                        barVar2 = this.g;
                        p0Var.y = barVar2;
                        p0Var.z = 0;
                        p0Var.D = 1;
                        if (barVar2.d(p0Var) != barVar) {
                            i2 = 0;
                        }
                        return barVar;
                    }
                    ly.qux quxVar7 = this.e;
                    p0Var.x = quxVar3;
                    p0Var.y = barVar2;
                    p0Var.z = i2;
                    p0Var.A = 0;
                    p0Var.D = 2;
                    b = quxVar7.b(p0Var);
                    if (b != barVar) {
                        quxVar4 = quxVar3;
                        obj = b;
                        long longValue2 = ((java.lang.Number) obj).longValue();
                        long millis2 = java.util.concurrent.TimeUnit.SECONDS.toMillis(quxVar4.a.a) + longValue2;
                        java.util.Map map3 = quxVar4.a.b;
                        java.util.ArrayList arrayList4 = new java.util.ArrayList(map3.size());
                        it = map3.entrySet().iterator();
                        while (it.hasNext()) {
                        }
                        barVar4 = barVar2;
                        java.util.Map p2 = kotlin.collections.r0.p(arrayList4);
                        java.util.Map map22 = quxVar4.b;
                        java.util.ArrayList arrayList32 = new java.util.ArrayList(map22.size());
                        while (r4.hasNext()) {
                        }
                        z0Var = new com.truecaller.account.domain.auth.z0(longValue2, millis2, p2, kotlin.collections.r0.p(arrayList32));
                        kVar = this.d;
                        p0Var.x = null;
                        p0Var.y = barVar4;
                        p0Var.z = i2;
                        p0Var.A = i4;
                        p0Var.D = 3;
                        if (kVar.a(z0Var, p0Var) != barVar) {
                        }
                    }
                    return barVar;
                }
            }
            ly.qux quxVar72 = this.e;
            p0Var.x = quxVar3;
            p0Var.y = barVar2;
            p0Var.z = i2;
            p0Var.A = 0;
            p0Var.D = 2;
            b = quxVar72.b(p0Var);
            if (b != barVar) {
            }
            return barVar;
        } catch (java.lang.Throwable th5) {
            th = th5;
            barVar3 = barVar2;
            barVar3.h((java.lang.Object) null);
            throw th;
        }
        p0Var = new com.truecaller.account.domain.auth.p0(this, quxVar2);
        java.lang.Object obj2 = p0Var.B;
        barVar = ef3.bar.a;
        i = p0Var.D;
        int i42 = 0;
        if (i == 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0061, code lost:
    
        if (r5 <= r0) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object m(com.truecaller.account.domain.auth.k1 k1Var, ff3.qux quxVar) {
        com.truecaller.account.domain.auth.q0 q0Var;
        int i;
        if (quxVar instanceof com.truecaller.account.domain.auth.q0) {
            q0Var = (com.truecaller.account.domain.auth.q0) quxVar;
            int i2 = q0Var.A;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                q0Var.A = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = q0Var.y;
                ef3.bar barVar = ef3.bar.a;
                i = q0Var.A;
                boolean z = true;
                if (i == 0) {
                    if (i == 1) {
                        k1Var = q0Var.x;
                        od.p.E(obj);
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    q0Var.x = k1Var;
                    q0Var.A = 1;
                    obj = this.e.b(q0Var);
                    if (obj == barVar) {
                        return barVar;
                    }
                }
                long longValue = ((java.lang.Number) obj).longValue();
                if (!this.d.b.d("restored_credentials_check_state", false)) {
                    long j = k1Var.b;
                    if (k1Var.c + j > longValue) {
                    }
                    return java.lang.Boolean.valueOf(z);
                }
                z = false;
                return java.lang.Boolean.valueOf(z);
            }
        }
        q0Var = new com.truecaller.account.domain.auth.q0(this, quxVar);
        java.lang.Object obj2 = q0Var.y;
        ef3.bar barVar2 = ef3.bar.a;
        i = q0Var.A;
        boolean z2 = true;
        if (i == 0) {
        }
        long longValue2 = ((java.lang.Number) obj2).longValue();
        if (!this.d.b.d("restored_credentials_check_state", false)) {
        }
        z2 = false;
        return java.lang.Boolean.valueOf(z2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0047, code lost:
    
        if (r9 == r0) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object n(com.truecaller.account.domain.auth.z0 z0Var, ff3.qux quxVar) {
        com.truecaller.account.domain.auth.r0 r0Var;
        java.lang.Object obj;
        int i;
        if (quxVar instanceof com.truecaller.account.domain.auth.r0) {
            r0Var = (com.truecaller.account.domain.auth.r0) quxVar;
            int i2 = r0Var.A;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                r0Var.A = i2 - Integer.MIN_VALUE;
                com.truecaller.account.domain.auth.r0 r0Var2 = r0Var;
                obj = r0Var2.y;
                java.lang.Object obj2 = ef3.bar.a;
                i = r0Var2.A;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            od.p.E(obj);
                            return obj;
                        }
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z0Var = r0Var2.x;
                    od.p.E(obj);
                } else {
                    od.p.E(obj);
                    if (z0Var != null) {
                        r0Var2.x = z0Var;
                        r0Var2.A = 1;
                        obj = g(z0Var, r0Var2);
                    }
                    return java.lang.Boolean.TRUE;
                }
                if (!((java.lang.Boolean) obj).booleanValue()) {
                    long j = z0Var.b;
                    long j2 = j - z0Var.a;
                    r0Var2.x = null;
                    r0Var2.A = 2;
                    java.lang.Object k = k(j, j2, r0Var2);
                    if (k == obj2) {
                        return obj2;
                    }
                    return k;
                }
                return java.lang.Boolean.TRUE;
            }
        }
        r0Var = new com.truecaller.account.domain.auth.r0(this, quxVar);
        com.truecaller.account.domain.auth.r0 r0Var22 = r0Var;
        obj = r0Var22.y;
        java.lang.Object obj22 = ef3.bar.a;
        i = r0Var22.A;
        if (i == 0) {
        }
        if (!((java.lang.Boolean) obj).booleanValue()) {
        }
        return java.lang.Boolean.TRUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0047, code lost:
    
        if (r9 == r0) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object o(com.truecaller.account.domain.auth.o1 o1Var, ff3.qux quxVar) {
        com.truecaller.account.domain.auth.s0 s0Var;
        java.lang.Object obj;
        int i;
        if (quxVar instanceof com.truecaller.account.domain.auth.s0) {
            s0Var = (com.truecaller.account.domain.auth.s0) quxVar;
            int i2 = s0Var.A;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                s0Var.A = i2 - Integer.MIN_VALUE;
                com.truecaller.account.domain.auth.s0 s0Var2 = s0Var;
                obj = s0Var2.y;
                java.lang.Object obj2 = ef3.bar.a;
                i = s0Var2.A;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            od.p.E(obj);
                            return obj;
                        }
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o1Var = s0Var2.x;
                    od.p.E(obj);
                } else {
                    od.p.E(obj);
                    if (o1Var != null) {
                        s0Var2.x = o1Var;
                        s0Var2.A = 1;
                        obj = h(o1Var, s0Var2);
                    }
                    return java.lang.Boolean.TRUE;
                }
                if (!((java.lang.Boolean) obj).booleanValue()) {
                    long j = o1Var.b;
                    long j2 = j - o1Var.c;
                    s0Var2.x = null;
                    s0Var2.A = 2;
                    java.lang.Object k = k(j, j2, s0Var2);
                    if (k == obj2) {
                        return obj2;
                    }
                    return k;
                }
                return java.lang.Boolean.TRUE;
            }
        }
        s0Var = new com.truecaller.account.domain.auth.s0(this, quxVar);
        com.truecaller.account.domain.auth.s0 s0Var22 = s0Var;
        obj = s0Var22.y;
        java.lang.Object obj22 = ef3.bar.a;
        i = s0Var22.A;
        if (i == 0) {
        }
        if (!((java.lang.Boolean) obj).booleanValue()) {
        }
        return java.lang.Boolean.TRUE;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0087 -> B:10:0x0088). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object p(java.util.Map map, ff3.qux quxVar) {
        com.truecaller.account.domain.auth.t0 t0Var;
        int i;
        int i2;
        java.util.Collection arrayList;
        java.util.Iterator it;
        int i3;
        if (quxVar instanceof com.truecaller.account.domain.auth.t0) {
            t0Var = (com.truecaller.account.domain.auth.t0) quxVar;
            int i4 = t0Var.F;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                t0Var.F = i4 - Integer.MIN_VALUE;
                java.lang.Object obj = t0Var.D;
                ef3.bar barVar = ef3.bar.a;
                i = t0Var.F;
                int i5 = 1;
                if (i == 0) {
                    if (i == 1) {
                        i3 = t0Var.C;
                        i2 = t0Var.B;
                        arrayList = t0Var.A;
                        java.util.Map.Entry entry = t0Var.z;
                        it = t0Var.y;
                        java.util.Collection collection = t0Var.x;
                        od.p.E(obj);
                        long longValue = ((java.lang.Number) obj).longValue();
                        arrayList.add(new kotlin.Pair(entry.getKey(), new com.truecaller.account.domain.auth.o1(((com.truecaller.account.network.n) entry.getValue()).getToken(), java.util.concurrent.TimeUnit.SECONDS.toMillis(((com.truecaller.account.network.n) entry.getValue()).getTtl()) + longValue, longValue)));
                        i2 = i2;
                        arrayList = collection;
                        i5 = 1;
                        if (it.hasNext()) {
                            entry = (java.util.Map.Entry) it.next();
                            java.util.Collection collection2 = arrayList;
                            t0Var.x = collection2;
                            t0Var.y = it;
                            t0Var.z = entry;
                            t0Var.A = collection2;
                            t0Var.B = i2;
                            t0Var.C = i3;
                            t0Var.F = i5;
                            obj = this.e.b(t0Var);
                            if (obj == barVar) {
                                return barVar;
                            }
                            collection = arrayList;
                            long longValue2 = ((java.lang.Number) obj).longValue();
                            arrayList.add(new kotlin.Pair(entry.getKey(), new com.truecaller.account.domain.auth.o1(((com.truecaller.account.network.n) entry.getValue()).getToken(), java.util.concurrent.TimeUnit.SECONDS.toMillis(((com.truecaller.account.network.n) entry.getValue()).getTtl()) + longValue2, longValue2)));
                            i2 = i2;
                            arrayList = collection;
                            i5 = 1;
                            if (it.hasNext()) {
                                return kotlin.collections.r0.p((java.util.List) arrayList);
                            }
                        }
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    i2 = 0;
                    arrayList = new java.util.ArrayList(map.size());
                    it = map.entrySet().iterator();
                    i3 = 0;
                    if (it.hasNext()) {
                    }
                }
            }
        }
        t0Var = new com.truecaller.account.domain.auth.t0(this, quxVar);
        java.lang.Object obj2 = t0Var.D;
        ef3.bar barVar2 = ef3.bar.a;
        i = t0Var.F;
        int i52 = 1;
        if (i == 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x006c, code lost:
    
        if (r3.d(r1) == r2) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object q(long j, ff3.qux quxVar, java.lang.String str) {
        com.truecaller.account.domain.auth.u0 u0Var;
        ef3.bar barVar;
        int i;
        java.lang.String str2;
        pg3.bar barVar2;
        long j2;
        int i2;
        pg3.bar barVar3;
        java.lang.Object b;
        com.truecaller.account.domain.auth.k kVar;
        long j3;
        java.lang.String str3;
        try {
            if (quxVar instanceof com.truecaller.account.domain.auth.u0) {
                u0Var = (com.truecaller.account.domain.auth.u0) quxVar;
                int i3 = u0Var.F;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    u0Var.F = i3 - Integer.MIN_VALUE;
                    java.lang.Object obj = u0Var.D;
                    barVar = ef3.bar.a;
                    i = u0Var.F;
                    if (i == 0) {
                        if (i != 1) {
                            if (i == 2) {
                                long j4 = u0Var.B;
                                kVar = u0Var.A;
                                java.lang.String str4 = u0Var.z;
                                barVar3 = u0Var.y;
                                try {
                                    od.p.E(obj);
                                    j3 = j4;
                                    str3 = str4;
                                    kVar.e(new com.truecaller.account.domain.auth.k1(str3, ((java.lang.Number) obj).longValue(), j3));
                                    kotlin.Unit unit = kotlin.Unit.a;
                                    barVar3.h((java.lang.Object) null);
                                    return kotlin.Unit.a;
                                } catch (java.lang.Throwable th) {
                                    th = th;
                                    barVar3.h((java.lang.Object) null);
                                    throw th;
                                }
                            }
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i4 = u0Var.C;
                        j2 = u0Var.B;
                        pg3.bar barVar4 = u0Var.y;
                        java.lang.String str5 = u0Var.x;
                        od.p.E(obj);
                        str2 = str5;
                        i2 = i4;
                        barVar2 = barVar4;
                    } else {
                        od.p.E(obj);
                        str2 = str;
                        u0Var.x = str2;
                        barVar2 = this.h;
                        u0Var.y = barVar2;
                        j2 = j;
                        u0Var.B = j2;
                        i2 = 0;
                        u0Var.C = 0;
                        u0Var.F = 1;
                    }
                    com.truecaller.account.domain.auth.k kVar2 = this.d;
                    ly.qux quxVar2 = this.e;
                    u0Var.x = null;
                    u0Var.y = barVar2;
                    u0Var.z = str2;
                    u0Var.A = kVar2;
                    u0Var.B = j2;
                    u0Var.C = i2;
                    u0Var.F = 2;
                    b = quxVar2.b(u0Var);
                    if (b != barVar) {
                        kVar = kVar2;
                        j3 = j2;
                        str3 = str2;
                        obj = b;
                        barVar3 = barVar2;
                        kVar.e(new com.truecaller.account.domain.auth.k1(str3, ((java.lang.Number) obj).longValue(), j3));
                        kotlin.Unit unit2 = kotlin.Unit.a;
                        barVar3.h((java.lang.Object) null);
                        return kotlin.Unit.a;
                    }
                    return barVar;
                }
            }
            com.truecaller.account.domain.auth.k kVar22 = this.d;
            ly.qux quxVar22 = this.e;
            u0Var.x = null;
            u0Var.y = barVar2;
            u0Var.z = str2;
            u0Var.A = kVar22;
            u0Var.B = j2;
            u0Var.C = i2;
            u0Var.F = 2;
            b = quxVar22.b(u0Var);
            if (b != barVar) {
            }
            return barVar;
        } catch (java.lang.Throwable th2) {
            th = th2;
            barVar3 = barVar2;
            barVar3.h((java.lang.Object) null);
            throw th;
        }
        u0Var = new com.truecaller.account.domain.auth.u0(this, quxVar);
        java.lang.Object obj2 = u0Var.D;
        barVar = ef3.bar.a;
        i = u0Var.F;
        if (i == 0) {
        }
    }
}
