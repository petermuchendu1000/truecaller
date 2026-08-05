package com.truecaller.deeplink.handlers;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class baz extends ff3.g implements kotlin.jvm.functions.Function2 {
    public final /* synthetic */ com.truecaller.deeplink.handlers.AssistantCampaignDeeplinkHandler.baz x;
    public final /* synthetic */ android.content.Context y;
    public final /* synthetic */ com.truecaller.call_assistant.campaigns.deeplinks.external.AssistantCampaignInfo z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public baz(com.truecaller.deeplink.handlers.AssistantCampaignDeeplinkHandler.baz bazVar, android.content.Context context, com.truecaller.call_assistant.campaigns.deeplinks.external.AssistantCampaignInfo assistantCampaignInfo, df3.bar barVar) {
        super(2, barVar);
        this.x = bazVar;
        this.y = context;
        this.z = assistantCampaignInfo;
    }

    public final df3.bar create(java.lang.Object obj, df3.bar barVar) {
        return new com.truecaller.deeplink.handlers.baz(this.x, this.y, this.z, barVar);
    }

    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return create((fg3.e0) obj, (df3.bar) obj2).invokeSuspend(kotlin.Unit.a);
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        ef3.bar barVar = ef3.bar.a;
        od.p.E(obj);
        tx.w wVar = this.x;
        boolean c = ((qo1.c) ((qo1.b) wVar.p8.get())).c();
        android.content.Context context = this.y;
        if (c) {
            com.truecaller.ui.b0 z0 = wVar.z0();
            com.truecaller.call_assistant.campaigns.deeplinks.external.AssistantCampaignInfo assistantCampaignInfo = this.z;
            if (assistantCampaignInfo == null) {
                wi0.bar.E(z0, context, com.truecaller.bottombar.BottomBarButtonType.ASSISTANT, "deepLink");
            } else {
                wi0.bar.F(z0, context, (java.lang.String) null, assistantCampaignInfo, 2);
            }
        } else {
            wVar.z0().e(context).d();
        }
        return kotlin.Unit.a;
    }
}
