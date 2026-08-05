package com.truecaller.ads.util;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u001a\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J\u000f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003JW\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0001J\u0013\u0010 \u001a\u00020\u00052\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020\u0003HÖ\u0001J\t\u0010#\u001a\u00020\nHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016¨\u0006$"}, d2 = {"Lcom/truecaller/ads/util/AdClickRestrictionOverlayConfig;", "", com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.ID_COLUMN, "", "enable", "", "intervalInMs", "", "adTypes", "", "", "placements", "partners", "<init>", "(IZJLjava/util/List;Ljava/util/List;Ljava/util/List;)V", "getId", "()I", "getEnable", "()Z", "getIntervalInMs", "()J", "getAdTypes", "()Ljava/util/List;", "getPlacements", "getPartners", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "toString", "ads-legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class AdClickRestrictionOverlayConfig {
    public static final int $stable = 8;

    @org.jetbrains.annotations.NotNull
    private final java.util.List<java.lang.String> adTypes;
    private final boolean enable;
    private final int id;
    private final long intervalInMs;

    @org.jetbrains.annotations.NotNull
    private final java.util.List<java.lang.String> partners;

    @org.jetbrains.annotations.NotNull
    private final java.util.List<java.lang.String> placements;

    public AdClickRestrictionOverlayConfig(int i, boolean z, long j, @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> list, @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> list2, @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> list3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "adTypes");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "placements");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list3, "partners");
        this.id = i;
        this.enable = z;
        this.intervalInMs = j;
        this.adTypes = list;
        this.placements = list2;
        this.partners = list3;
    }

    public static /* synthetic */ com.truecaller.ads.util.AdClickRestrictionOverlayConfig copy$default(com.truecaller.ads.util.AdClickRestrictionOverlayConfig adClickRestrictionOverlayConfig, int i, boolean z, long j, java.util.List list, java.util.List list2, java.util.List list3, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = adClickRestrictionOverlayConfig.id;
        }
        if ((i2 & 2) != 0) {
            z = adClickRestrictionOverlayConfig.enable;
        }
        if ((i2 & 4) != 0) {
            j = adClickRestrictionOverlayConfig.intervalInMs;
        }
        if ((i2 & 8) != 0) {
            list = adClickRestrictionOverlayConfig.adTypes;
        }
        if ((i2 & 16) != 0) {
            list2 = adClickRestrictionOverlayConfig.placements;
        }
        if ((i2 & 32) != 0) {
            list3 = adClickRestrictionOverlayConfig.partners;
        }
        java.util.List list4 = list3;
        java.util.List list5 = list;
        long j2 = j;
        return adClickRestrictionOverlayConfig.copy(i, z, j2, list5, list2, list4);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getEnable() {
        return this.enable;
    }

    /* renamed from: component3, reason: from getter */
    public final long getIntervalInMs() {
        return this.intervalInMs;
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.String> component4() {
        return this.adTypes;
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.String> component5() {
        return this.placements;
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.String> component6() {
        return this.partners;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.ads.util.AdClickRestrictionOverlayConfig copy(int id, boolean enable, long intervalInMs, @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> adTypes, @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> placements, @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> partners) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adTypes, "adTypes");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(placements, "placements");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(partners, "partners");
        return new com.truecaller.ads.util.AdClickRestrictionOverlayConfig(id, enable, intervalInMs, adTypes, placements, partners);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.ads.util.AdClickRestrictionOverlayConfig)) {
            return false;
        }
        com.truecaller.ads.util.AdClickRestrictionOverlayConfig adClickRestrictionOverlayConfig = (com.truecaller.ads.util.AdClickRestrictionOverlayConfig) other;
        return this.id == adClickRestrictionOverlayConfig.id && this.enable == adClickRestrictionOverlayConfig.enable && this.intervalInMs == adClickRestrictionOverlayConfig.intervalInMs && kotlin.jvm.internal.Intrinsics.b(this.adTypes, adClickRestrictionOverlayConfig.adTypes) && kotlin.jvm.internal.Intrinsics.b(this.placements, adClickRestrictionOverlayConfig.placements) && kotlin.jvm.internal.Intrinsics.b(this.partners, adClickRestrictionOverlayConfig.partners);
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.String> getAdTypes() {
        return this.adTypes;
    }

    public final boolean getEnable() {
        return this.enable;
    }

    public final int getId() {
        return this.id;
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
        int i2 = this.id * 31;
        if (this.enable) {
            i = 1231;
        } else {
            i = 1237;
        }
        int i3 = (i2 + i) * 31;
        long j = this.intervalInMs;
        return this.partners.hashCode() + uf.qux.g(uf.qux.g((i3 + ((int) (j ^ (j >>> 32)))) * 31, 31, this.adTypes), 31, this.placements);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return "AdClickRestrictionOverlayConfig(id=" + this.id + ", enable=" + this.enable + ", intervalInMs=" + this.intervalInMs + ", adTypes=" + this.adTypes + ", placements=" + this.placements + ", partners=" + this.partners + ")";
    }
}
