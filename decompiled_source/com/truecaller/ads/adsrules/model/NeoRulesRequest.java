package com.truecaller.ads.adsrules.model;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\u0013\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00100\u001a\u000201HÖ\u0001J\t\u00102\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\u0005R\u001c\u0010\f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0007\"\u0004\b\u000e\u0010\u0005R\u001a\u0010\u000f\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0007\"\u0004\b\u0011\u0010\u0005R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0007\"\u0004\b\u0014\u0010\u0005R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0007\"\u0004\b\u001d\u0010\u0005R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0007\"\u0004\b \u0010\u0005R\u0013\u0010!\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0007R\u0013\u0010#\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0007R\u001c\u0010%\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0007\"\u0004\b'\u0010\u0005R\u001c\u0010(\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0007\"\u0004\b*\u0010\u0005¨\u00063"}, d2 = {"Lcom/truecaller/ads/adsrules/model/NeoRulesRequest;", "", "placement", "", "<init>", "(Ljava/lang/String;)V", "getPlacement", "()Ljava/lang/String;", "setPlacement", "adId", "getAdId", "setAdId", "network", "getNetwork", "setNetwork", "badge", "getBadge", "setBadge", "number", "getNumber", "setNumber", "contact", "Lcom/truecaller/ads/adsrules/model/ContactType;", "getContact", "()Lcom/truecaller/ads/adsrules/model/ContactType;", "setContact", "(Lcom/truecaller/ads/adsrules/model/ContactType;)V", "direction", "getDirection", "setDirection", "callId", "getCallId", "setCallId", "duration", "getDuration", "fill", "getFill", "experimentId", "getExperimentId", "setExperimentId", "audienceCohort", "getAudienceCohort", "setAudienceCohort", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "ads-legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class NeoRulesRequest {
    public static final int $stable = 8;

    @org.jetbrains.annotations.Nullable
    private java.lang.String adId;

    @org.jetbrains.annotations.Nullable
    private java.lang.String audienceCohort;

    @org.jetbrains.annotations.NotNull
    private java.lang.String badge;

    @org.jetbrains.annotations.Nullable
    private java.lang.String callId;

    @org.jetbrains.annotations.NotNull
    private com.truecaller.ads.adsrules.model.ContactType contact;

    @org.jetbrains.annotations.Nullable
    private java.lang.String direction;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String duration;

    @org.jetbrains.annotations.Nullable
    private java.lang.String experimentId;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String fill;

    @org.jetbrains.annotations.Nullable
    private java.lang.String network;

    @org.jetbrains.annotations.Nullable
    private java.lang.String number;

    @org.jetbrains.annotations.NotNull
    private java.lang.String placement;

    public NeoRulesRequest(@org.jetbrains.annotations.NotNull java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "placement");
        this.placement = str;
        java.lang.String s0 = gj.m.s0(0);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(s0, "toString(...)");
        this.badge = s0;
        this.contact = com.truecaller.ads.adsrules.model.ContactType.UNKNOWN;
    }

    public static /* synthetic */ com.truecaller.ads.adsrules.model.NeoRulesRequest copy$default(com.truecaller.ads.adsrules.model.NeoRulesRequest neoRulesRequest, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = neoRulesRequest.placement;
        }
        return neoRulesRequest.copy(str);
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component1, reason: from getter */
    public final java.lang.String getPlacement() {
        return this.placement;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.ads.adsrules.model.NeoRulesRequest copy(@org.jetbrains.annotations.NotNull java.lang.String placement) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(placement, "placement");
        return new com.truecaller.ads.adsrules.model.NeoRulesRequest(placement);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.truecaller.ads.adsrules.model.NeoRulesRequest) && kotlin.jvm.internal.Intrinsics.b(this.placement, ((com.truecaller.ads.adsrules.model.NeoRulesRequest) other).placement);
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getAdId() {
        return this.adId;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getAudienceCohort() {
        return this.audienceCohort;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getBadge() {
        return this.badge;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getCallId() {
        return this.callId;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.ads.adsrules.model.ContactType getContact() {
        return this.contact;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getDirection() {
        return this.direction;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getDuration() {
        return this.duration;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getExperimentId() {
        return this.experimentId;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getFill() {
        return this.fill;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getNetwork() {
        return this.network;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getNumber() {
        return this.number;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getPlacement() {
        return this.placement;
    }

    public int hashCode() {
        return this.placement.hashCode();
    }

    public final void setAdId(@org.jetbrains.annotations.Nullable java.lang.String str) {
        this.adId = str;
    }

    public final void setAudienceCohort(@org.jetbrains.annotations.Nullable java.lang.String str) {
        this.audienceCohort = str;
    }

    public final void setBadge(@org.jetbrains.annotations.NotNull java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.badge = str;
    }

    public final void setCallId(@org.jetbrains.annotations.Nullable java.lang.String str) {
        this.callId = str;
    }

    public final void setContact(@org.jetbrains.annotations.NotNull com.truecaller.ads.adsrules.model.ContactType contactType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contactType, "<set-?>");
        this.contact = contactType;
    }

    public final void setDirection(@org.jetbrains.annotations.Nullable java.lang.String str) {
        this.direction = str;
    }

    public final void setExperimentId(@org.jetbrains.annotations.Nullable java.lang.String str) {
        this.experimentId = str;
    }

    public final void setNetwork(@org.jetbrains.annotations.Nullable java.lang.String str) {
        this.network = str;
    }

    public final void setNumber(@org.jetbrains.annotations.Nullable java.lang.String str) {
        this.number = str;
    }

    public final void setPlacement(@org.jetbrains.annotations.NotNull java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.placement = str;
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return bar.t("NeoRulesRequest(placement=", this.placement, ")");
    }
}
