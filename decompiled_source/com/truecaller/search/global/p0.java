package com.truecaller.search.global;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class p0 extends com.truecaller.ui.bar {
    public final com.bumptech.glide.j o;
    public final com.truecaller.search.global.a0 p;
    public final xf2.baz q;
    public final u03.baz r;
    public final com.truecaller.search.global.l s;
    public final qc3.bar t;
    public final u03.b0 u;

    public p0(com.bumptech.glide.j jVar, com.truecaller.search.global.a0 a0Var, xf2.baz bazVar, u03.baz bazVar2, com.truecaller.search.global.l lVar, qc3.bar barVar, u03.b0 b0Var) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jVar, "requestManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(a0Var, "presenter");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bazVar, "availabilityManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bazVar2, "clock");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lVar, "eventListener");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "messagingFeaturesInventory");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(b0Var, "resourceProvider");
        this.o = jVar;
        this.p = a0Var;
        this.q = bazVar;
        this.r = bazVar2;
        this.s = lVar;
        this.t = barVar;
        this.u = b0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.ui.bar
    public final void e(ey2.a aVar, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(aVar, "holder");
        ((com.truecaller.search.global.h0) this.p).a((com.truecaller.search.global.e1) aVar, i);
    }

    /* JADX WARN: Type inference failed for: r2v5, types: [androidx.recyclerview.widget.k2, ey2.a] */
    @Override // com.truecaller.ui.bar
    public final ey2.a g(android.view.ViewGroup viewGroup, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewGroup, "parent");
        android.view.LayoutInflater from = android.view.LayoutInflater.from(viewGroup.getContext());
        if (i == 2131364292) {
            return new com.truecaller.search.global.baz(from.inflate(2131560081, viewGroup, false));
        }
        if (i == 2131364285) {
            android.view.View inflate = from.inflate(2131560090, viewGroup, false);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
            return new com.truecaller.search.global.o0(inflate);
        }
        if (i != 2131364293 && i != 2131364295 && i != 2131364294 && i != 2131364296) {
            if (i != 2131364282 && i != 2131364283 && i != 2131364291) {
                if (i == 2131364288) {
                    android.content.Context context = viewGroup.getContext();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
                    androidx.constraintlayout.widget.ConstraintLayout inflate2 = android.view.LayoutInflater.from(context).inflate(2131560039, viewGroup, false);
                    int i2 = 2131364973;
                    com.truecaller.common.ui.listitem.ListItemX o = df0.qux.o(2131364973, inflate2);
                    if (o != null) {
                        i2 = 2131366513;
                        androidx.constraintlayout.widget.ConstraintLayout o2 = df0.qux.o(2131366513, inflate2);
                        if (o2 != null) {
                            int i3 = 2131364562;
                            android.widget.ImageView imageView = (android.widget.ImageView) df0.qux.o(2131364562, o2);
                            if (imageView != null) {
                                i3 = 2131366855;
                                android.widget.TextView textView = (android.widget.TextView) df0.qux.o(2131366855, o2);
                                if (textView != null) {
                                    i3 = 2131366899;
                                    android.widget.TextView textView2 = (android.widget.TextView) df0.qux.o(2131366899, o2);
                                    if (textView2 != null) {
                                        i3 = 2131366909;
                                        android.widget.TextView textView3 = (android.widget.TextView) df0.qux.o(2131366909, o2);
                                        if (textView3 != null) {
                                            i3 = 2131366910;
                                            android.widget.TextView textView4 = (android.widget.TextView) df0.qux.o(2131366910, o2);
                                            if (textView4 != null) {
                                                i3 = 2131366911;
                                                android.widget.TextView textView5 = (android.widget.TextView) df0.qux.o(2131366911, o2);
                                                if (textView5 != null) {
                                                    do1.a aVar = new do1.a(o2, imageView, textView, textView2, textView3, textView4, textView5, 7);
                                                    i2 = 2131366514;
                                                    android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) df0.qux.o(2131366514, inflate2);
                                                    if (linearLayout != null) {
                                                        d41.a aVar2 = new d41.a(inflate2, o, aVar, linearLayout, 7);
                                                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(aVar2, "inflate(...)");
                                                        return new com.truecaller.search.global.w0(aVar2, this.q, this.r, this.o, this.s);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            throw new java.lang.NullPointerException("Missing required view with ID: ".concat(o2.getResources().getResourceName(i3)));
                        }
                    }
                    throw new java.lang.NullPointerException("Missing required view with ID: ".concat(inflate2.getResources().getResourceName(i2)));
                }
                if (i == 2131364289) {
                    android.view.View inflate3 = from.inflate(2131561055, viewGroup, false);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(inflate3, "inflate(...)");
                    return new com.truecaller.search.global.o0(inflate3);
                }
                if (i == 2131364281) {
                    return new com.truecaller.search.global.a(from.inflate(2131558550, viewGroup, false));
                }
                u03.b0 b0Var = this.u;
                qc3.bar barVar = this.t;
                if (i == 2131364286) {
                    if (((qo1.k) barVar.get()).e()) {
                        android.view.View inflate4 = from.inflate(2131561046, viewGroup, false);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(inflate4, "inflate(...)");
                        return new com.truecaller.search.global.j1(inflate4, b0Var);
                    }
                    android.view.View inflate5 = from.inflate(2131561046, viewGroup, false);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(inflate5, "inflate(...)");
                    return new com.truecaller.search.global.o0(inflate5);
                }
                if (i == 2131364287) {
                    if (((qo1.k) barVar.get()).e()) {
                        android.view.View inflate6 = from.inflate(2131561047, viewGroup, false);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(inflate6, "inflate(...)");
                        return new com.truecaller.search.global.j1(inflate6, b0Var);
                    }
                    android.view.View inflate7 = from.inflate(2131561047, viewGroup, false);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(inflate7, "inflate(...)");
                    return new com.truecaller.search.global.o0(inflate7);
                }
                if (i == 2131364284) {
                    android.view.View inflate8 = from.inflate(2131559801, viewGroup, false);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(inflate8, "inflate(...)");
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inflate8, "view");
                    ?? k2Var = new androidx.recyclerview.widget.k2(inflate8);
                    android.widget.TextView textView6 = (android.widget.TextView) inflate8.findViewById(2131367033);
                    textView6.setText(inflate8.getContext().getResources().getString(2132021676));
                    textView6.setTextAppearance(2132083572);
                    androidx.appcompat.widget.AppCompatImageView findViewById = inflate8.findViewById(2131362418);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
                    android.view.View findViewById2 = inflate8.findViewById(2131366692);
                    android.widget.TextView textView7 = (android.widget.TextView) findViewById2;
                    textView7.setText(inflate8.getContext().getResources().getString(2132021675));
                    textView7.setTextAppearance(2132083575);
                    d6.a layoutParams = textView7.getLayoutParams();
                    kotlin.jvm.internal.Intrinsics.e(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                    d6.a aVar3 = layoutParams;
                    aVar3.k = findViewById.getId();
                    textView7.setLayoutParams(aVar3);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById2, "apply(...)");
                    return k2Var;
                }
                if (i == 2131364290) {
                    android.view.View inflate9 = from.inflate(2131559855, viewGroup, false);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(inflate9, "inflate(...)");
                    return new com.truecaller.search.global.o0(inflate9);
                }
                throw new java.lang.IllegalArgumentException(bar.k(i, "Cannot create viewholder for view type "));
            }
            android.content.Context context2 = viewGroup.getContext();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            com.truecaller.common.ui.listitem.ListItemX listItemX = new com.truecaller.common.ui.listitem.ListItemX(context2, (android.util.AttributeSet) null, 0, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null);
            listItemX.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -2));
            return new com.truecaller.search.global.n0(listItemX, this.q, this.r, this.o, this.s, null);
        }
        android.view.View inflate10 = from.inflate(2131561088, viewGroup, false);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(inflate10, "inflate(...)");
        return new com.truecaller.search.global.o0(inflate10);
    }

    public final int getItemCount() {
        return ((com.truecaller.search.global.h0) this.p).r0.g();
    }

    @Override // com.truecaller.ui.bar
    public final int getItemViewType(int i) {
        return ((com.truecaller.search.global.h0) this.p).r0.h(i);
    }
}
