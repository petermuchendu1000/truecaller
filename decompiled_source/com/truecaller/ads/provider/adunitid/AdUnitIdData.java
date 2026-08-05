package com.truecaller.ads.provider.adunitid;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/truecaller/ads/provider/adunitid/AdUnitIdData;", "", "version", "", "adUnitIds", "", "Lcom/truecaller/ads/provider/adunitid/AdUnitId;", "<init>", "(ILjava/util/List;)V", "getVersion", "()I", "getAdUnitIds", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "ads-legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class AdUnitIdData {
    public static final int $stable = 8;

    @bw.qux("adUnitIds")
    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.truecaller.ads.provider.adunitid.AdUnitId> adUnitIds;

    @bw.qux("version")
    private final int version;

    public AdUnitIdData(int i, @org.jetbrains.annotations.NotNull java.util.List<com.truecaller.ads.provider.adunitid.AdUnitId> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "adUnitIds");
        this.version = i;
        this.adUnitIds = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.truecaller.ads.provider.adunitid.AdUnitIdData copy$default(com.truecaller.ads.provider.adunitid.AdUnitIdData adUnitIdData, int i, java.util.List list, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = adUnitIdData.version;
        }
        if ((i2 & 2) != 0) {
            list = adUnitIdData.adUnitIds;
        }
        return adUnitIdData.copy(i, list);
    }

    /* renamed from: component1, reason: from getter */
    public final int getVersion() {
        return this.version;
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.truecaller.ads.provider.adunitid.AdUnitId> component2() {
        return this.adUnitIds;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.ads.provider.adunitid.AdUnitIdData copy(int version, @org.jetbrains.annotations.NotNull java.util.List<com.truecaller.ads.provider.adunitid.AdUnitId> adUnitIds) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitIds, "adUnitIds");
        return new com.truecaller.ads.provider.adunitid.AdUnitIdData(version, adUnitIds);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.ads.provider.adunitid.AdUnitIdData)) {
            return false;
        }
        com.truecaller.ads.provider.adunitid.AdUnitIdData adUnitIdData = (com.truecaller.ads.provider.adunitid.AdUnitIdData) other;
        return this.version == adUnitIdData.version && kotlin.jvm.internal.Intrinsics.b(this.adUnitIds, adUnitIdData.adUnitIds);
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.truecaller.ads.provider.adunitid.AdUnitId> getAdUnitIds() {
        return this.adUnitIds;
    }

    public final int getVersion() {
        return this.version;
    }

    public int hashCode() {
        return this.adUnitIds.hashCode() + (this.version * 31);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return "AdUnitIdData(version=" + this.version + ", adUnitIds=" + this.adUnitIds + ")";
    }
}
