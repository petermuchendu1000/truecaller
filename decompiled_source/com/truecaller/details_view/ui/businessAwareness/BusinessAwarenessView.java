package com.truecaller.details_view.ui.businessAwareness;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class BusinessAwarenessView extends android.widget.FrameLayout implements ta1.baz, bd3.qux {
    public static final /* synthetic */ int e = 0;
    public yc3.d a;
    public boolean b;
    public final d41.a c;
    public ta1.bar d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BusinessAwarenessView(android.content.Context context) {
        this(context, null, 0, 0, 14, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    public final java.lang.Object X3() {
        if (this.a == null) {
            this.a = new yc3.d(this);
        }
        return this.a.X3();
    }

    @org.jetbrains.annotations.NotNull
    public final ta1.bar getPresenter() {
        ta1.bar barVar = this.d;
        if (barVar != null) {
            return barVar;
        }
        kotlin.jvm.internal.Intrinsics.n("presenter");
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getPresenter().u0(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getPresenter().m1();
    }

    public final void setPresenter(@org.jetbrains.annotations.NotNull ta1.bar barVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "<set-?>");
        this.d = barVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BusinessAwarenessView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BusinessAwarenessView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ BusinessAwarenessView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, int i3, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BusinessAwarenessView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        final int i3 = 1;
        if (!isInEditMode() && !this.b) {
            this.b = true;
            tx.e eVar = ((ta1.a) X3()).e;
            this.d = new ac0.qux(cd3.baz.a(eVar.f.b.a6), cd3.baz.a(eVar.g.h));
        }
        android.view.LayoutInflater.from(context).inflate(2131560948, this);
        int i4 = 2131362542;
        com.google.android.material.button.MaterialButton o = df0.qux.o(2131362542, this);
        if (o != null) {
            i4 = 2131362543;
            com.google.android.material.button.MaterialButton o2 = df0.qux.o(2131362543, this);
            if (o2 != null) {
                i4 = 2131362835;
                com.google.android.material.card.MaterialCardView o3 = df0.qux.o(2131362835, this);
                if (o3 != null) {
                    i4 = 2131363956;
                    if (df0.qux.o(2131363956, this) != null) {
                        i4 = 2131364845;
                        android.widget.ImageView imageView = (android.widget.ImageView) df0.qux.o(2131364845, this);
                        if (imageView != null) {
                            i4 = 2131367174;
                            android.widget.TextView textView = (android.widget.TextView) df0.qux.o(2131367174, this);
                            if (textView != null) {
                                i4 = 2131367175;
                                if (((android.widget.TextView) df0.qux.o(2131367175, this)) != null) {
                                    d41.a aVar = new d41.a(this, o, o2, o3, imageView, textView);
                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(aVar, "inflate(...)");
                                    this.c = aVar;
                                    final int i5 = 0;
                                    o2.setOnClickListener(new android.view.View.OnClickListener(this) { // from class: ta1.qux
                                        public final /* synthetic */ com.truecaller.details_view.ui.businessAwareness.BusinessAwarenessView b;

                                        {
                                            this.b = this;
                                        }

                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(android.view.View view) {
                                            int i6 = i5;
                                            com.truecaller.details_view.ui.businessAwareness.BusinessAwarenessView businessAwarenessView = this.b;
                                            switch (i6) {
                                                case 0:
                                                    int i7 = com.truecaller.details_view.ui.businessAwareness.BusinessAwarenessView.e;
                                                    ac0.qux presenter = businessAwarenessView.getPresenter();
                                                    ((gg0.d) ((qc3.bar) presenter.c).get()).a.c0("show_business_awareness_card", true);
                                                    ta1.baz bazVar = (ta1.baz) ((com.truecaller.sdk.bar) presenter).a;
                                                    if (bazVar != null) {
                                                        gj.m.k0((com.truecaller.details_view.ui.businessAwareness.BusinessAwarenessView) bazVar, false);
                                                    }
                                                    qa1.a aVar2 = (qa1.a) ((qa1.baz) ((qc3.bar) presenter.d).get());
                                                    java.lang.String str = aVar2.h;
                                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "context");
                                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter("BizAwarenessOk", "subAction");
                                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter("Click", "action");
                                                    nc0.u1.e(new rc0.b("Click", "BizAwarenessOk", str), aVar2.a);
                                                    return;
                                                default:
                                                    int i8 = com.truecaller.details_view.ui.businessAwareness.BusinessAwarenessView.e;
                                                    ac0.qux presenter2 = businessAwarenessView.getPresenter();
                                                    ta1.baz bazVar2 = (ta1.baz) ((com.truecaller.sdk.bar) presenter2).a;
                                                    if (bazVar2 != null) {
                                                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("https://www.truecaller.com/blog/features/truecaller-launches-verified-businesses", "learnMoreUrl");
                                                        i61.bar.t(gj.m.a0((com.truecaller.details_view.ui.businessAwareness.BusinessAwarenessView) bazVar2), "https://www.truecaller.com/blog/features/truecaller-launches-verified-businesses");
                                                    }
                                                    qa1.a aVar3 = (qa1.a) ((qa1.baz) ((qc3.bar) presenter2.d).get());
                                                    java.lang.String str2 = aVar3.h;
                                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "context");
                                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter("BizAwarenessLearnMore", "subAction");
                                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter("Click", "action");
                                                    nc0.u1.e(new rc0.b("Click", "BizAwarenessLearnMore", str2), aVar3.a);
                                                    return;
                                            }
                                        }
                                    });
                                    o.setOnClickListener(new android.view.View.OnClickListener(this) { // from class: ta1.qux
                                        public final /* synthetic */ com.truecaller.details_view.ui.businessAwareness.BusinessAwarenessView b;

                                        {
                                            this.b = this;
                                        }

                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(android.view.View view) {
                                            int i6 = i3;
                                            com.truecaller.details_view.ui.businessAwareness.BusinessAwarenessView businessAwarenessView = this.b;
                                            switch (i6) {
                                                case 0:
                                                    int i7 = com.truecaller.details_view.ui.businessAwareness.BusinessAwarenessView.e;
                                                    ac0.qux presenter = businessAwarenessView.getPresenter();
                                                    ((gg0.d) ((qc3.bar) presenter.c).get()).a.c0("show_business_awareness_card", true);
                                                    ta1.baz bazVar = (ta1.baz) ((com.truecaller.sdk.bar) presenter).a;
                                                    if (bazVar != null) {
                                                        gj.m.k0((com.truecaller.details_view.ui.businessAwareness.BusinessAwarenessView) bazVar, false);
                                                    }
                                                    qa1.a aVar2 = (qa1.a) ((qa1.baz) ((qc3.bar) presenter.d).get());
                                                    java.lang.String str = aVar2.h;
                                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "context");
                                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter("BizAwarenessOk", "subAction");
                                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter("Click", "action");
                                                    nc0.u1.e(new rc0.b("Click", "BizAwarenessOk", str), aVar2.a);
                                                    return;
                                                default:
                                                    int i8 = com.truecaller.details_view.ui.businessAwareness.BusinessAwarenessView.e;
                                                    ac0.qux presenter2 = businessAwarenessView.getPresenter();
                                                    ta1.baz bazVar2 = (ta1.baz) ((com.truecaller.sdk.bar) presenter2).a;
                                                    if (bazVar2 != null) {
                                                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("https://www.truecaller.com/blog/features/truecaller-launches-verified-businesses", "learnMoreUrl");
                                                        i61.bar.t(gj.m.a0((com.truecaller.details_view.ui.businessAwareness.BusinessAwarenessView) bazVar2), "https://www.truecaller.com/blog/features/truecaller-launches-verified-businesses");
                                                    }
                                                    qa1.a aVar3 = (qa1.a) ((qa1.baz) ((qc3.bar) presenter2.d).get());
                                                    java.lang.String str2 = aVar3.h;
                                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "context");
                                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter("BizAwarenessLearnMore", "subAction");
                                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter("Click", "action");
                                                    nc0.u1.e(new rc0.b("Click", "BizAwarenessLearnMore", str2), aVar3.a);
                                                    return;
                                            }
                                        }
                                    });
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(getResources().getResourceName(i4)));
    }
}
