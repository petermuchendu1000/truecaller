package com.truecaller.account.domain.auth;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class r implements com.truecaller.account.domain.auth.l {
    public final android.content.Context a;
    public final u03.baz b;
    public final qc3.bar c;
    public final com.truecaller.account.domain.auth.o d;
    public final com.truecaller.account.domain.auth.o e;
    public final com.truecaller.account.domain.auth.o f;
    public final kotlin.Lazy g;

    public r(android.content.Context context, u03.baz bazVar, qc3.bar barVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bazVar, "clock");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "accountRequestHelper");
        this.a = context;
        this.b = bazVar;
        this.c = barVar;
        this.d = new com.truecaller.account.domain.auth.o();
        this.e = new com.truecaller.account.domain.auth.o();
        this.f = new com.truecaller.account.domain.auth.o();
        this.g = kotlin.LazyKt.lazy(new com.truecaller.account.domain.auth.m(this, 2));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, p31.bar] */
    /* JADX WARN: Type inference failed for: r2v0, types: [j31.n, java.lang.Object] */
    public final com.truecaller.account.domain.auth.n a(boolean z) {
        ?? obj = new java.lang.Object();
        obj.a(com.truecaller.common.network.util.KnownEndpoints.ACCOUNT);
        obj.g(com.truecaller.account.domain.auth.n.class);
        ?? obj2 = new java.lang.Object();
        obj2.b(com.truecaller.common.network.util.AuthRequirement.REQUIRED, (java.lang.String) null);
        obj2.c(true);
        okhttp3.OkHttpClient.Builder b = p31.baz.b((j31.n) obj2);
        if (z) {
            b.k = (okhttp3.Cache) this.g.getValue();
        }
        okhttp3.OkHttpClient okHttpClient = new okhttp3.OkHttpClient(b);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(okHttpClient, "client");
        ((p31.bar) obj).g = okHttpClient;
        return (com.truecaller.account.domain.auth.n) obj.d(com.truecaller.account.domain.auth.n.class);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:1|(2:3|(6:5|6|7|(1:(2:10|11)(2:23|24))(3:25|(2:27|(1:29))|30)|12|(4:18|(1:20)|21|22)(2:15|16)))|33|6|7|(0)(0)|12|(0)|18|(0)|21|22) */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a4, code lost:
    
        r11.c++;
        r4.getClass();
        r11.a = android.os.SystemClock.elapsedRealtime() + com.truecaller.account.domain.auth.s.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0090, code lost:
    
        r11.c++;
        r4.getClass();
        r11.a = android.os.SystemClock.elapsedRealtime() + com.truecaller.account.domain.auth.s.b;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object b(com.truecaller.account.domain.auth.o oVar, kotlin.jvm.functions.Function0 function0, ff3.qux quxVar) {
        com.truecaller.account.domain.auth.p pVar;
        int i;
        u03.qux quxVar2;
        wj3.k0 k0Var;
        long j;
        long j2;
        if (quxVar instanceof com.truecaller.account.domain.auth.p) {
            pVar = (com.truecaller.account.domain.auth.p) quxVar;
            int i2 = pVar.A;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pVar.A = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = pVar.y;
                java.lang.Object obj2 = ef3.bar.a;
                i = pVar.A;
                quxVar2 = this.b;
                if (i == 0) {
                    if (i == 1) {
                        oVar = pVar.x;
                        od.p.E(obj);
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    long j3 = oVar.a;
                    quxVar2.getClass();
                    if (j3 <= android.os.SystemClock.elapsedRealtime()) {
                        com.truecaller.account.domain.auth.f fVar = new com.truecaller.account.domain.auth.f(function0, 2);
                        pVar.x = oVar;
                        pVar.A = 1;
                        obj = c(fVar, pVar);
                        if (obj == obj2) {
                            return obj2;
                        }
                    }
                    return null;
                }
                k0Var = (wj3.k0) obj;
                java.lang.Object obj3 = k0Var.b;
                if (!k0Var.a.k() && obj3 != null) {
                    oVar.a = 0L;
                    oVar.b = 0;
                    oVar.c = 0;
                    return obj3;
                }
                j = com.truecaller.account.domain.auth.s.b << oVar.b;
                j2 = com.truecaller.account.domain.auth.s.c;
                if (j > j2) {
                    j = j2;
                }
                quxVar2.getClass();
                oVar.a = android.os.SystemClock.elapsedRealtime() + j;
                oVar.b++;
                return null;
            }
        }
        pVar = new com.truecaller.account.domain.auth.p(this, quxVar);
        java.lang.Object obj4 = pVar.y;
        java.lang.Object obj22 = ef3.bar.a;
        i = pVar.A;
        quxVar2 = this.b;
        if (i == 0) {
        }
        k0Var = (wj3.k0) obj4;
        java.lang.Object obj32 = k0Var.b;
        if (!k0Var.a.k()) {
        }
        j = com.truecaller.account.domain.auth.s.b << oVar.b;
        j2 = com.truecaller.account.domain.auth.s.c;
        if (j > j2) {
        }
        quxVar2.getClass();
        oVar.a = android.os.SystemClock.elapsedRealtime() + j;
        oVar.b++;
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object c(com.truecaller.account.domain.auth.f fVar, ff3.qux quxVar) {
        com.truecaller.account.domain.auth.q qVar;
        int i;
        if (quxVar instanceof com.truecaller.account.domain.auth.q) {
            qVar = (com.truecaller.account.domain.auth.q) quxVar;
            int i2 = qVar.A;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qVar.A = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = qVar.y;
                ef3.bar barVar = ef3.bar.a;
                i = qVar.A;
                if (i == 0) {
                    if (i == 1) {
                        fVar = qVar.x;
                        od.p.E(obj);
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    try {
                        return fVar.invoke();
                    } catch (java.io.IOException unused) {
                        long j = com.truecaller.account.domain.auth.s.a;
                        qVar.x = fVar;
                        qVar.A = 1;
                        if (fg3.h0.r(j, qVar) == barVar) {
                            return barVar;
                        }
                    }
                }
                return fVar.invoke();
            }
        }
        qVar = new com.truecaller.account.domain.auth.q(this, quxVar);
        java.lang.Object obj2 = qVar.y;
        ef3.bar barVar2 = ef3.bar.a;
        i = qVar.A;
        if (i == 0) {
        }
        return fVar.invoke();
    }
}
