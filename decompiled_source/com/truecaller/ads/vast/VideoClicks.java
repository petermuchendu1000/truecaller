package com.truecaller.ads.vast;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0001\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0003\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/truecaller/ads/vast/VideoClicks;", "", "clickThrough", "Lcom/truecaller/ads/vast/ClickThrough;", "clickTracking", "", "Lcom/truecaller/ads/vast/ClickTracking;", "<init>", "(Lcom/truecaller/ads/vast/ClickThrough;Ljava/util/List;)V", "getClickThrough", "()Lcom/truecaller/ads/vast/ClickThrough;", "getClickTracking", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ads-legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class VideoClicks {
    public static final int $stable = 8;

    @org.jetbrains.annotations.Nullable
    private final com.truecaller.ads.vast.ClickThrough clickThrough;

    @org.jetbrains.annotations.Nullable
    private final java.util.List<com.truecaller.ads.vast.ClickTracking> clickTracking;

    public VideoClicks(@ak.f0("ClickThrough") @hl.qux(localName = "ClickThrough") @org.jetbrains.annotations.Nullable com.truecaller.ads.vast.ClickThrough clickThrough, @ak.f0("ClickTracking") @org.jetbrains.annotations.Nullable java.util.List<com.truecaller.ads.vast.ClickTracking> list) {
        this.clickThrough = clickThrough;
        this.clickTracking = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.truecaller.ads.vast.VideoClicks copy$default(com.truecaller.ads.vast.VideoClicks videoClicks, com.truecaller.ads.vast.ClickThrough clickThrough, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            clickThrough = videoClicks.clickThrough;
        }
        if ((i & 2) != 0) {
            list = videoClicks.clickTracking;
        }
        return videoClicks.copy(clickThrough, list);
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component1, reason: from getter */
    public final com.truecaller.ads.vast.ClickThrough getClickThrough() {
        return this.clickThrough;
    }

    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.truecaller.ads.vast.ClickTracking> component2() {
        return this.clickTracking;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.ads.vast.VideoClicks copy(@ak.f0("ClickThrough") @hl.qux(localName = "ClickThrough") @org.jetbrains.annotations.Nullable com.truecaller.ads.vast.ClickThrough clickThrough, @ak.f0("ClickTracking") @org.jetbrains.annotations.Nullable java.util.List<com.truecaller.ads.vast.ClickTracking> clickTracking) {
        return new com.truecaller.ads.vast.VideoClicks(clickThrough, clickTracking);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.ads.vast.VideoClicks)) {
            return false;
        }
        com.truecaller.ads.vast.VideoClicks videoClicks = (com.truecaller.ads.vast.VideoClicks) other;
        return kotlin.jvm.internal.Intrinsics.b(this.clickThrough, videoClicks.clickThrough) && kotlin.jvm.internal.Intrinsics.b(this.clickTracking, videoClicks.clickTracking);
    }

    @org.jetbrains.annotations.Nullable
    public final com.truecaller.ads.vast.ClickThrough getClickThrough() {
        return this.clickThrough;
    }

    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.truecaller.ads.vast.ClickTracking> getClickTracking() {
        return this.clickTracking;
    }

    public int hashCode() {
        com.truecaller.ads.vast.ClickThrough clickThrough = this.clickThrough;
        int hashCode = (clickThrough == null ? 0 : clickThrough.hashCode()) * 31;
        java.util.List<com.truecaller.ads.vast.ClickTracking> list = this.clickTracking;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return "VideoClicks(clickThrough=" + this.clickThrough + ", clickTracking=" + this.clickTracking + ")";
    }
}
