package com.truecaller.ui;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/truecaller/ui/TruecallerInit$setupAppBar$behavior$1", "Lcom/google/android/material/appbar/AppBarLayout$Behavior;", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class TruecallerInit$setupAppBar$behavior$1 extends com.google.android.material.appbar.AppBarLayout.Behavior {
    /* renamed from: I, reason: merged with bridge method [inline-methods] */
    public final void p(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, com.google.android.material.appbar.AppBarLayout appBarLayout, android.view.View view, int i, int i2, int[] iArr, int i3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coordinatorLayout, "coordinatorLayout");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appBarLayout, "child");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "target");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iArr, "consumed");
        if ((view instanceof androidx.recyclerview.widget.RecyclerView) && !view.canScrollVertically(1)) {
            i2 = 0;
        }
        super/*com.google.android.material.appbar.AppBarLayout.BaseBehavior*/.I(coordinatorLayout, appBarLayout, view, i, i2, iArr, i3);
    }

    public final void n(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.View view2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coordinatorLayout, "coordinatorLayout");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter((com.google.android.material.appbar.AppBarLayout) view, "child");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view2, "target");
        if (view2 instanceof androidx.recyclerview.widget.RecyclerView) {
            view2.canScrollVertically(1);
        }
    }
}
