package com.truecaller.deeplink.handlers;

@com.truecaller.deeplink.AppHomeDeepLink
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/deeplink/handlers/UserVerificationDeepLinkHandler;", "Lcom/airbnb/deeplinkdispatch/handler/DeepLinkHandler;", "", "bar", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class UserVerificationDeepLinkHandler implements com.airbnb.deeplinkdispatch.handler.DeepLinkHandler<java.lang.Object> {

    @org.jetbrains.annotations.NotNull
    public static final com.truecaller.deeplink.handlers.UserVerificationDeepLinkHandler INSTANCE = new java.lang.Object();

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002À\u0006\u0003"}, d2 = {"Lcom/truecaller/deeplink/handlers/UserVerificationDeepLinkHandler$bar;", "", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes6.dex */
    public interface bar {
    }

    public final void handleDeepLink(android.content.Context context, java.lang.Object obj) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "deepLinkArgs");
        f6.k1 e = ((com.truecaller.deeplink.handlers.UserVerificationDeepLinkHandler.bar) f40.d0.z(context, com.truecaller.deeplink.handlers.UserVerificationDeepLinkHandler.bar.class)).z0().e(context);
        java.io.Serializable serializable = com.truecaller.analytics.AppEvents.UsersHome.NavigationSource.DEEP_LINK;
        java.io.Serializable serializable2 = com.truecaller.usershome.navigation.UsersHomeDeepLinkView.USER_VERIFICATION;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serializable, "analyticsContext");
        int i = com.truecaller.usershome.presentaion.ui.screen.UsersHomeActivity.m0;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serializable, "navigationSource");
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.truecaller.usershome.presentaion.ui.screen.UsersHomeActivity.class);
        intent.putExtra("EXTRA_NAVIGATION_SOURCE", serializable);
        intent.putExtra("EXTRA_DEEPLINK_VIEW", serializable2);
        intent.setFlags(67108864);
        e.a.add(intent);
        e.d();
    }
}
