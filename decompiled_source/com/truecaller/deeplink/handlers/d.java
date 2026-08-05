package com.truecaller.deeplink.handlers;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class d extends ff3.g implements kotlin.jvm.functions.Function2 {
    public final /* synthetic */ android.content.Context A;
    public final /* synthetic */ com.truecaller.call_assistant.campaigns.deeplinks.external.AssistantCampaignInfo B;
    public int x;
    public final /* synthetic */ aa1.baz y;
    public final /* synthetic */ com.truecaller.deeplink.handlers.CloudTelephonyCampaignsDeepLinkHandler.baz z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(aa1.baz bazVar, com.truecaller.deeplink.handlers.CloudTelephonyCampaignsDeepLinkHandler.baz bazVar2, android.content.Context context, com.truecaller.call_assistant.campaigns.deeplinks.external.AssistantCampaignInfo assistantCampaignInfo, df3.bar barVar) {
        super(2, barVar);
        this.y = bazVar;
        this.z = bazVar2;
        this.A = context;
        this.B = assistantCampaignInfo;
    }

    public final df3.bar create(java.lang.Object obj, df3.bar barVar) {
        return new com.truecaller.deeplink.handlers.d(this.y, this.z, this.A, this.B, barVar);
    }

    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return create((fg3.e0) obj, (df3.bar) obj2).invokeSuspend(kotlin.Unit.a);
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        ef3.bar barVar = ef3.bar.a;
        int i = this.x;
        if (i != 0) {
            if (i == 1) {
                od.p.E(obj);
            } else {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            od.p.E(obj);
            int ordinal = this.y.ordinal();
            android.content.Context context = this.A;
            com.truecaller.call_assistant.campaigns.deeplinks.external.AssistantCampaignInfo assistantCampaignInfo = this.B;
            tx.w wVar = this.z;
            if (ordinal != 0) {
                if (ordinal == 1) {
                    com.truecaller.deeplink.handlers.CloudTelephonyCampaignsDeepLinkHandler.INSTANCE.getClass();
                    tx.w wVar2 = wVar;
                    if (((qo1.c) ((qo1.b) wVar2.p8.get())).c()) {
                        com.truecaller.ui.b0 z0 = wVar2.z0();
                        if (assistantCampaignInfo == null) {
                            wi0.bar.E(z0, context, com.truecaller.bottombar.BottomBarButtonType.ASSISTANT, "deepLink");
                        } else {
                            wi0.bar.F(z0, context, (java.lang.String) null, assistantCampaignInfo, 2);
                        }
                    } else {
                        wVar2.z0().e(context).d();
                    }
                } else {
                    throw new java.lang.RuntimeException();
                }
            } else {
                com.truecaller.deeplink.handlers.CloudTelephonyCampaignsDeepLinkHandler cloudTelephonyCampaignsDeepLinkHandler = com.truecaller.deeplink.handlers.CloudTelephonyCampaignsDeepLinkHandler.INSTANCE;
                this.x = 1;
                if (com.truecaller.deeplink.handlers.CloudTelephonyCampaignsDeepLinkHandler.a(cloudTelephonyCampaignsDeepLinkHandler, wVar, context, assistantCampaignInfo, this) == barVar) {
                    return barVar;
                }
            }
        }
        return kotlin.Unit.a;
    }
}
