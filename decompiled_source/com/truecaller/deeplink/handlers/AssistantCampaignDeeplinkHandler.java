package com.truecaller.deeplink.handlers;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/truecaller/deeplink/handlers/AssistantCampaignDeeplinkHandler;", "Lcom/airbnb/deeplinkdispatch/handler/DeepLinkHandler;", "Lcom/truecaller/deeplink/handlers/AssistantCampaignDeeplinkHandler$bar;", "baz", "bar", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@com.truecaller.deeplink.AppHomeDeepLink
@kotlin.a
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class AssistantCampaignDeeplinkHandler implements com.airbnb.deeplinkdispatch.handler.DeepLinkHandler<com.truecaller.deeplink.handlers.AssistantCampaignDeeplinkHandler.bar> {

    @org.jetbrains.annotations.NotNull
    public static final com.truecaller.deeplink.handlers.AssistantCampaignDeeplinkHandler INSTANCE = new java.lang.Object();

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/truecaller/deeplink/handlers/AssistantCampaignDeeplinkHandler$bar;", "", "", "campaignId", "viewType", "viewId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes6.dex */
    public static final /* data */ class bar {
        public final java.lang.String a;
        public final java.lang.String b;
        public final java.lang.String c;

        public bar(@com.airbnb.deeplinkdispatch.handler.DeeplinkParam(name = "campaignId", type = com.airbnb.deeplinkdispatch.handler.DeepLinkParamType.Path) @org.jetbrains.annotations.Nullable java.lang.String str, @com.airbnb.deeplinkdispatch.handler.DeeplinkParam(name = "type", type = com.airbnb.deeplinkdispatch.handler.DeepLinkParamType.Path) @org.jetbrains.annotations.Nullable java.lang.String str2, @com.airbnb.deeplinkdispatch.handler.DeeplinkParam(name = "id", type = com.airbnb.deeplinkdispatch.handler.DeepLinkParamType.Path) @org.jetbrains.annotations.Nullable java.lang.String str3) {
            this.a = str;
            this.b = str2;
            this.c = str3;
        }

        public final boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof com.truecaller.deeplink.handlers.AssistantCampaignDeeplinkHandler.bar)) {
                return false;
            }
            com.truecaller.deeplink.handlers.AssistantCampaignDeeplinkHandler.bar barVar = (com.truecaller.deeplink.handlers.AssistantCampaignDeeplinkHandler.bar) obj;
            return kotlin.jvm.internal.Intrinsics.b(this.a, barVar.a) && kotlin.jvm.internal.Intrinsics.b(this.b, barVar.b) && kotlin.jvm.internal.Intrinsics.b(this.c, barVar.c);
        }

        public final int hashCode() {
            java.lang.String str = this.a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            java.lang.String str2 = this.b;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            java.lang.String str3 = this.c;
            return hashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        public final java.lang.String toString() {
            return bar.v(this.c, ")", ro0.f.E("Args(campaignId=", this.a, ", viewType=", this.b, ", viewId="));
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002À\u0006\u0003"}, d2 = {"Lcom/truecaller/deeplink/handlers/AssistantCampaignDeeplinkHandler$baz;", "", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes6.dex */
    public interface baz {
    }

    public final void handleDeepLink(android.content.Context context, java.lang.Object obj) {
        com.truecaller.call_assistant.campaigns.data.CampaignViewType campaignViewType;
        com.truecaller.call_assistant.campaigns.deeplinks.external.AssistantCampaignInfo assistantCampaignInfo;
        java.lang.Integer intOrNull;
        java.lang.Object obj2;
        com.truecaller.deeplink.handlers.AssistantCampaignDeeplinkHandler.bar barVar = (com.truecaller.deeplink.handlers.AssistantCampaignDeeplinkHandler.bar) obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "deepLinkArgs");
        tx.w wVar = (com.truecaller.deeplink.handlers.AssistantCampaignDeeplinkHandler.baz) f40.d0.z(context, com.truecaller.deeplink.handlers.AssistantCampaignDeeplinkHandler.baz.class);
        tx.w wVar2 = wVar;
        wVar2.getClass();
        java.lang.String str = barVar.a;
        java.lang.String str2 = barVar.b;
        java.lang.String str3 = barVar.c;
        if (str2 != null && (intOrNull = kotlin.text.StringsKt.toIntOrNull(str2)) != null) {
            int intValue = intOrNull.intValue();
            com.truecaller.call_assistant.campaigns.data.CampaignViewType.Companion.getClass();
            java.util.Iterator it = com.truecaller.call_assistant.campaigns.data.CampaignViewType.getEntries().iterator();
            while (true) {
                if (it.hasNext()) {
                    obj2 = it.next();
                    if (((com.truecaller.call_assistant.campaigns.data.CampaignViewType) obj2).getCode() == intValue) {
                        break;
                    }
                } else {
                    obj2 = null;
                    break;
                }
            }
            campaignViewType = (com.truecaller.call_assistant.campaigns.data.CampaignViewType) obj2;
        } else {
            campaignViewType = null;
        }
        if (str != null && !kotlin.text.StringsKt.X(str) && campaignViewType != null && str3 != null && !kotlin.text.StringsKt.X(str3)) {
            assistantCampaignInfo = new com.truecaller.call_assistant.campaigns.deeplinks.external.AssistantCampaignInfo(str, campaignViewType, str3);
        } else {
            assistantCampaignInfo = null;
        }
        fg3.h0.J(wVar2.x0(), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new com.truecaller.deeplink.handlers.baz(wVar, context, assistantCampaignInfo, null), 3);
    }
}
