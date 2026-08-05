package com.truecaller.insights.database.entities;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001f\u001a\u00020\bHÆ\u0003J\t\u0010 \u001a\u00020\bHÆ\u0003J\t\u0010!\u001a\u00020\bHÆ\u0003J\t\u0010\"\u001a\u00020\bHÆ\u0003J\t\u0010#\u001a\u00020\bHÆ\u0003JY\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\bHÆ\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020)HÖ\u0001J\t\u0010*\u001a\u00020\u0006HÖ\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0016\u0010\n\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0016\u0010\u000b\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\u0016\u0010\f\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017¨\u0006+"}, d2 = {"Lcom/truecaller/insights/database/entities/Nudge;", "", "id", "", "messageId", "domain", "", "dueDate", "Ljava/util/Date;", "msgDate", "alarmTs", "createdAt", "updatedAt", "<init>", "(JJLjava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;)V", "getId", "()J", "setId", "(J)V", "getMessageId", "getDomain", "()Ljava/lang/String;", "getDueDate", "()Ljava/util/Date;", "getMsgDate", "getAlarmTs", "getCreatedAt", "getUpdatedAt", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "database_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final /* data */ class Nudge {

    @org.jetbrains.annotations.NotNull
    private final java.util.Date alarmTs;

    @org.jetbrains.annotations.NotNull
    private final java.util.Date createdAt;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String domain;

    @org.jetbrains.annotations.NotNull
    private final java.util.Date dueDate;
    private long id;
    private final long messageId;

    @org.jetbrains.annotations.NotNull
    private final java.util.Date msgDate;

    @org.jetbrains.annotations.NotNull
    private final java.util.Date updatedAt;

    public Nudge(long j, long j2, @org.jetbrains.annotations.NotNull java.lang.String str, @org.jetbrains.annotations.NotNull java.util.Date date, @org.jetbrains.annotations.NotNull java.util.Date date2, @org.jetbrains.annotations.NotNull java.util.Date date3, @org.jetbrains.annotations.NotNull java.util.Date date4, @org.jetbrains.annotations.NotNull java.util.Date date5) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "domain");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(date, "dueDate");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(date2, "msgDate");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(date3, "alarmTs");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(date4, "createdAt");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(date5, "updatedAt");
        this.id = j;
        this.messageId = j2;
        this.domain = str;
        this.dueDate = date;
        this.msgDate = date2;
        this.alarmTs = date3;
        this.createdAt = date4;
        this.updatedAt = date5;
    }

    public static /* synthetic */ com.truecaller.insights.database.entities.Nudge copy$default(com.truecaller.insights.database.entities.Nudge nudge, long j, long j2, java.lang.String str, java.util.Date date, java.util.Date date2, java.util.Date date3, java.util.Date date4, java.util.Date date5, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            j = nudge.id;
        }
        long j3 = j;
        if ((i & 2) != 0) {
            j2 = nudge.messageId;
        }
        return nudge.copy(j3, j2, (i & 4) != 0 ? nudge.domain : str, (i & 8) != 0 ? nudge.dueDate : date, (i & 16) != 0 ? nudge.msgDate : date2, (i & 32) != 0 ? nudge.alarmTs : date3, (i & 64) != 0 ? nudge.createdAt : date4, (i & 128) != 0 ? nudge.updatedAt : date5);
    }

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final long getMessageId() {
        return this.messageId;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component3, reason: from getter */
    public final java.lang.String getDomain() {
        return this.domain;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component4, reason: from getter */
    public final java.util.Date getDueDate() {
        return this.dueDate;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component5, reason: from getter */
    public final java.util.Date getMsgDate() {
        return this.msgDate;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component6, reason: from getter */
    public final java.util.Date getAlarmTs() {
        return this.alarmTs;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component7, reason: from getter */
    public final java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component8, reason: from getter */
    public final java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.insights.database.entities.Nudge copy(long id, long messageId, @org.jetbrains.annotations.NotNull java.lang.String domain, @org.jetbrains.annotations.NotNull java.util.Date dueDate, @org.jetbrains.annotations.NotNull java.util.Date msgDate, @org.jetbrains.annotations.NotNull java.util.Date alarmTs, @org.jetbrains.annotations.NotNull java.util.Date createdAt, @org.jetbrains.annotations.NotNull java.util.Date updatedAt) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(domain, "domain");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dueDate, "dueDate");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(msgDate, "msgDate");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(alarmTs, "alarmTs");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updatedAt, "updatedAt");
        return new com.truecaller.insights.database.entities.Nudge(id, messageId, domain, dueDate, msgDate, alarmTs, createdAt, updatedAt);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.insights.database.entities.Nudge)) {
            return false;
        }
        com.truecaller.insights.database.entities.Nudge nudge = (com.truecaller.insights.database.entities.Nudge) other;
        return this.id == nudge.id && this.messageId == nudge.messageId && kotlin.jvm.internal.Intrinsics.b(this.domain, nudge.domain) && kotlin.jvm.internal.Intrinsics.b(this.dueDate, nudge.dueDate) && kotlin.jvm.internal.Intrinsics.b(this.msgDate, nudge.msgDate) && kotlin.jvm.internal.Intrinsics.b(this.alarmTs, nudge.alarmTs) && kotlin.jvm.internal.Intrinsics.b(this.createdAt, nudge.createdAt) && kotlin.jvm.internal.Intrinsics.b(this.updatedAt, nudge.updatedAt);
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.Date getAlarmTs() {
        return this.alarmTs;
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getDomain() {
        return this.domain;
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.Date getDueDate() {
        return this.dueDate;
    }

    public final long getId() {
        return this.id;
    }

    public final long getMessageId() {
        return this.messageId;
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.Date getMsgDate() {
        return this.msgDate;
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    public int hashCode() {
        long j = this.id;
        long j2 = this.messageId;
        return this.updatedAt.hashCode() + uf.qux.h(this.createdAt, uf.qux.h(this.alarmTs, uf.qux.h(this.msgDate, uf.qux.h(this.dueDate, ax1.bar.e(((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31, 31, this.domain), 31), 31), 31), 31);
    }

    public final void setId(long j) {
        this.id = j;
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        long j = this.id;
        long j2 = this.messageId;
        java.lang.String str = this.domain;
        java.util.Date date = this.dueDate;
        java.util.Date date2 = this.msgDate;
        java.util.Date date3 = this.alarmTs;
        java.util.Date date4 = this.createdAt;
        java.util.Date date5 = this.updatedAt;
        java.lang.StringBuilder T = h0.b.T(j, "Nudge(id=", ", messageId=");
        ro0.f.K(T, j2, ", domain=", str);
        T.append(", dueDate=");
        T.append(date);
        T.append(", msgDate=");
        T.append(date2);
        T.append(", alarmTs=");
        T.append(date3);
        T.append(", createdAt=");
        T.append(date4);
        T.append(", updatedAt=");
        T.append(date5);
        T.append(")");
        return T.toString();
    }

    public /* synthetic */ Nudge(long j, long j2, java.lang.String str, java.util.Date date, java.util.Date date2, java.util.Date date3, java.util.Date date4, java.util.Date date5, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, j2, str, date, date2, date3, (i & 64) != 0 ? new java.util.Date() : date4, (i & 128) != 0 ? new java.util.Date() : date5);
    }
}
