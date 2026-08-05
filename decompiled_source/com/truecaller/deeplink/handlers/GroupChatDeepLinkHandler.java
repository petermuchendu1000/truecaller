package com.truecaller.deeplink.handlers;

@com.truecaller.deeplink.AppHomeDeepLink
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/deeplink/handlers/GroupChatDeepLinkHandler;", "Lcom/airbnb/deeplinkdispatch/handler/DeepLinkHandler;", "", "bar", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class GroupChatDeepLinkHandler implements com.airbnb.deeplinkdispatch.handler.DeepLinkHandler<java.lang.Object> {

    @org.jetbrains.annotations.NotNull
    public static final com.truecaller.deeplink.handlers.GroupChatDeepLinkHandler INSTANCE = new java.lang.Object();

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002À\u0006\u0003"}, d2 = {"Lcom/truecaller/deeplink/handlers/GroupChatDeepLinkHandler$bar;", "", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes6.dex */
    public interface bar {
    }

    public final void handleDeepLink(android.content.Context context, java.lang.Object obj) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "deepLinkArgs");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(wi0.bar.f(((com.truecaller.deeplink.handlers.GroupChatDeepLinkHandler.bar) f40.d0.z(context, com.truecaller.deeplink.handlers.GroupChatDeepLinkHandler.bar.class)).z0(), context, com.truecaller.bottombar.BottomBarButtonType.MESSAGES, "deepLink", (com.truecaller.dialer.ui.floating_toolbar.FloatingToolbarTabs) null, 120));
        int i = com.truecaller.messaging.newconversation.NewConversationActivity.e0;
        arrayList.add(com.moloco.sdk.internal.publisher.b0.q(context, true, new java.util.ArrayList()));
        if (!arrayList.isEmpty()) {
            android.content.Intent[] intentArr = (android.content.Intent[]) arrayList.toArray(new android.content.Intent[0]);
            intentArr[0] = new android.content.Intent(intentArr[0]).addFlags(268484608);
            context.startActivities(intentArr, null);
            return;
        }
        throw new java.lang.IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
    }
}
