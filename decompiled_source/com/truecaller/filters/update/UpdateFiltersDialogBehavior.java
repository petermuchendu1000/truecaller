package com.truecaller.filters.update;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/truecaller/filters/update/UpdateFiltersDialogBehavior;", "Landroid/view/View;", "T", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "<init>", "()V", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class UpdateFiltersDialogBehavior<T extends android.view.View> extends com.google.android.material.bottomsheet.BottomSheetBehavior<T> {
    public UpdateFiltersDialogBehavior() {
        M(Integer.MAX_VALUE);
    }

    public final boolean k(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.MotionEvent motionEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coordinatorLayout, "parent");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "child");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(motionEvent, "event");
        return false;
    }

    public final boolean o(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.View view2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coordinatorLayout, "coordinatorLayout");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "child");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view2, "target");
        return false;
    }

    public final void p(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.View view2, int i, int i2, int[] iArr, int i3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coordinatorLayout, "coordinatorLayout");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "child");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view2, "target");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iArr, "consumed");
    }

    public final void q(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.View view2, int[] iArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coordinatorLayout, "coordinatorLayout");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "child");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view2, "target");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iArr, "consumed");
    }

    public final void v(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.View view2, android.view.View view3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coordinatorLayout, "coordinatorLayout");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "child");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view2, "directTargetChild");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view3, "target");
    }

    public final boolean w(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.View view2, android.view.View view3, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coordinatorLayout, "coordinatorLayout");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "child");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view2, "directTargetChild");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view3, "target");
        return false;
    }

    public final void x(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.View view2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coordinatorLayout, "coordinatorLayout");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "child");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view2, "target");
    }

    public final void y(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.View view2, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coordinatorLayout, "coordinatorLayout");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "child");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view2, "target");
    }

    public final boolean z(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.MotionEvent motionEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coordinatorLayout, "parent");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "child");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(motionEvent, "event");
        return false;
    }
}
