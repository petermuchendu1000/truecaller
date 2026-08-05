package com.truecaller.bizmon.callSurvey.mvp.question.rating;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class BizRatingQuestionView extends android.widget.FrameLayout implements wh0.baz, bd3.qux {
    public static final /* synthetic */ int f = 0;
    public yc3.d a;
    public boolean b;
    public kh0.c c;
    public final fi0.q d;
    public wh0.bar e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public BizRatingQuestionView(android.content.Context context) {
        this(context, r0, 2, r0);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        android.util.AttributeSet attributeSet = null;
    }

    public final java.lang.Object X3() {
        if (this.a == null) {
            this.a = new yc3.d(this);
        }
        return this.a.X3();
    }

    @org.jetbrains.annotations.NotNull
    public final fi0.q getBinding() {
        return this.d;
    }

    @org.jetbrains.annotations.NotNull
    public final wh0.bar getPresenter() {
        wh0.bar barVar = this.e;
        if (barVar != null) {
            return barVar;
        }
        kotlin.jvm.internal.Intrinsics.n("presenter");
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ((th0.qux) getPresenter()).u0(this);
        dx2.bar barVar = dx2.bar.a;
        dx2.d a = dx2.bar.a();
        boolean z = a instanceof dx2.c;
        fi0.q qVar = this.d;
        if (!z && !(a instanceof dx2.a)) {
            qVar.d.setSelected(false);
        } else {
            qVar.d.setSelected(true);
        }
        qVar.d.setOnRatingBarChangeListener(new android.widget.RatingBar.OnRatingBarChangeListener() { // from class: wh0.qux
            @Override // android.widget.RatingBar.OnRatingBarChangeListener
            public final void onRatingChanged(android.widget.RatingBar ratingBar, float f2, boolean z2) {
                com.truecaller.bizmon.callSurvey.mvp.question.rating.BizRatingQuestionView bizRatingQuestionView = com.truecaller.bizmon.callSurvey.mvp.question.rating.BizRatingQuestionView.this;
                bizRatingQuestionView.d.a.postDelayed(new rr1.b0(bizRatingQuestionView, 26), 300L);
            }
        });
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ((th0.qux) getPresenter()).m1();
    }

    public final void setPresenter(@org.jetbrains.annotations.NotNull wh0.bar barVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "<set-?>");
        this.e = barVar;
    }

    public /* synthetic */ BizRatingQuestionView(android.content.Context context, android.util.AttributeSet attributeSet, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BizRatingQuestionView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        if (!isInEditMode() && !this.b) {
            this.b = true;
            this.e = new th0.qux(1, (kotlin.coroutines.CoroutineContext) ((tx.d0) ((wh0.a) X3())).c.V1.get());
        }
        android.view.LayoutInflater.from(context).inflate(2131559969, this);
        int i = 2131364413;
        android.widget.TextView textView = (android.widget.TextView) df0.qux.o(2131364413, this);
        if (textView != null) {
            i = 2131364826;
            com.airbnb.lottie.LottieAnimationView o = df0.qux.o(2131364826, this);
            if (o != null) {
                i = 2131365970;
                android.widget.RatingBar ratingBar = (android.widget.RatingBar) df0.qux.o(2131365970, this);
                if (ratingBar != null) {
                    fi0.q qVar = new fi0.q(this, textView, o, ratingBar);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(qVar, "inflate(...)");
                    this.d = qVar;
                    return;
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(getResources().getResourceName(i)));
    }
}
