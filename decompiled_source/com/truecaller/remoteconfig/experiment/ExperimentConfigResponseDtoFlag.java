package com.truecaller.remoteconfig.experiment;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/truecaller/remoteconfig/experiment/ExperimentConfigResponseDtoFlag;", "", "flag", "", "variant", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getFlag", "()Ljava/lang/String;", "getVariant", "getValue", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final /* data */ class ExperimentConfigResponseDtoFlag {

    @bw.qux("flag")
    @org.jetbrains.annotations.NotNull
    private final java.lang.String flag;

    @bw.qux("value")
    @org.jetbrains.annotations.NotNull
    private final java.lang.String value;

    @bw.qux("variant")
    @org.jetbrains.annotations.NotNull
    private final java.lang.String variant;

    public ExperimentConfigResponseDtoFlag(@org.jetbrains.annotations.NotNull java.lang.String str, @org.jetbrains.annotations.NotNull java.lang.String str2, @org.jetbrains.annotations.NotNull java.lang.String str3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "flag");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "variant");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "value");
        this.flag = str;
        this.variant = str2;
        this.value = str3;
    }

    public static /* synthetic */ com.truecaller.remoteconfig.experiment.ExperimentConfigResponseDtoFlag copy$default(com.truecaller.remoteconfig.experiment.ExperimentConfigResponseDtoFlag experimentConfigResponseDtoFlag, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = experimentConfigResponseDtoFlag.flag;
        }
        if ((i & 2) != 0) {
            str2 = experimentConfigResponseDtoFlag.variant;
        }
        if ((i & 4) != 0) {
            str3 = experimentConfigResponseDtoFlag.value;
        }
        return experimentConfigResponseDtoFlag.copy(str, str2, str3);
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component1, reason: from getter */
    public final java.lang.String getFlag() {
        return this.flag;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component2, reason: from getter */
    public final java.lang.String getVariant() {
        return this.variant;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component3, reason: from getter */
    public final java.lang.String getValue() {
        return this.value;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.remoteconfig.experiment.ExperimentConfigResponseDtoFlag copy(@org.jetbrains.annotations.NotNull java.lang.String flag, @org.jetbrains.annotations.NotNull java.lang.String variant, @org.jetbrains.annotations.NotNull java.lang.String value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flag, "flag");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(variant, "variant");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
        return new com.truecaller.remoteconfig.experiment.ExperimentConfigResponseDtoFlag(flag, variant, value);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.remoteconfig.experiment.ExperimentConfigResponseDtoFlag)) {
            return false;
        }
        com.truecaller.remoteconfig.experiment.ExperimentConfigResponseDtoFlag experimentConfigResponseDtoFlag = (com.truecaller.remoteconfig.experiment.ExperimentConfigResponseDtoFlag) other;
        return kotlin.jvm.internal.Intrinsics.b(this.flag, experimentConfigResponseDtoFlag.flag) && kotlin.jvm.internal.Intrinsics.b(this.variant, experimentConfigResponseDtoFlag.variant) && kotlin.jvm.internal.Intrinsics.b(this.value, experimentConfigResponseDtoFlag.value);
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getFlag() {
        return this.flag;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getValue() {
        return this.value;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getVariant() {
        return this.variant;
    }

    public int hashCode() {
        return this.value.hashCode() + ax1.bar.e(this.flag.hashCode() * 31, 31, this.variant);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return bar.v(this.value, ")", ro0.f.E("ExperimentConfigResponseDtoFlag(flag=", this.flag, ", variant=", this.variant, ", value="));
    }
}
