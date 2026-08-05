package com.truecaller.ads.keywords.model;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\n\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u001e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/truecaller/ads/keywords/model/AdCampaignsRestDto;", "", "keywordPlacements", "", "Lcom/truecaller/ads/keywords/model/AdKeywordPlacementDto;", "<init>", "(Ljava/util/List;)V", "getKeywordPlacements", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ads-legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class AdCampaignsRestDto {
    public static final int $stable = 8;

    @bw.qux("adsKeywords")
    @org.jetbrains.annotations.Nullable
    private final java.util.List<com.truecaller.ads.keywords.model.AdKeywordPlacementDto> keywordPlacements;

    public AdCampaignsRestDto(@org.jetbrains.annotations.Nullable java.util.List<com.truecaller.ads.keywords.model.AdKeywordPlacementDto> list) {
        this.keywordPlacements = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.truecaller.ads.keywords.model.AdCampaignsRestDto copy$default(com.truecaller.ads.keywords.model.AdCampaignsRestDto adCampaignsRestDto, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = adCampaignsRestDto.keywordPlacements;
        }
        return adCampaignsRestDto.copy(list);
    }

    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.truecaller.ads.keywords.model.AdKeywordPlacementDto> component1() {
        return this.keywordPlacements;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.ads.keywords.model.AdCampaignsRestDto copy(@org.jetbrains.annotations.Nullable java.util.List<com.truecaller.ads.keywords.model.AdKeywordPlacementDto> keywordPlacements) {
        return new com.truecaller.ads.keywords.model.AdCampaignsRestDto(keywordPlacements);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.truecaller.ads.keywords.model.AdCampaignsRestDto) && kotlin.jvm.internal.Intrinsics.b(this.keywordPlacements, ((com.truecaller.ads.keywords.model.AdCampaignsRestDto) other).keywordPlacements);
    }

    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.truecaller.ads.keywords.model.AdKeywordPlacementDto> getKeywordPlacements() {
        return this.keywordPlacements;
    }

    public int hashCode() {
        java.util.List<com.truecaller.ads.keywords.model.AdKeywordPlacementDto> list = this.keywordPlacements;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return com.appsflyer.internal.e.k("AdCampaignsRestDto(keywordPlacements=", ")", this.keywordPlacements);
    }
}
