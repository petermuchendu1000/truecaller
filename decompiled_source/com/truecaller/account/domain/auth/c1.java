package com.truecaller.account.domain.auth;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class c1 extends ff3.g implements kotlin.jvm.functions.Function2 {
    public java.lang.Object A;
    public java.lang.Integer B;
    public int C;
    public int D;
    public int E;
    public final /* synthetic */ com.truecaller.account.domain.auth.d1 F;
    public final /* synthetic */ java.lang.String G;
    public final /* synthetic */ java.lang.String H;
    public final /* synthetic */ java.lang.Integer I;
    public pg3.bar x;
    public java.lang.Object y;
    public java.lang.Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(com.truecaller.account.domain.auth.d1 d1Var, java.lang.String str, java.lang.String str2, java.lang.Integer num, df3.bar barVar) {
        super(2, barVar);
        this.F = d1Var;
        this.G = str;
        this.H = str2;
        this.I = num;
    }

    public final df3.bar create(java.lang.Object obj, df3.bar barVar) {
        return new com.truecaller.account.domain.auth.c1(this.F, this.G, this.H, this.I, barVar);
    }

    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return create((fg3.e0) obj, (df3.bar) obj2).invokeSuspend(kotlin.Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x01d2, code lost:
    
        if (r0 != r6) goto L138;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0012. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:12:0x02a3 A[Catch: all -> 0x0036, TryCatch #1 {all -> 0x0036, blocks: (B:8:0x0031, B:10:0x0299, B:12:0x02a3, B:13:0x02b0, B:15:0x02c0, B:19:0x02c8, B:20:0x0331, B:25:0x003f, B:27:0x0051, B:28:0x01a8, B:33:0x01d0), top: B:2:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x02c0 A[Catch: all -> 0x0036, TryCatch #1 {all -> 0x0036, blocks: (B:8:0x0031, B:10:0x0299, B:12:0x02a3, B:13:0x02b0, B:15:0x02c0, B:19:0x02c8, B:20:0x0331, B:25:0x003f, B:27:0x0051, B:28:0x01a8, B:33:0x01d0), top: B:2:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01d0 A[Catch: all -> 0x0036, TRY_LEAVE, TryCatch #1 {all -> 0x0036, blocks: (B:8:0x0031, B:10:0x0299, B:12:0x02a3, B:13:0x02b0, B:15:0x02c0, B:19:0x02c8, B:20:0x0331, B:25:0x003f, B:27:0x0051, B:28:0x01a8, B:33:0x01d0), top: B:2:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00da A[Catch: all -> 0x00c7, TryCatch #2 {all -> 0x00c7, blocks: (B:36:0x009a, B:38:0x00a6, B:40:0x00ae, B:42:0x00c9, B:44:0x00da, B:45:0x00e0, B:54:0x01d8, B:58:0x01fc, B:60:0x0209, B:64:0x0211, B:66:0x021d, B:104:0x0239, B:67:0x023d, B:69:0x0241, B:71:0x0265, B:73:0x026d, B:74:0x0271, B:78:0x02d3, B:80:0x02d9, B:82:0x02e0, B:85:0x02e5, B:89:0x02f3, B:91:0x02fb, B:92:0x02ff, B:94:0x030c, B:96:0x0310, B:100:0x031b, B:105:0x0169, B:107:0x0172, B:112:0x019e, B:113:0x0129, B:115:0x0132, B:120:0x015e, B:121:0x00eb, B:123:0x00f4, B:128:0x0120), top: B:35:0x009a, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02f3 A[Catch: all -> 0x00c7, TryCatch #2 {all -> 0x00c7, blocks: (B:36:0x009a, B:38:0x00a6, B:40:0x00ae, B:42:0x00c9, B:44:0x00da, B:45:0x00e0, B:54:0x01d8, B:58:0x01fc, B:60:0x0209, B:64:0x0211, B:66:0x021d, B:104:0x0239, B:67:0x023d, B:69:0x0241, B:71:0x0265, B:73:0x026d, B:74:0x0271, B:78:0x02d3, B:80:0x02d9, B:82:0x02e0, B:85:0x02e5, B:89:0x02f3, B:91:0x02fb, B:92:0x02ff, B:94:0x030c, B:96:0x0310, B:100:0x031b, B:105:0x0169, B:107:0x0172, B:112:0x019e, B:113:0x0129, B:115:0x0132, B:120:0x015e, B:121:0x00eb, B:123:0x00f4, B:128:0x0120), top: B:35:0x009a, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.truecaller.account.domain.auth.d1 d1Var;
        java.lang.String str;
        java.lang.String str2;
        java.lang.Integer num;
        pg3.bar barVar;
        int i;
        n11.o oVar;
        com.truecaller.account.domain.auth.d1 d1Var2;
        int i2;
        int i3;
        com.truecaller.account.network.d dVar;
        boolean z;
        boolean z2;
        java.lang.Integer num2;
        com.truecaller.account.network.CheckCredentialsResponseSuccessDto checkCredentialsResponseSuccessDto;
        com.truecaller.account.domain.auth.d1 d1Var3;
        java.lang.String str3;
        java.lang.String h;
        java.lang.Object W;
        okhttp3.HttpUrl e;
        java.lang.String h2;
        pg3.bar barVar2 = "Token is valid by request TTL, but server returned UNAUTHORIZED to ";
        ef3.bar barVar3 = ef3.bar.a;
        try {
            switch (this.E) {
                case 0:
                    od.p.E(obj);
                    d1Var = this.F;
                    pg3.bar barVar4 = d1Var.k;
                    this.x = barVar4;
                    str = this.G;
                    this.y = str;
                    str2 = this.H;
                    this.z = str2;
                    this.A = d1Var;
                    num = this.I;
                    this.B = num;
                    this.C = 0;
                    this.E = 1;
                    if (barVar4.d(this) != barVar3) {
                        barVar = barVar4;
                        i = 0;
                        try {
                            if (!kotlin.jvm.internal.Intrinsics.b(str, com.truecaller.common.network.util.KnownEndpoints.ACCOUNT.getKey()) && kotlin.text.StringsKt.N(str2, "/v1/credentials/exchange", false)) {
                                d1Var.e.b(false, com.truecaller.account.api.LogoutContext.EXCHANGE_CREDENTIALS);
                                ((q83.a) d1Var.i.get()).c(d1Var.c, false);
                            } else {
                                oVar = d1Var.d;
                                q11.bar barVar5 = d1Var.f;
                                qc3.bar barVar6 = d1Var.j;
                                if (oVar.c.r()) {
                                    oVar.l();
                                }
                                if (oVar.j()) {
                                    if (num != null && num.intValue() == 40113) {
                                        com.truecaller.account.domain.auth.v0 v0Var = (com.truecaller.account.domain.auth.v0) barVar6.get();
                                        this.x = barVar;
                                        this.y = null;
                                        this.z = null;
                                        this.A = null;
                                        this.B = null;
                                        this.C = i;
                                        this.D = 0;
                                        this.E = 2;
                                        java.lang.Object W2 = fg3.h0.W(v0Var.a, new bu2.j(v0Var, (df3.bar) null, 1), this);
                                        if (W2 != barVar3) {
                                            W2 = kotlin.Unit.a;
                                        }
                                        if (W2 == barVar3) {
                                        }
                                    }
                                    if (num.intValue() == 40112) {
                                        com.truecaller.account.domain.auth.v0 v0Var2 = (com.truecaller.account.domain.auth.v0) barVar6.get();
                                        this.x = barVar;
                                        this.y = null;
                                        this.z = null;
                                        this.A = null;
                                        this.B = null;
                                        this.C = i;
                                        this.D = 0;
                                        this.E = 3;
                                        java.lang.Object W3 = fg3.h0.W(v0Var2.a, new bz.baz(v0Var2, false, null, 1), this);
                                        if (W3 != barVar3) {
                                            W3 = kotlin.Unit.a;
                                        }
                                        if (W3 == barVar3) {
                                        }
                                    }
                                    if (num != null && num.intValue() == 40114) {
                                        com.truecaller.account.domain.auth.v0 v0Var3 = (com.truecaller.account.domain.auth.v0) barVar6.get();
                                        this.x = barVar;
                                        this.y = d1Var;
                                        this.z = null;
                                        this.A = null;
                                        this.B = null;
                                        this.C = i;
                                        this.D = 0;
                                        this.E = 4;
                                        java.lang.Object W4 = fg3.h0.W(v0Var3.a, new bu2.j(v0Var3, (df3.bar) null, 1), this);
                                        if (W4 != barVar3) {
                                            W4 = kotlin.Unit.a;
                                        }
                                        if (W4 != barVar3) {
                                            d1Var2 = d1Var;
                                            i2 = i;
                                            barVar2 = barVar;
                                            i3 = 0;
                                            com.truecaller.account.domain.auth.v0 v0Var4 = (com.truecaller.account.domain.auth.v0) d1Var2.j.get();
                                            this.x = barVar2;
                                            this.y = null;
                                            this.C = i2;
                                            this.D = i3;
                                            this.E = 5;
                                            W = fg3.h0.W(v0Var4.a, new bz.baz(v0Var4, false, null, 1), this);
                                            if (W == barVar3) {
                                                W = kotlin.Unit.a;
                                                break;
                                            } else {
                                                break;
                                            }
                                        }
                                    } else {
                                        long j = 0;
                                        long f = barVar5.f("checkCredentialsLastTime", 0L);
                                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(java.lang.Long.valueOf(f), "getLong(...)");
                                        long f2 = barVar5.f("checkCredentialsTtl", 0L);
                                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(java.lang.Long.valueOf(f2), "getLong(...)");
                                        long currentTimeMillis = java.lang.System.currentTimeMillis();
                                        if (f + f2 > currentTimeMillis && f < currentTimeMillis) {
                                            okhttp3.HttpUrl.k.getClass();
                                            okhttp3.HttpUrl e2 = okhttp3.HttpUrl.Companion.e(str2);
                                            if (e2 != null && (h = e2.h()) != null) {
                                                str2 = h;
                                            }
                                            com.truecaller.log.AssertionUtil.reportThrowableButNeverCrash(new com.truecaller.account.domain.auth.ServerInconsistencyException("Token is valid by request TTL, but server returned UNAUTHORIZED to ".concat(str2)));
                                        } else {
                                            try {
                                                dVar = d1Var.g.a(new com.truecaller.account.network.CheckCredentialsRequestDto(com.truecaller.account.network.CheckCredentialsRequestDto.REASON_RECEIVED_UNAUTHORIZED, ((i31.bar) d1Var.h.get()).a(), str2), null);
                                            } catch (java.io.IOException e3) {
                                                com.truecaller.log.AssertionUtil.reportThrowableButNeverCrash(e3);
                                                dVar = null;
                                            }
                                            if (dVar instanceof com.truecaller.account.network.CheckCredentialsResponseSuccessDto) {
                                                checkCredentialsResponseSuccessDto = (com.truecaller.account.network.CheckCredentialsResponseSuccessDto) dVar;
                                                d1Var.f.m("checkCredentialsLastTime", java.lang.System.currentTimeMillis());
                                                f13.b bVar = d1Var.f;
                                                java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.SECONDS;
                                                bVar.m("checkCredentialsTtl", timeUnit.toMillis(checkCredentialsResponseSuccessDto.getNextCallDuration()));
                                                java.lang.String installationId = checkCredentialsResponseSuccessDto.getInstallationId();
                                                if (installationId != null) {
                                                    gy.qux quxVar = d1Var.e;
                                                    java.lang.Long ttl = checkCredentialsResponseSuccessDto.getTtl();
                                                    if (ttl != null) {
                                                        j = ttl.longValue();
                                                    }
                                                    long millis = timeUnit.toMillis(j);
                                                    this.x = barVar;
                                                    this.y = str2;
                                                    this.z = d1Var;
                                                    this.A = checkCredentialsResponseSuccessDto;
                                                    this.B = null;
                                                    this.C = i;
                                                    this.D = 0;
                                                    this.E = 6;
                                                    if (quxVar.c(millis, this, installationId) != barVar3) {
                                                        d1Var3 = d1Var;
                                                        str3 = str2;
                                                        barVar2 = barVar;
                                                        d1Var = d1Var3;
                                                        str2 = str3;
                                                        if (!kotlin.text.StringsKt.X(checkCredentialsResponseSuccessDto.getDomain())) {
                                                            d1Var.f.n("networkDomain", checkCredentialsResponseSuccessDto.getDomain());
                                                        }
                                                        d1Var.getClass();
                                                        okhttp3.HttpUrl.k.getClass();
                                                        e = okhttp3.HttpUrl.Companion.e(str2);
                                                        if (e != null && (h2 = e.h()) != null) {
                                                            str2 = h2;
                                                        }
                                                        com.truecaller.log.AssertionUtil.reportThrowableButNeverCrash(new com.truecaller.account.domain.auth.ServerInconsistencyException("Token is valid by request, but server returned UNAUTHORIZED to ".concat(str2)));
                                                        kotlin.Unit unit = kotlin.Unit.a;
                                                        barVar2.h((java.lang.Object) null);
                                                        return kotlin.Unit.a;
                                                    }
                                                } else {
                                                    barVar2 = barVar;
                                                    if (!kotlin.text.StringsKt.X(checkCredentialsResponseSuccessDto.getDomain())) {
                                                    }
                                                    d1Var.getClass();
                                                    okhttp3.HttpUrl.k.getClass();
                                                    e = okhttp3.HttpUrl.Companion.e(str2);
                                                    if (e != null) {
                                                        str2 = h2;
                                                    }
                                                    com.truecaller.log.AssertionUtil.reportThrowableButNeverCrash(new com.truecaller.account.domain.auth.ServerInconsistencyException("Token is valid by request, but server returned UNAUTHORIZED to ".concat(str2)));
                                                    kotlin.Unit unit2 = kotlin.Unit.a;
                                                    barVar2.h((java.lang.Object) null);
                                                    return kotlin.Unit.a;
                                                }
                                            } else {
                                                if (dVar instanceof com.truecaller.account.network.e) {
                                                    com.truecaller.account.network.e eVar = (com.truecaller.account.network.e) dVar;
                                                    if (eVar.a == 401 && (num2 = eVar.b) != null && num2.intValue() == 40108) {
                                                        z2 = true;
                                                        if (z2) {
                                                            n11.o oVar2 = d1Var.d;
                                                            java.lang.Long l = ((com.truecaller.account.network.e) dVar).c;
                                                            if (l != null) {
                                                                j = l.longValue();
                                                            }
                                                            oVar2.n(j);
                                                            d1Var.d.l();
                                                        }
                                                    }
                                                    z2 = false;
                                                    if (z2) {
                                                    }
                                                }
                                                if (dVar instanceof com.truecaller.account.network.e) {
                                                    if (((com.truecaller.account.network.e) dVar).a == 401) {
                                                        z = true;
                                                    } else {
                                                        z = false;
                                                    }
                                                    if (z) {
                                                        d1Var.e.b(false, com.truecaller.account.api.LogoutContext.CHECK_CREDENTIALS);
                                                        ((q83.a) d1Var.i.get()).c(d1Var.c, false);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            barVar2 = barVar;
                            kotlin.Unit unit22 = kotlin.Unit.a;
                            barVar2.h((java.lang.Object) null);
                            return kotlin.Unit.a;
                        } catch (java.lang.Throwable th) {
                            th = th;
                            barVar2 = barVar;
                            barVar2.h((java.lang.Object) null);
                            throw th;
                        }
                    }
                    return barVar3;
                case 1:
                    int i4 = this.C;
                    java.lang.Integer num3 = this.B;
                    com.truecaller.account.domain.auth.d1 d1Var4 = (com.truecaller.account.domain.auth.d1) this.A;
                    java.lang.String str4 = (java.lang.String) this.z;
                    str = (java.lang.String) this.y;
                    barVar = this.x;
                    od.p.E(obj);
                    i = i4;
                    d1Var = d1Var4;
                    str2 = str4;
                    num = num3;
                    if (!kotlin.jvm.internal.Intrinsics.b(str, com.truecaller.common.network.util.KnownEndpoints.ACCOUNT.getKey())) {
                        break;
                    }
                    oVar = d1Var.d;
                    q11.bar barVar52 = d1Var.f;
                    qc3.bar barVar62 = d1Var.j;
                    if (oVar.c.r()) {
                    }
                    if (oVar.j()) {
                    }
                    barVar2 = barVar;
                    kotlin.Unit unit222 = kotlin.Unit.a;
                    barVar2.h((java.lang.Object) null);
                    return kotlin.Unit.a;
                case 2:
                case 3:
                case 5:
                    barVar2 = this.x;
                    od.p.E(obj);
                    kotlin.Unit unit2222 = kotlin.Unit.a;
                    barVar2.h((java.lang.Object) null);
                    return kotlin.Unit.a;
                case 4:
                    i3 = this.D;
                    i2 = this.C;
                    d1Var2 = (com.truecaller.account.domain.auth.d1) this.y;
                    barVar2 = this.x;
                    od.p.E(obj);
                    com.truecaller.account.domain.auth.v0 v0Var42 = (com.truecaller.account.domain.auth.v0) d1Var2.j.get();
                    this.x = barVar2;
                    this.y = null;
                    this.C = i2;
                    this.D = i3;
                    this.E = 5;
                    W = fg3.h0.W(v0Var42.a, new bz.baz(v0Var42, false, null, 1), this);
                    if (W == barVar3) {
                    }
                    break;
                case 6:
                    checkCredentialsResponseSuccessDto = (com.truecaller.account.network.CheckCredentialsResponseSuccessDto) this.A;
                    d1Var3 = (com.truecaller.account.domain.auth.d1) this.z;
                    str3 = (java.lang.String) this.y;
                    barVar2 = this.x;
                    od.p.E(obj);
                    d1Var = d1Var3;
                    str2 = str3;
                    if (!kotlin.text.StringsKt.X(checkCredentialsResponseSuccessDto.getDomain())) {
                    }
                    d1Var.getClass();
                    okhttp3.HttpUrl.k.getClass();
                    e = okhttp3.HttpUrl.Companion.e(str2);
                    if (e != null) {
                    }
                    com.truecaller.log.AssertionUtil.reportThrowableButNeverCrash(new com.truecaller.account.domain.auth.ServerInconsistencyException("Token is valid by request, but server returned UNAUTHORIZED to ".concat(str2)));
                    kotlin.Unit unit22222 = kotlin.Unit.a;
                    barVar2.h((java.lang.Object) null);
                    return kotlin.Unit.a;
                default:
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
    }
}
