package com.truecaller.deeplink.handlers;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\tJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/truecaller/deeplink/handlers/BlockingDeepLinkHandler;", "", "Landroid/content/Context;", "context", "Landroid/os/Bundle;", "extras", "Landroid/content/Intent;", "handleDeepLink", "(Landroid/content/Context;Landroid/os/Bundle;)Landroid/content/Intent;", "bar", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class BlockingDeepLinkHandler {

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002À\u0006\u0003"}, d2 = {"Lcom/truecaller/deeplink/handlers/BlockingDeepLinkHandler$bar;", "", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes6.dex */
    public interface bar {
    }

    @com.truecaller.deeplink.AppHomeDeepLink
    @org.jetbrains.annotations.NotNull
    public static final android.content.Intent handleDeepLink(@org.jetbrains.annotations.NotNull android.content.Context context, @org.jetbrains.annotations.NotNull android.os.Bundle extras) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(extras, "extras");
        tx.w wVar = (com.truecaller.deeplink.handlers.BlockingDeepLinkHandler.bar) f40.d0.z(context, com.truecaller.deeplink.handlers.BlockingDeepLinkHandler.bar.class);
        qb2.g gVar = (qb2.g) cd3.baz.a(wVar.H.b.f4).get();
        com.truecaller.premium.PremiumLaunchContext.Static r2 = i82.r.N7;
        java.lang.String string = extras.getString("action");
        gVar.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, "launchContext");
        dx2.baz bazVar = gVar.a;
        com.truecaller.premium.interstitial.InterstitialDeeplinkAction.Companion.getClass();
        com.truecaller.premium.interstitial.InterstitialDeeplinkAction a = qb2.f.a(string);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, "launchContext");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(a, "action");
        bazVar.g0(dx2.baz.o0(r2, "interstitial_deeplink_action"), a.getActionId());
        return wi0.bar.f(wVar.z0(), context, com.truecaller.bottombar.BottomBarButtonType.BLOCKING, "deepLink", (com.truecaller.dialer.ui.floating_toolbar.FloatingToolbarTabs) null, 120);
    }
}
