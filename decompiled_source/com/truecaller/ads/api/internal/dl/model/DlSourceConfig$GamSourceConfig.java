package com.truecaller.ads.api.internal.dl.model;

@kotlin.Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\tJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u0005\u0010\u000b¨\u0006\u001a"}, d2 = {"com/truecaller/ads/api/internal/dl/model/DlSourceConfig$GamSourceConfig", "Lw20/k;", "", "adUnit", "", "isS2sEnabled", "<init>", "(Ljava/lang/String;Z)V", "component1", "()Ljava/lang/String;", "component2", "()Z", "Lcom/truecaller/ads/api/internal/dl/model/DlSourceConfig$GamSourceConfig;", "copy", "(Ljava/lang/String;Z)Lcom/truecaller/ads/api/internal/dl/model/DlSourceConfig$GamSourceConfig;", "toString", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAdUnit", "Z", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class DlSourceConfig$GamSourceConfig implements w20.k {

    @org.jetbrains.annotations.NotNull
    private final java.lang.String adUnit;
    private final boolean isS2sEnabled;

    public DlSourceConfig$GamSourceConfig(@org.jetbrains.annotations.NotNull java.lang.String str, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "adUnit");
        this.adUnit = str;
        this.isS2sEnabled = z;
    }

    public static /* synthetic */ com.truecaller.ads.api.internal.dl.model.DlSourceConfig$GamSourceConfig copy$default(com.truecaller.ads.api.internal.dl.model.DlSourceConfig$GamSourceConfig dlSourceConfig$GamSourceConfig, java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = dlSourceConfig$GamSourceConfig.adUnit;
        }
        if ((i & 2) != 0) {
            z = dlSourceConfig$GamSourceConfig.isS2sEnabled;
        }
        return dlSourceConfig$GamSourceConfig.copy(str, z);
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component1, reason: from getter */
    public final java.lang.String getAdUnit() {
        return this.adUnit;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsS2sEnabled() {
        return this.isS2sEnabled;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.ads.api.internal.dl.model.DlSourceConfig$GamSourceConfig copy(@org.jetbrains.annotations.NotNull java.lang.String adUnit, boolean isS2sEnabled) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        return new com.truecaller.ads.api.internal.dl.model.DlSourceConfig$GamSourceConfig(adUnit, isS2sEnabled);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.ads.api.internal.dl.model.DlSourceConfig$GamSourceConfig)) {
            return false;
        }
        com.truecaller.ads.api.internal.dl.model.DlSourceConfig$GamSourceConfig dlSourceConfig$GamSourceConfig = (com.truecaller.ads.api.internal.dl.model.DlSourceConfig$GamSourceConfig) other;
        return kotlin.jvm.internal.Intrinsics.b(this.adUnit, dlSourceConfig$GamSourceConfig.adUnit) && this.isS2sEnabled == dlSourceConfig$GamSourceConfig.isS2sEnabled;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getAdUnit() {
        return this.adUnit;
    }

    public int hashCode() {
        return (this.adUnit.hashCode() * 31) + (this.isS2sEnabled ? 1231 : 1237);
    }

    public final boolean isS2sEnabled() {
        return this.isS2sEnabled;
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return bx.e1.p("GamSourceConfig(adUnit=", this.adUnit, ", isS2sEnabled=", this.isS2sEnabled, ")");
    }

    public /* synthetic */ DlSourceConfig$GamSourceConfig(java.lang.String str, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? false : z);
    }
}
