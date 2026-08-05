package com.truecaller.google_login;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class baz implements com.truecaller.google_login.a {
    public final android.app.PendingIntent a;

    public baz(android.app.PendingIntent pendingIntent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pendingIntent, "pendingIntent");
        this.a = pendingIntent;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.truecaller.google_login.baz) && kotlin.jvm.internal.Intrinsics.b(this.a, ((com.truecaller.google_login.baz) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "ResolutionRequired(pendingIntent=" + this.a + ")";
    }
}
