package com.truecaller.account.domain.auth;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class e1 extends com.truecaller.account.domain.auth.r1 {
    public final qc3.bar d;
    public final n11.l e;
    public final boolean f;
    public final java.lang.String g;
    public final qo1.i h;
    public final nc0.bar i;
    public boolean j;

    public e1(qc3.bar barVar, n11.l lVar, boolean z, java.lang.String str, qo1.i iVar, nc0.bar barVar2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "temporaryAuthTokenManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lVar, "accountManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iVar, "identityFeaturesInventory");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar2, "analytics");
        this.d = barVar;
        this.e = lVar;
        this.f = z;
        this.g = str;
        this.h = iVar;
        this.i = barVar2;
    }

    public final void a(ea.c cVar, java.util.concurrent.Executor executor, id3.i3 i3Var) {
        qc3.bar barVar;
        java.lang.String str;
        n11.h hVar;
        java.lang.String b;
        java.lang.String concat;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cVar, "requestInfo");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executor, "appExecutor");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(i3Var, "applier");
        boolean j = this.e.j();
        if (j) {
            barVar = this.d;
        } else {
            barVar = null;
        }
        if (barVar != null && (hVar = (n11.h) barVar.get()) != null && (b = hVar.b()) != null && (concat = "Bearer ".concat(b)) != null) {
            this.j = true;
            str = concat;
        } else {
            str = null;
        }
        com.truecaller.account.domain.auth.j1.a(i3Var, str, this.f, j, true, this.i, cVar, this.h.a.a("logAccountExceptions_71454", com.truecaller.featuretoggles.FeatureState.DISABLED));
    }

    @Override // com.truecaller.account.domain.auth.r1
    public final java.lang.String m() {
        return this.g;
    }

    @Override // com.truecaller.account.domain.auth.r1
    public final boolean n() {
        return this.j;
    }
}
