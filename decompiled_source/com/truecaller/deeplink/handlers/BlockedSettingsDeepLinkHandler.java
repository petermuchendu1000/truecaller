package com.truecaller.deeplink.handlers;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\tJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/truecaller/deeplink/handlers/BlockedSettingsDeepLinkHandler;", "", "Landroid/content/Context;", "context", "Landroid/os/Bundle;", "extras", "Lf6/k1;", "handleDeeplink", "(Landroid/content/Context;Landroid/os/Bundle;)Lf6/k1;", "bar", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class BlockedSettingsDeepLinkHandler {

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002À\u0006\u0003"}, d2 = {"Lcom/truecaller/deeplink/handlers/BlockedSettingsDeepLinkHandler$bar;", "", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes6.dex */
    public interface bar {
    }

    @com.truecaller.deeplink.AppHomeDeepLink
    @org.jetbrains.annotations.NotNull
    public static final f6.k1 handleDeeplink(@org.jetbrains.annotations.NotNull android.content.Context context, @org.jetbrains.annotations.NotNull android.os.Bundle extras) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(extras, "extras");
        android.content.Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        tx.w wVar = (com.truecaller.deeplink.handlers.BlockedSettingsDeepLinkHandler.bar) f40.d0.z(applicationContext, com.truecaller.deeplink.handlers.BlockedSettingsDeepLinkHandler.bar.class);
        r11.bar applicationContext2 = context.getApplicationContext();
        kotlin.jvm.internal.Intrinsics.e(applicationContext2, "null cannot be cast to non-null type com.truecaller.common.app.ApplicationBase");
        if (!applicationContext2.d()) {
            f6.k1 k1Var = new f6.k1(context);
            k1Var.a.add(wi0.bar.f(wVar.z0(), context, com.truecaller.bottombar.BottomBarButtonType.CALLS, "deepLink", (com.truecaller.dialer.ui.floating_toolbar.FloatingToolbarTabs) null, 120));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(k1Var, "addNextIntent(...)");
            return k1Var;
        }
        tx.w wVar2 = wVar;
        qb2.g gVar = (qb2.g) wVar2.H.b.f4.get();
        com.truecaller.premium.PremiumLaunchContext.Static r1 = i82.r.N7;
        java.lang.String string = extras.getString("action");
        gVar.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, "launchContext");
        dx2.baz bazVar = gVar.a;
        com.truecaller.premium.interstitial.InterstitialDeeplinkAction.Companion.getClass();
        com.truecaller.premium.interstitial.InterstitialDeeplinkAction a = qb2.f.a(string);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, "launchContext");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(a, "action");
        bazVar.g0(dx2.baz.o0(r1, "interstitial_deeplink_action"), a.getActionId());
        f6.k1 e = wVar2.z0().e(context);
        e.a.add(((uq2.baz) wVar2.Xb.get()).a(context, new com.truecaller.settings.api.SettingsLaunchConfig("UNKNOWN", (java.lang.String) null, "blockView", false, true, false), com.truecaller.settings.api.SettingsCategory.SETTINGS_BLOCK, (com.truecaller.settings.api.SettingDeepLink) null));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(e, "addNextIntent(...)");
        return e;
    }
}
