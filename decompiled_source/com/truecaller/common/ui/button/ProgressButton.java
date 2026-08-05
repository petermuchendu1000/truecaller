package com.truecaller.common.ui.button;

/* loaded from: /home/user/tc_decoded/classes2.dex */
public final class ProgressButton extends androidx.constraintlayout.widget.ConstraintLayout {
    public final kotlin.Lazy s;
    public final kotlin.Lazy t;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProgressButton(android.content.Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    private final android.widget.TextView getButton() {
        return (android.widget.TextView) this.s.getValue();
    }

    private final android.widget.ProgressBar getProgress() {
        return (android.widget.ProgressBar) this.t.getValue();
    }

    public final void F(boolean z) {
        if (z) {
            android.widget.ProgressBar progress = getProgress();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(progress, "<get-progress>(...)");
            gj.m.j0(progress);
            android.widget.TextView button = getButton();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(button, "<get-button>(...)");
            gj.m.h0(button);
            return;
        }
        android.widget.ProgressBar progress2 = getProgress();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(progress2, "<get-progress>(...)");
        gj.m.f0(progress2);
        android.widget.TextView button2 = getButton();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(button2, "<get-button>(...)");
        gj.m.j0(button2);
    }

    public void setOnClickListener(@org.jetbrains.annotations.Nullable android.view.View.OnClickListener onClickListener) {
        getButton().setOnClickListener(onClickListener);
    }

    public final void setText(@org.jetbrains.annotations.NotNull java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "text");
        getButton().setText(str);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProgressButton(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ProgressButton(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int s;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.s = gj.m.I(2131362629, this);
        this.t = gj.m.I(2131365846, this);
        gj.m.z(this, 2131559963, true);
        int[] iArr = com.truecaller.common.ui.R$styleable.f;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(iArr, "ProgressButton");
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        if (obtainStyledAttributes.hasValue(0)) {
            s = obtainStyledAttributes.getColor(0, bi3.a.s(context, 2130970615));
        } else {
            s = bi3.a.s(context, 2130970615);
        }
        getButton().setTextColor(s);
        getProgress().setIndeterminateTintList(android.content.res.ColorStateList.valueOf(s));
        android.widget.TextView button = getButton();
        java.lang.String string = obtainStyledAttributes.getString(1);
        button.setText(string == null ? "" : string);
        obtainStyledAttributes.recycle();
    }

    public /* synthetic */ ProgressButton(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
