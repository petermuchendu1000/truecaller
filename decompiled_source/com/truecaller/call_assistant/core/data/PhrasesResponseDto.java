package com.truecaller.call_assistant.core.data;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/truecaller/call_assistant/core/data/PhrasesResponseDto;", "", "consentPhrase", "", "dynamicPhrase", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getConsentPhrase", "()Ljava/lang/String;", "getDynamicPhrase", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "core_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class PhrasesResponseDto {
    public static final int $stable = 0;

    @bw.qux("consentPhrase")
    @org.jetbrains.annotations.Nullable
    private final java.lang.String consentPhrase;

    @bw.qux("dynamicPhrase")
    @org.jetbrains.annotations.Nullable
    private final java.lang.String dynamicPhrase;

    public PhrasesResponseDto(@org.jetbrains.annotations.Nullable java.lang.String str, @org.jetbrains.annotations.Nullable java.lang.String str2) {
        this.consentPhrase = str;
        this.dynamicPhrase = str2;
    }

    public static /* synthetic */ com.truecaller.call_assistant.core.data.PhrasesResponseDto copy$default(com.truecaller.call_assistant.core.data.PhrasesResponseDto phrasesResponseDto, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = phrasesResponseDto.consentPhrase;
        }
        if ((i & 2) != 0) {
            str2 = phrasesResponseDto.dynamicPhrase;
        }
        return phrasesResponseDto.copy(str, str2);
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component1, reason: from getter */
    public final java.lang.String getConsentPhrase() {
        return this.consentPhrase;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component2, reason: from getter */
    public final java.lang.String getDynamicPhrase() {
        return this.dynamicPhrase;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.call_assistant.core.data.PhrasesResponseDto copy(@org.jetbrains.annotations.Nullable java.lang.String consentPhrase, @org.jetbrains.annotations.Nullable java.lang.String dynamicPhrase) {
        return new com.truecaller.call_assistant.core.data.PhrasesResponseDto(consentPhrase, dynamicPhrase);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.call_assistant.core.data.PhrasesResponseDto)) {
            return false;
        }
        com.truecaller.call_assistant.core.data.PhrasesResponseDto phrasesResponseDto = (com.truecaller.call_assistant.core.data.PhrasesResponseDto) other;
        return kotlin.jvm.internal.Intrinsics.b(this.consentPhrase, phrasesResponseDto.consentPhrase) && kotlin.jvm.internal.Intrinsics.b(this.dynamicPhrase, phrasesResponseDto.dynamicPhrase);
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getConsentPhrase() {
        return this.consentPhrase;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getDynamicPhrase() {
        return this.dynamicPhrase;
    }

    public int hashCode() {
        java.lang.String str = this.consentPhrase;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.lang.String str2 = this.dynamicPhrase;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return y.o.e("PhrasesResponseDto(consentPhrase=", this.consentPhrase, ", dynamicPhrase=", this.dynamicPhrase, ")");
    }
}
