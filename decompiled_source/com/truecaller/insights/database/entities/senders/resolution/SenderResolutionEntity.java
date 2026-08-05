package com.truecaller.insights.database.entities.senders.resolution;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0011J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\tHÆ\u0003J\t\u0010\u001c\u001a\u00020\tHÆ\u0003JP\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0002\u0010\u001eJ\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020\u0006HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015¨\u0006$"}, d2 = {"Lcom/truecaller/insights/database/entities/senders/resolution/SenderResolutionEntity;", "", "sender", "", "senderName", "badges", "", "senderIconUri", "createdAt", "Ljava/util/Date;", "updatedAt", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;)V", "getSender", "()Ljava/lang/String;", "getSenderName", "getBadges", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getSenderIconUri", "getCreatedAt", "()Ljava/util/Date;", "getUpdatedAt", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;)Lcom/truecaller/insights/database/entities/senders/resolution/SenderResolutionEntity;", "equals", "", "other", "hashCode", "toString", "database_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final /* data */ class SenderResolutionEntity {

    @org.jetbrains.annotations.Nullable
    private final java.lang.Integer badges;

    @org.jetbrains.annotations.NotNull
    private final java.util.Date createdAt;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String sender;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String senderIconUri;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String senderName;

    @org.jetbrains.annotations.NotNull
    private final java.util.Date updatedAt;

    public SenderResolutionEntity(@org.jetbrains.annotations.NotNull java.lang.String str, @org.jetbrains.annotations.Nullable java.lang.String str2, @org.jetbrains.annotations.Nullable java.lang.Integer num, @org.jetbrains.annotations.Nullable java.lang.String str3, @org.jetbrains.annotations.NotNull java.util.Date date, @org.jetbrains.annotations.NotNull java.util.Date date2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "sender");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(date, "createdAt");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(date2, "updatedAt");
        this.sender = str;
        this.senderName = str2;
        this.badges = num;
        this.senderIconUri = str3;
        this.createdAt = date;
        this.updatedAt = date2;
    }

    public static /* synthetic */ com.truecaller.insights.database.entities.senders.resolution.SenderResolutionEntity copy$default(com.truecaller.insights.database.entities.senders.resolution.SenderResolutionEntity senderResolutionEntity, java.lang.String str, java.lang.String str2, java.lang.Integer num, java.lang.String str3, java.util.Date date, java.util.Date date2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = senderResolutionEntity.sender;
        }
        if ((i & 2) != 0) {
            str2 = senderResolutionEntity.senderName;
        }
        if ((i & 4) != 0) {
            num = senderResolutionEntity.badges;
        }
        if ((i & 8) != 0) {
            str3 = senderResolutionEntity.senderIconUri;
        }
        if ((i & 16) != 0) {
            date = senderResolutionEntity.createdAt;
        }
        if ((i & 32) != 0) {
            date2 = senderResolutionEntity.updatedAt;
        }
        java.util.Date date3 = date;
        java.util.Date date4 = date2;
        return senderResolutionEntity.copy(str, str2, num, str3, date3, date4);
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component1, reason: from getter */
    public final java.lang.String getSender() {
        return this.sender;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component2, reason: from getter */
    public final java.lang.String getSenderName() {
        return this.senderName;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component3, reason: from getter */
    public final java.lang.Integer getBadges() {
        return this.badges;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component4, reason: from getter */
    public final java.lang.String getSenderIconUri() {
        return this.senderIconUri;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component5, reason: from getter */
    public final java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component6, reason: from getter */
    public final java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.insights.database.entities.senders.resolution.SenderResolutionEntity copy(@org.jetbrains.annotations.NotNull java.lang.String sender, @org.jetbrains.annotations.Nullable java.lang.String senderName, @org.jetbrains.annotations.Nullable java.lang.Integer badges, @org.jetbrains.annotations.Nullable java.lang.String senderIconUri, @org.jetbrains.annotations.NotNull java.util.Date createdAt, @org.jetbrains.annotations.NotNull java.util.Date updatedAt) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sender, "sender");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updatedAt, "updatedAt");
        return new com.truecaller.insights.database.entities.senders.resolution.SenderResolutionEntity(sender, senderName, badges, senderIconUri, createdAt, updatedAt);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.insights.database.entities.senders.resolution.SenderResolutionEntity)) {
            return false;
        }
        com.truecaller.insights.database.entities.senders.resolution.SenderResolutionEntity senderResolutionEntity = (com.truecaller.insights.database.entities.senders.resolution.SenderResolutionEntity) other;
        return kotlin.jvm.internal.Intrinsics.b(this.sender, senderResolutionEntity.sender) && kotlin.jvm.internal.Intrinsics.b(this.senderName, senderResolutionEntity.senderName) && kotlin.jvm.internal.Intrinsics.b(this.badges, senderResolutionEntity.badges) && kotlin.jvm.internal.Intrinsics.b(this.senderIconUri, senderResolutionEntity.senderIconUri) && kotlin.jvm.internal.Intrinsics.b(this.createdAt, senderResolutionEntity.createdAt) && kotlin.jvm.internal.Intrinsics.b(this.updatedAt, senderResolutionEntity.updatedAt);
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getBadges() {
        return this.badges;
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getSender() {
        return this.sender;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getSenderIconUri() {
        return this.senderIconUri;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getSenderName() {
        return this.senderName;
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = this.sender.hashCode() * 31;
        java.lang.String str = this.senderName;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode3 + hashCode) * 31;
        java.lang.Integer num = this.badges;
        if (num == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        java.lang.String str2 = this.senderIconUri;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return this.updatedAt.hashCode() + uf.qux.h(this.createdAt, (i3 + i) * 31, 31);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        java.lang.String str = this.sender;
        java.lang.String str2 = this.senderName;
        java.lang.Integer num = this.badges;
        java.lang.String str3 = this.senderIconUri;
        java.util.Date date = this.createdAt;
        java.util.Date date2 = this.updatedAt;
        java.lang.StringBuilder E = ro0.f.E("SenderResolutionEntity(sender=", str, ", senderName=", str2, ", badges=");
        bar.D(num, ", senderIconUri=", str3, ", createdAt=", E);
        E.append(date);
        E.append(", updatedAt=");
        E.append(date2);
        E.append(")");
        return E.toString();
    }

    public /* synthetic */ SenderResolutionEntity(java.lang.String str, java.lang.String str2, java.lang.Integer num, java.lang.String str3, java.util.Date date, java.util.Date date2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, num, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? new java.util.Date() : date, (i & 32) != 0 ? new java.util.Date() : date2);
    }
}
