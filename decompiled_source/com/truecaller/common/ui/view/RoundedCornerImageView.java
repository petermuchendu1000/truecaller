package com.truecaller.common.ui.view;

/* loaded from: /home/user/tc_decoded/classes2.dex */
public class RoundedCornerImageView extends androidx.appcompat.widget.AppCompatImageView {
    public final android.graphics.Path a;
    public android.graphics.RectF b;
    public final float[] c;

    public RoundedCornerImageView(android.content.Context context) {
        super(context);
        this.a = new android.graphics.Path();
        this.c = new float[8];
        h(null, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void h(android.util.AttributeSet attributeSet, int i) {
        if (attributeSet != null) {
            android.content.res.TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, com.truecaller.common.R.styleable.a, i, 0);
            float dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(3, 0);
            float[] fArr = this.c;
            fArr[0] = dimensionPixelSize;
            fArr[1] = fArr[0];
            fArr[2] = obtainStyledAttributes.getDimensionPixelSize(4, 0);
            fArr[3] = fArr[2];
            fArr[4] = obtainStyledAttributes.getDimensionPixelSize(1, 0);
            fArr[5] = fArr[4];
            fArr[6] = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            fArr[7] = fArr[6];
            obtainStyledAttributes.recycle();
        }
        setLayerType(1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onDraw(android.graphics.Canvas canvas) {
        android.graphics.RectF rectF = this.b;
        float[] fArr = this.c;
        android.graphics.Path.Direction direction = android.graphics.Path.Direction.CW;
        android.graphics.Path path = this.a;
        path.addRoundRect(rectF, fArr, direction);
        canvas.clipPath(path);
        super/*android.widget.ImageView*/.onDraw(canvas);
        path.rewind();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super/*android.widget.ImageView*/.onSizeChanged(i, i2, i3, i4);
        this.b = new android.graphics.RectF(0.0f, 0.0f, i, i2);
    }

    public RoundedCornerImageView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new android.graphics.Path();
        this.c = new float[8];
        h(attributeSet, 0);
    }

    public RoundedCornerImageView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new android.graphics.Path();
        this.c = new float[8];
        h(attributeSet, i);
    }
}
