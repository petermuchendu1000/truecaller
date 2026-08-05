package com.truecaller.google_login;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class bar implements com.truecaller.google_login.a {
    public final java.lang.Exception a;

    public bar(java.lang.Exception exc) {
        this.a = exc;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.truecaller.google_login.bar) && kotlin.jvm.internal.Intrinsics.b(this.a, ((com.truecaller.google_login.bar) obj).a);
    }

    public final int hashCode() {
        java.lang.Exception exc = this.a;
        if (exc == null) {
            return 0;
        }
        return exc.hashCode();
    }

    public final java.lang.String toString() {
        return bar.s("Error(exception=", ")", this.a);
    }
}
