package com.truecaller.common.ui.fab;

/* loaded from: /home/user/tc_decoded/classes2.dex */
public final class FloatingActionButton extends android.widget.FrameLayout implements android.view.View.OnClickListener, android.view.View.OnLongClickListener {
    public static final /* synthetic */ int n = 0;
    public final android.util.AttributeSet a;
    public final androidx.appcompat.widget.AppCompatImageView b;
    public final android.widget.LinearLayout c;
    public final android.view.View d;
    public f41.a[] e;
    public boolean f;
    public int g;
    public final int h;
    public boolean i;
    public boolean j;
    public boolean k;
    public final int l;
    public f41.bar m;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FloatingActionButton(android.content.Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void a(boolean z) {
        androidx.appcompat.widget.AppCompatImageView appCompatImageView = this.b;
        int right = (appCompatImageView.getRight() + appCompatImageView.getLeft()) / 2;
        int bottom = (appCompatImageView.getBottom() + appCompatImageView.getTop()) / 2;
        android.view.View view = this.d;
        if (z) {
            android.animation.Animator createCircularReveal = android.view.ViewAnimationUtils.createCircularReveal(view, right, bottom, 0.0f, java.lang.Math.max(view.getHeight(), view.getWidth()));
            view.setVisibility(0);
            createCircularReveal.start();
        } else {
            f41.b bVar = new f41.b(this, 0);
            android.animation.Animator createCircularReveal2 = android.view.ViewAnimationUtils.createCircularReveal(view, right, bottom, java.lang.Math.max(view.getWidth(), view.getHeight()), 0.0f);
            createCircularReveal2.addListener(bVar);
            createCircularReveal2.start();
        }
    }

    public final void b(android.view.View view, int i, boolean z) {
        f41.a[] aVarArr = this.e;
        if (aVarArr != null) {
            android.view.ViewPropertyAnimator animate = view.animate();
            if (!z ? i == 0 : i == aVarArr.length - 1) {
                animate.setListener(new f41.b(this, 1));
            }
            android.view.View findViewById = view.findViewById(2131363801);
            int i2 = this.h;
            int i3 = this.l;
            if (z) {
                view.setTranslationY(i2 * (aVarArr.length - i));
                findViewById.setAlpha(0.0f);
                long j = (i * i3) / 8;
                animate.setStartDelay(j);
                long j2 = i3;
                animate.translationY(0.0f).setInterpolator(new android.view.animation.OvershootInterpolator(1.5f)).setDuration(j2);
                android.view.ViewPropertyAnimator animate2 = findViewById.animate();
                animate2.setStartDelay(j);
                animate2.alpha(1.0f).setInterpolator(new android.view.animation.DecelerateInterpolator()).setDuration(j2);
                if (this.k) {
                    android.view.View findViewById2 = view.findViewById(2131363800);
                    findViewById2.setAlpha(0.0f);
                    android.view.ViewPropertyAnimator animate3 = findViewById2.animate();
                    animate3.setStartDelay(j);
                    animate3.alpha(1.0f).setInterpolator(new android.view.animation.DecelerateInterpolator()).setDuration(j2);
                    return;
                }
                return;
            }
            int i4 = i + 1;
            animate.setStartDelay(((aVarArr.length - i4) * i3) / 8);
            long j3 = i3;
            animate.translationY(i2 * (aVarArr.length - i)).setInterpolator(new android.view.animation.AccelerateInterpolator()).setDuration(j3);
            android.view.ViewPropertyAnimator animate4 = findViewById.animate();
            animate4.setStartDelay(((aVarArr.length - i4) * i3) / 8);
            animate4.alpha(0.0f).setInterpolator(new android.view.animation.AccelerateInterpolator()).setDuration(j3);
            if (this.k) {
                android.view.ViewPropertyAnimator animate5 = view.findViewById(2131363800).animate();
                animate5.setStartDelay(((aVarArr.length - i4) * i3) / 8);
                animate5.alpha(0.0f).setInterpolator(new android.view.animation.AccelerateInterpolator()).setDuration(j3);
            }
        }
    }

    public final void c() {
        f41.a[] aVarArr;
        if (this.j && !this.f && (aVarArr = this.e) != null) {
            this.f = true;
            f41.bar barVar = this.m;
            if (barVar != null) {
                barVar.m2();
            }
            android.widget.LinearLayout linearLayout = this.c;
            int childCount = linearLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                android.view.View childAt = linearLayout.getChildAt(i);
                kotlin.jvm.internal.Intrinsics.d(childAt);
                b(childAt, i, false);
            }
            ea.i iVar = new ea.i(this, 9);
            long j = this.l;
            postDelayed(iVar, ((aVarArr.length * r2) / 8) + j);
            a(false);
            this.b.animate().rotation(0.0f).setInterpolator(new android.view.animation.OvershootInterpolator()).setDuration(j);
            this.j = false;
        }
    }

