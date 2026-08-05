package com.truecaller.contact_call_history.ui.main;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/truecaller/contact_call_history/ui/main/ContactCallHistoryActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "p52/g", "contact-call-history_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class ContactCallHistoryActivity extends com.truecaller.contact_call_history.ui.main.Hilt_ContactCallHistoryActivity {
    public static final /* synthetic */ int v0 = 0;
    public w31.g d0;
    public u03.f0 e0;
    public kr0.o f0;
    public r61.baz g0;
    public ew0.a h0;
    public nv0.c i0;
    public w61.bar j0;
    public qc3.bar k0;
    public do1.b m0;
    public final kotlin.Lazy s0;
    public final kotlin.Lazy t0;
    public final kotlin.Lazy u0;
    public final androidx.lifecycle.o1 l0 = new androidx.lifecycle.o1(kotlin.jvm.internal.k0.a.getOrCreateKotlinClass(q61.j.class), new q61.e(this, 1), new q61.e(this, 0), new q61.e(this, 2));
    public final op2.baz n0 = new op2.baz(this);
    public final ah.h0 o0 = new ah.h0(25, this, false);
    public final q61.d p0 = new q61.d(this);
    public final ns.k q0 = new ns.k(this);
    public final kotlin.Lazy r0 = kotlin.LazyKt.lazy(new q61.baz(this, 0));

    public ContactCallHistoryActivity() {
        kotlin.k kVar = kotlin.k.c;
        this.s0 = kotlin.LazyKt.lazy(kVar, new q61.baz(this, 2));
        this.t0 = kotlin.LazyKt.lazy(kVar, new q61.baz(this, 3));
        this.u0 = kotlin.LazyKt.lazy(kVar, new q61.baz(this, 4));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.contact_call_history.ui.main.Hilt_ContactCallHistoryActivity
    public final void onCreate(android.os.Bundle bundle) {
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        yy.qux.B(this, true, ex2.a.a);
        super.onCreate(bundle);
        int i = 0;
        androidx.constraintlayout.widget.ConstraintLayout inflate = getLayoutInflater().inflate(2131558461, (android.view.ViewGroup) null, false);
        int i2 = 2131362381;
        com.truecaller.common.ui.avatar.AvatarXView o = df0.qux.o(2131362381, inflate);
        if (o != null) {
            i2 = 2131362764;
            androidx.compose.ui.platform.ComposeView o2 = df0.qux.o(2131362764, inflate);
            if (o2 != null) {
                i2 = 2131363137;
                android.widget.TextView textView = (android.widget.TextView) df0.qux.o(2131363137, inflate);
                if (textView != null) {
                    i2 = 2131363660;
                    android.view.View o3 = df0.qux.o(2131363660, inflate);
                    if (o3 != null) {
                        int i3 = 2131361981;
                        android.widget.Button button = (android.widget.Button) df0.qux.o(2131361981, o3);
                        if (button != null) {
                            i3 = 2131367033;
                            android.widget.TextView textView2 = (android.widget.TextView) df0.qux.o(2131367033, o3);
                            if (textView2 != null) {
                                d91.c cVar = new d91.c((android.widget.LinearLayout) o3, button, textView2, 13);
                                int i4 = 2131364461;
                                androidx.recyclerview.widget.RecyclerView o4 = df0.qux.o(2131364461, inflate);
                                if (o4 != null) {
                                    i4 = 2131366692;
                                    if (((android.widget.TextView) df0.qux.o(2131366692, inflate)) != null) {
                                        i4 = 2131367108;
                                        com.google.android.material.appbar.MaterialToolbar o5 = df0.qux.o(2131367108, inflate);
                                        if (o5 != null) {
                                            i4 = 2131367113;
                                            androidx.constraintlayout.widget.ConstraintLayout o6 = df0.qux.o(2131367113, inflate);
                                            if (o6 != null) {
                                                androidx.constraintlayout.widget.ConstraintLayout constraintLayout = inflate;
                                                do1.b bVar = new do1.b(constraintLayout, o, o2, textView, cVar, o4, o5, o6);
                                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bVar, "inflate(...)");
                                                this.m0 = bVar;
                                                setContentView(constraintLayout);
                                                do1.b bVar2 = this.m0;
                                                if (bVar2 != null) {
                                                    androidx.constraintlayout.widget.ConstraintLayout constraintLayout2 = bVar2.c;
                                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(constraintLayout2, "getRoot(...)");
                                                    ak.r0.i(constraintLayout2, com.truecaller.common.ui.insets.InsetType.SystemBars);
                                                    d.h0 onBackPressedDispatcher = getOnBackPressedDispatcher();
                                                    onBackPressedDispatcher.getClass();
                                                    ah.h0 h0Var = this.o0;
                                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(h0Var, "onBackPressedCallback");
                                                    onBackPressedDispatcher.b(h0Var);
                                                    do1.b bVar3 = this.m0;
                                                    if (bVar3 != null) {
                                                        setSupportActionBar(bVar3.h);
                                                        bVar3.d.setPresenter((w31.c) this.r0.getValue());
                                                        u0(com.truecaller.common_call_log.data.FilterType.NONE, q61.p.a);
                                                        do1.b bVar4 = this.m0;
                                                        if (bVar4 != null) {
                                                            androidx.recyclerview.widget.RecyclerView recyclerView = bVar4.b;
                                                            recyclerView.setAdapter((n00.c) this.u0.getValue());
                                                            recyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(this));
                                                            recyclerView.setItemAnimator((androidx.recyclerview.widget.p1) null);
                                                            android.content.Context context = recyclerView.getContext();
                                                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                                                            android.content.Context context2 = recyclerView.getContext();
                                                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                                                            int s = ak.r0.s(context2, 16);
                                                            android.content.Context context3 = recyclerView.getContext();
                                                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                                                            recyclerView.addItemDecoration(new s61.qux(s, context, ak.r0.s(context3, 16)));
                                                            recyclerView.setHasFixedSize(true);
                                                            recyclerView.addOnScrollListener(this.p0);
                                                            ig3.w1.F(new androidx.room.o(25, t0().k, new p62.a(this, (df3.bar) null, 13)), androidx.lifecycle.g1.j(this));
                                                            ((n00.bar) this.t0.getValue()).u(true);
                                                            ew0.a aVar = this.h0;
                                                            if (aVar != null) {
                                                                androidx.lifecycle.t lifecycle = getLifecycle();
                                                                androidx.lifecycle.s sVar = androidx.lifecycle.s.a;
                                                                aVar.c(new ew0.e(lifecycle));
                                                                ew0.a aVar2 = this.h0;
                                                                if (aVar2 != null) {
                                                                    aVar2.b(this.n0);
                                                                    do1.b bVar5 = this.m0;
                                                                    if (bVar5 != null) {
                                                                        androidx.compose.ui.platform.ComposeView composeView = bVar5.f;
                                                                        composeView.setViewCompositionStrategy(k4.r1.e);
                                                                        composeView.setContent(new d3.qux(-1832046335, new q61.a(this, i), true));
                                                                        return;
                                                                    }
                                                                    kotlin.jvm.internal.Intrinsics.n("binding");
                                                                    throw null;
                                                                }
                                                                kotlin.jvm.internal.Intrinsics.n("callHistoryObserver");
                                                                throw null;
                                                            }
                                                            kotlin.jvm.internal.Intrinsics.n("callHistoryObserver");
                                                            throw null;
                                                        }
                                                        kotlin.jvm.internal.Intrinsics.n("binding");
                                                        throw null;
                                                    }
                                                    kotlin.jvm.internal.Intrinsics.n("binding");
                                                    throw null;
                                                }
                                                kotlin.jvm.internal.Intrinsics.n("binding");
                                                throw null;
                                            }
                                        }
                                    }
                                }
                                i2 = i4;
                            }
                        }
                        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(o3.getResources().getResourceName(i3)));
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean onCreateOptionsMenu(android.view.Menu menu) {
        android.view.View view;
        android.view.MenuItem findItem;
        getMenuInflater().inflate(2131689478, menu);
        if (menu != null && (findItem = menu.findItem(2131365309)) != null) {
            view = findItem.getActionView();
        } else {
            view = null;
        }
        if (view != null) {
            view.setOnClickListener(new q61.b(this, 0));
            return super/*android.app.Activity*/.onCreateOptionsMenu(menu);
        }
        throw new java.lang.IllegalArgumentException("Required value was null.");
    }

    @Override // com.truecaller.contact_call_history.ui.main.Hilt_ContactCallHistoryActivity
    public final void onDestroy() {
        super.onDestroy();
        ew0.a aVar = this.h0;
        if (aVar != null) {
            aVar.b(null);
        } else {
            kotlin.jvm.internal.Intrinsics.n("callHistoryObserver");
            throw null;
        }
    }

    public final q61.j t0() {
        return (q61.j) this.l0.getValue();
    }

    public final void u0(com.truecaller.common_call_log.data.FilterType filterType, q61.r rVar) {
        do1.b bVar = this.m0;
        if (bVar != null) {
            android.widget.TextView textView = (android.widget.TextView) bVar.e;
            com.google.android.material.appbar.MaterialToolbar materialToolbar = bVar.h;
            androidx.constraintlayout.widget.ConstraintLayout constraintLayout = bVar.i;
            int i = 1;
            if (filterType == com.truecaller.common_call_log.data.FilterType.NONE) {
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(constraintLayout, "toolbarInnerContainer");
                gj.m.j0(constraintLayout);
                materialToolbar.setNavigationOnClickListener(new q61.b(this, i));
                i.baz supportActionBar = getSupportActionBar();
                if (supportActionBar != null) {
                    supportActionBar.v(2131233387);
                    supportActionBar.p(true);
                    supportActionBar.t(false);
                    supportActionBar.B((java.lang.CharSequence) null);
                }
            } else {
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(constraintLayout, "toolbarInnerContainer");
                gj.m.f0(constraintLayout);
                materialToolbar.setNavigationOnClickListener(new q61.b(this, 2));
                i.baz supportActionBar2 = getSupportActionBar();
                if (supportActionBar2 != null) {
                    supportActionBar2.v(2131233429);
                    supportActionBar2.p(true);
                    supportActionBar2.t(true);
                    supportActionBar2.A(ye0.k.x(filterType));
                }
            }
            boolean z = rVar instanceof q61.q;
            kotlin.Lazy lazy = this.r0;
            if (z) {
                w31.c cVar = (w31.c) lazy.getValue();
                w31.g gVar = this.d0;
                if (gVar != null) {
                    com.truecaller.data.entity.Contact contact = ((q61.q) rVar).a;
                    cVar.C2(gVar.a(contact), false);
                    textView.setText(contact.t());
                    return;
                }
                kotlin.jvm.internal.Intrinsics.n("contactAvatarXConfigProvider");
                throw null;
            }
            if (kotlin.jvm.internal.Intrinsics.b(rVar, q61.p.a)) {
                ((w31.c) lazy.getValue()).C2(new com.truecaller.common.ui.avatar.AvatarXConfig((android.net.Uri) null, (java.lang.String) null, (java.lang.String) null, false, false, false, false, false, false, false, false, false, (java.lang.Integer) null, false, false, false, false, false, (java.lang.String) null, false, false, -1), false);
                return;
            } else {
                if (kotlin.jvm.internal.Intrinsics.b(rVar, q61.o.a)) {
                    ((w31.c) lazy.getValue()).C2(new com.truecaller.common.ui.avatar.AvatarXConfig((android.net.Uri) null, (java.lang.String) null, (java.lang.String) null, false, false, false, false, false, false, false, false, false, (java.lang.Integer) null, false, false, false, false, false, (java.lang.String) null, false, false, -1), false);
                    textView.setText(2132020232);
                    return;
                }
                throw new java.lang.RuntimeException();
            }
        }
        kotlin.jvm.internal.Intrinsics.n("binding");
        throw null;
    }
}
