package com.truecaller.bizmon.businessWidgetView;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class baz implements wg0.i {
    public final /* synthetic */ com.truecaller.bizmon.businessWidgetView.BizFeatureViewsContainer a;

    public baz(com.truecaller.bizmon.businessWidgetView.BizFeatureViewsContainer bizFeatureViewsContainer) {
        this.a = bizFeatureViewsContainer;
    }

    @Override // wg0.i
    public final void x1() {
        com.truecaller.bizmon.businessWidgetView.BizFeatureViewsContainer bizFeatureViewsContainer = this.a;
        if (bizFeatureViewsContainer.k != null) {
            bizFeatureViewsContainer.getOnCmbDismissListener().x1();
        }
    }
}
