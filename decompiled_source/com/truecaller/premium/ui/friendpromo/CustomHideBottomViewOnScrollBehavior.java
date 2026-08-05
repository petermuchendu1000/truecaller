package com.truecaller.premium.ui.friendpromo;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/truecaller/premium/ui/friendpromo/CustomHideBottomViewOnScrollBehavior;", "Landroid/view/View;", "v", "Lcom/google/android/material/behavior/HideBottomViewOnScrollBehavior;", "<init>", "()V", "legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class CustomHideBottomViewOnScrollBehavior<v extends android.view.View> extends com.google.android.material.behavior.HideBottomViewOnScrollBehavior<v> {
    public final void r(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.View view2, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coordinatorLayout, "coordinatorLayout");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "child");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view2, "target");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iArr, "consumed");
        super.r(coordinatorLayout, view, view2, i, i2, i3, i4, i5, iArr);
        if (i2 == 0 && i4 > 0) {
            A(view);
        } else if (i2 == 0 && i4 < 0) {
            B(view);
        }
    }
}
