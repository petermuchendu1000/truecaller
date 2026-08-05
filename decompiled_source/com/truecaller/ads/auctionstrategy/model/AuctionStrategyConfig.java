package com.truecaller.ads.auctionstrategy.model;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/truecaller/ads/auctionstrategy/model/AuctionStrategyConfig;", "", "tagPrice", "", "placement", "", "reqTime", "", "<init>", "(FLjava/lang/String;J)V", "getTagPrice", "()F", "getPlacement", "()Ljava/lang/String;", "getReqTime", "()J", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "ads-legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class AuctionStrategyConfig {
    public static final int $stable = 0;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String placement;
    private final long reqTime;
    private final float tagPrice;

    public AuctionStrategyConfig(float f, @org.jetbrains.annotations.NotNull java.lang.String str, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "placement");
        this.tagPrice = f;
        this.placement = str;
        this.reqTime = j;
    }

    public static /* synthetic */ com.truecaller.ads.auctionstrategy.model.AuctionStrategyConfig copy$default(com.truecaller.ads.auctionstrategy.model.AuctionStrategyConfig auctionStrategyConfig, float f, java.lang.String str, long j, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            f = auctionStrategyConfig.tagPrice;
        }
        if ((i & 2) != 0) {
            str = auctionStrategyConfig.placement;
        }
        if ((i & 4) != 0) {
            j = auctionStrategyConfig.reqTime;
        }
        return auctionStrategyConfig.copy(f, str, j);
    }

    /* renamed from: component1, reason: from getter */
    public final float getTagPrice() {
        return this.tagPrice;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component2, reason: from getter */
    public final java.lang.String getPlacement() {
        return this.placement;
    }

    /* renamed from: component3, reason: from getter */
    public final long getReqTime() {
        return this.reqTime;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.ads.auctionstrategy.model.AuctionStrategyConfig copy(float tagPrice, @org.jetbrains.annotations.NotNull java.lang.String placement, long reqTime) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(placement, "placement");
        return new com.truecaller.ads.auctionstrategy.model.AuctionStrategyConfig(tagPrice, placement, reqTime);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.ads.auctionstrategy.model.AuctionStrategyConfig)) {
            return false;
        }
        com.truecaller.ads.auctionstrategy.model.AuctionStrategyConfig auctionStrategyConfig = (com.truecaller.ads.auctionstrategy.model.AuctionStrategyConfig) other;
        return java.lang.Float.compare(this.tagPrice, auctionStrategyConfig.tagPrice) == 0 && kotlin.jvm.internal.Intrinsics.b(this.placement, auctionStrategyConfig.placement) && this.reqTime == auctionStrategyConfig.reqTime;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getPlacement() {
        return this.placement;
    }

    public final long getReqTime() {
        return this.reqTime;
    }

    public final float getTagPrice() {
        return this.tagPrice;
    }

    public int hashCode() {
        int e = ax1.bar.e(java.lang.Float.floatToIntBits(this.tagPrice) * 31, 31, this.placement);
        long j = this.reqTime;
        return e + ((int) (j ^ (j >>> 32)));
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        float f = this.tagPrice;
        java.lang.String str = this.placement;
        long j = this.reqTime;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AuctionStrategyConfig(tagPrice=");
        sb.append(f);
        sb.append(", placement=");
        sb.append(str);
        sb.append(", reqTime=");
        return bar.n(j, ")", sb);
    }
}
