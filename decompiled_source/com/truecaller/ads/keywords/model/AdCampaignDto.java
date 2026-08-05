package com.truecaller.ads.keywords.model;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/truecaller/ads/keywords/model/AdCampaignDto;", "", com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.ID_COLUMN, "", "style", "Lcom/truecaller/ads/keywords/model/AdCampaignStyleDto;", "<init>", "(Ljava/lang/String;Lcom/truecaller/ads/keywords/model/AdCampaignStyleDto;)V", "getId", "()Ljava/lang/String;", "getStyle", "()Lcom/truecaller/ads/keywords/model/AdCampaignStyleDto;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "ads-legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class AdCampaignDto {
    public static final int $stable = 0;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String id;

    @org.jetbrains.annotations.Nullable
    private final com.truecaller.ads.keywords.model.AdCampaignStyleDto style;

    public AdCampaignDto(@org.jetbrains.annotations.Nullable java.lang.String str, @org.jetbrains.annotations.Nullable com.truecaller.ads.keywords.model.AdCampaignStyleDto adCampaignStyleDto) {
        this.id = str;
        this.style = adCampaignStyleDto;
    }

    public static /* synthetic */ com.truecaller.ads.keywords.model.AdCampaignDto copy$default(com.truecaller.ads.keywords.model.AdCampaignDto adCampaignDto, java.lang.String str, com.truecaller.ads.keywords.model.AdCampaignStyleDto adCampaignStyleDto, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = adCampaignDto.id;
        }
        if ((i & 2) != 0) {
            adCampaignStyleDto = adCampaignDto.style;
        }
        return adCampaignDto.copy(str, adCampaignStyleDto);
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component2, reason: from getter */
    public final com.truecaller.ads.keywords.model.AdCampaignStyleDto getStyle() {
        return this.style;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.ads.keywords.model.AdCampaignDto copy(@org.jetbrains.annotations.Nullable java.lang.String id, @org.jetbrains.annotations.Nullable com.truecaller.ads.keywords.model.AdCampaignStyleDto style) {
        return new com.truecaller.ads.keywords.model.AdCampaignDto(id, style);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.ads.keywords.model.AdCampaignDto)) {
            return false;
        }
        com.truecaller.ads.keywords.model.AdCampaignDto adCampaignDto = (com.truecaller.ads.keywords.model.AdCampaignDto) other;
        return kotlin.jvm.internal.Intrinsics.b(this.id, adCampaignDto.id) && kotlin.jvm.internal.Intrinsics.b(this.style, adCampaignDto.style);
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getId() {
        return this.id;
    }

    @org.jetbrains.annotations.Nullable
    public final com.truecaller.ads.keywords.model.AdCampaignStyleDto getStyle() {
        return this.style;
    }

    public int hashCode() {
        java.lang.String str = this.id;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        com.truecaller.ads.keywords.model.AdCampaignStyleDto adCampaignStyleDto = this.style;
        return hashCode + (adCampaignStyleDto != null ? adCampaignStyleDto.hashCode() : 0);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return "AdCampaignDto(id=" + this.id + ", style=" + this.style + ")";
    }
}
