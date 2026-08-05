package com.truecaller.search.global;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class qux extends com.truecaller.search.global.b {
    public final u03.b0 k;
    public final s90.baz l;

    public qux(u03.b0 b0Var, s90.baz bazVar) {
        super(1);
        this.k = b0Var;
        this.l = bazVar;
        r(0);
    }

    @Override // com.truecaller.search.global.b
    public final void b(ey2.a aVar, int i) {
        u90.a c;
        com.truecaller.search.global.h0 h0Var = this.d;
        com.truecaller.search.global.a aVar2 = (com.truecaller.search.global.a) aVar;
        java.lang.String a = this.l.a("numberOrNameSearchAdUnitId");
        h0Var.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(aVar2, "viewHolder");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(a, "adId");
        kp2.bar barVar = h0Var.t;
        barVar.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(a, "adId");
        java.util.HashMap hashMap = barVar.d;
        if (hashMap.containsKey(a)) {
            c = (u90.a) hashMap.get(a);
        } else {
            c = barVar.a.c(barVar.b.i("SEARCHRESULTS", a), i);
            if (c != null) {
                hashMap.put(a, c);
            }
        }
        android.view.ViewGroup viewGroup = aVar2.e;
        viewGroup.removeAllViews();
        if (c != null) {
            viewGroup.addView(com.truecaller.ads.util.l0.a(ye0.k.O(((androidx.recyclerview.widget.k2) aVar2).itemView.getContext()), com.truecaller.ads.AdLayoutTypeX.SMALL, c));
            viewGroup.setVisibility(0);
        } else {
            viewGroup.setVisibility(8);
        }
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
        return 2131364281;
    }

    @Override // com.truecaller.search.global.b
    public final java.lang.String o() {
        return ((u03.g0) this.k).h(2132021621, new java.lang.Object[0]);
    }

    @Override // com.truecaller.search.global.b
    public final int p() {
        return 0;
    }

    @Override // com.truecaller.search.global.b
    public final int q() {
        return 0;
    }
}
