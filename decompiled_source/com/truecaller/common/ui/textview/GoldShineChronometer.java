package com.truecaller.common.ui.textview;

/* loaded from: /home/user/tc_decoded/classes2.dex */
public final class GoldShineChronometer extends android.widget.Chronometer {
    public static final /* synthetic */ int e = 0;
    public final kotlin.Lazy a;
    public final kotlin.Lazy b;
    public final kotlin.Lazy c;
    public com.truecaller.common.ui.ShineView d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GoldShineChronometer(android.content.Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    public static int[] a(com.truecaller.common.ui.textview.GoldShineChronometer goldShineChronometer) {
        return new int[]{bi3.a.s(goldShineChronometer.getResourceProvider().a, 2130970751), bi3.a.s(goldShineChronometer.getResourceProvider().a, 2130970752), bi3.a.s(goldShineChronometer.getResourceProvider().a, 2130970751)};
    }

    public static u03.g0 b(com.truecaller.common.ui.textview.GoldShineChronometer goldShineChronometer) {
        return new u03.g0(goldShineChronometer.getThemedContext());
    }

    private final int[] getGradientColors() {
        return (int[]) this.c.getValue();
    }

    private final u03.g0 getResourceProvider() {
        return (u03.g0) this.b.getValue();
    }

    private final android.view.ContextThemeWrapper getThemedContext() {
        return (android.view.ContextThemeWrapper) this.a.getValue();
    }

    public final void c() {
        d();
        setOutlineProvider(null);
        setClipToOutline(false);
    }

    public final void d() {
        com.truecaller.common.ui.ShineView shineView = this.d;
        if (shineView != null) {
            gj.m.f0(shineView);
        }
        com.truecaller.common.ui.ShineView shineView2 = this.d;
        if (shineView2 != null) {
            shineView2.setLifecycleOwner(null);
        }
        com.truecaller.common.ui.ShineView shineView3 = this.d;
        if (shineView3 != null) {
            shineView3.setOnInvalidateCallback(null);
        }
        this.d = null;
    }

    @Override // android.view.View
    public final void draw(android.graphics.Canvas canvas) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(canvas, "canvas");
        gj.m.H(this);
        super.draw(canvas);
    }

    @Override // android.widget.Chronometer, android.view.View
    public final void onDetachedFromWindow() {
        d();
        super.onDetachedFromWindow();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0040, code lost:
    
        if ((r9 instanceof android.content.ContextWrapper) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0042, code lost:
    
        r9 = ((android.content.ContextWrapper) r9).getBaseContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, "getBaseContext(...)");
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004f, code lost:
    
        if ((r9 instanceof androidx.lifecycle.d0) == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0073, code lost:
    
        throw new java.lang.IllegalStateException(k9.d.q("Context does not implement ", kotlin.jvm.internal.k0.a.getOrCreateKotlinClass(androidx.lifecycle.d0.class).getQualifiedName()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0051, code lost:
    
        r0.setLifecycleOwner((androidx.lifecycle.d0) r9);
        gj.m.j0(r0);
        r8.d = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x003b, code lost:
    
        if ((r9 instanceof androidx.lifecycle.d0) != false) goto L16;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (getWidth() > 0 && getHeight() > 0) {
            setLayerType(2, null);
            if (this.d == null) {
                com.truecaller.common.ui.ShineView shineView = new com.truecaller.common.ui.ShineView(getThemedContext(), null, 0, 6, null);
                shineView.setOnInvalidateCallback(new r41.bar(this, 0));
                android.content.Context context = shineView.getContext();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            }
            int width = getWidth();
            int height = getHeight();
            com.truecaller.common.ui.ShineView shineView2 = this.d;
            if (shineView2 != null) {
                shineView2.measure(android.view.View.MeasureSpec.makeMeasureSpec(width, 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(height, 1073741824));
                shineView2.layout(0, 0, width, height);
            }
            int width2 = getWidth();
            int height2 = getHeight();
            android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(width2, height2, android.graphics.Bitmap.Config.ARGB_8888);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(...)");
            android.graphics.LinearGradient linearGradient = new android.graphics.LinearGradient(0.0f, 0.0f, width2, height2, getGradientColors(), new float[]{0.24f, 0.51f, 0.79f}, android.graphics.Shader.TileMode.CLAMP);
            new android.graphics.Canvas(createBitmap);
            android.graphics.Paint paint = new android.graphics.Paint(1);
            paint.setStyle(android.graphics.Paint.Style.FILL);
            paint.setShader(linearGradient);
        }
    }

    @Override // android.view.View
    public void setBackground(@org.jetbrains.annotations.Nullable android.graphics.drawable.Drawable drawable) {
        c();
        super.setBackground(drawable);
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        c();
        super.setBackgroundResource(i);
    }

    @Override // android.widget.TextView
    public void setTextColor(int i) {
        c();
        super.setTextColor(i);
    }

    public final void setTextColorRes(int i) {
        setTextColor(getContext().getColor(i));
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        gj.m.H(this);
        com.truecaller.common.ui.ShineView shineView = this.d;
        if (shineView != null) {
            gj.m.f0(shineView);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GoldShineChronometer(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoldShineChronometer(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.a = kotlin.LazyKt.lazy(new o10.f(context, 5));
        this.b = kotlin.LazyKt.lazy(new r41.bar(this, 1));
        this.c = kotlin.LazyKt.lazy(new r41.bar(this, 2));
        new android.graphics.Paint(1).setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.SRC_IN));
    }

    @Override // android.widget.TextView
    public void setTextColor(@org.jetbrains.annotations.Nullable android.content.res.ColorStateList colorStateList) {
        c();
        super.setTextColor(colorStateList);
    }

    public /* synthetic */ GoldShineChronometer(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
