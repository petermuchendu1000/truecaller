package com.truecaller.account.domain.auth;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class i1 {
    public final fg3.e0 a;
    public final kotlin.coroutines.CoroutineContext b;
    public final n11.l c;
    public final qc3.bar d;
    public final com.truecaller.account.domain.auth.a0 e;
    public final qo1.i f;
    public final nc0.bar g;

    public i1(fg3.e0 e0Var, kotlin.coroutines.CoroutineContext coroutineContext, n11.l lVar, qc3.bar barVar, com.truecaller.account.domain.auth.a0 a0Var, qo1.i iVar, nc0.bar barVar2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(e0Var, "scope");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineContext, "ioContext");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lVar, "accountManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "temporaryAuthTokenManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(a0Var, "authTokenProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iVar, "identityFeaturesInventory");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar2, "analytics");
        this.a = e0Var;
        this.b = coroutineContext;
        this.c = lVar;
        this.d = barVar;
        this.e = a0Var;
        this.f = iVar;
        this.g = barVar2;
    }

    public final com.truecaller.account.domain.auth.r1 a(java.lang.String str, boolean z, boolean z2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "endpointKey");
        if (z2) {
            return new com.truecaller.account.domain.auth.e1(this.d, this.c, z, str, this.f, this.g);
        }
        return new com.truecaller.account.domain.auth.l1(this.a, this.b, this.c, this.e, str, this.f, z, this.g);
    }
}
