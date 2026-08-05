package com.truecaller.ads.vast;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/truecaller/ads/vast/WrapperResult;", "", "ad", "Lcom/truecaller/ads/vast/VASTAd;", "trackers", "Lcom/truecaller/ads/vast/VastTrackers;", "<init>", "(Lcom/truecaller/ads/vast/VASTAd;Lcom/truecaller/ads/vast/VastTrackers;)V", "getAd", "()Lcom/truecaller/ads/vast/VASTAd;", "getTrackers", "()Lcom/truecaller/ads/vast/VastTrackers;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ads-legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class WrapperResult {
    public static final int $stable = 8;

    @org.jetbrains.annotations.NotNull
    private final com.truecaller.ads.vast.VASTAd ad;

    @org.jetbrains.annotations.NotNull
    private final com.truecaller.ads.vast.VastTrackers trackers;

    public WrapperResult(@org.jetbrains.annotations.NotNull com.truecaller.ads.vast.VASTAd vASTAd, @org.jetbrains.annotations.NotNull com.truecaller.ads.vast.VastTrackers vastTrackers) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(vASTAd, "ad");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(vastTrackers, "trackers");
        this.ad = vASTAd;
        this.trackers = vastTrackers;
    }

    public static /* synthetic */ com.truecaller.ads.vast.WrapperResult copy$default(com.truecaller.ads.vast.WrapperResult wrapperResult, com.truecaller.ads.vast.VASTAd vASTAd, com.truecaller.ads.vast.VastTrackers vastTrackers, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            vASTAd = wrapperResult.ad;
        }
        if ((i & 2) != 0) {
            vastTrackers = wrapperResult.trackers;
        }
        return wrapperResult.copy(vASTAd, vastTrackers);
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component1, reason: from getter */
    public final com.truecaller.ads.vast.VASTAd getAd() {
        return this.ad;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component2, reason: from getter */
    public final com.truecaller.ads.vast.VastTrackers getTrackers() {
        return this.trackers;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.ads.vast.WrapperResult copy(@org.jetbrains.annotations.NotNull com.truecaller.ads.vast.VASTAd ad, @org.jetbrains.annotations.NotNull com.truecaller.ads.vast.VastTrackers trackers) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ad, "ad");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(trackers, "trackers");
        return new com.truecaller.ads.vast.WrapperResult(ad, trackers);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.ads.vast.WrapperResult)) {
            return false;
        }
        com.truecaller.ads.vast.WrapperResult wrapperResult = (com.truecaller.ads.vast.WrapperResult) other;
        return kotlin.jvm.internal.Intrinsics.b(this.ad, wrapperResult.ad) && kotlin.jvm.internal.Intrinsics.b(this.trackers, wrapperResult.trackers);
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.ads.vast.VASTAd getAd() {
        return this.ad;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.ads.vast.VastTrackers getTrackers() {
        return this.trackers;
    }

    public int hashCode() {
        return this.trackers.hashCode() + (this.ad.hashCode() * 31);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return "WrapperResult(ad=" + this.ad + ", trackers=" + this.trackers + ")";
    }
}
