package com.truecaller.messaging.conversation.voice_notes;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public class PlayerVisualizerView extends android.view.View {
    public byte[] a;
    public final android.graphics.Rect b;
    public android.media.audiofx.Visualizer c;
    public final java.util.HashSet d;
    public final android.graphics.Paint e;
    public android.graphics.Bitmap f;
    public android.graphics.Canvas g;
    public final android.graphics.Matrix h;

    public PlayerVisualizerView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        this.b = new android.graphics.Rect();
        android.graphics.Paint paint = new android.graphics.Paint();
        android.graphics.Paint paint2 = new android.graphics.Paint();
        this.e = paint2;
        this.a = null;
        paint.setColor(android.graphics.Color.argb(88, 255, 255, 255));
        paint2.setColor(android.graphics.Color.argb(238, 255, 255, 255));
        paint2.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.MULTIPLY));
        this.d = new java.util.HashSet();
        this.h = new android.graphics.Matrix();
    }

    @Override // android.view.View
    public final void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (width > 0 && height > 0) {
            this.b.set(0, 0, width, height);
            if (this.f == null) {
                this.f = android.graphics.Bitmap.createBitmap(width, height, android.graphics.Bitmap.Config.ARGB_8888);
            }
            if (this.g == null) {
                this.g = new android.graphics.Canvas(this.f);
            }
            if (this.a != null) {
                java.util.Iterator it = this.d.iterator();
                while (it.hasNext()) {
                    w12.bar barVar = (w12.bar) it.next();
                    android.graphics.Canvas canvas2 = this.g;
                    byte[] bArr = this.a;
                    float[] fArr = barVar.a;
                    if (fArr == null || fArr.length < bArr.length * 4) {
                        barVar.a = new float[bArr.length * 4];
                    }
                    int i = 0;
                    while (i < bArr.length - 1) {
                        int i2 = i * 4;
                        barVar.a[i2] = (r3.width() * i) / (bArr.length - 1);
                        barVar.a[i2 + 1] = (((r3.height() / 3.0f) * ((byte) (bArr[i] + 128))) / 128.0f) + (r3.height() / 2.0f);
                        i++;
                        barVar.a[i2 + 2] = (r3.width() * i) / (bArr.length - 1);
                        barVar.a[i2 + 3] = (((r3.height() / 3.0f) * ((byte) (bArr[i] + 128))) / 128.0f) + (r3.height() / 2.0f);
                    }
                    float f = 0.0f;
                    for (int i3 = 0; i3 < bArr.length - 1; i3++) {
                        f += java.lang.Math.abs(bArr[i3]);
                    }
                    float length = f / (bArr.length * 128);
                    float f2 = barVar.d;
                    if (length > f2) {
                        barVar.d = length;
                        canvas2.drawLines(barVar.a, barVar.c);
                    } else {
                        barVar.d = f2 * 0.99f;
                        canvas2.drawLines(barVar.a, barVar.b);
                    }
                }
            }
            this.g.drawPaint(this.e);
            canvas.drawBitmap(this.f, this.h, null);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        android.media.audiofx.Visualizer visualizer = this.c;
        if (visualizer != null) {
            visualizer.setEnabled(z);
        }
    }

    public PlayerVisualizerView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PlayerVisualizerView(android.content.Context context) {
        this(context, null, 0);
    }
}
