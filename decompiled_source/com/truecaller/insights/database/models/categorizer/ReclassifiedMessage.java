package com.truecaller.insights.database.models.categorizer;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001e\u001a\u00020\tHÆ\u0003J\t\u0010\u001f\u001a\u00020\u000bHÆ\u0003JE\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020\u0007HÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006&"}, d2 = {"Lcom/truecaller/insights/database/models/categorizer/ReclassifiedMessage;", "", "messageBody", "", "fromCategory", "toCategory", "reTrainModelVersion", "", "id", "", "createdAt", "Ljava/util/Date;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IJLjava/util/Date;)V", "getMessageBody", "()Ljava/lang/String;", "getFromCategory", "getToCategory", "getReTrainModelVersion", "()I", "getId", "()J", "getCreatedAt", "()Ljava/util/Date;", "setCreatedAt", "(Ljava/util/Date;)V", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "database_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final /* data */ class ReclassifiedMessage {

    @org.jetbrains.annotations.NotNull
    private java.util.Date createdAt;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String fromCategory;
    private final long id;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String messageBody;
    private final int reTrainModelVersion;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String toCategory;

    public ReclassifiedMessage(@org.jetbrains.annotations.NotNull java.lang.String str, @org.jetbrains.annotations.NotNull java.lang.String str2, @org.jetbrains.annotations.NotNull java.lang.String str3, int i, long j, @org.jetbrains.annotations.NotNull java.util.Date date) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "messageBody");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "fromCategory");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "toCategory");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(date, "createdAt");
        this.messageBody = str;
        this.fromCategory = str2;
        this.toCategory = str3;
        this.reTrainModelVersion = i;
        this.id = j;
        this.createdAt = date;
    }

    public static /* synthetic */ com.truecaller.insights.database.models.categorizer.ReclassifiedMessage copy$default(com.truecaller.insights.database.models.categorizer.ReclassifiedMessage reclassifiedMessage, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, long j, java.util.Date date, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            str = reclassifiedMessage.messageBody;
        }
        if ((i2 & 2) != 0) {
            str2 = reclassifiedMessage.fromCategory;
        }
        if ((i2 & 4) != 0) {
            str3 = reclassifiedMessage.toCategory;
        }
        if ((i2 & 8) != 0) {
            i = reclassifiedMessage.reTrainModelVersion;
        }
        if ((i2 & 16) != 0) {
            j = reclassifiedMessage.id;
        }
        if ((i2 & 32) != 0) {
            date = reclassifiedMessage.createdAt;
        }
        java.util.Date date2 = date;
        long j2 = j;
        return reclassifiedMessage.copy(str, str2, str3, i, j2, date2);
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component1, reason: from getter */
    public final java.lang.String getMessageBody() {
        return this.messageBody;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component2, reason: from getter */
    public final java.lang.String getFromCategory() {
        return this.fromCategory;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component3, reason: from getter */
    public final java.lang.String getToCategory() {
        return this.toCategory;
    }

    /* renamed from: component4, reason: from getter */
    public final int getReTrainModelVersion() {
        return this.reTrainModelVersion;
    }

    /* renamed from: component5, reason: from getter */
    public final long getId() {
        return this.id;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component6, reason: from getter */
    public final java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.insights.database.models.categorizer.ReclassifiedMessage copy(@org.jetbrains.annotations.NotNull java.lang.String messageBody, @org.jetbrains.annotations.NotNull java.lang.String fromCategory, @org.jetbrains.annotations.NotNull java.lang.String toCategory, int reTrainModelVersion, long id, @org.jetbrains.annotations.NotNull java.util.Date createdAt) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(messageBody, "messageBody");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fromCategory, "fromCategory");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(toCategory, "toCategory");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        return new com.truecaller.insights.database.models.categorizer.ReclassifiedMessage(messageBody, fromCategory, toCategory, reTrainModelVersion, id, createdAt);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.insights.database.models.categorizer.ReclassifiedMessage)) {
            return false;
        }
        com.truecaller.insights.database.models.categorizer.ReclassifiedMessage reclassifiedMessage = (com.truecaller.insights.database.models.categorizer.ReclassifiedMessage) other;
        return kotlin.jvm.internal.Intrinsics.b(this.messageBody, reclassifiedMessage.messageBody) && kotlin.jvm.internal.Intrinsics.b(this.fromCategory, reclassifiedMessage.fromCategory) && kotlin.jvm.internal.Intrinsics.b(this.toCategory, reclassifiedMessage.toCategory) && this.reTrainModelVersion == reclassifiedMessage.reTrainModelVersion && this.id == reclassifiedMessage.id && kotlin.jvm.internal.Intrinsics.b(this.createdAt, reclassifiedMessage.createdAt);
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getFromCategory() {
        return this.fromCategory;
    }

    public final long getId() {
        return this.id;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getMessageBody() {
        return this.messageBody;
    }

    public final int getReTrainModelVersion() {
        return this.reTrainModelVersion;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getToCategory() {
        return this.toCategory;
    }

    public int hashCode() {
        int e = (ax1.bar.e(ax1.bar.e(this.messageBody.hashCode() * 31, 31, this.fromCategory), 31, this.toCategory) + this.reTrainModelVersion) * 31;
        long j = this.id;
        return this.createdAt.hashCode() + ((e + ((int) (j ^ (j >>> 32)))) * 31);
    }

    public final void setCreatedAt(@org.jetbrains.annotations.NotNull java.util.Date date) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(date, "<set-?>");
        this.createdAt = date;
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        java.lang.String str = this.messageBody;
        java.lang.String str2 = this.fromCategory;
        java.lang.String str3 = this.toCategory;
        int i = this.reTrainModelVersion;
        long j = this.id;
        java.util.Date date = this.createdAt;
        java.lang.StringBuilder E = ro0.f.E("ReclassifiedMessage(messageBody=", str, ", fromCategory=", str2, ", toCategory=");
        t.c.x(i, str3, ", reTrainModelVersion=", ", id=", E);
        E.append(j);
        E.append(", createdAt=");
        E.append(date);
        E.append(")");
        return E.toString();
    }

    public /* synthetic */ ReclassifiedMessage(java.lang.String str, java.lang.String str2, java.lang.String str3, int i, long j, java.util.Date date, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i2 & 8) != 0 ? 0 : i, (i2 & 16) != 0 ? 0L : j, (i2 & 32) != 0 ? new java.util.Date() : date);
    }
}
