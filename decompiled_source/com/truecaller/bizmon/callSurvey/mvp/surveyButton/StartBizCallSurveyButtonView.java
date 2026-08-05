package com.truecaller.bizmon.callSurvey.mvp.surveyButton;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class StartBizCallSurveyButtonView extends android.widget.FrameLayout implements kh0.f, android.view.View.OnClickListener, bd3.qux {
    public yc3.d a;
    public boolean b;
    public kh0.e c;
    public final fi0.s d;
    public kh0.d e;
    public dh0.p f;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StartBizCallSurveyButtonView(android.content.Context context) {
        this(context, null, 0, 0, 14, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    public final java.lang.Object X3() {
        if (this.a == null) {
            this.a = new yc3.d(this);
        }
        return this.a.X3();
    }

    @Override // kh0.i
    public final void a() {
        sh0.e eVar = (sh0.e) getPresenter();
        eVar.getClass();
        eVar.k = com.truecaller.bizmon.callSurvey.analytic.BizCallSurveyActionType.CONTINUE;
        this.d.c.setText(getContext().getString(2132019627));
    }

    @Override // kh0.i
    public final void b() {
        sh0.e eVar = (sh0.e) getPresenter();
        eVar.getClass();
        eVar.k = com.truecaller.bizmon.callSurvey.analytic.BizCallSurveyActionType.CONTINUE;
        this.d.d.setText(getContext().getString(2132019626));
    }

    @org.jetbrains.annotations.NotNull
    public final fi0.s getBinding() {
        return this.d;
    }

    @org.jetbrains.annotations.NotNull
    public final kh0.e getPresenter() {
        kh0.e eVar = this.c;
        if (eVar != null) {
            return eVar;
        }
        kotlin.jvm.internal.Intrinsics.n("presenter");
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getPresenter().a = this;
        xh0.qux quxVar = (xh0.qux) getPresenter();
        if (((qo1.qux) quxVar.m.get()).c()) {
            kh0.f fVar = (kh0.f) ((com.truecaller.sdk.bar) quxVar).a;
            if (fVar != null) {
                fi0.s sVar = ((com.truecaller.bizmon.callSurvey.mvp.surveyButton.StartBizCallSurveyButtonView) fVar).d;
                android.widget.FrameLayout frameLayout = sVar.e;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(frameLayout, "layoutStartBizSurvey");
                gj.m.k0(frameLayout, false);
                android.widget.Button button = sVar.d;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(button, "btnStartBizCallSurveyRevamp");
                gj.m.k0(button, true);
                return;
            }
            return;
        }
        kh0.f fVar2 = (kh0.f) ((com.truecaller.sdk.bar) quxVar).a;
        if (fVar2 != null) {
            android.widget.Button button2 = ((com.truecaller.bizmon.callSurvey.mvp.surveyButton.StartBizCallSurveyButtonView) fVar2).d.d;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(button2, "btnStartBizCallSurveyRevamp");
            gj.m.k0(button2, false);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        kh0.d dVar = this.e;
        if (dVar != null) {
            com.truecaller.bizmon.callSurvey.analytic.BizCallSurveyAction bizCallSurveyAction = com.truecaller.bizmon.callSurvey.analytic.BizCallSurveyAction.ACTION_CLICKED;
            com.truecaller.bizmon.callSurvey.analytic.BizCallSurveyActionType bizCallSurveyActionType = ((sh0.e) getPresenter()).k;
            java.lang.String str = ((sh0.e) getPresenter()).l;
            if (str != null) {
                dVar.c(bizCallSurveyAction, bizCallSurveyActionType, str);
            } else {
                kotlin.jvm.internal.Intrinsics.n("surveyId");
                throw null;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        ((of0.baz) getPresenter()).m1();
        this.e = null;
        this.d.c.setOnClickListener(null);
        super.onDetachedFromWindow();
    }

    public final void setPresenter(@org.jetbrains.annotations.NotNull kh0.e eVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eVar, "<set-?>");
        this.c = eVar;
    }

    public final void setTakeSurveyClickListener(@org.jetbrains.annotations.NotNull kh0.d dVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dVar, "onTakeSurveyClickCallBack");
        this.e = dVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StartBizCallSurveyButtonView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StartBizCallSurveyButtonView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ StartBizCallSurveyButtonView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, int i3, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StartBizCallSurveyButtonView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        if (!isInEditMode() && !this.b) {
            this.b = true;
            tx.w wVar = ((tx.d0) ((xh0.a) X3())).c;
            this.c = new xh0.qux((kotlin.coroutines.CoroutineContext) wVar.V1.get(), (kotlin.coroutines.CoroutineContext) wVar.P.get(), cd3.baz.a(wVar.rn), cd3.baz.a(wVar.Zm), cd3.baz.a(wVar.hn), cd3.baz.a(wVar.kn), cd3.baz.a(wVar.gn), cd3.baz.a(wVar.d4));
        }
        android.view.LayoutInflater from = android.view.LayoutInflater.from(context);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(from, "from(...)");
        yy.qux.F(from, true).inflate(2131559991, this);
        int i3 = 2131362582;
        android.widget.ImageButton imageButton = (android.widget.ImageButton) df0.qux.o(2131362582, this);
        if (imageButton != null) {
            i3 = 2131362593;
            android.widget.Button button = (android.widget.Button) df0.qux.o(2131362593, this);
            if (button != null) {
                i3 = 2131362594;
                android.widget.Button button2 = (android.widget.Button) df0.qux.o(2131362594, this);
                if (button2 != null) {
                    i3 = 2131364926;
                    android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) df0.qux.o(2131364926, this);
                    if (frameLayout != null) {
                        fi0.s sVar = new fi0.s(this, imageButton, button, button2, frameLayout);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sVar, "inflate(...)");
                        this.d = sVar;
                        return;
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(getResources().getResourceName(i3)));
    }
}
