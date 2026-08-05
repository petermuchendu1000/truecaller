package com.truecaller.deeplink.handlers;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\tJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/truecaller/deeplink/handlers/PremiumDeepLinkHandler;", "", "Landroid/content/Context;", "context", "Landroid/os/Bundle;", "extras", "Landroid/content/Intent;", "handleDeepLink", "(Landroid/content/Context;Landroid/os/Bundle;)Landroid/content/Intent;", "bar", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class PremiumDeepLinkHandler {

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002À\u0006\u0003"}, d2 = {"Lcom/truecaller/deeplink/handlers/PremiumDeepLinkHandler$bar;", "", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes6.dex */
    public interface bar {
    }

    @com.truecaller.deeplink.AppHomeDeepLink
    @org.jetbrains.annotations.NotNull
    public static final android.content.Intent handleDeepLink(@org.jetbrains.annotations.NotNull android.content.Context context, @org.jetbrains.annotations.NotNull android.os.Bundle extras) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(extras, "extras");
        tx.w wVar = (com.truecaller.deeplink.handlers.PremiumDeepLinkHandler.bar) f40.d0.z(context, com.truecaller.deeplink.handlers.PremiumDeepLinkHandler.bar.class);
        ((m92.d) cd3.baz.a(wVar.H.b.m4).get()).a(extras);
        android.content.Intent f = wi0.bar.f(wVar.z0(), context, com.truecaller.bottombar.BottomBarButtonType.PREMIUM, "deepLink", (com.truecaller.dialer.ui.floating_toolbar.FloatingToolbarTabs) null, 120);
        f.putExtra("originalLaunchContext", i82.r.C8.getName());
        f.putExtra("analyticsContext", "deepLink");
        return f;
    }
}
