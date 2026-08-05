package com.truecaller.insights.database.models.analytics;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\tHÆ\u0003J;\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, d2 = {"Lcom/truecaller/insights/database/models/analytics/AnalyticsPropertyMapsModel;", "", "parentEventId", "", "key", "", "value", "propertyId", "createdAt", "Ljava/util/Date;", "<init>", "(JLjava/lang/String;Ljava/lang/String;JLjava/util/Date;)V", "getParentEventId", "()J", "getKey", "()Ljava/lang/String;", "getValue", "getPropertyId", "getCreatedAt", "()Ljava/util/Date;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "database_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final /* data */ class AnalyticsPropertyMapsModel {

    @org.jetbrains.annotations.NotNull
    private final java.util.Date createdAt;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String key;
    private final long parentEventId;
    private final long propertyId;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String value;

    public AnalyticsPropertyMapsModel(long j, @org.jetbrains.annotations.NotNull java.lang.String str, @org.jetbrains.annotations.NotNull java.lang.String str2, long j2, @org.jetbrains.annotations.NotNull java.util.Date date) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "key");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "value");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(date, "createdAt");
        this.parentEventId = j;
        this.key = str;
        this.value = str2;
        this.propertyId = j2;
        this.createdAt = date;
    }

    public static /* synthetic */ com.truecaller.insights.database.models.analytics.AnalyticsPropertyMapsModel copy$default(com.truecaller.insights.database.models.analytics.AnalyticsPropertyMapsModel analyticsPropertyMapsModel, long j, java.lang.String str, java.lang.String str2, long j2, java.util.Date date, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            j = analyticsPropertyMapsModel.parentEventId;
        }
        long j3 = j;
        if ((i & 2) != 0) {
            str = analyticsPropertyMapsModel.key;
        }
        java.lang.String str3 = str;
        if ((i & 4) != 0) {
            str2 = analyticsPropertyMapsModel.value;
        }
        java.lang.String str4 = str2;
        if ((i & 8) != 0) {
            j2 = analyticsPropertyMapsModel.propertyId;
        }
        long j4 = j2;
        if ((i & 16) != 0) {
            date = analyticsPropertyMapsModel.createdAt;
        }
        return analyticsPropertyMapsModel.copy(j3, str3, str4, j4, date);
    }

    /* renamed from: component1, reason: from getter */
    public final long getParentEventId() {
        return this.parentEventId;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component2, reason: from getter */
    public final java.lang.String getKey() {
        return this.key;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component3, reason: from getter */
    public final java.lang.String getValue() {
        return this.value;
    }

    /* renamed from: component4, reason: from getter */
    public final long getPropertyId() {
        return this.propertyId;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component5, reason: from getter */
    public final java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.insights.database.models.analytics.AnalyticsPropertyMapsModel copy(long parentEventId, @org.jetbrains.annotations.NotNull java.lang.String key, @org.jetbrains.annotations.NotNull java.lang.String value, long propertyId, @org.jetbrains.annotations.NotNull java.util.Date createdAt) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        return new com.truecaller.insights.database.models.analytics.AnalyticsPropertyMapsModel(parentEventId, key, value, propertyId, createdAt);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.insights.database.models.analytics.AnalyticsPropertyMapsModel)) {
            return false;
        }
        com.truecaller.insights.database.models.analytics.AnalyticsPropertyMapsModel analyticsPropertyMapsModel = (com.truecaller.insights.database.models.analytics.AnalyticsPropertyMapsModel) other;
        return this.parentEventId == analyticsPropertyMapsModel.parentEventId && kotlin.jvm.internal.Intrinsics.b(this.key, analyticsPropertyMapsModel.key) && kotlin.jvm.internal.Intrinsics.b(this.value, analyticsPropertyMapsModel.value) && this.propertyId == analyticsPropertyMapsModel.propertyId && kotlin.jvm.internal.Intrinsics.b(this.createdAt, analyticsPropertyMapsModel.createdAt);
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getKey() {
        return this.key;
    }

    public final long getParentEventId() {
        return this.parentEventId;
    }

    public final long getPropertyId() {
        return this.propertyId;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getValue() {
        return this.value;
    }

    public int hashCode() {
        long j = this.parentEventId;
        int e = ax1.bar.e(ax1.bar.e(((int) (j ^ (j >>> 32))) * 31, 31, this.key), 31, this.value);
        long j2 = this.propertyId;
        return this.createdAt.hashCode() + ((e + ((int) (j2 ^ (j2 >>> 32)))) * 31);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        long j = this.parentEventId;
        java.lang.String str = this.key;
        java.lang.String str2 = this.value;
        long j2 = this.propertyId;
        java.util.Date date = this.createdAt;
        java.lang.StringBuilder p = com.appsflyer.internal.e.p("AnalyticsPropertyMapsModel(parentEventId=", j, ", key=", str);
        li.qux.C(", value=", str2, ", propertyId=", p);
        p.append(j2);
        p.append(", createdAt=");
        p.append(date);
        p.append(")");
        return p.toString();
    }

    public /* synthetic */ AnalyticsPropertyMapsModel(long j, java.lang.String str, java.lang.String str2, long j2, java.util.Date date, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(j, str, str2, (i & 8) != 0 ? 0L : j2, (i & 16) != 0 ? new java.util.Date() : date);
    }
}
