package com.truecaller.google_login;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class o implements com.truecaller.google_login.p {
    public final com.truecaller.google_login.GoogleProfileData a;

    public o(com.truecaller.google_login.GoogleProfileData googleProfileData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(googleProfileData, "googleProfileData");
        this.a = googleProfileData;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.truecaller.google_login.o) && kotlin.jvm.internal.Intrinsics.b(this.a, ((com.truecaller.google_login.o) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "Success(googleProfileData=" + this.a + ")";
    }
}
