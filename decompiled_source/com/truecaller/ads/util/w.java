package com.truecaller.ads.util;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class w extends com.truecaller.ads.util.z {
    public final z00.bar a;

    public w(z00.bar barVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "errorAdRouter");
        this.a = barVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.truecaller.ads.util.w) && kotlin.jvm.internal.Intrinsics.b(this.a, ((com.truecaller.ads.util.w) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "OnAdRouterAdFailed(errorAdRouter=" + this.a + ")";
    }
}
