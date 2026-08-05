package com.truecaller.insights.database.models.analytics;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\tHÆ\u0003J\t\u0010\u001c\u001a\u00020\u000bHÆ\u0003JE\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\t2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0014R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006#"}, d2 = {"Lcom/truecaller/insights/database/models/analytics/ParserAnalyticsModel;", "", "eventId", "", com.truecaller.insights.database.models.analytics.AggregatedParserAnalytics.EVENT_CONDENSATIONS, "", "category", "sender", "isConsumed", "", "createdAt", "Ljava/util/Date;", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/Date;)V", "getEventId", "()J", "getCondensations", "()Ljava/lang/String;", "getCategory", "getSender", "()Z", "getCreatedAt", "()Ljava/util/Date;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "database_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final /* data */ class ParserAnalyticsModel {

    @org.jetbrains.annotations.NotNull
    private final java.lang.String category;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String condensations;

    @org.jetbrains.annotations.NotNull
    private final java.util.Date createdAt;
    private final long eventId;
    private final boolean isConsumed;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String sender;

    public ParserAnalyticsModel(long j, @org.jetbrains.annotations.NotNull java.lang.String str, @org.jetbrains.annotations.NotNull java.lang.String str2, @org.jetbrains.annotations.NotNull java.lang.String str3, boolean z, @org.jetbrains.annotations.NotNull java.util.Date date) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, com.truecaller.insights.database.models.analytics.AggregatedParserAnalytics.EVENT_CONDENSATIONS);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "category");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "sender");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(date, "createdAt");
        this.eventId = j;
        this.condensations = str;
        this.category = str2;
        this.sender = str3;
        this.isConsumed = z;
        this.createdAt = date;
    }

    public static /* synthetic */ com.truecaller.insights.database.models.analytics.ParserAnalyticsModel copy$default(com.truecaller.insights.database.models.analytics.ParserAnalyticsModel parserAnalyticsModel, long j, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, java.util.Date date, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            j = parserAnalyticsModel.eventId;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            str = parserAnalyticsModel.condensations;
        }
        java.lang.String str4 = str;
        if ((i & 4) != 0) {
            str2 = parserAnalyticsModel.category;
        }
        java.lang.String str5 = str2;
        if ((i & 8) != 0) {
            str3 = parserAnalyticsModel.sender;
        }
        java.lang.String str6 = str3;
        if ((i & 16) != 0) {
            z = parserAnalyticsModel.isConsumed;
        }
        boolean z2 = z;
        if ((i & 32) != 0) {
            date = parserAnalyticsModel.createdAt;
        }
        return parserAnalyticsModel.copy(j2, str4, str5, str6, z2, date);
    }

    /* renamed from: component1, reason: from getter */
    public final long getEventId() {
        return this.eventId;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component2, reason: from getter */
    public final java.lang.String getCondensations() {
        return this.condensations;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component3, reason: from getter */
    public final java.lang.String getCategory() {
        return this.category;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component4, reason: from getter */
    public final java.lang.String getSender() {
        return this.sender;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsConsumed() {
        return this.isConsumed;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component6, reason: from getter */
    public final java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.insights.database.models.analytics.ParserAnalyticsModel copy(long eventId, @org.jetbrains.annotations.NotNull java.lang.String condensations, @org.jetbrains.annotations.NotNull java.lang.String category, @org.jetbrains.annotations.NotNull java.lang.String sender, boolean isConsumed, @org.jetbrains.annotations.NotNull java.util.Date createdAt) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(condensations, com.truecaller.insights.database.models.analytics.AggregatedParserAnalytics.EVENT_CONDENSATIONS);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(category, "category");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sender, "sender");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        return new com.truecaller.insights.database.models.analytics.ParserAnalyticsModel(eventId, condensations, category, sender, isConsumed, createdAt);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.insights.database.models.analytics.ParserAnalyticsModel)) {
            return false;
        }
        com.truecaller.insights.database.models.analytics.ParserAnalyticsModel parserAnalyticsModel = (com.truecaller.insights.database.models.analytics.ParserAnalyticsModel) other;
        return this.eventId == parserAnalyticsModel.eventId && kotlin.jvm.internal.Intrinsics.b(this.condensations, parserAnalyticsModel.condensations) && kotlin.jvm.internal.Intrinsics.b(this.category, parserAnalyticsModel.category) && kotlin.jvm.internal.Intrinsics.b(this.sender, parserAnalyticsModel.sender) && this.isConsumed == parserAnalyticsModel.isConsumed && kotlin.jvm.internal.Intrinsics.b(this.createdAt, parserAnalyticsModel.createdAt);
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getCategory() {
        return this.category;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getCondensations() {
        return this.condensations;
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    public final long getEventId() {
        return this.eventId;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getSender() {
        return this.sender;
    }

    public int hashCode() {
        int i;
        long j = this.eventId;
        int e = ax1.bar.e(ax1.bar.e(ax1.bar.e(((int) (j ^ (j >>> 32))) * 31, 31, this.condensations), 31, this.category), 31, this.sender);
        if (this.isConsumed) {
            i = 1231;
        } else {
            i = 1237;
        }
        return this.createdAt.hashCode() + ((e + i) * 31);
    }

    public final boolean isConsumed() {
        return this.isConsumed;
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        long j = this.eventId;
        java.lang.String str = this.condensations;
        java.lang.String str2 = this.category;
        java.lang.String str3 = this.sender;
        boolean z = this.isConsumed;
        java.util.Date date = this.createdAt;
        java.lang.StringBuilder p = com.appsflyer.internal.e.p("ParserAnalyticsModel(eventId=", j, ", condensations=", str);
        bar.E(p, ", category=", str2, ", sender=", str3);
        p.append(", isConsumed=");
        p.append(z);
        p.append(", createdAt=");
        p.append(date);
        p.append(")");
        return p.toString();
    }

    public /* synthetic */ ParserAnalyticsModel(long j, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, java.util.Date date, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, str, str2, str3, (i & 16) != 0 ? false : z, (i & 32) != 0 ? new java.util.Date() : date);
    }
}
