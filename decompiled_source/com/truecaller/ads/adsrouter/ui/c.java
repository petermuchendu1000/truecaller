package com.truecaller.ads.adsrouter.ui;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class c implements h10.a {
    public final a80.j0 a;
    public final transient s70.e b;
    public final java.lang.String c;
    public final java.lang.String d;
    public final com.truecaller.ads.adsrouter.ui.AdType e;

    public c(a80.j0 j0Var, s70.e eVar) {
        java.lang.String str;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(j0Var, "ad");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eVar, "sdkListener");
        this.a = j0Var;
        this.b = eVar;
        g10.m0 m0Var = j0Var.a;
        this.c = (m0Var == null || (str = m0Var.b) == null) ? t.c.p("toString(...)") : str;
        this.d = j0Var.e;
        this.e = com.truecaller.ads.adsrouter.ui.AdType.UNIFIED_TAS;
    }

    @Override // h10.a
    public final java.lang.String C() {
        return null;
    }

    @Override // h10.a
    public final /* bridge */ java.lang.String D() {
        return "EMPTY";
    }

    @Override // h10.a
    public final long a() {
        return this.a.d;
    }

    @Override // h10.a
    public final java.lang.String b() {
        return this.c;
    }

    @Override // h10.a
    public final /* bridge */ boolean c() {
        return false;
    }

    @Override // h10.a
    public final /* bridge */ com.truecaller.ads.adsrouter.model.Theme d() {
        return null;
    }

    @Override // h10.a
    public final java.lang.String e() {
        return this.d;
    }

    @Override // h10.a
    public final /* bridge */ boolean g() {
        return false;
    }

    @Override // h10.a
    public final com.truecaller.ads.adsrouter.ui.AdSource getAdSource() {
        this.a.getClass();
        return com.truecaller.ads.adsrouter.ui.AdSource.Network.b;
    }

    @Override // h10.a
    public final com.truecaller.ads.adsrouter.ui.AdType getAdType() {
        return this.e;
    }

    @Override // h10.a
    public final /* bridge */ java.lang.String getAdvertiserName() {
        return null;
    }

    @Override // h10.a
    public final /* bridge */ java.lang.String getGroupId() {
        return null;
    }

    @Override // h10.a
    public final boolean i() {
        return false;
    }

    @Override // h10.a
    public final /* bridge */ com.truecaller.ads.adsrouter.ui.AcsPremiumCreativeType j() {
        return null;
    }

    @Override // h10.a
    public final /* bridge */ com.truecaller.ads.adsrouter.model.CreativeBehaviour l() {
        return null;
    }

    @Override // h10.a
    public final /* bridge */ java.lang.String m() {
        return null;
    }

    @Override // h10.a
    public final void n() {
        a80.j0 j0Var = this.a;
        this.b.p(es.baz.D(j0Var, this.d, bf0.s2.M(j0Var.g)));
    }

    @Override // h10.a
    public final h10.b2 q() {
        return new h10.b2("TAS", this.a.b, 9);
    }

    @Override // h10.a
    public final /* bridge */ void r(java.lang.String str, java.lang.String str2) {
        h0.b.x(str);
    }

    @Override // h10.a
    public final void recordImpression() {
        a80.j0 j0Var = this.a;
        this.b.o(es.baz.D(j0Var, this.d, bf0.s2.M(j0Var.g)));
    }

    @Override // h10.a
    public final /* bridge */ com.truecaller.ads.mediation.helper.RtbDataHelperImpl$RtbAdData u() {
        return null;
    }

    @Override // h10.a
    public final /* bridge */ com.truecaller.ads.adsrouter.model.Tracking v() {
        return null;
    }

    @Override // h10.a
    public final com.truecaller.ads.adsrouter.model.RedirectBehaviour x() {
        return null;
    }

    @Override // h10.a
    public final /* bridge */ java.lang.String y() {
        return null;
    }

    @Override // h10.a
    public final /* bridge */ java.lang.String z() {
        return null;
    }
}
