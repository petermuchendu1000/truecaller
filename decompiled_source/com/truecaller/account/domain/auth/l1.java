package com.truecaller.account.domain.auth;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class l1 extends com.truecaller.account.domain.auth.r1 {
    public final fg3.e0 d;
    public final kotlin.coroutines.CoroutineContext e;
    public final n11.l f;
    public final com.truecaller.account.domain.auth.a0 g;
    public final java.lang.String h;
    public final qo1.i i;
    public final boolean j;
    public final nc0.bar k;
    public boolean l;

    public l1(fg3.e0 e0Var, kotlin.coroutines.CoroutineContext coroutineContext, n11.l lVar, com.truecaller.account.domain.auth.a0 a0Var, java.lang.String str, qo1.i iVar, boolean z, nc0.bar barVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(e0Var, "scope");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineContext, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lVar, "accountManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(a0Var, "authTokenProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "endpointKey");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iVar, "identityFeaturesInventory");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "analytics");
        this.d = e0Var;
        this.e = coroutineContext;
        this.f = lVar;
        this.g = a0Var;
        this.h = str;
        this.i = iVar;
        this.j = z;
        this.k = barVar;
    }

    public final void a(ea.c cVar, java.util.concurrent.Executor executor, id3.i3 i3Var) {
        java.lang.String str;
        java.lang.String concat;
        java.lang.String str2;
        n11.l lVar = this.f;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cVar, "requestInfo");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executor, "appExecutor");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(i3Var, "applier");
        qo1.i iVar = this.i;
        java.lang.String str3 = null;
        if (iVar.b.a("featureJwtAuth", com.truecaller.featuretoggles.FeatureState.ENABLED_ALPHA_DEBUG)) {
            fg3.h0.J(this.d, this.e, (fg3.f0) null, new ag2.h((java.lang.Object) this, (java.lang.Object) cVar, (java.lang.Object) i3Var, (df3.bar) str3, 6), 2);
            return;
        }
        boolean j = ((n11.o) lVar).j();
        if (!j) {
            lVar = null;
        }
        if (lVar != null) {
            n11.o oVar = (n11.o) lVar;
            synchronized (oVar.n) {
                n11.bar e = oVar.e();
                if (e != null && (str2 = e.a) != null) {
                    str = oVar.k(str2);
                }
                str = null;
            }
            if (str != null && (concat = "Bearer ".concat(str)) != null) {
                this.l = true;
                str3 = concat;
            }
        }
        com.truecaller.account.domain.auth.j1.a(i3Var, str3, this.j, j, false, this.k, cVar, iVar.a.a("logAccountExceptions_71454", com.truecaller.featuretoggles.FeatureState.DISABLED));
    }

    @Override // com.truecaller.account.domain.auth.r1
    public final java.lang.String m() {
        return this.h;
    }

    @Override // com.truecaller.account.domain.auth.r1
    public final boolean n() {
        return this.l;
    }
}
