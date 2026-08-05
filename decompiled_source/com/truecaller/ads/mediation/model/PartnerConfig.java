package com.truecaller.ads.mediation.model;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\bHÆ\u0003J-\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001a"}, d2 = {"Lcom/truecaller/ads/mediation/model/PartnerConfig;", "", "version", "", "partner", "", "Lcom/truecaller/ads/mediation/model/Partner;", "supportExceptionHandling", "", "<init>", "(Ljava/lang/String;Ljava/util/List;Z)V", "getVersion", "()Ljava/lang/String;", "getPartner", "()Ljava/util/List;", "getSupportExceptionHandling", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "ads-legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class PartnerConfig {
    public static final int $stable = 8;

    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.truecaller.ads.mediation.model.Partner> partner;
    private final boolean supportExceptionHandling;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String version;

    public PartnerConfig(@org.jetbrains.annotations.NotNull java.lang.String str, @org.jetbrains.annotations.NotNull java.util.List<com.truecaller.ads.mediation.model.Partner> list, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "version");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "partner");
        this.version = str;
        this.partner = list;
        this.supportExceptionHandling = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.truecaller.ads.mediation.model.PartnerConfig copy$default(com.truecaller.ads.mediation.model.PartnerConfig partnerConfig, java.lang.String str, java.util.List list, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = partnerConfig.version;
        }
        if ((i & 2) != 0) {
            list = partnerConfig.partner;
        }
        if ((i & 4) != 0) {
            z = partnerConfig.supportExceptionHandling;
        }
        return partnerConfig.copy(str, list, z);
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component1, reason: from getter */
    public final java.lang.String getVersion() {
        return this.version;
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.truecaller.ads.mediation.model.Partner> component2() {
        return this.partner;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getSupportExceptionHandling() {
        return this.supportExceptionHandling;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.ads.mediation.model.PartnerConfig copy(@org.jetbrains.annotations.NotNull java.lang.String version, @org.jetbrains.annotations.NotNull java.util.List<com.truecaller.ads.mediation.model.Partner> partner, boolean supportExceptionHandling) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(version, "version");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(partner, "partner");
        return new com.truecaller.ads.mediation.model.PartnerConfig(version, partner, supportExceptionHandling);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.ads.mediation.model.PartnerConfig)) {
            return false;
        }
        com.truecaller.ads.mediation.model.PartnerConfig partnerConfig = (com.truecaller.ads.mediation.model.PartnerConfig) other;
        return kotlin.jvm.internal.Intrinsics.b(this.version, partnerConfig.version) && kotlin.jvm.internal.Intrinsics.b(this.partner, partnerConfig.partner) && this.supportExceptionHandling == partnerConfig.supportExceptionHandling;
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.truecaller.ads.mediation.model.Partner> getPartner() {
        return this.partner;
    }

    public final boolean getSupportExceptionHandling() {
        return this.supportExceptionHandling;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getVersion() {
        return this.version;
    }

    public int hashCode() {
        int i;
        int g = uf.qux.g(this.version.hashCode() * 31, 31, this.partner);
        if (this.supportExceptionHandling) {
            i = 1231;
        } else {
            i = 1237;
        }
        return g + i;
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        java.lang.String str = this.version;
        java.util.List<com.truecaller.ads.mediation.model.Partner> list = this.partner;
        return h8.s0.s(com.appsflyer.internal.e.r("PartnerConfig(version=", str, ", partner=", list, ", supportExceptionHandling="), this.supportExceptionHandling, ")");
    }

    public /* synthetic */ PartnerConfig(java.lang.String str, java.util.List list, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, (i & 4) != 0 ? false : z);
    }
}
