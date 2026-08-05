package com.truecaller.favourite_contacts.add_favourite_contact;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/truecaller/favourite_contacts/add_favourite_contact/AddFavouriteContactActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "", "<init>", "()V", "favourite-contacts_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class AddFavouriteContactActivity extends com.truecaller.favourite_contacts.add_favourite_contact.Hilt_AddFavouriteContactActivity {
    public static final /* synthetic */ int j0 = 0;
    public com.truecaller.favourite_contacts.add_favourite_contact.a e0;
    public ew0.a f0;
    public d91.d h0;
    public final /* synthetic */ i.d0 d0 = new i.d0(0, 22);
    public final androidx.lifecycle.o1 g0 = new androidx.lifecycle.o1(kotlin.jvm.internal.k0.a.getOrCreateKotlinClass(com.truecaller.favourite_contacts.add_favourite_contact.d.class), new com.truecaller.favourite_contacts.add_favourite_contact.baz(this, 1), new com.truecaller.favourite_contacts.add_favourite_contact.baz(this, 0), new com.truecaller.favourite_contacts.add_favourite_contact.baz(this, 2));
    public final com.truecaller.favourite_contacts.add_favourite_contact.bar i0 = new com.truecaller.favourite_contacts.add_favourite_contact.bar(this);

    public static final void t0(com.truecaller.favourite_contacts.add_favourite_contact.AddFavouriteContactActivity addFavouriteContactActivity) {
        d91.d dVar = addFavouriteContactActivity.h0;
        if (dVar != null) {
            androidx.recyclerview.widget.RecyclerView recyclerView = dVar.c;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
            gj.m.j0(recyclerView);
            d91.d dVar2 = addFavouriteContactActivity.h0;
            if (dVar2 != null) {
                android.widget.TextView textView = (android.widget.TextView) dVar2.d;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(textView, "textViewNoResults");
                gj.m.f0(textView);
                addFavouriteContactActivity.w0();
                return;
            }
            kotlin.jvm.internal.Intrinsics.n("binding");
            throw null;
        }
        kotlin.jvm.internal.Intrinsics.n("binding");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onBackPressed() {
        i.d0 d0Var = this.d0;
        if (d0Var.A()) {
            d0Var.d(false);
            d0Var.g();
            com.truecaller.favourite_contacts.add_favourite_contact.d v0 = v0();
            v0.o(v0.h);
            return;
        }
        finish();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.favourite_contacts.add_favourite_contact.Hilt_AddFavouriteContactActivity
    public final void onCreate(android.os.Bundle bundle) {
        java.lang.String str;
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        yy.qux.B(this, true, ex2.a.a);
        super.onCreate(bundle);
        df3.bar barVar = null;
        androidx.constraintlayout.widget.ConstraintLayout inflate = getLayoutInflater().inflate(2131558437, (android.view.ViewGroup) null, false);
        int i = 2131364643;
        android.view.View o = df0.qux.o(2131364643, inflate);
        if (o != null) {
            d41.a a = d41.a.a(o);
            i = 2131365848;
            android.widget.ProgressBar progressBar = (android.widget.ProgressBar) df0.qux.o(2131365848, inflate);
            if (progressBar != null) {
                i = 2131366019;
                androidx.recyclerview.widget.RecyclerView o2 = df0.qux.o(2131366019, inflate);
                if (o2 != null) {
                    i = 2131366925;
                    android.widget.TextView textView = (android.widget.TextView) df0.qux.o(2131366925, inflate);
                    if (textView != null) {
                        i = 2131367108;
                        com.google.android.material.appbar.MaterialToolbar o3 = df0.qux.o(2131367108, inflate);
                        if (o3 != null) {
                            androidx.constraintlayout.widget.ConstraintLayout constraintLayout = inflate;
                            d91.d dVar = new d91.d(constraintLayout, a, progressBar, o2, textView, o3);
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(dVar, "inflate(...)");
                            this.h0 = dVar;
                            setContentView(constraintLayout);
                            d91.d dVar2 = this.h0;
                            if (dVar2 != null) {
                                androidx.constraintlayout.widget.ConstraintLayout constraintLayout2 = dVar2.b;
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(constraintLayout2, "getRoot(...)");
                                ak.r0.i(constraintLayout2, com.truecaller.common.ui.insets.InsetType.SystemBars);
                                d91.d dVar3 = this.h0;
                                if (dVar3 != null) {
                                    setSupportActionBar(dVar3.g);
                                    i.baz supportActionBar = getSupportActionBar();
                                    if (supportActionBar != null) {
                                        supportActionBar.p(true);
                                        supportActionBar.A(2132021251);
                                    }
                                    d91.d dVar4 = this.h0;
                                    if (dVar4 != null) {
                                        dVar4.g.setNavigationOnClickListener(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.d(this, 1));
                                        d91.d dVar5 = this.h0;
                                        if (dVar5 != null) {
                                            androidx.recyclerview.widget.RecyclerView recyclerView = dVar5.c;
                                            recyclerView.setAdapter(u0());
                                            recyclerView.addItemDecoration(new com.truecaller.ui.y(2131561042, recyclerView.getContext(), 0));
                                            com.truecaller.favourite_contacts.add_favourite_contact.a u0 = u0();
                                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this, "listener");
                                            u0.s = this;
                                            com.truecaller.favourite_contacts.add_favourite_contact.bar barVar2 = new com.truecaller.favourite_contacts.add_favourite_contact.bar(this);
                                            d91.d dVar6 = this.h0;
                                            if (dVar6 != null) {
                                                d41.a aVar = (d41.a) dVar6.e;
                                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(aVar, "includeSearchToolbar");
                                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(aVar, "toolbarTcxSearchBinding");
                                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar2, "listener");
                                                i.d0 d0Var = this.d0;
                                                d0Var.F(aVar, barVar2);
                                                d41.a aVar2 = (d41.a) d0Var.b;
                                                if (aVar2 != null) {
                                                    aVar2.e.setHint(2132021262);
                                                    ew0.a aVar3 = this.f0;
                                                    if (aVar3 != null) {
                                                        androidx.lifecycle.t lifecycle = getLifecycle();
                                                        androidx.lifecycle.s sVar = androidx.lifecycle.s.a;
                                                        aVar3.c(new ew0.e(lifecycle));
                                                        aVar3.b(this.i0);
                                                        ig3.w1.F(new androidx.room.o(25, v0().g, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.qux(this, (df3.bar) null, 13)), androidx.lifecycle.g1.j(this));
                                                        com.truecaller.favourite_contacts.add_favourite_contact.d v0 = v0();
                                                        v0.i.cancel((java.util.concurrent.CancellationException) null);
                                                        v0.i = fg3.h0.J(androidx.lifecycle.g1.l(v0), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new com.truecaller.data.country.f(v0, barVar, 4), 3);
                                                        android.content.Intent intent = getIntent();
                                                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
                                                        com.truecaller.favourite_contacts.analytics.AddFavoriteContactSource addFavoriteContactSource = (com.truecaller.favourite_contacts.analytics.AddFavoriteContactSource) g6.b.h(intent, "PARAM_LAUNCH_SOURCE", com.truecaller.favourite_contacts.analytics.AddFavoriteContactSource.class);
                                                        if (addFavoriteContactSource != null) {
                                                            com.truecaller.favourite_contacts.add_favourite_contact.d v03 = v0();
                                                            v03.getClass();
                                                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addFavoriteContactSource, "source");
                                                            v03.j = addFavoriteContactSource;
                                                            eo1.baz bazVar = v03.e;
                                                            bazVar.getClass();
                                                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addFavoriteContactSource, "source");
                                                            int i2 = eo1.bar.a[addFavoriteContactSource.ordinal()];
                                                            if (i2 != 1 && i2 != 2) {
                                                                if (i2 == 3) {
                                                                    str = "contactsTab_saved";
                                                                } else {
                                                                    throw new java.lang.RuntimeException();
                                                                }
                                                            } else {
                                                                str = "callTab_favourites";
                                                            }
                                                            bd.bar.u(bazVar.a, "addFavoriteContactPicker", str);
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    kotlin.jvm.internal.Intrinsics.n("contactsListObserver");
                                                    throw null;
                                                }
                                                kotlin.jvm.internal.Intrinsics.n("searchToolbarBinding");
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
                            kotlin.jvm.internal.Intrinsics.n("binding");
                            throw null;
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean onCreateOptionsMenu(android.view.Menu menu) {
        getMenuInflater().inflate(2131689512, menu);
        return super/*android.app.Activity*/.onCreateOptionsMenu(menu);
    }

    @Override // com.truecaller.favourite_contacts.add_favourite_contact.Hilt_AddFavouriteContactActivity
    public final void onDestroy() {
        ew0.a aVar = this.f0;
        if (aVar != null) {
            aVar.b((ew0.c) null);
            super.onDestroy();
        } else {
            kotlin.jvm.internal.Intrinsics.n("contactsListObserver");
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean onOptionsItemSelected(android.view.MenuItem menuItem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(menuItem, "item");
        if (menuItem.getItemId() == 2131361951) {
            this.d0.G();
        }
        return super/*android.app.Activity*/.onOptionsItemSelected(menuItem);
    }

    public final void onStart() {
        super.onStart();
        u0().m.f();
    }

    public final void onStop() {
        super.onStop();
        u0().m.e();
    }

    public final com.truecaller.favourite_contacts.add_favourite_contact.a u0() {
        com.truecaller.favourite_contacts.add_favourite_contact.a aVar = this.e0;
        if (aVar != null) {
            return aVar;
        }
        kotlin.jvm.internal.Intrinsics.n("contactsAdapter");
        throw null;
    }

    public final com.truecaller.favourite_contacts.add_favourite_contact.d v0() {
        return (com.truecaller.favourite_contacts.add_favourite_contact.d) this.g0.getValue();
    }

    public final void w0() {
        d91.d dVar = this.h0;
        if (dVar != null) {
            android.widget.ProgressBar progressBar = (android.widget.ProgressBar) dVar.f;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
            gj.m.f0(progressBar);
            return;
        }
        kotlin.jvm.internal.Intrinsics.n("binding");
        throw null;
    }
}
