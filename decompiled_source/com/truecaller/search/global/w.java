package com.truecaller.search.global;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public class w extends com.truecaller.search.global.u0 implements p41.bar, com.truecaller.search.global.y {
    public nc0.bar A;
    public w31.g B;
    public javax.inject.Provider C;
    public qo1.k D;
    public e70.c E;
    public p81.bar F;
    public nd1.bar G;
    public final com.google.android.gms.internal.auth.c H = new com.google.android.gms.internal.auth.c(this, new android.os.Handler(android.os.Looper.getMainLooper()), 5);
    public androidx.recyclerview.widget.RecyclerView j;
    public android.widget.TextView k;
    public ey2.q l;
    public ey2.m m;
    public v00.qux n;
    public androidx.recyclerview.widget.z0 o;
    public com.truecaller.search.global.v p;
    public a70.d q;
    public hw0.a r;
    public jq2.bar s;
    public u03.baz t;
    public xf2.baz u;
    public e00.k v;
    public fg0.bar w;
    public r90.a x;
    public r90.g y;
    public kotlin.coroutines.CoroutineContext z;

    public final void E(java.lang.String str) {
        if (isVisible()) {
            this.n.e(false);
            this.n.a();
            bd.bar.u(this.A, "globalSearchHistory", "n/a");
        }
    }

    public final com.truecaller.common.ui.o O4() {
        return null;
    }

    @Override // com.truecaller.ui.v
    public final void R4() {
        this.l.unregisterAdapterDataObserver(this.o);
        v00.qux quxVar = this.n;
        quxVar.d.cancel((java.util.concurrent.CancellationException) null);
        quxVar.a.l(quxVar.b, quxVar);
        z0.p0 p0Var = quxVar.g;
        int j = p0Var.j();
        for (int i = 0; i < j; i++) {
            ((u90.a) p0Var.k(i)).destroy();
        }
        p0Var.b();
        android.database.Cursor cursor = this.l.o;
        if (cursor != null) {
            cursor.unregisterContentObserver(this.H);
            cursor.close();
        }
        ey2.q qVar = this.l;
        qVar.o = null;
        qVar.notifyDataSetChanged();
        this.o = null;
        this.l = null;
        this.n = null;
    }

    public final void Y1(android.content.Intent intent) {
    }

    public final void Y4() {
        Z4();
        a70.d dVar = this.q;
        dVar.getClass();
        fg3.h0.J(dVar, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new com.truecaller.search.global.z(dVar, null, 1), 3);
        V4(this.m);
    }

    public final void Z4() {
        android.widget.TextView textView;
        android.widget.ImageView imageView;
        if (!S4()) {
            int i = 0;
            m03.v.j(this.k, false, true);
            android.view.View view = getView();
            if (view == null) {
                textView = null;
            } else {
                textView = (android.widget.TextView) view.findViewById(2131364971);
            }
            m03.v.j(textView, false, true);
            android.view.View view2 = getView();
            if (view2 == null) {
                imageView = null;
            } else {
                imageView = (android.widget.ImageView) view2.findViewById(2131364970);
            }
            m03.v.j(imageView, false, true);
            if (this.l.getItemCount() == 0) {
                try {
                    hw0.q qVar = this.r;
                    com.mbridge.msdk.config.component.common.express.operator.baz.y(j0.b.q((fg3.e0) qVar.d.getValue(), (kotlin.coroutines.CoroutineContext) null, new hw0.i(qVar, (df3.bar) null, 0), 3), new com.truecaller.search.global.q(this, i));
                } catch (java.lang.Exception unused) {
                }
            }
        }
    }

    public final void l2() {
        androidx.recyclerview.widget.RecyclerView recyclerView = this.j;
        if (recyclerView != null) {
            recyclerView.smoothScrollToPosition(0);
        }
    }

    public final void n4(boolean z) {
        if (isVisible()) {
            this.n.e(true);
        }
        long millis = java.util.concurrent.TimeUnit.SECONDS.toMillis(this.s.D("adFeatureRetentionTime", 0L));
        if (millis == 0) {
            this.n.f.b();
            return;
        }
        v00.qux quxVar = this.n;
        quxVar.getClass();
        quxVar.i = fg3.h0.J(quxVar, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new aj0.j(millis, quxVar, (df3.bar) null, 25), 3);
    }

    /* JADX WARN: Type inference failed for: r13v4, types: [com.truecaller.search.global.v, com.truecaller.ui.bar] */
    /* JADX WARN: Type inference failed for: r7v0, types: [com.truecaller.search.global.p] */
    public final android.view.View onCreateView(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        android.view.View inflate = yy.qux.F(layoutInflater, true).inflate(2131561029, viewGroup, false);
        ey2.q qVar = new ey2.q(requireContext(), this.v, this.u, this.t, this.w, com.bumptech.glide.baz.b(getContext()).d(this), new n00.g() { // from class: com.truecaller.search.global.p
            public final boolean d(n00.d dVar) {
                com.truecaller.data.entity.Contact contact;
                if (dVar.a.equals("Call") && (contact = (com.truecaller.data.entity.Contact) dVar.e) != null) {
                    androidx.fragment.app.FragmentActivity requireActivity = com.truecaller.search.global.w.this.requireActivity();
                    java.util.List C = contact.C();
                    com.truecaller.calling.initiate_call.InitiateCallHelper.CallSource callSource = com.truecaller.calling.initiate_call.InitiateCallHelper.CallSource.GLOBAL_SEARCH;
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(C, "numbers");
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter("globalSearchHistory", "analyticsContext");
                    aq2.qux.a(requireActivity, contact, C, true, false, false, false, callSource, "globalSearchHistory", 5120);
                    return false;
                }
                return false;
            }
        }, this.B, this.F);
        this.l = qVar;
        this.m = new ey2.m(qVar);
        this.n = new v00.qux(this.x, this.y.i("HISTORY", (java.lang.String) null), this.z);
        v00.b bVar = new v00.b(this.m, com.truecaller.ads.AdLayoutTypeX.SMALL, new co.n(1 ^ (this.D.e() ? 1 : 0)), this.n);
        qo1.k kVar = this.D;
        ?? barVar = new com.truecaller.ui.bar(bVar);
        barVar.p = kVar;
        barVar.o = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.d(this, 4);
        androidx.recyclerview.widget.RecyclerView findViewById = inflate.findViewById(2131366019);
        this.j = findViewById;
        findViewById.addOnScrollListener(new androidx.recyclerview.widget.RecyclerView.OnScrollListener());
        this.k = (android.widget.TextView) inflate.findViewById(2131364972);
        this.p = barVar;
        this.m.n = new com.truecaller.search.global.s(this);
        this.q.a = this;
        return inflate;
    }

    @Override // com.truecaller.ui.v
    public final void onDestroyView() {
        super.onDestroyView();
        this.q.m1();
    }

    public final void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        this.n.e(!z);
        if (isVisible()) {
            this.n.a();
        }
    }

    public final void onSaveInstanceState(android.os.Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (this.j.getLayoutManager() != null) {
            bundle.putParcelable("STATE_LAYOUT_MANAGER", this.j.getLayoutManager().s0());
        }
    }

    public final void onStart() {
        super.onStart();
        Y4();
    }

    @Override // com.truecaller.ui.v
    public final void onViewCreated(android.view.View view, android.os.Bundle bundle) {
        android.widget.TextView textView;
        super.onViewCreated(view, bundle);
        java.lang.String string = getString(2132018072);
        java.lang.String string2 = getString(2132018073);
        m03.v.i(this.k, string);
        android.view.View view2 = getView();
        if (view2 == null) {
            textView = null;
        } else {
            textView = (android.widget.TextView) view2.findViewById(2131364971);
        }
        m03.v.i(textView, string2);
        android.view.View view3 = getView();
        if (view3 != null) {
        }
        this.j.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(getActivity()));
        this.j.setItemAnimator((androidx.recyclerview.widget.p1) null);
        androidx.recyclerview.widget.z0 z0Var = new androidx.recyclerview.widget.z0(this, 1);
        this.o = z0Var;
        this.l.registerAdapterDataObserver(z0Var);
        this.l.n = new com.google.firebase.crashlytics.internal.concurrency.baz(this, 16);
        this.j.addItemDecoration(new com.truecaller.search.global.o(requireContext()));
        Z4();
    }

    public final java.lang.String p() {
        return "globalSearchHistory";
    }

    public final int z4() {
        return 8;
    }
}
