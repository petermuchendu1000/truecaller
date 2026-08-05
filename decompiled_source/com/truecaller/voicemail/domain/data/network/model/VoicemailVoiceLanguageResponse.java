package com.truecaller.voicemail.domain.data.network.model;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/truecaller/voicemail/domain/data/network/model/VoicemailVoiceLanguageResponse;", "", "id", "", com.unity3d.ads.metadata.MediationMetaData.KEY_NAME, "nativeName", "code", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getName", "getNativeName", "getCode", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final /* data */ class VoicemailVoiceLanguageResponse {

    @bw.qux("code")
    @org.jetbrains.annotations.Nullable
    private final java.lang.String code;

    @bw.qux("_id")
    @org.jetbrains.annotations.Nullable
    private final java.lang.String id;

    @bw.qux(com.unity3d.ads.metadata.MediationMetaData.KEY_NAME)
    @org.jetbrains.annotations.Nullable
    private final java.lang.String name;

    @bw.qux("nativeName")
    @org.jetbrains.annotations.Nullable
    private final java.lang.String nativeName;

    public VoicemailVoiceLanguageResponse(@org.jetbrains.annotations.Nullable java.lang.String str, @org.jetbrains.annotations.Nullable java.lang.String str2, @org.jetbrains.annotations.Nullable java.lang.String str3, @org.jetbrains.annotations.Nullable java.lang.String str4) {
        this.id = str;
        this.name = str2;
        this.nativeName = str3;
        this.code = str4;
    }

    public static /* synthetic */ com.truecaller.voicemail.domain.data.network.model.VoicemailVoiceLanguageResponse copy$default(com.truecaller.voicemail.domain.data.network.model.VoicemailVoiceLanguageResponse voicemailVoiceLanguageResponse, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = voicemailVoiceLanguageResponse.id;
        }
        if ((i & 2) != 0) {
            str2 = voicemailVoiceLanguageResponse.name;
        }
        if ((i & 4) != 0) {
            str3 = voicemailVoiceLanguageResponse.nativeName;
        }
        if ((i & 8) != 0) {
            str4 = voicemailVoiceLanguageResponse.code;
        }
        return voicemailVoiceLanguageResponse.copy(str, str2, str3, str4);
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component2, reason: from getter */
    public final java.lang.String getName() {
        return this.name;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component3, reason: from getter */
    public final java.lang.String getNativeName() {
        return this.nativeName;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component4, reason: from getter */
    public final java.lang.String getCode() {
        return this.code;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.voicemail.domain.data.network.model.VoicemailVoiceLanguageResponse copy(@org.jetbrains.annotations.Nullable java.lang.String id, @org.jetbrains.annotations.Nullable java.lang.String name, @org.jetbrains.annotations.Nullable java.lang.String nativeName, @org.jetbrains.annotations.Nullable java.lang.String code) {
        return new com.truecaller.voicemail.domain.data.network.model.VoicemailVoiceLanguageResponse(id, name, nativeName, code);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.voicemail.domain.data.network.model.VoicemailVoiceLanguageResponse)) {
            return false;
        }
        com.truecaller.voicemail.domain.data.network.model.VoicemailVoiceLanguageResponse voicemailVoiceLanguageResponse = (com.truecaller.voicemail.domain.data.network.model.VoicemailVoiceLanguageResponse) other;
        return kotlin.jvm.internal.Intrinsics.b(this.id, voicemailVoiceLanguageResponse.id) && kotlin.jvm.internal.Intrinsics.b(this.name, voicemailVoiceLanguageResponse.name) && kotlin.jvm.internal.Intrinsics.b(this.nativeName, voicemailVoiceLanguageResponse.nativeName) && kotlin.jvm.internal.Intrinsics.b(this.code, voicemailVoiceLanguageResponse.code);
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getCode() {
        return this.code;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getId() {
        return this.id;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getName() {
        return this.name;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getNativeName() {
        return this.nativeName;
    }

    public int hashCode() {
        java.lang.String str = this.id;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.lang.String str2 = this.name;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.nativeName;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        java.lang.String str4 = this.code;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        java.lang.String str = this.id;
        java.lang.String str2 = this.name;
        return bar.x(ro0.f.E("VoicemailVoiceLanguageResponse(id=", str, ", name=", str2, ", nativeName="), this.nativeName, ", code=", this.code, ")");
    }
}
