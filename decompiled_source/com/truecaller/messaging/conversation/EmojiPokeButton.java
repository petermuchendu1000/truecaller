package com.truecaller.messaging.conversation;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class EmojiPokeButton extends com.truecaller.android.truemoji.widget.EmojiView {
    public final android.view.animation.LinearInterpolator d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EmojiPokeButton(android.content.Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setVisible(boolean z) {
        android.view.animation.LinearInterpolator linearInterpolator = this.d;
        if (z) {
            setVisibility(0);
            animate().scaleX(1.0f).scaleY(1.0f).setDuration(100L).alpha(1.0f).setInterpolator(linearInterpolator).start();
        } else {
            animate().scaleX(0.5f).scaleY(0.5f).setDuration(100L).alpha(0.0f).setInterpolator(linearInterpolator).withEndAction(new o83.b(this, 6)).start();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setVisibleWithoutAnimation(boolean z) {
        int i;
        setScaleX(1.0f);
        setScaleY(1.0f);
        setAlpha(1.0f);
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        setVisibility(i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EmojiPokeButton(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmojiPokeButton(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.d = new android.view.animation.LinearInterpolator();
        setMargins(0);
    }

    public /* synthetic */ EmojiPokeButton(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
