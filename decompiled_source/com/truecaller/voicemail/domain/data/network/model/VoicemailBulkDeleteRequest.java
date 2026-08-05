package com.truecaller.voicemail.domain.data.network.model;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0004HÖ\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0011"}, d2 = {"Lcom/truecaller/voicemail/domain/data/network/model/VoicemailBulkDeleteRequest;", "", "voicemailIds", "", "", "<init>", "(Ljava/util/List;)V", "getVoicemailIds", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final /* data */ class VoicemailBulkDeleteRequest {

    @bw.qux("voicemailIds")
    @org.jetbrains.annotations.NotNull
    private final java.util.List<java.lang.String> voicemailIds;

    public VoicemailBulkDeleteRequest(@org.jetbrains.annotations.NotNull java.util.List<java.lang.String> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "voicemailIds");
        this.voicemailIds = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.truecaller.voicemail.domain.data.network.model.VoicemailBulkDeleteRequest copy$default(com.truecaller.voicemail.domain.data.network.model.VoicemailBulkDeleteRequest voicemailBulkDeleteRequest, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = voicemailBulkDeleteRequest.voicemailIds;
        }
        return voicemailBulkDeleteRequest.copy(list);
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.String> component1() {
        return this.voicemailIds;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.voicemail.domain.data.network.model.VoicemailBulkDeleteRequest copy(@org.jetbrains.annotations.NotNull java.util.List<java.lang.String> voicemailIds) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(voicemailIds, "voicemailIds");
        return new com.truecaller.voicemail.domain.data.network.model.VoicemailBulkDeleteRequest(voicemailIds);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.truecaller.voicemail.domain.data.network.model.VoicemailBulkDeleteRequest) && kotlin.jvm.internal.Intrinsics.b(this.voicemailIds, ((com.truecaller.voicemail.domain.data.network.model.VoicemailBulkDeleteRequest) other).voicemailIds);
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.String> getVoicemailIds() {
        return this.voicemailIds;
    }

    public int hashCode() {
        return this.voicemailIds.hashCode();
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return com.appsflyer.internal.e.k("VoicemailBulkDeleteRequest(voicemailIds=", ")", this.voicemailIds);
    }
}
