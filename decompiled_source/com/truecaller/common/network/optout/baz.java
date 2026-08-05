package com.truecaller.common.network.optout;

/* loaded from: /home/user/tc_decoded/classes2.dex */
public final class baz implements com.truecaller.common.network.optout.bar {
    public final com.truecaller.common.network.optout.OptOutRestAdapter$OptOutsDto a() {
        wj3.k0 r = t41.p.r(com.truecaller.common.network.optout.b.a().b());
        if (r != null) {
            return (com.truecaller.common.network.optout.OptOutRestAdapter$OptOutsDto) r.b;
        }
        return null;
    }

    public final boolean b() {
        java.lang.Boolean bool;
        wj3.k0 r = t41.p.r(com.truecaller.common.network.optout.b.a().c("showAds"));
        if (r != null) {
            bool = java.lang.Boolean.valueOf(r.a.k());
        } else {
            bool = null;
        }
        return yp.d0.D(bool);
    }

    public final boolean c() {
        java.lang.Boolean bool;
        wj3.k0 r = t41.p.r(com.truecaller.common.network.optout.b.a().c("dm"));
        if (r != null) {
            bool = java.lang.Boolean.valueOf(r.a.k());
        } else {
            bool = null;
        }
        return yp.d0.D(bool);
    }

    public final boolean d() {
        java.lang.Boolean bool;
        wj3.k0 r = t41.p.r(com.truecaller.common.network.optout.b.a().c("ads"));
        if (r != null) {
            bool = java.lang.Boolean.valueOf(r.a.k());
        } else {
            bool = null;
        }
        return yp.d0.D(bool);
    }

    public final boolean e() {
        java.lang.Boolean bool;
        wj3.k0 r = t41.p.r(com.truecaller.common.network.optout.b.a().a("showAds"));
        if (r != null) {
            bool = java.lang.Boolean.valueOf(r.a.k());
        } else {
            bool = null;
        }
        return yp.d0.D(bool);
    }

    public final boolean f() {
        java.lang.Boolean bool;
        wj3.k0 r = t41.p.r(com.truecaller.common.network.optout.b.a().a("dm"));
        if (r != null) {
            bool = java.lang.Boolean.valueOf(r.a.k());
        } else {
            bool = null;
        }
        return yp.d0.D(bool);
    }

    public final boolean g() {
        java.lang.Boolean bool;
        wj3.k0 r = t41.p.r(com.truecaller.common.network.optout.b.a().a("ads"));
        if (r != null) {
            bool = java.lang.Boolean.valueOf(r.a.k());
        } else {
            bool = null;
        }
        return yp.d0.D(bool);
    }
}
