package com.truecaller.ads.util;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003HÆ\u0003J9\u0010\u0011\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0004HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/truecaller/ads/util/AdAcsFallbackRequestConfig;", "", "adUnits", "", "", "requestSources", "errorCodes", "", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getAdUnits", "()Ljava/util/List;", "getRequestSources", "getErrorCodes", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "ads-legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class AdAcsFallbackRequestConfig {
    public static final int $stable = 8;

    @org.jetbrains.annotations.NotNull
    private final java.util.List<java.lang.String> adUnits;

    @org.jetbrains.annotations.NotNull
    private final java.util.List<java.lang.Integer> errorCodes;

    @org.jetbrains.annotations.NotNull
    private final java.util.List<java.lang.String> requestSources;

    public AdAcsFallbackRequestConfig(@org.jetbrains.annotations.NotNull java.util.List<java.lang.String> list, @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> list2, @org.jetbrains.annotations.NotNull java.util.List<java.lang.Integer> list3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "adUnits");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "requestSources");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list3, "errorCodes");
        this.adUnits = list;
        this.requestSources = list2;
        this.errorCodes = list3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.truecaller.ads.util.AdAcsFallbackRequestConfig copy$default(com.truecaller.ads.util.AdAcsFallbackRequestConfig adAcsFallbackRequestConfig, java.util.List list, java.util.List list2, java.util.List list3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = adAcsFallbackRequestConfig.adUnits;
        }
        if ((i & 2) != 0) {
            list2 = adAcsFallbackRequestConfig.requestSources;
        }
        if ((i & 4) != 0) {
            list3 = adAcsFallbackRequestConfig.errorCodes;
        }
        return adAcsFallbackRequestConfig.copy(list, list2, list3);
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.String> component1() {
        return this.adUnits;
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.String> component2() {
        return this.requestSources;
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.Integer> component3() {
        return this.errorCodes;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.ads.util.AdAcsFallbackRequestConfig copy(@org.jetbrains.annotations.NotNull java.util.List<java.lang.String> adUnits, @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> requestSources, @org.jetbrains.annotations.NotNull java.util.List<java.lang.Integer> errorCodes) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnits, "adUnits");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestSources, "requestSources");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorCodes, "errorCodes");
        return new com.truecaller.ads.util.AdAcsFallbackRequestConfig(adUnits, requestSources, errorCodes);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.ads.util.AdAcsFallbackRequestConfig)) {
            return false;
        }
        com.truecaller.ads.util.AdAcsFallbackRequestConfig adAcsFallbackRequestConfig = (com.truecaller.ads.util.AdAcsFallbackRequestConfig) other;
        return kotlin.jvm.internal.Intrinsics.b(this.adUnits, adAcsFallbackRequestConfig.adUnits) && kotlin.jvm.internal.Intrinsics.b(this.requestSources, adAcsFallbackRequestConfig.requestSources) && kotlin.jvm.internal.Intrinsics.b(this.errorCodes, adAcsFallbackRequestConfig.errorCodes);
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.String> getAdUnits() {
        return this.adUnits;
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.Integer> getErrorCodes() {
        return this.errorCodes;
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.String> getRequestSources() {
        return this.requestSources;
    }

    public int hashCode() {
        return this.errorCodes.hashCode() + uf.qux.g(this.adUnits.hashCode() * 31, 31, this.requestSources);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        java.util.List<java.lang.String> list = this.adUnits;
        java.util.List<java.lang.String> list2 = this.requestSources;
        java.util.List<java.lang.Integer> list3 = this.errorCodes;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AdAcsFallbackRequestConfig(adUnits=");
        sb.append(list);
        sb.append(", requestSources=");
        sb.append(list2);
        sb.append(", errorCodes=");
        return y.o.g(sb, list3, ")");
    }
}
