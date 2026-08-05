package com.truecaller.truestory.domain.data.local.entity;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0002\b\u000e\b\u0087\b\u0018\u0000B=\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016JL\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0001HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000eJ\u0010\u0010\u001a\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0011J\u001a\u0010\u001d\u001a\u00020\u00062\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0002\u001a\u00020\u00018\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0002\u0010\u001f\u001a\u0004\b \u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00018\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b!\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b%\u0010\u0013R\u001a\u0010\b\u001a\u00020\u00068\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\b\u0010$\u001a\u0004\b&\u0010\u0013R\u001a\u0010\n\u001a\u00020\t8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\n\u0010'\u001a\u0004\b(\u0010\u0016¨\u0006)"}, d2 = {"Lcom/truecaller/truestory/domain/data/local/entity/TrueStoryEntity;", "", "id", "url", "", "validForDays", "", "seen", "downloaded", "", "updatedTimeStamp", "<init>", "(Ljava/lang/String;Ljava/lang/String;IZZJ)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()I", "component4", "()Z", "component5", "component6", "()J", "copy", "(Ljava/lang/String;Ljava/lang/String;IZZJ)Lcom/truecaller/truestory/domain/data/local/entity/TrueStoryEntity;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getUrl", "I", "getValidForDays", "Z", "getSeen", "getDownloaded", "J", "getUpdatedTimeStamp", "domain_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final /* data */ class TrueStoryEntity {
    private final boolean downloaded;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String id;
    private final boolean seen;
    private final long updatedTimeStamp;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String url;
    private final int validForDays;

    public TrueStoryEntity(@org.jetbrains.annotations.NotNull java.lang.String str, @org.jetbrains.annotations.NotNull java.lang.String str2, int i, boolean z, boolean z2, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "id");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "url");
        this.id = str;
        this.url = str2;
        this.validForDays = i;
        this.seen = z;
        this.downloaded = z2;
        this.updatedTimeStamp = j;
    }

    public static /* synthetic */ com.truecaller.truestory.domain.data.local.entity.TrueStoryEntity copy$default(com.truecaller.truestory.domain.data.local.entity.TrueStoryEntity trueStoryEntity, java.lang.String str, java.lang.String str2, int i, boolean z, boolean z2, long j, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            str = trueStoryEntity.id;
        }
        if ((i2 & 2) != 0) {
            str2 = trueStoryEntity.url;
        }
        if ((i2 & 4) != 0) {
            i = trueStoryEntity.validForDays;
        }
        if ((i2 & 8) != 0) {
            z = trueStoryEntity.seen;
        }
        if ((i2 & 16) != 0) {
            z2 = trueStoryEntity.downloaded;
        }
        if ((i2 & 32) != 0) {
            j = trueStoryEntity.updatedTimeStamp;
        }
        long j2 = j;
        boolean z3 = z2;
        int i3 = i;
        return trueStoryEntity.copy(str, str2, i3, z, z3, j2);
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component2, reason: from getter */
    public final java.lang.String getUrl() {
        return this.url;
    }

    /* renamed from: component3, reason: from getter */
    public final int getValidForDays() {
        return this.validForDays;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getSeen() {
        return this.seen;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getDownloaded() {
        return this.downloaded;
    }

    /* renamed from: component6, reason: from getter */
    public final long getUpdatedTimeStamp() {
        return this.updatedTimeStamp;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.truestory.domain.data.local.entity.TrueStoryEntity copy(@org.jetbrains.annotations.NotNull java.lang.String id, @org.jetbrains.annotations.NotNull java.lang.String url, int validForDays, boolean seen, boolean downloaded, long updatedTimeStamp) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "id");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
        return new com.truecaller.truestory.domain.data.local.entity.TrueStoryEntity(id, url, validForDays, seen, downloaded, updatedTimeStamp);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.truestory.domain.data.local.entity.TrueStoryEntity)) {
            return false;
        }
        com.truecaller.truestory.domain.data.local.entity.TrueStoryEntity trueStoryEntity = (com.truecaller.truestory.domain.data.local.entity.TrueStoryEntity) other;
        return kotlin.jvm.internal.Intrinsics.b(this.id, trueStoryEntity.id) && kotlin.jvm.internal.Intrinsics.b(this.url, trueStoryEntity.url) && this.validForDays == trueStoryEntity.validForDays && this.seen == trueStoryEntity.seen && this.downloaded == trueStoryEntity.downloaded && this.updatedTimeStamp == trueStoryEntity.updatedTimeStamp;
    }

    public boolean getDownloaded() {
        return this.downloaded;
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String getId() {
        return this.id;
    }

    public boolean getSeen() {
        return this.seen;
    }

    public long getUpdatedTimeStamp() {
        return this.updatedTimeStamp;
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String getUrl() {
        return this.url;
    }

    public int getValidForDays() {
        return this.validForDays;
    }

    public int hashCode() {
        int i;
        int e = (ax1.bar.e(this.id.hashCode() * 31, 31, this.url) + this.validForDays) * 31;
        int i2 = 1237;
        if (this.seen) {
            i = 1231;
        } else {
            i = 1237;
        }
        int i3 = (e + i) * 31;
        if (this.downloaded) {
            i2 = 1231;
        }
        long j = this.updatedTimeStamp;
        return ((i3 + i2) * 31) + ((int) (j ^ (j >>> 32)));
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        java.lang.String str = this.id;
        java.lang.String str2 = this.url;
        int i = this.validForDays;
        boolean z = this.seen;
        boolean z2 = this.downloaded;
        long j = this.updatedTimeStamp;
        java.lang.StringBuilder E = ro0.f.E("TrueStoryEntity(id=", str, ", url=", str2, ", validForDays=");
        com.ironsource.adqualitysdk.sdk.i.bar.r(i, ", seen=", ", downloaded=", E, z);
        E.append(z2);
        E.append(", updatedTimeStamp=");
        E.append(j);
        E.append(")");
        return E.toString();
    }

    public /* synthetic */ TrueStoryEntity(java.lang.String str, java.lang.String str2, int i, boolean z, boolean z2, long j, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, i, (i2 & 8) != 0 ? false : z, (i2 & 16) != 0 ? false : z2, (i2 & 32) != 0 ? java.lang.System.currentTimeMillis() : j);
    }
}
