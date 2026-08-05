package com.truecaller.deeplink.handlers;

@com.truecaller.deeplink.AppHomeDeepLink
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/truecaller/deeplink/handlers/ProfileDeepLinkHandler;", "Lcom/airbnb/deeplinkdispatch/handler/DeepLinkHandler;", "Lcom/truecaller/deeplink/handlers/ProfileDeepLinkHandler$bar;", "baz", "bar", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class ProfileDeepLinkHandler implements com.airbnb.deeplinkdispatch.handler.DeepLinkHandler<com.truecaller.deeplink.handlers.ProfileDeepLinkHandler.bar> {

    @org.jetbrains.annotations.NotNull
    public static final com.truecaller.deeplink.handlers.ProfileDeepLinkHandler INSTANCE = new java.lang.Object();

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/truecaller/deeplink/handlers/ProfileDeepLinkHandler$bar;", "", "", "source", "<init>", "(Ljava/lang/String;)V", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes6.dex */
    public static final class bar {
        public final java.lang.String a;

        public bar(@com.airbnb.deeplinkdispatch.handler.DeeplinkParam(name = "source", type = com.airbnb.deeplinkdispatch.handler.DeepLinkParamType.Query) @org.jetbrains.annotations.Nullable java.lang.String str) {
            this.a = str;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002À\u0006\u0003"}, d2 = {"Lcom/truecaller/deeplink/handlers/ProfileDeepLinkHandler$baz;", "", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes6.dex */
    public interface baz {
    }

    public final void handleDeepLink(android.content.Context context, java.lang.Object obj) {
        java.lang.String str;
        com.truecaller.analytics.AppEvents.UsersHome.NavigationSource navigationSource;
        java.lang.String obj2;
        com.truecaller.deeplink.handlers.ProfileDeepLinkHandler.bar barVar = (com.truecaller.deeplink.handlers.ProfileDeepLinkHandler.bar) obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "deepLinkArgs");
        f6.k1 e = ((com.truecaller.deeplink.handlers.ProfileDeepLinkHandler.baz) f40.d0.z(context, com.truecaller.deeplink.handlers.ProfileDeepLinkHandler.baz.class)).z0().e(context);
        com.truecaller.deeplink.handlers.ProfileDeepLinkHandler profileDeepLinkHandler = INSTANCE;
        java.lang.String str2 = barVar.a;
        profileDeepLinkHandler.getClass();
        if (str2 != null && (obj2 = kotlin.text.StringsKt.u0(str2).toString()) != null) {
            str = obj2.toUpperCase(java.util.Locale.ROOT);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "toUpperCase(...)");
        } else {
            str = null;
        }
        if (kotlin.jvm.internal.Intrinsics.b(str, "WIDGET")) {
            navigationSource = com.truecaller.analytics.AppEvents.UsersHome.NavigationSource.WIDGET;
        } else {
            navigationSource = com.truecaller.analytics.AppEvents.UsersHome.NavigationSource.DEEP_LINK;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationSource, "analyticsContext");
        int i = com.truecaller.usershome.presentaion.ui.screen.UsersHomeActivity.m0;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationSource, "navigationSource");
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.truecaller.usershome.presentaion.ui.screen.UsersHomeActivity.class);
        intent.putExtra("EXTRA_NAVIGATION_SOURCE", (java.io.Serializable) navigationSource);
        intent.putExtra("EXTRA_DEEPLINK_VIEW", (java.io.Serializable) null);
        intent.setFlags(67108864);
        e.a.add(intent);
        e.d();
    }
}
