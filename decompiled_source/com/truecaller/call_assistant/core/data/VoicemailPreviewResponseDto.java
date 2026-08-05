package com.truecaller.call_assistant.core.data;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/truecaller/call_assistant/core/data/VoicemailPreviewResponseDto;", "", "success", "", "url", "", "<init>", "(ZLjava/lang/String;)V", "getSuccess", "()Z", "getUrl", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "core_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class VoicemailPreviewResponseDto {
    public static final int $stable = 0;
    private final boolean success;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String url;

    public VoicemailPreviewResponseDto(boolean z, @org.jetbrains.annotations.Nullable java.lang.String str) {
        this.success = z;
        this.url = str;
    }

    public static /* synthetic */ com.truecaller.call_assistant.core.data.VoicemailPreviewResponseDto copy$default(com.truecaller.call_assistant.core.data.VoicemailPreviewResponseDto voicemailPreviewResponseDto, boolean z, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = voicemailPreviewResponseDto.success;
        }
        if ((i & 2) != 0) {
            str = voicemailPreviewResponseDto.url;
        }
        return voicemailPreviewResponseDto.copy(z, str);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getSuccess() {
        return this.success;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component2, reason: from getter */
    public final java.lang.String getUrl() {
        return this.url;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.call_assistant.core.data.VoicemailPreviewResponseDto copy(boolean success, @org.jetbrains.annotations.Nullable java.lang.String url) {
        return new com.truecaller.call_assistant.core.data.VoicemailPreviewResponseDto(success, url);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.call_assistant.core.data.VoicemailPreviewResponseDto)) {
            return false;
        }
        com.truecaller.call_assistant.core.data.VoicemailPreviewResponseDto voicemailPreviewResponseDto = (com.truecaller.call_assistant.core.data.VoicemailPreviewResponseDto) other;
        return this.success == voicemailPreviewResponseDto.success && kotlin.jvm.internal.Intrinsics.b(this.url, voicemailPreviewResponseDto.url);
    }

    public final boolean getSuccess() {
        return this.success;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int i;
        int hashCode;
        if (this.success) {
            i = 1231;
        } else {
            i = 1237;
        }
        int i2 = i * 31;
        java.lang.String str = this.url;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return i2 + hashCode;
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return bx.e1.s("VoicemailPreviewResponseDto(success=", this.success, ", url=", this.url, ")");
    }
}
