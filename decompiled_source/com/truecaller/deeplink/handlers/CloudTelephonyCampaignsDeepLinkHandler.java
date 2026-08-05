package com.truecaller.deeplink.handlers;

@com.truecaller.deeplink.AppHomeDeepLink
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/truecaller/deeplink/handlers/CloudTelephonyCampaignsDeepLinkHandler;", "Lcom/airbnb/deeplinkdispatch/handler/DeepLinkHandler;", "Lcom/truecaller/deeplink/handlers/CloudTelephonyCampaignsDeepLinkHandler$bar;", "baz", "bar", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class CloudTelephonyCampaignsDeepLinkHandler implements com.airbnb.deeplinkdispatch.handler.DeepLinkHandler<com.truecaller.deeplink.handlers.CloudTelephonyCampaignsDeepLinkHandler.bar> {

    @org.jetbrains.annotations.NotNull
    public static final com.truecaller.deeplink.handlers.CloudTelephonyCampaignsDeepLinkHandler INSTANCE = new java.lang.Object();

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/truecaller/deeplink/handlers/CloudTelephonyCampaignsDeepLinkHandler$bar;", "", "", "campaignId", "viewType", "viewId", "feature", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes6.dex */
    public static final /* data */ class bar {
        public final java.lang.String a;
        public final java.lang.String b;
        public final java.lang.String c;
        public final java.lang.String d;

        public bar(@com.airbnb.deeplinkdispatch.handler.DeeplinkParam(name = "campaignId", type = com.airbnb.deeplinkdispatch.handler.DeepLinkParamType.Path) @org.jetbrains.annotations.Nullable java.lang.String str, @com.airbnb.deeplinkdispatch.handler.DeeplinkParam(name = "type", type = com.airbnb.deeplinkdispatch.handler.DeepLinkParamType.Path) @org.jetbrains.annotations.Nullable java.lang.String str2, @com.airbnb.deeplinkdispatch.handler.DeeplinkParam(name = "id", type = com.airbnb.deeplinkdispatch.handler.DeepLinkParamType.Path) @org.jetbrains.annotations.Nullable java.lang.String str3, @com.airbnb.deeplinkdispatch.handler.DeeplinkParam(name = "feature", type = com.airbnb.deeplinkdispatch.handler.DeepLinkParamType.Query) @org.jetbrains.annotations.Nullable java.lang.String str4) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
        }

        public final boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof com.truecaller.deeplink.handlers.CloudTelephonyCampaignsDeepLinkHandler.bar)) {
                return false;
            }
            com.truecaller.deeplink.handlers.CloudTelephonyCampaignsDeepLinkHandler.bar barVar = (com.truecaller.deeplink.handlers.CloudTelephonyCampaignsDeepLinkHandler.bar) obj;
            return kotlin.jvm.internal.Intrinsics.b(this.a, barVar.a) && kotlin.jvm.internal.Intrinsics.b(this.b, barVar.b) && kotlin.jvm.internal.Intrinsics.b(this.c, barVar.c) && kotlin.jvm.internal.Intrinsics.b(this.d, barVar.d);
        }

        public final int hashCode() {
            java.lang.String str = this.a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            java.lang.String str2 = this.b;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            java.lang.String str3 = this.c;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            java.lang.String str4 = this.d;
            return hashCode3 + (str4 != null ? str4.hashCode() : 0);
        }

        public final java.lang.String toString() {
            return bar.x(ro0.f.E("Args(campaignId=", this.a, ", viewType=", this.b, ", viewId="), this.c, ", feature=", this.d, ")");
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002À\u0006\u0003"}, d2 = {"Lcom/truecaller/deeplink/handlers/CloudTelephonyCampaignsDeepLinkHandler$baz;", "", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes6.dex */
    public interface baz {
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object a(com.truecaller.deeplink.handlers.CloudTelephonyCampaignsDeepLinkHandler cloudTelephonyCampaignsDeepLinkHandler, com.truecaller.deeplink.handlers.CloudTelephonyCampaignsDeepLinkHandler.baz bazVar, android.content.Context context, com.truecaller.call_assistant.campaigns.deeplinks.external.AssistantCampaignInfo assistantCampaignInfo, ff3.qux quxVar) {
        com.truecaller.deeplink.handlers.e eVar;
        java.lang.Object obj;
        int i;
        tx.w wVar;
        cloudTelephonyCampaignsDeepLinkHandler.getClass();
        if (quxVar instanceof com.truecaller.deeplink.handlers.e) {
            eVar = (com.truecaller.deeplink.handlers.e) quxVar;
            int i2 = eVar.C;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eVar.C = i2 - Integer.MIN_VALUE;
                obj = eVar.A;
                ef3.bar barVar = ef3.bar.a;
                i = eVar.C;
                if (i == 0) {
                    if (i == 1) {
                        assistantCampaignInfo = eVar.z;
                        context = eVar.y;
                        wVar = eVar.x;
                        od.p.E(obj);
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    wVar = (tx.w) bazVar;
                    o43.qux quxVar2 = (o43.qux) wVar.Ej.get();
                    eVar.x = wVar;
                    eVar.y = context;
                    eVar.z = assistantCampaignInfo;
                    eVar.C = 1;
                    obj = quxVar2.b(eVar);
                    if (obj == barVar) {
                        return barVar;
                    }
                }
                android.content.Context context2 = context;
                com.truecaller.call_assistant.campaigns.deeplinks.external.AssistantCampaignInfo assistantCampaignInfo2 = assistantCampaignInfo;
                if (!((java.lang.Boolean) obj).booleanValue()) {
                    wi0.bar.H(wVar.z0(), context2, (java.lang.String) null, (java.lang.String) null, assistantCampaignInfo2, "deepLink", 6);
                } else {
                    wVar.z0().e(context2).d();
                }
                return kotlin.Unit.a;
            }
        }
        eVar = new com.truecaller.deeplink.handlers.e(cloudTelephonyCampaignsDeepLinkHandler, quxVar);
        obj = eVar.A;
        ef3.bar barVar2 = ef3.bar.a;
        i = eVar.C;
        if (i == 0) {
        }
        android.content.Context context22 = context;
        com.truecaller.call_assistant.campaigns.deeplinks.external.AssistantCampaignInfo assistantCampaignInfo22 = assistantCampaignInfo;
        if (!((java.lang.Boolean) obj).booleanValue()) {
        }
        return kotlin.Unit.a;
    }

    public final void handleDeepLink(android.content.Context context, java.lang.Object obj) {
        java.lang.Object obj2;
        aa1.baz bazVar;
        com.truecaller.call_assistant.campaigns.data.CampaignViewType campaignViewType;
        com.truecaller.call_assistant.campaigns.deeplinks.external.AssistantCampaignInfo assistantCampaignInfo;
        java.lang.Integer intOrNull;
        java.lang.Object obj3;
        com.truecaller.deeplink.handlers.CloudTelephonyCampaignsDeepLinkHandler.bar barVar = (com.truecaller.deeplink.handlers.CloudTelephonyCampaignsDeepLinkHandler.bar) obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "deepLinkArgs");
        tx.w wVar = (com.truecaller.deeplink.handlers.CloudTelephonyCampaignsDeepLinkHandler.baz) f40.d0.z(context, com.truecaller.deeplink.handlers.CloudTelephonyCampaignsDeepLinkHandler.baz.class);
        nu1.f1 f1Var = aa1.baz.b;
        java.lang.String str = barVar.d;
        f1Var.getClass();
        if (str == null) {
            bazVar = null;
        } else {
            java.util.Iterator it = aa1.baz.d.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj2 = it.next();
                    if (((aa1.baz) obj2).a.equalsIgnoreCase(str)) {
                        break;
                    }
                } else {
                    obj2 = null;
                    break;
                }
            }
            bazVar = (aa1.baz) obj2;
        }
        if (bazVar == null) {
            wVar.z0().e(context).d();
            return;
        }
        tx.w wVar2 = wVar;
        wVar2.getClass();
        java.lang.String str2 = barVar.a;
        java.lang.String str3 = barVar.b;
        java.lang.String str4 = barVar.c;
        if (str3 != null && (intOrNull = kotlin.text.StringsKt.toIntOrNull(str3)) != null) {
            int intValue = intOrNull.intValue();
            com.truecaller.call_assistant.campaigns.data.CampaignViewType.Companion.getClass();
            java.util.Iterator it2 = com.truecaller.call_assistant.campaigns.data.CampaignViewType.getEntries().iterator();
            while (true) {
                if (it2.hasNext()) {
                    obj3 = it2.next();
                    if (((com.truecaller.call_assistant.campaigns.data.CampaignViewType) obj3).getCode() == intValue) {
                        break;
                    }
                } else {
                    obj3 = null;
                    break;
                }
            }
            campaignViewType = (com.truecaller.call_assistant.campaigns.data.CampaignViewType) obj3;
        } else {
            campaignViewType = null;
        }
        if (str2 != null && !kotlin.text.StringsKt.X(str2) && campaignViewType != null && str4 != null && !kotlin.text.StringsKt.X(str4)) {
            assistantCampaignInfo = new com.truecaller.call_assistant.campaigns.deeplinks.external.AssistantCampaignInfo(str2, campaignViewType, str4);
        } else {
            assistantCampaignInfo = null;
        }
        fg3.h0.J(wVar2.x0(), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new com.truecaller.deeplink.handlers.d(bazVar, wVar, context, assistantCampaignInfo, null), 3);
    }
}
