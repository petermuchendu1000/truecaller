package com.truecaller.messaging.notifications;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class c extends com.truecaller.messaging.notifications.e {
    public final com.truecaller.messaging.notifications.f a;

    public c(com.truecaller.messaging.notifications.f fVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fVar, "result");
        this.a = fVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.truecaller.messaging.notifications.c) && kotlin.jvm.internal.Intrinsics.b(this.a, ((com.truecaller.messaging.notifications.c) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "Success(result=" + this.a + ")";
    }
}
