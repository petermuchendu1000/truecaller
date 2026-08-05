package com.truecaller.insights.ui.notifications.smsid.widget;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class SmsIdBannerOverlayContainerView extends android.widget.FrameLayout {
    public static final /* synthetic */ int i = 0;
    public final kotlin.Lazy a;
    public final int b;
    public final kotlin.Lazy c;
    public android.view.WindowManager.LayoutParams d;
    public ry1.qux e;
    public boolean f;
    public final android.os.Handler g;
    public ry1.d h;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SmsIdBannerOverlayContainerView(android.content.Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    public static void a(com.truecaller.insights.ui.notifications.smsid.widget.SmsIdBannerOverlayContainerView smsIdBannerOverlayContainerView) {
        smsIdBannerOverlayContainerView.d();
        if (smsIdBannerOverlayContainerView.getParent() != null) {
            smsIdBannerOverlayContainerView.f = true;
            ry1.qux quxVar = smsIdBannerOverlayContainerView.e;
            if (quxVar != null) {
                androidx.lifecycle.f0 f0Var = quxVar.b;
                if (quxVar.a == null) {
                    f0Var.f(androidx.lifecycle.r.ON_PAUSE);
                    f0Var.f(androidx.lifecycle.r.ON_STOP);
                    f0Var.f(androidx.lifecycle.r.ON_DESTROY);
                    quxVar.c.a();
                }
            }
            smsIdBannerOverlayContainerView.e = null;
            smsIdBannerOverlayContainerView.getWindowManager().removeView(smsIdBannerOverlayContainerView);
        }
    }

    public static int b(com.truecaller.insights.ui.notifications.smsid.widget.SmsIdBannerOverlayContainerView smsIdBannerOverlayContainerView) {
        return smsIdBannerOverlayContainerView.getCalculatedWidth();
    }

    public static void f(com.truecaller.insights.ui.notifications.smsid.widget.SmsIdBannerOverlayContainerView smsIdBannerOverlayContainerView) {
        smsIdBannerOverlayContainerView.getClass();
        smsIdBannerOverlayContainerView.postDelayed(new ry1.d(smsIdBannerOverlayContainerView, 1), 0L);
    }

    private final int getCalculatedWidth() {
        hc.bar barVar = i13.c.a;
        android.content.Context context = getContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        android.util.Size j = i13.c.a.j(context);
        if (j.getWidth() <= j.getHeight()) {
            return j.getWidth();
        }
        return j.getHeight();
    }

    private final android.widget.LinearLayout getContainer() {
        java.lang.Object value = this.a.getValue();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (android.widget.LinearLayout) value;
    }

    private final int getMaxWidth() {
        return ((java.lang.Number) this.c.getValue()).intValue();
    }

    private final android.view.WindowManager getWindowManager() {
        android.content.Context context = getContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return ak.r0.K(context);
    }

    private final int getWindowType() {
        return 2038;
    }

    public final void c(android.view.ViewGroup viewGroup) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewGroup, "view");
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(getMaxWidth() - this.b, -2);
        int i2 = 0;
        layoutParams.setMargins(0, 0, 0, (int) a.bar.v(20));
        getContainer().addView(viewGroup, layoutParams);
        android.view.WindowManager.LayoutParams layoutParams2 = this.d;
        if (layoutParams2 != null) {
            layoutParams2.y = 0;
            android.view.WindowManager windowManager = getWindowManager();
            android.view.WindowManager.LayoutParams layoutParams3 = this.d;
            if (layoutParams3 != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(windowManager, "<this>");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this, "view");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(layoutParams3, "params");
                try {
                    windowManager.updateViewLayout(this, layoutParams3);
                } catch (java.lang.Exception unused) {
                }
                ry1.e eVar = new ry1.e(this, 2);
                setTranslationX(-(getMaxWidth() * 2.0f));
                z7.c cVar = new z7.c(this, z7.c.m);
                ((z7.f) cVar).t = null;
                ((z7.f) cVar).u = Float.MAX_VALUE;
                ((z7.f) cVar).v = false;
                z7.g gVar = new z7.g(0.0f);
                ((z7.f) cVar).t = gVar;
                gVar.a(0.75f);
                ((z7.f) cVar).t.b(200.0f);
                cVar.e();
                ry1.c cVar2 = new ry1.c(this, i2);
                android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new ao.c(cVar2, 11));
                ofFloat.start();
                ofFloat.addListener(new da0.a(eVar, 5));
                d();
                ry1.d dVar = new ry1.d(this, 0);
                this.h = dVar;
                this.g.postDelayed(dVar, 1200L);
                return;
            }
            kotlin.jvm.internal.Intrinsics.n("parentParams");
            throw null;
        }
        kotlin.jvm.internal.Intrinsics.n("parentParams");
        throw null;
    }

    public final void d() {
        ry1.d dVar = this.h;
        if (dVar != null) {
            this.g.removeCallbacks(dVar);
        }
        this.h = null;
    }

    public final void e(bm.e eVar, boolean z) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eVar, "touchListener");
        setAlpha(0.0f);
        android.content.Context context = getContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ry1.qux quxVar = new ry1.qux(context);
        quxVar.a(this);
        if (quxVar.a == null) {
            quxVar.d.b((android.os.Bundle) null);
            androidx.lifecycle.r rVar = androidx.lifecycle.r.ON_CREATE;
            androidx.lifecycle.f0 f0Var = quxVar.b;
            f0Var.f(rVar);
            f0Var.f(androidx.lifecycle.r.ON_START);
            f0Var.f(androidx.lifecycle.r.ON_RESUME);
        }
        this.e = quxVar;
        android.view.WindowManager windowManager = getWindowManager();
        int maxWidth = getMaxWidth();
        int windowType = getWindowType();
        if (z) {
            i2 = 131072;
        } else {
            i2 = 8;
        }
        android.view.WindowManager.LayoutParams layoutParams = new android.view.WindowManager.LayoutParams(maxWidth, -2, windowType, i2, -3);
        layoutParams.dimAmount = 0.0f;
        layoutParams.gravity = 48;
        this.d = layoutParams;
        windowManager.addView(this, layoutParams);
        android.content.Context context2 = getContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        setOnTouchListener(new ry1.g(context2, eVar, new qm1.c(0, this, com.truecaller.insights.ui.notifications.smsid.widget.SmsIdBannerOverlayContainerView.class, "onDismiss", "onDismiss()V", 0, 8)));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        d();
        super.onDetachedFromWindow();
    }

    public final void setRemoved(boolean z) {
        this.f = z;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SmsIdBannerOverlayContainerView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SmsIdBannerOverlayContainerView(android.content.Context context, android.util.AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.a = kotlin.LazyKt.lazy(new ry1.e(this, 0));
        this.b = (int) a.bar.v(16);
        this.c = kotlin.LazyKt.lazy(new ry1.e(this, 1));
        this.g = new android.os.Handler(android.os.Looper.getMainLooper());
    }

    public /* synthetic */ SmsIdBannerOverlayContainerView(android.content.Context context, android.util.AttributeSet attributeSet, int i2, int i3, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i2);
    }
}
