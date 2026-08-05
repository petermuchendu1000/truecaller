package com.truecaller.voicemail.api.internal.data.models.promo;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/truecaller/voicemail/api/internal/data/models/promo/VoicemailPromoData;", "", "title", "", "subtitle", "ctaText", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getCtaText", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "api"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final /* data */ class VoicemailPromoData {

    @org.jetbrains.annotations.Nullable
    private final java.lang.String ctaText;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String subtitle;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String title;

    public VoicemailPromoData(@org.jetbrains.annotations.Nullable java.lang.String str, @org.jetbrains.annotations.Nullable java.lang.String str2, @org.jetbrains.annotations.Nullable java.lang.String str3) {
        this.title = str;
        this.subtitle = str2;
        this.ctaText = str3;
    }

    public static /* synthetic */ com.truecaller.voicemail.api.internal.data.models.promo.VoicemailPromoData copy$default(com.truecaller.voicemail.api.internal.data.models.promo.VoicemailPromoData voicemailPromoData, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = voicemailPromoData.title;
        }
        if ((i & 2) != 0) {
            str2 = voicemailPromoData.subtitle;
        }
        if ((i & 4) != 0) {
            str3 = voicemailPromoData.ctaText;
        }
        return voicemailPromoData.copy(str, str2, str3);
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component1, reason: from getter */
    public final java.lang.String getTitle() {
        return this.title;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component2, reason: from getter */
    public final java.lang.String getSubtitle() {
        return this.subtitle;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component3, reason: from getter */
    public final java.lang.String getCtaText() {
        return this.ctaText;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.voicemail.api.internal.data.models.promo.VoicemailPromoData copy(@org.jetbrains.annotations.Nullable java.lang.String title, @org.jetbrains.annotations.Nullable java.lang.String subtitle, @org.jetbrains.annotations.Nullable java.lang.String ctaText) {
        return new com.truecaller.voicemail.api.internal.data.models.promo.VoicemailPromoData(title, subtitle, ctaText);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.voicemail.api.internal.data.models.promo.VoicemailPromoData)) {
            return false;
        }
        com.truecaller.voicemail.api.internal.data.models.promo.VoicemailPromoData voicemailPromoData = (com.truecaller.voicemail.api.internal.data.models.promo.VoicemailPromoData) other;
        return kotlin.jvm.internal.Intrinsics.b(this.title, voicemailPromoData.title) && kotlin.jvm.internal.Intrinsics.b(this.subtitle, voicemailPromoData.subtitle) && kotlin.jvm.internal.Intrinsics.b(this.ctaText, voicemailPromoData.ctaText);
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getCtaText() {
        return this.ctaText;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getSubtitle() {
        return this.subtitle;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getTitle() {
        return this.title;
    }

    public int hashCode() {
        java.lang.String str = this.title;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.lang.String str2 = this.subtitle;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.ctaText;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return bar.v(this.ctaText, ")", ro0.f.E("VoicemailPromoData(title=", this.title, ", subtitle=", this.subtitle, ", ctaText="));
    }
}
