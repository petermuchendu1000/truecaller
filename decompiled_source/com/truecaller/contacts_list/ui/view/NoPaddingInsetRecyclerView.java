package com.truecaller.contacts_list.ui.view;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class NoPaddingInsetRecyclerView extends androidx.recyclerview.widget.RecyclerView {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public NoPaddingInsetRecyclerView(android.content.Context context) {
        this(context, r0, 2, r0);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        android.util.AttributeSet attributeSet = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int getBottomPaddingOffset() {
        return getPaddingBottom();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int getLeftPaddingOffset() {
        return -getPaddingLeft();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int getRightPaddingOffset() {
        return getPaddingRight();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int getTopPaddingOffset() {
        return -getPaddingTop();
    }

    public final boolean isPaddingOffsetRequired() {
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoPaddingInsetRecyclerView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ NoPaddingInsetRecyclerView(android.content.Context context, android.util.AttributeSet attributeSet, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
