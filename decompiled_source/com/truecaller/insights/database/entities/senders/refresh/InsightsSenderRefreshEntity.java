package com.truecaller.insights.database.entities.senders.refresh;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, d2 = {"Lcom/truecaller/insights/database/entities/senders/refresh/InsightsSenderRefreshEntity;", "", "id", "", "senderID", "", "<init>", "(JLjava/lang/String;)V", "getId", "()J", "setId", "(J)V", "getSenderID", "()Ljava/lang/String;", "setSenderID", "(Ljava/lang/String;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "database_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final /* data */ class InsightsSenderRefreshEntity {
    private long id;

    @org.jetbrains.annotations.NotNull
    private java.lang.String senderID;

    public InsightsSenderRefreshEntity() {
        this(0L, null, 3, null);
    }

    public static /* synthetic */ com.truecaller.insights.database.entities.senders.refresh.InsightsSenderRefreshEntity copy$default(com.truecaller.insights.database.entities.senders.refresh.InsightsSenderRefreshEntity insightsSenderRefreshEntity, long j, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            j = insightsSenderRefreshEntity.id;
        }
        if ((i & 2) != 0) {
            str = insightsSenderRefreshEntity.senderID;
        }
        return insightsSenderRefreshEntity.copy(j, str);
    }

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component2, reason: from getter */
    public final java.lang.String getSenderID() {
        return this.senderID;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.insights.database.entities.senders.refresh.InsightsSenderRefreshEntity copy(long id, @org.jetbrains.annotations.NotNull java.lang.String senderID) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(senderID, "senderID");
        return new com.truecaller.insights.database.entities.senders.refresh.InsightsSenderRefreshEntity(id, senderID);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.insights.database.entities.senders.refresh.InsightsSenderRefreshEntity)) {
            return false;
        }
        com.truecaller.insights.database.entities.senders.refresh.InsightsSenderRefreshEntity insightsSenderRefreshEntity = (com.truecaller.insights.database.entities.senders.refresh.InsightsSenderRefreshEntity) other;
        return this.id == insightsSenderRefreshEntity.id && kotlin.jvm.internal.Intrinsics.b(this.senderID, insightsSenderRefreshEntity.senderID);
    }

    public final long getId() {
        return this.id;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getSenderID() {
        return this.senderID;
    }

    public int hashCode() {
        long j = this.id;
        return this.senderID.hashCode() + (((int) (j ^ (j >>> 32))) * 31);
    }

    public final void setId(long j) {
        this.id = j;
    }

    public final void setSenderID(@org.jetbrains.annotations.NotNull java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.senderID = str;
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        java.lang.StringBuilder p = com.appsflyer.internal.e.p("InsightsSenderRefreshEntity(id=", this.id, ", senderID=", this.senderID);
        p.append(")");
        return p.toString();
    }

    public InsightsSenderRefreshEntity(long j, @org.jetbrains.annotations.NotNull java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "senderID");
        this.id = j;
        this.senderID = str;
    }

    public /* synthetic */ InsightsSenderRefreshEntity(long j, java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? "" : str);
    }
}
