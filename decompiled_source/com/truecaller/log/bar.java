package com.truecaller.log;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class bar {
    public static final java.util.concurrent.atomic.AtomicLong a = new java.util.concurrent.atomic.AtomicLong(0);
    public static final java.util.concurrent.atomic.AtomicLong b = new java.util.concurrent.atomic.AtomicLong(0);
    public static final kotlin.Lazy c = kotlin.LazyKt.lazy(new com.truecaller.ads.util.u0(16));

    public static void a(java.lang.String str, boolean z, java.lang.Boolean bool, java.util.Map map) {
        long j;
        long incrementAndGet;
        java.lang.String str2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "component");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "extras");
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        long andSet = a.getAndSet(elapsedRealtime);
        long j2 = 0;
        if (andSet > 0) {
            j = elapsedRealtime - andSet;
        } else {
            j = -1;
        }
        java.util.concurrent.atomic.AtomicLong atomicLong = b;
        if (0 <= j && j < 101) {
            incrementAndGet = atomicLong.get();
        } else {
            incrementAndGet = atomicLong.incrementAndGet();
        }
        com.google.firebase.crashlytics.c u = o82.a.u();
        if (u != null) {
            u.s("rpg_component", str);
        }
        if (u != null) {
            if (bool == null || (str2 = java.lang.String.valueOf(bool.booleanValue())) == null) {
                str2 = "n/a";
            }
            u.s("rpg_attached", str2);
        }
        if (u != null) {
            u.t("rpg_crash", z);
        }
        if (u != null) {
            u.r("rpg_interval_ms", j);
        }
        if (u != null) {
            u.r("rpg_batch", incrementAndGet);
        }
        kotlin.Lazy lazy = c;
        if (u != null) {
            u.s("rpg_wv_version", (java.lang.String) lazy.getValue());
        }
        for (java.util.Map.Entry entry : map.entrySet()) {
            java.lang.String str3 = (java.lang.String) entry.getKey();
            java.lang.String str4 = (java.lang.String) entry.getValue();
            if (u != null) {
                u.s("rpg_" + str3, str4);
                j2 = j2;
            }
        }
        long j3 = j2;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.String str5 = (java.lang.String) lazy.getValue();
        java.lang.StringBuilder t = ax1.bar.t("component=", str, ", crash=", ", wvVersion=", z);
        t.append(str5);
        t.append(", batch=");
        t.append(incrementAndGet);
        sb.append(t.toString());
        if (bool != null) {
            sb.append(", attached=" + bool);
        }
        if (j > j3) {
            sb.append(", interval=" + j + "ms");
        }
        for (java.util.Map.Entry entry2 : map.entrySet()) {
            sb.append(", " + ((java.lang.String) entry2.getKey()) + "=" + ((java.lang.String) entry2.getValue()));
        }
        java.lang.String sb3 = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sb3, "message");
        o82.a.C(new java.lang.Exception(sb3));
    }
}
