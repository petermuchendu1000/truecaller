package com.truecaller.search.global;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public abstract class u0 extends com.truecaller.ui.d0 implements bd3.qux {
    public yc3.h e;
    public volatile yc3.d g;
    public boolean f = false;
    public final java.lang.Object h = new java.lang.Object();
    public boolean i = false;

    public final void W4() {
        if (this.e == null) {
            this.e = new yc3.h(super.getContext(), this);
            this.f = cu0.j1.x(super.getContext());
        }
    }

    @Override // bd3.baz
    public final java.lang.Object X3() {
        if (this.g == null) {
            synchronized (this.h) {
                try {
                    if (this.g == null) {
                        this.g = new yc3.d(this);
                    }
                } finally {
                }
            }
        }
        return this.g.X3();
    }

    public final void X4() {
        if (!this.i) {
            this.i = true;
            com.truecaller.search.global.w wVar = (com.truecaller.search.global.w) this;
            tx.p pVar = (com.truecaller.search.global.x) X3();
            tx.w wVar2 = pVar.f;
            wVar.q = new a70.d((kotlin.coroutines.CoroutineContext) wVar2.V1.get(), (kotlin.coroutines.CoroutineContext) wVar2.P.get(), cd3.baz.a(wVar2.G5), (nc0.bar) wVar2.Y.get(), cd3.baz.a(wVar2.R5));
            wVar.r = (hw0.a) wVar2.h5.get();
            wVar.s = (jq2.bar) wVar2.K9.get();
            wVar.t = (u03.baz) wVar2.W.get();
            wVar.u = (xf2.baz) wVar2.E7.get();
            wVar.v = (e00.k) wVar2.z7.get();
            tx.c0 c0Var = wVar2.b;
            wVar.w = (fg0.bar) wVar2.Tg.get();
            wVar.x = (r90.a) wVar2.ca.get();
            wVar.y = (r90.g) wVar2.ia.get();
            wVar.z = (kotlin.coroutines.CoroutineContext) wVar2.V1.get();
            wVar.A = (nc0.bar) wVar2.Y.get();
            wVar.B = wVar2.U();
            wVar.C = pVar.h.m0;
            wVar.D = (qo1.k) wVar2.v0.get();
            wVar.E = (e70.c) c0Var.S2.get();
            wVar.F = (p81.bar) wVar2.s4.get();
            wVar.G = (nd1.bar) wVar2.dm.get();
        }
    }

    public final android.content.Context getContext() {
        if (super.getContext() == null && !this.f) {
            return null;
        }
        W4();
        return this.e;
    }

    public final androidx.lifecycle.q1 getDefaultViewModelProviderFactory() {
        return bf0.s2.J(this, super.getDefaultViewModelProviderFactory());
    }

    public final void onAttach(android.content.Context context) {
        super.onAttach(context);
        W4();
        X4();
    }

    public final android.view.LayoutInflater onGetLayoutInflater(android.os.Bundle bundle) {
        android.view.LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new yc3.h(onGetLayoutInflater, this));
    }

    @Override // com.truecaller.ui.v
    public final void onAttach(android.app.Activity activity) {
        super.onAttach(activity);
        yc3.h hVar = this.e;
        fj.a.i(hVar == null || yc3.d.c(hVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new java.lang.Object[0]);
        W4();
        X4();
    }
}
