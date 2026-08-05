package com.truecaller.whosearchedforme.network.data;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/truecaller/whosearchedforme/network/data/WSFMProfileSearch;", "", "tcId", "", "timestamp", "isViewed", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "getTcId", "()Ljava/lang/String;", "getTimestamp", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "whosearchedforme_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final /* data */ class WSFMProfileSearch {

    @bw.qux("isViewed")
    private final boolean isViewed;

    @bw.qux("tcId")
    @org.jetbrains.annotations.NotNull
    private final java.lang.String tcId;

    @bw.qux("timestamp")
    @org.jetbrains.annotations.NotNull
    private final java.lang.String timestamp;

    public WSFMProfileSearch(@org.jetbrains.annotations.NotNull java.lang.String str, @org.jetbrains.annotations.NotNull java.lang.String str2, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "tcId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "timestamp");
        this.tcId = str;
        this.timestamp = str2;
        this.isViewed = z;
    }

    public static /* synthetic */ com.truecaller.whosearchedforme.network.data.WSFMProfileSearch copy$default(com.truecaller.whosearchedforme.network.data.WSFMProfileSearch wSFMProfileSearch, java.lang.String str, java.lang.String str2, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = wSFMProfileSearch.tcId;
        }
        if ((i & 2) != 0) {
            str2 = wSFMProfileSearch.timestamp;
        }
        if ((i & 4) != 0) {
            z = wSFMProfileSearch.isViewed;
        }
        return wSFMProfileSearch.copy(str, str2, z);
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component1, reason: from getter */
    public final java.lang.String getTcId() {
        return this.tcId;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component2, reason: from getter */
    public final java.lang.String getTimestamp() {
        return this.timestamp;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsViewed() {
        return this.isViewed;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.whosearchedforme.network.data.WSFMProfileSearch copy(@org.jetbrains.annotations.NotNull java.lang.String tcId, @org.jetbrains.annotations.NotNull java.lang.String timestamp, boolean isViewed) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tcId, "tcId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timestamp, "timestamp");
        return new com.truecaller.whosearchedforme.network.data.WSFMProfileSearch(tcId, timestamp, isViewed);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.whosearchedforme.network.data.WSFMProfileSearch)) {
            return false;
        }
        com.truecaller.whosearchedforme.network.data.WSFMProfileSearch wSFMProfileSearch = (com.truecaller.whosearchedforme.network.data.WSFMProfileSearch) other;
        return kotlin.jvm.internal.Intrinsics.b(this.tcId, wSFMProfileSearch.tcId) && kotlin.jvm.internal.Intrinsics.b(this.timestamp, wSFMProfileSearch.timestamp) && this.isViewed == wSFMProfileSearch.isViewed;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getTcId() {
        return this.tcId;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        int i;
        int e = ax1.bar.e(this.tcId.hashCode() * 31, 31, this.timestamp);
        if (this.isViewed) {
            i = 1231;
        } else {
            i = 1237;
        }
        return e + i;
    }

    public final boolean isViewed() {
        return this.isViewed;
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        java.lang.String str = this.tcId;
        java.lang.String str2 = this.timestamp;
        return h8.s0.s(ro0.f.E("WSFMProfileSearch(tcId=", str, ", timestamp=", str2, ", isViewed="), this.isViewed, ")");
    }
}
