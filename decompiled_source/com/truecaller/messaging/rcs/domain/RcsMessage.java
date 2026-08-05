package com.truecaller.messaging.rcs.domain;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/truecaller/messaging/rcs/domain/RcsMessage;", "", "message", "Lcom/truecaller/messaging/rcs/domain/RCSGeneralPurposeMessage;", "<init>", "(Lcom/truecaller/messaging/rcs/domain/RCSGeneralPurposeMessage;)V", "getMessage", "()Lcom/truecaller/messaging/rcs/domain/RCSGeneralPurposeMessage;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final /* data */ class RcsMessage {
    public static final int $stable = 0;

    @org.jetbrains.annotations.NotNull
    private final com.truecaller.messaging.rcs.domain.RCSGeneralPurposeMessage message;

    public RcsMessage(@org.jetbrains.annotations.NotNull com.truecaller.messaging.rcs.domain.RCSGeneralPurposeMessage rCSGeneralPurposeMessage) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rCSGeneralPurposeMessage, "message");
        this.message = rCSGeneralPurposeMessage;
    }

    public static /* synthetic */ com.truecaller.messaging.rcs.domain.RcsMessage copy$default(com.truecaller.messaging.rcs.domain.RcsMessage rcsMessage, com.truecaller.messaging.rcs.domain.RCSGeneralPurposeMessage rCSGeneralPurposeMessage, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            rCSGeneralPurposeMessage = rcsMessage.message;
        }
        return rcsMessage.copy(rCSGeneralPurposeMessage);
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component1, reason: from getter */
    public final com.truecaller.messaging.rcs.domain.RCSGeneralPurposeMessage getMessage() {
        return this.message;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.messaging.rcs.domain.RcsMessage copy(@org.jetbrains.annotations.NotNull com.truecaller.messaging.rcs.domain.RCSGeneralPurposeMessage message) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        return new com.truecaller.messaging.rcs.domain.RcsMessage(message);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.truecaller.messaging.rcs.domain.RcsMessage) && kotlin.jvm.internal.Intrinsics.b(this.message, ((com.truecaller.messaging.rcs.domain.RcsMessage) other).message);
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.messaging.rcs.domain.RCSGeneralPurposeMessage getMessage() {
        return this.message;
    }

    public int hashCode() {
        return this.message.hashCode();
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return "RcsMessage(message=" + this.message + ")";
    }
}
