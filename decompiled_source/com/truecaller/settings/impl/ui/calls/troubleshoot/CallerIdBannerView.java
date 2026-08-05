package com.truecaller.settings.impl.ui.calls.troubleshoot;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class CallerIdBannerView extends android.widget.FrameLayout {
    public static final /* synthetic */ int d = 0;
    public final kotlin.Lazy a;
    public final kotlin.Lazy b;
    public final kotlin.Lazy c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CallerIdBannerView(android.content.Context context) {
        this(context, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    private final android.widget.Button getEnableButton() {
        return (android.widget.Button) this.a.getValue();
    }

    private final android.widget.TextView getSubtitle() {
        return (android.widget.TextView) this.b.getValue();
    }

    private final android.widget.TextView getTitle() {
        return (android.widget.TextView) this.c.getValue();
    }

    public final void a(java.lang.String str, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "text");
        getEnableButton().setText(str);
        getEnableButton().setAllCaps(z);
    }

    public final void setEnableButtonClickListener(@org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function1<? super android.view.View, kotlin.Unit> function1) {
        aq2.g gVar;
        android.widget.Button enableButton = getEnableButton();
        if (function1 != null) {
            gVar = new aq2.g(18, function1);
        } else {
            gVar = null;
        }
        enableButton.setOnClickListener(gVar);
    }

    public final void setSubtitle(@org.jetbrains.annotations.NotNull java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "text");
        getSubtitle().setText(str);
    }

    public final void setSubtitleWithLink(@org.jetbrains.annotations.NotNull android.text.SpannableString spannableString) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(spannableString, "text");
        getSubtitle().setText(spannableString);
        getSubtitle().setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
    }

    public final void setTitle(@org.jetbrains.annotations.NotNull java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "text");
        getTitle().setText(str);
    }

    public final void setTitleIcon(int i) {
        getTitle().setCompoundDrawablePadding(bd.bar.q(4));
        getTitle().setCompoundDrawablesRelativeWithIntrinsicBounds(i, 0, 0, 0);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CallerIdBannerView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CallerIdBannerView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.a = gj.m.I(2131362652, this);
        this.b = gj.m.I(2131366692, this);
        this.c = gj.m.I(2131367033, this);
        android.view.View.inflate(context, 2131559912, this);
    }
}
