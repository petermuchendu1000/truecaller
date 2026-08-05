package com.truecaller.ads.mediation.model;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/truecaller/ads/mediation/model/AmazonPriceConfig;", "", "version", "", "config", "", "Lcom/truecaller/ads/mediation/model/AmazonPriceData;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getVersion", "()Ljava/lang/String;", "getConfig", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "ads-legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class AmazonPriceConfig {
    public static final int $stable = 8;

    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.truecaller.ads.mediation.model.AmazonPriceData> config;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String version;

    public AmazonPriceConfig(@org.jetbrains.annotations.NotNull java.lang.String str, @org.jetbrains.annotations.NotNull java.util.List<com.truecaller.ads.mediation.model.AmazonPriceData> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "version");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "config");
        this.version = str;
        this.config = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.truecaller.ads.mediation.model.AmazonPriceConfig copy$default(com.truecaller.ads.mediation.model.AmazonPriceConfig amazonPriceConfig, java.lang.String str, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = amazonPriceConfig.version;
        }
        if ((i & 2) != 0) {
            list = amazonPriceConfig.config;
        }
        return amazonPriceConfig.copy(str, list);
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component1, reason: from getter */
    public final java.lang.String getVersion() {
        return this.version;
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.truecaller.ads.mediation.model.AmazonPriceData> component2() {
        return this.config;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.ads.mediation.model.AmazonPriceConfig copy(@org.jetbrains.annotations.NotNull java.lang.String version, @org.jetbrains.annotations.NotNull java.util.List<com.truecaller.ads.mediation.model.AmazonPriceData> config) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(version, "version");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "config");
        return new com.truecaller.ads.mediation.model.AmazonPriceConfig(version, config);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.ads.mediation.model.AmazonPriceConfig)) {
            return false;
        }
        com.truecaller.ads.mediation.model.AmazonPriceConfig amazonPriceConfig = (com.truecaller.ads.mediation.model.AmazonPriceConfig) other;
        return kotlin.jvm.internal.Intrinsics.b(this.version, amazonPriceConfig.version) && kotlin.jvm.internal.Intrinsics.b(this.config, amazonPriceConfig.config);
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.truecaller.ads.mediation.model.AmazonPriceData> getConfig() {
        return this.config;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getVersion() {
        return this.version;
    }

    public int hashCode() {
        return this.config.hashCode() + (this.version.hashCode() * 31);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return ro0.f.C("AmazonPriceConfig(version=", this.version, ", config=", this.config, ")");
    }
}
