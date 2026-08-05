package com.truecaller.wizard.phonenumber.utils;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B!\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/truecaller/wizard/phonenumber/utils/VerificationNumberValidationRulesIndia;", "", "isEnabled", "", "numberTypes", "", "", "<init>", "(ZLjava/util/List;)V", "()Z", "getNumberTypes", "()Ljava/util/List;", "domain_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
final class VerificationNumberValidationRulesIndia {
    private final boolean isEnabled;

    @org.jetbrains.annotations.NotNull
    private final java.util.List<java.lang.String> numberTypes;

    public VerificationNumberValidationRulesIndia() {
        this(false, null, 3, null);
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.String> getNumberTypes() {
        return this.numberTypes;
    }

    /* renamed from: isEnabled, reason: from getter */
    public final boolean getIsEnabled() {
        return this.isEnabled;
    }

    public VerificationNumberValidationRulesIndia(boolean z, java.util.List list, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? kotlin.collections.h0.a : list);
    }

    public VerificationNumberValidationRulesIndia(boolean z, @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "numberTypes");
        this.isEnabled = z;
        this.numberTypes = list;
    }
}
