package com.truecaller.ads.domain.dl.data.cache.datastore;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/truecaller/ads/domain/dl/data/cache/datastore/DlCacheEntry;", "", "dl", "Lcom/truecaller/ads/api/internal/dl/model/DlScreen;", "expiryTimestamp", "", "isConsumed", "", "<init>", "(Lcom/truecaller/ads/api/internal/dl/model/DlScreen;JZ)V", "getDl", "()Lcom/truecaller/ads/api/internal/dl/model/DlScreen;", "getExpiryTimestamp", "()J", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "domain-dl_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class DlCacheEntry {

    @org.jetbrains.annotations.NotNull
    private final com.truecaller.ads.api.internal.dl.model.DlScreen dl;
    private final long expiryTimestamp;
    private final boolean isConsumed;

    public DlCacheEntry(@org.jetbrains.annotations.NotNull com.truecaller.ads.api.internal.dl.model.DlScreen dlScreen, long j, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dlScreen, "dl");
        this.dl = dlScreen;
        this.expiryTimestamp = j;
        this.isConsumed = z;
    }

    public static /* synthetic */ com.truecaller.ads.domain.dl.data.cache.datastore.DlCacheEntry copy$default(com.truecaller.ads.domain.dl.data.cache.datastore.DlCacheEntry dlCacheEntry, com.truecaller.ads.api.internal.dl.model.DlScreen dlScreen, long j, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            dlScreen = dlCacheEntry.dl;
        }
        if ((i & 2) != 0) {
            j = dlCacheEntry.expiryTimestamp;
        }
        if ((i & 4) != 0) {
            z = dlCacheEntry.isConsumed;
        }
        return dlCacheEntry.copy(dlScreen, j, z);
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component1, reason: from getter */
    public final com.truecaller.ads.api.internal.dl.model.DlScreen getDl() {
        return this.dl;
    }

    /* renamed from: component2, reason: from getter */
    public final long getExpiryTimestamp() {
        return this.expiryTimestamp;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsConsumed() {
        return this.isConsumed;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.ads.domain.dl.data.cache.datastore.DlCacheEntry copy(@org.jetbrains.annotations.NotNull com.truecaller.ads.api.internal.dl.model.DlScreen dl, long expiryTimestamp, boolean isConsumed) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dl, "dl");
        return new com.truecaller.ads.domain.dl.data.cache.datastore.DlCacheEntry(dl, expiryTimestamp, isConsumed);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.ads.domain.dl.data.cache.datastore.DlCacheEntry)) {
            return false;
        }
        com.truecaller.ads.domain.dl.data.cache.datastore.DlCacheEntry dlCacheEntry = (com.truecaller.ads.domain.dl.data.cache.datastore.DlCacheEntry) other;
        return kotlin.jvm.internal.Intrinsics.b(this.dl, dlCacheEntry.dl) && this.expiryTimestamp == dlCacheEntry.expiryTimestamp && this.isConsumed == dlCacheEntry.isConsumed;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.ads.api.internal.dl.model.DlScreen getDl() {
        return this.dl;
    }

    public final long getExpiryTimestamp() {
        return this.expiryTimestamp;
    }

    public int hashCode() {
        int i;
        int hashCode = this.dl.hashCode() * 31;
        long j = this.expiryTimestamp;
        int i2 = (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
        if (this.isConsumed) {
            i = 1231;
        } else {
            i = 1237;
        }
        return i2 + i;
    }

    public final boolean isConsumed() {
        return this.isConsumed;
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        com.truecaller.ads.api.internal.dl.model.DlScreen dlScreen = this.dl;
        long j = this.expiryTimestamp;
        boolean z = this.isConsumed;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DlCacheEntry(dl=");
        sb.append(dlScreen);
        sb.append(", expiryTimestamp=");
        sb.append(j);
        return com.appsflyer.internal.e.n(sb, ", isConsumed=", z, ")");
    }

    public /* synthetic */ DlCacheEntry(com.truecaller.ads.api.internal.dl.model.DlScreen dlScreen, long j, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(dlScreen, j, (i & 4) != 0 ? false : z);
    }
}
