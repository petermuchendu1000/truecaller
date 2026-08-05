package com.truecaller.namesuggestion.impl.ui;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public abstract class baz extends e52.qux implements bd3.qux {
    public yc3.h c;
    public volatile yc3.d e;
    public boolean d = false;
    public final java.lang.Object f = new java.lang.Object();
    public boolean g = false;

    public final void R4() {
        if (this.c == null) {
            this.c = new yc3.h(super.getContext(), this);
            this.d = cu0.j1.x(super.getContext());
        }
    }

    public final void S4() {
        if (!this.g) {
            this.g = true;
            com.truecaller.namesuggestion.impl.ui.c cVar = (com.truecaller.namesuggestion.impl.ui.c) this;
            tx.w wVar = ((com.truecaller.namesuggestion.impl.ui.d) X3()).f;
            tx.c0 c0Var = wVar.b;
            cVar.h = (f52.qux) c0Var.c8.get();
            cVar.i = (kotlin.coroutines.CoroutineContext) wVar.V1.get();
            cVar.j = (kotlin.coroutines.CoroutineContext) wVar.P.get();
            cVar.k = c0Var.r2();
            cVar.n = (nc0.bar) wVar.Y.get();
        }
    }

    public final java.lang.Object X3() {
        if (this.e == null) {
            synchronized (this.f) {
                try {
                    if (this.e == null) {
                        this.e = new yc3.d(this);
                    }
                } finally {
                }
            }
        }
        return this.e.X3();
    }

    public final android.content.Context getContext() {
        if (super.getContext() == null && !this.d) {
            return null;
        }
        R4();
        return this.c;
    }

    public final androidx.lifecycle.q1 getDefaultViewModelProviderFactory() {
        return bf0.s2.J(this, super.getDefaultViewModelProviderFactory());
    }

    public final void onAttach(android.content.Context context) {
        super.onAttach(context);
        R4();
        S4();
    }

    @Override // e52.qux
    public final android.view.LayoutInflater onGetLayoutInflater(android.os.Bundle bundle) {
        android.view.LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new yc3.h(onGetLayoutInflater, this));
    }

    public final void onAttach(android.app.Activity activity) {
        super.onAttach(activity);
        yc3.h hVar = this.c;
        fj.a.i(hVar == null || yc3.d.c(hVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new java.lang.Object[0]);
        R4();
        S4();
    }
}
