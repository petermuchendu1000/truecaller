package com.truecaller.wizard.framework.config;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \t2\u00020\u0001:\u0005\n\u000b\f\r\u000eB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0001\u0004\u000b\r\u000f\f¨\u0006\u0010"}, d2 = {"Lcom/truecaller/wizard/framework/config/WelcomePageConfig;", "", "", "variant", "<init>", "(Ljava/lang/String;)V", "Ljava/lang/String;", "getVariant", "()Ljava/lang/String;", "Companion", "Cta", "com/truecaller/wizard/framework/config/d", "com/truecaller/wizard/framework/config/h", "com/truecaller/wizard/framework/config/e", "com/truecaller/wizard/framework/config/f", "Lcom/truecaller/wizard/framework/config/WelcomePageConfig$Cta;", "domain_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public abstract class WelcomePageConfig {
    public static final int $stable = 0;

    @org.jetbrains.annotations.NotNull
    private static final java.lang.String CAROUSEL = "Carousel";

    @org.jetbrains.annotations.NotNull
    private static final java.lang.String CAROUSEL_NUMBER = "VariantOldCopy";

    @org.jetbrains.annotations.NotNull
    private static final java.lang.String CTA = "Logo";

    @org.jetbrains.annotations.NotNull
    private static final java.lang.String CTA_NUMBER = "VariantNewCopy";

    @org.jetbrains.annotations.NotNull
    public static final com.truecaller.wizard.framework.config.f Companion = new java.lang.Object();

    @org.jetbrains.annotations.NotNull
    private static final com.google.gson.n deserializer = new java.lang.Object();

    @org.jetbrains.annotations.NotNull
    private final java.lang.String variant;

    @androidx.annotation.Keep
    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\r\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0001'BO\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000fJ\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000fJ\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u000fJ\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u000fJX\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u000fJ\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u000b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\u000fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b!\u0010\u000fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b\"\u0010\u000fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b#\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b$\u0010\u000fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b%\u0010\u000f¨\u0006("}, d2 = {"Lcom/truecaller/wizard/framework/config/WelcomePageConfig$Cta;", "Lcom/truecaller/wizard/framework/config/WelcomePageConfig;", "", "title", "titleHighlightPart", "subtitle", "subtitleBoldPart", "buttonText", "buttonColor", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "isButtonGreen", "()Z", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/truecaller/wizard/framework/config/WelcomePageConfig$Cta;", "toString", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getTitleHighlightPart", "getSubtitle", "getSubtitleBoldPart", "getButtonText", "getButtonColor", "Companion", "com/truecaller/wizard/framework/config/g", "domain_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
    /* loaded from: /home/user/tc_decoded/classes7.dex */
    public static final /* data */ class Cta extends com.truecaller.wizard.framework.config.WelcomePageConfig {
        public static final int $stable = 0;

        @org.jetbrains.annotations.NotNull
        public static final com.truecaller.wizard.framework.config.g Companion = new java.lang.Object();

        @org.jetbrains.annotations.NotNull
        private static final java.lang.String GREEN = "Green";

        @bw.qux("CTA_color")
        @org.jetbrains.annotations.Nullable
        private final java.lang.String buttonColor;

        @bw.qux("CTA")
        @org.jetbrains.annotations.Nullable
        private final java.lang.String buttonText;

        @org.jetbrains.annotations.Nullable
        private final java.lang.String subtitle;

        @org.jetbrains.annotations.Nullable
        private final java.lang.String subtitleBoldPart;

        @org.jetbrains.annotations.Nullable
        private final java.lang.String title;

        @org.jetbrains.annotations.Nullable
        private final java.lang.String titleHighlightPart;

        public Cta() {
            this(null, null, null, null, null, null, 63, null);
        }

        public static /* synthetic */ com.truecaller.wizard.framework.config.WelcomePageConfig.Cta copy$default(com.truecaller.wizard.framework.config.WelcomePageConfig.Cta cta, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = cta.title;
            }
            if ((i & 2) != 0) {
                str2 = cta.titleHighlightPart;
            }
            if ((i & 4) != 0) {
                str3 = cta.subtitle;
            }
            if ((i & 8) != 0) {
                str4 = cta.subtitleBoldPart;
            }
            if ((i & 16) != 0) {
                str5 = cta.buttonText;
            }
            if ((i & 32) != 0) {
                str6 = cta.buttonColor;
            }
            java.lang.String str7 = str5;
            java.lang.String str8 = str6;
            return cta.copy(str, str2, str3, str4, str7, str8);
        }

        @org.jetbrains.annotations.Nullable
        /* renamed from: component1, reason: from getter */
        public final java.lang.String getTitle() {
            return this.title;
        }

        @org.jetbrains.annotations.Nullable
        /* renamed from: component2, reason: from getter */
        public final java.lang.String getTitleHighlightPart() {
            return this.titleHighlightPart;
        }

        @org.jetbrains.annotations.Nullable
        /* renamed from: component3, reason: from getter */
        public final java.lang.String getSubtitle() {
            return this.subtitle;
        }

        @org.jetbrains.annotations.Nullable
        /* renamed from: component4, reason: from getter */
        public final java.lang.String getSubtitleBoldPart() {
            return this.subtitleBoldPart;
        }

        @org.jetbrains.annotations.Nullable
        /* renamed from: component5, reason: from getter */
        public final java.lang.String getButtonText() {
            return this.buttonText;
        }

        @org.jetbrains.annotations.Nullable
        /* renamed from: component6, reason: from getter */
        public final java.lang.String getButtonColor() {
            return this.buttonColor;
        }

        @org.jetbrains.annotations.NotNull
        public final com.truecaller.wizard.framework.config.WelcomePageConfig.Cta copy(@org.jetbrains.annotations.Nullable java.lang.String title, @org.jetbrains.annotations.Nullable java.lang.String titleHighlightPart, @org.jetbrains.annotations.Nullable java.lang.String subtitle, @org.jetbrains.annotations.Nullable java.lang.String subtitleBoldPart, @org.jetbrains.annotations.Nullable java.lang.String buttonText, @org.jetbrains.annotations.Nullable java.lang.String buttonColor) {
            return new com.truecaller.wizard.framework.config.WelcomePageConfig.Cta(title, titleHighlightPart, subtitle, subtitleBoldPart, buttonText, buttonColor);
        }

        public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.truecaller.wizard.framework.config.WelcomePageConfig.Cta)) {
                return false;
            }
            com.truecaller.wizard.framework.config.WelcomePageConfig.Cta cta = (com.truecaller.wizard.framework.config.WelcomePageConfig.Cta) other;
            return kotlin.jvm.internal.Intrinsics.b(this.title, cta.title) && kotlin.jvm.internal.Intrinsics.b(this.titleHighlightPart, cta.titleHighlightPart) && kotlin.jvm.internal.Intrinsics.b(this.subtitle, cta.subtitle) && kotlin.jvm.internal.Intrinsics.b(this.subtitleBoldPart, cta.subtitleBoldPart) && kotlin.jvm.internal.Intrinsics.b(this.buttonText, cta.buttonText) && kotlin.jvm.internal.Intrinsics.b(this.buttonColor, cta.buttonColor);
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.String getButtonColor() {
            return this.buttonColor;
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.String getButtonText() {
            return this.buttonText;
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.String getSubtitle() {
            return this.subtitle;
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.String getSubtitleBoldPart() {
            return this.subtitleBoldPart;
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.String getTitle() {
            return this.title;
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.String getTitleHighlightPart() {
            return this.titleHighlightPart;
        }

        public int hashCode() {
            java.lang.String str = this.title;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            java.lang.String str2 = this.titleHighlightPart;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            java.lang.String str3 = this.subtitle;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            java.lang.String str4 = this.subtitleBoldPart;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            java.lang.String str5 = this.buttonText;
            int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            java.lang.String str6 = this.buttonColor;
            return hashCode5 + (str6 != null ? str6.hashCode() : 0);
        }

        public final boolean isButtonGreen() {
            return GREEN.equals(this.buttonColor);
        }

        @org.jetbrains.annotations.NotNull
        public java.lang.String toString() {
            java.lang.String str = this.title;
            java.lang.String str2 = this.titleHighlightPart;
            java.lang.String str3 = this.subtitle;
            java.lang.String str4 = this.subtitleBoldPart;
            java.lang.String str5 = this.buttonText;
            java.lang.String str6 = this.buttonColor;
            java.lang.StringBuilder E = ro0.f.E("Cta(title=", str, ", titleHighlightPart=", str2, ", subtitle=");
            bar.E(E, str3, ", subtitleBoldPart=", str4, ", buttonText=");
            return bar.x(E, str5, ", buttonColor=", str6, ")");
        }

        public /* synthetic */ Cta(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6);
        }

        public Cta(@org.jetbrains.annotations.Nullable java.lang.String str, @org.jetbrains.annotations.Nullable java.lang.String str2, @org.jetbrains.annotations.Nullable java.lang.String str3, @org.jetbrains.annotations.Nullable java.lang.String str4, @org.jetbrains.annotations.Nullable java.lang.String str5, @org.jetbrains.annotations.Nullable java.lang.String str6) {
            super(com.truecaller.wizard.framework.config.WelcomePageConfig.CTA, null);
            this.title = str;
            this.titleHighlightPart = str2;
            this.subtitle = str3;
            this.subtitleBoldPart = str4;
            this.buttonText = str5;
            this.buttonColor = str6;
        }
    }

    public /* synthetic */ WelcomePageConfig(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.truecaller.wizard.framework.config.WelcomePageConfig deserializer$lambda$0(com.google.gson.o oVar, java.lang.reflect.Type type, com.google.gson.m mVar) {
        java.lang.String i = oVar.f().p("variant").i();
        if (i != null) {
            switch (i.hashCode()) {
                case -411000560:
                    if (i.equals(CTA_NUMBER)) {
                        return (com.truecaller.wizard.framework.config.WelcomePageConfig) ((mp2.qux) mVar).o(oVar, com.truecaller.wizard.framework.config.h.class);
                    }
                    break;
                case 2374091:
                    if (i.equals(CTA)) {
                        return (com.truecaller.wizard.framework.config.WelcomePageConfig) ((mp2.qux) mVar).o(oVar, com.truecaller.wizard.framework.config.WelcomePageConfig.Cta.class);
                    }
                    break;
                case 67552640:
                    if (i.equals(CAROUSEL)) {
                        return (com.truecaller.wizard.framework.config.WelcomePageConfig) ((mp2.qux) mVar).o(oVar, com.truecaller.wizard.framework.config.d.class);
                    }
                    break;
                case 659360279:
                    if (i.equals(CAROUSEL_NUMBER)) {
                        return (com.truecaller.wizard.framework.config.WelcomePageConfig) ((mp2.qux) mVar).o(oVar, com.truecaller.wizard.framework.config.e.class);
                    }
                    break;
            }
        }
        com.truecaller.wizard.framework.config.d dVar = com.truecaller.wizard.framework.config.d.a;
        com.truecaller.log.AssertionUtil.reportWeirdnessButNeverCrash("Unsupported welcome page variant " + i + ", fallback to Carousel");
        return dVar;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getVariant() {
        return this.variant;
    }

    private WelcomePageConfig(java.lang.String str) {
        this.variant = str;
    }
}
