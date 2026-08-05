package com.truecaller.timezone;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class TimezoneView extends androidx.constraintlayout.widget.ConstraintLayout implements ix2.g {
    public static final /* synthetic */ int w = 0;
    public final kotlin.Lazy s;
    public final kotlin.Lazy t;
    public final kotlin.Lazy u;
    public final ix2.qux v;

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002À\u0006\u0003"}, d2 = {"Lcom/truecaller/timezone/TimezoneView$bar;", "", "timezone_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
    /* loaded from: /home/user/tc_decoded/classes7.dex */
    public interface bar {
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TimezoneView(android.content.Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    private final android.widget.ImageView getIcon() {
        return (android.widget.ImageView) this.s.getValue();
    }

    private final java.lang.String getLocalTimeTitle() {
        return (java.lang.String) this.u.getValue();
    }

    private final android.widget.TextView getTitle() {
        return (android.widget.TextView) this.t.getValue();
    }

    private final void setTitleAndIconColor(int i) {
        getIcon().setImageTintList(android.content.res.ColorStateList.valueOf(i));
        getTitle().setTextColor(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void F(int i) {
        setTitleAndIconColor(i);
        setBackground(null);
    }

    @org.jetbrains.annotations.NotNull
    public final ix2.f getPresenter() {
        return this.v;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onAttachedToWindow() {
        super/*android.view.ViewGroup*/.onAttachedToWindow();
        this.v.a = this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onDetachedFromWindow() {
        this.v.m1();
        super/*android.view.ViewGroup*/.onDetachedFromWindow();
    }

    public final void setData(@org.jetbrains.annotations.NotNull java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "timezone");
        ix2.qux quxVar = this.v;
        quxVar.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "timezone");
        fg3.h0.J(quxVar, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new i43.bar(quxVar, str, null, 24), 3);
    }

    @Override // ix2.g
    public void setTimeBasedIcon(@org.jetbrains.annotations.Nullable android.graphics.drawable.Drawable drawable) {
        getIcon().setImageDrawable(drawable);
    }

    @Override // ix2.g
    public void setTimezone(@org.jetbrains.annotations.NotNull java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "timezone");
        android.widget.TextView title = getTitle();
        java.lang.String format = java.lang.String.format(getLocalTimeTitle(), java.util.Arrays.copyOf(new java.lang.Object[]{str}, 1));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        title.setText(format);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TimezoneView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TimezoneView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.s = gj.m.I(2131364521, this);
        this.t = gj.m.I(2131367033, this);
        this.u = kotlin.LazyKt.lazy(new be.x(context, 21));
        tx.c0 c0Var = ((com.truecaller.timezone.TimezoneView.bar) j71.g.E(com.truecaller.timezone.TimezoneView.bar.class, context.getApplicationContext())).H.b;
        this.v = new ix2.qux((kotlin.coroutines.CoroutineContext) c0Var.a.V1.get(), c0Var.L4(), 1);
        yy.qux.z(this, 2131560054, true);
    }

    public /* synthetic */ TimezoneView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
