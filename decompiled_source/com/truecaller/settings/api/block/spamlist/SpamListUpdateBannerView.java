package com.truecaller.settings.api.block.spamlist;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class SpamListUpdateBannerView extends androidx.constraintlayout.widget.ConstraintLayout {
    public static final /* synthetic */ int A = 0;
    public final kotlin.Lazy s;
    public final u03.g0 t;
    public final int u;
    public final int v;
    public final int w;
    public final int x;
    public final int y;
    public final int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpamListUpdateBannerView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.s = kotlin.LazyKt.lazy(new l02.baz(25, context, this));
        this.t = new u03.g0(context);
        this.u = -1;
        this.v = -1;
        this.w = -1;
        this.x = -1;
        this.y = -1;
        this.z = -1;
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.truecaller.settings.api.R$styleable.a);
        this.u = obtainStyledAttributes.getResourceId(0, -1);
        this.v = obtainStyledAttributes.getResourceId(1, -1);
        this.w = obtainStyledAttributes.getResourceId(2, -1);
        this.x = obtainStyledAttributes.getResourceId(3, -1);
        this.y = obtainStyledAttributes.getResourceId(5, -1);
        this.z = obtainStyledAttributes.getResourceId(4, -1);
        obtainStyledAttributes.recycle();
    }

    private final qq2.bar getBinding() {
        return (qq2.bar) this.s.getValue();
    }

    public final void F(boolean z, boolean z2) {
        int i;
        int s;
        int i2;
        int i3;
        int s2;
        int i4;
        int i5;
        int s3;
        int i6;
        int i7;
        int i8;
        int i9 = this.u;
        if (i9 <= 0) {
            if (!z2 && z) {
                i9 = 2131231471;
            } else {
                i9 = 2131231473;
            }
        }
        u03.g0 g0Var = this.t;
        android.graphics.drawable.Drawable d = g0Var.d(i9);
        android.content.Context context = g0Var.a;
        int i10 = this.y;
        if (i10 > 0) {
            s = g0Var.b(i10);
        } else {
            if (!z2 && z) {
                i = 2130970335;
            } else {
                i = 2130970332;
            }
            s = bi3.a.s(context, i);
        }
        int i11 = this.x;
        if (i11 <= 0) {
            if (z) {
                i11 = 2131233286;
            } else {
                i11 = 2131232247;
            }
        }
        android.graphics.drawable.Drawable d2 = g0Var.d(i11);
        if (!z2 && z) {
            i2 = 2132023051;
        } else {
            i2 = 2132023056;
        }
        if (z2) {
            i3 = 2130970333;
        } else if (z) {
            i3 = 2130970336;
        } else {
            i3 = 2130970331;
        }
        int i12 = this.z;
        if (i12 > 0) {
            s2 = g0Var.b(i12);
        } else {
            s2 = bi3.a.s(context, i3);
        }
        if (z2) {
            i4 = 2132023055;
        } else if (z) {
            i4 = 2132023050;
        } else {
            i4 = 2132023054;
        }
        int i14 = 0;
        if (z2) {
            i5 = 2131232486;
        } else {
            i5 = 0;
        }
        int i15 = this.v;
        if (i15 <= 0) {
            i15 = 2131231474;
        }
        int i16 = this.w;
        if (i16 > 0) {
            s3 = g0Var.b(i16);
        } else {
            s3 = bi3.a.s(context, 2130970328);
        }
        getBinding().a.setBackground(d);
        android.widget.TextView textView = getBinding().g;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(textView, "updateButton");
        if (!z2 && z) {
            i6 = 0;
        } else {
            i6 = 8;
        }
        textView.setVisibility(i6);
        getBinding().g.setTextColor(s3);
        getBinding().g.setBackground(g0Var.d(i15));
        getBinding().f.setTextColor(s);
        getBinding().f.setText(i2);
        getBinding().e.setTextColor(s2);
        getBinding().e.setText(i4);
        getBinding().e.setCompoundDrawablesRelativeWithIntrinsicBounds(i5, 0, 0, 0);
        if (z2) {
            android.widget.TextView textView2 = getBinding().e;
            r6.baz bazVar = t41.i.a;
            android.graphics.drawable.Drawable[] compoundDrawablesRelative = textView2.getCompoundDrawablesRelative();
            for (android.graphics.drawable.Drawable drawable : compoundDrawablesRelative) {
                if (drawable != null) {
                    drawable.setTint(bi3.a.s(textView2.getContext(), 2130970333));
                }
            }
            textView2.setCompoundDrawablesRelative(compoundDrawablesRelative[0], compoundDrawablesRelative[1], compoundDrawablesRelative[2], compoundDrawablesRelative[3]);
        }
        android.widget.ImageView imageView = getBinding().d;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(imageView, "iconPremium");
        if (!z2) {
            i7 = 4;
        } else {
            i7 = 0;
        }
        imageView.setVisibility(i7);
        getBinding().d.setImageDrawable(bi3.a.u(2130970330, context));
        android.widget.ImageView imageView2 = getBinding().c;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(imageView2, "iconNonPremium");
        if (!z2) {
            i8 = 0;
        } else {
            i8 = 8;
        }
        imageView2.setVisibility(i8);
        getBinding().c.setImageDrawable(d2);
        android.widget.ImageView imageView3 = getBinding().b;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(imageView3, "iconForward");
        if (z2 || z) {
            i14 = 8;
        }
        imageView3.setVisibility(i14);
    }

    public final void setUpdateClickListener(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "onUpdateClicked");
        android.widget.TextView textView = getBinding().g;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(textView, "updateButton");
        mf0.o.F(textView, 300L, new a23.p(21, function0));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SpamListUpdateBannerView(android.content.Context context) {
        this(context, null, 0, 0);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SpamListUpdateBannerView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SpamListUpdateBannerView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }
}
