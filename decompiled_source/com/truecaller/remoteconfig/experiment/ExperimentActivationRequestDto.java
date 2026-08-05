package com.truecaller.remoteconfig.experiment;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0083\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J7\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\f¨\u0006\u001c"}, d2 = {"Lcom/truecaller/remoteconfig/experiment/ExperimentActivationRequestDto;", "", "resolveId", "", "resolveToken", "flags", "", "Lcom/truecaller/remoteconfig/experiment/ExperimentActivationRequestDtoFlag;", "os", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getResolveId", "()Ljava/lang/String;", "getResolveToken", "getFlags", "()Ljava/util/List;", "getOs", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
final /* data */ class ExperimentActivationRequestDto {

    @bw.qux("flags")
    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.truecaller.remoteconfig.experiment.ExperimentActivationRequestDtoFlag> flags;

    @bw.qux("os")
    @org.jetbrains.annotations.NotNull
    private final java.lang.String os;

    @bw.qux("resolveId")
    @org.jetbrains.annotations.NotNull
    private final java.lang.String resolveId;

    @bw.qux("resolveToken")
    @org.jetbrains.annotations.NotNull
    private final java.lang.String resolveToken;

    public ExperimentActivationRequestDto(@org.jetbrains.annotations.NotNull java.lang.String str, @org.jetbrains.annotations.NotNull java.lang.String str2, @org.jetbrains.annotations.NotNull java.util.List<com.truecaller.remoteconfig.experiment.ExperimentActivationRequestDtoFlag> list, @org.jetbrains.annotations.NotNull java.lang.String str3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "resolveId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "resolveToken");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "flags");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "os");
        this.resolveId = str;
        this.resolveToken = str2;
        this.flags = list;
        this.os = str3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.truecaller.remoteconfig.experiment.ExperimentActivationRequestDto copy$default(com.truecaller.remoteconfig.experiment.ExperimentActivationRequestDto experimentActivationRequestDto, java.lang.String str, java.lang.String str2, java.util.List list, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = experimentActivationRequestDto.resolveId;
        }
        if ((i & 2) != 0) {
            str2 = experimentActivationRequestDto.resolveToken;
        }
        if ((i & 4) != 0) {
            list = experimentActivationRequestDto.flags;
        }
        if ((i & 8) != 0) {
            str3 = experimentActivationRequestDto.os;
        }
        return experimentActivationRequestDto.copy(str, str2, list, str3);
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component1, reason: from getter */
    public final java.lang.String getResolveId() {
        return this.resolveId;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component2, reason: from getter */
    public final java.lang.String getResolveToken() {
        return this.resolveToken;
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.truecaller.remoteconfig.experiment.ExperimentActivationRequestDtoFlag> component3() {
        return this.flags;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component4, reason: from getter */
    public final java.lang.String getOs() {
        return this.os;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.remoteconfig.experiment.ExperimentActivationRequestDto copy(@org.jetbrains.annotations.NotNull java.lang.String resolveId, @org.jetbrains.annotations.NotNull java.lang.String resolveToken, @org.jetbrains.annotations.NotNull java.util.List<com.truecaller.remoteconfig.experiment.ExperimentActivationRequestDtoFlag> flags, @org.jetbrains.annotations.NotNull java.lang.String os) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resolveId, "resolveId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resolveToken, "resolveToken");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flags, "flags");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(os, "os");
        return new com.truecaller.remoteconfig.experiment.ExperimentActivationRequestDto(resolveId, resolveToken, flags, os);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.remoteconfig.experiment.ExperimentActivationRequestDto)) {
            return false;
        }
        com.truecaller.remoteconfig.experiment.ExperimentActivationRequestDto experimentActivationRequestDto = (com.truecaller.remoteconfig.experiment.ExperimentActivationRequestDto) other;
        return kotlin.jvm.internal.Intrinsics.b(this.resolveId, experimentActivationRequestDto.resolveId) && kotlin.jvm.internal.Intrinsics.b(this.resolveToken, experimentActivationRequestDto.resolveToken) && kotlin.jvm.internal.Intrinsics.b(this.flags, experimentActivationRequestDto.flags) && kotlin.jvm.internal.Intrinsics.b(this.os, experimentActivationRequestDto.os);
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.truecaller.remoteconfig.experiment.ExperimentActivationRequestDtoFlag> getFlags() {
        return this.flags;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getOs() {
        return this.os;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getResolveId() {
        return this.resolveId;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getResolveToken() {
        return this.resolveToken;
    }

    public int hashCode() {
        return this.os.hashCode() + uf.qux.g(ax1.bar.e(this.resolveId.hashCode() * 31, 31, this.resolveToken), 31, this.flags);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        java.lang.String str = this.resolveId;
        java.lang.String str2 = this.resolveToken;
        java.util.List<com.truecaller.remoteconfig.experiment.ExperimentActivationRequestDtoFlag> list = this.flags;
        java.lang.String str3 = this.os;
        java.lang.StringBuilder E = ro0.f.E("ExperimentActivationRequestDto(resolveId=", str, ", resolveToken=", str2, ", flags=");
        E.append(list);
        E.append(", os=");
        E.append(str3);
        E.append(")");
        return E.toString();
    }

    public /* synthetic */ ExperimentActivationRequestDto(java.lang.String str, java.lang.String str2, java.util.List list, java.lang.String str3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, list, (i & 8) != 0 ? "android" : str3);
    }
}
