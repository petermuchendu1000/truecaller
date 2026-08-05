package com.truecaller.voicemail.domain.data.network.model;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J;\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0010¨\u0006\u001c"}, d2 = {"Lcom/truecaller/voicemail/domain/data/network/model/VoicemailLanguageResponse;", "", "id", "", com.unity3d.ads.metadata.MediationMetaData.KEY_NAME, "nativeName", "code", "isDefault", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getId", "()Ljava/lang/String;", "getName", "getNativeName", "getCode", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "domain_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final /* data */ class VoicemailLanguageResponse {

    @org.jetbrains.annotations.NotNull
    private final java.lang.String code;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String id;
    private final boolean isDefault;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String name;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String nativeName;

    public VoicemailLanguageResponse(@org.jetbrains.annotations.NotNull java.lang.String str, @org.jetbrains.annotations.NotNull java.lang.String str2, @org.jetbrains.annotations.NotNull java.lang.String str3, @org.jetbrains.annotations.NotNull java.lang.String str4, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "id");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, com.unity3d.ads.metadata.MediationMetaData.KEY_NAME);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "nativeName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "code");
        this.id = str;
        this.name = str2;
        this.nativeName = str3;
        this.code = str4;
        this.isDefault = z;
    }

    public static /* synthetic */ com.truecaller.voicemail.domain.data.network.model.VoicemailLanguageResponse copy$default(com.truecaller.voicemail.domain.data.network.model.VoicemailLanguageResponse voicemailLanguageResponse, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = voicemailLanguageResponse.id;
        }
        if ((i & 2) != 0) {
            str2 = voicemailLanguageResponse.name;
        }
        if ((i & 4) != 0) {
            str3 = voicemailLanguageResponse.nativeName;
        }
        if ((i & 8) != 0) {
            str4 = voicemailLanguageResponse.code;
        }
        if ((i & 16) != 0) {
            z = voicemailLanguageResponse.isDefault;
        }
        boolean z2 = z;
        java.lang.String str5 = str3;
        return voicemailLanguageResponse.copy(str, str2, str5, str4, z2);
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component2, reason: from getter */
    public final java.lang.String getName() {
        return this.name;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component3, reason: from getter */
    public final java.lang.String getNativeName() {
        return this.nativeName;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component4, reason: from getter */
    public final java.lang.String getCode() {
        return this.code;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsDefault() {
        return this.isDefault;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.voicemail.domain.data.network.model.VoicemailLanguageResponse copy(@org.jetbrains.annotations.NotNull java.lang.String id, @org.jetbrains.annotations.NotNull java.lang.String name, @org.jetbrains.annotations.NotNull java.lang.String nativeName, @org.jetbrains.annotations.NotNull java.lang.String code, boolean isDefault) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "id");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, com.unity3d.ads.metadata.MediationMetaData.KEY_NAME);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nativeName, "nativeName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(code, "code");
        return new com.truecaller.voicemail.domain.data.network.model.VoicemailLanguageResponse(id, name, nativeName, code, isDefault);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.voicemail.domain.data.network.model.VoicemailLanguageResponse)) {
            return false;
        }
        com.truecaller.voicemail.domain.data.network.model.VoicemailLanguageResponse voicemailLanguageResponse = (com.truecaller.voicemail.domain.data.network.model.VoicemailLanguageResponse) other;
        return kotlin.jvm.internal.Intrinsics.b(this.id, voicemailLanguageResponse.id) && kotlin.jvm.internal.Intrinsics.b(this.name, voicemailLanguageResponse.name) && kotlin.jvm.internal.Intrinsics.b(this.nativeName, voicemailLanguageResponse.nativeName) && kotlin.jvm.internal.Intrinsics.b(this.code, voicemailLanguageResponse.code) && this.isDefault == voicemailLanguageResponse.isDefault;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getCode() {
        return this.code;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getId() {
        return this.id;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getName() {
        return this.name;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getNativeName() {
        return this.nativeName;
    }

    public int hashCode() {
        int i;
        int e = ax1.bar.e(ax1.bar.e(ax1.bar.e(this.id.hashCode() * 31, 31, this.name), 31, this.nativeName), 31, this.code);
        if (this.isDefault) {
            i = 1231;
        } else {
            i = 1237;
        }
        return e + i;
    }

    public final boolean isDefault() {
        return this.isDefault;
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        java.lang.String str = this.id;
        java.lang.String str2 = this.name;
        java.lang.String str3 = this.nativeName;
        java.lang.String str4 = this.code;
        boolean z = this.isDefault;
        java.lang.StringBuilder E = ro0.f.E("VoicemailLanguageResponse(id=", str, ", name=", str2, ", nativeName=");
        bar.E(E, str3, ", code=", str4, ", isDefault=");
        return h8.s0.s(E, z, ")");
    }

    public /* synthetic */ VoicemailLanguageResponse(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, (i & 16) != 0 ? false : z);
    }
}
