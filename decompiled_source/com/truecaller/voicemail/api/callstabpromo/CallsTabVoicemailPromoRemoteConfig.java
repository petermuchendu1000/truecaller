package com.truecaller.voicemail.api.callstabpromo;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/truecaller/voicemail/api/callstabpromo/CallsTabVoicemailPromoRemoteConfig;", "", "title", "", "subtitle", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "api"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final /* data */ class CallsTabVoicemailPromoRemoteConfig {

    @org.jetbrains.annotations.NotNull
    private final java.lang.String subtitle;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String title;

    public CallsTabVoicemailPromoRemoteConfig(@org.jetbrains.annotations.NotNull java.lang.String str, @org.jetbrains.annotations.NotNull java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "title");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "subtitle");
        this.title = str;
        this.subtitle = str2;
    }

    public static /* synthetic */ com.truecaller.voicemail.api.callstabpromo.CallsTabVoicemailPromoRemoteConfig copy$default(com.truecaller.voicemail.api.callstabpromo.CallsTabVoicemailPromoRemoteConfig callsTabVoicemailPromoRemoteConfig, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = callsTabVoicemailPromoRemoteConfig.title;
        }
        if ((i & 2) != 0) {
            str2 = callsTabVoicemailPromoRemoteConfig.subtitle;
        }
        return callsTabVoicemailPromoRemoteConfig.copy(str, str2);
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component1, reason: from getter */
    public final java.lang.String getTitle() {
        return this.title;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component2, reason: from getter */
    public final java.lang.String getSubtitle() {
        return this.subtitle;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.voicemail.api.callstabpromo.CallsTabVoicemailPromoRemoteConfig copy(@org.jetbrains.annotations.NotNull java.lang.String title, @org.jetbrains.annotations.NotNull java.lang.String subtitle) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "title");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        return new com.truecaller.voicemail.api.callstabpromo.CallsTabVoicemailPromoRemoteConfig(title, subtitle);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.voicemail.api.callstabpromo.CallsTabVoicemailPromoRemoteConfig)) {
            return false;
        }
        com.truecaller.voicemail.api.callstabpromo.CallsTabVoicemailPromoRemoteConfig callsTabVoicemailPromoRemoteConfig = (com.truecaller.voicemail.api.callstabpromo.CallsTabVoicemailPromoRemoteConfig) other;
        return kotlin.jvm.internal.Intrinsics.b(this.title, callsTabVoicemailPromoRemoteConfig.title) && kotlin.jvm.internal.Intrinsics.b(this.subtitle, callsTabVoicemailPromoRemoteConfig.subtitle);
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getSubtitle() {
        return this.subtitle;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.subtitle.hashCode() + (this.title.hashCode() * 31);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return y.o.e("CallsTabVoicemailPromoRemoteConfig(title=", this.title, ", subtitle=", this.subtitle, ")");
    }
}
