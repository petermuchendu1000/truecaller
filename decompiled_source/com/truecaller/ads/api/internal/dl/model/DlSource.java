package com.truecaller.ads.api.internal.dl.model;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b¨\u0006\u001c"}, d2 = {"Lcom/truecaller/ads/api/internal/dl/model/DlSource;", "", "Lcom/truecaller/ads/api/model/ad/AdSource;", "adSource", "Lw20/k;", "sourceConfig", "<init>", "(Lcom/truecaller/ads/api/model/ad/AdSource;Lw20/k;)V", "component1", "()Lcom/truecaller/ads/api/model/ad/AdSource;", "component2", "()Lw20/k;", "copy", "(Lcom/truecaller/ads/api/model/ad/AdSource;Lw20/k;)Lcom/truecaller/ads/api/internal/dl/model/DlSource;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/truecaller/ads/api/model/ad/AdSource;", "getAdSource", "Lw20/k;", "getSourceConfig", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class DlSource {

    @org.jetbrains.annotations.NotNull
    private final com.truecaller.ads.api.model.ad.AdSource adSource;

    @org.jetbrains.annotations.NotNull
    private final w20.k sourceConfig;

    public DlSource(@org.jetbrains.annotations.NotNull com.truecaller.ads.api.model.ad.AdSource adSource, @org.jetbrains.annotations.NotNull w20.k kVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adSource, "adSource");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kVar, "sourceConfig");
        this.adSource = adSource;
        this.sourceConfig = kVar;
    }

    public static /* synthetic */ com.truecaller.ads.api.internal.dl.model.DlSource copy$default(com.truecaller.ads.api.internal.dl.model.DlSource dlSource, com.truecaller.ads.api.model.ad.AdSource adSource, w20.k kVar, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            adSource = dlSource.adSource;
        }
        if ((i & 2) != 0) {
            kVar = dlSource.sourceConfig;
        }
        return dlSource.copy(adSource, kVar);
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component1, reason: from getter */
    public final com.truecaller.ads.api.model.ad.AdSource getAdSource() {
        return this.adSource;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component2, reason: from getter */
    public final w20.k getSourceConfig() {
        return this.sourceConfig;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.ads.api.internal.dl.model.DlSource copy(@org.jetbrains.annotations.NotNull com.truecaller.ads.api.model.ad.AdSource adSource, @org.jetbrains.annotations.NotNull w20.k sourceConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adSource, "adSource");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sourceConfig, "sourceConfig");
        return new com.truecaller.ads.api.internal.dl.model.DlSource(adSource, sourceConfig);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.ads.api.internal.dl.model.DlSource)) {
            return false;
        }
        com.truecaller.ads.api.internal.dl.model.DlSource dlSource = (com.truecaller.ads.api.internal.dl.model.DlSource) other;
        return this.adSource == dlSource.adSource && kotlin.jvm.internal.Intrinsics.b(this.sourceConfig, dlSource.sourceConfig);
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.ads.api.model.ad.AdSource getAdSource() {
        return this.adSource;
    }

    @org.jetbrains.annotations.NotNull
    public final w20.k getSourceConfig() {
        return this.sourceConfig;
    }

    public int hashCode() {
        return this.sourceConfig.hashCode() + (this.adSource.hashCode() * 31);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return "DlSource(adSource=" + this.adSource + ", sourceConfig=" + this.sourceConfig + ")";
    }
}
