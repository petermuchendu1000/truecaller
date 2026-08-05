package com.truecaller.wizard.verification;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class b implements com.truecaller.wizard.verification.r0 {
    public final q73.qux a;
    public final com.truecaller.wizard.verification.j b;
    public final t93.c c;
    public final qc3.bar d;

    public b(q73.qux quxVar, com.truecaller.wizard.verification.j jVar, t93.c cVar, qc3.bar barVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(quxVar, "accountHelper");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jVar, "primaryNumberVerificationHelper");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cVar, "wizardSettingsHelper");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "accountSettings");
        this.a = quxVar;
        this.b = jVar;
        this.c = cVar;
        this.d = barVar;
    }

    @Override // com.truecaller.wizard.verification.r0
    public final java.lang.Object a(yy.e1 e1Var, v73.f fVar) {
        return this.b.a(e1Var, fVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x007e, code lost:
    
        if (r9.a.b(r1, r6) == r0) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00aa A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    @Override // com.truecaller.wizard.verification.r0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object b(com.truecaller.account.network.TokenResponseDto tokenResponseDto, java.lang.Long l, java.lang.String str, java.lang.String str2, df3.bar barVar) {
        com.truecaller.wizard.verification.qux quxVar;
        ef3.bar barVar2;
        int i;
        e83.bar barVar3;
        java.lang.Object b;
        if (barVar instanceof com.truecaller.wizard.verification.qux) {
            quxVar = (com.truecaller.wizard.verification.qux) barVar;
            int i2 = quxVar.D;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                quxVar.D = i2 - Integer.MIN_VALUE;
                com.truecaller.wizard.verification.qux quxVar2 = quxVar;
                java.lang.Object obj = quxVar2.B;
                barVar2 = ef3.bar.a;
                i = quxVar2.D;
                t93.c cVar = this.c;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            od.p.E(obj);
                            return obj;
                        }
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str2 = quxVar2.A;
                    str = quxVar2.z;
                    l = quxVar2.y;
                    tokenResponseDto = quxVar2.x;
                    od.p.E(obj);
                } else {
                    od.p.E(obj);
                    if (tokenResponseDto.getStatus() == 700) {
                        cVar.j();
                        return com.truecaller.wizard.verification.o0.a;
                    }
                    java.lang.Long l2 = (java.lang.Long) yi3.bar.y(tokenResponseDto).a;
                    if (l2 != null && str2 != null) {
                        barVar3 = new e83.bar(l2.longValue(), str2);
                    } else {
                        barVar3 = null;
                    }
                    quxVar2.x = tokenResponseDto;
                    quxVar2.y = l;
                    quxVar2.z = str;
                    quxVar2.A = str2;
                    quxVar2.D = 1;
                }
                java.lang.String str3 = str;
                ((q11.bar) this.d.get()).n("networkDomain", cVar.n());
                quxVar2.x = null;
                quxVar2.y = null;
                quxVar2.z = null;
                quxVar2.A = null;
                quxVar2.D = 2;
                b = this.b.b(tokenResponseDto, l, str3, str2, quxVar2);
                if (b != barVar2) {
                    return barVar2;
                }
                return b;
            }
        }
        quxVar = new com.truecaller.wizard.verification.qux(this, (ff3.qux) barVar);
        com.truecaller.wizard.verification.qux quxVar22 = quxVar;
        java.lang.Object obj2 = quxVar22.B;
        barVar2 = ef3.bar.a;
        i = quxVar22.D;
        t93.c cVar2 = this.c;
        if (i == 0) {
        }
        java.lang.String str32 = str;
        ((q11.bar) this.d.get()).n("networkDomain", cVar2.n());
        quxVar22.x = null;
        quxVar22.y = null;
        quxVar22.z = null;
        quxVar22.A = null;
        quxVar22.D = 2;
        b = this.b.b(tokenResponseDto, l, str32, str2, quxVar22);
        if (b != barVar2) {
        }
    }

    @Override // com.truecaller.wizard.verification.r0
    public final void c() {
        this.b.c();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00f7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0030  */
    @Override // com.truecaller.wizard.verification.r0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object d(yy.e1 e1Var, java.lang.Long l, java.lang.String str, java.lang.String str2, df3.bar barVar) {
        com.truecaller.wizard.verification.a aVar;
        java.lang.Object obj;
        int i;
        long h;
        yy.e1 e1Var2;
        java.lang.String str3;
        java.lang.Long l2;
        java.lang.String str4;
        e83.bar barVar2;
        java.lang.String str5;
        java.lang.Long l3;
        yy.e1 e1Var3;
        java.lang.Object d;
        if (barVar instanceof com.truecaller.wizard.verification.a) {
            aVar = (com.truecaller.wizard.verification.a) barVar;
            int i2 = aVar.E;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.E = i2 - Integer.MIN_VALUE;
                com.truecaller.wizard.verification.a aVar2 = aVar;
                obj = aVar2.C;
                ef3.bar barVar3 = ef3.bar.a;
                i = aVar2.E;
                t93.c cVar = this.c;
                q73.qux quxVar = this.a;
                if (i == 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                od.p.E(obj);
                                return obj;
                            }
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        str4 = aVar2.A;
                        java.lang.String str6 = aVar2.z;
                        java.lang.Long l4 = aVar2.y;
                        e1Var3 = aVar2.x;
                        od.p.E(obj);
                        str5 = str6;
                        l3 = l4;
                        java.lang.String str7 = str4;
                        ((q11.bar) this.d.get()).n("networkDomain", cVar.n());
                        aVar2.x = null;
                        aVar2.y = null;
                        aVar2.z = null;
                        aVar2.A = null;
                        aVar2.E = 3;
                        d = this.b.d(e1Var3, l3, str5, str7, aVar2);
                        if (d != barVar3) {
                            return barVar3;
                        }
                        return d;
                    }
                    h = aVar2.B;
                    str4 = aVar2.A;
                    str3 = aVar2.z;
                    l2 = aVar2.y;
                    e1Var2 = aVar2.x;
                    od.p.E(obj);
                } else {
                    od.p.E(obj);
                    h = e1Var.h();
                    aVar2.x = e1Var;
                    aVar2.y = l;
                    aVar2.z = str;
                    aVar2.A = str2;
                    aVar2.B = h;
                    aVar2.E = 1;
                    java.lang.Object g = ((rg2.m) quxVar.i).g(aVar2);
                    if (g != barVar3) {
                        e1Var2 = e1Var;
                        obj = g;
                        str3 = str;
                        l2 = l;
                        str4 = str2;
                    }
                    return barVar3;
                }
                if (h != ((java.lang.Number) obj).longValue()) {
                    cVar.j();
                    return com.truecaller.wizard.verification.o0.a;
                }
                java.lang.Long l5 = (java.lang.Long) yy.qux.w(e1Var2).a;
                if (l5 == null) {
                    l5 = l2;
                }
                if (str4 != null && l5 != null) {
                    barVar2 = new e83.bar(l5.longValue(), str4);
                } else {
                    barVar2 = null;
                }
                aVar2.x = e1Var2;
                aVar2.y = l2;
                aVar2.z = str3;
                aVar2.A = str4;
                aVar2.E = 2;
                if (quxVar.b(barVar2, aVar2) != barVar3) {
                    str5 = str3;
                    l3 = l2;
                    e1Var3 = e1Var2;
                    java.lang.String str72 = str4;
                    ((q11.bar) this.d.get()).n("networkDomain", cVar.n());
                    aVar2.x = null;
                    aVar2.y = null;
                    aVar2.z = null;
                    aVar2.A = null;
                    aVar2.E = 3;
                    d = this.b.d(e1Var3, l3, str5, str72, aVar2);
                    if (d != barVar3) {
                    }
                }
                return barVar3;
            }
        }
        aVar = new com.truecaller.wizard.verification.a(this, (ff3.qux) barVar);
        com.truecaller.wizard.verification.a aVar22 = aVar;
        obj = aVar22.C;
        ef3.bar barVar32 = ef3.bar.a;
        i = aVar22.E;
        t93.c cVar2 = this.c;
        q73.qux quxVar2 = this.a;
        if (i == 0) {
        }
        if (h != ((java.lang.Number) obj).longValue()) {
        }
    }
}
