package com.truecaller.android.truemoji.widget;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public class EmojiView extends android.widget.FrameLayout {
    public final com.truecaller.android.truemoji.widget.EmojiTextView a;
    public final android.view.View b;
    public boolean c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EmojiView(android.content.Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void setEmoji(@org.jetbrains.annotations.Nullable sd0.bar barVar) {
        if (barVar != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "<this>");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "emoji");
            int[] iArr = barVar.a;
            this.a.setText(new java.lang.String(iArr, 0, iArr.length));
            this.b.setVisibility((barVar.b.length == 0 || !this.c) ? 8 : 0);
        }
    }

    public final void setMargins(int i) {
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams;
        android.view.ViewGroup.LayoutParams layoutParams = this.a.getLayoutParams();
        if (layoutParams instanceof android.view.ViewGroup.MarginLayoutParams) {
            marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
        } else {
            marginLayoutParams = null;
        }
        if (marginLayoutParams != null) {
            marginLayoutParams.setMargins(i, i, i, i);
        }
    }

    public final void setShowVariants(boolean z) {
        this.c = z;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EmojiView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmojiView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        android.view.View.inflate(context, 2131561012, this);
        java.lang.Object findViewById = findViewById(2131363637);
        com.truecaller.android.truemoji.widget.EmojiTextView emojiTextView = (com.truecaller.android.truemoji.widget.EmojiTextView) findViewById;
        emojiTextView.setEmojisOnly(true);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById, "apply(...)");
        this.a = emojiTextView;
        android.view.View findViewById2 = findViewById(2131367366);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.b = findViewById2;
    }

    public final void setEmoji(@org.jetbrains.annotations.NotNull java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "emoji");
        setEmoji(vd0.bar.a.b(str));
    }

    public /* synthetic */ EmojiView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
