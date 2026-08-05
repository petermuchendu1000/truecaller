package com.truecaller.ads.installedapps;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public abstract class c {
    /* JADX WARN: Type inference failed for: r1v1, types: [j31.n, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, p31.bar] */
    public static java.lang.Object a(nc0.d0 d0Var) {
        okhttp3.Cache cache = new okhttp3.Cache(new java.io.File(r11.bar.a().getApplicationContext().getCacheDir(), "user-app"), 2097152L);
        ?? obj = new java.lang.Object();
        obj.b(com.truecaller.common.network.util.AuthRequirement.NONE, (java.lang.String) null);
        okhttp3.OkHttpClient.Builder b = p31.baz.b((j31.n) obj);
        b.k = cache;
        okhttp3.OkHttpClient okHttpClient = new okhttp3.OkHttpClient(b);
        ?? obj2 = new java.lang.Object();
        obj2.a(com.truecaller.common.network.util.KnownEndpoints.USERAPPS);
        obj2.g(com.truecaller.ads.installedapps.b.class);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(okHttpClient, "client");
        ((p31.bar) obj2).g = okHttpClient;
        return ((com.truecaller.ads.installedapps.b) obj2.d(com.truecaller.ads.installedapps.b.class)).a(d0Var);
    }
}
