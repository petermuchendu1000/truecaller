package com.truecaller.voicemail.domain.data.network.model;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/truecaller/voicemail/domain/data/network/model/VoicemailsResponse;", "", "voicemails", "", "Lcom/truecaller/voicemail/domain/data/network/model/VoicemailResponse;", "hasMore", "", "<init>", "(Ljava/util/List;Z)V", "getVoicemails", "()Ljava/util/List;", "getHasMore", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "domain_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final /* data */ class VoicemailsResponse {
    private final boolean hasMore;

    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.truecaller.voicemail.domain.data.network.model.VoicemailResponse> voicemails;

    public VoicemailsResponse(@org.jetbrains.annotations.NotNull java.util.List<com.truecaller.voicemail.domain.data.network.model.VoicemailResponse> list, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "voicemails");
        this.voicemails = list;
        this.hasMore = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.truecaller.voicemail.domain.data.network.model.VoicemailsResponse copy$default(com.truecaller.voicemail.domain.data.network.model.VoicemailsResponse voicemailsResponse, java.util.List list, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = voicemailsResponse.voicemails;
        }
        if ((i & 2) != 0) {
            z = voicemailsResponse.hasMore;
        }
        return voicemailsResponse.copy(list, z);
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.truecaller.voicemail.domain.data.network.model.VoicemailResponse> component1() {
        return this.voicemails;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getHasMore() {
        return this.hasMore;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.voicemail.domain.data.network.model.VoicemailsResponse copy(@org.jetbrains.annotations.NotNull java.util.List<com.truecaller.voicemail.domain.data.network.model.VoicemailResponse> voicemails, boolean hasMore) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(voicemails, "voicemails");
        return new com.truecaller.voicemail.domain.data.network.model.VoicemailsResponse(voicemails, hasMore);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.voicemail.domain.data.network.model.VoicemailsResponse)) {
            return false;
        }
        com.truecaller.voicemail.domain.data.network.model.VoicemailsResponse voicemailsResponse = (com.truecaller.voicemail.domain.data.network.model.VoicemailsResponse) other;
        return kotlin.jvm.internal.Intrinsics.b(this.voicemails, voicemailsResponse.voicemails) && this.hasMore == voicemailsResponse.hasMore;
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.truecaller.voicemail.domain.data.network.model.VoicemailResponse> getVoicemails() {
        return this.voicemails;
    }

    public int hashCode() {
        return (this.voicemails.hashCode() * 31) + (this.hasMore ? 1231 : 1237);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return "VoicemailsResponse(voicemails=" + this.voicemails + ", hasMore=" + this.hasMore + ")";
    }
}
