package com.truecaller.ads.keywords.model;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u0011\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J8\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, d2 = {"Lcom/truecaller/ads/keywords/model/AdKeywordPlacementDto;", "", "placement", "", "maxAge", "", "campaigns", "", "Lcom/truecaller/ads/keywords/model/AdCampaignDto;", "<init>", "(Ljava/lang/String;Ljava/lang/Long;Ljava/util/List;)V", "getPlacement", "()Ljava/lang/String;", "getMaxAge", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getCampaigns", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/Long;Ljava/util/List;)Lcom/truecaller/ads/keywords/model/AdKeywordPlacementDto;", "equals", "", "other", "hashCode", "", "toString", "ads-legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class AdKeywordPlacementDto {
    public static final int $stable = 8;

    @org.jetbrains.annotations.Nullable
    private final java.util.List<com.truecaller.ads.keywords.model.AdCampaignDto> campaigns;

    @org.jetbrains.annotations.Nullable
    private final java.lang.Long maxAge;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String placement;

    public AdKeywordPlacementDto(@org.jetbrains.annotations.Nullable java.lang.String str, @org.jetbrains.annotations.Nullable java.lang.Long l, @org.jetbrains.annotations.Nullable java.util.List<com.truecaller.ads.keywords.model.AdCampaignDto> list) {
        this.placement = str;
        this.maxAge = l;
        this.campaigns = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.truecaller.ads.keywords.model.AdKeywordPlacementDto copy$default(com.truecaller.ads.keywords.model.AdKeywordPlacementDto adKeywordPlacementDto, java.lang.String str, java.lang.Long l, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = adKeywordPlacementDto.placement;
        }
        if ((i & 2) != 0) {
            l = adKeywordPlacementDto.maxAge;
        }
        if ((i & 4) != 0) {
            list = adKeywordPlacementDto.campaigns;
        }
        return adKeywordPlacementDto.copy(str, l, list);
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component1, reason: from getter */
    public final java.lang.String getPlacement() {
        return this.placement;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component2, reason: from getter */
    public final java.lang.Long getMaxAge() {
        return this.maxAge;
    }

    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.truecaller.ads.keywords.model.AdCampaignDto> component3() {
        return this.campaigns;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.ads.keywords.model.AdKeywordPlacementDto copy(@org.jetbrains.annotations.Nullable java.lang.String placement, @org.jetbrains.annotations.Nullable java.lang.Long maxAge, @org.jetbrains.annotations.Nullable java.util.List<com.truecaller.ads.keywords.model.AdCampaignDto> campaigns) {
        return new com.truecaller.ads.keywords.model.AdKeywordPlacementDto(placement, maxAge, campaigns);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.ads.keywords.model.AdKeywordPlacementDto)) {
            return false;
        }
        com.truecaller.ads.keywords.model.AdKeywordPlacementDto adKeywordPlacementDto = (com.truecaller.ads.keywords.model.AdKeywordPlacementDto) other;
        return kotlin.jvm.internal.Intrinsics.b(this.placement, adKeywordPlacementDto.placement) && kotlin.jvm.internal.Intrinsics.b(this.maxAge, adKeywordPlacementDto.maxAge) && kotlin.jvm.internal.Intrinsics.b(this.campaigns, adKeywordPlacementDto.campaigns);
    }

    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.truecaller.ads.keywords.model.AdCampaignDto> getCampaigns() {
        return this.campaigns;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Long getMaxAge() {
        return this.maxAge;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getPlacement() {
        return this.placement;
    }

    public int hashCode() {
        java.lang.String str = this.placement;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.lang.Long l = this.maxAge;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        java.util.List<com.truecaller.ads.keywords.model.AdCampaignDto> list = this.campaigns;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        java.lang.String str = this.placement;
        java.lang.Long l = this.maxAge;
        java.util.List<com.truecaller.ads.keywords.model.AdCampaignDto> list = this.campaigns;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AdKeywordPlacementDto(placement=");
        sb.append(str);
        sb.append(", maxAge=");
        sb.append(l);
        sb.append(", campaigns=");
        return y.o.g(sb, list, ")");
    }
}
