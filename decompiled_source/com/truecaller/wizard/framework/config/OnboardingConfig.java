package com.truecaller.wizard.framework.config;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/truecaller/wizard/framework/config/OnboardingConfig;", "", "adsChoicesPage", "Lcom/truecaller/wizard/framework/config/AdsChoicesPageConfig;", "welcomePage", "Lcom/truecaller/wizard/framework/config/WelcomePageConfig;", "<init>", "(Lcom/truecaller/wizard/framework/config/AdsChoicesPageConfig;Lcom/truecaller/wizard/framework/config/WelcomePageConfig;)V", "getAdsChoicesPage", "()Lcom/truecaller/wizard/framework/config/AdsChoicesPageConfig;", "getWelcomePage", "()Lcom/truecaller/wizard/framework/config/WelcomePageConfig;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "domain_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final /* data */ class OnboardingConfig {
    public static final int $stable = 0;

    @org.jetbrains.annotations.NotNull
    private final com.truecaller.wizard.framework.config.AdsChoicesPageConfig adsChoicesPage;

    @org.jetbrains.annotations.NotNull
    private final com.truecaller.wizard.framework.config.WelcomePageConfig welcomePage;

    public OnboardingConfig(@org.jetbrains.annotations.NotNull com.truecaller.wizard.framework.config.AdsChoicesPageConfig adsChoicesPageConfig, @org.jetbrains.annotations.NotNull com.truecaller.wizard.framework.config.WelcomePageConfig welcomePageConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adsChoicesPageConfig, "adsChoicesPage");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(welcomePageConfig, "welcomePage");
        this.adsChoicesPage = adsChoicesPageConfig;
        this.welcomePage = welcomePageConfig;
    }

    public static /* synthetic */ com.truecaller.wizard.framework.config.OnboardingConfig copy$default(com.truecaller.wizard.framework.config.OnboardingConfig onboardingConfig, com.truecaller.wizard.framework.config.AdsChoicesPageConfig adsChoicesPageConfig, com.truecaller.wizard.framework.config.WelcomePageConfig welcomePageConfig, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            adsChoicesPageConfig = onboardingConfig.adsChoicesPage;
        }
        if ((i & 2) != 0) {
            welcomePageConfig = onboardingConfig.welcomePage;
        }
        return onboardingConfig.copy(adsChoicesPageConfig, welcomePageConfig);
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component1, reason: from getter */
    public final com.truecaller.wizard.framework.config.AdsChoicesPageConfig getAdsChoicesPage() {
        return this.adsChoicesPage;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component2, reason: from getter */
    public final com.truecaller.wizard.framework.config.WelcomePageConfig getWelcomePage() {
        return this.welcomePage;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.wizard.framework.config.OnboardingConfig copy(@org.jetbrains.annotations.NotNull com.truecaller.wizard.framework.config.AdsChoicesPageConfig adsChoicesPage, @org.jetbrains.annotations.NotNull com.truecaller.wizard.framework.config.WelcomePageConfig welcomePage) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adsChoicesPage, "adsChoicesPage");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(welcomePage, "welcomePage");
        return new com.truecaller.wizard.framework.config.OnboardingConfig(adsChoicesPage, welcomePage);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.wizard.framework.config.OnboardingConfig)) {
            return false;
        }
        com.truecaller.wizard.framework.config.OnboardingConfig onboardingConfig = (com.truecaller.wizard.framework.config.OnboardingConfig) other;
        return kotlin.jvm.internal.Intrinsics.b(this.adsChoicesPage, onboardingConfig.adsChoicesPage) && kotlin.jvm.internal.Intrinsics.b(this.welcomePage, onboardingConfig.welcomePage);
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.wizard.framework.config.AdsChoicesPageConfig getAdsChoicesPage() {
        return this.adsChoicesPage;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.wizard.framework.config.WelcomePageConfig getWelcomePage() {
        return this.welcomePage;
    }

    public int hashCode() {
        return this.welcomePage.hashCode() + (this.adsChoicesPage.hashCode() * 31);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return "OnboardingConfig(adsChoicesPage=" + this.adsChoicesPage + ", welcomePage=" + this.welcomePage + ")";
    }
}
