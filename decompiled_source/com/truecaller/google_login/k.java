package com.truecaller.google_login;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class k implements com.truecaller.google_login.p {
    public final a7.a a;

    public k(a7.a aVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(aVar, "exception");
        this.a = aVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            if (!(obj instanceof com.truecaller.google_login.k) || !this.a.equals(((com.truecaller.google_login.k) obj).a)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "Cancelled(exception=" + this.a + ")";
    }
}
