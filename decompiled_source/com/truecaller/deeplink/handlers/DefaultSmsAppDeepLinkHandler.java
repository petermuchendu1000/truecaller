package com.truecaller.deeplink.handlers;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\tJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/truecaller/deeplink/handlers/DefaultSmsAppDeepLinkHandler;", "", "Landroid/content/Context;", "context", "Landroid/os/Bundle;", "extras", "Lf6/k1;", "handleDeepLink", "(Landroid/content/Context;Landroid/os/Bundle;)Lf6/k1;", "bar", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class DefaultSmsAppDeepLinkHandler {

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002À\u0006\u0003"}, d2 = {"Lcom/truecaller/deeplink/handlers/DefaultSmsAppDeepLinkHandler$bar;", "", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes6.dex */
    public interface bar {
    }

    @com.truecaller.deeplink.AppHomeDeepLink
    @org.jetbrains.annotations.NotNull
    public static final f6.k1 handleDeepLink(@org.jetbrains.annotations.NotNull android.content.Context context, @org.jetbrains.annotations.NotNull android.os.Bundle extras) {
        java.lang.String l0;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(extras, "extras");
        tx.w wVar = (com.truecaller.deeplink.handlers.DefaultSmsAppDeepLinkHandler.bar) f40.d0.z(context, com.truecaller.deeplink.handlers.DefaultSmsAppDeepLinkHandler.bar.class);
        f6.k1 k1Var = new f6.k1(context);
        tx.w wVar2 = wVar;
        k1Var.a.add(wi0.bar.f(wVar2.z0(), context, com.truecaller.bottombar.BottomBarButtonType.MESSAGES, "deepLink", (com.truecaller.dialer.ui.floating_toolbar.FloatingToolbarTabs) null, 120));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(k1Var, "addNextIntent(...)");
        if (!((u03.b) wVar2.O.get()).p()) {
            java.lang.String str = "tcNotification-setTcDma";
            if (extras.isEmpty()) {
                k1Var.a(com.truecaller.messaging.defaultsms.DefaultSmsActivity.t0(context, "tcNotification-setTcDma"));
                return k1Var;
            }
            java.lang.String string = extras.getString("campaignId");
            java.lang.String str2 = null;
            if (string != null) {
                str = bx.e1.m(1, "afterCallScreen-adClick_%s", "format(...)", new java.lang.Object[]{string});
                java.lang.String string2 = extras.getString("deep_link_uri");
                if (string2 != null && (l0 = kotlin.text.StringsKt.l0(string2, "postBackUrl=", string2)) != null) {
                    str2 = kotlin.text.StringsKt.c0(l0, "$");
                }
            }
            k1Var.a(com.truecaller.messaging.defaultsms.DefaultSmsActivity.u0(context, str, extras.getString("context"), str2, null, true));
        }
        return k1Var;
    }
}
