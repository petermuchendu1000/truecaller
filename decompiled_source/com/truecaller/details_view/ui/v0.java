package com.truecaller.details_view.ui;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class v0 implements android.view.ViewGroup.OnHierarchyChangeListener {
    public final /* synthetic */ com.truecaller.details_view.ui.DetailsViewActivityLegacy a;

    public v0(com.truecaller.details_view.ui.DetailsViewActivityLegacy detailsViewActivityLegacy) {
        this.a = detailsViewActivityLegacy;
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewAdded(android.view.View view, android.view.View view2) {
        na1.baz w0;
        o80.bar x0;
        o80.bar v0;
        com.truecaller.details_view.ui.DetailsViewActivityLegacy detailsViewActivityLegacy = this.a;
        if (detailsViewActivityLegacy.F0 == null && view2 != null && (((view2 instanceof com.truecaller.details_view.ui.ads.DetailsAdView) || (view2 instanceof db1.s)) && detailsViewActivityLegacy.getLifecycle().b().a(androidx.lifecycle.s.e) && (v0 = detailsViewActivityLegacy.v0()) != null)) {
            v0.l(true);
        }
        if (detailsViewActivityLegacy.G0 == null && view2 != null && (view2 instanceof na1.a) && detailsViewActivityLegacy.getLifecycle().b().a(androidx.lifecycle.s.e) && (x0 = detailsViewActivityLegacy.x0()) != null) {
            x0.l(true);
        }
        if (detailsViewActivityLegacy.H0 == null && view2 != null && (view2 instanceof na1.baz) && detailsViewActivityLegacy.getLifecycle().b().a(androidx.lifecycle.s.e) && (w0 = detailsViewActivityLegacy.w0()) != null) {
            ((ma1.qux) w0.getPresenter()).R0(true);
        }
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(android.view.View view, android.view.View view2) {
    }
}
