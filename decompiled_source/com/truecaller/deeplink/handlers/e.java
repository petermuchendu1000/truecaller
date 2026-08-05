package com.truecaller.deeplink.handlers;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class e extends ff3.qux {
    public /* synthetic */ java.lang.Object A;
    public final /* synthetic */ com.truecaller.deeplink.handlers.CloudTelephonyCampaignsDeepLinkHandler B;
    public int C;
    public tx.w x;
    public android.content.Context y;
    public com.truecaller.call_assistant.campaigns.deeplinks.external.AssistantCampaignInfo z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.truecaller.deeplink.handlers.CloudTelephonyCampaignsDeepLinkHandler cloudTelephonyCampaignsDeepLinkHandler, ff3.qux quxVar) {
        super(quxVar);
        this.B = cloudTelephonyCampaignsDeepLinkHandler;
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.A = obj;
        this.C |= Integer.MIN_VALUE;
        return com.truecaller.deeplink.handlers.CloudTelephonyCampaignsDeepLinkHandler.a(this.B, null, null, null, this);
    }
}
