package com.truecaller.ads.util;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\t\u0010\u001e\u001a\u00020\fHÆ\u0003JW\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010 \u001a\u00020\u00032\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006%"}, d2 = {"Lcom/truecaller/ads/util/AdClickGuardConfig;", "", "enable", "", "intervalInMs", "", "adTypes", "", "", "placements", "partners", "clickGuard", "Lcom/truecaller/ads/adsrouter/model/ClickGuard;", "<init>", "(ZJLjava/util/List;Ljava/util/List;Ljava/util/List;Lcom/truecaller/ads/adsrouter/model/ClickGuard;)V", "getEnable", "()Z", "getIntervalInMs", "()J", "getAdTypes", "()Ljava/util/List;", "getPlacements", "getPartners", "getClickGuard", "()Lcom/truecaller/ads/adsrouter/model/ClickGuard;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "ads-legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class AdClickGuardConfig {
    public static final int $stable = 8;

    @org.jetbrains.annotations.NotNull
    private final java.util.List<java.lang.String> adTypes;

    @org.jetbrains.annotations.NotNull
    private final com.truecaller.ads.adsrouter.model.ClickGuard clickGuard;
    private final boolean enable;
    private final long intervalInMs;

    @org.jetbrains.annotations.NotNull
    private final java.util.List<java.lang.String> partners;

    @org.jetbrains.annotations.NotNull
    private final java.util.List<java.lang.String> placements;

    public AdClickGuardConfig(boolean z, long j, @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> list, @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> list2, @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> list3, @org.jetbrains.annotations.NotNull com.truecaller.ads.adsrouter.model.ClickGuard clickGuard) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "adTypes");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "placements");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list3, "partners");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(clickGuard, "clickGuard");
        this.enable = z;
        this.intervalInMs = j;
        this.adTypes = list;
        this.placements = list2;
        this.partners = list3;
        this.clickGuard = clickGuard;
    }

    public static /* synthetic */ com.truecaller.ads.util.AdClickGuardConfig copy$default(com.truecaller.ads.util.AdClickGuardConfig adClickGuardConfig, boolean z, long j, java.util.List list, java.util.List list2, java.util.List list3, com.truecaller.ads.adsrouter.model.ClickGuard clickGuard, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = adClickGuardConfig.enable;
        }
        if ((i & 2) != 0) {
            j = adClickGuardConfig.intervalInMs;
        }
        if ((i & 4) != 0) {
            list = adClickGuardConfig.adTypes;
        }
        if ((i & 8) != 0) {
            list2 = adClickGuardConfig.placements;
        }
        if ((i & 16) != 0) {
            list3 = adClickGuardConfig.partners;
        }
        if ((i & 32) != 0) {
            clickGuard = adClickGuardConfig.clickGuard;
        }
        return adClickGuardConfig.copy(z, j, list, list2, list3, clickGuard);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getEnable() {
        return this.enable;
    }

    /* renamed from: component2, reason: from getter */
    public final long getIntervalInMs() {
        return this.intervalInMs;
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.String> component3() {
        return this.adTypes;
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.String> component4() {
        return this.placements;
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.String> component5() {
        return this.partners;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component6, reason: from getter */
    public final com.truecaller.ads.adsrouter.model.ClickGuard getClickGuard() {
        return this.clickGuard;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.ads.util.AdClickGuardConfig copy(boolean enable, long intervalInMs, @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> adTypes, @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> placements, @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> partners, @org.jetbrains.annotations.NotNull com.truecaller.ads.adsrouter.model.ClickGuard clickGuard) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adTypes, "adTypes");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(placements, "placements");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(partners, "partners");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(clickGuard, "clickGuard");
        return new com.truecaller.ads.util.AdClickGuardConfig(enable, intervalInMs, adTypes, placements, partners, clickGuard);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.ads.util.AdClickGuardConfig)) {
            return false;
        }
        com.truecaller.ads.util.AdClickGuardConfig adClickGuardConfig = (com.truecaller.ads.util.AdClickGuardConfig) other;
        return this.enable == adClickGuardConfig.enable && this.intervalInMs == adClickGuardConfig.intervalInMs && kotlin.jvm.internal.Intrinsics.b(this.adTypes, adClickGuardConfig.adTypes) && kotlin.jvm.internal.Intrinsics.b(this.placements, adClickGuardConfig.placements) && kotlin.jvm.internal.Intrinsics.b(this.partners, adClickGuardConfig.partners) && kotlin.jvm.internal.Intrinsics.b(this.clickGuard, adClickGuardConfig.clickGuard);
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.String> getAdTypes() {
        return this.adTypes;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.ads.adsrouter.model.ClickGuard getClickGuard() {
        return this.clickGuard;
    }

    public final boolean getEnable() {
        return this.enable;
    }

    public final long getIntervalInMs() {
        return this.intervalInMs;
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.String> getPartners() {
        return this.partners;
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.String> getPlacements() {
        return this.placements;
    }

    public int hashCode() {
        int i;
        if (this.enable) {
            i = 1231;
        } else {
            i = 1237;
        }
        long j = this.intervalInMs;
        return this.clickGuard.hashCode() + uf.qux.g(uf.qux.g(uf.qux.g(((i * 31) + ((int) (j ^ (j >>> 32)))) * 31, 31, this.adTypes), 31, this.placements), 31, this.partners);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return "AdClickGuardConfig(enable=" + this.enable + ", intervalInMs=" + this.intervalInMs + ", adTypes=" + this.adTypes + ", placements=" + this.placements + ", partners=" + this.partners + ", clickGuard=" + this.clickGuard + ")";
    }
}
