package com.truecaller.common.ui;

/* loaded from: /home/user/tc_decoded/classes2.dex */
public final class ShimmerLoadingView extends androidx.constraintlayout.widget.ConstraintLayout implements android.animation.ValueAnimator.AnimatorUpdateListener {
    public final long A;
    public final android.graphics.RectF s;
    public final android.graphics.Paint t;
    public final android.graphics.Matrix u;
    public android.animation.AnimatorSet v;
    public android.graphics.Canvas w;
    public android.graphics.Bitmap x;
    public final android.graphics.LinearGradient y;
    public final float z;

    @androidx.annotation.Keep
    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u000f\b\u0083\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R$\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00058F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR$\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00058F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR$\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00058F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000f\u0010\b\"\u0004\b\u0010\u0010\nR$\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00058F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\b\"\u0004\b\u0013\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/truecaller/common/ui/ShimmerLoadingView$AnimatableRectF;", "Landroid/graphics/RectF;", "<init>", "(Lcom/truecaller/common/ui/ShimmerLoadingView;)V", "value", "", "top", "getTop", "()F", "setTop", "(F)V", "bottom", "getBottom", "setBottom", "right", "getRight", "setRight", "left", "getLeft", "setLeft", "common-ui_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.LOWPOWERMODE_FIELD_NUMBER)
    /* loaded from: /home/user/tc_decoded/classes2.dex */
    public final class AnimatableRectF extends android.graphics.RectF {
        public AnimatableRectF() {
        }

        public final float getBottom() {
            return ((android.graphics.RectF) this).bottom;
        }

        public final float getLeft() {
            return ((android.graphics.RectF) this).left;
        }

        public final float getRight() {
            return ((android.graphics.RectF) this).right;
        }

        public final float getTop() {
            return ((android.graphics.RectF) this).top;
        }

        public final void setBottom(float f) {
            ((android.graphics.RectF) this).bottom = f;
        }

        public final void setLeft(float f) {
            ((android.graphics.RectF) this).left = f;
        }

        public final void setRight(float f) {
            ((android.graphics.RectF) this).right = f;
        }

