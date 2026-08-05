package com.truecaller.search.global;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class k1 extends com.truecaller.search.global.b {
    public final u03.b0 k;
    public final qo1.k l;

    public k1(u03.b0 b0Var, qo1.k kVar) {
        super(3);
        this.k = b0Var;
        this.l = kVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.search.global.b
    public final void b(ey2.a aVar, int i) {
        com.truecaller.search.global.h0 h0Var = this.d;
        com.truecaller.search.global.c1 c1Var = (com.truecaller.search.global.c1) aVar;
        h0Var.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(c1Var, "searchResultView");
        com.truecaller.data.entity.Contact contact = (com.truecaller.data.entity.Contact) h0Var.d0.get(i);
        h0Var.q2(c1Var, null, contact, contact.X(), false, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.search.global.b
    public final boolean c(ey2.a aVar, boolean z) {
        if (!this.l.e()) {
            return false;
        }
        com.truecaller.search.global.h0 h0Var = this.d;
        com.truecaller.search.global.d1 d1Var = (com.truecaller.search.global.d1) aVar;
        h0Var.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(d1Var, "searchToken");
        if (z) {
            com.truecaller.search.global.j1 j1Var = (com.truecaller.search.global.j1) d1Var;
            j1Var.e.setText(((u03.g0) j1Var.d).h(2132022900, new java.lang.Object[0]));
        } else {
            java.lang.String str = h0Var.e0;
            h0Var.D.g(str);
            com.truecaller.search.global.j1 j1Var2 = (com.truecaller.search.global.j1) d1Var;
            j1Var2.getClass();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "token");
            android.widget.TextView textView = j1Var2.e;
            u03.b0 b0Var = j1Var2.d;
            textView.setText(((u03.g0) b0Var).h(2132022902, j1Var2.n(((u03.g0) b0Var).h(2132022902, new java.lang.Object[0]).length(), str)));
            if (j1Var2.f == 0) {
                textView.post(new com.amazon.aps.ads.util.adview.baz(22, j1Var2, str));
            }
        }
        return true;
    }

    @Override // com.truecaller.search.global.b
    public final int i() {
        return 2131364285;
    }

    @Override // com.truecaller.search.global.b
    public final int j() {
        return 2131364287;
    }

    @Override // com.truecaller.search.global.b
    public final int k() {
        return 2131364286;
    }

    @Override // com.truecaller.search.global.b
    public final int l() {
        return 2131364289;
    }

    @Override // com.truecaller.search.global.b
    public final int m() {
        return 0;
    }

    @Override // com.truecaller.search.global.b
    public final int n() {
        return 2131364291;
    }

    @Override // com.truecaller.search.global.b
    public final java.lang.String o() {
        return ((u03.g0) this.k).h(2132021626, new java.lang.Object[0]);
    }

    @Override // com.truecaller.search.global.b
    public final int p() {
        return 0;
    }

    @Override // com.truecaller.search.global.b
    public final int q() {
        return 2131364296;
    }
}
