package com.truecaller.ads.auctionstrategy.model;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/truecaller/ads/auctionstrategy/model/AdsAuctionStrategyConfig;", "", "version", "", "placements", "", "Lcom/truecaller/ads/auctionstrategy/model/AuctionPlacement;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getVersion", "()Ljava/lang/String;", "getPlacements", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "ads-legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class AdsAuctionStrategyConfig {
    public static final int $stable = 8;

    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.truecaller.ads.auctionstrategy.model.AuctionPlacement> placements;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String version;

    public AdsAuctionStrategyConfig(@org.jetbrains.annotations.NotNull java.lang.String str, @org.jetbrains.annotations.NotNull java.util.List<com.truecaller.ads.auctionstrategy.model.AuctionPlacement> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "version");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "placements");
        this.version = str;
        this.placements = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.truecaller.ads.auctionstrategy.model.AdsAuctionStrategyConfig copy$default(com.truecaller.ads.auctionstrategy.model.AdsAuctionStrategyConfig adsAuctionStrategyConfig, java.lang.String str, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = adsAuctionStrategyConfig.version;
        }
        if ((i & 2) != 0) {
            list = adsAuctionStrategyConfig.placements;
        }
        return adsAuctionStrategyConfig.copy(str, list);
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component1, reason: from getter */
    public final java.lang.String getVersion() {
        return this.version;
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.truecaller.ads.auctionstrategy.model.AuctionPlacement> component2() {
        return this.placements;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.ads.auctionstrategy.model.AdsAuctionStrategyConfig copy(@org.jetbrains.annotations.NotNull java.lang.String version, @org.jetbrains.annotations.NotNull java.util.List<com.truecaller.ads.auctionstrategy.model.AuctionPlacement> placements) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(version, "version");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(placements, "placements");
        return new com.truecaller.ads.auctionstrategy.model.AdsAuctionStrategyConfig(version, placements);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.ads.auctionstrategy.model.AdsAuctionStrategyConfig)) {
            return false;
        }
        com.truecaller.ads.auctionstrategy.model.AdsAuctionStrategyConfig adsAuctionStrategyConfig = (com.truecaller.ads.auctionstrategy.model.AdsAuctionStrategyConfig) other;
        return kotlin.jvm.internal.Intrinsics.b(this.version, adsAuctionStrategyConfig.version) && kotlin.jvm.internal.Intrinsics.b(this.placements, adsAuctionStrategyConfig.placements);
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.truecaller.ads.auctionstrategy.model.AuctionPlacement> getPlacements() {
        return this.placements;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getVersion() {
        return this.version;
    }

    public int hashCode() {
        return this.placements.hashCode() + (this.version.hashCode() * 31);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return ro0.f.C("AdsAuctionStrategyConfig(version=", this.version, ", placements=", this.placements, ")");
    }
}