        public final void setTop(float f) {
            ((android.graphics.RectF) this).top = f;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ShimmerLoadingView(android.content.Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void dispatchDraw(android.graphics.Canvas canvas) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (isInEditMode()) {
            super.dispatchDraw(canvas);
            return;
        }
        android.graphics.Canvas canvas2 = this.w;
        if (canvas2 != null) {
            android.graphics.Matrix matrix = this.u;
            matrix.reset();
            android.graphics.RectF rectF = this.s;
            matrix.setTranslate(rectF.left, 0.0f);
            android.graphics.LinearGradient linearGradient = this.y;
            if (linearGradient != null) {
                linearGradient.setLocalMatrix(matrix);
                super.dispatchDraw(canvas2);
                canvas2.drawRect(rectF, this.t);
                android.graphics.Bitmap bitmap = this.x;
                if (bitmap != null) {
                    canvas.drawBitmap(bitmap, 0.0f, 0.0f, (android.graphics.Paint) null);
                    return;
                } else {
                    kotlin.jvm.internal.Intrinsics.n("customBitmap");
                    throw null;
                }
            }
            kotlin.jvm.internal.Intrinsics.n("highlightLinearGradient");
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(valueAnimator, "valueAnimator");
        postInvalidate();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onAttachedToWindow() {
        super/*android.view.ViewGroup*/.onAttachedToWindow();
        android.animation.AnimatorSet animatorSet = this.v;
        if (animatorSet != null) {
            animatorSet.end();
        }
        android.animation.AnimatorSet animatorSet2 = this.v;
        if (animatorSet2 != null) {
            animatorSet2.start();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onDetachedFromWindow() {
        super/*android.view.ViewGroup*/.onDetachedFromWindow();
        android.animation.AnimatorSet animatorSet = this.v;
        if (animatorSet != null) {
            animatorSet.end();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float f3;
        super/*android.view.ViewGroup*/.onSizeChanged(i, i2, i3, i4);
        android.animation.AnimatorSet animatorSet = this.v;
        if (animatorSet != null) {
            animatorSet.end();
        }
        if (getWidth() != 0 && getHeight() != 0) {
            android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(getWidth(), getHeight(), android.graphics.Bitmap.Config.RGB_565);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(...)");
            this.x = createBitmap;
            android.graphics.Bitmap bitmap = this.x;
            if (bitmap != null) {
                this.w = new android.graphics.Canvas(bitmap);
                boolean z = z();
                float f4 = this.z;
                if (z) {
                    f = getWidth();
                } else {
                    f = -f4;
                }
                android.graphics.RectF rectF = this.s;
                rectF.left = f;
                float f5 = 0.0f;
                rectF.top = 0.0f;
                rectF.bottom = getHeight();
                if (z()) {
                    f2 = getWidth() + f4;
                } else {
                    f2 = 0.0f;
                }
                rectF.right = f2;
                android.animation.AnimatorSet animatorSet2 = new android.animation.AnimatorSet();
                animatorSet2.setStartDelay(200L);
                animatorSet2.setDuration(this.A);
                animatorSet2.setInterpolator(new w8.bar(1));
                int width = getWidth();
                float f6 = rectF.left;
                if (z()) {
                    f3 = -f4;
                } else {
                    f3 = width;
                }
                android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(rectF, "left", f6, f3);
                ofFloat.setRepeatCount(-1);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(ofFloat, "apply(...)");
                int width2 = getWidth();
                float f7 = rectF.right;
                if (!z()) {
                    f5 = width2 + f4;
                }
                android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(rectF, "right", f7, f5);
                ofFloat2.addUpdateListener(this);
                ofFloat2.setRepeatCount(-1);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(ofFloat2, "apply(...)");
                animatorSet2.playTogether(ofFloat, ofFloat2);
                if (getVisibility() == 0) {
                    animatorSet2.start();
                }
                this.v = animatorSet2;
                return;
            }
            kotlin.jvm.internal.Intrinsics.n("customBitmap");
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onVisibilityChanged(android.view.View view, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "changedView");
        super/*android.view.ViewGroup*/.onVisibilityChanged(view, i);
        if (i == 0) {
            android.animation.AnimatorSet animatorSet = this.v;
            if (animatorSet != null) {
                animatorSet.start();
                return;
            }
            return;
        }
        android.animation.AnimatorSet animatorSet2 = this.v;
        if (animatorSet2 != null) {
            animatorSet2.end();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ShimmerLoadingView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ShimmerLoadingView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.s = new com.truecaller.common.ui.ShimmerLoadingView.AnimatableRectF();
        android.graphics.Paint paint = new android.graphics.Paint();
        this.t = paint;
        this.u = new android.graphics.Matrix();
        this.v = new android.animation.AnimatorSet();
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.truecaller.common.ui.R$styleable.g);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
        int resourceId = obtainStyledAttributes.getResourceId(3, 0);
        float dimension = obtainStyledAttributes.getDimension(4, getResources().getDimension(2131166754));
        this.z = dimension;
        int color = obtainStyledAttributes.getColor(2, context.getColor(2131101157));
        int color2 = obtainStyledAttributes.getColor(1, context.getColor(2131101155));
        this.A = obtainStyledAttributes.getInt(0, 2500);
        obtainStyledAttributes.recycle();
        if (resourceId != 0) {
            android.view.LayoutInflater.from(getContext()).inflate(resourceId, (android.view.ViewGroup) this, true);
        }
        if (isInEditMode()) {
            return;
        }
        paint.setAntiAlias(true);
        paint.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.SRC_ATOP));
        android.graphics.LinearGradient linearGradient = new android.graphics.LinearGradient(0.0f, 0.0f, dimension, 0.0f, new int[]{color2, color, color2}, (float[]) null, android.graphics.Shader.TileMode.CLAMP);
        this.y = linearGradient;
        paint.setShader(linearGradient);
    }

    public /* synthetic */ ShimmerLoadingView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
