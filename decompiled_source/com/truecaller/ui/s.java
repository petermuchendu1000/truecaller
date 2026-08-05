package com.truecaller.ui;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class s {
    public final java.lang.String a;
    public final java.lang.String b;
    public final java.lang.String c;

    public s(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "userId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "fullName");
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.truecaller.ui.s)) {
            return false;
        }
        com.truecaller.ui.s sVar = (com.truecaller.ui.s) obj;
        return kotlin.jvm.internal.Intrinsics.b(this.a, sVar.a) && kotlin.jvm.internal.Intrinsics.b(this.b, sVar.b) && kotlin.jvm.internal.Intrinsics.b(this.c, sVar.c);
    }

    public final int hashCode() {
        int hashCode;
        int e = ax1.bar.e(this.a.hashCode() * 31, 31, this.b);
        java.lang.String str = this.c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return e + hashCode;
    }

    public final java.lang.String toString() {
        return bar.v(this.c, ")", ro0.f.E("FeedbackUi(userId=", this.a, ", fullName=", this.b, ", email="));
    }
}
