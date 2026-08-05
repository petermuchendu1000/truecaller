package com.truecaller.premium.premiumusertab.list;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class LabelView extends androidx.constraintlayout.widget.ConstraintLayout {
    public final kotlin.Lazy s;
    public final kotlin.Lazy t;
    public final kotlin.Lazy u;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LabelView(android.content.Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    private final android.widget.ImageView getIconView() {
        return (android.widget.ImageView) this.s.getValue();
    }

    private final android.widget.TextView getTextView() {
        return (android.widget.TextView) this.t.getValue();
    }

    private final com.truecaller.premium.ui.countdown.CountDownTextView getTimerView() {
        return (com.truecaller.premium.ui.countdown.CountDownTextView) this.u.getValue();
    }

    public final void F() {
        getTimerView().y = 0L;
    }

    public final void G(gc2.x0 x0Var, java.lang.Long l) {
        boolean z;
        androidx.constraintlayout.widget.ConstraintLayout timerView = getTimerView();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(timerView, "<get-timerView>(...)");
        if (x0Var != null) {
            z = true;
        } else {
            z = false;
        }
        gj.m.k0(timerView, z);
        android.widget.ImageView iconView = getIconView();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(iconView, "<get-iconView>(...)");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(getTimerView(), "<get-timerView>(...)");
        gj.m.k0(iconView, !gj.m.H(r3));
        if (x0Var != null) {
            getTimerView().setTimerTextColor(x0Var.a);
            androidx.constraintlayout.widget.ConstraintLayout timerView2 = getTimerView();
            android.content.res.ColorStateList valueOf = android.content.res.ColorStateList.valueOf(x0Var.b);
            java.util.WeakHashMap weakHashMap = u6.t0.a;
            u6.k0.i(timerView2, valueOf);
        }
        if (l != null) {
            getTimerView().G(l.longValue());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setLabel(@org.jetbrains.annotations.NotNull gc2.j jVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jVar, "label");
        androidx.constraintlayout.widget.ConstraintLayout timerView = getTimerView();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(timerView, "<get-timerView>(...)");
        gj.m.f0(timerView);
        android.widget.ImageView iconView = getIconView();
        iconView.setImageResource(jVar.a);
        android.content.Context context = iconView.getContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int i = jVar.c;
        iconView.setColorFilter(ze0.q.t(i, context));
        getTextView().setText(jVar.b);
        android.widget.TextView textView = getTextView();
        android.content.Context context2 = getContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        textView.setTextColor(ze0.q.t(i, context2));
        setBackground(getContext().getDrawable(2131231319));
    }

    public final void setOfferEndLabelText(@org.jetbrains.annotations.Nullable gc2.q4 q4Var) {
        if (q4Var != null) {
            getTextView().setText(q4Var.a);
            getTextView().setTextColor(q4Var.b);
        }
    }

    public final void setOnCountDownTimerStateListener(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super me2.b, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "onCountDownTimerStateListener");
        getTimerView().setOnCountDownTimerStateListener(function1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LabelView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LabelView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.s = gj.m.I(2131364521, this);
        this.t = gj.m.I(2131366839, this);
        this.u = gj.m.I(2131367006, this);
        android.view.View.inflate(context, 2131560037, this);
        setPadding(bd.bar.q(16), 0, bd.bar.q(16), 0);
        setOutlineProvider(null);
        if (isInEditMode()) {
            setLabel(new gc2.j(2131233052, "premium required", 2130970634));
        }
    }

    public /* synthetic */ LabelView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
