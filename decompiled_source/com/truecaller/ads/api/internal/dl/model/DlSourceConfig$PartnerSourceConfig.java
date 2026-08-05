package com.truecaller.ads.api.internal.dl.model;

@kotlin.Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\n\u001a\u00020\t2\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\b¨\u0006\u0018"}, d2 = {"com/truecaller/ads/api/internal/dl/model/DlSourceConfig$PartnerSourceConfig", "Lw20/k;", "", "", "partners", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "Lcom/truecaller/ads/api/internal/dl/model/DlSourceConfig$PartnerSourceConfig;", "copy", "(Ljava/util/List;)Lcom/truecaller/ads/api/internal/dl/model/DlSourceConfig$PartnerSourceConfig;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getPartners", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class DlSourceConfig$PartnerSourceConfig implements w20.k {

    @org.jetbrains.annotations.NotNull
    private final java.util.List<java.lang.String> partners;

    public DlSourceConfig$PartnerSourceConfig(@org.jetbrains.annotations.NotNull java.util.List<java.lang.String> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "partners");
        this.partners = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.truecaller.ads.api.internal.dl.model.DlSourceConfig$PartnerSourceConfig copy$default(com.truecaller.ads.api.internal.dl.model.DlSourceConfig$PartnerSourceConfig dlSourceConfig$PartnerSourceConfig, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = dlSourceConfig$PartnerSourceConfig.partners;
        }
        return dlSourceConfig$PartnerSourceConfig.copy(list);
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.String> component1() {
        return this.partners;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.ads.api.internal.dl.model.DlSourceConfig$PartnerSourceConfig copy(@org.jetbrains.annotations.NotNull java.util.List<java.lang.String> partners) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(partners, "partners");
        return new com.truecaller.ads.api.internal.dl.model.DlSourceConfig$PartnerSourceConfig(partners);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.truecaller.ads.api.internal.dl.model.DlSourceConfig$PartnerSourceConfig) && kotlin.jvm.internal.Intrinsics.b(this.partners, ((com.truecaller.ads.api.internal.dl.model.DlSourceConfig$PartnerSourceConfig) other).partners);
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.String> getPartners() {
        return this.partners;
    }

    public int hashCode() {
        return this.partners.hashCode();
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return com.appsflyer.internal.e.k("PartnerSourceConfig(partners=", ")", this.partners);
    }
}
