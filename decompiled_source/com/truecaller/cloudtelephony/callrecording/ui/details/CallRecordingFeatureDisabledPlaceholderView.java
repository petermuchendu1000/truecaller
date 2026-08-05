package com.truecaller.cloudtelephony.callrecording.ui.details;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class CallRecordingFeatureDisabledPlaceholderView extends androidx.constraintlayout.widget.ConstraintLayout {
    public final d41.a s;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CallRecordingFeatureDisabledPlaceholderView(android.content.Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void setButtonClickListener(@org.jetbrains.annotations.Nullable android.view.View.OnClickListener onClickListener) {
        ((android.widget.Button) this.s.c).setOnClickListener(onClickListener);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setButtonVisible(boolean z) {
        android.widget.Button button = (android.widget.Button) this.s.c;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(button, "button");
        gj.m.k0(button, z);
        invalidate();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setLoading(boolean z) {
        d41.a aVar = this.s;
        if (z) {
            android.widget.ProgressBar progressBar = (android.widget.ProgressBar) aVar.e;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
            gj.m.j0(progressBar);
            ((android.widget.Button) aVar.c).setText("");
            return;
        }
        android.widget.ProgressBar progressBar2 = (android.widget.ProgressBar) aVar.e;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(progressBar2, "progressBar");
        gj.m.f0(progressBar2);
        ((android.widget.Button) aVar.c).setText(getContext().getString(2132019033));
    }

    public final void setText(@org.jetbrains.annotations.NotNull java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "text");
        ((android.widget.TextView) this.s.d).setText(str);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CallRecordingFeatureDisabledPlaceholderView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CallRecordingFeatureDisabledPlaceholderView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        android.view.LayoutInflater.from(context).inflate(2131560965, (android.view.ViewGroup) this);
        int i2 = 2131362629;
        android.widget.Button button = (android.widget.Button) df0.qux.o(2131362629, this);
        if (button != null) {
            i2 = 2131364878;
            android.widget.TextView textView = (android.widget.TextView) df0.qux.o(2131364878, this);
            if (textView != null) {
                i2 = 2131365848;
                android.widget.ProgressBar progressBar = (android.widget.ProgressBar) df0.qux.o(2131365848, this);
                if (progressBar != null) {
                    d41.a aVar = new d41.a(this, button, textView, progressBar, 23);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(aVar, "inflate(...)");
                    this.s = aVar;
                    return;
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
    }

    public /* synthetic */ CallRecordingFeatureDisabledPlaceholderView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
