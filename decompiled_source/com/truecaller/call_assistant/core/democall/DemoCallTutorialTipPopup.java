package com.truecaller.call_assistant.core.democall;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class DemoCallTutorialTipPopup extends androidx.constraintlayout.widget.ConstraintLayout {
    public static final /* synthetic */ int D = 0;
    public java.lang.String A;
    public kotlin.jvm.functions.Function1 B;
    public kotlin.jvm.functions.Function0 C;
    public final d91.d s;
    public int t;
    public int u;
    public float v;
    public java.util.List w;
    public final java.util.LinkedHashMap x;
    public int y;
    public java.lang.CharSequence z;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DemoCallTutorialTipPopup(android.content.Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    public static android.graphics.Point F(android.view.View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return new android.graphics.Point(iArr[0], iArr[1]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void G() {
        ((android.widget.TextView) this.s.g).setText(getContext().getString(2132019807, java.lang.Integer.valueOf(this.t + 1), java.lang.Integer.valueOf(this.u + 1)));
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getActionText() {
        return this.A;
    }

    public final boolean getActionable() {
        androidx.appcompat.widget.AppCompatButton appCompatButton = this.s.c;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(appCompatButton, "btnAction");
        return gj.m.H(appCompatButton);
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.CharSequence getLastActionText() {
        return this.z;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.CharSequence getMessage() {
        return ((android.widget.TextView) this.s.d).getText();
    }

    @org.jetbrains.annotations.Nullable
    public final kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.Unit> getOnStepChangedListener() {
        return this.B;
    }

    @org.jetbrains.annotations.Nullable
    public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnTutorialEnded() {
        return this.C;
    }

    public final void setActionText(@org.jetbrains.annotations.Nullable java.lang.String str) {
        this.A = str;
    }

    public final void setActionable(boolean z) {
        androidx.appcompat.widget.AppCompatButton appCompatButton = this.s.c;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(appCompatButton, "btnAction");
        gj.m.k0(appCompatButton, z);
    }

    public final void setHighestElevation(float f) {
        this.v = f;
    }

    public final void setLastActionText(@org.jetbrains.annotations.Nullable java.lang.CharSequence charSequence) {
        this.z = charSequence;
    }

    public final void setMessage(@org.jetbrains.annotations.Nullable java.lang.CharSequence charSequence) {
        ((android.widget.TextView) this.s.d).setText(charSequence);
    }

    public final void setOnStepChangedListener(@org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> function1) {
        this.B = function1;
    }

    public final void setOnTutorialEnded(@org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        this.C = function0;
    }

    public final void setSteps(@org.jetbrains.annotations.NotNull java.util.List<zp0.i> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "steps");
        this.w = list;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DemoCallTutorialTipPopup(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DemoCallTutorialTipPopup(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.w = kotlin.collections.h0.a;
        this.x = new java.util.LinkedHashMap();
        android.view.LayoutInflater.from(context).inflate(2131561008, (android.view.ViewGroup) this);
        int i2 = 2131362538;
        androidx.appcompat.widget.AppCompatButton o = df0.qux.o(2131362538, this);
        if (o != null) {
            i2 = 2131367024;
            androidx.constraintlayout.widget.ConstraintLayout o2 = df0.qux.o(2131367024, this);
            if (o2 != null) {
                i2 = 2131367031;
                android.widget.ImageView imageView = (android.widget.ImageView) df0.qux.o(2131367031, this);
                if (imageView != null) {
                    i2 = 2131367206;
                    android.widget.TextView textView = (android.widget.TextView) df0.qux.o(2131367206, this);
                    if (textView != null) {
                        i2 = 2131367221;
                        android.widget.TextView textView2 = (android.widget.TextView) df0.qux.o(2131367221, this);
                        if (textView2 != null) {
                            d91.d dVar = new d91.d(this, o, o2, imageView, textView, textView2);
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(dVar, "inflate(...)");
                            this.s = dVar;
                            if (attributeSet != null) {
                                int[] iArr = com.truecaller.call_assistant.core.R$styleable.a;
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(iArr, "DemoCallTutorialTipPopup");
                                android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
                                setMessage(obtainStyledAttributes.getText(1));
                                o.setOnClickListener(new yt2.a(this, 7));
                                setActionable(obtainStyledAttributes.getBoolean(0, true));
                                obtainStyledAttributes.recycle();
                                return;
                            }
                            return;
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
    }

    public /* synthetic */ DemoCallTutorialTipPopup(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
