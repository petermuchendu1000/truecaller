package com.truecaller.details_view.ui;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class x extends t81.baz {
    public final /* synthetic */ int d;
    public final /* synthetic */ java.lang.Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(fg3.e0 e0Var, android.os.Handler handler, int i) {
        super(handler);
        this.d = i;
        this.e = e0Var;
    }

    @Override // t81.baz
    public final void a() {
        switch (this.d) {
            case 0:
                com.truecaller.details_view.ui.i0 i0Var = (com.truecaller.details_view.ui.i0) this.e;
                fg3.h0.J(i0Var, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new com.truecaller.details_view.ui.w(i0Var, null, 1), 3);
                return;
            case 1:
                ((hg3.s) this.e).c(kotlin.Unit.a);
                return;
            case 2:
                rr1.n nVar = (rr1.n) this.e;
                rr1.m0 m0Var = nVar.K;
                if (m0Var != null) {
                    p52.g.p("Aggregated contact data changed, refreshing caller info for current call");
                    rr1.n.b(nVar, m0Var, true);
                    return;
                }
                return;
            case 3:
                t22.c cVar = (t22.c) this.e;
                fg3.h0.J(cVar, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new sr0.bar(cVar, (df3.bar) null, 8), 3);
                return;
            case 4:
                ig3.h2 h2Var = ((t22.n0) this.e).m;
                sf3.a.a.getClass();
                java.lang.Integer valueOf = java.lang.Integer.valueOf(sf3.a.b.e(1, Integer.MAX_VALUE));
                h2Var.getClass();
                h2Var.p((java.lang.Object) null, valueOf);
                return;
            default:
                ((y12.t0) this.e).a();
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(java.lang.Object obj, android.os.Handler handler, int i) {
        super(handler, 600L);
        this.d = i;
        this.e = obj;
    }
}
