package com.truecaller.common.ui;

/* loaded from: /home/user/tc_decoded/classes2.dex */
public final class PieChart extends android.view.View {
    public final android.graphics.RectF a;
    public final float b;
    public final java.util.ArrayList c;
    public final android.graphics.Paint d;
    public final android.graphics.Paint e;
    public float f;
    public final java.util.ArrayList g;
    public java.lang.String h;
    public java.lang.String i;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PieChart(android.content.Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    private final boolean getAnimate() {
        boolean z;
        if (this.f == -1.0f) {
            z = true;
        } else {
            z = false;
        }
        return !z;
    }

    private final float getTextSubTitleX() {
        float f = 2;
        return (this.b / f) + (this.a.right / f);
    }

    private final float getTextSubTitleY() {
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(this.d.getFontMetrics(), "getFontMetrics(...)");
        return (this.a.bottom / 2) + ((int) java.lang.Math.ceil(r0.descent - r0.ascent));
    }

    private final float getTextTitleX() {
        float f = 2;
        return (this.b / f) + (this.a.right / f);
    }

    private final float getTextTitleY() {
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(this.d.getFontMetrics(), "getFontMetrics(...)");
        return (this.a.bottom / 2) + (((int) java.lang.Math.ceil(r0.descent - r0.ascent)) / 4);
    }

    @Override // android.view.View
    public final void onDraw(android.graphics.Canvas canvas) {
        float f;
        android.graphics.Canvas canvas2 = canvas;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(canvas2, "canvas");
        super.onDraw(canvas);
        java.util.ArrayList arrayList = this.g;
        long y0 = kotlin.collections.CollectionsKt.y0(arrayList);
        boolean animate = getAnimate();
        java.util.ArrayList arrayList2 = this.c;
        android.graphics.RectF rectF = this.a;
        if (animate) {
            float f2 = 0.0f;
            if (this.f != 0.0f) {
                int size = arrayList.size();
                int i = 0;
                float f3 = -90.0f;
                while (i < size) {
                    float floatValue = (((java.lang.Number) arrayList.get(i)).floatValue() * 360.0f) / ((float) y0);
                    float f4 = f2 + floatValue;
                    float f5 = this.f;
                    if (f5 >= f4) {
                        canvas2.drawArc(rectF, f3, floatValue, false, (android.graphics.Paint) arrayList2.get(i));
                        f = floatValue;
                    } else {
                        f = floatValue;
                        if (f5 >= f4 - f) {
                            canvas.drawArc(rectF, f3, f - (f4 - f5), false, (android.graphics.Paint) arrayList2.get(i));
                        }
                    }
                    f3 += f;
                    i++;
                    canvas2 = canvas;
                    f2 = f4;
                }
            } else {
                return;
            }
        } else {
            int size2 = arrayList.size();
            float f6 = -90.0f;
            for (int i2 = 0; i2 < size2; i2++) {
                float floatValue2 = (((java.lang.Number) arrayList.get(i2)).floatValue() * 360.0f) / ((float) y0);
                canvas.drawArc(rectF, f6, floatValue2, false, (android.graphics.Paint) arrayList2.get(i2));
                f6 += floatValue2;
            }
        }
        java.lang.String str = this.h;
        if (str != null) {
            canvas.drawText(str, getTextTitleX(), getTextTitleY(), this.d);
        }
        java.lang.String str2 = this.i;
        if (str2 != null) {
            canvas.drawText(str2, getTextSubTitleX(), getTextSubTitleY(), this.e);
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        float f = 0;
        float f2 = this.b;
        this.a.set(f + f2, f + f2, (i3 - i) - f2, (i4 - i2) - f2);
    }

    public final void setArcAngle(float f) {
        this.f = f;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PieChart(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PieChart(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.a = new android.graphics.RectF();
        this.b = h0.b.N(context, 1, 10.0f);
        this.c = new java.util.ArrayList();
        android.graphics.Paint paint = new android.graphics.Paint(1);
        paint.setTextSize(android.util.TypedValue.applyDimension(2, 16.0f, context.getResources().getDisplayMetrics()));
        paint.setColor(ak.r0.I(2130970931, context));
        android.graphics.Paint.Align align = android.graphics.Paint.Align.CENTER;
        paint.setTextAlign(align);
        paint.setTypeface(android.graphics.Typeface.create("sans-serif-medium", 0));
        this.d = paint;
        android.graphics.Paint paint2 = new android.graphics.Paint(1);
        paint2.setTextSize(android.util.TypedValue.applyDimension(2, 12.0f, context.getResources().getDisplayMetrics()));
        paint2.setColor(ak.r0.I(2130970935, context));
        paint2.setTextAlign(align);
        paint2.setTypeface(android.graphics.Typeface.create("sans-serif-medium", 0));
        this.e = paint2;
        this.f = -1.0f;
        this.g = new java.util.ArrayList();
    }

    public /* synthetic */ PieChart(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
