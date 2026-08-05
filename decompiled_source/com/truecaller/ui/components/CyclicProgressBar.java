package com.truecaller.ui.components;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public class CyclicProgressBar extends android.view.View {
    public static final android.view.animation.AccelerateDecelerateInterpolator j = new android.view.animation.AccelerateDecelerateInterpolator();
    public static boolean k = true;
    public float a;
    public float b;
    public float c;
    public float d;
    public final android.graphics.RectF e;
    public android.graphics.Paint f;
    public float g;
    public final ey2.e h;
    public final ey2.e i;

    public CyclicProgressBar(android.content.Context context) {
        super(context);
        this.e = new android.graphics.RectF();
        this.h = new ey2.e(this, 0);
        this.i = new ey2.e(this, 1);
        new java.util.Stack();
        a(context, null, 0, 0);
    }

    public static void setAnimationEnabled(boolean z) {
        k = z;
    }

    public final void a(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        int color;
        if (isInEditMode()) {
            this.g = 4.0f;
            color = -7829368;
        } else {
            android.content.res.TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, com.truecaller.R.styleable.b, i, i2);
            try {
                this.g = obtainStyledAttributes.getDimension(1, t41.i.b(4.0f, context));
                color = obtainStyledAttributes.getColor(0, -1);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f = paint;
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        this.f.setStrokeWidth(this.g);
        this.f.setStrokeCap(android.graphics.Paint.Cap.ROUND);
        this.f.setColor(color);
        this.f.setAntiAlias(true);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.i);
        removeCallbacks(this.h);
    }

    @Override // android.view.View
    public final void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        float f = (float) (elapsedRealtime % 2000);
        float f2 = f / 2000.0f;
        this.a = f2 * 360.0f;
        this.d = (((float) (elapsedRealtime / 2000)) * 225.0f) - (((int) (r0 / 360.0f)) * 360);
        android.view.animation.AccelerateDecelerateInterpolator accelerateDecelerateInterpolator = j;
        if (f2 >= 0.85f) {
            float interpolation = 270.0f - (accelerateDecelerateInterpolator.getInterpolation((f - 1700.0f) / 300.0f) * 225.0f);
            this.b = interpolation;
            this.c = 270.0f - interpolation;
        } else if (f2 >= 0.5f) {
            this.b = 270.0f;
        } else if (f2 >= 0.35f) {
            this.b = (accelerateDecelerateInterpolator.getInterpolation((f - 700.0f) / 300.0f) * 225.0f) + 45.0f;
        } else if (f2 < 0.35f) {
            this.b = 45.0f;
            this.c = 0.0f;
        }
        canvas.drawArc(this.e, this.a + this.d + this.c, this.b, false, this.f);
        if (k) {
            java.util.WeakHashMap weakHashMap = u6.t0.a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        float f = this.g;
        float f2 = f * 0.5f;
        float f3 = f * 0.5f;
        float f4 = i - (f * 0.5f);
        float f5 = i2 - (f * 0.5f);
        android.graphics.RectF rectF = this.e;
        rectF.set(f2, f3, f4, f5);
        rectF.inset(0.5f, 0.5f);
    }

    public void setStrokeColor(int i) {
        android.graphics.Paint paint = this.f;
        if (paint != null) {
            paint.setColor(i);
        }
    }

    public CyclicProgressBar(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = new android.graphics.RectF();
        this.h = new ey2.e(this, 0);
        this.i = new ey2.e(this, 1);
        new java.util.Stack();
        a(context, attributeSet, 0, 0);
    }

    public CyclicProgressBar(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.e = new android.graphics.RectF();
        this.h = new ey2.e(this, 0);
        this.i = new ey2.e(this, 1);
        new java.util.Stack();
        a(context, attributeSet, i, 0);
    }

    public CyclicProgressBar(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.e = new android.graphics.RectF();
        this.h = new ey2.e(this, 0);
        this.i = new ey2.e(this, 1);
        new java.util.Stack();
        a(context, attributeSet, i, i2);
    }
}
