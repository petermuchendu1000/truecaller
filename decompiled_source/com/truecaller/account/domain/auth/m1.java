package com.truecaller.account.domain.auth;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class m1 {
    public final kotlin.coroutines.CoroutineContext a;
    public final n11.l b;
    public final qc3.bar c;
    public final com.truecaller.account.domain.auth.a0 d;
    public final qo1.i e;
    public final qc3.bar f;
    public final qc3.bar g;
    public final nc0.bar h;
    public final kotlin.Lazy i;

    public m1(kotlin.coroutines.CoroutineContext coroutineContext, n11.l lVar, qc3.bar barVar, com.truecaller.account.domain.auth.a0 a0Var, qo1.i iVar, qc3.bar barVar2, qc3.bar barVar3, nc0.bar barVar4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineContext, "ioContext");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lVar, "accountManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "temporaryAuthTokenManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(a0Var, "authTokenProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iVar, "identityFeaturesInventory");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar2, "restCrossDcSupport");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar3, "credentialsChecker");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar4, "analytics");
        this.a = coroutineContext;
        this.b = lVar;
        this.c = barVar;
        this.d = a0Var;
        this.e = iVar;
        this.f = barVar2;
        this.g = barVar3;
        this.h = barVar4;
        this.i = kotlin.LazyKt.lazy(new com.truecaller.account.domain.auth.f(this, 4));
    }
}
