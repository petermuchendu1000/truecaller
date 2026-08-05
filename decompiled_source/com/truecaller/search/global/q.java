package com.truecaller.search.global;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final /* synthetic */ class q implements java.util.function.BiConsumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ q(java.lang.Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.function.BiConsumer
    public final void accept(java.lang.Object obj, java.lang.Object obj2) {
        boolean z;
        boolean z2 = false;
        switch (this.a) {
            case 0:
                com.truecaller.search.global.w wVar = (com.truecaller.search.global.w) this.b;
                java.lang.Boolean bool = (java.lang.Boolean) obj;
                if (((java.lang.Throwable) obj2) == null && bool.booleanValue()) {
                    z2 = true;
                }
                new android.os.Handler(android.os.Looper.getMainLooper()).post(new bx.s0(wVar, z2, 1));
                return;
            case 1:
                dj2.z zVar = (dj2.z) this.b;
                java.lang.Boolean bool2 = (java.lang.Boolean) obj;
                java.lang.Object obj3 = zVar.a;
                if (obj3 != null) {
                    dj2.t tVar = (dj2.t) obj3;
                    java.lang.String f2 = zVar.f2();
                    com.truecaller.referrals.domain.entity.ReferralContactImpl referralContactImpl = zVar.r;
                    u03.g0 g0Var = (u03.g0) zVar.f;
                    com.truecaller.referral.BulkSmsView$PromoLayout bulkSmsView$PromoLayout = new com.truecaller.referral.BulkSmsView$PromoLayout(2131559690, new int[]{2131367033, 2131366692}, new java.lang.String[]{g0Var.h(2132022531, referralContactImpl.a), g0Var.h(2132022487, new java.lang.Object[0])}, new int[]{2131364521}, new int[]{2131232774}, null);
                    com.truecaller.referrals.api.ReferralManager$ReferralLaunchContext referralManager$ReferralLaunchContext = zVar.q;
                    java.lang.String str = zVar.b;
                    if (bool2 != null && bool2.booleanValue()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    tVar.X4(f2, referralContactImpl, bulkSmsView$PromoLayout, referralManager$ReferralLaunchContext, str, z);
                    return;
                }
                return;
            case 2:
                ((bi3.y0) this.b).a(obj2, (java.lang.String) obj);
                return;
            case 3:
                mz.b bVar = (mz.b) this.b;
                h0.k kVar = mz.h.M;
                bVar.invoke(obj, obj2);
                return;
            case 4:
                nz.l lVar = (nz.l) this.b;
                h0.k kVar2 = nz.s.d0;
                lVar.invoke(obj, obj2);
                return;
            case 5:
                p52.e eVar = (p52.e) this.b;
                p52.g gVar = p52.h.L;
                eVar.invoke(obj, obj2);
                return;
            default:
                q52.h hVar = (q52.h) this.b;
                p22.b bVar2 = q52.o.i0;
                hVar.invoke(obj, obj2);
                return;
        }
    }
}
