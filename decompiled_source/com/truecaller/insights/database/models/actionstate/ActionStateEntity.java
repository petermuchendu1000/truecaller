package com.truecaller.insights.database.models.actionstate;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001f\u001a\u00020\bHÆ\u0003J\t\u0010 \u001a\u00020\u0006HÆ\u0003J\t\u0010!\u001a\u00020\u000bHÆ\u0003J\t\u0010\"\u001a\u00020\u000bHÆ\u0003J\t\u0010#\u001a\u00020\u0006HÆ\u0003JY\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u0006HÆ\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020\bHÖ\u0001J\t\u0010)\u001a\u00020\u0006HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\t\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0016\u0010\r\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014¨\u0006*"}, d2 = {"Lcom/truecaller/insights/database/models/actionstate/ActionStateEntity;", "", "id", "", "entityId", "domain", "", "state", "", "origin", "createdAt", "Ljava/util/Date;", "updatesAt", "extra", "<init>", "(JJLjava/lang/String;ILjava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;)V", "getId", "()J", "getEntityId", "getDomain", "()Ljava/lang/String;", "getState", "()I", "getOrigin", "getCreatedAt", "()Ljava/util/Date;", "getUpdatesAt", "getExtra", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", "database_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final /* data */ class ActionStateEntity {

    @org.jetbrains.annotations.NotNull
    private final java.util.Date createdAt;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String domain;
    private final long entityId;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String extra;
    private final long id;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String origin;
    private final int state;

    @org.jetbrains.annotations.NotNull
    private final java.util.Date updatesAt;

    public ActionStateEntity(long j, long j2, @org.jetbrains.annotations.NotNull java.lang.String str, int i, @org.jetbrains.annotations.NotNull java.lang.String str2, @org.jetbrains.annotations.NotNull java.util.Date date, @org.jetbrains.annotations.NotNull java.util.Date date2, @org.jetbrains.annotations.NotNull java.lang.String str3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "domain");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "origin");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(date, "createdAt");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(date2, "updatesAt");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "extra");
        this.id = j;
        this.entityId = j2;
        this.domain = str;
        this.state = i;
        this.origin = str2;
        this.createdAt = date;
        this.updatesAt = date2;
        this.extra = str3;
    }

    public static /* synthetic */ com.truecaller.insights.database.models.actionstate.ActionStateEntity copy$default(com.truecaller.insights.database.models.actionstate.ActionStateEntity actionStateEntity, long j, long j2, java.lang.String str, int i, java.lang.String str2, java.util.Date date, java.util.Date date2, java.lang.String str3, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            j = actionStateEntity.id;
        }
        long j3 = j;
        if ((i2 & 2) != 0) {
            j2 = actionStateEntity.entityId;
        }
        return actionStateEntity.copy(j3, j2, (i2 & 4) != 0 ? actionStateEntity.domain : str, (i2 & 8) != 0 ? actionStateEntity.state : i, (i2 & 16) != 0 ? actionStateEntity.origin : str2, (i2 & 32) != 0 ? actionStateEntity.createdAt : date, (i2 & 64) != 0 ? actionStateEntity.updatesAt : date2, (i2 & 128) != 0 ? actionStateEntity.extra : str3);
    }

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final long getEntityId() {
        return this.entityId;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component3, reason: from getter */
    public final java.lang.String getDomain() {
        return this.domain;
    }

    /* renamed from: component4, reason: from getter */
    public final int getState() {
        return this.state;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component5, reason: from getter */
    public final java.lang.String getOrigin() {
        return this.origin;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component6, reason: from getter */
    public final java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component7, reason: from getter */
    public final java.util.Date getUpdatesAt() {
        return this.updatesAt;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component8, reason: from getter */
    public final java.lang.String getExtra() {
        return this.extra;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.insights.database.models.actionstate.ActionStateEntity copy(long id, long entityId, @org.jetbrains.annotations.NotNull java.lang.String domain, int state, @org.jetbrains.annotations.NotNull java.lang.String origin, @org.jetbrains.annotations.NotNull java.util.Date createdAt, @org.jetbrains.annotations.NotNull java.util.Date updatesAt, @org.jetbrains.annotations.NotNull java.lang.String extra) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(domain, "domain");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(origin, "origin");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updatesAt, "updatesAt");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(extra, "extra");
        return new com.truecaller.insights.database.models.actionstate.ActionStateEntity(id, entityId, domain, state, origin, createdAt, updatesAt, extra);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.insights.database.models.actionstate.ActionStateEntity)) {
            return false;
        }
        com.truecaller.insights.database.models.actionstate.ActionStateEntity actionStateEntity = (com.truecaller.insights.database.models.actionstate.ActionStateEntity) other;
        return this.id == actionStateEntity.id && this.entityId == actionStateEntity.entityId && kotlin.jvm.internal.Intrinsics.b(this.domain, actionStateEntity.domain) && this.state == actionStateEntity.state && kotlin.jvm.internal.Intrinsics.b(this.origin, actionStateEntity.origin) && kotlin.jvm.internal.Intrinsics.b(this.createdAt, actionStateEntity.createdAt) && kotlin.jvm.internal.Intrinsics.b(this.updatesAt, actionStateEntity.updatesAt) && kotlin.jvm.internal.Intrinsics.b(this.extra, actionStateEntity.extra);
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getDomain() {
        return this.domain;
    }

    public final long getEntityId() {
        return this.entityId;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getExtra() {
        return this.extra;
    }

    public final long getId() {
        return this.id;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getOrigin() {
        return this.origin;
    }

    public final int getState() {
        return this.state;
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.Date getUpdatesAt() {
        return this.updatesAt;
    }

    public int hashCode() {
        long j = this.id;
        long j2 = this.entityId;
        return this.extra.hashCode() + uf.qux.h(this.updatesAt, uf.qux.h(this.createdAt, ax1.bar.e((ax1.bar.e(((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31, 31, this.domain) + this.state) * 31, 31, this.origin), 31), 31);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        long j = this.id;
        long j2 = this.entityId;
        java.lang.String str = this.domain;
        int i = this.state;
        java.lang.String str2 = this.origin;
        java.util.Date date = this.createdAt;
        java.util.Date date2 = this.updatesAt;
        java.lang.String str3 = this.extra;
        java.lang.StringBuilder T = h0.b.T(j, "ActionStateEntity(id=", ", entityId=");
        ro0.f.K(T, j2, ", domain=", str);
        T.append(", state=");
        T.append(i);
        T.append(", origin=");
        T.append(str2);
        T.append(", createdAt=");
        T.append(date);
        T.append(", updatesAt=");
        T.append(date2);
        return y.o.f(", extra=", str3, ")", T);
    }

    public /* synthetic */ ActionStateEntity(long j, long j2, java.lang.String str, int i, java.lang.String str2, java.util.Date date, java.util.Date date2, java.lang.String str3, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0L : j, j2, str, i, (i2 & 16) != 0 ? "SMS" : str2, (i2 & 32) != 0 ? new java.util.Date() : date, (i2 & 64) != 0 ? new java.util.Date() : date2, (i2 & 128) != 0 ? "" : str3);
    }
}
