package com.truecaller.premium.ui;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class EntitledCallerIdPreviewView extends androidx.constraintlayout.widget.ConstraintLayout implements bd3.qux {
    public static final /* synthetic */ int y = 0;
    public yc3.d s;
    public final boolean t;
    public u03.f0 u;
    public final d91.u0 v;
    public final float w;
    public final com.truecaller.common.ui.b x;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EntitledCallerIdPreviewView(android.content.Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void setNumber(java.lang.String str) {
        d91.u0 u0Var = this.v;
        ((android.widget.TextView) u0Var.k).setText(str);
        android.widget.TextView textView = u0Var.j;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(textView, "nameTv");
        ge0.i.R(textView, this.w);
        android.widget.TextView textView2 = (android.widget.TextView) u0Var.k;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(textView2, "numberTv");
        gj.m.j0(textView2);
    }

    private final void setPlanDuration(java.lang.String str) {
        android.widget.TextView textView = (android.widget.TextView) this.v.l;
        textView.setText(str);
        gj.m.j0(textView);
    }

    private final void setPlanName(java.lang.String str) {
        android.widget.TextView textView = this.v.m;
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
    public final u03.f0 getResourceProvider() {
        u03.f0 f0Var = this.u;
        if (f0Var != null) {
            return f0Var;
        }
        kotlin.jvm.internal.Intrinsics.n("resourceProvider");
        throw null;
    }

    public final void setAvatarAndTextClickListener(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "onClick");
        d91.u0 u0Var = this.v;
        u0Var.e.setOnClickListener(new be2.bar(0, function0));
        ((android.widget.LinearLayout) u0Var.i).setOnClickListener(new be2.bar(1, function0));
    }

    public final void setLifecycleOwner(@org.jetbrains.annotations.NotNull androidx.lifecycle.d0 d0Var) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(d0Var, "lifecycleOwner");
        this.v.g.setLifecycleOwner(d0Var);
    }

    public final void setPremiumPlanClickListener(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "onClick");
        d91.u0 u0Var = this.v;
        u0Var.m.setOnClickListener(new be2.bar(2, function0));
        ((android.widget.TextView) u0Var.l).setOnClickListener(new be2.bar(3, function0));
        u0Var.b.setOnClickListener(new be2.bar(4, function0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setPreviewData(@org.jetbrains.annotations.NotNull w82.t tVar) {
        boolean z;
        java.lang.String str;
        android.graphics.drawable.Drawable drawable;
        java.lang.Integer num;
        int i;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tVar, "entitledCallerIdPreviewData");
        com.truecaller.premium.data.tier.PremiumTierType premiumTierType = tVar.f;
        java.lang.String str2 = tVar.a;
        boolean E = f40.d0.E(premiumTierType);
        d91.u0 u0Var = this.v;
        if (E) {
            com.truecaller.common.ui.f fVar = new com.truecaller.common.ui.f(getResourceProvider());
            fVar.setCornerRadius(fVar.a.c(2131166787));
            setBackground(fVar);
            com.truecaller.common.ui.ShineView shineView = u0Var.g;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(shineView, "goldShine");
            gj.m.j0(shineView);
            u0Var.j.setTextColor(getResourceProvider().b(2131101948));
            ((android.widget.TextView) u0Var.k).setTextColor(getResourceProvider().b(2131101398));
            u0Var.m.setTextColor(getResourceProvider().b(2131101948));
            ((android.widget.TextView) u0Var.l).setTextColor(getResourceProvider().b(2131101398));
            u0Var.c.setBackgroundColor(getResourceProvider().b(2131101337));
            ((android.widget.ImageView) u0Var.h).setImageTintList(android.content.res.ColorStateList.valueOf(getResourceProvider().b(2131101948)));
            z = true;
        } else {
            setBackground(getResourceProvider().d(2131231222));
            com.truecaller.common.ui.ShineView shineView2 = u0Var.g;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(shineView2, "goldShine");
            gj.m.f0(shineView2);
            u0Var.j.setTextColor(getResourceProvider().b(2131101947));
            ((android.widget.TextView) u0Var.k).setTextColor(getResourceProvider().b(2131101392));
            u0Var.m.setTextColor(getResourceProvider().b(2131101947));
            ((android.widget.TextView) u0Var.l).setTextColor(getResourceProvider().b(2131101392));
            u0Var.c.setBackgroundColor(getResourceProvider().b(2131101335));
            ((android.widget.ImageView) u0Var.h).setImageTintList(android.content.res.ColorStateList.valueOf(getResourceProvider().b(2131101947)));
            z = false;
        }
        com.truecaller.common.ui.avatar.AvatarXView avatarXView = u0Var.e;
        com.truecaller.common.ui.b bVar = this.x;
        avatarXView.setPresenter(bVar);
        android.net.Uri uri = tVar.c;
        boolean z2 = tVar.g;
        java.lang.String str3 = tVar.b;
        java.lang.String y2 = gf0.e.y(str2);
        if (y2 != null) {
            java.lang.String upperCase = y2.toUpperCase(java.util.Locale.ROOT);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            str = upperCase;
        } else {
            str = null;
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(getResourceProvider().b(2131102053));
        if (!z) {
            num = valueOf;
            drawable = null;
        } else {
            drawable = null;
            num = null;
        }
        bVar.C2(new com.truecaller.common.ui.avatar.AvatarXConfig(uri, str3, str, false, false, false, false, z2, z, false, false, false, num, false, false, false, false, false, (java.lang.String) null, false, false, -25356), false);
        boolean z3 = tVar.k;
        boolean z4 = tVar.h;
        boolean z5 = tVar.j;
        android.widget.TextView textView = u0Var.j;
        textView.setText(str2);
        ge0.i.R(textView, this.w);
        gj.m.j0(textView);
        if (z3 && (!z4 || z5)) {
            if (z4) {
                i = 2131233607;
            } else if (z) {
                i = 2131233608;
            } else {
                i = 2131233606;
            }
            gj.m.c0(textView, i);
        } else {
            textView.setCompoundDrawables(drawable, drawable, drawable, drawable);
        }
        setNumber(tVar.b);
        setPlanDuration(tVar.e);
        setPlanName(tVar.d);
    }

    public final void setResourceProvider(@org.jetbrains.annotations.NotNull u03.f0 f0Var) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(f0Var, "<set-?>");
        this.u = f0Var;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EntitledCallerIdPreviewView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ EntitledCallerIdPreviewView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public EntitledCallerIdPreviewView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        if (!isInEditMode() && !this.t) {
            this.t = true;
            this.u = (u03.f0) ((be2.baz) X3()).c.q9.get();
        }
        android.view.LayoutInflater.from(context).inflate(2131561017, (android.view.ViewGroup) this);
        int i2 = 2131362395;
        com.truecaller.common.ui.avatar.AvatarXView o = df0.qux.o(2131362395, this);
        if (o != null) {
            i2 = 2131362507;
            android.view.View o2 = df0.qux.o(2131362507, this);
            if (o2 != null) {
                i2 = 2131363542;
                android.view.View o3 = df0.qux.o(2131363542, this);
                if (o3 != null) {
                    i2 = 2131364269;
                    androidx.appcompat.widget.AppCompatButton o4 = df0.qux.o(2131364269, this);
                    if (o4 != null) {
                        i2 = 2131364309;
                        com.truecaller.common.ui.ShineView o5 = df0.qux.o(2131364309, this);
                        if (o5 != null) {
                            i2 = 2131364361;
                            if (df0.qux.o(2131364361, this) != null) {
                                i2 = 2131365026;
                                android.widget.ImageView imageView = (android.widget.ImageView) df0.qux.o(2131365026, this);
                                if (imageView != null) {
                                    i2 = 2131365415;
                                    android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) df0.qux.o(2131365415, this);
                                    if (linearLayout != null) {
                                        i2 = 2131365422;
                                        android.widget.TextView textView = (android.widget.TextView) df0.qux.o(2131365422, this);
                                        if (textView != null) {
                                            i2 = 2131365541;
                                            android.widget.TextView textView2 = (android.widget.TextView) df0.qux.o(2131365541, this);
                                            if (textView2 != null) {
                                                i2 = 2131365742;
                                                android.widget.TextView textView3 = (android.widget.TextView) df0.qux.o(2131365742, this);
                                                if (textView3 != null) {
                                                    i2 = 2131365743;
                                                    android.widget.TextView textView4 = (android.widget.TextView) df0.qux.o(2131365743, this);
                                                    if (textView4 != null) {
                                                        d91.u0 u0Var = new d91.u0(this, o, o2, o3, o4, o5, imageView, linearLayout, textView, textView2, textView3, textView4);
                                                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(u0Var, "inflate(...)");
                                                        this.v = u0Var;
                                                        this.w = 1.35f;
                                                        this.x = new com.truecaller.common.ui.b(getResourceProvider());
                                                        return;
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
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
    }
}
