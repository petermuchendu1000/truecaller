package com.truecaller.voicemail.domain.data.network.model;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\n\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u001e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/truecaller/voicemail/domain/data/network/model/VoicemailVoicesResponse;", "", "voices", "", "Lcom/truecaller/voicemail/domain/data/network/model/VoicemailVoiceItemResponse;", "<init>", "(Ljava/util/List;)V", "getVoices", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "domain_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final /* data */ class VoicemailVoicesResponse {

    @bw.qux("voices")
    @org.jetbrains.annotations.Nullable
    private final java.util.List<com.truecaller.voicemail.domain.data.network.model.VoicemailVoiceItemResponse> voices;

    public VoicemailVoicesResponse(@org.jetbrains.annotations.Nullable java.util.List<com.truecaller.voicemail.domain.data.network.model.VoicemailVoiceItemResponse> list) {
        this.voices = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.truecaller.voicemail.domain.data.network.model.VoicemailVoicesResponse copy$default(com.truecaller.voicemail.domain.data.network.model.VoicemailVoicesResponse voicemailVoicesResponse, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = voicemailVoicesResponse.voices;
        }
        return voicemailVoicesResponse.copy(list);
    }

    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.truecaller.voicemail.domain.data.network.model.VoicemailVoiceItemResponse> component1() {
        return this.voices;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.voicemail.domain.data.network.model.VoicemailVoicesResponse copy(@org.jetbrains.annotations.Nullable java.util.List<com.truecaller.voicemail.domain.data.network.model.VoicemailVoiceItemResponse> voices) {
        return new com.truecaller.voicemail.domain.data.network.model.VoicemailVoicesResponse(voices);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.truecaller.voicemail.domain.data.network.model.VoicemailVoicesResponse) && kotlin.jvm.internal.Intrinsics.b(this.voices, ((com.truecaller.voicemail.domain.data.network.model.VoicemailVoicesResponse) other).voices);
    }

    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.truecaller.voicemail.domain.data.network.model.VoicemailVoiceItemResponse> getVoices() {
        return this.voices;
    }

    public int hashCode() {
        java.util.List<com.truecaller.voicemail.domain.data.network.model.VoicemailVoiceItemResponse> list = this.voices;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return com.appsflyer.internal.e.k("VoicemailVoicesResponse(voices=", ")", this.voices);
    }
}
