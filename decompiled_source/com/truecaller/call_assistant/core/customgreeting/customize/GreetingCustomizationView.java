package com.truecaller.call_assistant.core.customgreeting.customize;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class GreetingCustomizationView extends androidx.constraintlayout.widget.ConstraintLayout {
    public final d91.d s;
    public kotlin.jvm.functions.Function1 t;
    public kotlin.jvm.functions.Function0 u;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GreetingCustomizationView(android.content.Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    @org.jetbrains.annotations.Nullable
    public final kotlin.jvm.functions.Function1<com.truecaller.call_assistant.core.data.Input, kotlin.Unit> getOnInputPlaceholderClicked() {
        return this.t;
    }

    @org.jetbrains.annotations.Nullable
    public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnRevertBackClicked() {
        return this.u;
    }

    public final void setOnInputPlaceholderClicked(@org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function1<? super com.truecaller.call_assistant.core.data.Input, kotlin.Unit> function1) {
        this.t = function1;
    }

    public final void setOnRevertBackClicked(@org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        this.u = function0;
    }

    public final void setRevertBackButtonVisibility(boolean z) {
        int i;
        d91.d dVar = this.s;
        android.widget.TextView textView = (android.widget.TextView) dVar.d;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(textView, "revertBackButton");
        int i2 = 8;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        textView.setVisibility(i);
        android.view.View view = (android.view.View) dVar.e;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(view, "revertBackButtonDivider");
        if (z) {
            i2 = 0;
        }
        view.setVisibility(i2);
    }

    public final void setTemplate(@org.jetbrains.annotations.NotNull android.text.Spanned spanned) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(spanned, "template");
        d91.d dVar = this.s;
        ((android.widget.TextView) dVar.g).setText(spanned);
        android.widget.TextView textView = (android.widget.TextView) dVar.g;
        textView.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
        textView.setHighlightColor(0);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GreetingCustomizationView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public GreetingCustomizationView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        android.view.LayoutInflater.from(context).inflate(2131561032, (android.view.ViewGroup) this);
        int i2 = 2131362622;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) df0.qux.o(2131362622, this);
        if (linearLayout != null) {
            i2 = 2131364666;
            if (((android.widget.TextView) df0.qux.o(2131364666, this)) != null) {
                i2 = 2131366157;
                android.widget.TextView textView = (android.widget.TextView) df0.qux.o(2131366157, this);
                if (textView != null) {
                    i2 = 2131366158;
                    android.view.View o = df0.qux.o(2131366158, this);
                    if (o != null) {
                        i2 = 2131366830;
                        android.widget.TextView textView2 = (android.widget.TextView) df0.qux.o(2131366830, this);
                        if (textView2 != null) {
                            i2 = 2131367568;
                            android.widget.ImageView imageView = (android.widget.ImageView) df0.qux.o(2131367568, this);
                            if (imageView != null) {
                                i2 = 2131367571;
                                android.widget.TextView textView3 = (android.widget.TextView) df0.qux.o(2131367571, this);
                                if (textView3 != null) {
                                    d91.d dVar = new d91.d(this, linearLayout, textView, o, textView2, imageView, textView3);
                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(dVar, "inflate(...)");
                                    this.s = dVar;
                                    android.content.res.Resources resources = context.getResources();
                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                                    linearLayout.setBackground(new op0.bar(resources, bi3.a.s(context, 2130970507), bi3.a.s(context, 2130970517)));
                                    textView2.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
                                    textView2.setHighlightColor(0);
                                    textView.setOnClickListener(new op0.baz(this, 1));
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
    }

    public /* synthetic */ GreetingCustomizationView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
