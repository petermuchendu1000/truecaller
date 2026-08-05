package com.truecaller.common.ui.banner;

/* loaded from: /home/user/tc_decoded/classes2.dex */
public class BannerViewX extends android.widget.FrameLayout implements bd3.qux {
    public static final /* synthetic */ int j = 0;
    public yc3.d a;
    public final boolean b;
    public qc3.bar c;
    public final kotlin.Lazy d;
    public final kotlin.Lazy e;
    public final kotlin.Lazy f;
    public final kotlin.Lazy g;
    public final kotlin.Lazy h;
    public final kotlin.Lazy i;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BannerViewX(android.content.Context context) {
        this(context, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    public static void e(com.truecaller.common.ui.banner.BannerViewX bannerViewX) {
        bannerViewX.getTitle().setCompoundDrawablePadding(bd.bar.q(4));
        bannerViewX.getTitle().setCompoundDrawablesRelativeWithIntrinsicBounds(2131233714, 0, 0, 0);
    }

    private final android.widget.Button getButtonPrimary() {
        return (android.widget.Button) this.e.getValue();
    }

    private final android.widget.Button getButtonSecondary() {
        return (android.widget.Button) this.f.getValue();
    }

    private final android.widget.ImageView getImage() {
        return (android.widget.ImageView) this.g.getValue();
    }

    private final androidx.constraintlayout.widget.ConstraintLayout getParentConstraint() {
        return (androidx.constraintlayout.widget.ConstraintLayout) this.d.getValue();
    }

    private final android.widget.TextView getSubtitle() {
        return (android.widget.TextView) this.h.getValue();
    }

    private final android.widget.TextView getTitle() {
        return (android.widget.TextView) this.i.getValue();
    }

    private final void setImageHeight(float f) {
        android.widget.ImageView image = getImage();
        d6.a layoutParams = getImage().getLayoutParams();
        kotlin.jvm.internal.Intrinsics.e(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        d6.a aVar = layoutParams;
        ((android.view.ViewGroup.MarginLayoutParams) aVar).height = (int) f;
        image.setLayoutParams(aVar);
    }

    private final void setImageWidth(float f) {
        android.widget.ImageView image = getImage();
        d6.a layoutParams = getImage().getLayoutParams();
        kotlin.jvm.internal.Intrinsics.e(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        d6.a aVar = layoutParams;
        ((android.view.ViewGroup.MarginLayoutParams) aVar).width = (int) f;
        image.setLayoutParams(aVar);
    }

    private final void setSubtitleLinkify(java.lang.String str) {
        getSubtitle().setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
        if (str != null) {
            getSubtitle().setText(a0.q.e(str));
        }
    }

    public final java.lang.Object X3() {
        if (this.a == null) {
            this.a = new yc3.d(this);
        }
        return this.a.X3();
    }

    public final void a() {
        d6.j jVar = new d6.j();
        jVar.e(getParentConstraint());
        jVar.f(2131364553, 4, 2131365637, 4);
        jVar.b(getParentConstraint());
    }

    public final void b(java.lang.String str, android.graphics.drawable.Drawable drawable) {
        com.bumptech.glide.baz.f(this).q(str).k(drawable).e().P(getImage());
    }

    public final void c(java.lang.String str, kotlin.jvm.functions.Function1 function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "name");
        getButtonPrimary().setOnClickListener(new a41.bar(this, str, function1, 1));
    }

    public final void d(java.lang.String str, kotlin.jvm.functions.Function1 function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "name");
        getButtonSecondary().setOnClickListener(new a41.bar(this, str, function1, 0));
    }

    @org.jetbrains.annotations.NotNull
    public final qc3.bar getAnalytics() {
        qc3.bar barVar = this.c;
        if (barVar != null) {
            return barVar;
        }
        kotlin.jvm.internal.Intrinsics.n("analytics");
        throw null;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        if (getBackground() == null) {
            setBackgroundResource(2131231326);
        }
    }

    public final void setAnalytics(@org.jetbrains.annotations.NotNull qc3.bar barVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "<set-?>");
        this.c = barVar;
    }

    public final void setImage(@org.jetbrains.annotations.Nullable android.graphics.drawable.Drawable drawable) {
        getImage().setImageDrawable(drawable);
    }

    public final void setImageResource(int i) {
        getImage().setImageResource(i);
    }

    public final void setImageVisible(boolean z) {
        android.widget.ImageView image = getImage();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(image, "<get-image>(...)");
        gj.m.k0(image, z);
    }

    public final void setPrimaryButtonText(@org.jetbrains.annotations.Nullable java.lang.String str) {
        boolean z;
        android.widget.Button buttonPrimary = getButtonPrimary();
        kotlin.jvm.internal.Intrinsics.d(buttonPrimary);
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        gj.m.k0(buttonPrimary, true ^ z);
        buttonPrimary.setText(str);
    }

    public final void setSecondaryButtonText(@org.jetbrains.annotations.Nullable java.lang.String str) {
        boolean z;
        android.widget.Button buttonSecondary = getButtonSecondary();
        kotlin.jvm.internal.Intrinsics.d(buttonSecondary);
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        gj.m.k0(buttonSecondary, true ^ z);
        buttonSecondary.setText(str);
    }

    public final void setSubtitle(@org.jetbrains.annotations.NotNull java.lang.CharSequence charSequence) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "text");
        getSubtitle().setText(charSequence);
    }

    public final void setSubtitleColor(int i) {
        getSubtitle().setTextColor(i);
    }

    public final void setSubtitleWithLink(@org.jetbrains.annotations.NotNull android.text.SpannableString spannableString) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(spannableString, "text");
        getSubtitle().setText(spannableString);
        getSubtitle().setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
    }

    public final void setTitle(@org.jetbrains.annotations.NotNull java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "text");
        getTitle().setText(str);
    }

    public final void setTitleColor(int i) {
        getTitle().setTextColor(i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BannerViewX(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BannerViewX(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        if (!isInEditMode() && !this.b) {
            this.b = true;
            this.c = cd3.baz.a(((a41.baz) X3()).c.Y);
        }
        this.d = gj.m.I(2131365637, this);
        this.e = gj.m.I(2131362662, this);
        this.f = gj.m.I(2131362669, this);
        this.g = gj.m.I(2131364553, this);
        this.h = gj.m.I(2131366692, this);
        this.i = gj.m.I(2131367033, this);
        android.view.View.inflate(context, 2131559997, this);
        if (attributeSet != null) {
            android.content.res.TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, com.truecaller.common.ui.R$styleable.b, 0, 0);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
            try {
                java.lang.String string = obtainStyledAttributes.getString(7);
                if (string != null) {
                    setTitle(string);
                }
                android.graphics.drawable.Drawable drawable = obtainStyledAttributes.getDrawable(0);
                if (drawable != null) {
                    setImage(drawable);
                }
                setImageHeight(obtainStyledAttributes.getDimension(1, getResources().getDimension(2131165446)));
                setImageWidth(obtainStyledAttributes.getDimension(2, getResources().getDimension(2131165447)));
                setPrimaryButtonText(obtainStyledAttributes.getString(3));
                setSecondaryButtonText(obtainStyledAttributes.getString(4));
                java.lang.String string2 = obtainStyledAttributes.getString(5);
                if (string2 != null) {
                    android.content.Context context2 = getContext();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                    setSubtitle(ak.r0.k(context2, string2));
                }
                boolean z = obtainStyledAttributes.getBoolean(6, false);
                java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z);
                if (!z) {
                    valueOf = null;
                }
                if (valueOf != null) {
                    setSubtitleLinkify(string2);
                }
                obtainStyledAttributes.recycle();
            } catch (java.lang.Throwable th2) {
                obtainStyledAttributes.recycle();
                throw th2;
            }
        }
    }
}
