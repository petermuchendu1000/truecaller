package com.truecaller.rewardprogram.api.ui;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class RewardProgramClaimRewardBanner extends androidx.constraintlayout.widget.ConstraintLayout {
    public final ck2.bar s;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RewardProgramClaimRewardBanner(android.content.Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void setClaimableRewardIcon(int i) {
        ((android.widget.ImageView) this.s.c).setImageResource(i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RewardProgramClaimRewardBanner(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RewardProgramClaimRewardBanner(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        android.view.LayoutInflater.from(context).inflate(2131559972, (android.view.ViewGroup) this);
        int i2 = 2131362285;
        android.widget.ImageView imageView = (android.widget.ImageView) df0.qux.o(2131362285, this);
        if (imageView != null) {
            i2 = 2131364553;
            android.widget.ImageView imageView2 = (android.widget.ImageView) df0.qux.o(2131364553, this);
            if (imageView2 != null) {
                i2 = 2131366692;
                android.widget.TextView textView = (android.widget.TextView) df0.qux.o(2131366692, this);
                if (textView != null) {
                    i2 = 2131367033;
                    android.widget.TextView textView2 = (android.widget.TextView) df0.qux.o(2131367033, this);
                    if (textView2 != null) {
                        ck2.bar barVar = new ck2.bar(this, imageView, imageView2, textView, textView2);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(barVar, "inflate(...)");
                        this.s = barVar;
                        setPadding(getPaddingLeft(), getPaddingTop(), bd.bar.q(16), getPaddingBottom());
                        setClipToPadding(false);
                        int[] iArr = com.truecaller.rewardprogram.api.R$styleable.a;
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(iArr, "RewardProgramClaimRewardBanner");
                        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
                        int color = obtainStyledAttributes.getColor(1, bi3.a.s(context, 2130970931));
                        int color2 = obtainStyledAttributes.getColor(0, bi3.a.s(context, 2130970935));
                        textView2.setTextColor(color);
                        textView.setTextColor(color2);
                        imageView.setColorFilter(color2);
                        obtainStyledAttributes.recycle();
                        return;
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
    }

    public /* synthetic */ RewardProgramClaimRewardBanner(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
