package com.truecaller.messaging.event_sender.model;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0019\u001a\u00020\tH\u0016J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001d\u001a\u00020\tHÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J;\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000e¨\u0006\""}, d2 = {"Lcom/truecaller/messaging/event_sender/model/RetryEvent;", "", "id", "", "type", "Lcom/truecaller/messaging/event_sender/model/RetryEventType;", "content", "", "retryCount", "", "attemptTimestamp", "<init>", "(JLcom/truecaller/messaging/event_sender/model/RetryEventType;[BIJ)V", "getId", "()J", "getType", "()Lcom/truecaller/messaging/event_sender/model/RetryEventType;", "getContent", "()[B", "getRetryCount", "()I", "getAttemptTimestamp", "equals", "", "other", "hashCode", "component1", "component2", "component3", "component4", "component5", "copy", "toString", "", "messaging-event-sender_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final /* data */ class RetryEvent {
    private final long attemptTimestamp;

    @org.jetbrains.annotations.NotNull
    private final byte[] content;
    private final long id;
    private final int retryCount;

    @org.jetbrains.annotations.NotNull
    private final com.truecaller.messaging.event_sender.model.RetryEventType type;

    public RetryEvent(long j, @org.jetbrains.annotations.NotNull com.truecaller.messaging.event_sender.model.RetryEventType retryEventType, @org.jetbrains.annotations.NotNull byte[] bArr, int i, long j2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(retryEventType, "type");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "content");
        this.id = j;
        this.type = retryEventType;
        this.content = bArr;
        this.retryCount = i;
        this.attemptTimestamp = j2;
    }

    public static /* synthetic */ com.truecaller.messaging.event_sender.model.RetryEvent copy$default(com.truecaller.messaging.event_sender.model.RetryEvent retryEvent, long j, com.truecaller.messaging.event_sender.model.RetryEventType retryEventType, byte[] bArr, int i, long j2, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            j = retryEvent.id;
        }
        long j3 = j;
        if ((i2 & 2) != 0) {
            retryEventType = retryEvent.type;
        }
        com.truecaller.messaging.event_sender.model.RetryEventType retryEventType2 = retryEventType;
        if ((i2 & 4) != 0) {
            bArr = retryEvent.content;
        }
        byte[] bArr2 = bArr;
        if ((i2 & 8) != 0) {
            i = retryEvent.retryCount;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            j2 = retryEvent.attemptTimestamp;
        }
        return retryEvent.copy(j3, retryEventType2, bArr2, i3, j2);
    }

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component2, reason: from getter */
    public final com.truecaller.messaging.event_sender.model.RetryEventType getType() {
        return this.type;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component3, reason: from getter */
    public final byte[] getContent() {
        return this.content;
    }

    /* renamed from: component4, reason: from getter */
    public final int getRetryCount() {
        return this.retryCount;
    }

    /* renamed from: component5, reason: from getter */
    public final long getAttemptTimestamp() {
        return this.attemptTimestamp;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.messaging.event_sender.model.RetryEvent copy(long id, @org.jetbrains.annotations.NotNull com.truecaller.messaging.event_sender.model.RetryEventType type, @org.jetbrains.annotations.NotNull byte[] content, int retryCount, long attemptTimestamp) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "type");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(content, "content");
        return new com.truecaller.messaging.event_sender.model.RetryEvent(id, type, content, retryCount, attemptTimestamp);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        java.lang.Class<?> cls;
        if (this == other) {
            return true;
        }
        if (other != null) {
            cls = other.getClass();
        } else {
            cls = null;
        }
        if (!com.truecaller.messaging.event_sender.model.RetryEvent.class.equals(cls)) {
            return false;
        }
        kotlin.jvm.internal.Intrinsics.e(other, "null cannot be cast to non-null type com.truecaller.messaging.event_sender.model.RetryEvent");
        com.truecaller.messaging.event_sender.model.RetryEvent retryEvent = (com.truecaller.messaging.event_sender.model.RetryEvent) other;
        if (this.id == retryEvent.id && this.type == retryEvent.type && java.util.Arrays.equals(this.content, retryEvent.content) && this.retryCount == retryEvent.retryCount) {
            return true;
        }
        return false;
    }

    public final long getAttemptTimestamp() {
        return this.attemptTimestamp;
    }

    @org.jetbrains.annotations.NotNull
    public final byte[] getContent() {
        return this.content;
    }

    public final long getId() {
        return this.id;
    }

    public final int getRetryCount() {
        return this.retryCount;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.messaging.event_sender.model.RetryEventType getType() {
        return this.type;
    }

    public int hashCode() {
        long j = this.id;
        return ((java.util.Arrays.hashCode(this.content) + ((this.type.hashCode() + (((int) (j ^ (j >>> 32))) * 31)) * 31)) * 31) + this.retryCount;
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        long j = this.id;
        com.truecaller.messaging.event_sender.model.RetryEventType retryEventType = this.type;
        java.lang.String arrays = java.util.Arrays.toString(this.content);
        int i = this.retryCount;
        long j2 = this.attemptTimestamp;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("RetryEvent(id=");
        sb.append(j);
        sb.append(", type=");
        sb.append(retryEventType);
        sb.append(", content=");
        sb.append(arrays);
        sb.append(", retryCount=");
        sb.append(i);
        return d4.t.o(sb, j2, ", attemptTimestamp=", ")");
    }

    public /* synthetic */ RetryEvent(long j, com.truecaller.messaging.event_sender.model.RetryEventType retryEventType, byte[] bArr, int i, long j2, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0L : j, retryEventType, bArr, (i2 & 8) != 0 ? 0 : i, (i2 & 16) != 0 ? 0L : j2);
    }
}
