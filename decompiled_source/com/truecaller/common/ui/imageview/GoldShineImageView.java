package com.truecaller.common.ui.imageview;

/* loaded from: /home/user/tc_decoded/classes2.dex */
public class GoldShineImageView extends androidx.appcompat.widget.AppCompatImageView {
    public static final /* synthetic */ int j = 0;
    public final kotlin.Lazy a;
    public final kotlin.Lazy b;
    public final kotlin.Lazy c;
    public com.truecaller.common.ui.ShineView d;
    public android.graphics.Paint e;
    public android.graphics.Bitmap f;
    public android.graphics.Canvas g;
    public boolean h;
    public final android.graphics.Paint i;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GoldShineImageView(android.content.Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
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

    public static int[] h(com.truecaller.common.ui.imageview.GoldShineImageView goldShineImageView) {
        return new int[]{bi3.a.s(goldShineImageView.getResourceProvider().a, 2130970751), bi3.a.s(goldShineImageView.getResourceProvider().a, 2130970752), bi3.a.s(goldShineImageView.getResourceProvider().a, 2130970751)};
    }

    public static u03.g0 i(com.truecaller.common.ui.imageview.GoldShineImageView goldShineImageView) {
        return new u03.g0(goldShineImageView.getThemedContext());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void draw(android.graphics.Canvas canvas) {
        android.graphics.Paint paint;
        android.graphics.Canvas canvas2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (gj.m.H(this) && this.h && (paint = this.e) != null) {
            canvas.drawColor(0);
            super/*android.widget.ImageView*/.draw(canvas);
            android.graphics.Bitmap bitmap = this.f;
            if (bitmap == null || (canvas2 = this.g) == null) {
                return;
            }
            canvas2.drawPaint(paint);
            com.truecaller.common.ui.ShineView shineView = this.d;
            if (shineView != null) {
                shineView.draw(canvas2);
            }
            canvas.save();
            canvas.setMatrix(null);
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, this.i);
            canvas.restore();
            return;
        }
        super/*android.widget.ImageView*/.draw(canvas);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0043, code lost:
    
        if ((r12 instanceof androidx.lifecycle.d0) != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0048, code lost:
    
        if ((r12 instanceof android.content.ContextWrapper) == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004a, code lost:
    
        r12 = ((android.content.ContextWrapper) r12).getBaseContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r12, "getBaseContext(...)");
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0057, code lost:
    
        if ((r12 instanceof androidx.lifecycle.d0) == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0078, code lost:
    
        throw new java.lang.IllegalStateException(k9.d.q("Context does not implement ", kotlin.jvm.internal.k0.a.getOrCreateKotlinClass(androidx.lifecycle.d0.class).getQualifiedName()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0059, code lost:
    
        r1.setLifecycleOwner((androidx.lifecycle.d0) r12);
        r11.d = r1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(boolean z) {
        if (getWidth() > 0 && getHeight() > 0) {
            if (z || this.f == null) {
                setLayerType(2, null);
                if (this.d == null) {
                    com.truecaller.common.ui.ShineView shineView = new com.truecaller.common.ui.ShineView(getThemedContext(), null, 0, 6, null);
                    gj.m.h0(shineView);
                    shineView.setOnInvalidateCallback(new g41.qux(this, 0));
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
                this.f = createBitmap;
                this.g = new android.graphics.Canvas(createBitmap);
                android.graphics.Paint paint = new android.graphics.Paint(1);
                paint.setStyle(android.graphics.Paint.Style.FILL);
                paint.setShader(linearGradient);
                this.e = paint;
            }
        }
    }

    public final void k() {
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
        this.f = null;
        this.g = null;
        this.e = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void l() {
        com.truecaller.common.ui.ShineView shineView;
        if (this.h) {
            return;
        }
        this.h = true;
        j(false);
        setClipToOutline(false);
        if (isShown() && (shineView = this.d) != null) {
            gj.m.j0(shineView);
        }
        invalidate();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onDetachedFromWindow() {
        k();
        super/*android.widget.ImageView*/.onDetachedFromWindow();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super/*android.widget.ImageView*/.onSizeChanged(i, i2, i3, i4);
        j(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setColor(int i) {
        setColorInt(getContext().getColor(i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setColorInt(int i) {
        this.h = false;
        k();
        setClipToOutline(false);
        setImageTintList(android.content.res.ColorStateList.valueOf(i));
        invalidate();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setVisibility(int i) {
        super/*android.widget.ImageView*/.setVisibility(i);
        if (isShown() && this.h) {
            com.truecaller.common.ui.ShineView shineView = this.d;
            if (shineView != null) {
                gj.m.j0(shineView);
                return;
            }
            return;
        }
        com.truecaller.common.ui.ShineView shineView2 = this.d;
        if (shineView2 != null) {
            gj.m.f0(shineView2);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GoldShineImageView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoldShineImageView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.a = kotlin.LazyKt.lazy(new be.x(context, 10));
        this.b = kotlin.LazyKt.lazy(new g41.qux(this, 1));
        this.c = kotlin.LazyKt.lazy(new g41.qux(this, 2));
        android.graphics.Paint paint = new android.graphics.Paint(1);
        paint.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.SRC_IN));
        this.i = paint;
    }

    public /* synthetic */ GoldShineImageView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
