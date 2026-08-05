package com.truecaller.ads.util;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class r0 implements fg3.e0 {
    public final android.content.Context a;
    public final kotlin.coroutines.CoroutineContext b;
    public final qc3.bar c;
    public final qc3.bar d;
    public final qc3.bar e;
    public final qc3.bar f;

    public r0(android.content.Context context, kotlin.coroutines.CoroutineContext coroutineContext, qc3.bar barVar, qc3.bar barVar2, qc3.bar barVar3, qc3.bar barVar4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineContext, "uiContext");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "networkUtil");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar2, "neoAdsRulesManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar3, "acsAdCacheManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar4, "callIdHelper");
        this.a = context;
        this.b = coroutineContext;
        this.c = barVar;
        this.d = barVar2;
        this.e = barVar3;
        this.f = barVar4;
    }

    public final void a(com.truecaller.data.entity.HistoryEvent historyEvent) {
        java.lang.String s0;
        com.truecaller.ads.adsrules.model.ContactType contactType;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(historyEvent, "historyEvent");
        com.truecaller.ads.adsrules.model.NeoRulesRequest neoRulesRequest = new com.truecaller.ads.adsrules.model.NeoRulesRequest("AFTERCALL");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(historyEvent, "<this>");
        com.truecaller.data.entity.Contact contact = historyEvent.h;
        if (contact == null) {
            s0 = gj.m.s0(0);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(s0, "toString(...)");
        } else {
            s0 = gj.m.s0(m03.r.l(contact));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(s0, "toString(...)");
        }
        neoRulesRequest.setBadge(s0);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(historyEvent, "<this>");
        neoRulesRequest.setDirection(java.lang.String.valueOf(historyEvent.t));
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(historyEvent, "<this>");
        com.truecaller.data.entity.Contact contact2 = historyEvent.h;
        if (contact2 == null) {
            contactType = com.truecaller.ads.adsrules.model.ContactType.UNKNOWN;
        } else if (contact2.Q()) {
            contactType = com.truecaller.ads.adsrules.model.ContactType.PHONEBOOK;
        } else if (contact2.X()) {
            contactType = com.truecaller.ads.adsrules.model.ContactType.SPAM;
        } else {
            contactType = com.truecaller.ads.adsrules.model.ContactType.NON_PHONEBOOK;
        }
        neoRulesRequest.setContact(contactType);
        neoRulesRequest.setNumber(historyEvent.d);
        neoRulesRequest.setCallId(((e00.qux) this.f.get()).a);
        q10.o oVar = (q10.o) this.d.get();
        oVar.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(neoRulesRequest, "request");
        fg3.h0.J((fg3.e0) oVar.i.getValue(), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new p91.d(oVar, neoRulesRequest, (df3.bar) null, 23), 3);
    }

    public final kotlin.coroutines.CoroutineContext getCoroutineContext() {
        return this.b;
    }
}
