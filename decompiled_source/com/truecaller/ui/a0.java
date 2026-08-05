package com.truecaller.ui;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public abstract class a0 extends com.truecaller.ui.v implements bd3.qux {
    public yc3.h e;
    public volatile yc3.d g;
    public boolean f = false;
    public final java.lang.Object h = new java.lang.Object();
    public boolean i = false;

    public final void V4() {
        if (this.e == null) {
            this.e = new yc3.h(super.getContext(), this);
            this.f = cu0.j1.x(super.getContext());
        }
    }

    public final void W4() {
        if (!this.i) {
            this.i = true;
            com.truecaller.ui.FeedbackFormFragment feedbackFormFragment = (com.truecaller.ui.FeedbackFormFragment) this;
            tx.p pVar = (com.truecaller.ui.r) X3();
            tx.w wVar = pVar.f;
            feedbackFormFragment.A = new ki.qux(wVar.b.q1(), pVar.r0());
            feedbackFormFragment.B = (u03.w) wVar.n1.get();
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

    public final android.content.Context getContext() {
        if (super.getContext() == null && !this.f) {
            return null;
        }
        V4();
        return this.e;
    }

    public final androidx.lifecycle.q1 getDefaultViewModelProviderFactory() {
        return bf0.s2.J(this, super.getDefaultViewModelProviderFactory());
    }

    public final void onAttach(android.content.Context context) {
        super.onAttach(context);
        V4();
        W4();
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
        V4();
        W4();
    }
}
