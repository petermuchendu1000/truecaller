package com.truecaller.common.ui.textview;

/* loaded from: /home/user/tc_decoded/classes2.dex */
public class GoldShineTextView extends androidx.appcompat.widget.AppCompatTextView {
    public static final /* synthetic */ int r = 0;
    public final kotlin.Lazy h;
    public final kotlin.Lazy i;
    public final kotlin.Lazy j;
    public com.truecaller.common.ui.ShineView k;
    public android.graphics.Paint l;
    public android.graphics.Bitmap m;
    public android.graphics.Canvas n;
    public boolean o;
    public boolean p;
    public final android.graphics.Paint q;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GoldShineTextView(android.content.Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    public static u03.g0 g(com.truecaller.common.ui.textview.GoldShineTextView goldShineTextView) {
        return new u03.g0(goldShineTextView.getThemedContext());
    }

    private final int[] getGradientColors() {
        return (int[]) this.j.getValue();
    }

    private final u03.g0 getResourceProvider() {
        return (u03.g0) this.i.getValue();
    }

    private final android.view.ContextThemeWrapper getThemedContext() {
        return (android.view.ContextThemeWrapper) this.h.getValue();
    }

    public static int[] h(com.truecaller.common.ui.textview.GoldShineTextView goldShineTextView) {
        return new int[]{bi3.a.s(goldShineTextView.getResourceProvider().a, 2130970751), bi3.a.s(goldShineTextView.getResourceProvider().a, 2130970752), bi3.a.s(goldShineTextView.getResourceProvider().a, 2130970751)};
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void draw(android.graphics.Canvas canvas) {
        android.graphics.Paint paint;
        android.graphics.Canvas canvas2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (gj.m.H(this) && this.o && (paint = this.l) != null) {
            if (this.p) {
                canvas.save();
                canvas.setMatrix(null);
                canvas.drawPaint(paint);
                com.truecaller.common.ui.ShineView shineView = this.k;
                if (shineView != null) {
                    shineView.draw(canvas);
                }
                canvas.restore();
                super/*android.widget.TextView*/.draw(canvas);
                return;
            }
            canvas.drawColor(0);
            super/*android.widget.TextView*/.draw(canvas);
            android.graphics.Bitmap bitmap = this.m;
            if (bitmap == null || (canvas2 = this.n) == null) {
                return;
            }
            canvas2.drawPaint(paint);
            com.truecaller.common.ui.ShineView shineView2 = this.k;
            if (shineView2 != null) {
                shineView2.draw(canvas2);
            }
            canvas.save();
            canvas.setMatrix(null);
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, this.q);
            canvas.restore();
            return;
        }
        super/*android.widget.TextView*/.draw(canvas);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0042, code lost:
    
        if ((r12 instanceof androidx.lifecycle.d0) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0044, code lost:
    
        r0 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0048, code lost:
    
        if ((r12 instanceof android.content.ContextWrapper) == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004a, code lost:
    
        r12 = ((android.content.ContextWrapper) r12).getBaseContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r12, "getBaseContext(...)");
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0057, code lost:
    
        if ((r12 instanceof androidx.lifecycle.d0) == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007c, code lost:
    
        throw new java.lang.IllegalStateException("Context does not implement " + kotlin.jvm.internal.k0.a.getOrCreateKotlinClass(androidx.lifecycle.d0.class).getQualifiedName());
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(boolean z) {
        android.content.Context context;
        com.truecaller.common.ui.ShineView shineView;
        com.truecaller.common.ui.ShineView shineView2;
        if (getWidth() > 0 && getHeight() > 0) {
            if (z || this.m == null) {
                context = null;
                setLayerType(2, null);
                if (this.k == null) {
                    shineView2 = new com.truecaller.common.ui.ShineView(getThemedContext(), null, 0, 6, null);
                    gj.m.h0(shineView2);
                    shineView2.setOnInvalidateCallback(new r41.baz(this, 2));
                    android.content.Context context2 = shineView2.getContext();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                }
                int width = getWidth();
                int height = getHeight();
                shineView = this.k;
                if (shineView != null) {
                    shineView.measure(android.view.View.MeasureSpec.makeMeasureSpec(width, 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(height, 1073741824));
                    shineView.layout(0, 0, width, height);
                }
                int width2 = getWidth();
                int height2 = getHeight();
                android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(width2, height2, android.graphics.Bitmap.Config.ARGB_8888);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(...)");
                android.graphics.LinearGradient linearGradient = new android.graphics.LinearGradient(0.0f, 0.0f, width2, height2, getGradientColors(), new float[]{0.24f, 0.51f, 0.79f}, android.graphics.Shader.TileMode.CLAMP);
                this.m = createBitmap;
                this.n = new android.graphics.Canvas(createBitmap);
                android.graphics.Paint paint = new android.graphics.Paint(1);
                paint.setStyle(android.graphics.Paint.Style.FILL);
                paint.setShader(linearGradient);
                this.l = paint;
            }
            return;
        }
        return;
        shineView2.setLifecycleOwner((androidx.lifecycle.d0) context);
        this.k = shineView2;
        int width3 = getWidth();
        int height3 = getHeight();
        shineView = this.k;
        if (shineView != null) {
        }
        int width22 = getWidth();
        int height22 = getHeight();
        android.graphics.Bitmap createBitmap2 = android.graphics.Bitmap.createBitmap(width22, height22, android.graphics.Bitmap.Config.ARGB_8888);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(createBitmap2, "createBitmap(...)");
        android.graphics.LinearGradient linearGradient2 = new android.graphics.LinearGradient(0.0f, 0.0f, width22, height22, getGradientColors(), new float[]{0.24f, 0.51f, 0.79f}, android.graphics.Shader.TileMode.CLAMP);
        this.m = createBitmap2;
        this.n = new android.graphics.Canvas(createBitmap2);
        android.graphics.Paint paint2 = new android.graphics.Paint(1);
        paint2.setStyle(android.graphics.Paint.Style.FILL);
        paint2.setShader(linearGradient2);
        this.l = paint2;
    }

    public final void j() {
        com.truecaller.common.ui.ShineView shineView = this.k;
        if (shineView != null) {
            gj.m.f0(shineView);
        }
        com.truecaller.common.ui.ShineView shineView2 = this.k;
        if (shineView2 != null) {
            shineView2.setLifecycleOwner(null);
        }
        com.truecaller.common.ui.ShineView shineView3 = this.k;
        if (shineView3 != null) {
            shineView3.setOnInvalidateCallback(null);
        }
        this.k = null;
        this.m = null;
        this.n = null;
        this.l = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void k() {
        l(false);
        invalidate();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void l(boolean z) {
        com.truecaller.common.ui.ShineView shineView;
        this.o = true;
        this.p = z;
        i(false);
        if (z) {
            super/*android.widget.TextView*/.setBackground(null);
            setOutlineProvider(new a23.i(7));
            setClipToOutline(true);
        } else {
            super/*android.widget.TextView*/.setTextColor(-1);
            setOutlineProvider(null);
            setClipToOutline(false);
        }
        if (isShown() && (shineView = this.k) != null) {
            gj.m.j0(shineView);
        }
    }

    public void onDetachedFromWindow() {
        j();
        super.onDetachedFromWindow();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super/*android.widget.TextView*/.onSizeChanged(i, i2, i3, i4);
        i(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onVisibilityChanged(android.view.View view, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "changedView");
        super/*android.widget.TextView*/.onVisibilityChanged(view, i);
        if (isShown() && this.o) {
            com.truecaller.common.ui.ShineView shineView = this.k;
            if (shineView != null) {
                gj.m.j0(shineView);
                return;
            }
            return;
        }
        com.truecaller.common.ui.ShineView shineView2 = this.k;
        if (shineView2 != null) {
            gj.m.f0(shineView2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setBackground(@org.jetbrains.annotations.Nullable android.graphics.drawable.Drawable drawable) {
        this.o = false;
        this.p = false;
        j();
        setOutlineProvider(null);
        setClipToOutline(false);
        super/*android.widget.TextView*/.setBackground(drawable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setBackgroundResource(int i) {
        this.o = false;
        this.p = false;
        j();
        setOutlineProvider(null);
        setClipToOutline(false);
        super.setBackgroundResource(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setTextColor(int i) {
        this.o = false;
        this.p = false;
        j();
        setOutlineProvider(null);
        setClipToOutline(false);
        super/*android.widget.TextView*/.setTextColor(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setTextColorRes(int i) {
        setTextColor(getContext().getColor(i));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GoldShineTextView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoldShineTextView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.h = kotlin.LazyKt.lazy(new o10.f(context, 6));
        this.i = kotlin.LazyKt.lazy(new r41.baz(this, 0));
        this.j = kotlin.LazyKt.lazy(new r41.baz(this, 1));
        android.graphics.Paint paint = new android.graphics.Paint(1);
        paint.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.SRC_IN));
        this.q = paint;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setTextColor(@org.jetbrains.annotations.Nullable android.content.res.ColorStateList colorStateList) {
        this.o = false;
        this.p = false;
        j();
        setOutlineProvider(null);
        setClipToOutline(false);
        super/*android.widget.TextView*/.setTextColor(colorStateList);
    }

    public /* synthetic */ GoldShineTextView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
