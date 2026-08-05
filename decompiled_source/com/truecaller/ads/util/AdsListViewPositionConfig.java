package com.truecaller.ads.util;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u001a"}, d2 = {"Lcom/truecaller/ads/util/AdsListViewPositionConfig;", "", "placement", "", "skipLaunchCount", "", "startOffset", "period", "<init>", "(Ljava/lang/String;III)V", "getPlacement", "()Ljava/lang/String;", "getSkipLaunchCount", "()I", "getStartOffset", "getPeriod", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "ads-legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class AdsListViewPositionConfig {
    public static final int $stable = 0;
    private final int period;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String placement;
    private final int skipLaunchCount;
    private final int startOffset;

    public AdsListViewPositionConfig(@org.jetbrains.annotations.NotNull java.lang.String str, int i, int i2, int i3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "placement");
        this.placement = str;
        this.skipLaunchCount = i;
        this.startOffset = i2;
        this.period = i3;
    }

    public static /* synthetic */ com.truecaller.ads.util.AdsListViewPositionConfig copy$default(com.truecaller.ads.util.AdsListViewPositionConfig adsListViewPositionConfig, java.lang.String str, int i, int i2, int i3, int i4, java.lang.Object obj) {
        if ((i4 & 1) != 0) {
            str = adsListViewPositionConfig.placement;
        }
        if ((i4 & 2) != 0) {
            i = adsListViewPositionConfig.skipLaunchCount;
        }
        if ((i4 & 4) != 0) {
            i2 = adsListViewPositionConfig.startOffset;
        }
        if ((i4 & 8) != 0) {
            i3 = adsListViewPositionConfig.period;
        }
        return adsListViewPositionConfig.copy(str, i, i2, i3);
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component1, reason: from getter */
    public final java.lang.String getPlacement() {
        return this.placement;
    }

    /* renamed from: component2, reason: from getter */
    public final int getSkipLaunchCount() {
        return this.skipLaunchCount;
    }

    /* renamed from: component3, reason: from getter */
    public final int getStartOffset() {
        return this.startOffset;
    }

    /* renamed from: component4, reason: from getter */
    public final int getPeriod() {
        return this.period;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.ads.util.AdsListViewPositionConfig copy(@org.jetbrains.annotations.NotNull java.lang.String placement, int skipLaunchCount, int startOffset, int period) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(placement, "placement");
        return new com.truecaller.ads.util.AdsListViewPositionConfig(placement, skipLaunchCount, startOffset, period);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.ads.util.AdsListViewPositionConfig)) {
            return false;
        }
        com.truecaller.ads.util.AdsListViewPositionConfig adsListViewPositionConfig = (com.truecaller.ads.util.AdsListViewPositionConfig) other;
        return kotlin.jvm.internal.Intrinsics.b(this.placement, adsListViewPositionConfig.placement) && this.skipLaunchCount == adsListViewPositionConfig.skipLaunchCount && this.startOffset == adsListViewPositionConfig.startOffset && this.period == adsListViewPositionConfig.period;
    }

    public final int getPeriod() {
        return this.period;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getPlacement() {
        return this.placement;
    }

    public final int getSkipLaunchCount() {
        return this.skipLaunchCount;
    }

    public final int getStartOffset() {
        return this.startOffset;
    }

    public int hashCode() {
        return (((((this.placement.hashCode() * 31) + this.skipLaunchCount) * 31) + this.startOffset) * 31) + this.period;
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        java.lang.String str = this.placement;
        return h8.s0.l(this.startOffset, this.period, ", period=", ")", bar.z("AdsListViewPositionConfig(placement=", this.skipLaunchCount, str, ", skipLaunchCount=", ", startOffset="));
    }

    public /* synthetic */ AdsListViewPositionConfig(java.lang.String str, int i, int i2, int i3, int i4, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i4 & 2) != 0 ? 0 : i, (i4 & 4) != 0 ? 2 : i2, (i4 & 8) != 0 ? 7 : i3);
    }
}
