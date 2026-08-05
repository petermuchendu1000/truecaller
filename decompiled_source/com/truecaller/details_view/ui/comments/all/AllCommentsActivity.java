package com.truecaller.details_view.ui.comments.all;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/truecaller/details_view/ui/comments/all/AllCommentsActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lab1/baz;", "<init>", "()V", "details-view_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class AllCommentsActivity extends com.truecaller.details_view.ui.comments.all.Hilt_AllCommentsActivity implements ab1.baz {
    public static final /* synthetic */ int n0 = 0;
    public ab1.qux e0;
    public c81.bar f0;
    public do1.a g0;
    public za1.s h0;
    public za1.q i0;
    public za1.n j0;
    public za1.l k0;
    public za1.a0 l0;
    public final androidx.lifecycle.o1 d0 = new androidx.lifecycle.o1(kotlin.jvm.internal.k0.a.getOrCreateKotlinClass(za1.i.class), new za1.d(this, 1), new za1.d(this, 0), new za1.d(this, 2));
    public final g.baz m0 = registerForActivityResult(new androidx.fragment.app.a1(8), new x9.g(this, 16));

    public static final void t0(com.truecaller.details_view.ui.comments.all.AllCommentsActivity allCommentsActivity, boolean z) {
        do1.a aVar = allCommentsActivity.g0;
        if (aVar != null) {
            androidx.recyclerview.widget.RecyclerView recyclerView = aVar.c;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(recyclerView, "commentsRecyclerView");
            gj.m.k0(recyclerView, z);
            return;
        }
        kotlin.jvm.internal.Intrinsics.n("binding");
        throw null;
    }

    @Override // ab1.baz
    public final void k0() {
        za1.s sVar = this.h0;
        if (sVar != null) {
            sVar.m.setValue(sVar, za1.s.n[0], (java.lang.Object) null);
        } else {
            kotlin.jvm.internal.Intrinsics.n("commentsKeywordsAdapter");
            throw null;
        }
    }

    @Override // ab1.baz
    public final void m0(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "keywords");
        za1.s sVar = this.h0;
        if (sVar != null) {
            sVar.m.setValue(sVar, za1.s.n[0], str);
        } else {
            kotlin.jvm.internal.Intrinsics.n("commentsKeywordsAdapter");
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v15, types: [androidx.recyclerview.widget.h1, za1.n] */
    /* JADX WARN: Type inference failed for: r5v2, types: [za1.bar] */
    /* JADX WARN: Type inference failed for: r6v3, types: [za1.bar] */
    /* JADX WARN: Type inference failed for: r6v4, types: [za1.bar] */
    @Override // com.truecaller.details_view.ui.comments.all.Hilt_AllCommentsActivity
    public final void onCreate(android.os.Bundle bundle) {
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        final int i = 1;
        yy.qux.B(this, true, ex2.a.a);
        android.view.Window window = getWindow();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(window, "getWindow(...)");
        yy.qux.l(window);
        getWindow().setStatusBarColor(ze0.q.B(2130970615, this));
        super.onCreate(bundle);
        android.view.LayoutInflater from = android.view.LayoutInflater.from(this);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(from, "from(...)");
        df3.bar barVar = null;
        final int i2 = 0;
        androidx.constraintlayout.widget.ConstraintLayout inflate = yy.qux.F(from, true).inflate(2131558439, (android.view.ViewGroup) null, false);
        int i3 = 2131362277;
        if (df0.qux.o(2131362277, inflate) != null) {
            i3 = 2131363088;
            androidx.recyclerview.widget.RecyclerView o = df0.qux.o(2131363088, inflate);
            if (o != null) {
                i3 = 2131365538;
                android.widget.TextView textView = (android.widget.TextView) df0.qux.o(2131365538, inflate);
                if (textView != null) {
                    i3 = 2131365671;
                    android.widget.ProgressBar progressBar = (android.widget.ProgressBar) df0.qux.o(2131365671, inflate);
                    if (progressBar != null) {
                        i3 = 2131366260;
                        com.google.android.material.floatingactionbutton.FloatingActionButton o2 = df0.qux.o(2131366260, inflate);
                        if (o2 != null) {
                            i3 = 2131366565;
                            android.widget.TextView textView2 = (android.widget.TextView) df0.qux.o(2131366565, inflate);
                            if (textView2 != null) {
                                i3 = 2131367108;
                                androidx.appcompat.widget.Toolbar o3 = df0.qux.o(2131367108, inflate);
                                if (o3 != null) {
                                    androidx.constraintlayout.widget.ConstraintLayout constraintLayout = inflate;
                                    do1.a aVar = new do1.a((android.view.ViewGroup) constraintLayout, (android.view.View) o, (android.view.View) textView, (android.view.View) progressBar, (java.lang.Object) o2, (android.view.View) textView2, (android.view.View) o3, 3);
                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(aVar, "inflate(...)");
                                    this.g0 = aVar;
                                    setContentView(constraintLayout);
                                    do1.a aVar2 = this.g0;
                                    if (aVar2 != null) {
                                        setSupportActionBar(aVar2.h);
                                        i.baz supportActionBar = getSupportActionBar();
                                        if (supportActionBar != null) {
                                            supportActionBar.v(2131233387);
                                        }
                                        i.baz supportActionBar2 = getSupportActionBar();
                                        if (supportActionBar2 != null) {
                                            supportActionBar2.p(true);
                                        }
                                        i.baz supportActionBar3 = getSupportActionBar();
                                        if (supportActionBar3 != null) {
                                            supportActionBar3.t(false);
                                        }
                                        do1.a aVar3 = this.g0;
                                        if (aVar3 != null) {
                                            androidx.constraintlayout.widget.ConstraintLayout constraintLayout2 = aVar3.b;
                                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(constraintLayout2, "getRoot(...)");
                                            ak.r0.i(constraintLayout2, com.truecaller.common.ui.insets.InsetType.SystemBars);
                                            android.os.Parcelable parcelableExtra = getIntent().getParcelableExtra("spammer");
                                            if (parcelableExtra != null) {
                                                com.truecaller.data.entity.Contact contact = (com.truecaller.data.entity.Contact) parcelableExtra;
                                                this.h0 = new za1.s();
                                                this.i0 = new za1.q(new yf0.i4(this, 13), new kotlin.jvm.functions.Function1(this) { // from class: za1.bar
                                                    public final /* synthetic */ com.truecaller.details_view.ui.comments.all.AllCommentsActivity b;

                                                    {
                                                        this.b = this;
                                                    }

                                                    public final java.lang.Object invoke(java.lang.Object obj) {
                                                        com.truecaller.commentfeedback.repo.SortType sortType;
                                                        java.lang.Enum r6;
                                                        java.lang.String str;
                                                        int i4 = i2;
                                                        za1.w wVar = za1.w.a;
                                                        com.truecaller.details_view.ui.comments.all.AllCommentsActivity allCommentsActivity = this.b;
                                                        switch (i4) {
                                                            case 0:
                                                                int intValue = ((java.lang.Integer) obj).intValue();
                                                                int i5 = com.truecaller.details_view.ui.comments.all.AllCommentsActivity.n0;
                                                                ig3.h2 h2Var = allCommentsActivity.u0().j;
                                                                com.truecaller.commentfeedback.repo.SortType[] values = com.truecaller.commentfeedback.repo.SortType.values();
                                                                if (intValue >= 0 && intValue < values.length) {
                                                                    sortType = values[intValue];
                                                                } else {
                                                                    sortType = com.truecaller.commentfeedback.repo.SortType.BY_TIME;
                                                                }
                                                                if (h2Var.getValue() != sortType) {
                                                                    h2Var.o(sortType);
                                                                }
                                                                c81.bar barVar2 = allCommentsActivity.f0;
                                                                if (barVar2 != null) {
                                                                    java.lang.Enum[] values2 = com.truecaller.commentfeedback.repo.SortType.values();
                                                                    if (intValue >= 0 && intValue < values2.length) {
                                                                        r6 = values2[intValue];
                                                                    } else {
                                                                        r6 = com.truecaller.commentfeedback.repo.SortType.BY_TIME;
                                                                    }
                                                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, "sortingType");
                                                                    int i6 = qa1.bar.a[r6.ordinal()];
                                                                    if (i6 != 1) {
                                                                        if (i6 == 2) {
                                                                            str = "ByTime";
                                                                        } else {
                                                                            throw new java.lang.RuntimeException();
                                                                        }
                                                                    } else {
                                                                        str = "ByScore";
                                                                    }
                                                                    nc0.u1.e(uf.qux.p("CommentSortingType", "action", "CommentSortingType", str, "AllCommentsScreen"), barVar2.a);
                                                                    return kotlin.Unit.a;
                                                                }
                                                                kotlin.jvm.internal.Intrinsics.n("analytics");
                                                                throw null;
                                                            case 1:
                                                                com.truecaller.details_view.ui.comments.single.model.CommentUiModel commentUiModel = (com.truecaller.details_view.ui.comments.single.model.CommentUiModel) obj;
                                                                int i7 = com.truecaller.details_view.ui.comments.all.AllCommentsActivity.n0;
                                                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(commentUiModel, "it");
                                                                za1.i u0 = allCommentsActivity.u0();
                                                                u0.getClass();
                                                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(commentUiModel, "comment");
                                                                u0.b.o(u0.f, commentUiModel.j);
                                                                u0.t.e(wVar);
                                                                return kotlin.Unit.a;
                                                            default:
                                                                com.truecaller.details_view.ui.comments.single.model.CommentUiModel commentUiModel2 = (com.truecaller.details_view.ui.comments.single.model.CommentUiModel) obj;
                                                                int i8 = com.truecaller.details_view.ui.comments.all.AllCommentsActivity.n0;
                                                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(commentUiModel2, "it");
                                                                za1.i u03 = allCommentsActivity.u0();
                                                                u03.getClass();
                                                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(commentUiModel2, "comment");
                                                                u03.b.n(u03.f, commentUiModel2.j);
                                                                u03.t.e(wVar);
                                                                return kotlin.Unit.a;
                                                        }
                                                    }
                                                });
                                                final int i4 = 2;
                                                this.k0 = new za1.l(new kotlin.jvm.functions.Function1(this) { // from class: za1.bar
                                                    public final /* synthetic */ com.truecaller.details_view.ui.comments.all.AllCommentsActivity b;

                                                    {
                                                        this.b = this;
                                                    }

                                                    public final java.lang.Object invoke(java.lang.Object obj) {
                                                        com.truecaller.commentfeedback.repo.SortType sortType;
                                                        java.lang.Enum r6;
                                                        java.lang.String str;
                                                        int i43 = i;
                                                        za1.w wVar = za1.w.a;
                                                        com.truecaller.details_view.ui.comments.all.AllCommentsActivity allCommentsActivity = this.b;
                                                        switch (i43) {
                                                            case 0:
                                                                int intValue = ((java.lang.Integer) obj).intValue();
                                                                int i5 = com.truecaller.details_view.ui.comments.all.AllCommentsActivity.n0;
                                                                ig3.h2 h2Var = allCommentsActivity.u0().j;
                                                                com.truecaller.commentfeedback.repo.SortType[] values = com.truecaller.commentfeedback.repo.SortType.values();
                                                                if (intValue >= 0 && intValue < values.length) {
                                                                    sortType = values[intValue];
                                                                } else {
                                                                    sortType = com.truecaller.commentfeedback.repo.SortType.BY_TIME;
                                                                }
                                                                if (h2Var.getValue() != sortType) {
                                                                    h2Var.o(sortType);
                                                                }
                                                                c81.bar barVar2 = allCommentsActivity.f0;
                                                                if (barVar2 != null) {
                                                                    java.lang.Enum[] values2 = com.truecaller.commentfeedback.repo.SortType.values();
                                                                    if (intValue >= 0 && intValue < values2.length) {
                                                                        r6 = values2[intValue];
                                                                    } else {
                                                                        r6 = com.truecaller.commentfeedback.repo.SortType.BY_TIME;
                                                                    }
                                                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, "sortingType");
                                                                    int i6 = qa1.bar.a[r6.ordinal()];
                                                                    if (i6 != 1) {
                                                                        if (i6 == 2) {
                                                                            str = "ByTime";
                                                                        } else {
                                                                            throw new java.lang.RuntimeException();
                                                                        }
                                                                    } else {
                                                                        str = "ByScore";
                                                                    }
                                                                    nc0.u1.e(uf.qux.p("CommentSortingType", "action", "CommentSortingType", str, "AllCommentsScreen"), barVar2.a);
                                                                    return kotlin.Unit.a;
                                                                }
                                                                kotlin.jvm.internal.Intrinsics.n("analytics");
                                                                throw null;
                                                            case 1:
                                                                com.truecaller.details_view.ui.comments.single.model.CommentUiModel commentUiModel = (com.truecaller.details_view.ui.comments.single.model.CommentUiModel) obj;
                                                                int i7 = com.truecaller.details_view.ui.comments.all.AllCommentsActivity.n0;
                                                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(commentUiModel, "it");
                                                                za1.i u0 = allCommentsActivity.u0();
                                                                u0.getClass();
                                                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(commentUiModel, "comment");
                                                                u0.b.o(u0.f, commentUiModel.j);
                                                                u0.t.e(wVar);
                                                                return kotlin.Unit.a;
                                                            default:
                                                                com.truecaller.details_view.ui.comments.single.model.CommentUiModel commentUiModel2 = (com.truecaller.details_view.ui.comments.single.model.CommentUiModel) obj;
                                                                int i8 = com.truecaller.details_view.ui.comments.all.AllCommentsActivity.n0;
                                                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(commentUiModel2, "it");
                                                                za1.i u03 = allCommentsActivity.u0();
                                                                u03.getClass();
                                                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(commentUiModel2, "comment");
                                                                u03.b.n(u03.f, commentUiModel2.j);
                                                                u03.t.e(wVar);
                                                                return kotlin.Unit.a;
                                                        }
                                                    }
                                                }, new kotlin.jvm.functions.Function1(this) { // from class: za1.bar
                                                    public final /* synthetic */ com.truecaller.details_view.ui.comments.all.AllCommentsActivity b;

                                                    {
                                                        this.b = this;
                                                    }

                                                    public final java.lang.Object invoke(java.lang.Object obj) {
                                                        com.truecaller.commentfeedback.repo.SortType sortType;
                                                        java.lang.Enum r6;
                                                        java.lang.String str;
                                                        int i43 = i4;
                                                        za1.w wVar = za1.w.a;
                                                        com.truecaller.details_view.ui.comments.all.AllCommentsActivity allCommentsActivity = this.b;
                                                        switch (i43) {
                                                            case 0:
                                                                int intValue = ((java.lang.Integer) obj).intValue();
                                                                int i5 = com.truecaller.details_view.ui.comments.all.AllCommentsActivity.n0;
                                                                ig3.h2 h2Var = allCommentsActivity.u0().j;
                                                                com.truecaller.commentfeedback.repo.SortType[] values = com.truecaller.commentfeedback.repo.SortType.values();
                                                                if (intValue >= 0 && intValue < values.length) {
                                                                    sortType = values[intValue];
                                                                } else {
                                                                    sortType = com.truecaller.commentfeedback.repo.SortType.BY_TIME;
                                                                }
                                                                if (h2Var.getValue() != sortType) {
                                                                    h2Var.o(sortType);
                                                                }
                                                                c81.bar barVar2 = allCommentsActivity.f0;
                                                                if (barVar2 != null) {
                                                                    java.lang.Enum[] values2 = com.truecaller.commentfeedback.repo.SortType.values();
                                                                    if (intValue >= 0 && intValue < values2.length) {
                                                                        r6 = values2[intValue];
                                                                    } else {
                                                                        r6 = com.truecaller.commentfeedback.repo.SortType.BY_TIME;
                                                                    }
                                                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, "sortingType");
                                                                    int i6 = qa1.bar.a[r6.ordinal()];
                                                                    if (i6 != 1) {
                                                                        if (i6 == 2) {
                                                                            str = "ByTime";
                                                                        } else {
                                                                            throw new java.lang.RuntimeException();
                                                                        }
                                                                    } else {
                                                                        str = "ByScore";
                                                                    }
                                                                    nc0.u1.e(uf.qux.p("CommentSortingType", "action", "CommentSortingType", str, "AllCommentsScreen"), barVar2.a);
                                                                    return kotlin.Unit.a;
                                                                }
                                                                kotlin.jvm.internal.Intrinsics.n("analytics");
                                                                throw null;
                                                            case 1:
                                                                com.truecaller.details_view.ui.comments.single.model.CommentUiModel commentUiModel = (com.truecaller.details_view.ui.comments.single.model.CommentUiModel) obj;
                                                                int i7 = com.truecaller.details_view.ui.comments.all.AllCommentsActivity.n0;
                                                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(commentUiModel, "it");
                                                                za1.i u0 = allCommentsActivity.u0();
                                                                u0.getClass();
                                                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(commentUiModel, "comment");
                                                                u0.b.o(u0.f, commentUiModel.j);
                                                                u0.t.e(wVar);
                                                                return kotlin.Unit.a;
                                                            default:
                                                                com.truecaller.details_view.ui.comments.single.model.CommentUiModel commentUiModel2 = (com.truecaller.details_view.ui.comments.single.model.CommentUiModel) obj;
                                                                int i8 = com.truecaller.details_view.ui.comments.all.AllCommentsActivity.n0;
                                                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(commentUiModel2, "it");
                                                                za1.i u03 = allCommentsActivity.u0();
                                                                u03.getClass();
                                                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(commentUiModel2, "comment");
                                                                u03.b.n(u03.f, commentUiModel2.j);
                                                                u03.t.e(wVar);
                                                                return kotlin.Unit.a;
                                                        }
                                                    }
                                                });
                                                this.l0 = new za1.a0();
                                                ?? h1Var = new androidx.recyclerview.widget.h1();
                                                this.j0 = h1Var;
                                                za1.q qVar = this.i0;
                                                if (qVar != null) {
                                                    za1.s sVar = this.h0;
                                                    if (sVar != null) {
                                                        za1.a0 a0Var = this.l0;
                                                        if (a0Var != null) {
                                                            za1.l lVar = this.k0;
                                                            if (lVar != null) {
                                                                int i5 = 5;
                                                                int i6 = 3;
                                                                int i7 = 4;
                                                                androidx.recyclerview.widget.i iVar = new androidx.recyclerview.widget.i(new androidx.recyclerview.widget.h1[]{qVar, sVar, a0Var, lVar, h1Var});
                                                                androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = new androidx.recyclerview.widget.LinearLayoutManager(this);
                                                                do1.a aVar4 = this.g0;
                                                                if (aVar4 != null) {
                                                                    aVar4.c.setLayoutManager(linearLayoutManager);
                                                                    do1.a aVar5 = this.g0;
                                                                    if (aVar5 != null) {
                                                                        aVar5.c.setAdapter(iVar);
                                                                        do1.a aVar6 = this.g0;
                                                                        if (aVar6 != null) {
                                                                            androidx.recyclerview.widget.RecyclerView recyclerView = aVar6.c;
                                                                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this, "<this>");
                                                                            int r = ak.r0.r(16, this);
                                                                            recyclerView.addItemDecoration(new m41.baz(r, r, r, r));
                                                                            do1.a aVar7 = this.g0;
                                                                            if (aVar7 != null) {
                                                                                androidx.recyclerview.widget.RecyclerView recyclerView2 = aVar7.c;
                                                                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(recyclerView2, "commentsRecyclerView");
                                                                                gj.m.j0(recyclerView2);
                                                                                do1.a aVar8 = this.g0;
                                                                                if (aVar8 != null) {
                                                                                    aVar8.c.addOnScrollListener(new za1.b(linearLayoutManager, this));
                                                                                    do1.a aVar9 = this.g0;
                                                                                    if (aVar9 != null) {
                                                                                        ((com.google.android.material.floatingactionbutton.FloatingActionButton) aVar9.f).setOnClickListener(new yt2.a(this, 3));
                                                                                        ab1.qux quxVar = this.e0;
                                                                                        if (quxVar != null) {
                                                                                            ((com.truecaller.sdk.bar) quxVar).a = this;
                                                                                            if (quxVar != null) {
                                                                                                quxVar.d2(contact);
                                                                                                androidx.lifecycle.g1.j(this).a(new za1.qux(this, barVar, i7));
                                                                                                fg3.h0.J(androidx.lifecycle.g1.j(this), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new za1.qux(this, barVar, i5), 3);
                                                                                                fg3.h0.J(androidx.lifecycle.g1.j(this), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new za1.qux(this, barVar, 6), 3);
                                                                                                fg3.h0.J(androidx.lifecycle.g1.j(this), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new za1.qux(this, barVar, i2), 3);
                                                                                                fg3.h0.J(androidx.lifecycle.g1.j(this), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new za1.qux(this, barVar, i), 3);
                                                                                                fg3.h0.J(androidx.lifecycle.g1.j(this), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new za1.qux(this, barVar, i4), 3);
                                                                                                fg3.h0.J(androidx.lifecycle.g1.j(this), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new za1.qux(this, barVar, i6), 3);
                                                                                                ig3.w1.F(new androidx.room.o(25, u0().u, new za1.a(this, barVar, i2)), androidx.lifecycle.g1.j(this));
                                                                                                za1.i u0 = u0();
                                                                                                ig3.h2 h2Var = u0.n;
                                                                                                com.truecaller.data.entity.Contact contact2 = u0.f;
                                                                                                java.lang.String s = contact2.s();
                                                                                                if (s == null && (s = contact2.o()) == null) {
                                                                                                    s = u0.e.h(2132020514, new java.lang.Object[0]);
                                                                                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(s, "getString(...)");
                                                                                                }
                                                                                                h2Var.getClass();
                                                                                                h2Var.p((java.lang.Object) null, s);
                                                                                                u0.l.o(kotlin.collections.y.j(new java.lang.String[]{(java.lang.String) u0.h.getValue(), (java.lang.String) u0.i.getValue()}));
                                                                                                fg3.h0.J(androidx.lifecycle.g1.l(u0), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new za1.c(u0, barVar, i), 3);
                                                                                                return;
                                                                                            }
                                                                                            kotlin.jvm.internal.Intrinsics.n("commentsKeywordsPresenter");
                                                                                            throw null;
                                                                                        }
                                                                                        kotlin.jvm.internal.Intrinsics.n("commentsKeywordsPresenter");
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
                                                                kotlin.jvm.internal.Intrinsics.n("binding");
                                                                throw null;
                                                            }
                                                            kotlin.jvm.internal.Intrinsics.n("commentsAdapter");
                                                            throw null;
                                                        }
                                                        kotlin.jvm.internal.Intrinsics.n("postedCommentsAdapter");
                                                        throw null;
                                                    }
                                                    kotlin.jvm.internal.Intrinsics.n("commentsKeywordsAdapter");
                                                    throw null;
                                                }
                                                kotlin.jvm.internal.Intrinsics.n("commentsHeaderAdapter");
                                                throw null;
                                            }
                                            throw new java.lang.IllegalArgumentException("Required value was null.");
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
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i3)));
    }

    @Override // com.truecaller.details_view.ui.comments.all.Hilt_AllCommentsActivity
    public final void onDestroy() {
        ab1.qux quxVar = this.e0;
        if (quxVar != null) {
            quxVar.m1();
            super.onDestroy();
        } else {
            kotlin.jvm.internal.Intrinsics.n("commentsKeywordsPresenter");
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean onSupportNavigateUp() {
        finish();
        return true;
    }

    public final za1.i u0() {
        return (za1.i) this.d0.getValue();
    }
}
