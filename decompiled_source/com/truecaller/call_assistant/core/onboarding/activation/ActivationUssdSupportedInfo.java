package com.truecaller.call_assistant.core.onboarding.activation;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J)\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/truecaller/call_assistant/core/onboarding/activation/ActivationUssdSupportedInfo;", "", "supportPageUrl", "", "countries", "", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "getSupportPageUrl", "()Ljava/lang/String;", "getCountries", "()Ljava/util/Map;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "core_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class ActivationUssdSupportedInfo {
    public static final int $stable = 8;

    @org.jetbrains.annotations.NotNull
    private final java.util.Map<java.lang.String, java.lang.String> countries;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String supportPageUrl;

    /* JADX WARN: Multi-variable type inference failed */
    public ActivationUssdSupportedInfo() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.truecaller.call_assistant.core.onboarding.activation.ActivationUssdSupportedInfo copy$default(com.truecaller.call_assistant.core.onboarding.activation.ActivationUssdSupportedInfo activationUssdSupportedInfo, java.lang.String str, java.util.Map map, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = activationUssdSupportedInfo.supportPageUrl;
        }
        if ((i & 2) != 0) {
            map = activationUssdSupportedInfo.countries;
        }
        return activationUssdSupportedInfo.copy(str, map);
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component1, reason: from getter */
    public final java.lang.String getSupportPageUrl() {
        return this.supportPageUrl;
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.Map<java.lang.String, java.lang.String> component2() {
        return this.countries;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.call_assistant.core.onboarding.activation.ActivationUssdSupportedInfo copy(@org.jetbrains.annotations.NotNull java.lang.String supportPageUrl, @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> countries) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(supportPageUrl, "supportPageUrl");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(countries, "countries");
        return new com.truecaller.call_assistant.core.onboarding.activation.ActivationUssdSupportedInfo(supportPageUrl, countries);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.call_assistant.core.onboarding.activation.ActivationUssdSupportedInfo)) {
            return false;
        }
        com.truecaller.call_assistant.core.onboarding.activation.ActivationUssdSupportedInfo activationUssdSupportedInfo = (com.truecaller.call_assistant.core.onboarding.activation.ActivationUssdSupportedInfo) other;
        return kotlin.jvm.internal.Intrinsics.b(this.supportPageUrl, activationUssdSupportedInfo.supportPageUrl) && kotlin.jvm.internal.Intrinsics.b(this.countries, activationUssdSupportedInfo.countries);
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.Map<java.lang.String, java.lang.String> getCountries() {
        return this.countries;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getSupportPageUrl() {
        return this.supportPageUrl;
    }

    public int hashCode() {
        return this.countries.hashCode() + (this.supportPageUrl.hashCode() * 31);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return "ActivationUssdSupportedInfo(supportPageUrl=" + this.supportPageUrl + ", countries=" + this.countries + ")";
    }

    public ActivationUssdSupportedInfo(@org.jetbrains.annotations.NotNull java.lang.String str, @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "supportPageUrl");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "countries");
        this.supportPageUrl = str;
        this.countries = map;
    }

    public /* synthetic */ ActivationUssdSupportedInfo(java.lang.String str, java.util.Map map, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "https://support.truecaller.com/ " : str, (i & 2) != 0 ? kotlin.collections.r0.f() : map);
    }
}
