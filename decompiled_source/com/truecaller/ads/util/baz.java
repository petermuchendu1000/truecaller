package com.truecaller.ads.util;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class baz implements o00.m {
    public final /* synthetic */ int a;
    public final /* synthetic */ fg3.j b;
    public final /* synthetic */ java.lang.Object c;

    public /* synthetic */ baz(java.lang.Object obj, fg3.j jVar, int i) {
        this.a = i;
        this.c = obj;
        this.b = jVar;
    }

    @Override // o00.m
    public final void J0(u90.a aVar, int i) {
        switch (this.a) {
            case 0:
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(aVar, "ad");
                ak.e1.I(this.b, new com.truecaller.ads.util.d0((u90.baz) aVar, i));
                return;
            default:
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(aVar, "ad");
                ak.e1.I(this.b, new l52.f((u90.baz) aVar, i));
                return;
        }
    }

    @Override // o00.m
    public final void Q0(int i) {
        int i2 = this.a;
        java.lang.Object obj = this.c;
        fg3.j jVar = this.b;
        switch (i2) {
            case 0:
                com.truecaller.ads.util.qux quxVar = (com.truecaller.ads.util.qux) obj;
                if (quxVar.a() == com.truecaller.ads.configmanagement.model.AdPriority.TCAdServer) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter("AcsTopPriorityManager: getGAMAd-> onAdLoaded-> " + quxVar.a().name() + " -> GAMFailedServeAdRouterIfAvailable", com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.MESSAGE_COLUMN);
                    kotlin.Unit unit = kotlin.Unit.a;
                    ak.e1.I(jVar, new com.truecaller.ads.util.b0(i));
                    return;
                }
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter("AcsTopPriorityManager: getGAMAd-> onAdLoaded-> " + quxVar.a().name() + " -> GAMFailedReqAdRouterAd", com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.MESSAGE_COLUMN);
                kotlin.Unit unit2 = kotlin.Unit.a;
                ak.e1.I(jVar, new com.truecaller.ads.util.a0(i));
                return;
            default:
                l52.q qVar = (l52.q) obj;
                if (qVar.a() == com.truecaller.ads.configmanagement.model.AdPriority.TCAdServer) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter("AcsTopPriorityManager: getGAMAd-> onAdLoaded-> " + qVar.a().name() + " -> GAMFailedServeAdRouterIfAvailable", com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.MESSAGE_COLUMN);
                    kotlin.Unit unit3 = kotlin.Unit.a;
                    ak.e1.I(jVar, new l52.d(i));
                    return;
                }
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter("AcsTopPriorityManager: getGAMAd-> onAdLoaded-> " + qVar.a().name() + " -> GAMFailedReqAdRouterAd", com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.MESSAGE_COLUMN);
                kotlin.Unit unit4 = kotlin.Unit.a;
                ak.e1.I(jVar, new l52.c(i));
                return;
        }
    }

    @Override // o00.m
    public final void onAdLoaded() {
        int i = this.a;
        fg3.j jVar = this.b;
        java.lang.Object obj = this.c;
        switch (i) {
            case 0:
                uf.qux.r("AcsTopPriorityManager: getGAMAd-> onAdLoaded-> ", ((com.truecaller.ads.util.qux) obj).a().name(), com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.MESSAGE_COLUMN);
                kotlin.Unit unit = kotlin.Unit.a;
                ak.e1.I(jVar, com.truecaller.ads.util.c0.a);
                return;
            default:
                uf.qux.r("AcsTopPriorityManager: getGAMAd-> onAdLoaded-> ", ((l52.q) obj).a().name(), com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.MESSAGE_COLUMN);
                kotlin.Unit unit2 = kotlin.Unit.a;
                ak.e1.I(jVar, l52.e.a);
                return;
        }
    }
}
