package com.truecaller.bizmon.callSurvey.mvp.question.flowChoice;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class BizFlowQuestionView extends android.widget.FrameLayout implements th0.baz, android.widget.CompoundButton.OnCheckedChangeListener, bd3.qux {
    public static final /* synthetic */ int g = 0;
    public yc3.d a;
    public boolean b;
    public th0.bar c;
    public final fi0.n d;
    public final java.util.ArrayList e;
    public kh0.c f;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public BizFlowQuestionView(android.content.Context context) {
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
    public final fi0.n getBinding() {
        return this.d;
    }

    @org.jetbrains.annotations.NotNull
    public final th0.bar getPresenter() {
        th0.bar barVar = this.c;
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
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
        java.lang.Object obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(compoundButton, "buttonView");
        if (z) {
            java.util.Iterator it = this.e.iterator();
            while (true) {
                obj = null;
                if (!it.hasNext()) {
                    break;
                }
                android.widget.CheckBox checkBox = (android.widget.CheckBox) it.next();
                if (compoundButton != null) {
                    obj = compoundButton.getTag();
                }
                if (!kotlin.jvm.internal.Intrinsics.b(obj, checkBox.getTag()) && checkBox.getVisibility() == 0) {
                    checkBox.setChecked(false);
                }
            }
            th0.bar presenter = getPresenter();
            if (compoundButton != null) {
                obj = compoundButton.getTag();
            }
            kotlin.jvm.internal.Intrinsics.e(obj, "null cannot be cast to non-null type kotlin.Int");
            ((th0.qux) presenter).d2(((java.lang.Integer) obj).intValue());
            return;
        }
        if (!z) {
            ((th0.qux) getPresenter()).d2(-1);
            return;
        }
        throw new java.lang.RuntimeException();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ((th0.qux) getPresenter()).m1();
    }

    public final void setPresenter(@org.jetbrains.annotations.NotNull th0.bar barVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "<set-?>");
        this.c = barVar;
    }

    public /* synthetic */ BizFlowQuestionView(android.content.Context context, android.util.AttributeSet attributeSet, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BizFlowQuestionView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        if (!isInEditMode() && !this.b) {
            this.b = true;
            this.c = new th0.qux(0, (kotlin.coroutines.CoroutineContext) ((tx.d0) ((th0.a) X3())).c.V1.get());
        }
        android.view.LayoutInflater.from(context).inflate(2131559933, this);
        int i = 2131363018;
        androidx.constraintlayout.widget.ConstraintLayout o = df0.qux.o(2131363018, this);
        if (o != null) {
            i = 2131363976;
            androidx.constraintlayout.helper.widget.Flow o2 = df0.qux.o(2131363976, this);
            if (o2 != null) {
                i = 2131364826;
                com.airbnb.lottie.LottieAnimationView o3 = df0.qux.o(2131364826, this);
                if (o3 != null) {
                    i = 2131367230;
                    android.widget.TextView textView = (android.widget.TextView) df0.qux.o(2131367230, this);
                    if (textView != null) {
                        fi0.n nVar = new fi0.n(this, o, o2, o3, textView);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(nVar, "inflate(...)");
                        this.d = nVar;
                        this.e = new java.util.ArrayList();
                        return;
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(getResources().getResourceName(i)));
    }
}
