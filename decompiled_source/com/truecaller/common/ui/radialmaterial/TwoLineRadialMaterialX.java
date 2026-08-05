package com.truecaller.common.ui.radialmaterial;

/* loaded from: /home/user/tc_decoded/classes2.dex */
public final class TwoLineRadialMaterialX extends androidx.constraintlayout.widget.ConstraintLayout {
    public static final /* synthetic */ int t = 0;
    public final d41.a s;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TwoLineRadialMaterialX(android.content.Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setupAttributes(android.util.AttributeSet attributeSet) {
        android.content.res.TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, com.truecaller.common.ui.R$styleable.l);
        try {
            java.lang.String string = obtainStyledAttributes.getString(2);
            java.lang.String string2 = obtainStyledAttributes.getString(0);
            boolean z = obtainStyledAttributes.getBoolean(1, false);
            setTitle(string);
            setDescription(string2);
            ((androidx.appcompat.widget.AppCompatRadioButton) this.s.d).setClickable(!z);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public final void setChecked(boolean z) {
        ((androidx.appcompat.widget.AppCompatRadioButton) this.s.d).setChecked(z);
    }

    public final void setDescription(@org.jetbrains.annotations.Nullable java.lang.String str) {
        android.widget.TextView textView = (android.widget.TextView) this.s.c;
        if (str != null && !kotlin.text.StringsKt.X(str)) {
            kotlin.jvm.internal.Intrinsics.d(textView);
            gj.m.j0(textView);
            textView.setText(str);
        } else {
            kotlin.jvm.internal.Intrinsics.d(textView);
            gj.m.f0(textView);
        }
    }

    public final void setTitle(@org.jetbrains.annotations.Nullable java.lang.String str) {
        android.widget.TextView textView = (android.widget.TextView) this.s.e;
        if (str != null && !kotlin.text.StringsKt.X(str)) {
            kotlin.jvm.internal.Intrinsics.d(textView);
            gj.m.j0(textView);
            textView.setText(str);
        } else {
            kotlin.jvm.internal.Intrinsics.d(textView);
            gj.m.f0(textView);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TwoLineRadialMaterialX(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TwoLineRadialMaterialX(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        android.view.LayoutInflater.from(context).inflate(2131561127, (android.view.ViewGroup) this);
        int i2 = 2131363471;
        android.widget.TextView textView = (android.widget.TextView) df0.qux.o(2131363471, this);
        if (textView != null) {
            i2 = 2131365959;
            androidx.appcompat.widget.AppCompatRadioButton o = df0.qux.o(2131365959, this);
            if (o != null) {
                i2 = 2131367048;
                android.widget.TextView textView2 = (android.widget.TextView) df0.qux.o(2131367048, this);
                if (textView2 != null) {
                    d41.a aVar = new d41.a((android.view.ViewGroup) this, (android.view.View) textView, (java.lang.Object) o, (android.view.View) textView2, 1);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(aVar, "inflate(...)");
                    this.s = aVar;
                    setupAttributes(attributeSet);
                    o.setOnCheckedChangeListener(new aq2.r(o, 11));
                    return;
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
    }

    public /* synthetic */ TwoLineRadialMaterialX(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
