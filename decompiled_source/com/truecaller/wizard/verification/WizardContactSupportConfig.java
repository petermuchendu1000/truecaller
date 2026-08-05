package com.truecaller.wizard.verification;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B+\u0012\u0010\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003\u0012\u0010\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007R\u001b\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001b\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/truecaller/wizard/verification/WizardContactSupportConfig;", "", "countries", "", "", "messages", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "getCountries", "()Ljava/util/List;", "getMessages", "domain_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
final class WizardContactSupportConfig {

    @org.jetbrains.annotations.Nullable
    private final java.util.List<java.lang.String> countries;

    @org.jetbrains.annotations.Nullable
    private final java.util.List<java.lang.String> messages;

    public WizardContactSupportConfig(@org.jetbrains.annotations.Nullable java.util.List<java.lang.String> list, @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> list2) {
        this.countries = list;
        this.messages = list2;
    }

    @org.jetbrains.annotations.Nullable
    public final java.util.List<java.lang.String> getCountries() {
        return this.countries;
    }

    @org.jetbrains.annotations.Nullable
    public final java.util.List<java.lang.String> getMessages() {
        return this.messages;
    }
}
