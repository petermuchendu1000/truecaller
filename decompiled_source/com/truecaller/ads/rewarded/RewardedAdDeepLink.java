package com.truecaller.ads.rewarded;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007¨\u0006\n"}, d2 = {"Lcom/truecaller/ads/rewarded/RewardedAdDeepLink;", "", "<init>", "()V", "createRewardedAdIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "extras", "Landroid/os/Bundle;", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class RewardedAdDeepLink {
    public static final int $stable = 0;

    @org.jetbrains.annotations.NotNull
    public static final com.truecaller.ads.rewarded.RewardedAdDeepLink INSTANCE = new com.truecaller.ads.rewarded.RewardedAdDeepLink();

    private RewardedAdDeepLink() {
    }

    @androidx.annotation.Keep
    @com.airbnb.deeplinkdispatch.DeepLink({"truecaller://wvm-ad-reward/{data}"})
    @org.jetbrains.annotations.NotNull
    public static final android.content.Intent createRewardedAdIntent(@org.jetbrains.annotations.NotNull android.content.Context context, @org.jetbrains.annotations.NotNull android.os.Bundle extras) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(extras, "extras");
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.truecaller.ads.rewarded.WhoViewedMeAdActivity.class);
        intent.putExtra("custom_data", extras.getString("data"));
        intent.addFlags(268435456);
        return intent;
    }
}
