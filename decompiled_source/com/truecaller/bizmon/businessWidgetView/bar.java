package com.truecaller.bizmon.businessWidgetView;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class bar implements wg0.g {
    public final /* synthetic */ com.truecaller.bizmon.businessWidgetView.BizFeatureViewsContainer a;

    public bar(com.truecaller.bizmon.businessWidgetView.BizFeatureViewsContainer bizFeatureViewsContainer) {
        this.a = bizFeatureViewsContainer;
    }

    @Override // wg0.g
    public final void a() {
        androidx.cardview.widget.CardView callMeBackCardView;
        com.truecaller.bizmon.businessWidgetView.BizFeatureViewsContainer bizFeatureViewsContainer = this.a;
        callMeBackCardView = bizFeatureViewsContainer.getCallMeBackCardView();
        gj.m.f0(callMeBackCardView);
        com.truecaller.bizmon.businessWidgetView.e eVar = (com.truecaller.bizmon.businessWidgetView.e) bizFeatureViewsContainer.getPresenter();
        com.truecaller.bizmon.businessWidgetView.BizMultiViewConfig.BizViewAcsConfig bizViewAcsConfig = eVar.m;
        if (bizViewAcsConfig != null) {
            fg3.h0.J(eVar, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new com.truecaller.bizmon.businessWidgetView.c(eVar, bizViewAcsConfig, null), 3);
        }
    }
}
