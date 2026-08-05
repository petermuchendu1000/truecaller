package com.truecaller.messaging.notifications;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class a extends com.truecaller.messaging.notifications.e {
    public final java.lang.Throwable a;

    public a(java.lang.Throwable th) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(th, "throwable");
        this.a = th;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.truecaller.messaging.notifications.a) && kotlin.jvm.internal.Intrinsics.b(this.a, ((com.truecaller.messaging.notifications.a) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "Error(throwable=" + this.a + ")";
    }
}
