package com.truecaller.messaging.views;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class TransportSwitchView extends com.google.android.material.floatingactionbutton.FloatingActionButton {
    public java.lang.String q;
    public final int r;
    public final int s;
    public final android.text.TextPaint t;
    public final android.graphics.Rect u;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TransportSwitchView(android.content.Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void dispatchSetSelected(boolean z) {
        super/*android.widget.ImageButton*/.dispatchSetSelected(z);
        android.text.TextPaint textPaint = this.t;
        if (z) {
            textPaint.setColor(this.s);
        } else {
            textPaint.setColor(this.r);
        }
        invalidate();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void draw(android.graphics.Canvas canvas) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(canvas, "canvas");
        super/*android.widget.ImageButton*/.draw(canvas);
        java.lang.String str = this.q;
        android.graphics.Rect rect = this.u;
        canvas.getClipBounds(rect);
        int height = rect.height();
        int width = rect.width();
        android.graphics.Paint.Align align = android.graphics.Paint.Align.LEFT;
        android.text.TextPaint textPaint = this.t;
        textPaint.setTextAlign(align);
        textPaint.getTextBounds(str, 0, str.length(), rect);
        canvas.drawText(str, ((width / 2.0f) - (rect.width() / 2.0f)) - rect.left, ((rect.height() / 2.0f) + (height / 2.0f)) - rect.bottom, textPaint);
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getText() {
        return this.q;
    }

    public final void setText(@org.jetbrains.annotations.NotNull java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.q = str;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TransportSwitchView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TransportSwitchView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.q = "";
        android.text.TextPaint textPaint = new android.text.TextPaint();
        this.t = textPaint;
        this.u = new android.graphics.Rect();
        android.content.res.TypedArray obtainStyledAttributes = yy.qux.v(context, true).getTheme().obtainStyledAttributes(attributeSet, com.truecaller.R.styleable.g, 0, 0);
        try {
            java.lang.String string = obtainStyledAttributes.getString(0);
            if (string != null) {
                this.q = string;
            }
            int color = obtainStyledAttributes.getColor(1, -16776961);
            this.r = color;
            this.s = obtainStyledAttributes.getColor(2, -1);
            obtainStyledAttributes.recycle();
            int i2 = android.os.Build.VERSION.SDK_INT;
            if (i2 >= 29) {
                dx2.bar barVar = dx2.bar.a;
                t3.d.r(this, !dx2.bar.d());
            }
            java.lang.String str = this.q;
            java.util.Locale locale = java.util.Locale.US;
            this.q = nc0.k1.i(locale, "US", str, locale, "toUpperCase(...)");
            android.graphics.Typeface createFromAsset = android.graphics.Typeface.createFromAsset(context.getAssets(), "roboto_condensed_bold.ttf");
            textPaint.setAntiAlias(true);
            textPaint.setColor(color);
            textPaint.setTypeface(i2 >= 28 ? u6.r1.c(createFromAsset) : createFromAsset);
            textPaint.setTextSize(getResources().getDisplayMetrics().density * 9.0f);
        } catch (java.lang.Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public /* synthetic */ TransportSwitchView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
