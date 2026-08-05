package com.truecaller.blockinglevel.presentation;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class b0 implements com.truecaller.blockinglevel.presentation.d0 {
    public final i82.r a;

    public b0(com.truecaller.premium.PremiumLaunchContext.Static r2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, "launchContext");
        this.a = r2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.truecaller.blockinglevel.presentation.b0) && kotlin.jvm.internal.Intrinsics.b(this.a, ((com.truecaller.blockinglevel.presentation.b0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "OpenPremium(launchContext=" + this.a + ")";
    }
}
