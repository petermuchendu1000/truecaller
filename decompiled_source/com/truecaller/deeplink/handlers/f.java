package com.truecaller.deeplink.handlers;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class f extends ff3.g implements kotlin.jvm.functions.Function2 {
    public final /* synthetic */ android.content.Context A;
    public final /* synthetic */ com.truecaller.deeplink.handlers.VoicemailTabDeepLinkHandler.bar B;
    public o43.qux x;
    public int y;
    public final /* synthetic */ tx.w z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(tx.w wVar, android.content.Context context, com.truecaller.deeplink.handlers.VoicemailTabDeepLinkHandler.bar barVar, df3.bar barVar2) {
        super(2, barVar2);
        this.z = wVar;
        this.A = context;
        this.B = barVar;
    }

    public final df3.bar create(java.lang.Object obj, df3.bar barVar) {
        return new com.truecaller.deeplink.handlers.f(this.z, this.A, this.B, barVar);
    }

    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return create((fg3.e0) obj, (df3.bar) obj2).invokeSuspend(kotlin.Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0068, code lost:
    
        if (r15 == r0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006a, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0038, code lost:
    
        if (r15 == r0) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        o43.qux quxVar;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        ef3.bar barVar = ef3.bar.a;
        int i = this.y;
        com.truecaller.deeplink.handlers.VoicemailTabDeepLinkHandler.bar barVar2 = this.B;
        tx.w wVar = this.z;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    od.p.E(obj);
                    if (!((java.lang.Boolean) obj).booleanValue()) {
                        com.truecaller.ui.b0 z0 = wVar.z0();
                        java.lang.String str4 = barVar2.c;
                        if (str4 == null) {
                            str3 = "deepLink";
                        } else {
                            str3 = str4;
                        }
                        wi0.bar.H(z0, this.A, (java.lang.String) null, (java.lang.String) null, (com.truecaller.call_assistant.campaigns.deeplinks.external.AssistantCampaignInfo) null, str3, 14);
                        return kotlin.Unit.a;
                    }
                    com.truecaller.ui.b0 z03 = wVar.z0();
                    java.lang.String str5 = barVar2.a;
                    java.lang.String str6 = barVar2.b;
                    str = barVar2.c;
                    if (str != null) {
                        str2 = "deepLink";
                    } else {
                        str2 = str;
                    }
                    wi0.bar.H(z03, this.A, str5, str6, (com.truecaller.call_assistant.campaigns.deeplinks.external.AssistantCampaignInfo) null, str2, 8);
                    return kotlin.Unit.a;
                }
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            quxVar = this.x;
            od.p.E(obj);
        } else {
            od.p.E(obj);
            quxVar = (o43.qux) wVar.Ej.get();
            this.x = quxVar;
            this.y = 1;
            obj = quxVar.b(this);
        }
        if (!((java.lang.Boolean) obj).booleanValue()) {
            wVar.z0().e(this.A).d();
            return kotlin.Unit.a;
        }
        if (kotlin.collections.CollectionsKt.N(com.truecaller.deeplink.handlers.VoicemailTabDeepLinkHandler.b, barVar2.a)) {
            this.x = null;
            this.y = 2;
            obj = quxVar.c(this);
        }
        com.truecaller.ui.b0 z032 = wVar.z0();
        java.lang.String str52 = barVar2.a;
        java.lang.String str62 = barVar2.b;
        str = barVar2.c;
        if (str != null) {
        }
        wi0.bar.H(z032, this.A, str52, str62, (com.truecaller.call_assistant.campaigns.deeplinks.external.AssistantCampaignInfo) null, str2, 8);
        return kotlin.Unit.a;
    }
}
