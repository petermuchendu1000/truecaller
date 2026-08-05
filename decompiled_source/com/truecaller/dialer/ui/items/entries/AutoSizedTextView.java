package com.truecaller.dialer.ui.items.entries;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class AutoSizedTextView extends androidx.appcompat.widget.AppCompatTextView {
    public kf1.bar h;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AutoSizedTextView(android.content.Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    private final android.text.SpannableStringBuilder getTextWithDrawables() {
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        spannableStringBuilder.append(getText());
        kf1.bar barVar = this.h;
        if (barVar != null) {
            android.graphics.drawable.Drawable drawable = barVar.a;
            if (drawable != null) {
                spannableStringBuilder.append((java.lang.CharSequence) " ");
                kf1.bar barVar2 = this.h;
                if (barVar2 != null) {
                    barVar2.b = bi3.a.o(drawable, spannableStringBuilder, (java.lang.Integer) null, (android.graphics.Paint.FontMetricsInt) null, 6);
                    return spannableStringBuilder;
                }
                kotlin.jvm.internal.Intrinsics.n("drawableEnd");
                throw null;
            }
            return spannableStringBuilder;
        }
        kotlin.jvm.internal.Intrinsics.n("drawableEnd");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kf1.bar] */
    private final void setCompoundDrawableEnd(android.graphics.drawable.Drawable drawable) {
        if (this.h == null) {
            ?? obj = new java.lang.Object();
            obj.a = null;
            obj.b = null;
            this.h = obj;
        }
        kf1.bar barVar = this.h;
        if (barVar != null) {
            java.lang.CharSequence text = getText();
            if (!kotlin.jvm.internal.Intrinsics.b(barVar.a, drawable)) {
                android.text.style.ReplacementSpan replacementSpan = barVar.b;
                if (replacementSpan != null && (text instanceof android.text.SpannableString)) {
                    ((android.text.SpannableString) text).removeSpan(replacementSpan);
                }
                barVar.b = null;
                barVar.a = drawable;
            }
            setText(getTextWithDrawables());
            return;
        }
        kotlin.jvm.internal.Intrinsics.n("drawableEnd");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, kf1.bar] */
    public final void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        if (this.h == null) {
            ?? obj = new java.lang.Object();
            obj.a = null;
            obj.b = null;
            this.h = obj;
        }
        if (charSequence == null) {
            setText(getTextWithDrawables());
            return;
        }
        if (charSequence instanceof android.text.SpannableString) {
            kf1.bar barVar = this.h;
            if (barVar != null) {
                android.text.SpannableString spannableString = (android.text.SpannableString) charSequence;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(spannableString, "text");
                if (barVar.b != null && spannableString.getSpanStart(spannableString) >= 0) {
                    setText(getTextWithDrawables());
                    return;
                }
                return;
            }
            kotlin.jvm.internal.Intrinsics.n("drawableEnd");
            throw null;
        }
    }

    public void setAutoSizeTextTypeWithDefaults(int i) {
        super.setAutoSizeTextTypeWithDefaults(1);
    }

    public final void setCompoundDrawables(android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2, android.graphics.drawable.Drawable drawable3, android.graphics.drawable.Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, (android.graphics.drawable.Drawable) null, drawable4);
        setCompoundDrawableEnd(drawable3);
    }

    public final void setCompoundDrawablesRelative(android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2, android.graphics.drawable.Drawable drawable3, android.graphics.drawable.Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, (android.graphics.drawable.Drawable) null, drawable4);
        setCompoundDrawableEnd(drawable3);
    }

    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2, android.graphics.drawable.Drawable drawable3, android.graphics.drawable.Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, (android.graphics.drawable.Drawable) null, drawable4);
        setCompoundDrawableEnd(drawable3);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AutoSizedTextView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoSizedTextView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, 0, i4);
        setCompoundDrawableEnd(i3 == 0 ? null : yb0.i.w(i3, getContext()));
    }

    public /* synthetic */ AutoSizedTextView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
