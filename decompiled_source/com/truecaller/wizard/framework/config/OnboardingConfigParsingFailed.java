package com.truecaller.wizard.framework.config;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0001X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/truecaller/wizard/framework/config/OnboardingConfigParsingFailed;", "", "cause", "<init>", "(Ljava/lang/Throwable;)V", "getCause", "()Ljava/lang/Throwable;", "domain_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
final class OnboardingConfigParsingFailed extends java.lang.Throwable {

    @org.jetbrains.annotations.Nullable
    private final java.lang.Throwable cause;

    public OnboardingConfigParsingFailed(@org.jetbrains.annotations.Nullable java.lang.Throwable th) {
        super(th);
        this.cause = th;
    }

    @Override // java.lang.Throwable
    @org.jetbrains.annotations.Nullable
    public java.lang.Throwable getCause() {
        return this.cause;
    }
}
