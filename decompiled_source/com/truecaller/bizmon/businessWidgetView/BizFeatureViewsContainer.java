package com.truecaller.bizmon.businessWidgetView;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class BizFeatureViewsContainer extends ua1.g implements com.truecaller.bizmon.businessWidgetView.qux {
    public static final /* synthetic */ int p = 0;
    public final kotlin.Lazy d;
    public wg0.h e;
    public wg0.c f;
    public ck2.bar g;
    public fi0.g h;
    public com.truecaller.bizmon.callSurvey.mvp.surveyButton.StartBizCallSurveyButtonView i;
    public android.widget.Button j;
    public wg0.i k;
    public final kotlin.Lazy l;
    public final kotlin.Lazy m;
    public final kotlin.Lazy n;
    public final kotlin.Lazy o;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BizFeatureViewsContainer(android.content.Context context) {
        this(context, null, 0, 0, 14, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    public static void a(com.truecaller.bizmon.businessWidgetView.BizFeatureViewsContainer bizFeatureViewsContainer, android.view.View view) {
        int i = 2131362601;
        android.widget.Button button = (android.widget.Button) df0.qux.o(2131362601, view);
        if (button != null) {
            i = 2131362637;
            android.widget.Button button2 = (android.widget.Button) df0.qux.o(2131362637, view);
            if (button2 != null) {
                android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) view;
                com.truecaller.bizmon.callSurvey.mvp.surveyButton.StartBizCallSurveyButtonView startBizCallSurveyButtonView = (com.truecaller.bizmon.callSurvey.mvp.surveyButton.StartBizCallSurveyButtonView) df0.qux.o(2131366621, view);
                if (startBizCallSurveyButtonView != null) {
                    fi0.g gVar = new fi0.g(linearLayout, button, button2, startBizCallSurveyButtonView);
                    bizFeatureViewsContainer.h = gVar;
                    bizFeatureViewsContainer.setFacsBizButtons(gVar);
                    return;
                }
                i = 2131366621;
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static void b(com.truecaller.bizmon.businessWidgetView.BizFeatureViewsContainer bizFeatureViewsContainer, int i) {
        bizFeatureViewsContainer.getCallMeBackCardView().setCardBackgroundColor(i);
        ck2.bar barVar = bizFeatureViewsContainer.g;
        if (barVar != null) {
            ((com.truecaller.bizmon.callMeBack.mvp.BizCallMeBackWithSlotsView) barVar.c).setBackgroundColor(i);
        }
    }

    public static void c(com.truecaller.bizmon.businessWidgetView.BizFeatureViewsContainer bizFeatureViewsContainer, int i) {
        bizFeatureViewsContainer.getCallMeBackCardView().setBackgroundResource(i);
        ck2.bar barVar = bizFeatureViewsContainer.g;
        if (barVar != null) {
            ((com.truecaller.bizmon.callMeBack.mvp.BizCallMeBackWithSlotsView) barVar.c).setBackgroundResource(i);
        }
    }

    private final com.truecaller.bizmon.callSurvey.mvp.BaseCallFeedbackSingleView getBaseCallFeedbackSingleView() {
        return (com.truecaller.bizmon.callSurvey.mvp.BaseCallFeedbackSingleView) this.o.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final androidx.cardview.widget.CardView getCallMeBackCardView() {
        return (androidx.cardview.widget.CardView) this.l.getValue();
    }

    private final com.truecaller.bizmon.callSurvey.mvp.StartBizCallSurveyView getStartBizCallSurveyViewPacs() {
        return (com.truecaller.bizmon.callSurvey.mvp.StartBizCallSurveyView) this.m.getValue();
    }

    private final com.truecaller.videocallerid.ui.landscapeVideoPlayer.LandscapeVideoPlayerView getVideoPlayerLandscape() {
        return (com.truecaller.videocallerid.ui.landscapeVideoPlayer.LandscapeVideoPlayerView) this.n.getValue();
    }

    private final void setFacsBizButtons(fi0.g gVar) {
        android.widget.LinearLayout linearLayout = gVar.a;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(linearLayout, "getRoot(...)");
        gj.m.j0(linearLayout);
        this.i = gVar.d;
        this.j = gVar.c;
        gVar.b.setOnClickListener(new wg0.qux(this, 1));
    }

    public final void e() {
        ((sh0.e) getStartBizCallSurveyViewPacs().getPresenter()).d2(true);
    }

    public final void g() {
        android.view.ViewStub viewStub = getBinding().e;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(viewStub, "viewStubBizCallMeBack");
        if (gj.m.D(viewStub)) {
            gj.m.f0(getCallMeBackCardView());
        }
    }

    @org.jetbrains.annotations.NotNull
    public final fi0.m getBinding() {
        return (fi0.m) this.d.getValue();
    }

    @org.jetbrains.annotations.NotNull
    public final wg0.h getOnBizMonViewProfileEventListener() {
        wg0.h hVar = this.e;
        if (hVar != null) {
            return hVar;
        }
        kotlin.jvm.internal.Intrinsics.n("onBizMonViewProfileEventListener");
        throw null;
    }

    @org.jetbrains.annotations.NotNull
    public final wg0.i getOnCmbDismissListener() {
        wg0.i iVar = this.k;
        if (iVar != null) {
            return iVar;
        }
        kotlin.jvm.internal.Intrinsics.n("onCmbDismissListener");
        throw null;
    }

    @org.jetbrains.annotations.NotNull
    public final wg0.c getPresenter() {
        wg0.c cVar = this.f;
        if (cVar != null) {
            return cVar;
        }
        kotlin.jvm.internal.Intrinsics.n("presenter");
        throw null;
    }

    public final void h(boolean z) {
        if (z) {
            android.view.ViewStub viewStub = getBinding().f;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(viewStub, "viewStubBizCallSurvey");
            if (gj.m.D(viewStub)) {
                gj.m.f0(getStartBizCallSurveyViewPacs());
                return;
            }
            return;
        }
        com.truecaller.bizmon.callSurvey.mvp.surveyButton.StartBizCallSurveyButtonView startBizCallSurveyButtonView = this.i;
        if (startBizCallSurveyButtonView != null) {
            gj.m.f0(startBizCallSurveyButtonView);
        }
    }

    public final void i() {
        android.view.ViewStub viewStub = getBinding().d;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(viewStub, "videoPlayer");
        if (gj.m.D(viewStub)) {
            gj.m.f0(getVideoPlayerLandscape());
        }
    }

    public final void j() {
        android.view.ViewStub viewStub = getBinding().b;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(viewStub, "baseCallFeedbackSingleView");
        if (gj.m.D(viewStub)) {
            gj.m.k0(getBaseCallFeedbackSingleView(), false);
        }
    }

    public final void k() {
        getBinding().c.removeView(getBaseCallFeedbackSingleView());
    }

    /* JADX WARN: Type inference failed for: r11v0, types: [android.view.View, com.truecaller.bizmon.callSurvey.mvp.BaseCallFeedbackSingleView, java.lang.Object] */
    public final void l(com.truecaller.data.entity.Contact contact, int i, java.lang.String str, java.lang.String str2, com.truecaller.bizmon.callSurvey.analytic.BizCallSurveyAction bizCallSurveyAction, com.truecaller.bizmon.callSurvey.analytic.BizCallSurveyActionType bizCallSurveyActionType, com.truecaller.bizmon.callSurvey.BizSurveyScreen bizSurveyScreen, java.lang.String str3) {
        java.lang.String str4;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contact, "contact");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "analyticSource");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bizCallSurveyAction, "surveyAction");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bizCallSurveyActionType, "surveyActionType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bizSurveyScreen, "surveyScreen");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "appViewVisitedV2Context");
        ?? baseCallFeedbackSingleView = getBaseCallFeedbackSingleView();
        baseCallFeedbackSingleView.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contact, "contact");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "analyticSource");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bizCallSurveyAction, "surveyAction");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bizCallSurveyActionType, "surveyActionType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bizSurveyScreen, "surveyScreen");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "appViewVisitedV2Context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this, "onBizCallFeedbackSingleViewCloseListener");
        baseCallFeedbackSingleView.A = this;
        xh0.baz bazVar = (xh0.baz) baseCallFeedbackSingleView.getPresenter();
        bazVar.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contact, "contact");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "analyticSource");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bizCallSurveyAction, "surveyAction");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bizCallSurveyActionType, "surveyActionType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bizSurveyScreen, "surveyScreen");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "appViewVisitedV2Context");
        if (str == null) {
            str4 = "";
        } else {
            str4 = str;
        }
        bazVar.r = str4;
        bazVar.q = contact;
        bazVar.s = str2;
        fg3.h0.J(bazVar, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new xh0.bar(bazVar, i, str, str2, str3, contact, bizCallSurveyAction, bizCallSurveyActionType, null), 3);
        gj.m.j0((android.view.View) baseCallFeedbackSingleView);
    }

    public final void m(com.truecaller.bizmon.businessWidgetView.BizMultiViewConfig.BizViewAcsConfig bizViewAcsConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bizViewAcsConfig, "config");
        gj.m.j0(getCallMeBackCardView());
        ck2.bar barVar = this.g;
        if (barVar != null) {
            ((com.truecaller.bizmon.callMeBack.mvp.BizCallMeBackWithSlotsView) barVar.c).I(bizViewAcsConfig, new com.truecaller.bizmon.businessWidgetView.bar(this));
        }
        ck2.bar barVar2 = this.g;
        if (barVar2 != null) {
            ((com.truecaller.bizmon.callMeBack.mvp.BizCallMeBackWithSlotsView) barVar2.c).setCmbDismissListener(new com.truecaller.bizmon.businessWidgetView.baz(this));
        }
    }

    public final void n() {
        fi0.g gVar = this.h;
        if (gVar != null) {
            setFacsBizButtons(gVar);
        } else {
            getBinding().g.setOnInflateListener(new wg0.baz(this, 0));
            getBinding().g.inflate();
        }
    }

    public final void o(com.truecaller.data.entity.Contact contact, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contact, "contact");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "surveyId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "analyticSource");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "appViewVisitedV2Context");
        com.truecaller.bizmon.callSurvey.mvp.StartBizCallSurveyView startBizCallSurveyViewPacs = getStartBizCallSurveyViewPacs();
        wg0.b bVar = new wg0.b(startBizCallSurveyViewPacs, this);
        startBizCallSurveyViewPacs.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "surveyId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contact, "contact");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "analyticSource");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "appViewVisitedV2Context");
        gj.m.j0(startBizCallSurveyViewPacs);
        startBizCallSurveyViewPacs.f = bVar;
        java.lang.Object presenter = startBizCallSurveyViewPacs.getPresenter();
        sh0.f fVar = (sh0.f) presenter;
        if (((qo1.qux) fVar.m.get()).j()) {
            kh0.h hVar = (kh0.h) ((com.truecaller.sdk.bar) fVar).a;
            if (hVar != null) {
                com.truecaller.bizmon.callSurvey.mvp.StartBizCallSurveyView startBizCallSurveyView = (com.truecaller.bizmon.callSurvey.mvp.StartBizCallSurveyView) hVar;
                androidx.constraintlayout.widget.Group group = startBizCallSurveyView.getBinding().e;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(group, "groupBizCallSurveyUi");
                gj.m.f0(group);
                startBizCallSurveyView.getBinding().c.setOnClickListener(startBizCallSurveyView);
                androidx.constraintlayout.widget.Group group2 = startBizCallSurveyView.getBinding().f;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(group2, "groupBizCallSurveyUiNew");
                gj.m.j0(group2);
            }
        } else {
            kh0.h hVar2 = (kh0.h) ((com.truecaller.sdk.bar) fVar).a;
            if (hVar2 != null) {
                com.truecaller.bizmon.callSurvey.mvp.StartBizCallSurveyView startBizCallSurveyView2 = (com.truecaller.bizmon.callSurvey.mvp.StartBizCallSurveyView) hVar2;
                androidx.constraintlayout.widget.Group group3 = startBizCallSurveyView2.getBinding().f;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(group3, "groupBizCallSurveyUiNew");
                gj.m.f0(group3);
                startBizCallSurveyView2.getBinding().b.setOnClickListener(startBizCallSurveyView2);
                androidx.constraintlayout.widget.Group group4 = startBizCallSurveyView2.getBinding().e;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(group4, "groupBizCallSurveyUi");
                gj.m.j0(group4);
            }
        }
        ((sh0.e) presenter).e2(contact, str, str2, str3);
        startBizCallSurveyViewPacs.setTakeSurveyClickListener(new wf.h(this));
        startBizCallSurveyViewPacs.setStartCallSurveyTheme(contact);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onAttachedToWindow() {
        super/*android.widget.FrameLayout*/.onAttachedToWindow();
        if (isInEditMode()) {
            return;
        }
        getPresenter().u0(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onDetachedFromWindow() {
        super/*android.widget.FrameLayout*/.onDetachedFromWindow();
        ((of0.baz) getPresenter()).m1();
    }

    public final void p(p23.f fVar, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fVar, "videoConfig");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "analyticContext");
        com.truecaller.videocallerid.ui.landscapeVideoPlayer.LandscapeVideoPlayerView videoPlayerLandscape = getVideoPlayerLandscape();
        gj.m.j0(videoPlayerLandscape);
        videoPlayerLandscape.b(fVar, str);
    }

    @Override // com.truecaller.bizmon.businessWidgetView.qux
    public void setCMBFACSBackground(int i) {
        getCallMeBackCardView().postDelayed(new wg0.bar(this, i, 0), 200L);
    }

    @Override // com.truecaller.bizmon.businessWidgetView.qux
    public void setCMBPACSBackground(int i) {
        getCallMeBackCardView().postDelayed(new wg0.bar(this, i, 1), 200L);
    }

    public final void setConfig(@org.jetbrains.annotations.NotNull com.truecaller.bizmon.businessWidgetView.BizMultiViewConfig bizMultiViewConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bizMultiViewConfig, "config");
        com.truecaller.bizmon.businessWidgetView.e eVar = (com.truecaller.bizmon.businessWidgetView.e) getPresenter();
        eVar.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bizMultiViewConfig, "config");
        if (bizMultiViewConfig instanceof com.truecaller.bizmon.businessWidgetView.BizMultiViewConfig.BizViewAcsConfig) {
            eVar.m = (com.truecaller.bizmon.businessWidgetView.BizMultiViewConfig.BizViewAcsConfig) bizMultiViewConfig;
            fg3.h0.J(eVar, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new uz.e(eVar, null, 17), 3);
        }
    }

    public final void setOnBizMonViewProfileEventListener(@org.jetbrains.annotations.NotNull wg0.h hVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hVar, "<set-?>");
        this.e = hVar;
    }

    public final void setOnCmbDismissListener(@org.jetbrains.annotations.NotNull wg0.i iVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iVar, "<set-?>");
        this.k = iVar;
    }

    public final void setPresenter(@org.jetbrains.annotations.NotNull wg0.c cVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f = cVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BizFeatureViewsContainer(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BizFeatureViewsContainer(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ BizFeatureViewsContainer(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, int i3, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BizFeatureViewsContainer(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2, 1);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        if (!isInEditMode() && !((ua1.g) this).c) {
            ((ua1.g) this).c = true;
            tx.w wVar = ((tx.d0) ((wg0.f) X3())).c;
            this.f = new com.truecaller.bizmon.businessWidgetView.e((kotlin.coroutines.CoroutineContext) wVar.V1.get(), (kotlin.coroutines.CoroutineContext) wVar.P.get(), cd3.baz.a(wVar.pn), cd3.baz.a(wVar.rn), cd3.baz.a(wVar.mk), cd3.baz.a(wVar.b.u9), cd3.baz.a(wVar.d4), cd3.baz.a(wVar.Zm), cd3.baz.a(wVar.q9));
        }
        this.d = kotlin.LazyKt.lazy(new uy0.o(24, context, this));
        final int i3 = 0;
        this.l = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0(this) { // from class: wg0.a
            public final /* synthetic */ com.truecaller.bizmon.businessWidgetView.BizFeatureViewsContainer b;

            {
                this.b = this;
            }

            public final java.lang.Object invoke() {
                int i4 = i3;
                com.truecaller.bizmon.businessWidgetView.BizFeatureViewsContainer bizFeatureViewsContainer = this.b;
                switch (i4) {
                    case 0:
                        int i5 = com.truecaller.bizmon.businessWidgetView.BizFeatureViewsContainer.p;
                        bizFeatureViewsContainer.getBinding().e.setOnInflateListener(new wg0.baz(bizFeatureViewsContainer, 1));
                        androidx.cardview.widget.CardView inflate = bizFeatureViewsContainer.getBinding().e.inflate();
                        kotlin.jvm.internal.Intrinsics.e(inflate, "null cannot be cast to non-null type androidx.cardview.widget.CardView");
                        return inflate;
                    case 1:
                        int i6 = com.truecaller.bizmon.businessWidgetView.BizFeatureViewsContainer.p;
                        android.view.View inflate2 = bizFeatureViewsContainer.getBinding().f.inflate();
                        kotlin.jvm.internal.Intrinsics.e(inflate2, "null cannot be cast to non-null type com.truecaller.bizmon.callSurvey.mvp.StartBizCallSurveyView");
                        return (com.truecaller.bizmon.callSurvey.mvp.StartBizCallSurveyView) inflate2;
                    case 2:
                        int i7 = com.truecaller.bizmon.businessWidgetView.BizFeatureViewsContainer.p;
                        com.truecaller.videocallerid.ui.landscapeVideoPlayer.LandscapeVideoPlayerView inflate3 = bizFeatureViewsContainer.getBinding().d.inflate();
                        kotlin.jvm.internal.Intrinsics.e(inflate3, "null cannot be cast to non-null type com.truecaller.videocallerid.ui.landscapeVideoPlayer.LandscapeVideoPlayerView");
                        return inflate3;
                    default:
                        int i8 = com.truecaller.bizmon.businessWidgetView.BizFeatureViewsContainer.p;
                        java.lang.Object inflate4 = bizFeatureViewsContainer.getBinding().b.inflate();
                        kotlin.jvm.internal.Intrinsics.e(inflate4, "null cannot be cast to non-null type com.truecaller.bizmon.callSurvey.mvp.BaseCallFeedbackSingleView");
                        return (com.truecaller.bizmon.callSurvey.mvp.BaseCallFeedbackSingleView) inflate4;
                }
            }
        });
        final int i4 = 1;
        this.m = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0(this) { // from class: wg0.a
            public final /* synthetic */ com.truecaller.bizmon.businessWidgetView.BizFeatureViewsContainer b;

            {
                this.b = this;
            }

            public final java.lang.Object invoke() {
                int i42 = i4;
                com.truecaller.bizmon.businessWidgetView.BizFeatureViewsContainer bizFeatureViewsContainer = this.b;
                switch (i42) {
                    case 0:
                        int i5 = com.truecaller.bizmon.businessWidgetView.BizFeatureViewsContainer.p;
                        bizFeatureViewsContainer.getBinding().e.setOnInflateListener(new wg0.baz(bizFeatureViewsContainer, 1));
                        androidx.cardview.widget.CardView inflate = bizFeatureViewsContainer.getBinding().e.inflate();
                        kotlin.jvm.internal.Intrinsics.e(inflate, "null cannot be cast to non-null type androidx.cardview.widget.CardView");
                        return inflate;
                    case 1:
                        int i6 = com.truecaller.bizmon.businessWidgetView.BizFeatureViewsContainer.p;
                        android.view.View inflate2 = bizFeatureViewsContainer.getBinding().f.inflate();
                        kotlin.jvm.internal.Intrinsics.e(inflate2, "null cannot be cast to non-null type com.truecaller.bizmon.callSurvey.mvp.StartBizCallSurveyView");
                        return (com.truecaller.bizmon.callSurvey.mvp.StartBizCallSurveyView) inflate2;
                    case 2:
                        int i7 = com.truecaller.bizmon.businessWidgetView.BizFeatureViewsContainer.p;
                        com.truecaller.videocallerid.ui.landscapeVideoPlayer.LandscapeVideoPlayerView inflate3 = bizFeatureViewsContainer.getBinding().d.inflate();
                        kotlin.jvm.internal.Intrinsics.e(inflate3, "null cannot be cast to non-null type com.truecaller.videocallerid.ui.landscapeVideoPlayer.LandscapeVideoPlayerView");
                        return inflate3;
                    default:
                        int i8 = com.truecaller.bizmon.businessWidgetView.BizFeatureViewsContainer.p;
                        java.lang.Object inflate4 = bizFeatureViewsContainer.getBinding().b.inflate();
                        kotlin.jvm.internal.Intrinsics.e(inflate4, "null cannot be cast to non-null type com.truecaller.bizmon.callSurvey.mvp.BaseCallFeedbackSingleView");
                        return (com.truecaller.bizmon.callSurvey.mvp.BaseCallFeedbackSingleView) inflate4;
                }
            }
        });
        final int i5 = 2;
        this.n = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0(this) { // from class: wg0.a
            public final /* synthetic */ com.truecaller.bizmon.businessWidgetView.BizFeatureViewsContainer b;

            {
                this.b = this;
            }

            public final java.lang.Object invoke() {
                int i42 = i5;
                com.truecaller.bizmon.businessWidgetView.BizFeatureViewsContainer bizFeatureViewsContainer = this.b;
                switch (i42) {
                    case 0:
                        int i52 = com.truecaller.bizmon.businessWidgetView.BizFeatureViewsContainer.p;
                        bizFeatureViewsContainer.getBinding().e.setOnInflateListener(new wg0.baz(bizFeatureViewsContainer, 1));
                        androidx.cardview.widget.CardView inflate = bizFeatureViewsContainer.getBinding().e.inflate();
                        kotlin.jvm.internal.Intrinsics.e(inflate, "null cannot be cast to non-null type androidx.cardview.widget.CardView");
                        return inflate;
                    case 1:
                        int i6 = com.truecaller.bizmon.businessWidgetView.BizFeatureViewsContainer.p;
                        android.view.View inflate2 = bizFeatureViewsContainer.getBinding().f.inflate();
                        kotlin.jvm.internal.Intrinsics.e(inflate2, "null cannot be cast to non-null type com.truecaller.bizmon.callSurvey.mvp.StartBizCallSurveyView");
                        return (com.truecaller.bizmon.callSurvey.mvp.StartBizCallSurveyView) inflate2;
                    case 2:
                        int i7 = com.truecaller.bizmon.businessWidgetView.BizFeatureViewsContainer.p;
                        com.truecaller.videocallerid.ui.landscapeVideoPlayer.LandscapeVideoPlayerView inflate3 = bizFeatureViewsContainer.getBinding().d.inflate();
                        kotlin.jvm.internal.Intrinsics.e(inflate3, "null cannot be cast to non-null type com.truecaller.videocallerid.ui.landscapeVideoPlayer.LandscapeVideoPlayerView");
                        return inflate3;
                    default:
                        int i8 = com.truecaller.bizmon.businessWidgetView.BizFeatureViewsContainer.p;
                        java.lang.Object inflate4 = bizFeatureViewsContainer.getBinding().b.inflate();
                        kotlin.jvm.internal.Intrinsics.e(inflate4, "null cannot be cast to non-null type com.truecaller.bizmon.callSurvey.mvp.BaseCallFeedbackSingleView");
                        return (com.truecaller.bizmon.callSurvey.mvp.BaseCallFeedbackSingleView) inflate4;
                }
            }
        });
        final int i6 = 3;
        this.o = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0(this) { // from class: wg0.a
            public final /* synthetic */ com.truecaller.bizmon.businessWidgetView.BizFeatureViewsContainer b;

            {
                this.b = this;
            }

            public final java.lang.Object invoke() {
                int i42 = i6;
                com.truecaller.bizmon.businessWidgetView.BizFeatureViewsContainer bizFeatureViewsContainer = this.b;
                switch (i42) {
                    case 0:
                        int i52 = com.truecaller.bizmon.businessWidgetView.BizFeatureViewsContainer.p;
                        bizFeatureViewsContainer.getBinding().e.setOnInflateListener(new wg0.baz(bizFeatureViewsContainer, 1));
                        androidx.cardview.widget.CardView inflate = bizFeatureViewsContainer.getBinding().e.inflate();
                        kotlin.jvm.internal.Intrinsics.e(inflate, "null cannot be cast to non-null type androidx.cardview.widget.CardView");
                        return inflate;
                    case 1:
                        int i62 = com.truecaller.bizmon.businessWidgetView.BizFeatureViewsContainer.p;
                        android.view.View inflate2 = bizFeatureViewsContainer.getBinding().f.inflate();
                        kotlin.jvm.internal.Intrinsics.e(inflate2, "null cannot be cast to non-null type com.truecaller.bizmon.callSurvey.mvp.StartBizCallSurveyView");
                        return (com.truecaller.bizmon.callSurvey.mvp.StartBizCallSurveyView) inflate2;
                    case 2:
                        int i7 = com.truecaller.bizmon.businessWidgetView.BizFeatureViewsContainer.p;
                        com.truecaller.videocallerid.ui.landscapeVideoPlayer.LandscapeVideoPlayerView inflate3 = bizFeatureViewsContainer.getBinding().d.inflate();
                        kotlin.jvm.internal.Intrinsics.e(inflate3, "null cannot be cast to non-null type com.truecaller.videocallerid.ui.landscapeVideoPlayer.LandscapeVideoPlayerView");
                        return inflate3;
                    default:
                        int i8 = com.truecaller.bizmon.businessWidgetView.BizFeatureViewsContainer.p;
                        java.lang.Object inflate4 = bizFeatureViewsContainer.getBinding().b.inflate();
                        kotlin.jvm.internal.Intrinsics.e(inflate4, "null cannot be cast to non-null type com.truecaller.bizmon.callSurvey.mvp.BaseCallFeedbackSingleView");
                        return (com.truecaller.bizmon.callSurvey.mvp.BaseCallFeedbackSingleView) inflate4;
                }
            }
        });
    }
}
