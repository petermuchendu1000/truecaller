package com.truecaller.dialpad_view.views;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class DialpadMultisimButton extends androidx.constraintlayout.widget.ConstraintLayout implements bd3.qux {
    public yc3.d s;
    public final boolean t;
    public final kotlin.Lazy u;
    public final kotlin.Lazy v;
    public final kotlin.Lazy w;
    public final kotlin.Lazy x;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DialpadMultisimButton(android.content.Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    private final androidx.appcompat.widget.AppCompatImageView getCallButton() {
        return (androidx.appcompat.widget.AppCompatImageView) this.w.getValue();
    }

    private final androidx.constraintlayout.widget.ConstraintLayout getConstraintLayout() {
        return (androidx.constraintlayout.widget.ConstraintLayout) this.x.getValue();
    }

    private final androidx.appcompat.widget.AppCompatImageView getImageView() {
        return (androidx.appcompat.widget.AppCompatImageView) this.v.getValue();
    }

    private final androidx.appcompat.widget.AppCompatTextView getTextView() {
        return (androidx.appcompat.widget.AppCompatTextView) this.u.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.Object X3() {
        if (this.s == null) {
            this.s = new yc3.d(this);
        }
        return this.s.X3();
    }

    public final void setDualSimCallButtonImage(int i) {
        getImageView().setImageResource(i);
    }

    public final void setDualSimCallButtonText(@org.jetbrains.annotations.NotNull java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "text");
        getTextView().setText(str);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DialpadMultisimButton(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ DialpadMultisimButton(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DialpadMultisimButton(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        if (!isInEditMode() && !this.t) {
            this.t = true;
            ((lg1.baz) X3()).getClass();
        }
        this.u = gj.m.I(2131366839, this);
        this.v = gj.m.I(2131366470, this);
        this.w = gj.m.I(2131362736, this);
        this.x = gj.m.I(2131363111, this);
        android.view.View.inflate(yy.qux.v(context, true), 2131559055, this);
        android.view.ViewGroup.LayoutParams layoutParams = getConstraintLayout().getLayoutParams();
        kotlin.jvm.internal.Intrinsics.e(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) layoutParams;
        layoutParams2.width = t41.i.b(132.0f, getContext());
        getConstraintLayout().setLayoutParams(layoutParams2);
        androidx.appcompat.widget.AppCompatImageView callButton = getCallButton();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(callButton, "<get-callButton>(...)");
        gj.m.k0(callButton, false);
    }
}
