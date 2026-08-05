package com.truecaller.google_login;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class h implements com.truecaller.google_login.j {
    public final boolean a;
    public final boolean b;
    public final java.lang.String c;

    public h(boolean z, boolean z2, java.lang.String str) {
        this.a = z;
        this.b = z2;
        this.c = str;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.truecaller.google_login.h)) {
            return false;
        }
        com.truecaller.google_login.h hVar = (com.truecaller.google_login.h) obj;
        return this.a == hVar.a && this.b == hVar.b && kotlin.jvm.internal.Intrinsics.b(this.c, hVar.c);
    }

    public final int hashCode() {
        int i;
        int hashCode;
        int i2 = 1237;
        if (this.a) {
            i = 1231;
        } else {
            i = 1237;
        }
        int i3 = i * 31;
        if (this.b) {
            i2 = 1231;
        }
        int i4 = (i3 + i2) * 31;
        java.lang.String str = this.c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return i4 + hashCode;
    }

    public final java.lang.String toString() {
        return bar.v(this.c, ")", bx.e1.v("BottomSheetGoogleLoginRequest(filterByAuthorizedAccounts=", ", autoSelectEnabled=", ", nonce=", this.a, this.b));
    }
}
