package com.truecaller.ads.vast;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\n0\u0003HÆ\u0003JY\u0010\u0018\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u00032\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0003HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0004HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000e¨\u0006\u001f"}, d2 = {"Lcom/truecaller/ads/vast/VastTrackers;", "", "impressions", "", "", "clickTracking", "trackingEvents", "Lcom/truecaller/ads/vast/Tracking;", "clickThrough", "verifications", "Lcom/truecaller/ads/vast/Verification;", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getImpressions", "()Ljava/util/List;", "getClickTracking", "getTrackingEvents", "getClickThrough", "getVerifications", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "ads-legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class VastTrackers {
    public static final int $stable = 8;

    @org.jetbrains.annotations.NotNull
    private final java.util.List<java.lang.String> clickThrough;

    @org.jetbrains.annotations.NotNull
    private final java.util.List<java.lang.String> clickTracking;

    @org.jetbrains.annotations.NotNull
    private final java.util.List<java.lang.String> impressions;

    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.truecaller.ads.vast.Tracking> trackingEvents;

    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.truecaller.ads.vast.Verification> verifications;

    public VastTrackers() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ com.truecaller.ads.vast.VastTrackers copy$default(com.truecaller.ads.vast.VastTrackers vastTrackers, java.util.List list, java.util.List list2, java.util.List list3, java.util.List list4, java.util.List list5, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = vastTrackers.impressions;
        }
        if ((i & 2) != 0) {
            list2 = vastTrackers.clickTracking;
        }
        if ((i & 4) != 0) {
            list3 = vastTrackers.trackingEvents;
        }
        if ((i & 8) != 0) {
            list4 = vastTrackers.clickThrough;
        }
        if ((i & 16) != 0) {
            list5 = vastTrackers.verifications;
        }
        java.util.List list6 = list5;
        java.util.List list7 = list3;
        return vastTrackers.copy(list, list2, list7, list4, list6);
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.String> component1() {
        return this.impressions;
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.String> component2() {
        return this.clickTracking;
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.truecaller.ads.vast.Tracking> component3() {
        return this.trackingEvents;
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.String> component4() {
        return this.clickThrough;
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.truecaller.ads.vast.Verification> component5() {
        return this.verifications;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.ads.vast.VastTrackers copy(@org.jetbrains.annotations.NotNull java.util.List<java.lang.String> impressions, @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> clickTracking, @org.jetbrains.annotations.NotNull java.util.List<com.truecaller.ads.vast.Tracking> trackingEvents, @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> clickThrough, @org.jetbrains.annotations.NotNull java.util.List<com.truecaller.ads.vast.Verification> verifications) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(impressions, "impressions");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(clickTracking, "clickTracking");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(trackingEvents, "trackingEvents");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(clickThrough, "clickThrough");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(verifications, "verifications");
        return new com.truecaller.ads.vast.VastTrackers(impressions, clickTracking, trackingEvents, clickThrough, verifications);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.ads.vast.VastTrackers)) {
            return false;
        }
        com.truecaller.ads.vast.VastTrackers vastTrackers = (com.truecaller.ads.vast.VastTrackers) other;
        return kotlin.jvm.internal.Intrinsics.b(this.impressions, vastTrackers.impressions) && kotlin.jvm.internal.Intrinsics.b(this.clickTracking, vastTrackers.clickTracking) && kotlin.jvm.internal.Intrinsics.b(this.trackingEvents, vastTrackers.trackingEvents) && kotlin.jvm.internal.Intrinsics.b(this.clickThrough, vastTrackers.clickThrough) && kotlin.jvm.internal.Intrinsics.b(this.verifications, vastTrackers.verifications);
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.String> getClickThrough() {
        return this.clickThrough;
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.String> getClickTracking() {
        return this.clickTracking;
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.String> getImpressions() {
        return this.impressions;
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.truecaller.ads.vast.Tracking> getTrackingEvents() {
        return this.trackingEvents;
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.truecaller.ads.vast.Verification> getVerifications() {
        return this.verifications;
    }

    public int hashCode() {
        return this.verifications.hashCode() + uf.qux.g(uf.qux.g(uf.qux.g(this.impressions.hashCode() * 31, 31, this.clickTracking), 31, this.trackingEvents), 31, this.clickThrough);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        java.util.List<java.lang.String> list = this.impressions;
        java.util.List<java.lang.String> list2 = this.clickTracking;
        java.util.List<com.truecaller.ads.vast.Tracking> list3 = this.trackingEvents;
        java.util.List<java.lang.String> list4 = this.clickThrough;
        java.util.List<com.truecaller.ads.vast.Verification> list5 = this.verifications;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("VastTrackers(impressions=");
        sb.append(list);
        sb.append(", clickTracking=");
        sb.append(list2);
        sb.append(", trackingEvents=");
        com.ironsource.adqualitysdk.sdk.i.bar.y(sb, list3, ", clickThrough=", list4, ", verifications=");
        return y.o.g(sb, list5, ")");
    }

    public VastTrackers(@org.jetbrains.annotations.NotNull java.util.List<java.lang.String> list, @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> list2, @org.jetbrains.annotations.NotNull java.util.List<com.truecaller.ads.vast.Tracking> list3, @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> list4, @org.jetbrains.annotations.NotNull java.util.List<com.truecaller.ads.vast.Verification> list5) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "impressions");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "clickTracking");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list3, "trackingEvents");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list4, "clickThrough");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list5, "verifications");
        this.impressions = list;
        this.clickTracking = list2;
        this.trackingEvents = list3;
        this.clickThrough = list4;
        this.verifications = list5;
    }

    public /* synthetic */ VastTrackers(java.util.List list, java.util.List list2, java.util.List list3, java.util.List list4, java.util.List list5, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new java.util.ArrayList() : list, (i & 2) != 0 ? new java.util.ArrayList() : list2, (i & 4) != 0 ? new java.util.ArrayList() : list3, (i & 8) != 0 ? new java.util.ArrayList() : list4, (i & 16) != 0 ? new java.util.ArrayList() : list5);
    }
}
