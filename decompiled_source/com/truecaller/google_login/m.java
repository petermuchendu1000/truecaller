package com.truecaller.google_login;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class m implements com.truecaller.google_login.p {
    public final a7.d a;

    public m(a7.d dVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dVar, "exception");
        this.a = dVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            if (!(obj instanceof com.truecaller.google_login.m) || !this.a.equals(((com.truecaller.google_login.m) obj).a)) {
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
        return "Interrupted(exception=" + this.a + ")";
    }
}
