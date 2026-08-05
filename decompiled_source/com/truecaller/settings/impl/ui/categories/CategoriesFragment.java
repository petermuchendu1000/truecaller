package com.truecaller.settings.impl.ui.categories;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/settings/impl/ui/categories/CategoriesFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "impl_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class CategoriesFragment extends androidx.fragment.app.Fragment implements bd3.qux {
    public yc3.h c;
    public boolean d;
    public volatile yc3.d e;
    public final java.lang.Object f;
    public boolean g;
    public final androidx.lifecycle.o1 h;
    public lz2.a i;
    public u03.f0 j;
    public i.d0 k;
    public id3.d4 l;
    public qw2.u m;
    public qw2.d0 n;
    public final kotlin.Lazy o;
    public final b80.f p;

    public CategoriesFragment() {
        super(2131559137);
        final int i = 0;
        this.d = false;
        this.f = new java.lang.Object();
        this.g = false;
        kotlin.Lazy lazy = kotlin.LazyKt.lazy(kotlin.k.c, new xr2.j(new u91.b(this, 29), 0));
        this.h = new androidx.lifecycle.o1(kotlin.jvm.internal.k0.a.getOrCreateKotlinClass(xr2.c0.class), new tf1.qux(lazy, 24), new sz1.b(21, this, lazy), new tf1.qux(lazy, 25));
        this.o = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0(this) { // from class: xr2.e
            public final /* synthetic */ com.truecaller.settings.impl.ui.categories.CategoriesFragment b;

            {
                this.b = this;
            }

            public final java.lang.Object invoke() {
                switch (i) {
                    case 0:
                        u03.f0 f0Var = this.b.j;
                        if (f0Var != null) {
                            return new w31.c(f0Var, 0);
                        }
                        kotlin.jvm.internal.Intrinsics.n("resourceProvider");
                        throw null;
                    default:
                        android.content.Context requireContext = this.b.requireContext();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                        i61.bar.t(requireContext, "https://support.truecaller.com/support/solutions/articles/81000401463-caller-id-and-spam-protection");
                        return kotlin.Unit.a;
                }
            }
        });
        this.p = new b80.f(this, 5);
    }

    public final id3.d4 R4() {
        id3.d4 d4Var = this.l;
        if (d4Var != null) {
            return d4Var;
        }
        kotlin.jvm.internal.Intrinsics.n("categoriesAnalyticsHelper");
        throw null;
    }

    public final xr2.c0 S4() {
        return (xr2.c0) this.h.getValue();
    }

    public final void T4() {
        if (this.c == null) {
            this.c = new yc3.h(super.getContext(), this);
            this.d = cu0.j1.x(super.getContext());
        }
    }

    public final void U4() {
        if (!this.g) {
            this.g = true;
            tx.w wVar = ((xr2.x) X3()).f;
            tx.c0 c0Var = wVar.b;
            this.i = (lz2.a) c0Var.b7.get();
            this.j = (u03.f0) wVar.q9.get();
            this.k = c0Var.f1();
            tx.w wVar2 = c0Var.a;
            this.l = new id3.d4((nc0.bar) wVar2.Y.get(), (qw2.u) wVar2.L6.get(), (u03.z) wVar2.M.get(), (t41.r0) wVar2.p3.get(), (u03.b) wVar2.O.get());
            this.m = (qw2.u) wVar.L6.get();
            this.n = (qw2.d0) wVar.l5.get();
        }
    }

    @Override // bd3.baz
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
        T4();
        return this.c;
    }

    public final androidx.lifecycle.q1 getDefaultViewModelProviderFactory() {
        return bf0.s2.J(this, super.getDefaultViewModelProviderFactory());
    }

    public final void onAttach(android.content.Context context) {
        super.onAttach(context);
        T4();
        U4();
    }

    public final android.view.LayoutInflater onGetLayoutInflater(android.os.Bundle bundle) {
        android.view.LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new yc3.h(onGetLayoutInflater, this));
    }

    public final void onResume() {
        u6.c2 a2Var;
        super.onResume();
        android.view.Window window = requireActivity().getWindow();
        dx2.bar barVar = dx2.bar.a;
        boolean d = dx2.bar.d();
        po1.baz bazVar = new po1.baz(window.getDecorView());
        int i = android.os.Build.VERSION.SDK_INT;
        if (i >= 35) {
            a2Var = new u6.c2(window, bazVar);
        } else if (i >= 30) {
            a2Var = new u6.c2(window, bazVar);
        } else if (i >= 26) {
            a2Var = new u6.a2(window, bazVar);
        } else {
            a2Var = new u6.a2(window, bazVar);
        }
        a2Var.O(!d);
        xr2.c0 S4 = S4();
        u03.f0 f0Var = this.j;
        if (f0Var != null) {
            S4.getClass();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(f0Var, "resourceProvider");
            fg3.h0.J(androidx.lifecycle.g1.l(S4), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new nc0.x0(S4, f0Var, (df3.bar) null), 3);
            return;
        }
        kotlin.jvm.internal.Intrinsics.n("resourceProvider");
        throw null;
    }

    public final void onViewCreated(android.view.View view, android.os.Bundle bundle) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        int i = 2131364784;
        android.widget.TextView textView = (android.widget.TextView) df0.qux.o(2131364784, view);
        if (textView != null) {
            i = 2131364785;
            android.widget.TextView textView2 = (android.widget.TextView) df0.qux.o(2131364785, view);
            if (textView2 != null) {
                i = 2131364786;
                android.view.View o = df0.qux.o(2131364786, view);
                if (o != null) {
                    d91.w a = d91.w.a(o);
                    i = 2131364787;
                    androidx.compose.ui.platform.ComposeView o2 = df0.qux.o(2131364787, view);
                    if (o2 != null) {
                        i = 2131364788;
                        android.widget.TextView textView3 = (android.widget.TextView) df0.qux.o(2131364788, view);
                        if (textView3 != null) {
                            i = 2131364789;
                            android.view.View o3 = df0.qux.o(2131364789, view);
                            if (o3 != null) {
                                d91.w.a(o3);
                                i = 2131364790;
                                android.widget.TextView textView4 = (android.widget.TextView) df0.qux.o(2131364790, view);
                                if (textView4 != null) {
                                    i = 2131364791;
                                    android.view.View o4 = df0.qux.o(2131364791, view);
                                    if (o4 != null) {
                                        d91.w.a(o4);
                                        i = 2131364793;
                                        android.widget.TextView textView5 = (android.widget.TextView) df0.qux.o(2131364793, view);
                                        if (textView5 != null) {
                                            i = 2131364794;
                                            android.widget.TextView textView6 = (android.widget.TextView) df0.qux.o(2131364794, view);
                                            if (textView6 != null) {
                                                i = 2131364795;
                                                android.view.View o5 = df0.qux.o(2131364795, view);
                                                if (o5 != null) {
                                                    d91.w.a(o5);
                                                    i = 2131364796;
                                                    android.widget.TextView textView7 = (android.widget.TextView) df0.qux.o(2131364796, view);
                                                    if (textView7 != null) {
                                                        i = 2131364797;
                                                        android.view.View o6 = df0.qux.o(2131364797, view);
                                                        if (o6 != null) {
                                                            d91.w.a(o6);
                                                            i = 2131364799;
                                                            android.widget.TextView textView8 = (android.widget.TextView) df0.qux.o(2131364799, view);
                                                            if (textView8 != null) {
                                                                i = 2131364800;
                                                                android.view.View o7 = df0.qux.o(2131364800, view);
                                                                if (o7 != null) {
                                                                    d91.w.a(o7);
                                                                    i = 2131364801;
                                                                    android.widget.TextView textView9 = (android.widget.TextView) df0.qux.o(2131364801, view);
                                                                    if (textView9 != null) {
                                                                        i = 2131364802;
                                                                        android.view.View o8 = df0.qux.o(2131364802, view);
                                                                        if (o8 != null) {
                                                                            d91.w a2 = d91.w.a(o8);
                                                                            i = 2131364803;
                                                                            android.widget.TextView textView10 = (android.widget.TextView) df0.qux.o(2131364803, view);
                                                                            if (textView10 != null) {
                                                                                i = 2131364804;
                                                                                android.view.View o9 = df0.qux.o(2131364804, view);
                                                                                if (o9 != null) {
                                                                                    d91.w.a(o9);
                                                                                    i = 2131364805;
                                                                                    androidx.constraintlayout.widget.ConstraintLayout o10 = df0.qux.o(2131364805, view);
                                                                                    if (o10 != null) {
                                                                                        int i2 = 2131362381;
                                                                                        com.truecaller.common.ui.avatar.AvatarXView o11 = df0.qux.o(2131362381, o10);
                                                                                        if (o11 != null) {
                                                                                            i2 = 2131362410;
                                                                                            androidx.appcompat.widget.AppCompatImageView o12 = df0.qux.o(2131362410, o10);
                                                                                            if (o12 != null) {
                                                                                                i2 = 2131366692;
                                                                                                androidx.appcompat.widget.AppCompatTextView o14 = df0.qux.o(2131366692, o10);
                                                                                                if (o14 != null) {
                                                                                                    i2 = 2131367033;
                                                                                                    androidx.appcompat.widget.AppCompatTextView o15 = df0.qux.o(2131367033, o10);
                                                                                                    if (o15 != null) {
                                                                                                        androidx.constraintlayout.widget.ConstraintLayout constraintLayout = o10;
                                                                                                        d91.n0 n0Var = new d91.n0(constraintLayout, o11, o12, o14, o15, 14);
                                                                                                        int i3 = 2131364808;
                                                                                                        android.widget.TextView textView11 = (android.widget.TextView) df0.qux.o(2131364808, view);
                                                                                                        if (textView11 != null) {
                                                                                                            i3 = 2131364809;
                                                                                                            android.view.View o16 = df0.qux.o(2131364809, view);
                                                                                                            if (o16 != null) {
                                                                                                                wq2.baz bazVar = new wq2.baz((android.widget.ScrollView) view, textView, textView2, a, o2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, a2, textView10, n0Var, textView11, d91.w.a(o16));
                                                                                                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bazVar, "bind(...)");
                                                                                                                androidx.appcompat.app.AppCompatActivity requireActivity = requireActivity();
                                                                                                                kotlin.jvm.internal.Intrinsics.e(requireActivity, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
                                                                                                                i.baz supportActionBar = requireActivity.getSupportActionBar();
                                                                                                                if (supportActionBar != null) {
                                                                                                                    supportActionBar.B(getString(2132021630));
                                                                                                                    androidx.fragment.app.FragmentActivity requireActivity2 = requireActivity();
                                                                                                                    androidx.lifecycle.d0 viewLifecycleOwner = getViewLifecycleOwner();
                                                                                                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                                                                                                                    requireActivity2.addMenuProvider(this.p, viewLifecycleOwner, androidx.lifecycle.s.e);
                                                                                                                    final int i4 = 0;
                                                                                                                    pe0.j.s(this, S4().m, new xr2.g(bazVar, this, i4));
                                                                                                                    pe0.j.u(this, S4().q, new xr2.g(bazVar, this, 1));
                                                                                                                    final int i5 = 2;
                                                                                                                    pe0.j.u(this, S4().s, new xr2.g(bazVar, this, i5));
                                                                                                                    constraintLayout.setOnClickListener(new android.view.View.OnClickListener(this) { // from class: xr2.d
                                                                                                                        public final /* synthetic */ com.truecaller.settings.impl.ui.categories.CategoriesFragment b;

                                                                                                                        {
                                                                                                                            this.b = this;
                                                                                                                        }

                                                                                                                        @Override // android.view.View.OnClickListener
                                                                                                                        public final void onClick(android.view.View view2) {
                                                                                                                            switch (i4) {
                                                                                                                                case 0:
                                                                                                                                    xr2.c0 S4 = this.b.S4();
                                                                                                                                    S4.getClass();
                                                                                                                                    fg3.h0.J(androidx.lifecycle.g1.l(S4), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new xr2.b0(S4, null, 1), 3);
                                                                                                                                    return;
                                                                                                                                case 1:
                                                                                                                                    xr2.c0 S42 = this.b.S4();
                                                                                                                                    S42.getClass();
                                                                                                                                    S42.p(xr2.y0.b);
                                                                                                                                    return;
                                                                                                                                case 2:
                                                                                                                                    xr2.c0 S43 = this.b.S4();
                                                                                                                                    S43.getClass();
                                                                                                                                    S43.p(xr2.q0.b);
                                                                                                                                    return;
                                                                                                                                case 3:
                                                                                                                                    xr2.c0 S44 = this.b.S4();
                                                                                                                                    S44.getClass();
                                                                                                                                    S44.p(xr2.t0.b);
                                                                                                                                    return;
                                                                                                                                case 4:
                                                                                                                                    xr2.c0 S45 = this.b.S4();
                                                                                                                                    S45.getClass();
                                                                                                                                    S45.p(xr2.p0.b);
                                                                                                                                    return;
                                                                                                                                case 5:
                                                                                                                                    xr2.c0 S46 = this.b.S4();
                                                                                                                                    S46.getClass();
                                                                                                                                    S46.p(xr2.z0.b);
                                                                                                                                    return;
                                                                                                                                case 6:
                                                                                                                                    xr2.c0 S47 = this.b.S4();
                                                                                                                                    S47.getClass();
                                                                                                                                    S47.p(xr2.v0.b);
                                                                                                                                    return;
                                                                                                                                case 7:
                                                                                                                                    xr2.c0 S48 = this.b.S4();
                                                                                                                                    S48.getClass();
                                                                                                                                    fg3.h0.J(androidx.lifecycle.g1.l(S48), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new xr2.b0(S48, null, 0), 3);
                                                                                                                                    return;
                                                                                                                                case 8:
                                                                                                                                    xr2.c0 S49 = this.b.S4();
                                                                                                                                    S49.getClass();
                                                                                                                                    S49.p(xr2.u0.b);
                                                                                                                                    return;
                                                                                                                                case 9:
                                                                                                                                    xr2.c0 S410 = this.b.S4();
                                                                                                                                    S410.getClass();
                                                                                                                                    S410.p(xr2.s0.b);
                                                                                                                                    return;
                                                                                                                                case 10:
                                                                                                                                    xr2.c0 S411 = this.b.S4();
                                                                                                                                    S411.getClass();
                                                                                                                                    S411.p(xr2.w0.b);
                                                                                                                                    return;
                                                                                                                                case 11:
                                                                                                                                    xr2.c0 S412 = this.b.S4();
                                                                                                                                    S412.getClass();
                                                                                                                                    S412.p(xr2.r0.b);
                                                                                                                                    return;
                                                                                                                                default:
                                                                                                                                    xr2.c0 S413 = this.b.S4();
                                                                                                                                    S413.getClass();
                                                                                                                                    S413.p(xr2.x0.b);
                                                                                                                                    return;
                                                                                                                            }
                                                                                                                        }
                                                                                                                    });
                                                                                                                    final int i6 = 7;
                                                                                                                    o11.setOnClickListener(new android.view.View.OnClickListener(this) { // from class: xr2.d
                                                                                                                        public final /* synthetic */ com.truecaller.settings.impl.ui.categories.CategoriesFragment b;

                                                                                                                        {
                                                                                                                            this.b = this;
                                                                                                                        }

                                                                                                                        @Override // android.view.View.OnClickListener
                                                                                                                        public final void onClick(android.view.View view2) {
                                                                                                                            switch (i6) {
                                                                                                                                case 0:
                                                                                                                                    xr2.c0 S4 = this.b.S4();
                                                                                                                                    S4.getClass();
                                                                                                                                    fg3.h0.J(androidx.lifecycle.g1.l(S4), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new xr2.b0(S4, null, 1), 3);
                                                                                                                                    return;
                                                                                                                                case 1:
                                                                                                                                    xr2.c0 S42 = this.b.S4();
                                                                                                                                    S42.getClass();
                                                                                                                                    S42.p(xr2.y0.b);
                                                                                                                                    return;
                                                                                                                                case 2:
                                                                                                                                    xr2.c0 S43 = this.b.S4();
                                                                                                                                    S43.getClass();
                                                                                                                                    S43.p(xr2.q0.b);
                                                                                                                                    return;
                                                                                                                                case 3:
                                                                                                                                    xr2.c0 S44 = this.b.S4();
                                                                                                                                    S44.getClass();
                                                                                                                                    S44.p(xr2.t0.b);
                                                                                                                                    return;
                                                                                                                                case 4:
                                                                                                                                    xr2.c0 S45 = this.b.S4();
                                                                                                                                    S45.getClass();
                                                                                                                                    S45.p(xr2.p0.b);
                                                                                                                                    return;
                                                                                                                                case 5:
                                                                                                                                    xr2.c0 S46 = this.b.S4();
                                                                                                                                    S46.getClass();
                                                                                                                                    S46.p(xr2.z0.b);
                                                                                                                                    return;
                                                                                                                                case 6:
                                                                                                                                    xr2.c0 S47 = this.b.S4();
                                                                                                                                    S47.getClass();
                                                                                                                                    S47.p(xr2.v0.b);
                                                                                                                                    return;
                                                                                                                                case 7:
                                                                                                                                    xr2.c0 S48 = this.b.S4();
                                                                                                                                    S48.getClass();
                                                                                                                                    fg3.h0.J(androidx.lifecycle.g1.l(S48), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new xr2.b0(S48, null, 0), 3);
                                                                                                                                    return;
                                                                                                                                case 8:
                                                                                                                                    xr2.c0 S49 = this.b.S4();
                                                                                                                                    S49.getClass();
                                                                                                                                    S49.p(xr2.u0.b);
                                                                                                                                    return;
                                                                                                                                case 9:
                                                                                                                                    xr2.c0 S410 = this.b.S4();
                                                                                                                                    S410.getClass();
                                                                                                                                    S410.p(xr2.s0.b);
                                                                                                                                    return;
                                                                                                                                case 10:
                                                                                                                                    xr2.c0 S411 = this.b.S4();
                                                                                                                                    S411.getClass();
                                                                                                                                    S411.p(xr2.w0.b);
                                                                                                                                    return;
                                                                                                                                case 11:
                                                                                                                                    xr2.c0 S412 = this.b.S4();
                                                                                                                                    S412.getClass();
                                                                                                                                    S412.p(xr2.r0.b);
                                                                                                                                    return;
                                                                                                                                default:
                                                                                                                                    xr2.c0 S413 = this.b.S4();
                                                                                                                                    S413.getClass();
                                                                                                                                    S413.p(xr2.x0.b);
                                                                                                                                    return;
                                                                                                                            }
                                                                                                                        }
                                                                                                                    });
                                                                                                                    final int i7 = 8;
                                                                                                                    textView6.setOnClickListener(new android.view.View.OnClickListener(this) { // from class: xr2.d
                                                                                                                        public final /* synthetic */ com.truecaller.settings.impl.ui.categories.CategoriesFragment b;

                                                                                                                        {
                                                                                                                            this.b = this;
                                                                                                                        }

                                                                                                                        @Override // android.view.View.OnClickListener
                                                                                                                        public final void onClick(android.view.View view2) {
                                                                                                                            switch (i7) {
                                                                                                                                case 0:
                                                                                                                                    xr2.c0 S4 = this.b.S4();
                                                                                                                                    S4.getClass();
                                                                                                                                    fg3.h0.J(androidx.lifecycle.g1.l(S4), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new xr2.b0(S4, null, 1), 3);
                                                                                                                                    return;
                                                                                                                                case 1:
                                                                                                                                    xr2.c0 S42 = this.b.S4();
                                                                                                                                    S42.getClass();
                                                                                                                                    S42.p(xr2.y0.b);
                                                                                                                                    return;
                                                                                                                                case 2:
                                                                                                                                    xr2.c0 S43 = this.b.S4();
                                                                                                                                    S43.getClass();
                                                                                                                                    S43.p(xr2.q0.b);
                                                                                                                                    return;
                                                                                                                                case 3:
                                                                                                                                    xr2.c0 S44 = this.b.S4();
                                                                                                                                    S44.getClass();
                                                                                                                                    S44.p(xr2.t0.b);
                                                                                                                                    return;
                                                                                                                                case 4:
                                                                                                                                    xr2.c0 S45 = this.b.S4();
                                                                                                                                    S45.getClass();
                                                                                                                                    S45.p(xr2.p0.b);
                                                                                                                                    return;
                                                                                                                                case 5:
                                                                                                                                    xr2.c0 S46 = this.b.S4();
                                                                                                                                    S46.getClass();
                                                                                                                                    S46.p(xr2.z0.b);
                                                                                                                                    return;
                                                                                                                                case 6:
                                                                                                                                    xr2.c0 S47 = this.b.S4();
                                                                                                                                    S47.getClass();
                                                                                                                                    S47.p(xr2.v0.b);
                                                                                                                                    return;
                                                                                                                                case 7:
                                                                                                                                    xr2.c0 S48 = this.b.S4();
                                                                                                                                    S48.getClass();
                                                                                                                                    fg3.h0.J(androidx.lifecycle.g1.l(S48), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new xr2.b0(S48, null, 0), 3);
                                                                                                                                    return;
                                                                                                                                case 8:
                                                                                                                                    xr2.c0 S49 = this.b.S4();
                                                                                                                                    S49.getClass();
                                                                                                                                    S49.p(xr2.u0.b);
                                                                                                                                    return;
                                                                                                                                case 9:
                                                                                                                                    xr2.c0 S410 = this.b.S4();
                                                                                                                                    S410.getClass();
                                                                                                                                    S410.p(xr2.s0.b);
                                                                                                                                    return;
                                                                                                                                case 10:
                                                                                                                                    xr2.c0 S411 = this.b.S4();
                                                                                                                                    S411.getClass();
                                                                                                                                    S411.p(xr2.w0.b);
                                                                                                                                    return;
                                                                                                                                case 11:
                                                                                                                                    xr2.c0 S412 = this.b.S4();
                                                                                                                                    S412.getClass();
                                                                                                                                    S412.p(xr2.r0.b);
                                                                                                                                    return;
                                                                                                                                default:
                                                                                                                                    xr2.c0 S413 = this.b.S4();
                                                                                                                                    S413.getClass();
                                                                                                                                    S413.p(xr2.x0.b);
                                                                                                                                    return;
                                                                                                                            }
                                                                                                                        }
                                                                                                                    });
                                                                                                                    final int i8 = 9;
                                                                                                                    textView4.setOnClickListener(new android.view.View.OnClickListener(this) { // from class: xr2.d
                                                                                                                        public final /* synthetic */ com.truecaller.settings.impl.ui.categories.CategoriesFragment b;

                                                                                                                        {
                                                                                                                            this.b = this;
                                                                                                                        }

                                                                                                                        @Override // android.view.View.OnClickListener
                                                                                                                        public final void onClick(android.view.View view2) {
                                                                                                                            switch (i8) {
                                                                                                                                case 0:
                                                                                                                                    xr2.c0 S4 = this.b.S4();
                                                                                                                                    S4.getClass();
                                                                                                                                    fg3.h0.J(androidx.lifecycle.g1.l(S4), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new xr2.b0(S4, null, 1), 3);
                                                                                                                                    return;
                                                                                                                                case 1:
                                                                                                                                    xr2.c0 S42 = this.b.S4();
                                                                                                                                    S42.getClass();
                                                                                                                                    S42.p(xr2.y0.b);
                                                                                                                                    return;
                                                                                                                                case 2:
                                                                                                                                    xr2.c0 S43 = this.b.S4();
                                                                                                                                    S43.getClass();
                                                                                                                                    S43.p(xr2.q0.b);
                                                                                                                                    return;
                                                                                                                                case 3:
                                                                                                                                    xr2.c0 S44 = this.b.S4();
                                                                                                                                    S44.getClass();
                                                                                                                                    S44.p(xr2.t0.b);
                                                                                                                                    return;
                                                                                                                                case 4:
                                                                                                                                    xr2.c0 S45 = this.b.S4();
                                                                                                                                    S45.getClass();
                                                                                                                                    S45.p(xr2.p0.b);
                                                                                                                                    return;
                                                                                                                                case 5:
                                                                                                                                    xr2.c0 S46 = this.b.S4();
                                                                                                                                    S46.getClass();
                                                                                                                                    S46.p(xr2.z0.b);
                                                                                                                                    return;
                                                                                                                                case 6:
                                                                                                                                    xr2.c0 S47 = this.b.S4();
                                                                                                                                    S47.getClass();
                                                                                                                                    S47.p(xr2.v0.b);
                                                                                                                                    return;
                                                                                                                                case 7:
                                                                                                                                    xr2.c0 S48 = this.b.S4();
                                                                                                                                    S48.getClass();
                                                                                                                                    fg3.h0.J(androidx.lifecycle.g1.l(S48), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new xr2.b0(S48, null, 0), 3);
                                                                                                                                    return;
                                                                                                                                case 8:
                                                                                                                                    xr2.c0 S49 = this.b.S4();
                                                                                                                                    S49.getClass();
                                                                                                                                    S49.p(xr2.u0.b);
                                                                                                                                    return;
                                                                                                                                case 9:
                                                                                                                                    xr2.c0 S410 = this.b.S4();
                                                                                                                                    S410.getClass();
                                                                                                                                    S410.p(xr2.s0.b);
                                                                                                                                    return;
                                                                                                                                case 10:
                                                                                                                                    xr2.c0 S411 = this.b.S4();
                                                                                                                                    S411.getClass();
                                                                                                                                    S411.p(xr2.w0.b);
                                                                                                                                    return;
                                                                                                                                case 11:
                                                                                                                                    xr2.c0 S412 = this.b.S4();
                                                                                                                                    S412.getClass();
                                                                                                                                    S412.p(xr2.r0.b);
                                                                                                                                    return;
                                                                                                                                default:
                                                                                                                                    xr2.c0 S413 = this.b.S4();
                                                                                                                                    S413.getClass();
                                                                                                                                    S413.p(xr2.x0.b);
                                                                                                                                    return;
                                                                                                                            }
                                                                                                                        }
                                                                                                                    });
                                                                                                                    final int i9 = 10;
                                                                                                                    textView8.setOnClickListener(new android.view.View.OnClickListener(this) { // from class: xr2.d
                                                                                                                        public final /* synthetic */ com.truecaller.settings.impl.ui.categories.CategoriesFragment b;

                                                                                                                        {
                                                                                                                            this.b = this;
                                                                                                                        }

                                                                                                                        @Override // android.view.View.OnClickListener
                                                                                                                        public final void onClick(android.view.View view2) {
                                                                                                                            switch (i9) {
                                                                                                                                case 0:
                                                                                                                                    xr2.c0 S4 = this.b.S4();
                                                                                                                                    S4.getClass();
                                                                                                                                    fg3.h0.J(androidx.lifecycle.g1.l(S4), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new xr2.b0(S4, null, 1), 3);
                                                                                                                                    return;
                                                                                                                                case 1:
                                                                                                                                    xr2.c0 S42 = this.b.S4();
                                                                                                                                    S42.getClass();
                                                                                                                                    S42.p(xr2.y0.b);
                                                                                                                                    return;
                                                                                                                                case 2:
                                                                                                                                    xr2.c0 S43 = this.b.S4();
                                                                                                                                    S43.getClass();
                                                                                                                                    S43.p(xr2.q0.b);
                                                                                                                                    return;
                                                                                                                                case 3:
                                                                                                                                    xr2.c0 S44 = this.b.S4();
                                                                                                                                    S44.getClass();
                                                                                                                                    S44.p(xr2.t0.b);
                                                                                                                                    return;
                                                                                                                                case 4:
                                                                                                                                    xr2.c0 S45 = this.b.S4();
                                                                                                                                    S45.getClass();
                                                                                                                                    S45.p(xr2.p0.b);
                                                                                                                                    return;
                                                                                                                                case 5:
                                                                                                                                    xr2.c0 S46 = this.b.S4();
                                                                                                                                    S46.getClass();
                                                                                                                                    S46.p(xr2.z0.b);
                                                                                                                                    return;
                                                                                                                                case 6:
                                                                                                                                    xr2.c0 S47 = this.b.S4();
                                                                                                                                    S47.getClass();
                                                                                                                                    S47.p(xr2.v0.b);
                                                                                                                                    return;
                                                                                                                                case 7:
                                                                                                                                    xr2.c0 S48 = this.b.S4();
                                                                                                                                    S48.getClass();
                                                                                                                                    fg3.h0.J(androidx.lifecycle.g1.l(S48), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new xr2.b0(S48, null, 0), 3);
                                                                                                                                    return;
                                                                                                                                case 8:
                                                                                                                                    xr2.c0 S49 = this.b.S4();
                                                                                                                                    S49.getClass();
                                                                                                                                    S49.p(xr2.u0.b);
                                                                                                                                    return;
                                                                                                                                case 9:
                                                                                                                                    xr2.c0 S410 = this.b.S4();
                                                                                                                                    S410.getClass();
                                                                                                                                    S410.p(xr2.s0.b);
                                                                                                                                    return;
                                                                                                                                case 10:
                                                                                                                                    xr2.c0 S411 = this.b.S4();
                                                                                                                                    S411.getClass();
                                                                                                                                    S411.p(xr2.w0.b);
                                                                                                                                    return;
                                                                                                                                case 11:
                                                                                                                                    xr2.c0 S412 = this.b.S4();
                                                                                                                                    S412.getClass();
                                                                                                                                    S412.p(xr2.r0.b);
                                                                                                                                    return;
                                                                                                                                default:
                                                                                                                                    xr2.c0 S413 = this.b.S4();
                                                                                                                                    S413.getClass();
                                                                                                                                    S413.p(xr2.x0.b);
                                                                                                                                    return;
                                                                                                                            }
                                                                                                                        }
                                                                                                                    });
                                                                                                                    final int i10 = 11;
                                                                                                                    textView2.setOnClickListener(new android.view.View.OnClickListener(this) { // from class: xr2.d
                                                                                                                        public final /* synthetic */ com.truecaller.settings.impl.ui.categories.CategoriesFragment b;

                                                                                                                        {
                                                                                                                            this.b = this;
                                                                                                                        }

                                                                                                                        @Override // android.view.View.OnClickListener
                                                                                                                        public final void onClick(android.view.View view2) {
                                                                                                                            switch (i10) {
                                                                                                                                case 0:
                                                                                                                                    xr2.c0 S4 = this.b.S4();
                                                                                                                                    S4.getClass();
                                                                                                                                    fg3.h0.J(androidx.lifecycle.g1.l(S4), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new xr2.b0(S4, null, 1), 3);
                                                                                                                                    return;
                                                                                                                                case 1:
                                                                                                                                    xr2.c0 S42 = this.b.S4();
                                                                                                                                    S42.getClass();
                                                                                                                                    S42.p(xr2.y0.b);
                                                                                                                                    return;
                                                                                                                                case 2:
                                                                                                                                    xr2.c0 S43 = this.b.S4();
                                                                                                                                    S43.getClass();
                                                                                                                                    S43.p(xr2.q0.b);
                                                                                                                                    return;
                                                                                                                                case 3:
                                                                                                                                    xr2.c0 S44 = this.b.S4();
                                                                                                                                    S44.getClass();
                                                                                                                                    S44.p(xr2.t0.b);
                                                                                                                                    return;
                                                                                                                                case 4:
                                                                                                                                    xr2.c0 S45 = this.b.S4();
                                                                                                                                    S45.getClass();
                                                                                                                                    S45.p(xr2.p0.b);
                                                                                                                                    return;
                                                                                                                                case 5:
                                                                                                                                    xr2.c0 S46 = this.b.S4();
                                                                                                                                    S46.getClass();
                                                                                                                                    S46.p(xr2.z0.b);
                                                                                                                                    return;
                                                                                                                                case 6:
                                                                                                                                    xr2.c0 S47 = this.b.S4();
                                                                                                                                    S47.getClass();
                                                                                                                                    S47.p(xr2.v0.b);
                                                                                                                                    return;
                                                                                                                                case 7:
                                                                                                                                    xr2.c0 S48 = this.b.S4();
                                                                                                                                    S48.getClass();
                                                                                                                                    fg3.h0.J(androidx.lifecycle.g1.l(S48), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new xr2.b0(S48, null, 0), 3);
                                                                                                                                    return;
                                                                                                                                case 8:
                                                                                                                                    xr2.c0 S49 = this.b.S4();
                                                                                                                                    S49.getClass();
                                                                                                                                    S49.p(xr2.u0.b);
                                                                                                                                    return;
                                                                                                                                case 9:
                                                                                                                                    xr2.c0 S410 = this.b.S4();
                                                                                                                                    S410.getClass();
                                                                                                                                    S410.p(xr2.s0.b);
                                                                                                                                    return;
                                                                                                                                case 10:
                                                                                                                                    xr2.c0 S411 = this.b.S4();
                                                                                                                                    S411.getClass();
                                                                                                                                    S411.p(xr2.w0.b);
                                                                                                                                    return;
                                                                                                                                case 11:
                                                                                                                                    xr2.c0 S412 = this.b.S4();
                                                                                                                                    S412.getClass();
                                                                                                                                    S412.p(xr2.r0.b);
                                                                                                                                    return;
                                                                                                                                default:
                                                                                                                                    xr2.c0 S413 = this.b.S4();
                                                                                                                                    S413.getClass();
                                                                                                                                    S413.p(xr2.x0.b);
                                                                                                                                    return;
                                                                                                                            }
                                                                                                                        }
                                                                                                                    });
                                                                                                                    final int i11 = 12;
                                                                                                                    textView9.setOnClickListener(new android.view.View.OnClickListener(this) { // from class: xr2.d
                                                                                                                        public final /* synthetic */ com.truecaller.settings.impl.ui.categories.CategoriesFragment b;

                                                                                                                        {
                                                                                                                            this.b = this;
                                                                                                                        }

                                                                                                                        @Override // android.view.View.OnClickListener
                                                                                                                        public final void onClick(android.view.View view2) {
                                                                                                                            switch (i11) {
                                                                                                                                case 0:
                                                                                                                                    xr2.c0 S4 = this.b.S4();
                                                                                                                                    S4.getClass();
                                                                                                                                    fg3.h0.J(androidx.lifecycle.g1.l(S4), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new xr2.b0(S4, null, 1), 3);
                                                                                                                                    return;
                                                                                                                                case 1:
                                                                                                                                    xr2.c0 S42 = this.b.S4();
                                                                                                                                    S42.getClass();
                                                                                                                                    S42.p(xr2.y0.b);
                                                                                                                                    return;
                                                                                                                                case 2:
                                                                                                                                    xr2.c0 S43 = this.b.S4();
                                                                                                                                    S43.getClass();
                                                                                                                                    S43.p(xr2.q0.b);
                                                                                                                                    return;
                                                                                                                                case 3:
                                                                                                                                    xr2.c0 S44 = this.b.S4();
                                                                                                                                    S44.getClass();
                                                                                                                                    S44.p(xr2.t0.b);
                                                                                                                                    return;
                                                                                                                                case 4:
                                                                                                                                    xr2.c0 S45 = this.b.S4();
                                                                                                                                    S45.getClass();
                                                                                                                                    S45.p(xr2.p0.b);
                                                                                                                                    return;
                                                                                                                                case 5:
                                                                                                                                    xr2.c0 S46 = this.b.S4();
                                                                                                                                    S46.getClass();
                                                                                                                                    S46.p(xr2.z0.b);
                                                                                                                                    return;
                                                                                                                                case 6:
                                                                                                                                    xr2.c0 S47 = this.b.S4();
                                                                                                                                    S47.getClass();
                                                                                                                                    S47.p(xr2.v0.b);
                                                                                                                                    return;
                                                                                                                                case 7:
                                                                                                                                    xr2.c0 S48 = this.b.S4();
                                                                                                                                    S48.getClass();
                                                                                                                                    fg3.h0.J(androidx.lifecycle.g1.l(S48), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new xr2.b0(S48, null, 0), 3);
                                                                                                                                    return;
                                                                                                                                case 8:
                                                                                                                                    xr2.c0 S49 = this.b.S4();
                                                                                                                                    S49.getClass();
                                                                                                                                    S49.p(xr2.u0.b);
                                                                                                                                    return;
                                                                                                                                case 9:
                                                                                                                                    xr2.c0 S410 = this.b.S4();
                                                                                                                                    S410.getClass();
                                                                                                                                    S410.p(xr2.s0.b);
                                                                                                                                    return;
                                                                                                                                case 10:
                                                                                                                                    xr2.c0 S411 = this.b.S4();
                                                                                                                                    S411.getClass();
                                                                                                                                    S411.p(xr2.w0.b);
                                                                                                                                    return;
                                                                                                                                case 11:
                                                                                                                                    xr2.c0 S412 = this.b.S4();
                                                                                                                                    S412.getClass();
                                                                                                                                    S412.p(xr2.r0.b);
                                                                                                                                    return;
                                                                                                                                default:
                                                                                                                                    xr2.c0 S413 = this.b.S4();
                                                                                                                                    S413.getClass();
                                                                                                                                    S413.p(xr2.x0.b);
                                                                                                                                    return;
                                                                                                                            }
                                                                                                                        }
                                                                                                                    });
                                                                                                                    final int i12 = 1;
                                                                                                                    textView10.setOnClickListener(new android.view.View.OnClickListener(this) { // from class: xr2.d
                                                                                                                        public final /* synthetic */ com.truecaller.settings.impl.ui.categories.CategoriesFragment b;

                                                                                                                        {
                                                                                                                            this.b = this;
                                                                                                                        }

                                                                                                                        @Override // android.view.View.OnClickListener
                                                                                                                        public final void onClick(android.view.View view2) {
                                                                                                                            switch (i12) {
                                                                                                                                case 0:
                                                                                                                                    xr2.c0 S4 = this.b.S4();
                                                                                                                                    S4.getClass();
                                                                                                                                    fg3.h0.J(androidx.lifecycle.g1.l(S4), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new xr2.b0(S4, null, 1), 3);
                                                                                                                                    return;
                                                                                                                                case 1:
                                                                                                                                    xr2.c0 S42 = this.b.S4();
                                                                                                                                    S42.getClass();
                                                                                                                                    S42.p(xr2.y0.b);
                                                                                                                                    return;
                                                                                                                                case 2:
                                                                                                                                    xr2.c0 S43 = this.b.S4();
                                                                                                                                    S43.getClass();
                                                                                                                                    S43.p(xr2.q0.b);
                                                                                                                                    return;
                                                                                                                                case 3:
                                                                                                                                    xr2.c0 S44 = this.b.S4();
                                                                                                                                    S44.getClass();
                                                                                                                                    S44.p(xr2.t0.b);
                                                                                                                                    return;
                                                                                                                                case 4:
                                                                                                                                    xr2.c0 S45 = this.b.S4();
                                                                                                                                    S45.getClass();
                                                                                                                                    S45.p(xr2.p0.b);
                                                                                                                                    return;
                                                                                                                                case 5:
                                                                                                                                    xr2.c0 S46 = this.b.S4();
                                                                                                                                    S46.getClass();
                                                                                                                                    S46.p(xr2.z0.b);
                                                                                                                                    return;
                                                                                                                                case 6:
                                                                                                                                    xr2.c0 S47 = this.b.S4();
                                                                                                                                    S47.getClass();
                                                                                                                                    S47.p(xr2.v0.b);
                                                                                                                                    return;
                                                                                                                                case 7:
                                                                                                                                    xr2.c0 S48 = this.b.S4();
                                                                                                                                    S48.getClass();
                                                                                                                                    fg3.h0.J(androidx.lifecycle.g1.l(S48), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new xr2.b0(S48, null, 0), 3);
                                                                                                                                    return;
                                                                                                                                case 8:
                                                                                                                                    xr2.c0 S49 = this.b.S4();
                                                                                                                                    S49.getClass();
                                                                                                                                    S49.p(xr2.u0.b);
                                                                                                                                    return;
                                                                                                                                case 9:
                                                                                                                                    xr2.c0 S410 = this.b.S4();
                                                                                                                                    S410.getClass();
                                                                                                                                    S410.p(xr2.s0.b);
                                                                                                                                    return;
                                                                                                                                case 10:
                                                                                                                                    xr2.c0 S411 = this.b.S4();
                                                                                                                                    S411.getClass();
                                                                                                                                    S411.p(xr2.w0.b);
                                                                                                                                    return;
                                                                                                                                case 11:
                                                                                                                                    xr2.c0 S412 = this.b.S4();
                                                                                                                                    S412.getClass();
                                                                                                                                    S412.p(xr2.r0.b);
                                                                                                                                    return;
                                                                                                                                default:
                                                                                                                                    xr2.c0 S413 = this.b.S4();
                                                                                                                                    S413.getClass();
                                                                                                                                    S413.p(xr2.x0.b);
                                                                                                                                    return;
                                                                                                                            }
                                                                                                                        }
                                                                                                                    });
                                                                                                                    textView3.setOnClickListener(new android.view.View.OnClickListener(this) { // from class: xr2.d
                                                                                                                        public final /* synthetic */ com.truecaller.settings.impl.ui.categories.CategoriesFragment b;

                                                                                                                        {
                                                                                                                            this.b = this;
                                                                                                                        }

                                                                                                                        @Override // android.view.View.OnClickListener
                                                                                                                        public final void onClick(android.view.View view2) {
                                                                                                                            switch (i5) {
                                                                                                                                case 0:
                                                                                                                                    xr2.c0 S4 = this.b.S4();
                                                                                                                                    S4.getClass();
                                                                                                                                    fg3.h0.J(androidx.lifecycle.g1.l(S4), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new xr2.b0(S4, null, 1), 3);
                                                                                                                                    return;
                                                                                                                                case 1:
                                                                                                                                    xr2.c0 S42 = this.b.S4();
                                                                                                                                    S42.getClass();
                                                                                                                                    S42.p(xr2.y0.b);
                                                                                                                                    return;
                                                                                                                                case 2:
                                                                                                                                    xr2.c0 S43 = this.b.S4();
                                                                                                                                    S43.getClass();
                                                                                                                                    S43.p(xr2.q0.b);
                                                                                                                                    return;
                                                                                                                                case 3:
                                                                                                                                    xr2.c0 S44 = this.b.S4();
                                                                                                                                    S44.getClass();
                                                                                                                                    S44.p(xr2.t0.b);
                                                                                                                                    return;
                                                                                                                                case 4:
                                                                                                                                    xr2.c0 S45 = this.b.S4();
                                                                                                                                    S45.getClass();
                                                                                                                                    S45.p(xr2.p0.b);
                                                                                                                                    return;
                                                                                                                                case 5:
                                                                                                                                    xr2.c0 S46 = this.b.S4();
                                                                                                                                    S46.getClass();
                                                                                                                                    S46.p(xr2.z0.b);
                                                                                                                                    return;
                                                                                                                                case 6:
                                                                                                                                    xr2.c0 S47 = this.b.S4();
                                                                                                                                    S47.getClass();
                                                                                                                                    S47.p(xr2.v0.b);
                                                                                                                                    return;
                                                                                                                                case 7:
                                                                                                                                    xr2.c0 S48 = this.b.S4();
                                                                                                                                    S48.getClass();
                                                                                                                                    fg3.h0.J(androidx.lifecycle.g1.l(S48), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new xr2.b0(S48, null, 0), 3);
                                                                                                                                    return;
                                                                                                                                case 8:
                                                                                                                                    xr2.c0 S49 = this.b.S4();
                                                                                                                                    S49.getClass();
                                                                                                                                    S49.p(xr2.u0.b);
                                                                                                                                    return;
                                                                                                                                case 9:
                                                                                                                                    xr2.c0 S410 = this.b.S4();
                                                                                                                                    S410.getClass();
                                                                                                                                    S410.p(xr2.s0.b);
                                                                                                                                    return;
                                                                                                                                case 10:
                                                                                                                                    xr2.c0 S411 = this.b.S4();
                                                                                                                                    S411.getClass();
                                                                                                                                    S411.p(xr2.w0.b);
                                                                                                                                    return;
                                                                                                                                case 11:
                                                                                                                                    xr2.c0 S412 = this.b.S4();
                                                                                                                                    S412.getClass();
                                                                                                                                    S412.p(xr2.r0.b);
                                                                                                                                    return;
                                                                                                                                default:
                                                                                                                                    xr2.c0 S413 = this.b.S4();
                                                                                                                                    S413.getClass();
                                                                                                                                    S413.p(xr2.x0.b);
                                                                                                                                    return;
                                                                                                                            }
                                                                                                                        }
                                                                                                                    });
                                                                                                                    final int i14 = 3;
                                                                                                                    textView5.setOnClickListener(new android.view.View.OnClickListener(this) { // from class: xr2.d
                                                                                                                        public final /* synthetic */ com.truecaller.settings.impl.ui.categories.CategoriesFragment b;

                                                                                                                        {
                                                                                                                            this.b = this;
                                                                                                                        }

                                                                                                                        @Override // android.view.View.OnClickListener
                                                                                                                        public final void onClick(android.view.View view2) {
                                                                                                                            switch (i14) {
                                                                                                                                case 0:
                                                                                                                                    xr2.c0 S4 = this.b.S4();
                                                                                                                                    S4.getClass();
                                                                                                                                    fg3.h0.J(androidx.lifecycle.g1.l(S4), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new xr2.b0(S4, null, 1), 3);
                                                                                                                                    return;
                                                                                                                                case 1:
                                                                                                                                    xr2.c0 S42 = this.b.S4();
                                                                                                                                    S42.getClass();
                                                                                                                                    S42.p(xr2.y0.b);
                                                                                                                                    return;
                                                                                                                                case 2:
                                                                                                                                    xr2.c0 S43 = this.b.S4();
                                                                                                                                    S43.getClass();
                                                                                                                                    S43.p(xr2.q0.b);
                                                                                                                                    return;
                                                                                                                                case 3:
                                                                                                                                    xr2.c0 S44 = this.b.S4();
                                                                                                                                    S44.getClass();
                                                                                                                                    S44.p(xr2.t0.b);
                                                                                                                                    return;
                                                                                                                                case 4:
                                                                                                                                    xr2.c0 S45 = this.b.S4();
                                                                                                                                    S45.getClass();
                                                                                                                                    S45.p(xr2.p0.b);
                                                                                                                                    return;
                                                                                                                                case 5:
                                                                                                                                    xr2.c0 S46 = this.b.S4();
                                                                                                                                    S46.getClass();
                                                                                                                                    S46.p(xr2.z0.b);
                                                                                                                                    return;
                                                                                                                                case 6:
                                                                                                                                    xr2.c0 S47 = this.b.S4();
                                                                                                                                    S47.getClass();
                                                                                                                                    S47.p(xr2.v0.b);
                                                                                                                                    return;
                                                                                                                                case 7:
                                                                                                                                    xr2.c0 S48 = this.b.S4();
                                                                                                                                    S48.getClass();
                                                                                                                                    fg3.h0.J(androidx.lifecycle.g1.l(S48), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new xr2.b0(S48, null, 0), 3);
                                                                                                                                    return;
                                                                                                                                case 8:
                                                                                                                                    xr2.c0 S49 = this.b.S4();
                                                                                                                                    S49.getClass();
                                                                                                                                    S49.p(xr2.u0.b);
                                                                                                                                    return;
                                                                                                                                case 9:
                                                                                                                                    xr2.c0 S410 = this.b.S4();
                                                                                                                                    S410.getClass();
                                                                                                                                    S410.p(xr2.s0.b);
                                                                                                                                    return;
                                                                                                                                case 10:
                                                                                                                                    xr2.c0 S411 = this.b.S4();
                                                                                                                                    S411.getClass();
                                                                                                                                    S411.p(xr2.w0.b);
                                                                                                                                    return;
                                                                                                                                case 11:
                                                                                                                                    xr2.c0 S412 = this.b.S4();
                                                                                                                                    S412.getClass();
                                                                                                                                    S412.p(xr2.r0.b);
                                                                                                                                    return;
                                                                                                                                default:
                                                                                                                                    xr2.c0 S413 = this.b.S4();
                                                                                                                                    S413.getClass();
                                                                                                                                    S413.p(xr2.x0.b);
                                                                                                                                    return;
                                                                                                                            }
                                                                                                                        }
                                                                                                                    });
                                                                                                                    final int i15 = 4;
                                                                                                                    textView.setOnClickListener(new android.view.View.OnClickListener(this) { // from class: xr2.d
                                                                                                                        public final /* synthetic */ com.truecaller.settings.impl.ui.categories.CategoriesFragment b;

                                                                                                                        {
                                                                                                                            this.b = this;
                                                                                                                        }

                                                                                                                        @Override // android.view.View.OnClickListener
                                                                                                                        public final void onClick(android.view.View view2) {
                                                                                                                            switch (i15) {
                                                                                                                                case 0:
                                                                                                                                    xr2.c0 S4 = this.b.S4();
                                                                                                                                    S4.getClass();
                                                                                                                                    fg3.h0.J(androidx.lifecycle.g1.l(S4), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new xr2.b0(S4, null, 1), 3);
                                                                                                                                    return;
                                                                                                                                case 1:
                                                                                                                                    xr2.c0 S42 = this.b.S4();
                                                                                                                                    S42.getClass();
                                                                                                                                    S42.p(xr2.y0.b);
                                                                                                                                    return;
                                                                                                                                case 2:
                                                                                                                                    xr2.c0 S43 = this.b.S4();
                                                                                                                                    S43.getClass();
                                                                                                                                    S43.p(xr2.q0.b);
                                                                                                                                    return;
                                                                                                                                case 3:
                                                                                                                                    xr2.c0 S44 = this.b.S4();
                                                                                                                                    S44.getClass();
                                                                                                                                    S44.p(xr2.t0.b);
                                                                                                                                    return;
                                                                                                                                case 4:
                                                                                                                                    xr2.c0 S45 = this.b.S4();
                                                                                                                                    S45.getClass();
                                                                                                                                    S45.p(xr2.p0.b);
                                                                                                                                    return;
                                                                                                                                case 5:
                                                                                                                                    xr2.c0 S46 = this.b.S4();
                                                                                                                                    S46.getClass();
                                                                                                                                    S46.p(xr2.z0.b);
                                                                                                                                    return;
                                                                                                                                case 6:
                                                                                                                                    xr2.c0 S47 = this.b.S4();
                                                                                                                                    S47.getClass();
                                                                                                                                    S47.p(xr2.v0.b);
                                                                                                                                    return;
                                                                                                                                case 7:
                                                                                                                                    xr2.c0 S48 = this.b.S4();
                                                                                                                                    S48.getClass();
                                                                                                                                    fg3.h0.J(androidx.lifecycle.g1.l(S48), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new xr2.b0(S48, null, 0), 3);
                                                                                                                                    return;
                                                                                                                                case 8:
                                                                                                                                    xr2.c0 S49 = this.b.S4();
                                                                                                                                    S49.getClass();
                                                                                                                                    S49.p(xr2.u0.b);
                                                                                                                                    return;
                                                                                                                                case 9:
                                                                                                                                    xr2.c0 S410 = this.b.S4();
                                                                                                                                    S410.getClass();
                                                                                                                                    S410.p(xr2.s0.b);
                                                                                                                                    return;
                                                                                                                                case 10:
                                                                                                                                    xr2.c0 S411 = this.b.S4();
                                                                                                                                    S411.getClass();
                                                                                                                                    S411.p(xr2.w0.b);
                                                                                                                                    return;
                                                                                                                                case 11:
                                                                                                                                    xr2.c0 S412 = this.b.S4();
                                                                                                                                    S412.getClass();
                                                                                                                                    S412.p(xr2.r0.b);
                                                                                                                                    return;
                                                                                                                                default:
                                                                                                                                    xr2.c0 S413 = this.b.S4();
                                                                                                                                    S413.getClass();
                                                                                                                                    S413.p(xr2.x0.b);
                                                                                                                                    return;
                                                                                                                            }
                                                                                                                        }
                                                                                                                    });
                                                                                                                    final int i16 = 5;
                                                                                                                    textView11.setOnClickListener(new android.view.View.OnClickListener(this) { // from class: xr2.d
                                                                                                                        public final /* synthetic */ com.truecaller.settings.impl.ui.categories.CategoriesFragment b;

                                                                                                                        {
                                                                                                                            this.b = this;
                                                                                                                        }

                                                                                                                        @Override // android.view.View.OnClickListener
                                                                                                                        public final void onClick(android.view.View view2) {
                                                                                                                            switch (i16) {
                                                                                                                                case 0:
                                                                                                                                    xr2.c0 S4 = this.b.S4();
                                                                                                                                    S4.getClass();
                                                                                                                                    fg3.h0.J(androidx.lifecycle.g1.l(S4), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new xr2.b0(S4, null, 1), 3);
                                                                                                                                    return;
                                                                                                                                case 1:
                                                                                                                                    xr2.c0 S42 = this.b.S4();
                                                                                                                                    S42.getClass();
                                                                                                                                    S42.p(xr2.y0.b);
                                                                                                                                    return;
                                                                                                                                case 2:
                                                                                                                                    xr2.c0 S43 = this.b.S4();
                                                                                                                                    S43.getClass();
                                                                                                                                    S43.p(xr2.q0.b);
                                                                                                                                    return;
                                                                                                                                case 3:
                                                                                                                                    xr2.c0 S44 = this.b.S4();
                                                                                                                                    S44.getClass();
                                                                                                                                    S44.p(xr2.t0.b);
                                                                                                                                    return;
                                                                                                                                case 4:
                                                                                                                                    xr2.c0 S45 = this.b.S4();
                                                                                                                                    S45.getClass();
                                                                                                                                    S45.p(xr2.p0.b);
                                                                                                                                    return;
                                                                                                                                case 5:
                                                                                                                                    xr2.c0 S46 = this.b.S4();
                                                                                                                                    S46.getClass();
                                                                                                                                    S46.p(xr2.z0.b);
                                                                                                                                    return;
                                                                                                                                case 6:
                                                                                                                                    xr2.c0 S47 = this.b.S4();
                                                                                                                                    S47.getClass();
                                                                                                                                    S47.p(xr2.v0.b);
                                                                                                                                    return;
                                                                                                                                case 7:
                                                                                                                                    xr2.c0 S48 = this.b.S4();
                                                                                                                                    S48.getClass();
                                                                                                                                    fg3.h0.J(androidx.lifecycle.g1.l(S48), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new xr2.b0(S48, null, 0), 3);
                                                                                                                                    return;
                                                                                                                                case 8:
                                                                                                                                    xr2.c0 S49 = this.b.S4();
                                                                                                                                    S49.getClass();
                                                                                                                                    S49.p(xr2.u0.b);
                                                                                                                                    return;
                                                                                                                                case 9:
                                                                                                                                    xr2.c0 S410 = this.b.S4();
                                                                                                                                    S410.getClass();
                                                                                                                                    S410.p(xr2.s0.b);
                                                                                                                                    return;
                                                                                                                                case 10:
                                                                                                                                    xr2.c0 S411 = this.b.S4();
                                                                                                                                    S411.getClass();
                                                                                                                                    S411.p(xr2.w0.b);
                                                                                                                                    return;
                                                                                                                                case 11:
                                                                                                                                    xr2.c0 S412 = this.b.S4();
                                                                                                                                    S412.getClass();
                                                                                                                                    S412.p(xr2.r0.b);
                                                                                                                                    return;
                                                                                                                                default:
                                                                                                                                    xr2.c0 S413 = this.b.S4();
                                                                                                                                    S413.getClass();
                                                                                                                                    S413.p(xr2.x0.b);
                                                                                                                                    return;
                                                                                                                            }
                                                                                                                        }
                                                                                                                    });
                                                                                                                    final int i17 = 6;
                                                                                                                    textView7.setOnClickListener(new android.view.View.OnClickListener(this) { // from class: xr2.d
                                                                                                                        public final /* synthetic */ com.truecaller.settings.impl.ui.categories.CategoriesFragment b;

                                                                                                                        {
                                                                                                                            this.b = this;
                                                                                                                        }

                                                                                                                        @Override // android.view.View.OnClickListener
                                                                                                                        public final void onClick(android.view.View view2) {
                                                                                                                            switch (i17) {
                                                                                                                                case 0:
                                                                                                                                    xr2.c0 S4 = this.b.S4();
                                                                                                                                    S4.getClass();
                                                                                                                                    fg3.h0.J(androidx.lifecycle.g1.l(S4), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new xr2.b0(S4, null, 1), 3);
                                                                                                                                    return;
                                                                                                                                case 1:
                                                                                                                                    xr2.c0 S42 = this.b.S4();
                                                                                                                                    S42.getClass();
                                                                                                                                    S42.p(xr2.y0.b);
                                                                                                                                    return;
                                                                                                                                case 2:
                                                                                                                                    xr2.c0 S43 = this.b.S4();
                                                                                                                                    S43.getClass();
                                                                                                                                    S43.p(xr2.q0.b);
                                                                                                                                    return;
                                                                                                                                case 3:
                                                                                                                                    xr2.c0 S44 = this.b.S4();
                                                                                                                                    S44.getClass();
                                                                                                                                    S44.p(xr2.t0.b);
                                                                                                                                    return;
                                                                                                                                case 4:
                                                                                                                                    xr2.c0 S45 = this.b.S4();
                                                                                                                                    S45.getClass();
                                                                                                                                    S45.p(xr2.p0.b);
                                                                                                                                    return;
                                                                                                                                case 5:
                                                                                                                                    xr2.c0 S46 = this.b.S4();
                                                                                                                                    S46.getClass();
                                                                                                                                    S46.p(xr2.z0.b);
                                                                                                                                    return;
                                                                                                                                case 6:
                                                                                                                                    xr2.c0 S47 = this.b.S4();
                                                                                                                                    S47.getClass();
                                                                                                                                    S47.p(xr2.v0.b);
                                                                                                                                    return;
                                                                                                                                case 7:
                                                                                                                                    xr2.c0 S48 = this.b.S4();
                                                                                                                                    S48.getClass();
                                                                                                                                    fg3.h0.J(androidx.lifecycle.g1.l(S48), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new xr2.b0(S48, null, 0), 3);
                                                                                                                                    return;
                                                                                                                                case 8:
                                                                                                                                    xr2.c0 S49 = this.b.S4();
                                                                                                                                    S49.getClass();
                                                                                                                                    S49.p(xr2.u0.b);
                                                                                                                                    return;
                                                                                                                                case 9:
                                                                                                                                    xr2.c0 S410 = this.b.S4();
                                                                                                                                    S410.getClass();
                                                                                                                                    S410.p(xr2.s0.b);
                                                                                                                                    return;
                                                                                                                                case 10:
                                                                                                                                    xr2.c0 S411 = this.b.S4();
                                                                                                                                    S411.getClass();
                                                                                                                                    S411.p(xr2.w0.b);
                                                                                                                                    return;
                                                                                                                                case 11:
                                                                                                                                    xr2.c0 S412 = this.b.S4();
                                                                                                                                    S412.getClass();
                                                                                                                                    S412.p(xr2.r0.b);
                                                                                                                                    return;
                                                                                                                                default:
                                                                                                                                    xr2.c0 S413 = this.b.S4();
                                                                                                                                    S413.getClass();
                                                                                                                                    S413.p(xr2.x0.b);
                                                                                                                                    return;
                                                                                                                            }
                                                                                                                        }
                                                                                                                    });
                                                                                                                    pe0.j.u(this, S4().k, new xr2.f(this, i4));
                                                                                                                    pe0.j.u(this, S4().o, new xr2.f(this, 1));
                                                                                                                    pe0.j.u(this, S4().u, new xr2.f(this, i5));
                                                                                                                    return;
                                                                                                                }
                                                                                                                throw new java.lang.IllegalArgumentException("Required value was null.");
                                                                                                            }
                                                                                                        }
                                                                                                        i = i3;
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(o10.getResources().getResourceName(i2)));
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public final void onAttach(android.app.Activity activity) {
        super.onAttach(activity);
        yc3.h hVar = this.c;
        fj.a.i(hVar == null || yc3.d.c(hVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new java.lang.Object[0]);
        T4();
        U4();
    }
}
