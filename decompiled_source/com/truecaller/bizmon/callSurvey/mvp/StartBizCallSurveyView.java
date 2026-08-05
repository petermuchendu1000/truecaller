package com.truecaller.bizmon.callSurvey.mvp;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class StartBizCallSurveyView extends android.widget.FrameLayout implements kh0.h, android.view.View.OnClickListener, bd3.qux {
    public static final /* synthetic */ int g = 0;
    public yc3.d a;
    public boolean b;
    public kh0.g c;
    public final kotlin.Lazy d;
    public kh0.d e;
    public wg0.b f;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StartBizCallSurveyView(android.content.Context context) {
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
        getBinding().b.setText(getContext().getString(2132019627));
    }

    @Override // kh0.i
    public final void b() {
        sh0.e eVar = (sh0.e) getPresenter();
        eVar.getClass();
        eVar.k = com.truecaller.bizmon.callSurvey.analytic.BizCallSurveyActionType.CONTINUE;
        getBinding().c.setText(getContext().getString(2132019626));
    }

    @org.jetbrains.annotations.NotNull
    public final fi0.r getBinding() {
        return (fi0.r) this.d.getValue();
    }

    @org.jetbrains.annotations.NotNull
    public final kh0.g getPresenter() {
        kh0.g gVar = this.c;
        if (gVar != null) {
            return gVar;
        }
        kotlin.jvm.internal.Intrinsics.n("presenter");
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getPresenter().u0(this);
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
        fi0.r binding = getBinding();
        binding.b.setOnClickListener(null);
        binding.g.h();
        super.onDetachedFromWindow();
    }

    @Override // kh0.h
    public void setCallSurveyTextTheme(int i) {
        getBinding().h.setTextColor(i);
        android.graphics.drawable.Drawable[] compoundDrawables = getBinding().h.getCompoundDrawables();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(compoundDrawables, "getCompoundDrawables(...)");
        for (android.graphics.drawable.Drawable drawable : compoundDrawables) {
            if (drawable != null) {
                drawable.setColorFilter(new android.graphics.PorterDuffColorFilter(i, android.graphics.PorterDuff.Mode.SRC_IN));
            }
        }
    }

    public final void setPresenter(@org.jetbrains.annotations.NotNull kh0.g gVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gVar, "<set-?>");
        this.c = gVar;
    }

    @Override // kh0.h
    public void setStartCallSurveyButtonTheme(int i) {
        getBinding().b.setBackgroundResource(i);
    }

    public final void setStartCallSurveyTheme(@org.jetbrains.annotations.NotNull com.truecaller.data.entity.Contact contact) {
        int i;
        java.lang.Integer num;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contact, "contact");
        sh0.f fVar = (sh0.f) getPresenter();
        qc3.bar barVar = fVar.n;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contact, "contact");
        if (((qo1.qux) fVar.m.get()).j()) {
            if (contact.S()) {
                num = java.lang.Integer.valueOf(((u03.b0) barVar.get()).b(2131101848));
            } else if (contact.J(128)) {
                num = java.lang.Integer.valueOf(((u03.b0) barVar.get()).b(2131101992));
            } else {
                num = null;
            }
            if (num != null) {
                int intValue = num.intValue();
                kh0.h hVar = (kh0.h) ((com.truecaller.sdk.bar) fVar).a;
                if (hVar != null) {
                    hVar.setCallSurveyTextTheme(intValue);
                    return;
                }
                return;
            }
            return;
        }
        if (contact.S()) {
            i = 2131231196;
        } else {
            i = 2131231197;
        }
        kh0.h hVar2 = (kh0.h) ((com.truecaller.sdk.bar) fVar).a;
        if (hVar2 != null) {
            hVar2.setStartCallSurveyButtonTheme(i);
        }
    }

    public final void setTakeSurveyClickListener(@org.jetbrains.annotations.NotNull kh0.d dVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dVar, "onTakeSurveyClickCallBack");
        this.e = dVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StartBizCallSurveyView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StartBizCallSurveyView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ StartBizCallSurveyView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, int i3, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StartBizCallSurveyView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        if (!isInEditMode() && !this.b) {
            this.b = true;
            tx.w wVar = ((tx.d0) ((sh0.g) X3())).c;
            this.c = new sh0.f((kotlin.coroutines.CoroutineContext) wVar.V1.get(), (kotlin.coroutines.CoroutineContext) wVar.P.get(), cd3.baz.a(wVar.rn), cd3.baz.a(wVar.Zm), cd3.baz.a(wVar.hn), cd3.baz.a(wVar.kn), cd3.baz.a(wVar.gn), cd3.baz.a(wVar.d4), cd3.baz.a(wVar.v4));
        }
        this.d = kotlin.LazyKt.lazy(new sd.bar(3, context, this));
    }
}
