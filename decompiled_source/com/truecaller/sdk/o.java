package com.truecaller.sdk;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class o implements wj3.d {
    public static void a(com.truecaller.android.sdk.PartnerInformation partnerInformation, fp2.baz bazVar) {
        ((com.truecaller.sdk.p) p40.l.k(com.truecaller.common.network.util.KnownEndpoints.API, com.truecaller.sdk.p.class)).a(partnerInformation.partnerKey, partnerInformation.reqNonce).d(bazVar);
    }

    public static void b(com.truecaller.android.sdk.PartnerInformation partnerInformation, java.lang.String str) {
        ((com.truecaller.sdk.q) p40.l.k(com.truecaller.common.network.util.KnownEndpoints.API, com.truecaller.sdk.q.class)).a(partnerInformation.partnerKey, partnerInformation.reqNonce).d(new com.google.android.gms.internal.auth.e(25, str, partnerInformation));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, wj3.d] */
    public static void c(com.truecaller.android.sdk.PartnerInformation partnerInformation) {
        ((com.truecaller.sdk.r) p40.l.k(com.truecaller.common.network.util.KnownEndpoints.API, com.truecaller.sdk.r.class)).a(partnerInformation.partnerKey, partnerInformation.reqNonce).d((wj3.d) new java.lang.Object());
    }

    public static void d(com.truecaller.sdk.push.PushAppData pushAppData, fp2.d dVar) {
        ((com.truecaller.sdk.s) p40.l.k(com.truecaller.common.network.util.KnownEndpoints.API, com.truecaller.sdk.s.class)).a(pushAppData.a).d(dVar);
    }

    public static void e(com.truecaller.sdk.push.PushAppData pushAppData) {
        ((com.truecaller.sdk.t) p40.l.k(com.truecaller.common.network.util.KnownEndpoints.API, com.truecaller.sdk.t.class)).a(pushAppData.a).d(new com.truecaller.sdk.n(pushAppData));
    }

    public void h(wj3.a aVar, java.lang.Throwable th) {
        o82.a.C(th);
    }

    public void g(wj3.a aVar, wj3.k0 k0Var) {
    }
}
