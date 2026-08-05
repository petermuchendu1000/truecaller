package com.truecaller.google_login;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class l implements com.truecaller.google_login.p {
    public final java.lang.Exception a;

    public l(java.lang.Exception exc) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(exc, "exception");
        this.a = exc;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.truecaller.google_login.l) && kotlin.jvm.internal.Intrinsics.b(this.a, ((com.truecaller.google_login.l) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return bar.s("Error(exception=", ")", this.a);
    }
}
