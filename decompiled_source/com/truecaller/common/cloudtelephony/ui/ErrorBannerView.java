package com.truecaller.common.cloudtelephony.ui;

/* loaded from: /home/user/tc_decoded/classes2.dex */
public final class ErrorBannerView extends androidx.constraintlayout.widget.ConstraintLayout {
    public final w41.baz s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ErrorBannerView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        androidx.constraintlayout.widget.ConstraintLayout inflate = android.view.LayoutInflater.from(context).inflate(2131559929, (android.view.ViewGroup) this, false);
        addView(inflate);
        int i = 2131363700;
        android.widget.TextView textView = (android.widget.TextView) df0.qux.o(2131363700, inflate);
        if (textView != null) {
            i = 2131363706;
            android.widget.TextView textView2 = (android.widget.TextView) df0.qux.o(2131363706, inflate);
            if (textView2 != null) {
                w41.baz bazVar = new w41.baz(inflate, textView, textView2, 0);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bazVar, "inflate(...)");
                this.s = bazVar;
                return;
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }
}
