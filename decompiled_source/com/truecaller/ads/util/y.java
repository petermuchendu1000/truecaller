package com.truecaller.ads.util;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class y extends com.truecaller.ads.util.z {
    public final h10.b a;

    public y(h10.b bVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bVar, "ad");
        this.a = bVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.truecaller.ads.util.y) && kotlin.jvm.internal.Intrinsics.b(this.a, ((com.truecaller.ads.util.y) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "RequestGamAdOverAdRouter(ad=" + this.a + ")";
    }
}
