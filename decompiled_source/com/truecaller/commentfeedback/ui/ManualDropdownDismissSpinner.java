package com.truecaller.commentfeedback.ui;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class ManualDropdownDismissSpinner extends androidx.appcompat.widget.AppCompatSpinner {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ManualDropdownDismissSpinner(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void b() {
        super.onDetachedFromWindow();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ManualDropdownDismissSpinner(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ManualDropdownDismissSpinner(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }
}
