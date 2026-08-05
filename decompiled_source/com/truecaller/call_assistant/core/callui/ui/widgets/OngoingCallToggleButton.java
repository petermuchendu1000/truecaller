package com.truecaller.call_assistant.core.callui.ui.widgets;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public class OngoingCallToggleButton extends androidx.constraintlayout.widget.ConstraintLayout {
    public final d91.c s;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OngoingCallToggleButton(android.content.Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void setIcon(android.graphics.drawable.Drawable drawable) {
        ((android.widget.ToggleButton) this.s.d).setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null);
    }

    private final void setLabel(java.lang.String str) {
        ((android.widget.TextView) this.s.c).setText(str);
    }

    public final void F(boolean z, kotlin.jvm.functions.Function2 function2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "listener");
        android.widget.ToggleButton toggleButton = (android.widget.ToggleButton) this.s.d;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(toggleButton, "actionToggleButton");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(toggleButton, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "listener");
        toggleButton.setOnCheckedChangeListener(null);
        toggleButton.setChecked(z);
        toggleButton.setOnCheckedChangeListener(new io0.a(4, function2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setEnabled(boolean z) {
        super/*android.view.ViewGroup*/.setEnabled(z);
        d91.c cVar = this.s;
        ((android.widget.ToggleButton) cVar.d).setEnabled(z);
        ((android.widget.ToggleButton) cVar.d).setClickable(z);
        ((android.widget.TextView) cVar.c).setEnabled(z);
    }

    public final void setOnCheckedChangeListener(@org.jetbrains.annotations.NotNull android.widget.CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onCheckedChangeListener, "listener");
        ((android.widget.ToggleButton) this.s.d).setOnCheckedChangeListener(onCheckedChangeListener);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OngoingCallToggleButton(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OngoingCallToggleButton(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        android.view.LayoutInflater.from(context).inflate(2131560968, (android.view.ViewGroup) this);
        int i2 = 2131361959;
        android.widget.TextView textView = (android.widget.TextView) df0.qux.o(2131361959, this);
        if (textView != null) {
            i2 = 2131361960;
            android.widget.ToggleButton toggleButton = (android.widget.ToggleButton) df0.qux.o(2131361960, this);
            if (toggleButton != null) {
                d91.c cVar = new d91.c(this, textView, toggleButton, 26);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(cVar, "inflate(...)");
                this.s = cVar;
                android.content.res.TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, com.truecaller.call_assistant.core.R$styleable.c, 0, 0);
                try {
                    android.graphics.drawable.Drawable drawable = obtainStyledAttributes.getDrawable(0);
                    if (drawable != null) {
                        setIcon(drawable);
                    }
                    java.lang.String string = obtainStyledAttributes.getString(1);
                    if (string != null) {
                        setLabel(string);
                    }
                    obtainStyledAttributes.recycle();
                    return;
                } catch (java.lang.Throwable th) {
                    obtainStyledAttributes.recycle();
                    throw th;
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
    }

    public /* synthetic */ OngoingCallToggleButton(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
