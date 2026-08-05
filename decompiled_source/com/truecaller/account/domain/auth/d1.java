package com.truecaller.account.domain.auth;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class d1 implements com.truecaller.account.domain.auth.b1 {
    public final fg3.e0 a;
    public final kotlin.coroutines.CoroutineContext b;
    public final android.content.Context c;
    public final n11.l d;
    public final gy.qux e;
    public final q11.bar f;
    public final com.truecaller.account.network.bar g;
    public final javax.inject.Provider h;
    public final qc3.bar i;
    public final qc3.bar j;
    public final pg3.a k;

    public d1(fg3.e0 e0Var, kotlin.coroutines.CoroutineContext coroutineContext, android.content.Context context, n11.l lVar, gy.qux quxVar, q11.bar barVar, com.truecaller.account.network.bar barVar2, tx.v vVar, qc3.bar barVar3, qc3.bar barVar4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(e0Var, "appScope");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineContext, "ioContext");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lVar, "legacyAccountManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(quxVar, "accountManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "accountSettings");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar2, "accountRequestHelper");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(vVar, "installationDetailsProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar3, "wizardLauncher");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar4, "authTokenRepository");
        this.a = e0Var;
        this.b = coroutineContext;
        this.c = context;
        this.d = lVar;
        this.e = quxVar;
        this.f = barVar;
        this.g = barVar2;
        this.h = vVar;
        this.i = barVar3;
        this.j = barVar4;
        this.k = pg3.b.a();
    }
}