    public final void d() {
        f41.a[] aVarArr;
        if (this.f || (aVarArr = this.e) == null) {
            return;
        }
        this.f = true;
        android.view.LayoutInflater from = android.view.LayoutInflater.from(getContext());
        int s = bi3.a.s(getContext(), 2130971058);
        android.widget.LinearLayout linearLayout = this.c;
        linearLayout.removeAllViews();
        int length = aVarArr.length;
        for (int i = 0; i < length; i++) {
            f41.a aVar = aVarArr[i];
            android.view.View inflate = from.inflate(this.g, (android.view.ViewGroup) linearLayout, false);
            android.widget.ImageView imageView = (android.widget.ImageView) inflate.findViewById(2131363800);
            android.view.View findViewById = inflate.findViewById(2131363801);
            kotlin.jvm.internal.Intrinsics.e(findViewById, "null cannot be cast to non-null type android.widget.TextView");
            aVar.getClass();
            ((android.widget.TextView) findViewById).setText(2132022887);
            imageView.setImageResource(2131233235);
            int i2 = aVar.c;
            if (i2 != 0) {
                android.content.res.ColorStateList valueOf = android.content.res.ColorStateList.valueOf(i2);
                java.util.WeakHashMap weakHashMap = u6.t0.a;
                u6.k0.i(imageView, valueOf);
            }
            int i3 = aVar.b;
            if (i3 == 0) {
                i3 = s;
            }
            imageView.setColorFilter(i3, android.graphics.PorterDuff.Mode.SRC_IN);
            inflate.setOnClickListener(new d11.d(this, aVarArr, i, 1));
            linearLayout.addView(inflate);
            b(inflate, i, true);
        }
        e();
        linearLayout.setVisibility(0);
        a(true);
        this.j = true;
    }

    public final void e() {
        f41.a[] aVarArr = this.e;
        if (aVarArr == null) {
            return;
        }
        android.widget.LinearLayout linearLayout = this.c;
        android.view.ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
        kotlin.jvm.internal.Intrinsics.e(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) layoutParams;
        layoutParams2.height = this.h * aVarArr.length;
        linearLayout.setLayoutParams(layoutParams2);
        boolean z = this.k;
        androidx.appcompat.widget.AppCompatImageView appCompatImageView = this.b;
        if (z) {
            linearLayout.setTranslationY(0.0f);
            linearLayout.setTranslationX(-appCompatImageView.getMeasuredWidth());
        } else {
            linearLayout.setTranslationY(-appCompatImageView.getMeasuredHeight());
            linearLayout.setTranslationX(0.0f);
        }
    }

    @org.jetbrains.annotations.Nullable
    public final android.util.AttributeSet getAttrs() {
        return this.a;
    }

    @org.jetbrains.annotations.NotNull
    public final android.view.View getButtonView() {
        return this.b;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        f41.a[] aVarArr;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "v");
        if (this.i && (aVarArr = this.e) != null && aVarArr.length != 0) {
            if (this.j) {
                c();
            } else {
                d();
            }
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(android.content.res.Configuration configuration) {
        boolean z;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        if (configuration.orientation == 2) {
            z = true;
        } else {
            z = false;
        }
        this.k = z;
        if (this.j) {
            e();
        }
        requestLayout();
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "v");
        return true;
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        android.graphics.drawable.Drawable drawable = getContext().getDrawable(2131231834);
        if (drawable != null) {
            drawable.setColorFilter(i, android.graphics.PorterDuff.Mode.MULTIPLY);
        }
        this.b.setBackground(drawable);
    }

