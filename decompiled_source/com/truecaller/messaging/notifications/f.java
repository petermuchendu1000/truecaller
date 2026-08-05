package com.truecaller.messaging.notifications;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class f {
    public final com.truecaller.messaging.data.types.Message a;
    public final com.truecaller.messaging.data.types.Conversation b;

    public f(com.truecaller.messaging.data.types.Conversation conversation, com.truecaller.messaging.data.types.Message message) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "messageFromDb");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(conversation, "conversationFromDb");
        this.a = message;
        this.b = conversation;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.truecaller.messaging.notifications.f)) {
            return false;
        }
        com.truecaller.messaging.notifications.f fVar = (com.truecaller.messaging.notifications.f) obj;
        return kotlin.jvm.internal.Intrinsics.b(this.a, fVar.a) && kotlin.jvm.internal.Intrinsics.b(this.b, fVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final java.lang.String toString() {
        return "Result(messageFromDb=" + this.a + ", conversationFromDb=" + this.b + ")";
    }
}
