package com.truecaller.messaging.transport.truehelper;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/truecaller/messaging/transport/truehelper/ChatCompletion;", "", "message", "Lcom/truecaller/messaging/transport/truehelper/TrueHelperMessage;", "<init>", "(Lcom/truecaller/messaging/transport/truehelper/TrueHelperMessage;)V", "getMessage", "()Lcom/truecaller/messaging/transport/truehelper/TrueHelperMessage;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final /* data */ class ChatCompletion {
    public static final int $stable = 0;

    @org.jetbrains.annotations.NotNull
    private final com.truecaller.messaging.transport.truehelper.TrueHelperMessage message;

    public ChatCompletion(@org.jetbrains.annotations.NotNull com.truecaller.messaging.transport.truehelper.TrueHelperMessage trueHelperMessage) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(trueHelperMessage, "message");
        this.message = trueHelperMessage;
    }

    public static /* synthetic */ com.truecaller.messaging.transport.truehelper.ChatCompletion copy$default(com.truecaller.messaging.transport.truehelper.ChatCompletion chatCompletion, com.truecaller.messaging.transport.truehelper.TrueHelperMessage trueHelperMessage, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            trueHelperMessage = chatCompletion.message;
        }
        return chatCompletion.copy(trueHelperMessage);
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component1, reason: from getter */
    public final com.truecaller.messaging.transport.truehelper.TrueHelperMessage getMessage() {
        return this.message;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.messaging.transport.truehelper.ChatCompletion copy(@org.jetbrains.annotations.NotNull com.truecaller.messaging.transport.truehelper.TrueHelperMessage message) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        return new com.truecaller.messaging.transport.truehelper.ChatCompletion(message);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.truecaller.messaging.transport.truehelper.ChatCompletion) && kotlin.jvm.internal.Intrinsics.b(this.message, ((com.truecaller.messaging.transport.truehelper.ChatCompletion) other).message);
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.messaging.transport.truehelper.TrueHelperMessage getMessage() {
        return this.message;
    }

    public int hashCode() {
        return this.message.hashCode();
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return "ChatCompletion(message=" + this.message + ")";
    }
}
