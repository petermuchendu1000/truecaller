package com.truecaller.search.global;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class f extends com.truecaller.search.global.b {
    public final u03.b0 k;

    public f(u03.b0 b0Var) {
        super(3);
        this.k = b0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.search.global.b
    public final void b(ey2.a aVar, int i) {
        boolean z;
        boolean z2;
        com.truecaller.search.global.h0 h0Var = this.d;
        com.truecaller.search.global.c1 c1Var = (com.truecaller.search.global.c1) aVar;
        h0Var.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(c1Var, "searchResultView");
        com.truecaller.search.global.e eVar = (com.truecaller.search.global.e) h0Var.a0.get(i);
        com.truecaller.data.entity.Contact contact = eVar.a;
        if (contact.C().isEmpty() && contact.n() != null) {
            contact.c(h0Var.x.e(new java.lang.String[]{contact.n()}));
        }
        com.truecaller.blocking.FilterMatch filterMatch = eVar.c;
        if (filterMatch != null) {
            z = filterMatch.d();
        } else {
            z = false;
        }
        boolean z3 = true;
        if ((contact.X() || (filterMatch != null && filterMatch.c == com.truecaller.blocking.ActionSource.TOP_SPAMMER)) && !z) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (filterMatch == null || filterMatch.b != com.truecaller.blocking.FilterAction.FILTER_BLACKLISTED) {
            z3 = false;
        }
        h0Var.q2(c1Var, eVar, contact, z2, z3, z);
    }

    @Override // com.truecaller.search.global.b
    public final boolean c(ey2.a aVar, boolean z) {
        return false;
    }

    @Override // com.truecaller.search.global.b
    public final int i() {
        return 0;
    }

    @Override // com.truecaller.search.global.b
    public final int j() {
        return 0;
    }

    @Override // com.truecaller.search.global.b
    public final int k() {
        return 0;
    }

    @Override // com.truecaller.search.global.b
    public final int l() {
        return 0;
    }

    @Override // com.truecaller.search.global.b
    public final int m() {
        return 0;
    }

    @Override // com.truecaller.search.global.b
    public final int n() {
        return 2131364282;
    }

    @Override // com.truecaller.search.global.b
    public final java.lang.String o() {
        return ((u03.g0) this.k).h(2132021622, new java.lang.Object[0]);
    }

    @Override // com.truecaller.search.global.b
    public final int p() {
        return 0;
    }

    @Override // com.truecaller.search.global.b
    public final int q() {
        return 2131364293;
    }
}
