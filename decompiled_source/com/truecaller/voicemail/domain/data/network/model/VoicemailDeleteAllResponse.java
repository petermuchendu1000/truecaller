package com.truecaller.voicemail.domain.data.network.model;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/truecaller/voicemail/domain/data/network/model/VoicemailDeleteAllResponse;", "", "success", "", "<init>", "(Z)V", "getSuccess", "()Z", "component1", "copy", "equals", "other", "hashCode", "", "toString", "", "domain_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final /* data */ class VoicemailDeleteAllResponse {

    @bw.qux("success")
    private final boolean success;

    public VoicemailDeleteAllResponse(boolean z) {
        this.success = z;
    }

    public static /* synthetic */ com.truecaller.voicemail.domain.data.network.model.VoicemailDeleteAllResponse copy$default(com.truecaller.voicemail.domain.data.network.model.VoicemailDeleteAllResponse voicemailDeleteAllResponse, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = voicemailDeleteAllResponse.success;
        }
        return voicemailDeleteAllResponse.copy(z);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getSuccess() {
        return this.success;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.voicemail.domain.data.network.model.VoicemailDeleteAllResponse copy(boolean success) {
        return new com.truecaller.voicemail.domain.data.network.model.VoicemailDeleteAllResponse(success);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.truecaller.voicemail.domain.data.network.model.VoicemailDeleteAllResponse) && this.success == ((com.truecaller.voicemail.domain.data.network.model.VoicemailDeleteAllResponse) other).success;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    public int hashCode() {
        return this.success ? 1231 : 1237;
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return ro0.f.D("VoicemailDeleteAllResponse(success=", ")", this.success);
    }
}
