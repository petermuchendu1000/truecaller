package com.truecaller.voicemail.domain.callstabpromo;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class qux extends ff3.g implements kotlin.jvm.functions.Function2 {
    public final /* synthetic */ com.moloco.sdk.internal.services.bidtoken.t x;
    public final /* synthetic */ java.lang.String y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qux(com.moloco.sdk.internal.services.bidtoken.t tVar, java.lang.String str, df3.bar barVar) {
        super(2, barVar);
        this.x = tVar;
        this.y = str;
    }

    public final df3.bar create(java.lang.Object obj, df3.bar barVar) {
        return new com.truecaller.voicemail.domain.callstabpromo.qux(this.x, this.y, barVar);
    }

    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return create((fg3.e0) obj, (df3.bar) obj2).invokeSuspend(kotlin.Unit.a);
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.String str = this.y;
        ef3.bar barVar = ef3.bar.a;
        od.p.E(obj);
        try {
            zg3.qux quxVar = (zg3.qux) ((kotlin.Lazy) this.x.d).getValue();
            quxVar.getClass();
            com.truecaller.voicemail.domain.callstabpromo.CallsTabVoicemailPromoRemoteConfigDTO callsTabVoicemailPromoRemoteConfigDTO = (com.truecaller.voicemail.domain.callstabpromo.CallsTabVoicemailPromoRemoteConfigDTO) quxVar.a(str, com.truecaller.voicemail.domain.callstabpromo.CallsTabVoicemailPromoRemoteConfigDTO.Companion.serializer());
            return new com.truecaller.voicemail.api.callstabpromo.CallsTabVoicemailPromoRemoteConfig(callsTabVoicemailPromoRemoteConfigDTO.getTitle(), callsTabVoicemailPromoRemoteConfigDTO.getSubtitle());
        } catch (java.lang.Exception e) {
            com.truecaller.log.AssertionUtil.reportWeirdnessButNeverCrash("CallsTabVoicemailPromoRemoteConfig parsing error " + e + " for " + str);
            return null;
        }
    }
}
