package com.truecaller.videocallerid.ui.utils;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class ToastWithActionView extends androidx.cardview.widget.CardView {
    public final kotlin.Lazy a;
    public final kotlin.Lazy c;
    public final kotlin.Lazy d;
    public kotlin.jvm.functions.Function0 e;
    public kotlin.jvm.functions.Function0 f;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ToastWithActionView(android.content.Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    private final android.widget.Button getGotItButton() {
        return (android.widget.Button) this.c.getValue();
    }

    private final android.widget.TextView getMessageTextView() {
        return (android.widget.TextView) this.a.getValue();
    }

    private final com.truecaller.videocallerid.ui.videoplayer.AvatarVideoPlayerView getVideoAvatarView() {
        return (com.truecaller.videocallerid.ui.videoplayer.AvatarVideoPlayerView) this.d.getValue();
    }

    @org.jetbrains.annotations.Nullable
    public final kotlin.jvm.functions.Function0<kotlin.Unit> getDismissListener() {
        return this.f;
    }

    @org.jetbrains.annotations.Nullable
    public final kotlin.jvm.functions.Function0<kotlin.Unit> getGotItClickListener() {
        return this.e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(motionEvent, "event");
        return super/*android.widget.FrameLayout*/.onTouchEvent(motionEvent);
    }

    public final void setDismissListener(@org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        this.f = function0;
    }

    public final void setGotItClickListener(@org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        this.e = function0;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ToastWithActionView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ToastWithActionView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        android.view.ContextThemeWrapper contextThemeWrapper = new android.view.ContextThemeWrapper(context, 2132084053);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contextThemeWrapper, "context");
        this.a = gj.m.I(2131365323, this);
        this.c = gj.m.I(2131364318, this);
        this.d = gj.m.I(2131367382, this);
        android.view.LayoutInflater.from(contextThemeWrapper).inflate(2131560055, (android.view.ViewGroup) this, true);
        setUseCompatPadding(true);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(getContext(), "getContext(...)");
        setRadius(ak.r0.r(8.0f, r2));
        setCardBackgroundColor(k6.a.i(bi3.a.s(contextThemeWrapper, 2130970621), com.vungle.ads.internal.protos.Sdk.SDKError.Reason.AD_LOAD_FAIL_RETRY_AFTER_VALUE));
        getGotItButton().setOnClickListener(new lb1.b(this, 25));
    }

    public /* synthetic */ ToastWithActionView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
