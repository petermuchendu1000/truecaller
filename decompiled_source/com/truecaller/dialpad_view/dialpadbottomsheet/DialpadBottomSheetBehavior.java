package com.truecaller.dialpad_view.dialpadbottomsheet;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u001d\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/truecaller/dialpad_view/dialpadbottomsheet/DialpadBottomSheetBehavior;", "Landroid/view/View;", "V", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "dialpad-view_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class DialpadBottomSheetBehavior<V extends android.view.View> extends com.google.android.material.bottomsheet.BottomSheetBehavior<V> {
    public hg1.p f0;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DialpadBottomSheetBehavior(android.content.Context context) {
        this(context, r0, 2, r0);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        android.util.AttributeSet attributeSet = null;
    }

    public final boolean k(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.MotionEvent motionEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coordinatorLayout, "parent");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "child");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(motionEvent, "event");
        if (motionEvent.getY() > 0.0d && motionEvent.getY() < view.getTop() && ((com.google.android.material.bottomsheet.BottomSheetBehavior) this).L == 3) {
            N(5);
            hg1.p pVar = this.f0;
            if (pVar != null) {
                pVar.E = com.truecaller.dialpad_view.dialpadbottomsheet.BottomSheetDismissAction.TOUCH_OUTSIDE;
                pVar.y2(5);
            }
        }
        return super.k(coordinatorLayout, view, motionEvent);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialpadBottomSheetBehavior(@org.jetbrains.annotations.NotNull android.content.Context context, @org.jetbrains.annotations.Nullable android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ DialpadBottomSheetBehavior(android.content.Context context, android.util.AttributeSet attributeSet, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
