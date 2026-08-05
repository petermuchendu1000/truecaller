package com.truecaller.common.ui;

/* loaded from: /home/user/tc_decoded/classes2.dex */
public final class LineChart extends android.view.View {
    public final android.graphics.RectF a;
    public final android.graphics.Path b;
    public final java.util.ArrayList c;
    public float d;
    public final java.util.ArrayList e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LineChart(android.content.Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    private final boolean getAnimate() {
        boolean z;
        if (this.d == -1.0f) {
            z = true;
        } else {
            z = false;
        }
        return !z;
    }

    @Override // android.view.View
    public final void onDraw(android.graphics.Canvas canvas) {
        android.graphics.Canvas canvas2;
        float f;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        canvas.clipPath(this.b);
        java.util.ArrayList arrayList = this.e;
        long y0 = kotlin.collections.CollectionsKt.y0(arrayList);
        boolean animate = getAnimate();
        int i = 0;
        java.util.ArrayList arrayList2 = this.c;
        android.graphics.RectF rectF = this.a;
        if (animate) {
            int size = arrayList.size();
            float f2 = 0.0f;
            while (i < size) {
                float floatValue = (((java.lang.Number) arrayList.get(i)).floatValue() * rectF.width()) / ((float) y0);
                float f3 = this.d;
                float f4 = f2 + floatValue;
                if (f3 >= f4) {
                    canvas2 = canvas;
                    canvas2.drawRect(f2, 0.0f, f4, rectF.height(), (android.graphics.Paint) arrayList2.get(i));
                    f = f4;
                } else {
                    canvas2 = canvas;
                    f = f4;
                    if (f3 > f2) {
                        canvas2.drawRect(f2, 0.0f, f3 + f2 + f2, rectF.height(), (android.graphics.Paint) arrayList2.get(i));
                    }
                }
                i++;
                f2 = f;
                canvas = canvas2;
            }
            return;
        }
        int size2 = arrayList.size();
        float f5 = 0.0f;
        while (i < size2) {
            float floatValue2 = ((((java.lang.Number) arrayList.get(i)).floatValue() * rectF.width()) / ((float) y0)) + f5;
            canvas.drawRect(f5, 0.0f, floatValue2, rectF.height(), (android.graphics.Paint) arrayList2.get(i));
            i++;
            f5 = floatValue2;
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        float f = i4 - i2;
        android.graphics.RectF rectF = this.a;
        rectF.set(0.0f, 0.0f, i3 - i, f);
        android.graphics.Path path = this.b;
        path.reset();
        float f2 = f / 2;
        path.addRoundRect(rectF, f2, f2, android.graphics.Path.Direction.CW);
    }

    public final void setProgress(float f) {
        this.d = f;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LineChart(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LineChart(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.a = new android.graphics.RectF();
        this.b = new android.graphics.Path();
        this.c = new java.util.ArrayList();
        this.d = -1.0f;
        this.e = new java.util.ArrayList();
    }

    public /* synthetic */ LineChart(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
