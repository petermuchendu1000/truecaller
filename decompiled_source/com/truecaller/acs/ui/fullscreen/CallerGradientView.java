package com.truecaller.acs.ui.fullscreen;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class CallerGradientView extends android.view.View implements bd3.qux {
    public static final /* synthetic */ int f = 0;
    public yc3.d a;
    public boolean b;
    public final kotlin.Lazy c;
    public java.lang.Integer d;
    public java.lang.Integer e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CallerGradientView(android.content.Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    private final android.graphics.Paint getGradientPaint() {
        return (android.graphics.Paint) this.c.getValue();
    }

    public final java.lang.Object X3() {
        if (this.a == null) {
            this.a = new yc3.d(this);
        }
        return this.a.X3();
    }

    public final int[] a(int i) {
        android.content.res.TypedArray obtainTypedArray = getContext().getResources().obtainTypedArray(i);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obtainTypedArray, "obtainTypedArray(...)");
        int[] iArr = new int[obtainTypedArray.length()];
        int length = obtainTypedArray.length();
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = obtainTypedArray.getColor(i2, 0);
        }
        obtainTypedArray.recycle();
        return iArr;
    }

    public final void b() {
        android.graphics.LinearGradient linearGradient;
        if (getWidth() > 0 && getHeight() > 0) {
            java.lang.Integer num = this.e;
            if (num == null) {
                java.lang.Integer num2 = this.d;
                if (num2 != null && num2.intValue() == -1) {
                    num = -1;
                } else {
                    java.lang.Integer num3 = this.d;
                    if (num3 != null && num3.intValue() == -2) {
                        num = -2;
                    } else {
                        num = this.d;
                        if (num == null) {
                            num = null;
                        }
                    }
                }
            }
            if (num != null) {
                int intValue = num.intValue();
                float width = getWidth() / 2.0f;
                float width2 = getWidth() / 2.0f;
                float height = getHeight();
                if (intValue == -1) {
                    linearGradient = new android.graphics.LinearGradient(width, 0.0f, width2, height, a(2130903072), new float[]{0.0f, 0.18f, 0.35f, 1.0f}, android.graphics.Shader.TileMode.CLAMP);
                } else if (intValue == -2) {
                    linearGradient = new android.graphics.LinearGradient(width, 0.0f, width2, height, a(2130903074), new float[]{0.0f, 0.5f, 1.0f}, android.graphics.Shader.TileMode.CLAMP);
                } else if (intValue != 2130903077 && intValue != 2130903075 && intValue != 2130903078) {
                    if (intValue != 2130903076 && intValue != 2130903073) {
                        linearGradient = new android.graphics.LinearGradient(width, 0.0f, width2, height, new int[]{intValue, 0}, new float[]{0.0f, 1.0f}, android.graphics.Shader.TileMode.CLAMP);
                    } else {
                        linearGradient = new android.graphics.LinearGradient(width, 0.0f, width2, height, a(intValue), new float[]{0.0f, 0.411f, 1.0f}, android.graphics.Shader.TileMode.CLAMP);
                    }
                } else {
                    linearGradient = new android.graphics.LinearGradient(width, 0.0f, width2, height, a(intValue), new float[]{0.0f, 0.33f, 1.0f}, android.graphics.Shader.TileMode.CLAMP);
                }
                getGradientPaint().setShader(linearGradient);
            }
        }
    }

    @Override // android.view.View
    public final void onDraw(android.graphics.Canvas canvas) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        canvas.drawPaint(getGradientPaint());
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        b();
    }

    public final void setGradientArrayRes(int i) {
        this.d = java.lang.Integer.valueOf(i);
        this.e = null;
        b();
        invalidate();
    }

    public final void setGradientColorInt(int i) {
        this.e = java.lang.Integer.valueOf(i);
        this.d = null;
        b();
        invalidate();
    }

    public final void setGradientColorRes(int i) {
        this.e = java.lang.Integer.valueOf(getContext().getColor(i));
        this.d = null;
        b();
        invalidate();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CallerGradientView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ CallerGradientView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CallerGradientView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        if (!isInEditMode() && !this.b) {
            this.b = true;
            ((mz.p) X3()).getClass();
        }
        this.c = kotlin.LazyKt.lazy(new le2.k(28));
        isInEditMode();
    }
}
