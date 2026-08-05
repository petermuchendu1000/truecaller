package com.truecaller.deeplink.handlers;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/truecaller/deeplink/handlers/BaseAssistantDeepLinkHandler;", "Lcom/airbnb/deeplinkdispatch/handler/DeepLinkHandler;", "Lcom/truecaller/deeplink/handlers/BaseAssistantDeepLinkHandler$bar;", "bar", "baz", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public abstract class BaseAssistantDeepLinkHandler implements com.airbnb.deeplinkdispatch.handler.DeepLinkHandler<com.truecaller.deeplink.handlers.BaseAssistantDeepLinkHandler.bar> {
    public static final java.util.List a = kotlin.collections.y.j(new java.lang.String[]{"onboarding", "settings_enable"});

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/truecaller/deeplink/handlers/BaseAssistantDeepLinkHandler$bar;", "", "", "subview", "<init>", "(Ljava/lang/String;)V", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes6.dex */
    public static final /* data */ class bar {
        public final java.lang.String a;

        public bar(@com.airbnb.deeplinkdispatch.handler.DeeplinkParam(name = "subview", type = com.airbnb.deeplinkdispatch.handler.DeepLinkParamType.Query) @org.jetbrains.annotations.Nullable java.lang.String str) {
            this.a = str;
        }

        public final boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof com.truecaller.deeplink.handlers.BaseAssistantDeepLinkHandler.bar) && kotlin.jvm.internal.Intrinsics.b(this.a, ((com.truecaller.deeplink.handlers.BaseAssistantDeepLinkHandler.bar) obj).a);
        }

        public final int hashCode() {
            java.lang.String str = this.a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final java.lang.String toString() {
            return bar.t("Args(subview=", this.a, ")");
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002À\u0006\u0003"}, d2 = {"Lcom/truecaller/deeplink/handlers/BaseAssistantDeepLinkHandler$baz;", "", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes6.dex */
    public interface baz {
    }

    public static final void a(com.truecaller.deeplink.handlers.BaseAssistantDeepLinkHandler baseAssistantDeepLinkHandler, android.content.Context context, java.lang.String str) {
        baseAssistantDeepLinkHandler.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        tx.w wVar = (com.truecaller.deeplink.handlers.BaseAssistantDeepLinkHandler.baz) f40.d0.z(context, com.truecaller.deeplink.handlers.BaseAssistantDeepLinkHandler.baz.class);
        if (str != null && !kotlin.text.StringsKt.X(str)) {
            wi0.bar.F(wVar.z0(), context, str, (com.truecaller.call_assistant.campaigns.deeplinks.external.AssistantCampaignInfo) null, 4);
        } else {
            wVar.z0().f(context, com.truecaller.bottombar.BottomBarButtonType.ASSISTANT, "deepLink");
        }
    }

    public final void handleDeepLink(android.content.Context context, java.lang.Object obj) {
        com.truecaller.deeplink.handlers.BaseAssistantDeepLinkHandler.bar barVar = (com.truecaller.deeplink.handlers.BaseAssistantDeepLinkHandler.bar) obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "deepLinkArgs");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        tx.w wVar = (com.truecaller.deeplink.handlers.BaseAssistantDeepLinkHandler.baz) f40.d0.z(context, com.truecaller.deeplink.handlers.BaseAssistantDeepLinkHandler.baz.class);
        fg3.h0.J(wVar.x0(), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new com.truecaller.deeplink.handlers.qux(wVar, this, context, barVar, null), 3);
    }
}
