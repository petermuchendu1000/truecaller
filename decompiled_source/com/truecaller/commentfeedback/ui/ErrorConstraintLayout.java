package com.truecaller.commentfeedback.ui;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class ErrorConstraintLayout extends androidx.constraintlayout.widget.ConstraintLayout {
    public static final int[] t = {2130970370};
    public boolean s;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ErrorConstraintLayout(android.content.Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super/*android.view.ViewGroup*/.onCreateDrawableState(i + 1);
        if (this.s) {
            android.view.View.mergeDrawableStates(onCreateDrawableState, t);
        }
        kotlin.jvm.internal.Intrinsics.d(onCreateDrawableState);
        return onCreateDrawableState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setError(boolean z) {
        this.s = z;
        refreshDrawableState();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ErrorConstraintLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ErrorConstraintLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ ErrorConstraintLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
