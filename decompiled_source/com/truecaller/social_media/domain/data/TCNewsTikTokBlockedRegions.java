package com.truecaller.social_media.domain.data;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/truecaller/social_media/domain/data/TCNewsTikTokBlockedRegions;", "", "regions", "", "<init>", "(Ljava/lang/String;)V", "getRegions", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "social-media_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final /* data */ class TCNewsTikTokBlockedRegions {

    @org.jetbrains.annotations.NotNull
    private final java.lang.String regions;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public TCNewsTikTokBlockedRegions() {
        this(r0, 1, r0);
        java.lang.String str = null;
    }

    public static /* synthetic */ com.truecaller.social_media.domain.data.TCNewsTikTokBlockedRegions copy$default(com.truecaller.social_media.domain.data.TCNewsTikTokBlockedRegions tCNewsTikTokBlockedRegions, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = tCNewsTikTokBlockedRegions.regions;
        }
        return tCNewsTikTokBlockedRegions.copy(str);
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component1, reason: from getter */
    public final java.lang.String getRegions() {
        return this.regions;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.social_media.domain.data.TCNewsTikTokBlockedRegions copy(@org.jetbrains.annotations.NotNull java.lang.String regions) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(regions, "regions");
        return new com.truecaller.social_media.domain.data.TCNewsTikTokBlockedRegions(regions);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.truecaller.social_media.domain.data.TCNewsTikTokBlockedRegions) && kotlin.jvm.internal.Intrinsics.b(this.regions, ((com.truecaller.social_media.domain.data.TCNewsTikTokBlockedRegions) other).regions);
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getRegions() {
        return this.regions;
    }

    public int hashCode() {
        return this.regions.hashCode();
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return bar.t("TCNewsTikTokBlockedRegions(regions=", this.regions, ")");
    }

    public TCNewsTikTokBlockedRegions(@org.jetbrains.annotations.NotNull java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "regions");
        this.regions = str;
    }

    public /* synthetic */ TCNewsTikTokBlockedRegions(java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str);
    }
}
