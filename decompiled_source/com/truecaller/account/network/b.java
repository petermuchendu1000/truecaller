package com.truecaller.account.network;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class b {
    public static final com.truecaller.account.network.b a = new java.lang.Object();

    public static wj3.a a(com.truecaller.account.network.AddSecondaryNumberRequestDto addSecondaryNumberRequestDto) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addSecondaryNumberRequestDto, "requestDto");
        return g(false).o(addSecondaryNumberRequestDto);
    }

    public static java.lang.Object c(s52.bar barVar) {
        return ((com.truecaller.account.network.baz) p40.l.k(com.truecaller.common.network.util.KnownEndpoints.ACCOUNT, com.truecaller.account.network.baz.class)).m(barVar);
    }

    public static java.lang.Object d(q21.d dVar) {
        return g(true).i(dVar);
    }

    public static java.lang.Object e(com.truecaller.account.network.TermsConsentVersionRequest termsConsentVersionRequest, oi2.e eVar) {
        return f(com.truecaller.common.network.util.AuthRequirement.NONE, true).f(termsConsentVersionRequest, eVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, p31.bar] */
    /* JADX WARN: Type inference failed for: r2v0, types: [j31.n, java.lang.Object] */
    public static com.truecaller.account.network.baz f(com.truecaller.common.network.util.AuthRequirement authRequirement, boolean z) {
        ?? obj = new java.lang.Object();
        obj.a(com.truecaller.common.network.util.KnownEndpoints.ACCOUNT);
        obj.g(com.truecaller.account.network.baz.class);
        ?? obj2 = new java.lang.Object();
        obj2.b(authRequirement, (java.lang.String) null);
        obj2.c(true);
        ((j31.n) obj2).f = new j31.k(z);
        okhttp3.OkHttpClient a2 = p31.baz.a((j31.n) obj2);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(a2, "client");
        ((p31.bar) obj).g = a2;
        java.lang.Object obj3 = new java.lang.Object();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj3, "interceptor");
        if (((p31.bar) obj).e == null) {
            ((p31.bar) obj).e = new java.util.ArrayList();
        }
        java.util.ArrayList arrayList = ((p31.bar) obj).e;
        if (arrayList != null) {
            arrayList.add(obj3);
        }
        return (com.truecaller.account.network.baz) obj.d(com.truecaller.account.network.baz.class);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, p31.bar] */
    /* JADX WARN: Type inference failed for: r2v0, types: [j31.n, java.lang.Object] */
    public static com.truecaller.account.network.baz g(boolean z) {
        ?? obj = new java.lang.Object();
        obj.a(com.truecaller.common.network.util.KnownEndpoints.ACCOUNT);
        obj.g(com.truecaller.account.network.baz.class);
        ?? obj2 = new java.lang.Object();
        obj2.b(com.truecaller.common.network.util.AuthRequirement.REQUIRED, (java.lang.String) null);
        obj2.c(true);
        ((j31.n) obj2).f = new j31.k(z);
        okhttp3.OkHttpClient a2 = p31.baz.a((j31.n) obj2);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(a2, "client");
        ((p31.bar) obj).g = a2;
        return (com.truecaller.account.network.baz) obj.d(com.truecaller.account.network.baz.class);
    }

    public static wj3.a h(h31.c cVar, com.truecaller.account.network.SendTokenRequestDto sendTokenRequestDto, boolean z, java.util.Map map) {
        com.truecaller.common.network.util.AuthRequirement authRequirement;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cVar, "targetDomain");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sendTokenRequestDto, "requestDto");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "header");
        if (z) {
            authRequirement = com.truecaller.common.network.util.AuthRequirement.REQUIRED;
        } else {
            authRequirement = com.truecaller.common.network.util.AuthRequirement.NONE;
        }
        return f(authRequirement, !z).h(map, cVar, sendTokenRequestDto);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, p31.bar] */
    /* JADX WARN: Type inference failed for: r2v0, types: [j31.n, java.lang.Object] */
    public static wj3.a i(com.truecaller.account.network.InstallationDetailsDto installationDetailsDto) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(installationDetailsDto, "requestDto");
        ?? obj = new java.lang.Object();
        obj.a(com.truecaller.common.network.util.KnownEndpoints.ACCOUNT);
        obj.g(com.truecaller.account.network.baz.class);
        ?? obj2 = new java.lang.Object();
        obj2.b(com.truecaller.common.network.util.AuthRequirement.REQUIRED, (java.lang.String) null);
        obj2.d();
        okhttp3.OkHttpClient a2 = p31.baz.a((j31.n) obj2);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(a2, "client");
        ((p31.bar) obj).g = a2;
        return ((com.truecaller.account.network.baz) obj.d(com.truecaller.account.network.baz.class)).g(installationDetailsDto);
    }

    public static wj3.a j(h31.c cVar, com.truecaller.account.network.VerifyTokenRequestDto verifyTokenRequestDto, boolean z) {
        com.truecaller.common.network.util.AuthRequirement authRequirement;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cVar, "targetDomain");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(verifyTokenRequestDto, "requestDto");
        if (z) {
            authRequirement = com.truecaller.common.network.util.AuthRequirement.REQUIRED;
        } else {
            authRequirement = com.truecaller.common.network.util.AuthRequirement.NONE;
        }
        return f(authRequirement, !z).n(cVar, verifyTokenRequestDto);
    }

    public static wj3.a k(com.truecaller.account.network.VerifyTokenRequestDto verifyTokenRequestDto) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(verifyTokenRequestDto, "requestDto");
        return g(false).e(verifyTokenRequestDto);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x006f, code lost:
    
        if (r8 != r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object b(com.truecaller.account.network.DeactivateAccountRequest deactivateAccountRequest, ff3.qux quxVar) {
        com.truecaller.account.network.qux quxVar2;
        int i;
        com.truecaller.account.network.baz bazVar;
        int i2;
        int i3;
        wj3.k0 k0Var;
        if (quxVar instanceof com.truecaller.account.network.qux) {
            quxVar2 = (com.truecaller.account.network.qux) quxVar;
            int i4 = quxVar2.B;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                quxVar2.B = i4 - Integer.MIN_VALUE;
                java.lang.Object obj = quxVar2.z;
                ef3.bar barVar = ef3.bar.a;
                i = quxVar2.B;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            od.p.E(obj);
                            return (wj3.k0) obj;
                        }
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i3 = quxVar2.y;
                    bazVar = (com.truecaller.account.network.baz) quxVar2.x;
                    od.p.E(obj);
                } else {
                    od.p.E(obj);
                    bazVar = (com.truecaller.account.network.baz) p40.l.k(com.truecaller.common.network.util.KnownEndpoints.ACCOUNT, com.truecaller.account.network.baz.class);
                    i2 = 0;
                    if (deactivateAccountRequest != null) {
                        quxVar2.x = bazVar;
                        quxVar2.y = 0;
                        quxVar2.B = 1;
                        java.lang.Object d = bazVar.d(deactivateAccountRequest, quxVar2);
                        if (d != barVar) {
                            obj = d;
                            i3 = 0;
                        }
                        return barVar;
                    }
                    quxVar2.x = null;
                    quxVar2.y = i2;
                    quxVar2.B = 2;
                    obj = bazVar.b(quxVar2);
                }
                k0Var = (wj3.k0) obj;
                if (k0Var != null) {
                    i2 = i3;
                    quxVar2.x = null;
                    quxVar2.y = i2;
                    quxVar2.B = 2;
                    obj = bazVar.b(quxVar2);
                } else {
                    return k0Var;
                }
            }
        }
        quxVar2 = new com.truecaller.account.network.qux(this, quxVar);
        java.lang.Object obj2 = quxVar2.z;
        ef3.bar barVar2 = ef3.bar.a;
        i = quxVar2.B;
        if (i == 0) {
        }
        k0Var = (wj3.k0) obj2;
        if (k0Var != null) {
        }
    }
}
