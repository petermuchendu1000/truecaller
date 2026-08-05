package com.truecaller.rewardprogram.api.ui.progress;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class RewardProgramProgressBanner extends android.widget.FrameLayout {
    public static final /* synthetic */ int e = 0;
    public final int a;
    public final int b;
    public final boolean c;
    public hk2.k d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RewardProgramProgressBanner(android.content.Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void a(com.truecaller.rewardprogram.api.model.ProgressConfig progressConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(progressConfig, "config");
        android.content.Context context = getContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        androidx.compose.ui.platform.ComposeView composeView = new androidx.compose.ui.platform.ComposeView(context, (android.util.AttributeSet) null, 0, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        composeView.setViewCompositionStrategy(k4.r1.e);
        composeView.setContent(new d3.qux(-1100801303, new hk2.j(this, progressConfig, 0), true));
        addView(composeView);
    }

    public final void setOnAnimationsEndListener(@org.jetbrains.annotations.NotNull hk2.k kVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kVar, "listener");
        this.d = kVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RewardProgramProgressBanner(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RewardProgramProgressBanner(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        int[] iArr = com.truecaller.rewardprogram.api.R$styleable.b;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(iArr, "RewardProgramProgressBanner");
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        this.a = obtainStyledAttributes.getColor(0, bi3.a.s(context, 2130970634));
        this.b = obtainStyledAttributes.getColor(1, bi3.a.s(context, 2130970556));
        this.c = obtainStyledAttributes.getBoolean(2, false);
        obtainStyledAttributes.recycle();
    }

    public /* synthetic */ RewardProgramProgressBanner(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
