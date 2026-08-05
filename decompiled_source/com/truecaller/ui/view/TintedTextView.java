package com.truecaller.ui.view;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public class TintedTextView extends androidx.appcompat.widget.AppCompatTextView {
    public int h;

    /* JADX WARN: Multi-variable type inference failed */
    public TintedTextView(android.content.Context context) {
        super(context);
        this.h = 0;
        setupPaint(getCurrentTextColor());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void setupPaint(int i) {
        if (this.h == i) {
            return;
        }
        android.graphics.Paint paint = new android.graphics.Paint(1);
        paint.setColorFilter(new android.graphics.PorterDuffColorFilter(i, android.graphics.PorterDuff.Mode.SRC_IN));
        this.h = i;
        setLayerType(2, paint);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setTextColor(int i) {
        super/*android.widget.TextView*/.setTextColor(android.graphics.Color.argb(255, android.graphics.Color.red(i), android.graphics.Color.blue(i), android.graphics.Color.green(i)));
        setupPaint(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TintedTextView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.h = 0;
        setupPaint(getCurrentTextColor());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TintedTextView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.h = 0;
        setupPaint(getCurrentTextColor());
    }
}