    public final void setDrawable(@org.jetbrains.annotations.Nullable android.graphics.drawable.Drawable drawable) {
        this.b.setImageDrawable(drawable);
    }

    public final void setFabActionListener(@org.jetbrains.annotations.Nullable f41.bar barVar) {
        this.m = barVar;
    }

    public final void setIconTintColor(@org.jetbrains.annotations.Nullable java.lang.Integer num) {
        android.content.res.ColorStateList valueOf;
        if (num == null) {
            valueOf = null;
        } else {
            valueOf = android.content.res.ColorStateList.valueOf(num.intValue());
        }
        this.b.setImageTintList(valueOf);
    }

    public final void setMenuItemLayout(int i) {
        this.g = i;
    }

    public final void setMenuItems(@org.jetbrains.annotations.Nullable f41.a[] aVarArr) {
        this.e = aVarArr;
    }

    @Override // android.view.View
    @kotlin.a
    public void setOnClickListener(@org.jetbrains.annotations.Nullable android.view.View.OnClickListener onClickListener) {
    }

    public final void setOpenMenuOnClick(boolean z) {
        this.i = z;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FloatingActionButton(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FloatingActionButton(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.a = attributeSet;
        this.i = true;
        this.l = 300;
        android.view.LayoutInflater.from(context).inflate(2131559104, this);
        setClipChildren(false);
        this.k = getResources().getConfiguration().orientation == 2;
        androidx.appcompat.widget.AppCompatImageView findViewById = findViewById(2131363798);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        androidx.appcompat.widget.AppCompatImageView appCompatImageView = findViewById;
        this.b = appCompatImageView;
        android.view.View findViewById2 = findViewById(2131363799);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) findViewById2;
        this.c = linearLayout;
        android.view.View findViewById3 = findViewById(2131363796);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.d = findViewById3;
        if (attributeSet != null) {
            android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.truecaller.common.ui.R$styleable.d);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
            android.view.ViewGroup.LayoutParams layoutParams = appCompatImageView.getLayoutParams();
            kotlin.jvm.internal.Intrinsics.e(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) layoutParams;
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(9, -1);
            if (dimensionPixelSize != -1) {
                layoutParams2.bottomMargin = dimensionPixelSize;
            }
            int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(10, -1);
            if (dimensionPixelSize2 != -1) {
                layoutParams2.setMarginEnd(dimensionPixelSize2);
            }
            int dimensionPixelSize3 = obtainStyledAttributes.getDimensionPixelSize(8, -1);
            if (dimensionPixelSize3 != -1) {
                layoutParams2.width = dimensionPixelSize3;
            }
            int dimensionPixelSize4 = obtainStyledAttributes.getDimensionPixelSize(7, -1);
            if (dimensionPixelSize4 != -1) {
                layoutParams2.height = dimensionPixelSize4;
            }
            appCompatImageView.setLayoutParams(layoutParams2);
            android.view.ViewGroup.LayoutParams layoutParams3 = linearLayout.getLayoutParams();
            kotlin.jvm.internal.Intrinsics.e(layoutParams3, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            android.widget.FrameLayout.LayoutParams layoutParams4 = (android.widget.FrameLayout.LayoutParams) layoutParams3;
            int dimensionPixelSize5 = obtainStyledAttributes.getDimensionPixelSize(13, -1);
            if (dimensionPixelSize5 != -1) {
                layoutParams4.bottomMargin = dimensionPixelSize5;
            }
            int dimensionPixelSize6 = obtainStyledAttributes.getDimensionPixelSize(14, -1);
            if (dimensionPixelSize6 != -1) {
                layoutParams4.setMarginEnd(dimensionPixelSize6);
            }
            linearLayout.setLayoutParams(layoutParams4);
            this.g = obtainStyledAttributes.getResourceId(12, 2131559088);
            this.h = obtainStyledAttributes.getDimensionPixelSize(11, getResources().getDimensionPixelSize(2131165699));
            obtainStyledAttributes.recycle();
        }
        findViewById3.setOnClickListener(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.d(this, 18));
        appCompatImageView.setOnClickListener(this);
        appCompatImageView.setOnLongClickListener(this);
    }

    public /* synthetic */ FloatingActionButton(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
