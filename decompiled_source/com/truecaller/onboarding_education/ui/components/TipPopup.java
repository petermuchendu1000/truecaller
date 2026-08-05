package com.truecaller.onboarding_education.ui.components;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class TipPopup extends androidx.constraintlayout.widget.ConstraintLayout {
    public static final /* synthetic */ int t = 0;
    public final d41.a s;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TipPopup(android.content.Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    public final boolean getActionable() {
        androidx.appcompat.widget.AppCompatButton appCompatButton = this.s.c;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(appCompatButton, "btnAction");
        return gj.m.H(appCompatButton);
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.CharSequence getMessage() {
        return ((android.widget.TextView) this.s.d).getText();
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.CharSequence getStepCounter() {
        return ((android.widget.TextView) this.s.e).getText();
    }

    public final void setActionable(boolean z) {
        androidx.appcompat.widget.AppCompatButton appCompatButton = this.s.c;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(appCompatButton, "btnAction");
        gj.m.k0(appCompatButton, z);
    }

    public final void setMessage(@org.jetbrains.annotations.Nullable java.lang.CharSequence charSequence) {
        ((android.widget.TextView) this.s.d).setText(charSequence);
    }

    public final void setOnActionClickListener(@org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function1<? super android.view.View, kotlin.Unit> function1) {
        aq2.g gVar;
        androidx.appcompat.widget.AppCompatButton appCompatButton = this.s.c;
        if (function1 != null) {
            gVar = new aq2.g(12, function1);
        } else {
            gVar = null;
        }
        appCompatButton.setOnClickListener(gVar);
    }

    public final void setStepCounter(@org.jetbrains.annotations.Nullable java.lang.CharSequence charSequence) {
        ((android.widget.TextView) this.s.e).setText(charSequence);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TipPopup(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TipPopup(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        android.view.LayoutInflater.from(context).inflate(2131561130, (android.view.ViewGroup) this);
        int i2 = 2131362538;
        androidx.appcompat.widget.AppCompatButton o = df0.qux.o(2131362538, this);
        if (o != null) {
            i2 = 2131367206;
            android.widget.TextView textView = (android.widget.TextView) df0.qux.o(2131367206, this);
            if (textView != null) {
                i2 = 2131367221;
                android.widget.TextView textView2 = (android.widget.TextView) df0.qux.o(2131367221, this);
                if (textView2 != null) {
                    d41.a aVar = new d41.a(this, o, textView, textView2, 15);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(aVar, "inflate(...)");
                    this.s = aVar;
                    if (attributeSet != null) {
                        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.truecaller.onboarding_education.R$styleable.a);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
                        setMessage(obtainStyledAttributes.getText(1));
                        setStepCounter(context.getString(2132020384, java.lang.Integer.valueOf(obtainStyledAttributes.getInteger(3, 0)), java.lang.Integer.valueOf(obtainStyledAttributes.getInteger(4, 0))));
                        setActionable(obtainStyledAttributes.getBoolean(0, true));
                        obtainStyledAttributes.recycle();
                        return;
                    }
                    return;
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
    }

    public /* synthetic */ TipPopup(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
