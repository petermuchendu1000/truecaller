package com.truecaller.ads.analytics;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0083\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/truecaller/ads/analytics/AdsEventStatusConfig;", "", "adRequestEvent", "", "adAcsEvent", "adFunnelEvent", "<init>", "(ZZZ)V", "getAdRequestEvent", "()Z", "getAdAcsEvent", "getAdFunnelEvent", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "ads-legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
final /* data */ class AdsEventStatusConfig {
    private final boolean adAcsEvent;
    private final boolean adFunnelEvent;
    private final boolean adRequestEvent;

    public AdsEventStatusConfig(boolean z, boolean z2, boolean z3) {
        this.adRequestEvent = z;
        this.adAcsEvent = z2;
        this.adFunnelEvent = z3;
    }

    public static /* synthetic */ com.truecaller.ads.analytics.AdsEventStatusConfig copy$default(com.truecaller.ads.analytics.AdsEventStatusConfig adsEventStatusConfig, boolean z, boolean z2, boolean z3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = adsEventStatusConfig.adRequestEvent;
        }
        if ((i & 2) != 0) {
            z2 = adsEventStatusConfig.adAcsEvent;
        }
        if ((i & 4) != 0) {
            z3 = adsEventStatusConfig.adFunnelEvent;
        }
        return adsEventStatusConfig.copy(z, z2, z3);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getAdRequestEvent() {
        return this.adRequestEvent;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getAdAcsEvent() {
        return this.adAcsEvent;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getAdFunnelEvent() {
        return this.adFunnelEvent;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.ads.analytics.AdsEventStatusConfig copy(boolean adRequestEvent, boolean adAcsEvent, boolean adFunnelEvent) {
        return new com.truecaller.ads.analytics.AdsEventStatusConfig(adRequestEvent, adAcsEvent, adFunnelEvent);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.ads.analytics.AdsEventStatusConfig)) {
            return false;
        }
        com.truecaller.ads.analytics.AdsEventStatusConfig adsEventStatusConfig = (com.truecaller.ads.analytics.AdsEventStatusConfig) other;
        return this.adRequestEvent == adsEventStatusConfig.adRequestEvent && this.adAcsEvent == adsEventStatusConfig.adAcsEvent && this.adFunnelEvent == adsEventStatusConfig.adFunnelEvent;
    }

    public final boolean getAdAcsEvent() {
        return this.adAcsEvent;
    }

    public final boolean getAdFunnelEvent() {
        return this.adFunnelEvent;
    }

    public final boolean getAdRequestEvent() {
        return this.adRequestEvent;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3 = 1237;
        if (this.adRequestEvent) {
            i = 1231;
        } else {
            i = 1237;
        }
        int i4 = i * 31;
        if (this.adAcsEvent) {
            i2 = 1231;
        } else {
            i2 = 1237;
        }
        int i5 = (i4 + i2) * 31;
        if (this.adFunnelEvent) {
            i3 = 1231;
        }
        return i5 + i3;
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        boolean z = this.adRequestEvent;
        boolean z2 = this.adAcsEvent;
        return h8.s0.s(bx.e1.v("AdsEventStatusConfig(adRequestEvent=", ", adAcsEvent=", ", adFunnelEvent=", z, z2), this.adFunnelEvent, ")");
    }
}
