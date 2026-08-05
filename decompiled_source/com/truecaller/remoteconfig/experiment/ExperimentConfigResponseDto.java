package com.truecaller.remoteconfig.experiment;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B+\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003J3\u0010\u0012\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0006HÖ\u0001R\u001e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u0019"}, d2 = {"Lcom/truecaller/remoteconfig/experiment/ExperimentConfigResponseDto;", "", "resolvedFlags", "", "Lcom/truecaller/remoteconfig/experiment/ExperimentConfigResponseDtoFlag;", "resolveId", "", "resolveToken", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "getResolvedFlags", "()Ljava/util/List;", "getResolveId", "()Ljava/lang/String;", "getResolveToken", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final /* data */ class ExperimentConfigResponseDto {

    @bw.qux("resolveId")
    @org.jetbrains.annotations.Nullable
    private final java.lang.String resolveId;

    @bw.qux("resolveToken")
    @org.jetbrains.annotations.Nullable
    private final java.lang.String resolveToken;

    @bw.qux("resolvedFlags")
    @org.jetbrains.annotations.Nullable
    private final java.util.List<com.truecaller.remoteconfig.experiment.ExperimentConfigResponseDtoFlag> resolvedFlags;

    public ExperimentConfigResponseDto(@org.jetbrains.annotations.Nullable java.util.List<com.truecaller.remoteconfig.experiment.ExperimentConfigResponseDtoFlag> list, @org.jetbrains.annotations.Nullable java.lang.String str, @org.jetbrains.annotations.Nullable java.lang.String str2) {
        this.resolvedFlags = list;
        this.resolveId = str;
        this.resolveToken = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.truecaller.remoteconfig.experiment.ExperimentConfigResponseDto copy$default(com.truecaller.remoteconfig.experiment.ExperimentConfigResponseDto experimentConfigResponseDto, java.util.List list, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = experimentConfigResponseDto.resolvedFlags;
        }
        if ((i & 2) != 0) {
            str = experimentConfigResponseDto.resolveId;
        }
        if ((i & 4) != 0) {
            str2 = experimentConfigResponseDto.resolveToken;
        }
        return experimentConfigResponseDto.copy(list, str, str2);
    }

    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.truecaller.remoteconfig.experiment.ExperimentConfigResponseDtoFlag> component1() {
        return this.resolvedFlags;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component2, reason: from getter */
    public final java.lang.String getResolveId() {
        return this.resolveId;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component3, reason: from getter */
    public final java.lang.String getResolveToken() {
        return this.resolveToken;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.remoteconfig.experiment.ExperimentConfigResponseDto copy(@org.jetbrains.annotations.Nullable java.util.List<com.truecaller.remoteconfig.experiment.ExperimentConfigResponseDtoFlag> resolvedFlags, @org.jetbrains.annotations.Nullable java.lang.String resolveId, @org.jetbrains.annotations.Nullable java.lang.String resolveToken) {
        return new com.truecaller.remoteconfig.experiment.ExperimentConfigResponseDto(resolvedFlags, resolveId, resolveToken);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.remoteconfig.experiment.ExperimentConfigResponseDto)) {
            return false;
        }
        com.truecaller.remoteconfig.experiment.ExperimentConfigResponseDto experimentConfigResponseDto = (com.truecaller.remoteconfig.experiment.ExperimentConfigResponseDto) other;
        return kotlin.jvm.internal.Intrinsics.b(this.resolvedFlags, experimentConfigResponseDto.resolvedFlags) && kotlin.jvm.internal.Intrinsics.b(this.resolveId, experimentConfigResponseDto.resolveId) && kotlin.jvm.internal.Intrinsics.b(this.resolveToken, experimentConfigResponseDto.resolveToken);
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getResolveId() {
        return this.resolveId;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getResolveToken() {
        return this.resolveToken;
    }

    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.truecaller.remoteconfig.experiment.ExperimentConfigResponseDtoFlag> getResolvedFlags() {
        return this.resolvedFlags;
    }

    public int hashCode() {
        java.util.List<com.truecaller.remoteconfig.experiment.ExperimentConfigResponseDtoFlag> list = this.resolvedFlags;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        java.lang.String str = this.resolveId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.resolveToken;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        java.util.List<com.truecaller.remoteconfig.experiment.ExperimentConfigResponseDtoFlag> list = this.resolvedFlags;
        java.lang.String str = this.resolveId;
        java.lang.String str2 = this.resolveToken;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ExperimentConfigResponseDto(resolvedFlags=");
        sb.append(list);
        sb.append(", resolveId=");
        sb.append(str);
        sb.append(", resolveToken=");
        return bar.v(str2, ")", sb);
    }
}
