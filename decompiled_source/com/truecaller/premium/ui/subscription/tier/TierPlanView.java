package com.truecaller.premium.ui.subscription.tier;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class TierPlanView extends android.widget.FrameLayout implements bd3.qux {
    public static final /* synthetic */ int C = 0;
    public be2.g A;
    public qo1.o B;
    public yc3.d a;
    public boolean b;
    public final kotlin.Lazy c;
    public final kotlin.Lazy d;
    public final kotlin.Lazy e;
    public q9.w f;
    public final kotlin.Lazy g;
    public final kotlin.Lazy h;
    public final kotlin.Lazy i;
    public final kotlin.Lazy j;
    public final kotlin.Lazy k;
    public final kotlin.Lazy l;
    public final kotlin.Lazy m;
    public final kotlin.Lazy n;
    public final kotlin.Lazy o;
    public final kotlin.Lazy p;
    public final kotlin.Lazy q;
    public final kotlin.Lazy r;
    public final kotlin.Lazy s;
    public final kotlin.Lazy t;
    public final kotlin.Lazy u;
    public final kotlin.Lazy v;
    public final kotlin.Lazy w;
    public final kotlin.Lazy x;
    public final kotlin.Lazy y;
    public final kotlin.Lazy z;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TierPlanView(android.content.Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    public static java.util.List a(com.truecaller.premium.ui.subscription.tier.TierPlanView tierPlanView) {
        if (((qo1.p) tierPlanView.getPremiumFeaturesInventory()).b.a("featureSubscriptionButtonCompose", com.truecaller.featuretoggles.FeatureState.ENABLED_ALPHA_DEBUG)) {
            return kotlin.collections.y.j(new com.truecaller.premium.ui.subscription.buttons.subscription.compose.SubscriptionButtonComposeView[]{tierPlanView.getActionButtonComposeView(), tierPlanView.getActionButtonComposeView2()});
        }
        return kotlin.collections.y.j(new com.truecaller.premium.ui.subscription.tier.TierPlanActionButtonView[]{tierPlanView.getTierPlanActionButtonView(), tierPlanView.getTierPlanActionButtonView2()});
    }

    public static final /* synthetic */ com.truecaller.premium.ui.subscription.tier.RoundedCornerStyledPlayer b(com.truecaller.premium.ui.subscription.tier.TierPlanView tierPlanView) {
        return tierPlanView.getBackgroundVideoView();
    }

    private final com.truecaller.premium.ui.subscription.buttons.subscription.compose.SubscriptionButtonComposeView getActionButtonComposeView() {
        return (com.truecaller.premium.ui.subscription.buttons.subscription.compose.SubscriptionButtonComposeView) this.l.getValue();
    }

    private final com.truecaller.premium.ui.subscription.buttons.subscription.compose.SubscriptionButtonComposeView getActionButtonComposeView2() {
        return (com.truecaller.premium.ui.subscription.buttons.subscription.compose.SubscriptionButtonComposeView) this.m.getValue();
    }

    private final android.widget.ImageView getBackgroundIv() {
        return (android.widget.ImageView) this.c.getValue();
    }

    private final com.truecaller.premium.ui.subscription.tier.RoundedCornerLottieView getBackgroundLottieView() {
        return (com.truecaller.premium.ui.subscription.tier.RoundedCornerLottieView) this.d.getValue();
    }

    public final com.truecaller.premium.ui.subscription.tier.RoundedCornerStyledPlayer getBackgroundVideoView() {
        return (com.truecaller.premium.ui.subscription.tier.RoundedCornerStyledPlayer) this.e.getValue();
    }

    private final android.widget.LinearLayout getCountDownContainer() {
        return (android.widget.LinearLayout) this.t.getValue();
    }

    private final android.widget.LinearLayout getFeatureListView() {
        return (android.widget.LinearLayout) this.i.getValue();
    }

    private final com.truecaller.common.ui.ShineView getGoldShine() {
        return (com.truecaller.common.ui.ShineView) this.x.getValue();
    }

    private final android.widget.TextView getOfferEndsWarningTv() {
        return (android.widget.TextView) this.v.getValue();
    }

    private final androidx.constraintlayout.widget.ConstraintLayout getPlanCardView() {
        return (androidx.constraintlayout.widget.ConstraintLayout) this.y.getValue();
    }

    private final android.widget.TextView getPlanUnavailableDisclaimer() {
        return (android.widget.TextView) this.o.getValue();
    }

    private final android.widget.LinearLayout getPromoContent() {
        return (android.widget.LinearLayout) this.p.getValue();
    }

    private final android.widget.TextView getPromoDescriptionSubtitleTv() {
        return (android.widget.TextView) this.s.getValue();
    }

    private final android.widget.TextView getPromoDescriptionTv() {
        return (android.widget.TextView) this.r.getValue();
    }

    private final android.widget.TextView getPromoTitleTv() {
        return (android.widget.TextView) this.q.getValue();
    }

    private final android.widget.TextView getSeeMorePlansTv() {
        return (android.widget.TextView) this.w.getValue();
    }

    private final com.truecaller.premium.ui.subscription.tier.TierPlanActionButtonView getTierPlanActionButtonView() {
        return (com.truecaller.premium.ui.subscription.tier.TierPlanActionButtonView) this.j.getValue();
    }

    private final com.truecaller.premium.ui.subscription.tier.TierPlanActionButtonView getTierPlanActionButtonView2() {
        return (com.truecaller.premium.ui.subscription.tier.TierPlanActionButtonView) this.k.getValue();
    }

    private final java.util.List<androidx.constraintlayout.widget.ConstraintLayout> getTierPlanActionButtonsList() {
        return (java.util.List) this.z.getValue();
    }

    private final android.widget.TextView getTierPlanUnavailableBtn() {
        return (android.widget.TextView) this.n.getValue();
    }

    private final com.truecaller.premium.ui.countdown.CountDownTextView getTimerView() {
        return (com.truecaller.premium.ui.countdown.CountDownTextView) this.u.getValue();
    }

    private final android.widget.ImageView getTitleTopIv() {
        return (android.widget.ImageView) this.g.getValue();
    }

    private final android.widget.TextView getTitleTv() {
        return (android.widget.TextView) this.h.getValue();
    }

    private final void setPromoDescription(java.lang.String str) {
        boolean z;
        android.widget.TextView promoDescriptionTv = getPromoDescriptionTv();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(promoDescriptionTv, "<get-promoDescriptionTv>(...)");
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        gj.m.i0(promoDescriptionTv, true ^ z);
        getPromoDescriptionTv().setText(str);
    }

    private final void setPromoDescriptionSubtitle(java.lang.String str) {
        boolean z;
        android.widget.TextView promoDescriptionSubtitleTv = getPromoDescriptionSubtitleTv();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(promoDescriptionSubtitleTv, "<get-promoDescriptionSubtitleTv>(...)");
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        gj.m.i0(promoDescriptionSubtitleTv, true ^ z);
        getPromoDescriptionSubtitleTv().setText(str);
    }

    private final void setPromoTextColor(int i) {
        getPromoTitleTv().setTextColor(getContext().getColor(i));
        getPromoDescriptionTv().setTextColor(getContext().getColor(i));
        getPromoDescriptionSubtitleTv().setTextColor(getContext().getColor(i));
    }

    private final void setPromoTitle(java.lang.String str) {
        boolean z;
        android.widget.TextView promoTitleTv = getPromoTitleTv();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(promoTitleTv, "<get-promoTitleTv>(...)");
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        gj.m.i0(promoTitleTv, true ^ z);
        getPromoTitleTv().setText(str);
    }

    private final void setTitle(java.lang.String str) {
        boolean z;
        android.widget.TextView titleTv = getTitleTv();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(titleTv, "<get-titleTv>(...)");
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        gj.m.i0(titleTv, true ^ z);
        getTitleTv().setText(str);
    }

    private final void setTitleTextColor(int i) {
        getTitleTv().setTextColor(getContext().getColor(i));
    }

    private final void setTitleTopTint(int i) {
        getTitleTopIv().setImageTintList(android.content.res.ColorStateList.valueOf(getContext().getColor(i)));
    }

    public final java.lang.Object X3() {
        if (this.a == null) {
            this.a = new yc3.d(this);
        }
        return this.a.X3();
    }

    public final void c(java.lang.String str, android.graphics.drawable.Drawable drawable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "lottieUrl");
        com.truecaller.premium.ui.subscription.tier.RoundedCornerLottieView backgroundLottieView = getBackgroundLottieView();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(backgroundLottieView, "<get-backgroundLottieView>(...)");
        backgroundLottieView.setFailureListener(new lf2.l(new l02.baz(3, this, drawable), 0));
        backgroundLottieView.setAnimationFromUrl(str);
        backgroundLottieView.k();
    }

    public final void d(java.lang.String str, android.graphics.drawable.Drawable drawable) {
        try {
            androidx.appcompat.app.AppCompatActivity a0 = gj.m.a0(this);
            if (!a0.isDestroyed()) {
                if (!a0.isFinishing()) {
                    com.bumptech.glide.g D = com.bumptech.glide.baz.f(this).q(str).r(2131231463).q(getBackgroundIv().getWidth(), getBackgroundIv().getHeight()).D(new dg.u(getResources().getDimensionPixelSize(2131166787)), true);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(D, "transform(...)");
                    com.bumptech.glide.g gVar = D;
                    if (drawable != null) {
                        gVar.O(com.bumptech.glide.baz.f(this).n(drawable));
                    }
                    gVar.P(getBackgroundIv());
                }
            }
        } catch (java.lang.Exception e) {
            com.truecaller.log.AssertionUtil.reportThrowableButNeverCrash(e);
        }
    }

    public final void e(int i, java.util.List list) {
        int i2;
        java.lang.String text;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "freeTextFeatureList");
        android.widget.LinearLayout featureListView = getFeatureListView();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(featureListView, "<get-featureListView>(...)");
        gj.m.j0(featureListView);
        getFeatureListView().removeAllViews();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            k92.r rVar = (k92.r) obj;
            if (rVar.b() != com.truecaller.premium.data.tier.TierFreeTextFeatureType.UNKNOWN && (text = rVar.getText()) != null && text.length() != 0) {
                arrayList.add(obj);
            }
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            k92.r rVar2 = (k92.r) it.next();
            android.content.Context context = getContext();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            lf2.a aVar = new lf2.a(context);
            java.lang.String text2 = rVar2.getText();
            if (text2 == null) {
                text2 = "";
            }
            aVar.setTitle(text2);
            com.truecaller.premium.data.tier.TierFreeTextFeatureType b = rVar2.b();
            if (b == null) {
                i2 = -1;
            } else {
                i2 = lf2.m.a[b.ordinal()];
            }
            if (i2 != 1) {
                if (i2 == 2) {
                    aVar.setStatusIcon(2131232999);
                }
            } else {
                aVar.setStatusIcon(2131233009);
            }
            aVar.setEnabled(i);
            getFeatureListView().addView(aVar);
        }
    }

    public final void f(n00.h hVar, androidx.recyclerview.widget.k2 k2Var, java.util.ArrayList arrayList) {
        n00.h hVar2;
        androidx.recyclerview.widget.k2 k2Var2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hVar, "itemEventReceiver");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(k2Var, "holder");
        if (arrayList != null) {
            int i = 0;
            for (java.lang.Object obj : arrayList) {
                int i2 = i + 1;
                if (i >= 0) {
                    java.util.List<androidx.constraintlayout.widget.ConstraintLayout> tierPlanActionButtonsList = getTierPlanActionButtonsList();
                    if (arrayList.size() == 1) {
                        i = 1;
                    }
                    androidx.constraintlayout.widget.ConstraintLayout constraintLayout = tierPlanActionButtonsList.get(i);
                    if (constraintLayout instanceof com.truecaller.premium.ui.subscription.tier.TierPlanActionButtonView) {
                        hVar2 = hVar;
                        k2Var2 = k2Var;
                        com.truecaller.adapter_delegates.ItemEventKt.setClickEventEmitter$default(constraintLayout, hVar2, k2Var2, (java.lang.String) null, obj, 4, (java.lang.Object) null);
                    } else {
                        hVar2 = hVar;
                        k2Var2 = k2Var;
                        if (constraintLayout instanceof com.truecaller.premium.ui.subscription.buttons.subscription.compose.SubscriptionButtonComposeView) {
                            com.truecaller.premium.ui.subscription.buttons.subscription.compose.SubscriptionButtonComposeView subscriptionButtonComposeView = (com.truecaller.premium.ui.subscription.buttons.subscription.compose.SubscriptionButtonComposeView) constraintLayout;
                            subscriptionButtonComposeView.setOnClickListener(new bx0.bar(hVar2, k2Var2, subscriptionButtonComposeView, obj, 13));
                        }
                    }
                    i = i2;
                    hVar = hVar2;
                    k2Var = k2Var2;
                } else {
                    kotlin.collections.y.p();
                    throw null;
                }
            }
        }
    }

    public final void g(n00.h hVar, androidx.recyclerview.widget.k2 k2Var, java.io.Serializable serializable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hVar, "itemEventReceiver");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(k2Var, "holder");
        androidx.constraintlayout.widget.ConstraintLayout planCardView = getPlanCardView();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(planCardView, "<get-planCardView>(...)");
        com.truecaller.adapter_delegates.ItemEventKt.setClickEventEmitter$default(planCardView, hVar, k2Var, (java.lang.String) null, serializable, 4, (java.lang.Object) null);
    }

    @org.jetbrains.annotations.NotNull
    public final be2.g getPlayerUtil() {
        be2.g gVar = this.A;
        if (gVar != null) {
            return gVar;
        }
        kotlin.jvm.internal.Intrinsics.n("playerUtil");
        throw null;
    }

    @org.jetbrains.annotations.NotNull
    public final qo1.o getPremiumFeaturesInventory() {
        qo1.o oVar = this.B;
        if (oVar != null) {
            return oVar;
        }
        kotlin.jvm.internal.Intrinsics.n("premiumFeaturesInventory");
        throw null;
    }

    public final void h(n00.h hVar, androidx.recyclerview.widget.k2 k2Var, com.truecaller.premium.data.tier.PremiumTierType premiumTierType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hVar, "itemEventReceiver");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(k2Var, "holder");
        android.widget.TextView seeMorePlansTv = getSeeMorePlansTv();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(seeMorePlansTv, "<get-seeMorePlansTv>(...)");
        com.truecaller.adapter_delegates.ItemEventKt.setClickEventEmitter$default(seeMorePlansTv, hVar, k2Var, (java.lang.String) null, premiumTierType, 4, (java.lang.Object) null);
    }

    public final void i(int i, boolean z) {
        android.widget.TextView seeMorePlansTv = getSeeMorePlansTv();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(seeMorePlansTv, "<get-seeMorePlansTv>(...)");
        gj.m.k0(seeMorePlansTv, z);
        getSeeMorePlansTv().setTextColor(getContext().getColor(i));
    }

    public final void j(boolean z) {
        int i;
        com.truecaller.common.ui.ShineView goldShine = getGoldShine();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(goldShine, "<get-goldShine>(...)");
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        goldShine.setVisibility(i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        q9.w wVar = this.f;
        if (wVar != null) {
            wVar.setPlayWhenReady(false);
        }
        q9.w wVar2 = this.f;
        if (wVar2 != null) {
            wVar2.release();
        }
        this.f = null;
    }

    public final void setBackgroundImage(@org.jetbrains.annotations.Nullable android.graphics.drawable.Drawable drawable) {
        try {
            androidx.appcompat.app.AppCompatActivity a0 = gj.m.a0(this);
            if (!a0.isDestroyed()) {
                if (!a0.isFinishing()) {
                    com.bumptech.glide.baz.f(this).n(drawable).q(getBackgroundIv().getWidth(), getBackgroundIv().getHeight()).D(new dg.u(getResources().getDimensionPixelSize(2131166787)), true).P(getBackgroundIv());
                }
            }
        } catch (java.lang.Exception e) {
            com.truecaller.log.AssertionUtil.reportThrowableButNeverCrash(e);
        }
    }

    public final void setFeatureList(@org.jetbrains.annotations.Nullable java.util.List<lf2.b> list) {
        boolean z;
        android.widget.LinearLayout featureListView = getFeatureListView();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(featureListView, "<get-featureListView>(...)");
        java.util.List<lf2.b> list2 = list;
        if (list2 != null && !list2.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        gj.m.i0(featureListView, !z);
        getFeatureListView().removeAllViews();
        if (list != null) {
            for (lf2.b bVar : list) {
                android.content.Context context = getContext();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                lf2.a aVar = new lf2.a(context);
                aVar.setTextViewSpec(bVar);
                getFeatureListView().addView(aVar);
            }
        }
    }

    public final void setLifeCycleOwner(@org.jetbrains.annotations.NotNull androidx.lifecycle.d0 d0Var) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(d0Var, "lifecycleOwner");
        getGoldShine().setLifecycleOwner(d0Var);
    }

    public final void setOnCountDownTimerStateListener(@org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function1<? super me2.b, kotlin.Unit> function1) {
        getTimerView().setOnCountDownTimerStateListener(function1);
    }

    /* JADX WARN: Type inference failed for: r1v10, types: [android.view.View, com.truecaller.premium.ui.subscription.buttons.subscription.compose.SubscriptionButtonComposeView] */
    /* JADX WARN: Type inference failed for: r1v11, types: [com.truecaller.premium.ui.subscription.tier.TierPlanActionButtonView, android.view.View] */
    /* JADX WARN: Type inference failed for: r1v5, types: [android.view.View, com.truecaller.premium.ui.subscription.buttons.subscription.compose.SubscriptionButtonComposeView] */
    /* JADX WARN: Type inference failed for: r1v6, types: [com.truecaller.premium.ui.subscription.tier.TierPlanActionButtonView, android.view.View] */
    public final void setPlanActionButtonSpec(@org.jetbrains.annotations.Nullable java.util.List<xe2.s> list) {
        int i = 0;
        if (list != null && list.size() == 1) {
            xe2.s sVar = list.get(0);
            java.lang.Object obj = getTierPlanActionButtonsList().get(1);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
            java.lang.Object obj2 = (android.view.View) obj;
            if (obj2 instanceof com.truecaller.premium.ui.subscription.tier.TierPlanActionButtonView) {
                ?? r1 = (com.truecaller.premium.ui.subscription.tier.TierPlanActionButtonView) obj2;
                gj.m.i0((android.view.View) r1, true);
                r1.setButtonConfig(sVar);
            } else if (obj2 instanceof com.truecaller.premium.ui.subscription.buttons.subscription.compose.SubscriptionButtonComposeView) {
                ?? r13 = (com.truecaller.premium.ui.subscription.buttons.subscription.compose.SubscriptionButtonComposeView) obj2;
                gj.m.i0((android.view.View) r13, true);
                r13.setButtonConfig(sVar);
            }
        } else if (list != null) {
            for (java.lang.Object obj3 : list) {
                int i2 = i + 1;
                if (i >= 0) {
                    xe2.s sVar2 = (xe2.s) obj3;
                    if (i < 2) {
                        java.lang.Object obj4 = getTierPlanActionButtonsList().get(i);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj4, "get(...)");
                        java.lang.Object obj5 = (android.view.View) obj4;
                        if (obj5 instanceof com.truecaller.premium.ui.subscription.tier.TierPlanActionButtonView) {
                            ?? r14 = (com.truecaller.premium.ui.subscription.tier.TierPlanActionButtonView) obj5;
                            gj.m.i0((android.view.View) r14, true);
                            r14.setButtonConfig(sVar2);
                        } else if (obj5 instanceof com.truecaller.premium.ui.subscription.buttons.subscription.compose.SubscriptionButtonComposeView) {
                            ?? r15 = (com.truecaller.premium.ui.subscription.buttons.subscription.compose.SubscriptionButtonComposeView) obj5;
                            gj.m.i0((android.view.View) r15, true);
                            r15.setButtonConfig(sVar2);
                        }
                    }
                    i = i2;
                } else {
                    kotlin.collections.y.p();
                    throw null;
                }
            }
        }
        android.widget.TextView tierPlanUnavailableBtn = getTierPlanUnavailableBtn();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(tierPlanUnavailableBtn, "<get-tierPlanUnavailableBtn>(...)");
        gj.m.f0(tierPlanUnavailableBtn);
        android.widget.TextView planUnavailableDisclaimer = getPlanUnavailableDisclaimer();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(planUnavailableDisclaimer, "<get-planUnavailableDisclaimer>(...)");
        gj.m.f0(planUnavailableDisclaimer);
    }

    public final void setPlanCountDownSpec(@org.jetbrains.annotations.Nullable lf2.qux quxVar) {
        boolean z;
        android.widget.LinearLayout countDownContainer = getCountDownContainer();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(countDownContainer, "<get-countDownContainer>(...)");
        if (quxVar != null) {
            z = true;
        } else {
            z = false;
        }
        gj.m.i0(countDownContainer, z);
        if (quxVar != null) {
            int color = getContext().getColor(quxVar.c);
            getCountDownContainer().setBackground(quxVar.b);
            getOfferEndsWarningTv().setTextColor(color);
            getTimerView().setTimerTextColor(color);
            getTimerView().setTimerTextSize(bd.bar.q(10));
            getTimerView().G(quxVar.a);
        }
    }

    public final void setPlanUnavailable(int i) {
        getPlanUnavailableDisclaimer().setTextColor(getContext().getColor(i));
        android.widget.TextView planUnavailableDisclaimer = getPlanUnavailableDisclaimer();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(planUnavailableDisclaimer, "<get-planUnavailableDisclaimer>(...)");
        gj.m.j0(planUnavailableDisclaimer);
        getTierPlanUnavailableBtn().setTextColor(getContext().getColor(i));
        android.widget.TextView tierPlanUnavailableBtn = getTierPlanUnavailableBtn();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(tierPlanUnavailableBtn, "<get-tierPlanUnavailableBtn>(...)");
        gj.m.j0(tierPlanUnavailableBtn);
        androidx.constraintlayout.widget.ConstraintLayout tierPlanActionButtonView2 = getTierPlanActionButtonView2();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(tierPlanActionButtonView2, "<get-tierPlanActionButtonView2>(...)");
        gj.m.f0(tierPlanActionButtonView2);
        for (androidx.constraintlayout.widget.ConstraintLayout constraintLayout : getTierPlanActionButtonsList()) {
            kotlin.jvm.internal.Intrinsics.d(constraintLayout);
            gj.m.f0(constraintLayout);
        }
    }

    public final void setPlayerUtil(@org.jetbrains.annotations.NotNull be2.g gVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gVar, "<set-?>");
        this.A = gVar;
    }

    public final void setPremiumFeaturesInventory(@org.jetbrains.annotations.NotNull qo1.o oVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(oVar, "<set-?>");
        this.B = oVar;
    }

    public final void setPromoSpec(@org.jetbrains.annotations.Nullable lf2.t tVar) {
        boolean z;
        android.widget.LinearLayout promoContent = getPromoContent();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(promoContent, "<get-promoContent>(...)");
        if (tVar != null) {
            z = true;
        } else {
            z = false;
        }
        gj.m.i0(promoContent, z);
        if (tVar != null) {
            setPromoTitle(tVar.a);
            setPromoDescription(tVar.b);
            setPromoDescriptionSubtitle(tVar.c);
            setPromoTextColor(tVar.d);
        }
    }

    public final void setTitleSpec(@org.jetbrains.annotations.NotNull lf2.w wVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(wVar, "tierTitleSpec");
        setTitle(wVar.a);
        int i = wVar.b;
        setTitleTopTint(i);
        setTitleTextColor(i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TierPlanView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, ca.c] */
    public TierPlanView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        if (!isInEditMode() && !this.b) {
            this.b = true;
            tx.w wVar = ((lf2.s) X3()).c;
            this.A = (be2.g) wVar.b.K8.get();
            this.B = (qo1.o) wVar.e4.get();
        }
        this.c = gj.m.I(2131362406, this);
        this.d = gj.m.I(2131362407, this);
        this.e = gj.m.I(2131362408, this);
        this.g = gj.m.I(2131367049, this);
        this.h = gj.m.I(2131367033, this);
        this.i = gj.m.I(2131363840, this);
        this.j = gj.m.I(2131366986, this);
        this.k = gj.m.I(2131366987, this);
        this.l = gj.m.I(2131361914, this);
        this.m = gj.m.I(2131361915, this);
        this.n = gj.m.I(2131365744, this);
        this.o = gj.m.I(2131365745, this);
        this.p = gj.m.I(2131365861, this);
        this.q = gj.m.I(2131365867, this);
        this.r = gj.m.I(2131365862, this);
        this.s = gj.m.I(2131365863, this);
        this.t = gj.m.I(2131363193, this);
        this.u = gj.m.I(2131367010, this);
        this.v = gj.m.I(2131365551, this);
        this.w = gj.m.I(2131366328, this);
        this.x = gj.m.I(2131364300, this);
        this.y = gj.m.I(2131366180, this);
        this.z = kotlin.LazyKt.lazy(new lf2.k(this, 0));
        yy.qux.z(this, 2131561126, true);
        com.truecaller.premium.ui.subscription.tier.RoundedCornerLottieView backgroundLottieView = getBackgroundLottieView();
        if (backgroundLottieView != null) {
            backgroundLottieView.setCacheComposition(true);
            backgroundLottieView.setRepeatMode(1);
            backgroundLottieView.setRepeatCount(-1);
        }
        q9.j jVar = new q9.j(getContext());
        z9.n nVar = new z9.n(((be2.j) getPlayerUtil()).a());
        nVar.h((ca.c) new java.lang.Object());
        jVar.b(nVar);
        q9.w a = jVar.a();
        this.f = a;
        a.setRepeatMode(2);
        a.setPlayWhenReady(true);
        getBackgroundVideoView().setPlayer(this.f);
        getBackgroundVideoView().setUseController(false);
        getBackgroundVideoView().setResizeMode(4);
    }

    public /* synthetic */ TierPlanView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
