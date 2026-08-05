package com.truecaller.ads.ui;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class CircularProgressIndicator extends android.view.View {
    public static final /* synthetic */ int j = 0;
    public float a;
    public final float b;
    public final float c;
    public final float d;
    public final android.graphics.RectF e;
    public android.animation.ValueAnimator f;
    public aa0.a g;
    public int h;
    public final android.graphics.Paint i;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CircularProgressIndicator(android.content.Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        android.animation.ValueAnimator valueAnimator = this.f;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    @Override // android.view.View
    public final void onDraw(android.graphics.Canvas canvas) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        float min = (java.lang.Math.min(getWidth(), getHeight()) - this.d) / 2.0f;
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        android.graphics.RectF rectF = this.e;
        rectF.set(width - min, height - min, width + min, height + min);
        canvas.drawArc(rectF, -90.0f, this.a, false, this.i);
    }

    public final void setProgressColor(int i) {
        this.h = i;
        this.i.setColor(i);
        invalidate();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CircularProgressIndicator(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CircularProgressIndicator(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.c = 360.0f;
        this.d = 6.0f;
        this.e = new android.graphics.RectF();
        this.h = ze0.q.B(2130970595, context);
        android.graphics.Paint paint = new android.graphics.Paint(1);
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        paint.setStrokeCap(android.graphics.Paint.Cap.ROUND);
        this.i = paint;
        android.content.res.TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, com.truecaller.ads.R$styleable.b, 0, 0);
        try {
            this.h = obtainStyledAttributes.getColor(5, this.h);
            float f = obtainStyledAttributes.getFloat(4, 6.0f);
            this.d = f;
            this.b = obtainStyledAttributes.getFloat(6, 0.0f);
            this.c = obtainStyledAttributes.getFloat(3, 360.0f);
            obtainStyledAttributes.recycle();
            paint.setColor(this.h);
            paint.setStrokeWidth(f);
        } catch (java.lang.Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public /* synthetic */ CircularProgressIndicator(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
