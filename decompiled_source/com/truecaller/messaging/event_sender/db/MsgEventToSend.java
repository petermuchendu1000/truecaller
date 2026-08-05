package com.truecaller.messaging.event_sender.db;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J;\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u001a\u001a\u00020\u0005J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001J\u0016\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u0005R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006'"}, d2 = {"Lcom/truecaller/messaging/event_sender/db/MsgEventToSend;", "Landroid/os/Parcelable;", "id", "", "type", "", "content", "", "retryCount", "attemptTimestamp", "<init>", "(JI[BIJ)V", "getId", "()J", "getType", "()I", "getContent", "()[B", "getRetryCount", "getAttemptTimestamp", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "messaging-event-sender_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final /* data */ class MsgEventToSend implements android.os.Parcelable {

    @org.jetbrains.annotations.NotNull
    public static final android.os.Parcelable.Creator<com.truecaller.messaging.event_sender.db.MsgEventToSend> CREATOR = new f22.bar(0);
    private final long attemptTimestamp;

    @org.jetbrains.annotations.NotNull
    private final byte[] content;
    private final long id;
    private final int retryCount;
    private final int type;

    public MsgEventToSend(long j, int i, @org.jetbrains.annotations.NotNull byte[] bArr, int i2, long j2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "content");
        this.id = j;
        this.type = i;
        this.content = bArr;
        this.retryCount = i2;
        this.attemptTimestamp = j2;
    }

    public static /* synthetic */ com.truecaller.messaging.event_sender.db.MsgEventToSend copy$default(com.truecaller.messaging.event_sender.db.MsgEventToSend msgEventToSend, long j, int i, byte[] bArr, int i2, long j2, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            j = msgEventToSend.id;
        }
        long j3 = j;
        if ((i3 & 2) != 0) {
            i = msgEventToSend.type;
        }
        int i4 = i;
        if ((i3 & 4) != 0) {
            bArr = msgEventToSend.content;
        }
        byte[] bArr2 = bArr;
        if ((i3 & 8) != 0) {
            i2 = msgEventToSend.retryCount;
        }
        int i5 = i2;
        if ((i3 & 16) != 0) {
            j2 = msgEventToSend.attemptTimestamp;
        }
        return msgEventToSend.copy(j3, i4, bArr2, i5, j2);
    }

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final int getType() {
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
    public final com.truecaller.messaging.event_sender.db.MsgEventToSend copy(long id, int type, @org.jetbrains.annotations.NotNull byte[] content, int retryCount, long attemptTimestamp) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(content, "content");
        return new com.truecaller.messaging.event_sender.db.MsgEventToSend(id, type, content, retryCount, attemptTimestamp);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.messaging.event_sender.db.MsgEventToSend)) {
            return false;
        }
        com.truecaller.messaging.event_sender.db.MsgEventToSend msgEventToSend = (com.truecaller.messaging.event_sender.db.MsgEventToSend) other;
        return this.id == msgEventToSend.id && this.type == msgEventToSend.type && kotlin.jvm.internal.Intrinsics.b(this.content, msgEventToSend.content) && this.retryCount == msgEventToSend.retryCount && this.attemptTimestamp == msgEventToSend.attemptTimestamp;
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

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        long j = this.id;
        int hashCode = (((java.util.Arrays.hashCode(this.content) + (((((int) (j ^ (j >>> 32))) * 31) + this.type) * 31)) * 31) + this.retryCount) * 31;
        long j2 = this.attemptTimestamp;
        return hashCode + ((int) (j2 ^ (j2 >>> 32)));
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        long j = this.id;
        int i = this.type;
        java.lang.String arrays = java.util.Arrays.toString(this.content);
        int i2 = this.retryCount;
        long j2 = this.attemptTimestamp;
        java.lang.StringBuilder e = com.google.android.gms.internal.ads.yj.e(i, "MsgEventToSend(id=", ", type=", j);
        e.append(", content=");
        e.append(arrays);
        e.append(", retryCount=");
        e.append(i2);
        return d4.t.o(e, j2, ", attemptTimestamp=", ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@org.jetbrains.annotations.NotNull android.os.Parcel dest, int flags) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeLong(this.id);
        dest.writeInt(this.type);
        dest.writeByteArray(this.content);
        dest.writeInt(this.retryCount);
        dest.writeLong(this.attemptTimestamp);
    }

    public /* synthetic */ MsgEventToSend(long j, int i, byte[] bArr, int i2, long j2, int i3, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0L : j, i, bArr, (i3 & 8) != 0 ? 0 : i2, j2);
    }
}
