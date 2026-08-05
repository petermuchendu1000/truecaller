package com.truecaller.voicemail.domain.data.network.model;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/truecaller/voicemail/domain/data/network/model/VoicemailDisableServiceRequest;", "", "reason", "", "<init>", "(Ljava/lang/String;)V", "getReason", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final /* data */ class VoicemailDisableServiceRequest {

    @org.jetbrains.annotations.NotNull
    private final java.lang.String reason;

    public VoicemailDisableServiceRequest(@org.jetbrains.annotations.NotNull java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "reason");
        this.reason = str;
    }

    public static /* synthetic */ com.truecaller.voicemail.domain.data.network.model.VoicemailDisableServiceRequest copy$default(com.truecaller.voicemail.domain.data.network.model.VoicemailDisableServiceRequest voicemailDisableServiceRequest, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = voicemailDisableServiceRequest.reason;
        }
        return voicemailDisableServiceRequest.copy(str);
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component1, reason: from getter */
    public final java.lang.String getReason() {
        return this.reason;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.voicemail.domain.data.network.model.VoicemailDisableServiceRequest copy(@org.jetbrains.annotations.NotNull java.lang.String reason) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reason, "reason");
        return new com.truecaller.voicemail.domain.data.network.model.VoicemailDisableServiceRequest(reason);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.truecaller.voicemail.domain.data.network.model.VoicemailDisableServiceRequest) && kotlin.jvm.internal.Intrinsics.b(this.reason, ((com.truecaller.voicemail.domain.data.network.model.VoicemailDisableServiceRequest) other).reason);
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getReason() {
        return this.reason;
    }

    public int hashCode() {
        return this.reason.hashCode();
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return bar.t("VoicemailDisableServiceRequest(reason=", this.reason, ")");
    }
}
