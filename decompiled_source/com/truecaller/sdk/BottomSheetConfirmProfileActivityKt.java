package com.truecaller.sdk;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroid/content/Context;", "context", "Landroid/os/Bundle;", "extras", "Landroid/content/Intent;", "getLaunchIntent", "(Landroid/content/Context;Landroid/os/Bundle;)Landroid/content/Intent;", "sdk-internal_googlePlayRelease"}, k = 2, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class BottomSheetConfirmProfileActivityKt {
    @androidx.annotation.Keep
    @com.airbnb.deeplinkdispatch.DeepLink({"truecallersdk://truesdk/mweb_verify_btmsheet"})
    @org.jetbrains.annotations.NotNull
    public static final android.content.Intent getLaunchIntent(@org.jetbrains.annotations.NotNull android.content.Context context, @org.jetbrains.annotations.Nullable android.os.Bundle bundle) {
        android.content.Intent g = com.ironsource.adqualitysdk.sdk.i.bar.g(context, "context", context, com.truecaller.sdk.BottomSheetConfirmProfileActivity.class);
        if (bundle != null) {
            g.addFlags(268468224);
            g.putExtras(bundle);
        }
        return g;
    }
}
