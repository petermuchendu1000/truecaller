package com.truecaller.remoteconfig.experiment;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0083\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/truecaller/remoteconfig/experiment/ExperimentActivationRequestDtoFlag;", "", com.unity3d.ads.metadata.MediationMetaData.KEY_NAME, "", "epochSeconds", "", "<init>", "(Ljava/lang/String;J)V", "getName", "()Ljava/lang/String;", "getEpochSeconds", "()J", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
final /* data */ class ExperimentActivationRequestDtoFlag {

    @bw.qux("epochSeconds")
    private final long epochSeconds;

    @bw.qux(com.unity3d.ads.metadata.MediationMetaData.KEY_NAME)
    @org.jetbrains.annotations.NotNull
    private final java.lang.String name;

    public ExperimentActivationRequestDtoFlag(@org.jetbrains.annotations.NotNull java.lang.String str, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, com.unity3d.ads.metadata.MediationMetaData.KEY_NAME);
        this.name = str;
        this.epochSeconds = j;
    }

    public static /* synthetic */ com.truecaller.remoteconfig.experiment.ExperimentActivationRequestDtoFlag copy$default(com.truecaller.remoteconfig.experiment.ExperimentActivationRequestDtoFlag experimentActivationRequestDtoFlag, java.lang.String str, long j, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = experimentActivationRequestDtoFlag.name;
        }
        if ((i & 2) != 0) {
            j = experimentActivationRequestDtoFlag.epochSeconds;
        }
        return experimentActivationRequestDtoFlag.copy(str, j);
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component1, reason: from getter */
    public final java.lang.String getName() {
        return this.name;
    }

    /* renamed from: component2, reason: from getter */
    public final long getEpochSeconds() {
        return this.epochSeconds;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.remoteconfig.experiment.ExperimentActivationRequestDtoFlag copy(@org.jetbrains.annotations.NotNull java.lang.String name, long epochSeconds) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, com.unity3d.ads.metadata.MediationMetaData.KEY_NAME);
        return new com.truecaller.remoteconfig.experiment.ExperimentActivationRequestDtoFlag(name, epochSeconds);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.remoteconfig.experiment.ExperimentActivationRequestDtoFlag)) {
            return false;
        }
        com.truecaller.remoteconfig.experiment.ExperimentActivationRequestDtoFlag experimentActivationRequestDtoFlag = (com.truecaller.remoteconfig.experiment.ExperimentActivationRequestDtoFlag) other;
        return kotlin.jvm.internal.Intrinsics.b(this.name, experimentActivationRequestDtoFlag.name) && this.epochSeconds == experimentActivationRequestDtoFlag.epochSeconds;
    }

    public final long getEpochSeconds() {
        return this.epochSeconds;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getName() {
        return this.name;
    }

    public int hashCode() {
        int hashCode = this.name.hashCode() * 31;
        long j = this.epochSeconds;
        return hashCode + ((int) (j ^ (j >>> 32)));
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        java.lang.StringBuilder q = com.appsflyer.internal.e.q("ExperimentActivationRequestDtoFlag(name=", this.name, ", epochSeconds=", this.epochSeconds);
        q.append(")");
        return q.toString();
    }
}
