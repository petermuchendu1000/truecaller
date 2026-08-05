package com.truecaller.ads.api.internal.dl.model;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J@\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0010J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010\u0010R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b$\u0010\u0012R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010%\u001a\u0004\b&\u0010\u0014¨\u0006'"}, d2 = {"Lcom/truecaller/ads/api/internal/dl/model/DlPlacement;", "", "Lcom/truecaller/ads/api/model/ad/AdPlacement;", "adPlacement", "", "maxCards", "", "Lcom/truecaller/ads/api/internal/dl/model/DlSource;", "sources", "Lw20/bar;", "auctionType", "<init>", "(Lcom/truecaller/ads/api/model/ad/AdPlacement;ILjava/util/List;Lw20/bar;)V", "component1", "()Lcom/truecaller/ads/api/model/ad/AdPlacement;", "component2", "()I", "component3", "()Ljava/util/List;", "component4", "()Lw20/bar;", "copy", "(Lcom/truecaller/ads/api/model/ad/AdPlacement;ILjava/util/List;Lw20/bar;)Lcom/truecaller/ads/api/internal/dl/model/DlPlacement;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/truecaller/ads/api/model/ad/AdPlacement;", "getAdPlacement", "I", "getMaxCards", "Ljava/util/List;", "getSources", "Lw20/bar;", "getAuctionType", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class DlPlacement {

    @org.jetbrains.annotations.NotNull
    private final com.truecaller.ads.api.model.ad.AdPlacement adPlacement;

    @org.jetbrains.annotations.Nullable
    private final w20.bar auctionType;
    private final int maxCards;

    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.truecaller.ads.api.internal.dl.model.DlSource> sources;

    public DlPlacement(@org.jetbrains.annotations.NotNull com.truecaller.ads.api.model.ad.AdPlacement adPlacement, int i, @org.jetbrains.annotations.NotNull java.util.List<com.truecaller.ads.api.internal.dl.model.DlSource> list, @org.jetbrains.annotations.Nullable w20.bar barVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adPlacement, "adPlacement");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "sources");
        this.adPlacement = adPlacement;
        this.maxCards = i;
        this.sources = list;
        this.auctionType = barVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.truecaller.ads.api.internal.dl.model.DlPlacement copy$default(com.truecaller.ads.api.internal.dl.model.DlPlacement dlPlacement, com.truecaller.ads.api.model.ad.AdPlacement adPlacement, int i, java.util.List list, w20.bar barVar, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            adPlacement = dlPlacement.adPlacement;
        }
        if ((i2 & 2) != 0) {
            i = dlPlacement.maxCards;
        }
        if ((i2 & 4) != 0) {
            list = dlPlacement.sources;
        }
        if ((i2 & 8) != 0) {
            barVar = dlPlacement.auctionType;
        }
        return dlPlacement.copy(adPlacement, i, list, barVar);
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component1, reason: from getter */
    public final com.truecaller.ads.api.model.ad.AdPlacement getAdPlacement() {
        return this.adPlacement;
    }

    /* renamed from: component2, reason: from getter */
    public final int getMaxCards() {
        return this.maxCards;
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.truecaller.ads.api.internal.dl.model.DlSource> component3() {
        return this.sources;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component4, reason: from getter */
    public final w20.bar getAuctionType() {
        return this.auctionType;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.ads.api.internal.dl.model.DlPlacement copy(@org.jetbrains.annotations.NotNull com.truecaller.ads.api.model.ad.AdPlacement adPlacement, int maxCards, @org.jetbrains.annotations.NotNull java.util.List<com.truecaller.ads.api.internal.dl.model.DlSource> sources, @org.jetbrains.annotations.Nullable w20.bar auctionType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adPlacement, "adPlacement");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sources, "sources");
        return new com.truecaller.ads.api.internal.dl.model.DlPlacement(adPlacement, maxCards, sources, auctionType);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.ads.api.internal.dl.model.DlPlacement)) {
            return false;
        }
        com.truecaller.ads.api.internal.dl.model.DlPlacement dlPlacement = (com.truecaller.ads.api.internal.dl.model.DlPlacement) other;
        return kotlin.jvm.internal.Intrinsics.b(this.adPlacement, dlPlacement.adPlacement) && this.maxCards == dlPlacement.maxCards && kotlin.jvm.internal.Intrinsics.b(this.sources, dlPlacement.sources) && kotlin.jvm.internal.Intrinsics.b(this.auctionType, dlPlacement.auctionType);
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.ads.api.model.ad.AdPlacement getAdPlacement() {
        return this.adPlacement;
    }

    @org.jetbrains.annotations.Nullable
    public final w20.bar getAuctionType() {
        return this.auctionType;
    }

    public final int getMaxCards() {
        return this.maxCards;
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.truecaller.ads.api.internal.dl.model.DlSource> getSources() {
        return this.sources;
    }

    public int hashCode() {
        int hashCode;
        int g = uf.qux.g(((this.adPlacement.hashCode() * 31) + this.maxCards) * 31, 31, this.sources);
        w20.bar barVar = this.auctionType;
        if (barVar == null) {
            hashCode = 0;
        } else {
            hashCode = barVar.hashCode();
        }
        return g + hashCode;
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return "DlPlacement(adPlacement=" + this.adPlacement + ", maxCards=" + this.maxCards + ", sources=" + this.sources + ", auctionType=" + this.auctionType + ")";
    }

    public /* synthetic */ DlPlacement(com.truecaller.ads.api.model.ad.AdPlacement adPlacement, int i, java.util.List list, w20.bar barVar, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(adPlacement, i, list, (i2 & 8) != 0 ? null : barVar);
    }
}
