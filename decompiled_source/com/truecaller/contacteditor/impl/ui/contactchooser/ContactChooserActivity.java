package com.truecaller.contacteditor.impl.ui.contactchooser;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/contacteditor/impl/ui/contactchooser/ContactChooserActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "impl_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class ContactChooserActivity extends com.truecaller.contacteditor.impl.ui.contactchooser.Hilt_ContactChooserActivity {
    public static final /* synthetic */ int g0 = 0;
    public final androidx.lifecycle.o1 d0 = new androidx.lifecycle.o1(kotlin.jvm.internal.k0.a.getOrCreateKotlinClass(g71.d.class), new g71.baz(this, 1), new g71.baz(this, 0), new g71.baz(this, 2));
    public d91.n0 e0;
    public b81.i0 f0;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.contacteditor.impl.ui.contactchooser.Hilt_ContactChooserActivity
    public final void onCreate(android.os.Bundle bundle) {
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        int i = 1;
        yy.qux.B(this, true, ex2.a.a);
        super.onCreate(bundle);
        int i2 = 0;
        android.view.View inflate = getLayoutInflater().inflate(2131558462, (android.view.ViewGroup) null, false);
        int i3 = 2131362274;
        com.google.android.material.appbar.AppBarLayout o = df0.qux.o(2131362274, inflate);
        if (o != null) {
            i3 = 2131363144;
            if (df0.qux.o(2131363144, inflate) != null) {
                i3 = 2131363614;
                com.truecaller.common.ui.EditBase o2 = df0.qux.o(2131363614, inflate);
                if (o2 != null) {
                    i3 = 2131363655;
                    if (((android.view.ViewStub) df0.qux.o(2131363655, inflate)) != null) {
                        i3 = 2131363831;
                        if (((com.truecaller.contacts_list.FastScroller) df0.qux.o(2131363831, inflate)) != null) {
                            i3 = 2131364927;
                            android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) df0.qux.o(2131364927, inflate);
                            if (frameLayout != null) {
                                i3 = 2131365000;
                                if (((android.widget.ProgressBar) df0.qux.o(2131365000, inflate)) != null) {
                                    i3 = 2131367110;
                                    com.google.android.material.appbar.MaterialToolbar o3 = df0.qux.o(2131367110, inflate);
                                    if (o3 != null) {
                                        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) inflate;
                                        d91.n0 n0Var = new d91.n0((android.view.ViewGroup) linearLayout, (android.view.View) o, (android.view.View) o2, (java.lang.Object) frameLayout, (java.lang.Object) o3, 3);
                                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(n0Var, "inflate(...)");
                                        this.e0 = n0Var;
                                        setContentView(linearLayout);
                                        d91.n0 n0Var2 = this.e0;
                                        if (n0Var2 != null) {
                                            com.google.android.material.appbar.AppBarLayout appBarLayout = n0Var2.d;
                                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(appBarLayout, "appBarContactSearch");
                                            ak.r0.i(appBarLayout, com.truecaller.common.ui.insets.InsetType.StatusBar);
                                            d91.n0 n0Var3 = this.e0;
                                            if (n0Var3 != null) {
                                                setSupportActionBar((com.google.android.material.appbar.MaterialToolbar) n0Var3.f);
                                                i.baz supportActionBar = getSupportActionBar();
                                                if (supportActionBar != null) {
                                                    supportActionBar.p(true);
                                                    supportActionBar.s(true);
                                                }
                                                d91.n0 n0Var4 = this.e0;
                                                if (n0Var4 != null) {
                                                    ((com.google.android.material.appbar.MaterialToolbar) n0Var4.f).setNavigationOnClickListener(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.d(this, 25));
                                                    d91.n0 n0Var5 = this.e0;
                                                    if (n0Var5 != null) {
                                                        com.truecaller.common.ui.EditBase editBase = n0Var5.b;
                                                        editBase.addTextChangedListener(new com.truecaller.common.ui.d(this, 5));
                                                        gj.m.v0(editBase, 2, true);
                                                        t0().c = new f42.q(this, 10);
                                                        b81.i0 t0 = t0();
                                                        d91.n0 n0Var6 = this.e0;
                                                        if (n0Var6 != null) {
                                                            android.widget.FrameLayout frameLayout2 = (android.widget.FrameLayout) n0Var6.e;
                                                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(frameLayout2, "layoutContacts");
                                                            androidx.lifecycle.o1 o1Var = this.d0;
                                                            g71.d dVar = (g71.d) o1Var.getValue();
                                                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(frameLayout2, "view");
                                                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dVar, "contactsHolder");
                                                            t0.d = frameLayout2;
                                                            t0.e = dVar;
                                                            java.lang.Object value = t0.f.getValue();
                                                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                                                            android.view.ViewStub viewStub = (android.view.ViewStub) value;
                                                            t0.g = viewStub.inflate();
                                                            viewStub.setVisibility(8);
                                                            androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) t0.h.getValue();
                                                            n00.c cVar = t0.k;
                                                            cVar.u(true);
                                                            recyclerView.setAdapter(cVar);
                                                            recyclerView.setItemAnimator((androidx.recyclerview.widget.p1) null);
                                                            recyclerView.addItemDecoration(new com.truecaller.ui.y(2131561042, frameLayout2.getContext(), 0));
                                                            ((com.truecaller.contacts_list.FastScroller) t0.i.getValue()).b(recyclerView, new a11.baz(10, t0, dVar));
                                                            pe0.j.r(this, ((g71.d) o1Var.getValue()).e, new g71.bar(this, i2));
                                                            pe0.j.p(this, ((g71.d) o1Var.getValue()).g, new g71.bar(this, i));
                                                            return;
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
                                            kotlin.jvm.internal.Intrinsics.n("binding");
                                            throw null;
                                        }
                                        kotlin.jvm.internal.Intrinsics.n("binding");
                                        throw null;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i3)));
    }

    public final b81.i0 t0() {
        b81.i0 i0Var = this.f0;
        if (i0Var != null) {
            return i0Var;
        }
        kotlin.jvm.internal.Intrinsics.n("contactsListView");
        throw null;
    }
}
