package com.truecaller.abtest.confidence.config;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, d2 = {"Lcom/truecaller/abtest/confidence/config/ClutterFreeConfig;", "", "variant", "", "showListAds", "", "premiumPromoDisplaySchedule", "Lcom/truecaller/abtest/confidence/config/AdDisplaySchedule;", "<init>", "(Ljava/lang/String;ZLcom/truecaller/abtest/confidence/config/AdDisplaySchedule;)V", "getVariant", "()Ljava/lang/String;", "getShowListAds", "()Z", "getPremiumPromoDisplaySchedule", "()Lcom/truecaller/abtest/confidence/config/AdDisplaySchedule;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "abtest_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class ClutterFreeConfig {

    @bw.qux("premiumpromodisplayschedule")
    @org.jetbrains.annotations.NotNull
    private final com.truecaller.abtest.confidence.config.AdDisplaySchedule premiumPromoDisplaySchedule;

    @bw.qux("showlistads")
    private final boolean showListAds;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String variant;

    public ClutterFreeConfig(@org.jetbrains.annotations.NotNull java.lang.String str, boolean z, @org.jetbrains.annotations.NotNull com.truecaller.abtest.confidence.config.AdDisplaySchedule adDisplaySchedule) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "variant");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adDisplaySchedule, "premiumPromoDisplaySchedule");
        this.variant = str;
        this.showListAds = z;
        this.premiumPromoDisplaySchedule = adDisplaySchedule;
    }

    public static /* synthetic */ com.truecaller.abtest.confidence.config.ClutterFreeConfig copy$default(com.truecaller.abtest.confidence.config.ClutterFreeConfig clutterFreeConfig, java.lang.String str, boolean z, com.truecaller.abtest.confidence.config.AdDisplaySchedule adDisplaySchedule, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = clutterFreeConfig.variant;
        }
        if ((i & 2) != 0) {
            z = clutterFreeConfig.showListAds;
        }
        if ((i & 4) != 0) {
            adDisplaySchedule = clutterFreeConfig.premiumPromoDisplaySchedule;
        }
        return clutterFreeConfig.copy(str, z, adDisplaySchedule);
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component1, reason: from getter */
    public final java.lang.String getVariant() {
        return this.variant;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getShowListAds() {
        return this.showListAds;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component3, reason: from getter */
    public final com.truecaller.abtest.confidence.config.AdDisplaySchedule getPremiumPromoDisplaySchedule() {
        return this.premiumPromoDisplaySchedule;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.abtest.confidence.config.ClutterFreeConfig copy(@org.jetbrains.annotations.NotNull java.lang.String variant, boolean showListAds, @org.jetbrains.annotations.NotNull com.truecaller.abtest.confidence.config.AdDisplaySchedule premiumPromoDisplaySchedule) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(variant, "variant");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(premiumPromoDisplaySchedule, "premiumPromoDisplaySchedule");
        return new com.truecaller.abtest.confidence.config.ClutterFreeConfig(variant, showListAds, premiumPromoDisplaySchedule);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.abtest.confidence.config.ClutterFreeConfig)) {
            return false;
        }
        com.truecaller.abtest.confidence.config.ClutterFreeConfig clutterFreeConfig = (com.truecaller.abtest.confidence.config.ClutterFreeConfig) other;
        return kotlin.jvm.internal.Intrinsics.b(this.variant, clutterFreeConfig.variant) && this.showListAds == clutterFreeConfig.showListAds && kotlin.jvm.internal.Intrinsics.b(this.premiumPromoDisplaySchedule, clutterFreeConfig.premiumPromoDisplaySchedule);
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.abtest.confidence.config.AdDisplaySchedule getPremiumPromoDisplaySchedule() {
        return this.premiumPromoDisplaySchedule;
    }

    public final boolean getShowListAds() {
        return this.showListAds;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getVariant() {
        return this.variant;
    }

    public int hashCode() {
        int i;
        int hashCode = this.variant.hashCode() * 31;
        if (this.showListAds) {
            i = 1231;
        } else {
            i = 1237;
        }
        return this.premiumPromoDisplaySchedule.hashCode() + ((hashCode + i) * 31);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        java.lang.String str = this.variant;
        boolean z = this.showListAds;
        com.truecaller.abtest.confidence.config.AdDisplaySchedule adDisplaySchedule = this.premiumPromoDisplaySchedule;
        java.lang.StringBuilder t = ax1.bar.t("ClutterFreeConfig(variant=", str, ", showListAds=", ", premiumPromoDisplaySchedule=", z);
        t.append(adDisplaySchedule);
        t.append(")");
        return t.toString();
    }
}
