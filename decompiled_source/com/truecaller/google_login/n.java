package com.truecaller.google_login;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class n implements com.truecaller.google_login.p {
    public final a7.f a;

    public n(a7.f fVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fVar, "exception");
        this.a = fVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            if (!(obj instanceof com.truecaller.google_login.n) || !this.a.equals(((com.truecaller.google_login.n) obj).a)) {
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
        return "NoCredentials(exception=" + this.a + ")";
    }
}
