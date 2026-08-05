package com.truecaller.messaging.conversation.voice_notes;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class RecorderVisualizerView extends android.view.View {
    public final java.util.ArrayList a;
    public int b;
    public int c;
    public final float d;
    public final android.graphics.Paint e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecorderVisualizerView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(attributeSet, "attrs");
        this.a = new java.util.ArrayList();
        float dimensionPixelSize = getResources().getDimensionPixelSize(2131166881);
        this.d = dimensionPixelSize;
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setColor(bi3.a.s(context, 2130970571));
        paint.setStrokeWidth(dimensionPixelSize);
        paint.setAntiAlias(true);
        this.e = paint;
    }

    @Override // android.view.View
    public final void onDraw(android.graphics.Canvas canvas) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(canvas, "canvas");
        int i = this.c / 2;
        java.util.Iterator it = this.a.iterator();
        float f = 0.0f;
        while (it.hasNext()) {
            float floatValue = ((java.lang.Number) it.next()).floatValue() / 100;
            float f2 = f + this.d;
            float f3 = i;
            float f4 = floatValue / 2;
            canvas.drawLine(f2, f3 + f4, f2, f3 - f4, this.e);
            f = f2;
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        this.b = i;
        this.c = i2;
    }
}
