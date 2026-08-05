package com.truecaller.messaging.conversation.emoji;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class QuickAnimatedEmojiView extends android.widget.FrameLayout {
    public final com.airbnb.lottie.LottieAnimationView a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public QuickAnimatedEmojiView(android.content.Context context) {
        this(context, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public QuickAnimatedEmojiView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuickAnimatedEmojiView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        android.view.View.inflate(context, 2131561071, this);
        com.airbnb.lottie.LottieAnimationView findViewById = findViewById(2131363638);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.a = findViewById;
        setVisibility(4);
        android.graphics.drawable.Drawable background = getBackground();
        setBackground(background != null ? background.mutate() : null);
    }
}
