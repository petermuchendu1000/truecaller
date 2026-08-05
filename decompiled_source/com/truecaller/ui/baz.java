package com.truecaller.ui;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class baz extends android.graphics.drawable.Drawable {
    public final android.graphics.Paint a;
    public final int b;
    public final int c;
    public final int d;

    public baz(android.content.Context context, androidx.recyclerview.widget.r0 r0Var) {
        int i;
        if (r0Var.b) {
            i = 2130968716;
        } else {
            i = 2130968717;
        }
        int s = bi3.a.s(context, i);
        android.graphics.Paint paint = new android.graphics.Paint(1);
        this.a = paint;
        paint.setColor(s);
        new android.graphics.Paint(1).setColor(-1);
        this.b = t41.i.b(r0Var.d, context);
        int i2 = r0Var.e;
        this.c = i2 > 0 ? t41.i.b(i2, context) : -1;
        if (r0Var.c) {
            this.d = t41.i.b(6, context);
        } else {
            this.d = 0;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(android.graphics.Canvas canvas) {
        android.graphics.Rect bounds = getBounds();
        canvas.drawCircle(bounds.centerX(), bounds.centerY() - this.d, this.b / 2, this.a);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        int i = this.c;
        if (i > 0) {
            return i;
        }
        return (this.d * 2) + this.b;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        int i = this.c;
        if (i > 0) {
            return i;
        }
        return this.b;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.a.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(android.graphics.ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
    }
}
