package com.truecaller.common.ui.chip;

/* loaded from: /home/user/tc_decoded/classes2.dex */
public final class SimpleChipXView extends androidx.constraintlayout.widget.ConstraintLayout {
    public final kotlin.Lazy s;
    public final kotlin.Lazy t;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SimpleChipXView(android.content.Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void G(com.truecaller.common.ui.chip.SimpleChipXView simpleChipXView, int i) {
        simpleChipXView.F(i, bi3.a.s(simpleChipXView.getContext(), 2130970634));
    }

    private final android.widget.ImageView getIcon() {
        return (android.widget.ImageView) this.s.getValue();
    }

    private final android.widget.TextView getTitle() {
        return (android.widget.TextView) this.t.getValue();
    }

    public final void F(int i, int i2) {
        getIcon().setImageResource(i);
        bi3.a.C(getIcon(), i2);
    }

    public final void setIcon(int i) {
        getIcon().setImageResource(i);
    }

    public final void setIconWithTint(int i) {
        G(this, i);
    }

    public final void setTitle(@org.jetbrains.annotations.NotNull java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "text");
        getTitle().setText(str);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SimpleChipXView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void setTitle(int i) {
        getTitle().setText(i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SimpleChipXView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.s = gj.m.I(2131364521, this);
        this.t = gj.m.I(2131367033, this);
        gj.m.z(this, 2131560040, true);
        setBackgroundResource(2131234302);
        int dimensionPixelSize = getResources().getDimensionPixelSize(2131166755);
        setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        setClickable(true);
        setFocusable(true);
        android.content.res.TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, com.truecaller.common.ui.R$styleable.i, 0, 0);
        try {
            getTitle().setText(obtainStyledAttributes.getString(2));
            getIcon().setImageResource(obtainStyledAttributes.getResourceId(0, 0));
            if (obtainStyledAttributes.hasValue(1)) {
                getIcon().setColorFilter(obtainStyledAttributes.getColor(1, 0));
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public /* synthetic */ SimpleChipXView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
