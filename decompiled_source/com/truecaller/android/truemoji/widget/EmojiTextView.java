package com.truecaller.android.truemoji.widget;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public class EmojiTextView extends androidx.appcompat.widget.AppCompatTextView {
    public float h;
    public boolean i;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EmojiTextView(android.content.Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void setEmojiScale(float f) {
        this.h = f;
    }

    public final void setEmojisOnly(boolean z) {
        this.i = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setText(java.lang.CharSequence charSequence, android.widget.TextView.BufferType bufferType) {
        if (isInEditMode()) {
            super/*android.widget.TextView*/.setText(charSequence, bufferType);
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(charSequence);
        float f = this.h;
        boolean z = this.i;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(spannableStringBuilder, "<this>");
        if (z) {
            spannableStringBuilder.setSpan(new android.text.style.RelativeSizeSpan(f), 0, spannableStringBuilder.length(), 33);
        }
        ud0.bar.a(spannableStringBuilder);
        super/*android.widget.TextView*/.setText(spannableStringBuilder, bufferType);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EmojiTextView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmojiTextView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.h = 1.0f;
    }

    public /* synthetic */ EmojiTextView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
