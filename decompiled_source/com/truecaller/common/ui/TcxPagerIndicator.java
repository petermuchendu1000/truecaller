package com.truecaller.common.ui;

/* loaded from: /home/user/tc_decoded/classes2.dex */
public final class TcxPagerIndicator extends android.view.View implements androidx.viewpager.widget.d {
    public final android.graphics.Paint a;
    public int b;
    public int c;
    public float d;
    public int e;
    public int f;
    public final float g;
    public final float h;
    public float i;
    public float j;
    public final float k;
    public final float l;
    public int m;
    public final boolean n;
    public final android.animation.ArgbEvaluator o;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TcxPagerIndicator(android.content.Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    public final int getCurrentPage() {
        return this.c;
    }

    @Override // android.view.View
    public int getMinimumHeight() {
        return (int) this.l;
    }

    @Override // android.view.View
    public int getMinimumWidth() {
        return (int) (((r0 - 1) * this.h) + (this.k * this.b));
    }

    public final int getNumberOfPages() {
        return this.b;
    }

    @Override // android.view.View
    public final void onDraw(android.graphics.Canvas canvas) {
        boolean z;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        float f = this.i;
        int i = this.b;
        float f2 = f;
        int i2 = 0;
        while (i2 < i) {
            int i3 = this.c;
            if (i2 != i3 && (i2 >= i3 || !this.n)) {
                z = false;
            } else {
                z = true;
            }
            android.graphics.Paint paint = this.a;
            if (z) {
                kotlin.jvm.internal.Intrinsics.d(paint);
                java.lang.Object evaluate = this.o.evaluate(this.d, java.lang.Integer.valueOf(this.e), java.lang.Integer.valueOf(this.f));
                kotlin.jvm.internal.Intrinsics.e(evaluate, "null cannot be cast to non-null type kotlin.Int");
                paint.setColor(((java.lang.Integer) evaluate).intValue());
            } else if (!z) {
                kotlin.jvm.internal.Intrinsics.d(paint);
                paint.setColor(this.f);
            } else {
                throw new java.lang.RuntimeException();
            }
            float f3 = this.j;
            float f4 = this.k;
            float f5 = f3 + this.l;
            kotlin.jvm.internal.Intrinsics.d(paint);
            float f6 = this.g;
            android.graphics.Canvas canvas2 = canvas;
            canvas2.drawRoundRect(f2, f3, f2 + f4, f5, f6, f6, paint);
            f2 += this.h + f4;
            i2++;
            canvas = canvas2;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(android.view.View.resolveSizeAndState(getMinimumWidth() + getPaddingRight() + getPaddingLeft(), i, 1), android.view.View.resolveSizeAndState(getMinimumHeight() + getPaddingBottom() + getPaddingTop(), i2, 1));
    }

    public final void onPageScrollStateChanged(int i) {
    }

    public final void onPageScrolled(int i, float f, int i2) {
        this.d = f;
        this.c = i - this.m;
        invalidate();
    }

    public final void onPageSelected(int i) {
        this.c = i - this.m;
        invalidate();
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.i = getPaddingLeft();
        this.j = getPaddingTop();
    }

    public final void setActiveColor(int i) {
        this.e = i;
        invalidate();
    }

    public final void setFirstPage(int i) {
        this.m = i;
    }

    public final void setInactiveColor(int i) {
        this.f = i;
        invalidate();
    }

    public final void setNumberOfPages(int i) {
        this.b = i;
        invalidate();
        requestLayout();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TcxPagerIndicator(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TcxPagerIndicator(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.g = 6.0f;
        this.o = new android.animation.ArgbEvaluator();
        android.content.res.TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, com.truecaller.common.ui.R$styleable.j, 0, 0);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
        android.graphics.Paint paint = new android.graphics.Paint(1);
        this.a = paint;
        paint.setStyle(android.graphics.Paint.Style.FILL);
        try {
            this.b = obtainStyledAttributes.getInteger(5, 0);
            this.e = obtainStyledAttributes.getColor(0, 0);
            this.f = obtainStyledAttributes.getColor(4, 0);
            this.g = obtainStyledAttributes.getDimensionPixelSize(1, 6);
            this.h = obtainStyledAttributes.getDimension(6, ak.r0.r(8.0f, context));
            this.k = obtainStyledAttributes.getDimension(7, ak.r0.r(16.0f, context));
            this.l = obtainStyledAttributes.getDimension(3, ak.r0.r(4.0f, context));
            this.n = obtainStyledAttributes.getBoolean(2, false);
            obtainStyledAttributes.recycle();
            this.c = 0;
            if (isInEditMode()) {
                setNumberOfPages(3);
                setFirstPage(0);
            }
        } catch (java.lang.Throwable th2) {
            obtainStyledAttributes.recycle();
            throw th2;
        }
    }

    public /* synthetic */ TcxPagerIndicator(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
