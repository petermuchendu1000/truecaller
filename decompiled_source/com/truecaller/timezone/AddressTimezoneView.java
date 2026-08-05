package com.truecaller.timezone;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class AddressTimezoneView extends androidx.constraintlayout.widget.ConstraintLayout implements ix2.baz {
    public final kotlin.Lazy s;
    public final kotlin.Lazy t;
    public float u;
    public int v;
    public int w;
    public int x;
    public boolean y;
    public final ix2.qux z;

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002À\u0006\u0003"}, d2 = {"Lcom/truecaller/timezone/AddressTimezoneView$bar;", "", "timezone_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
    /* loaded from: /home/user/tc_decoded/classes7.dex */
    public interface bar {
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AddressTimezoneView(android.content.Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    private final android.widget.ImageView getIcon() {
        return (android.widget.ImageView) this.s.getValue();
    }

    private final android.widget.TextView getTitle() {
        return (android.widget.TextView) this.t.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setAttributes(android.util.AttributeSet attributeSet) {
        android.content.res.TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, com.truecaller.timezone.R$styleable.a);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
        this.u = obtainStyledAttributes.getDimensionPixelSize(0, getResources().getDimensionPixelSize(2131165279));
        this.v = obtainStyledAttributes.getColor(3, getContext().getColor(2131099725));
        this.w = obtainStyledAttributes.getColor(4, getContext().getColor(2131099725));
        this.x = obtainStyledAttributes.getColor(1, getContext().getColor(2131099724));
        this.y = obtainStyledAttributes.getBoolean(2, false);
        obtainStyledAttributes.recycle();
    }

    public final void F(java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "address");
        ix2.qux quxVar = this.z;
        quxVar.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "address");
        fg3.h0.J(quxVar, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new hu1.b(quxVar, str2, str, (df3.bar) null, 22), 3);
    }

    public final void G(java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "address");
        getTitle().setTextColor(this.x);
        getTitle().setTextSize(0, this.u);
        getTitle().setSingleLine(this.y);
        if (str2 != null) {
            android.widget.TextView title = getTitle();
            android.text.SpannableString spannableString = new android.text.SpannableString(h8.s0.q(str2, " · ", str));
            spannableString.setSpan(new android.text.style.ForegroundColorSpan(this.w), 0, str2.length(), 33);
            title.setText(spannableString);
            return;
        }
        getTitle().setText(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void H(int i, int i2) {
        I(i, this.x);
        setBackgroundResource(2131231348);
    }

    public final void I(int i, int i2) {
        getIcon().setImageTintList(android.content.res.ColorStateList.valueOf(i));
        this.v = i;
        this.w = i;
        this.x = i2;
    }

    @org.jetbrains.annotations.NotNull
    public final ix2.bar getPresenter() {
        return this.z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onAttachedToWindow() {
        super/*android.view.ViewGroup*/.onAttachedToWindow();
        if (isInEditMode()) {
            return;
        }
        this.z.a = this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onDetachedFromWindow() {
        this.z.m1();
        super/*android.view.ViewGroup*/.onDetachedFromWindow();
    }

    @Override // ix2.baz
    public void setTimeBasedIcon(@org.jetbrains.annotations.Nullable android.graphics.drawable.Drawable drawable) {
        if (drawable == null) {
            android.widget.ImageView icon = getIcon();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(icon, "<get-icon>(...)");
            gj.m.f0(icon);
        } else {
            getIcon().setImageDrawable(drawable);
            getIcon().setImageTintList(android.content.res.ColorStateList.valueOf(this.v));
            android.widget.ImageView icon2 = getIcon();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(icon2, "<get-icon>(...)");
            gj.m.j0(icon2);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AddressTimezoneView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AddressTimezoneView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.s = gj.m.I(2131364521, this);
        this.t = gj.m.I(2131367033, this);
        tx.c0 c0Var = ((com.truecaller.timezone.AddressTimezoneView.bar) j71.g.E(com.truecaller.timezone.AddressTimezoneView.bar.class, context.getApplicationContext())).H.b;
        this.z = new ix2.qux((kotlin.coroutines.CoroutineContext) c0Var.a.V1.get(), c0Var.L4(), 0);
        yy.qux.z(this, 2131559888, true);
        setAttributes(attributeSet);
    }

    public /* synthetic */ AddressTimezoneView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
