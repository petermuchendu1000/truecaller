package com.truecaller.ads.mediation.model;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/truecaller/ads/mediation/model/PartnerNotificationBidResult;", "", "rtbAdData", "Lcom/truecaller/ads/mediation/helper/RtbDataHelperImpl$RtbAdData;", "partner", "Lcom/truecaller/ads/mediation/model/Partner;", "<init>", "(Lcom/truecaller/ads/mediation/helper/RtbDataHelperImpl$RtbAdData;Lcom/truecaller/ads/mediation/model/Partner;)V", "getRtbAdData", "()Lcom/truecaller/ads/mediation/helper/RtbDataHelperImpl$RtbAdData;", "getPartner", "()Lcom/truecaller/ads/mediation/model/Partner;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ads-legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class PartnerNotificationBidResult {
    public static final int $stable = 8;

    @org.jetbrains.annotations.Nullable
    private final com.truecaller.ads.mediation.model.Partner partner;

    @org.jetbrains.annotations.Nullable
    private final com.truecaller.ads.mediation.helper.RtbDataHelperImpl$RtbAdData rtbAdData;

    public PartnerNotificationBidResult(@org.jetbrains.annotations.Nullable com.truecaller.ads.mediation.helper.RtbDataHelperImpl$RtbAdData rtbDataHelperImpl$RtbAdData, @org.jetbrains.annotations.Nullable com.truecaller.ads.mediation.model.Partner partner) {
        this.rtbAdData = rtbDataHelperImpl$RtbAdData;
        this.partner = partner;
    }

    public static /* synthetic */ com.truecaller.ads.mediation.model.PartnerNotificationBidResult copy$default(com.truecaller.ads.mediation.model.PartnerNotificationBidResult partnerNotificationBidResult, com.truecaller.ads.mediation.helper.RtbDataHelperImpl$RtbAdData rtbDataHelperImpl$RtbAdData, com.truecaller.ads.mediation.model.Partner partner, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            rtbDataHelperImpl$RtbAdData = partnerNotificationBidResult.rtbAdData;
        }
        if ((i & 2) != 0) {
            partner = partnerNotificationBidResult.partner;
        }
        return partnerNotificationBidResult.copy(rtbDataHelperImpl$RtbAdData, partner);
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component1, reason: from getter */
    public final com.truecaller.ads.mediation.helper.RtbDataHelperImpl$RtbAdData getRtbAdData() {
        return this.rtbAdData;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component2, reason: from getter */
    public final com.truecaller.ads.mediation.model.Partner getPartner() {
        return this.partner;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.ads.mediation.model.PartnerNotificationBidResult copy(@org.jetbrains.annotations.Nullable com.truecaller.ads.mediation.helper.RtbDataHelperImpl$RtbAdData rtbAdData, @org.jetbrains.annotations.Nullable com.truecaller.ads.mediation.model.Partner partner) {
        return new com.truecaller.ads.mediation.model.PartnerNotificationBidResult(rtbAdData, partner);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.ads.mediation.model.PartnerNotificationBidResult)) {
            return false;
        }
        com.truecaller.ads.mediation.model.PartnerNotificationBidResult partnerNotificationBidResult = (com.truecaller.ads.mediation.model.PartnerNotificationBidResult) other;
        return kotlin.jvm.internal.Intrinsics.b(this.rtbAdData, partnerNotificationBidResult.rtbAdData) && kotlin.jvm.internal.Intrinsics.b(this.partner, partnerNotificationBidResult.partner);
    }

    @org.jetbrains.annotations.Nullable
    public final com.truecaller.ads.mediation.model.Partner getPartner() {
        return this.partner;
    }

    @org.jetbrains.annotations.Nullable
    public final com.truecaller.ads.mediation.helper.RtbDataHelperImpl$RtbAdData getRtbAdData() {
        return this.rtbAdData;
    }

    public int hashCode() {
        com.truecaller.ads.mediation.helper.RtbDataHelperImpl$RtbAdData rtbDataHelperImpl$RtbAdData = this.rtbAdData;
        int hashCode = (rtbDataHelperImpl$RtbAdData == null ? 0 : rtbDataHelperImpl$RtbAdData.hashCode()) * 31;
        com.truecaller.ads.mediation.model.Partner partner = this.partner;
        return hashCode + (partner != null ? partner.hashCode() : 0);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return "PartnerNotificationBidResult(rtbAdData=" + this.rtbAdData + ", partner=" + this.partner + ")";
    }

    public /* synthetic */ PartnerNotificationBidResult(com.truecaller.ads.mediation.helper.RtbDataHelperImpl$RtbAdData rtbDataHelperImpl$RtbAdData, com.truecaller.ads.mediation.model.Partner partner, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(rtbDataHelperImpl$RtbAdData, (i & 2) != 0 ? null : partner);
    }
}
