package com.truecaller.contactrequest.pending.card;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class ContactRequestCardView extends androidx.constraintlayout.widget.ConstraintLayout implements bd3.qux {
    public final android.widget.TextView A;
    public final android.widget.TextView B;
    public final android.widget.TextView C;
    public final android.widget.ImageView D;
    public final w31.c E;
    public final androidx.recyclerview.widget.RecyclerView F;
    public final android.view.View G;
    public final android.widget.TextView H;
    public yc3.d s;
    public final boolean t;
    public w31.g u;
    public fg0.bar v;
    public final u03.g0 w;
    public final com.truecaller.common.ui.ShineView x;
    public final android.widget.TextView y;
    public final android.widget.ImageView z;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ContactRequestCardView(android.content.Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void setAvatar(com.truecaller.common.ui.avatar.AvatarXConfig avatarXConfig) {
        this.E.C2(avatarXConfig, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setDefaultTheme(int i) {
        u03.g0 g0Var = this.w;
        setBackground(g0Var.d(i));
        gj.m.f0(this.x);
        this.y.setTextColor(g0Var.b(2131101947));
        this.A.setTextColor(g0Var.b(2131101392));
        this.B.setTextColor(g0Var.b(2131101947));
        this.C.setTextColor(g0Var.b(2131101392));
        this.G.setBackgroundColor(g0Var.b(2131101335));
        this.D.setImageTintList(android.content.res.ColorStateList.valueOf(g0Var.b(2131101947)));
        this.H.setTextColor(g0Var.b(2131101392));
    }

    private final void setDefaultValues(java.lang.String str) {
        setDefaultTheme(2131231222);
        u03.g0 g0Var = this.w;
        java.lang.String h = g0Var.h(2132019071, new java.lang.Object[0]);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(h, "getString(...)");
        setName(h);
        java.lang.String h2 = g0Var.h(2132017692, new java.lang.Object[0]);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(h2, "getString(...)");
        setNumber(h2);
        java.lang.String h3 = g0Var.h(2132017691, new java.lang.Object[0]);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(h3, "getString(...)");
        setLocation(h3);
        java.lang.String h4 = g0Var.h(2132017702, new java.lang.Object[]{str});
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(h4, "getString(...)");
        setReceivedDate(h4);
        setAvatar(new com.truecaller.common.ui.avatar.AvatarXConfig((android.net.Uri) null, (java.lang.String) null, (java.lang.String) null, false, false, false, false, false, false, false, false, false, (java.lang.Integer) null, false, false, false, false, false, (java.lang.String) null, false, false, -1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setDetailsList(java.util.List<a81.f> list) {
        boolean z;
        java.util.List<a81.f> list2 = list;
        if (list2 != null && !list2.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        androidx.recyclerview.widget.RecyclerView recyclerView = this.F;
        gj.m.k0(recyclerView, !z);
        recyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(getContext()));
        if (list == null) {
            list = kotlin.collections.h0.a;
        }
        recyclerView.setAdapter(new h10.j1(list, 1));
    }

    private final void setLocation(java.lang.String str) {
        android.widget.TextView textView = this.B;
        textView.setText(str);
        gj.m.j0(textView);
    }

    private final void setName(java.lang.String str) {
        android.widget.TextView textView = this.y;
        textView.setText(str);
        gj.m.j0(textView);
    }

    private final void setNumber(java.lang.String str) {
        android.widget.TextView textView = this.A;
        textView.setText(str);
        gj.m.j0(textView);
    }

    private final void setReceivedDate(java.lang.String str) {
        android.widget.TextView textView = this.C;
        textView.setText(str);
        gj.m.j0(textView);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.Object X3() {
        if (this.s == null) {
            this.s = new yc3.d(this);
        }
        return this.s.X3();
    }

    @org.jetbrains.annotations.NotNull
    public final fg0.bar getBadgeHelper() {
        fg0.bar barVar = this.v;
        if (barVar != null) {
            return barVar;
        }
        kotlin.jvm.internal.Intrinsics.n("badgeHelper");
        throw null;
    }

    @org.jetbrains.annotations.NotNull
    public final w31.g getContactAvatarXConfigProvider() {
        w31.g gVar = this.u;
        if (gVar != null) {
            return gVar;
        }
        kotlin.jvm.internal.Intrinsics.n("contactAvatarXConfigProvider");
        throw null;
    }

    public final void setBadgeHelper(@org.jetbrains.annotations.NotNull fg0.bar barVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "<set-?>");
        this.v = barVar;
    }

    public final void setContactAvatarXConfigProvider(@org.jetbrains.annotations.NotNull w31.g gVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gVar, "<set-?>");
        this.u = gVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setContent(@org.jetbrains.annotations.NotNull q71.f fVar) {
        boolean z;
        java.lang.String str;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fVar, "pendingRequestModel");
        com.truecaller.data.entity.Contact contact = fVar.c;
        java.lang.String str2 = fVar.e;
        if (contact != null) {
            java.lang.String s = contact.s();
            u03.g0 g0Var = this.w;
            if (s == null) {
                s = g0Var.h(2132019071, new java.lang.Object[0]);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(s, "getString(...)");
            }
            setName(s);
            boolean S = contact.S();
            if (!contact.J(64) && !contact.J(128)) {
                z = false;
            } else {
                z = true;
            }
            boolean X = contact.X();
            if (contact.O()) {
                com.truecaller.common.ui.f fVar2 = new com.truecaller.common.ui.f(g0Var);
                fVar2.setCornerRadius(fVar2.a.c(2131165502));
                setBackground(fVar2);
                gj.m.j0(this.x);
                this.y.setTextColor(g0Var.b(2131101948));
                this.A.setTextColor(g0Var.b(2131101398));
                this.B.setTextColor(g0Var.b(2131101948));
                this.C.setTextColor(g0Var.b(2131101954));
                this.G.setBackgroundColor(g0Var.b(2131101398));
                this.D.setImageTintList(android.content.res.ColorStateList.valueOf(g0Var.b(2131101948)));
                this.H.setTextColor(g0Var.b(2131101954));
            } else if (X) {
                setDefaultTheme(2131231275);
            } else if (z) {
                setDefaultTheme(2131231187);
            } else if (S) {
                setDefaultTheme(2131231249);
            } else {
                setDefaultTheme(2131231222);
            }
            java.lang.String o = contact.o();
            if (o == null) {
                o = g0Var.h(2132017692, new java.lang.Object[0]);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(o, "getString(...)");
            }
            setNumber(o);
            com.truecaller.contact.entity.model.AddressEntity m = contact.m();
            if (m != null) {
                str = m03.bar.a(m);
            } else {
                str = "";
            }
            setLocation(str);
            java.lang.String h = g0Var.h(2132017702, new java.lang.Object[]{str2});
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(h, "getString(...)");
            setReceivedDate(h);
            com.truecaller.common.ui.avatar.AvatarXConfig a = getContactAvatarXConfigProvider().a(contact);
            java.lang.Integer valueOf = java.lang.Integer.valueOf(g0Var.b(2131102053));
            if (contact.O() || contact.X()) {
                valueOf = null;
            }
            setAvatar(com.truecaller.common.ui.avatar.AvatarXConfig.a(a, (android.net.Uri) null, (java.lang.String) null, false, false, false, false, valueOf, false, false, false, false, false, (java.lang.String) null, false, false, -16385));
            setDetailsList(fVar.d);
            gj.m.k0(this.z, getBadgeHelper().e(contact));
            return;
        }
        setDefaultValues(str2);
    }

    public final void setLifecycleOwner(@org.jetbrains.annotations.NotNull androidx.lifecycle.d0 d0Var) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(d0Var, "lifecycleOwner");
        this.x.setLifecycleOwner(d0Var);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ContactRequestCardView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ ContactRequestCardView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ContactRequestCardView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        if (!isInEditMode() && !this.t) {
            this.t = true;
            tx.w wVar = ((q71.qux) X3()).c;
            this.u = wVar.U();
            this.v = (fg0.bar) wVar.Tg.get();
        }
        android.view.View.inflate(context, 2131558939, this);
        com.truecaller.common.ui.ShineView findViewById = findViewById(2131364309);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.x = findViewById;
        u03.g0 g0Var = new u03.g0(context);
        this.w = g0Var;
        android.view.View findViewById2 = findViewById(2131365422);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.y = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = findViewById(2131365541);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.A = (android.widget.TextView) findViewById3;
        android.view.View findViewById4 = findViewById(2131365019);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.B = (android.widget.TextView) findViewById4;
        android.view.View findViewById5 = findViewById(2131365990);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.C = (android.widget.TextView) findViewById5;
        android.view.View findViewById6 = findViewById(2131365026);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
        this.D = (android.widget.ImageView) findViewById6;
        w31.c cVar = new w31.c(g0Var, 0);
        this.E = cVar;
        com.truecaller.common.ui.avatar.AvatarXView findViewById7 = findViewById(2131362801);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById7, "findViewById(...)");
        findViewById7.setPresenter(cVar);
        androidx.recyclerview.widget.RecyclerView findViewById8 = findViewById(2131363485);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById8, "findViewById(...)");
        this.F = findViewById8;
        android.view.View findViewById9 = findViewById(2131363542);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById9, "findViewById(...)");
        this.G = findViewById9;
        android.view.View findViewById10 = findViewById(2131363529);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById10, "findViewById(...)");
        this.H = (android.widget.TextView) findViewById10;
        android.view.View findViewById11 = findViewById(2131367372);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById11, "findViewById(...)");
        this.z = (android.widget.ImageView) findViewById11;
    }
}
