package com.truecaller.premium.ui.subscription.tier;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class RoundedCornerStyledPlayer extends androidx.media3.ui.PlayerView {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RoundedCornerStyledPlayer(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(attributeSet, "attrs");
        android.content.res.TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, com.truecaller.premium.R.styleable.e, 0, 0);
        try {
            setOutlineProvider(new lf2.i(obtainStyledAttributes.getDimensionPixelSize(0, 0)));
            setClipToOutline(true);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
