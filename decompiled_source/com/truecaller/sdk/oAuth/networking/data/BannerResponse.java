package com.truecaller.sdk.oAuth.networking.data;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\fJ*\u0010\u0010\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\f¨\u0006\u0019"}, d2 = {"Lcom/truecaller/sdk/oAuth/networking/data/BannerResponse;", "", "bannerList", "", "Lcom/truecaller/sdk/oAuth/networking/data/BannerData;", "ttl", "", "<init>", "(Ljava/util/List;Ljava/lang/Long;)V", "getBannerList", "()Ljava/util/List;", "getTtl", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", "copy", "(Ljava/util/List;Ljava/lang/Long;)Lcom/truecaller/sdk/oAuth/networking/data/BannerResponse;", "equals", "", "other", "hashCode", "", "toString", "", "sdk-internal_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final /* data */ class BannerResponse {
    public static final int $stable = 8;

    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.truecaller.sdk.oAuth.networking.data.BannerData> bannerList;

    @org.jetbrains.annotations.Nullable
    private final java.lang.Long ttl;

    public BannerResponse(@org.jetbrains.annotations.NotNull java.util.List<com.truecaller.sdk.oAuth.networking.data.BannerData> list, @org.jetbrains.annotations.Nullable java.lang.Long l) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "bannerList");
        this.bannerList = list;
        this.ttl = l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.truecaller.sdk.oAuth.networking.data.BannerResponse copy$default(com.truecaller.sdk.oAuth.networking.data.BannerResponse bannerResponse, java.util.List list, java.lang.Long l, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = bannerResponse.bannerList;
        }
        if ((i & 2) != 0) {
            l = bannerResponse.ttl;
        }
        return bannerResponse.copy(list, l);
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.truecaller.sdk.oAuth.networking.data.BannerData> component1() {
        return this.bannerList;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component2, reason: from getter */
    public final java.lang.Long getTtl() {
        return this.ttl;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.sdk.oAuth.networking.data.BannerResponse copy(@org.jetbrains.annotations.NotNull java.util.List<com.truecaller.sdk.oAuth.networking.data.BannerData> bannerList, @org.jetbrains.annotations.Nullable java.lang.Long ttl) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bannerList, "bannerList");
        return new com.truecaller.sdk.oAuth.networking.data.BannerResponse(bannerList, ttl);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.sdk.oAuth.networking.data.BannerResponse)) {
            return false;
        }
        com.truecaller.sdk.oAuth.networking.data.BannerResponse bannerResponse = (com.truecaller.sdk.oAuth.networking.data.BannerResponse) other;
        return kotlin.jvm.internal.Intrinsics.b(this.bannerList, bannerResponse.bannerList) && kotlin.jvm.internal.Intrinsics.b(this.ttl, bannerResponse.ttl);
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.truecaller.sdk.oAuth.networking.data.BannerData> getBannerList() {
        return this.bannerList;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Long getTtl() {
        return this.ttl;
    }

    public int hashCode() {
        int hashCode = this.bannerList.hashCode() * 31;
        java.lang.Long l = this.ttl;
        return hashCode + (l == null ? 0 : l.hashCode());
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return "BannerResponse(bannerList=" + this.bannerList + ", ttl=" + this.ttl + ")";
    }
}
