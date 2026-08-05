package com.truecaller.common.ui.onboarding;

/* loaded from: /home/user/tc_decoded/classes2.dex */
public final class OnboardingPageIndicatorX extends android.view.View implements android.animation.ValueAnimator.AnimatorUpdateListener {
    public final float a;
    public final float b;
    public int c;
    public float d;
    public android.animation.ValueAnimator e;
    public final android.graphics.Paint f;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OnboardingPageIndicatorX(android.content.Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(valueAnimator, "animation");
        java.lang.Object animatedValue = valueAnimator.getAnimatedValue();
        kotlin.jvm.internal.Intrinsics.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        this.d = ((java.lang.Float) animatedValue).floatValue();
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(android.graphics.Canvas canvas) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(canvas, "canvas");
        float f = this.a;
        canvas.translate(f, f);
        kotlin.collections.m0 it = uf3.p.l(0, this.c).iterator();
        while (it.hasNext()) {
            float max = java.lang.Math.max(1 - java.lang.Math.abs(it.nextInt() - this.d), 0.0f);
            float f2 = 2;
            float f3 = f * f2 * max;
            android.graphics.Paint paint = this.f;
            paint.setAlpha((int) (((max * 0.7f) + 0.3f) * 255));
            float f4 = this.a;
            android.graphics.Canvas canvas2 = canvas;
            canvas2.drawRoundRect(-f4, -f4, f4 + f3, f4, f4, f4, paint);
            canvas2.translate((f2 * f) + f3 + this.b, 0.0f);
            canvas = canvas2;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        float f = 2;
        float f2 = this.a;
        int i3 = this.c;
        setMeasuredDimension((int) ((this.b * (i3 - 1)) + (f2 * f * (i3 + 1))), (int) (f2 * f));
    }

    public final void setPageCount(int i) {
        this.c = i;
        requestLayout();
    }

    public final void setSelectedPage(int i) {
        android.animation.ValueAnimator valueAnimator = this.e;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(this.d, i);
        ofFloat.addUpdateListener(this);
        ofFloat.start();
        this.e = ofFloat;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OnboardingPageIndicatorX(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnboardingPageIndicatorX(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.a = ak.r0.r(4.0f, context);
        this.b = ak.r0.r(6.0f, context);
        this.c = 3;
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setColor(bi3.a.s(context, 2130970634));
        this.f = paint;
    }

    public /* synthetic */ OnboardingPageIndicatorX(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
