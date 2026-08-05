package com.truecaller.google_login;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class qux implements com.truecaller.google_login.a {
    public final java.util.List a;
    public final java.lang.String b;

    public qux(java.util.List list, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "grantedScopes");
        this.a = list;
        this.b = str;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.truecaller.google_login.qux)) {
            return false;
        }
        com.truecaller.google_login.qux quxVar = (com.truecaller.google_login.qux) obj;
        return kotlin.jvm.internal.Intrinsics.b(this.a, quxVar.a) && kotlin.jvm.internal.Intrinsics.b(this.b, quxVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        java.lang.String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final java.lang.String toString() {
        return "ScopesGranted(grantedScopes=" + this.a + ", accessToken=" + this.b + ")";
    }
}
