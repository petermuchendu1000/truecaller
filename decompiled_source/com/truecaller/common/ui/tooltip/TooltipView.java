package com.truecaller.common.ui.tooltip;

/* loaded from: /home/user/tc_decoded/classes2.dex */
public final class TooltipView extends android.widget.LinearLayout {
    public static final /* synthetic */ int b = 0;
    public final kotlin.Lazy a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TooltipView(android.content.Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    private final android.view.View getArrow() {
        java.lang.Object value = this.a.getValue();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (android.view.View) value;
    }

    public final void a(int i, int i2) {
        removeView(getArrow());
        if ((i2 & 112) == 48) {
            addView(getArrow(), 1);
            getArrow().setRotation(180.0f);
        } else {
            addView(getArrow(), 0);
            getArrow().setRotation(0.0f);
        }
        getArrow().setTranslationX(i - (getArrow().getWidth() / 2));
    }

    public final void setText(@org.jetbrains.annotations.NotNull java.lang.CharSequence charSequence) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "text");
        ((android.widget.TextView) findViewById(2131367117)).setText(charSequence);
    }

    public final void setTextColor(int i) {
        ((android.widget.TextView) findViewById(2131367117)).setTextColor(i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TooltipView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TooltipView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.a = kotlin.LazyKt.lazy(new r20.b(this, 21));
    }

    public /* synthetic */ TooltipView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
