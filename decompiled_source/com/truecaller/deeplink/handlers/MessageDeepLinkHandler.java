package com.truecaller.deeplink.handlers;

@com.truecaller.deeplink.AppHomeDeepLink
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/truecaller/deeplink/handlers/MessageDeepLinkHandler;", "Lcom/airbnb/deeplinkdispatch/handler/DeepLinkHandler;", "Lcom/truecaller/deeplink/handlers/MessageDeepLinkHandler$bar;", "baz", "bar", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class MessageDeepLinkHandler implements com.airbnb.deeplinkdispatch.handler.DeepLinkHandler<com.truecaller.deeplink.handlers.MessageDeepLinkHandler.bar> {

    @org.jetbrains.annotations.NotNull
    public static final com.truecaller.deeplink.handlers.MessageDeepLinkHandler INSTANCE = new java.lang.Object();

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/truecaller/deeplink/handlers/MessageDeepLinkHandler$bar;", "", "", "conversationId", "messageId", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;)V", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes6.dex */
    public static final /* data */ class bar {
        public final java.lang.Long a;
        public final java.lang.Long b;

        public bar(@com.airbnb.deeplinkdispatch.handler.DeeplinkParam(name = "conversationId", type = com.airbnb.deeplinkdispatch.handler.DeepLinkParamType.Query) @org.jetbrains.annotations.Nullable java.lang.Long l, @com.airbnb.deeplinkdispatch.handler.DeeplinkParam(name = "messageId", type = com.airbnb.deeplinkdispatch.handler.DeepLinkParamType.Query) @org.jetbrains.annotations.Nullable java.lang.Long l2) {
            this.a = l;
            this.b = l2;
        }

        public final boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof com.truecaller.deeplink.handlers.MessageDeepLinkHandler.bar)) {
                return false;
            }
            com.truecaller.deeplink.handlers.MessageDeepLinkHandler.bar barVar = (com.truecaller.deeplink.handlers.MessageDeepLinkHandler.bar) obj;
            return kotlin.jvm.internal.Intrinsics.b(this.a, barVar.a) && kotlin.jvm.internal.Intrinsics.b(this.b, barVar.b);
        }

        public final int hashCode() {
            java.lang.Long l = this.a;
            int hashCode = (l == null ? 0 : l.hashCode()) * 31;
            java.lang.Long l2 = this.b;
            return hashCode + (l2 != null ? l2.hashCode() : 0);
        }

        public final java.lang.String toString() {
            return "Args(conversationId=" + this.a + ", messageId=" + this.b + ")";
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002À\u0006\u0003"}, d2 = {"Lcom/truecaller/deeplink/handlers/MessageDeepLinkHandler$baz;", "", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes6.dex */
    public interface baz {
    }

    public final void handleDeepLink(android.content.Context context, java.lang.Object obj) {
        long j;
        com.truecaller.deeplink.handlers.MessageDeepLinkHandler.bar barVar = (com.truecaller.deeplink.handlers.MessageDeepLinkHandler.bar) obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "deepLinkArgs");
        android.app.TaskStackBuilder create = android.app.TaskStackBuilder.create(context);
        ((com.truecaller.deeplink.handlers.MessageDeepLinkHandler.baz) f40.d0.z(context, com.truecaller.deeplink.handlers.MessageDeepLinkHandler.baz.class)).z0().getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("deepLink", "analyticsContext");
        android.app.TaskStackBuilder addNextIntent = create.addNextIntent(y90.m6.o(context, com.truecaller.bottombar.BottomBarButtonType.MESSAGES, "deepLink", (java.lang.String) null, (com.truecaller.messaging.data.types.InboxTab) null, 120));
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "deepLinkArgs");
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.truecaller.messaging.conversation.ConversationActivity.class);
        java.lang.Long l = barVar.b;
        if (l != null) {
            j = l.longValue();
        } else {
            j = -1;
        }
        java.lang.Long l2 = barVar.a;
        if (l2 == null || l2.longValue() != -1) {
            intent.putExtra("conversation_id", l2);
            intent.putExtra("message_id", j);
            intent.putExtra("filter", 1);
            intent.putExtra("launch_source", "insights_nudge_notification");
        }
        addNextIntent.addNextIntent(intent).startActivities();
    }
}
