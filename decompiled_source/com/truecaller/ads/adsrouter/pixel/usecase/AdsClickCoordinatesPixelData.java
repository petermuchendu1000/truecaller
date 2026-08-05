package com.truecaller.ads.adsrouter.pixel.usecase;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\u000f¨\u0006\""}, d2 = {"Lcom/truecaller/ads/adsrouter/pixel/usecase/AdsClickCoordinatesPixelData;", "", "Lh10/a;", "ad", "Lcom/truecaller/ads/analytics/qux;", "clickPosition", "Lcom/truecaller/ads/analytics/o;", "screenSize", "<init>", "(Lh10/a;Lcom/truecaller/ads/analytics/qux;Lcom/truecaller/ads/analytics/o;)V", "component1", "()Lh10/a;", "component2", "()Lcom/truecaller/ads/analytics/qux;", "component3", "()Lcom/truecaller/ads/analytics/o;", "copy", "(Lh10/a;Lcom/truecaller/ads/analytics/qux;Lcom/truecaller/ads/analytics/o;)Lcom/truecaller/ads/adsrouter/pixel/usecase/AdsClickCoordinatesPixelData;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lh10/a;", "getAd", "Lcom/truecaller/ads/analytics/qux;", "getClickPosition", "Lcom/truecaller/ads/analytics/o;", "getScreenSize", "ads-legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class AdsClickCoordinatesPixelData {
    public static final int $stable = 8;

    @org.jetbrains.annotations.NotNull
    private final h10.a ad;

    @org.jetbrains.annotations.NotNull
    private final com.truecaller.ads.analytics.qux clickPosition;

    @org.jetbrains.annotations.NotNull
    private final com.truecaller.ads.analytics.o screenSize;

    public AdsClickCoordinatesPixelData(@org.jetbrains.annotations.NotNull h10.a aVar, @org.jetbrains.annotations.NotNull com.truecaller.ads.analytics.qux quxVar, @org.jetbrains.annotations.NotNull com.truecaller.ads.analytics.o oVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(aVar, "ad");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(quxVar, "clickPosition");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(oVar, "screenSize");
        this.ad = aVar;
        this.clickPosition = quxVar;
        this.screenSize = oVar;
    }

    public static /* synthetic */ com.truecaller.ads.adsrouter.pixel.usecase.AdsClickCoordinatesPixelData copy$default(com.truecaller.ads.adsrouter.pixel.usecase.AdsClickCoordinatesPixelData adsClickCoordinatesPixelData, h10.a aVar, com.truecaller.ads.analytics.qux quxVar, com.truecaller.ads.analytics.o oVar, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            aVar = adsClickCoordinatesPixelData.ad;
        }
        if ((i & 2) != 0) {
            quxVar = adsClickCoordinatesPixelData.clickPosition;
        }
        if ((i & 4) != 0) {
            oVar = adsClickCoordinatesPixelData.screenSize;
        }
        return adsClickCoordinatesPixelData.copy(aVar, quxVar, oVar);
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component1, reason: from getter */
    public final h10.a getAd() {
        return this.ad;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component2, reason: from getter */
    public final com.truecaller.ads.analytics.qux getClickPosition() {
        return this.clickPosition;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component3, reason: from getter */
    public final com.truecaller.ads.analytics.o getScreenSize() {
        return this.screenSize;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.ads.adsrouter.pixel.usecase.AdsClickCoordinatesPixelData copy(@org.jetbrains.annotations.NotNull h10.a ad, @org.jetbrains.annotations.NotNull com.truecaller.ads.analytics.qux clickPosition, @org.jetbrains.annotations.NotNull com.truecaller.ads.analytics.o screenSize) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ad, "ad");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(clickPosition, "clickPosition");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(screenSize, "screenSize");
        return new com.truecaller.ads.adsrouter.pixel.usecase.AdsClickCoordinatesPixelData(ad, clickPosition, screenSize);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.ads.adsrouter.pixel.usecase.AdsClickCoordinatesPixelData)) {
            return false;
        }
        com.truecaller.ads.adsrouter.pixel.usecase.AdsClickCoordinatesPixelData adsClickCoordinatesPixelData = (com.truecaller.ads.adsrouter.pixel.usecase.AdsClickCoordinatesPixelData) other;
        return kotlin.jvm.internal.Intrinsics.b(this.ad, adsClickCoordinatesPixelData.ad) && kotlin.jvm.internal.Intrinsics.b(this.clickPosition, adsClickCoordinatesPixelData.clickPosition) && kotlin.jvm.internal.Intrinsics.b(this.screenSize, adsClickCoordinatesPixelData.screenSize);
    }

    @org.jetbrains.annotations.NotNull
    public final h10.a getAd() {
        return this.ad;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.ads.analytics.qux getClickPosition() {
        return this.clickPosition;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.ads.analytics.o getScreenSize() {
        return this.screenSize;
    }

    public int hashCode() {
        return this.screenSize.hashCode() + ((this.clickPosition.hashCode() + (this.ad.hashCode() * 31)) * 31);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return "AdsClickCoordinatesPixelData(ad=" + this.ad + ", clickPosition=" + this.clickPosition + ", screenSize=" + this.screenSize + ")";
    }
}
