package com.truecaller.bizmon.callSurvey.mvp;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class BaseCallFeedbackSingleView extends androidx.constraintlayout.widget.ConstraintLayout implements sh0.baz, yh0.c, bd3.qux {
    public static final /* synthetic */ int B = 0;
    public com.truecaller.bizmon.businessWidgetView.BizFeatureViewsContainer A;
    public yc3.d s;
    public final boolean t;
    public sh0.bar u;
    public final fi0.b v;
    public di0.baz w;
    public ai0.baz x;
    public bi0.baz y;
    public ci0.baz z;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BaseCallFeedbackSingleView(android.content.Context context) {
        this(context, null, 0, 0, 14, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // yh0.c
    public final void D3(int i) {
        com.truecaller.bizmon.callSurvey.data.entities.BizSurveyQuestion bizSurveyQuestion;
        com.truecaller.bizmon.callSurvey.analytic.BizCallSurveyScrollDirection bizCallSurveyScrollDirection;
        int i2;
        java.lang.String str;
        java.util.List list;
        xh0.baz bazVar = (xh0.baz) getPresenter();
        bazVar.o = i;
        if (i > 0) {
            if (!bazVar.t) {
                qh0.bar barVar = bazVar.p;
                if (barVar != null && (list = barVar.i) != null) {
                    bizSurveyQuestion = (com.truecaller.bizmon.callSurvey.data.entities.BizSurveyQuestion) list.get(i);
                } else {
                    bizSurveyQuestion = null;
                }
                if (i > bazVar.o) {
                    bizCallSurveyScrollDirection = com.truecaller.bizmon.callSurvey.analytic.BizCallSurveyScrollDirection.FORWARD;
                } else {
                    bizCallSurveyScrollDirection = com.truecaller.bizmon.callSurvey.analytic.BizCallSurveyScrollDirection.BACKWARD;
                }
                com.truecaller.bizmon.callSurvey.analytic.BizCallSurveyScrollDirection bizCallSurveyScrollDirection2 = bizCallSurveyScrollDirection;
                if (bizSurveyQuestion != null) {
                    i2 = bizSurveyQuestion.getId();
                } else {
                    i2 = -1;
                }
                if (bizSurveyQuestion == null || (str = bizSurveyQuestion.getType()) == null) {
                    str = "unknown";
                }
                bazVar.c2(i2, str, com.truecaller.bizmon.callSurvey.analytic.BizCallSurveyAction.SCROLL, com.truecaller.bizmon.callSurvey.analytic.BizCallSurveyScrollType.MANUAL, bizCallSurveyScrollDirection2, null);
            } else {
                bazVar.t = false;
            }
        }
        mh0.a aVar = (mh0.a) bazVar.j.get();
        ((u03.baz) bazVar.k.get()).getClass();
        aVar.c = java.lang.Long.valueOf(java.lang.System.currentTimeMillis());
        aVar.d.add(java.lang.Integer.valueOf(i));
        sh0.baz bazVar2 = (sh0.baz) ((com.truecaller.sdk.bar) bazVar).a;
        if (bazVar2 != null) {
            int i3 = bazVar.o;
            int i4 = bazVar.m;
            if (i3 == i4 - 1) {
                if (i4 < 3) {
                    ((com.truecaller.bizmon.callSurvey.mvp.BaseCallFeedbackSingleView) bazVar2).H(false);
                } else {
                    ((com.truecaller.bizmon.callSurvey.mvp.BaseCallFeedbackSingleView) bazVar2).H(true);
                }
                ((com.truecaller.bizmon.callSurvey.mvp.BaseCallFeedbackSingleView) bazVar2).G(false);
            } else if (i3 == 0) {
                com.truecaller.bizmon.callSurvey.mvp.BaseCallFeedbackSingleView baseCallFeedbackSingleView = (com.truecaller.bizmon.callSurvey.mvp.BaseCallFeedbackSingleView) bazVar2;
                baseCallFeedbackSingleView.H(false);
                baseCallFeedbackSingleView.G(false);
            } else if (i3 == 1) {
                com.truecaller.bizmon.callSurvey.mvp.BaseCallFeedbackSingleView baseCallFeedbackSingleView2 = (com.truecaller.bizmon.callSurvey.mvp.BaseCallFeedbackSingleView) bazVar2;
                baseCallFeedbackSingleView2.H(false);
                baseCallFeedbackSingleView2.G(true);
            } else {
                com.truecaller.bizmon.callSurvey.mvp.BaseCallFeedbackSingleView baseCallFeedbackSingleView3 = (com.truecaller.bizmon.callSurvey.mvp.BaseCallFeedbackSingleView) bazVar2;
                baseCallFeedbackSingleView3.H(true);
                baseCallFeedbackSingleView3.G(true);
            }
            sh0.baz bazVar3 = (sh0.baz) ((com.truecaller.sdk.bar) bazVar).a;
            if (bazVar3 != null) {
                bazVar3.setQuesNumber(bazVar.o + " of " + (bazVar.m - 1));
            }
        }
    }

    public final void F(boolean z) {
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager;
        fi0.b bVar = this.v;
        com.truecaller.bizmon.callSurvey.mvp.CustomRecyclerView customRecyclerView = bVar.g;
        androidx.recyclerview.widget.RecyclerView recyclerView = bVar.g;
        androidx.recyclerview.widget.LinearLayoutManager layoutManager = customRecyclerView.getLayoutManager();
        if (layoutManager instanceof androidx.recyclerview.widget.LinearLayoutManager) {
            linearLayoutManager = layoutManager;
        } else {
            linearLayoutManager = null;
        }
        if (linearLayoutManager != null) {
            final int Y0 = linearLayoutManager.Y0() + 1;
            final int Y02 = linearLayoutManager.Y0() - 1;
            if (Y0 <= linearLayoutManager.Q() - 1 && z) {
                final int i = 0;
                recyclerView.postDelayed(new java.lang.Runnable(this) { // from class: sh0.a
                    public final /* synthetic */ com.truecaller.bizmon.callSurvey.mvp.BaseCallFeedbackSingleView b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i) {
                            case 0:
                                this.b.v.g.smoothScrollToPosition(Y0);
                                return;
                            default:
                                this.b.v.g.smoothScrollToPosition(Y0);
                                return;
                        }
                    }
                }, 100L);
            } else if (!z && Y02 > -1) {
                final int i2 = 1;
                recyclerView.postDelayed(new java.lang.Runnable(this) { // from class: sh0.a
                    public final /* synthetic */ com.truecaller.bizmon.callSurvey.mvp.BaseCallFeedbackSingleView b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i2) {
                            case 0:
                                this.b.v.g.smoothScrollToPosition(Y02);
                                return;
                            default:
                                this.b.v.g.smoothScrollToPosition(Y02);
                                return;
                        }
                    }
                }, 100L);
            }
        }
    }

    public final void G(boolean z) {
        android.widget.ImageView imageView = this.v.d;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(imageView, "ivNextQues");
        gj.m.k0(imageView, z);
    }

    public final void H(boolean z) {
        android.widget.ImageView imageView = this.v.e;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(imageView, "ivPrevQues");
        gj.m.k0(imageView, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.Object X3() {
        if (this.s == null) {
            this.s = new yc3.d(this);
        }
        return this.s.X3();
    }

    @org.jetbrains.annotations.NotNull
    public final fi0.b getBinding() {
        return this.v;
    }

    @org.jetbrains.annotations.NotNull
    public final ci0.baz getBizRatingViewHolderPresenter() {
        ci0.baz bazVar = this.z;
        if (bazVar != null) {
            return bazVar;
        }
        kotlin.jvm.internal.Intrinsics.n("bizRatingViewHolderPresenter");
        throw null;
    }

    @org.jetbrains.annotations.NotNull
    public final ai0.baz getFreeTextViewHolderPresenter() {
        ai0.baz bazVar = this.x;
        if (bazVar != null) {
            return bazVar;
        }
        kotlin.jvm.internal.Intrinsics.n("freeTextViewHolderPresenter");
        throw null;
    }

    @org.jetbrains.annotations.NotNull
    public final bi0.baz getListChoiceViewHolderPresenter() {
        bi0.baz bazVar = this.y;
        if (bazVar != null) {
            return bazVar;
        }
        kotlin.jvm.internal.Intrinsics.n("listChoiceViewHolderPresenter");
        throw null;
    }

    @org.jetbrains.annotations.NotNull
    public final sh0.bar getPresenter() {
        sh0.bar barVar = this.u;
        if (barVar != null) {
            return barVar;
        }
        kotlin.jvm.internal.Intrinsics.n("presenter");
        throw null;
    }

    @org.jetbrains.annotations.NotNull
    public final di0.baz getSingleAnswerViewPresenter() {
        di0.baz bazVar = this.w;
        if (bazVar != null) {
            return bazVar;
        }
        kotlin.jvm.internal.Intrinsics.n("singleAnswerViewPresenter");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onAttachedToWindow() {
        super/*android.view.ViewGroup*/.onAttachedToWindow();
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = new androidx.recyclerview.widget.LinearLayoutManager(getContext(), 0, false);
        fi0.b bVar = this.v;
        bVar.g.setNestedScrollingEnabled(false);
        com.truecaller.bizmon.callSurvey.mvp.CustomRecyclerView customRecyclerView = bVar.g;
        customRecyclerView.setLayoutManager(linearLayoutManager);
        customRecyclerView.setHasFixedSize(true);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(customRecyclerView, "rvFeedback");
        yh0.b.a(customRecyclerView, new androidx.recyclerview.widget.o2(), this);
        getPresenter().a = this;
    }

    public final void setBizRatingViewHolderPresenter(@org.jetbrains.annotations.NotNull ci0.baz bazVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bazVar, "<set-?>");
        this.z = bazVar;
    }

    @Override // sh0.baz
    public void setFeedbackViewBottomMargin(int i) {
        fi0.b bVar = this.v;
        android.view.ViewGroup.LayoutParams layoutParams = bVar.g.getLayoutParams();
        kotlin.jvm.internal.Intrinsics.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMargins(0, 0, 0, i);
        bVar.g.setLayoutParams(marginLayoutParams);
    }

    public final void setFreeTextViewHolderPresenter(@org.jetbrains.annotations.NotNull ai0.baz bazVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bazVar, "<set-?>");
        this.x = bazVar;
    }

    @Override // sh0.baz
    public void setListAdapter(@org.jetbrains.annotations.NotNull java.util.List<com.truecaller.bizmon.callSurvey.data.entities.BizSurveyQuestion> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "questions");
        this.v.g.setAdapter(new lh0.bar(getSingleAnswerViewPresenter(), getFreeTextViewHolderPresenter(), getListChoiceViewHolderPresenter(), getBizRatingViewHolderPresenter(), list, new op2.baz(this), false));
    }

    public final void setListChoiceViewHolderPresenter(@org.jetbrains.annotations.NotNull bi0.baz bazVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bazVar, "<set-?>");
        this.y = bazVar;
    }

    public final void setPresenter(@org.jetbrains.annotations.NotNull sh0.bar barVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "<set-?>");
        this.u = barVar;
    }

    @Override // sh0.baz
    public void setQuesNumber(@org.jetbrains.annotations.NotNull java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "quesNumber");
        this.v.h.setText(str);
    }

    public final void setSingleAnswerViewPresenter(@org.jetbrains.annotations.NotNull di0.baz bazVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bazVar, "<set-?>");
        this.w = bazVar;
    }

    @Override // sh0.baz
    public void setViewHeight(int i) {
        fi0.b bVar = this.v;
        android.view.ViewGroup.LayoutParams layoutParams = bVar.a.getLayoutParams();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(layoutParams, "getLayoutParams(...)");
        layoutParams.height = i;
        bVar.a.setLayoutParams(layoutParams);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BaseCallFeedbackSingleView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BaseCallFeedbackSingleView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ BaseCallFeedbackSingleView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, int i3, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BaseCallFeedbackSingleView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        if (!isInEditMode() && !this.t) {
            this.t = true;
            tx.w wVar = ((tx.d0) ((sh0.b) X3())).c;
            this.u = new xh0.baz((kotlin.coroutines.CoroutineContext) wVar.V1.get(), (kotlin.coroutines.CoroutineContext) wVar.P.get(), cd3.baz.a(wVar.rn), cd3.baz.a(wVar.kn), cd3.baz.a(wVar.Zm), cd3.baz.a(wVar.hn), cd3.baz.a(wVar.gn), cd3.baz.a(wVar.W), cd3.baz.a(wVar.v4));
            this.w = new b91.a(27);
            this.x = new rd0.bar(3);
            this.y = new b91.a(9);
            this.z = new b91.baz(17);
        }
        android.view.LayoutInflater from = android.view.LayoutInflater.from(context);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(from, "from(...)");
        yy.qux.F(from, true).inflate(2131559893, (android.view.ViewGroup) this);
        int i3 = 2131362837;
        if (df0.qux.o(2131362837, this) != null) {
            i3 = 2131364334;
            androidx.constraintlayout.widget.Group o = df0.qux.o(2131364334, this);
            if (o != null) {
                i3 = 2131364349;
                androidx.constraintlayout.widget.Group o2 = df0.qux.o(2131364349, this);
                if (o2 != null) {
                    i3 = 2131364361;
                    if (df0.qux.o(2131364361, this) != null) {
                        i3 = 2131364829;
                        android.widget.ImageView imageView = (android.widget.ImageView) df0.qux.o(2131364829, this);
                        if (imageView != null) {
                            i3 = 2131364835;
                            android.widget.ImageView imageView2 = (android.widget.ImageView) df0.qux.o(2131364835, this);
                            if (imageView2 != null) {
                                i3 = 2131365031;
                                com.airbnb.lottie.LottieAnimationView o3 = df0.qux.o(2131365031, this);
                                if (o3 != null) {
                                    i3 = 2131366197;
                                    com.truecaller.bizmon.callSurvey.mvp.CustomRecyclerView customRecyclerView = (com.truecaller.bizmon.callSurvey.mvp.CustomRecyclerView) df0.qux.o(2131366197, this);
                                    if (customRecyclerView != null) {
                                        i3 = 2131367215;
                                        android.widget.TextView textView = (android.widget.TextView) df0.qux.o(2131367215, this);
                                        if (textView != null) {
                                            i3 = 2131367224;
                                            if (((android.widget.TextView) df0.qux.o(2131367224, this)) != null) {
                                                fi0.b bVar = new fi0.b(this, o, o2, imageView, imageView2, o3, customRecyclerView, textView);
                                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bVar, "inflate(...)");
                                                this.v = bVar;
                                                return;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(getResources().getResourceName(i3)));
    }
}
