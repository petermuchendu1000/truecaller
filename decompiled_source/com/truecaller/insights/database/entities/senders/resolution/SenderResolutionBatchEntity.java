package com.truecaller.insights.database.entities.senders.resolution;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/truecaller/insights/database/entities/senders/resolution/SenderResolutionBatchEntity;", "", "senderId", "", "date", "Ljava/util/Date;", "<init>", "(Ljava/lang/String;Ljava/util/Date;)V", "getSenderId", "()Ljava/lang/String;", "getDate", "()Ljava/util/Date;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "database_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final /* data */ class SenderResolutionBatchEntity {

    @org.jetbrains.annotations.NotNull
    private final java.util.Date date;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String senderId;

    public SenderResolutionBatchEntity(@org.jetbrains.annotations.NotNull java.lang.String str, @org.jetbrains.annotations.NotNull java.util.Date date) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "senderId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(date, "date");
        this.senderId = str;
        this.date = date;
    }

    public static /* synthetic */ com.truecaller.insights.database.entities.senders.resolution.SenderResolutionBatchEntity copy$default(com.truecaller.insights.database.entities.senders.resolution.SenderResolutionBatchEntity senderResolutionBatchEntity, java.lang.String str, java.util.Date date, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = senderResolutionBatchEntity.senderId;
        }
        if ((i & 2) != 0) {
            date = senderResolutionBatchEntity.date;
        }
        return senderResolutionBatchEntity.copy(str, date);
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component1, reason: from getter */
    public final java.lang.String getSenderId() {
        return this.senderId;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component2, reason: from getter */
    public final java.util.Date getDate() {
        return this.date;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.insights.database.entities.senders.resolution.SenderResolutionBatchEntity copy(@org.jetbrains.annotations.NotNull java.lang.String senderId, @org.jetbrains.annotations.NotNull java.util.Date date) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(senderId, "senderId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(date, "date");
        return new com.truecaller.insights.database.entities.senders.resolution.SenderResolutionBatchEntity(senderId, date);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.insights.database.entities.senders.resolution.SenderResolutionBatchEntity)) {
            return false;
        }
        com.truecaller.insights.database.entities.senders.resolution.SenderResolutionBatchEntity senderResolutionBatchEntity = (com.truecaller.insights.database.entities.senders.resolution.SenderResolutionBatchEntity) other;
        return kotlin.jvm.internal.Intrinsics.b(this.senderId, senderResolutionBatchEntity.senderId) && kotlin.jvm.internal.Intrinsics.b(this.date, senderResolutionBatchEntity.date);
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.Date getDate() {
        return this.date;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getSenderId() {
        return this.senderId;
    }

    public int hashCode() {
        return this.date.hashCode() + (this.senderId.hashCode() * 31);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return "SenderResolutionBatchEntity(senderId=" + this.senderId + ", date=" + this.date + ")";
    }
}
