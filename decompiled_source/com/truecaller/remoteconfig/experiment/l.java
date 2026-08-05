package com.truecaller.remoteconfig.experiment;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final /* synthetic */ class l implements kotlin.jvm.functions.Function0 {
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, p31.bar] */
    /* JADX WARN: Type inference failed for: r2v0, types: [j31.n, java.lang.Object] */
    public final java.lang.Object invoke() {
        ?? obj = new java.lang.Object();
        obj.a(com.truecaller.common.network.util.KnownEndpoints.FEATURE_FLAGS);
        obj.g(com.truecaller.remoteconfig.experiment.m.class);
        ?? obj2 = new java.lang.Object();
        obj2.b(com.truecaller.common.network.util.AuthRequirement.OPTIONAL, (java.lang.String) null);
        obj2.d();
        okhttp3.OkHttpClient a = p31.baz.a((j31.n) obj2);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(a, "client");
        ((p31.bar) obj).g = a;
        return (com.truecaller.remoteconfig.experiment.m) obj.d(com.truecaller.remoteconfig.experiment.m.class);
    }
}
