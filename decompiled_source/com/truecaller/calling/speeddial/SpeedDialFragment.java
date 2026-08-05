package com.truecaller.calling.speeddial;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/calling/speeddial/SpeedDialFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "dialer_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class SpeedDialFragment extends androidx.fragment.app.Fragment implements bd3.qux, wv0.a {
    public yc3.h c;
    public volatile yc3.d e;
    public wv0.m h;
    public wv0.g i;
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
            tx.p pVar = (tx.p) ((wv0.d) X3());
            this.h = (wv0.m) pVar.P.get();
            this.i = (wv0.g) pVar.Q.get();
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

    public final void onActivityResult(int i, int i2, android.content.Intent intent) {
        if (!mk.m.x(i, i2, intent, new v2.f2(this, 17))) {
            super.onActivityResult(i, i2, intent);
        }
    }

    public final void onAttach(android.content.Context context) {
        super.onAttach(context);
        R4();
        S4();
    }

    public final void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        wv0.m mVar = this.h;
        if (mVar != null) {
            mVar.b = this;
        } else {
            kotlin.jvm.internal.Intrinsics.n("speedDialPresenter");
            throw null;
        }
    }

    public final android.view.View onCreateView(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        return layoutInflater.inflate(2131561094, viewGroup, false);
    }

    public final void onDestroyView() {
        super.onDestroyView();
        wv0.m mVar = this.h;
        if (mVar != null) {
            mVar.m1();
        } else {
            kotlin.jvm.internal.Intrinsics.n("speedDialPresenter");
            throw null;
        }
    }

    public final android.view.LayoutInflater onGetLayoutInflater(android.os.Bundle bundle) {
        android.view.LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new yc3.h(onGetLayoutInflater, this));
    }

    public final void onViewCreated(android.view.View view, android.os.Bundle bundle) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
        androidx.fragment.app.FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.setTitle(2132020676);
        }
        wv0.m mVar = this.h;
        if (mVar != null) {
            wv0.g gVar = this.i;
            if (gVar != null) {
                mVar.u0(new wv0.n(gVar, view));
                return;
            } else {
                kotlin.jvm.internal.Intrinsics.n("speedDialItemsPresenter");
                throw null;
            }
        }
        kotlin.jvm.internal.Intrinsics.n("speedDialPresenter");
        throw null;
    }

    @Override // wv0.a
    public final void s4(int i, java.lang.String str) {
        mk.m.B(this, i, str, false);
    }

    public final void onAttach(android.app.Activity activity) {
        super.onAttach(activity);
        yc3.h hVar = this.c;
        fj.a.i(hVar == null || yc3.d.c(hVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new java.lang.Object[0]);
        R4();
        S4();
    }
}
