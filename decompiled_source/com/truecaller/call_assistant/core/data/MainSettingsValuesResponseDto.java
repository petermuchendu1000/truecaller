package com.truecaller.call_assistant.core.data;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003JO\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u00052\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020#HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0016\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0016\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0016\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010¨\u0006$"}, d2 = {"Lcom/truecaller/call_assistant/core/data/MainSettingsValuesResponseDto;", "", "voice", "Lcom/truecaller/call_assistant/core/data/VoiceDto;", "useNamedIntroForUnknown", "", "handleMissedCallsFromContacts", "handleMissedCallsFromUnknownNumbers", "assistantTranscriptionEnabled", "anonymizedDataConsent", "shouldAutoScreenCallsFromUnknown", "<init>", "(Lcom/truecaller/call_assistant/core/data/VoiceDto;ZZZZZZ)V", "getVoice", "()Lcom/truecaller/call_assistant/core/data/VoiceDto;", "getUseNamedIntroForUnknown", "()Z", "getHandleMissedCallsFromContacts", "getHandleMissedCallsFromUnknownNumbers", "getAssistantTranscriptionEnabled", "getAnonymizedDataConsent", "getShouldAutoScreenCallsFromUnknown", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "", "core_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class MainSettingsValuesResponseDto {
    public static final int $stable = 8;

    @bw.qux("anonymizedDataConsent")
    private final boolean anonymizedDataConsent;

    @bw.qux("assistantTranscriptionEnabled")
    private final boolean assistantTranscriptionEnabled;

    @bw.qux("screenMissedCallsFromContacts")
    private final boolean handleMissedCallsFromContacts;

    @bw.qux("screenMissedCallsFromUnknown")
    private final boolean handleMissedCallsFromUnknownNumbers;

    @bw.qux("automateScreenCallsFromUnknown")
    private final boolean shouldAutoScreenCallsFromUnknown;

    @bw.qux("useNamedIntroForUnknown")
    private final boolean useNamedIntroForUnknown;

    @bw.qux("voice")
    @org.jetbrains.annotations.NotNull
    private final com.truecaller.call_assistant.core.data.VoiceDto voice;

    public MainSettingsValuesResponseDto(@org.jetbrains.annotations.NotNull com.truecaller.call_assistant.core.data.VoiceDto voiceDto, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(voiceDto, "voice");
        this.voice = voiceDto;
        this.useNamedIntroForUnknown = z;
        this.handleMissedCallsFromContacts = z2;
        this.handleMissedCallsFromUnknownNumbers = z3;
        this.assistantTranscriptionEnabled = z4;
        this.anonymizedDataConsent = z5;
        this.shouldAutoScreenCallsFromUnknown = z6;
    }

    public static /* synthetic */ com.truecaller.call_assistant.core.data.MainSettingsValuesResponseDto copy$default(com.truecaller.call_assistant.core.data.MainSettingsValuesResponseDto mainSettingsValuesResponseDto, com.truecaller.call_assistant.core.data.VoiceDto voiceDto, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            voiceDto = mainSettingsValuesResponseDto.voice;
        }
        if ((i & 2) != 0) {
            z = mainSettingsValuesResponseDto.useNamedIntroForUnknown;
        }
        if ((i & 4) != 0) {
            z2 = mainSettingsValuesResponseDto.handleMissedCallsFromContacts;
        }
        if ((i & 8) != 0) {
            z3 = mainSettingsValuesResponseDto.handleMissedCallsFromUnknownNumbers;
        }
        if ((i & 16) != 0) {
            z4 = mainSettingsValuesResponseDto.assistantTranscriptionEnabled;
        }
        if ((i & 32) != 0) {
            z5 = mainSettingsValuesResponseDto.anonymizedDataConsent;
        }
        if ((i & 64) != 0) {
            z6 = mainSettingsValuesResponseDto.shouldAutoScreenCallsFromUnknown;
        }
        boolean z7 = z5;
        boolean z8 = z6;
        boolean z9 = z4;
        boolean z10 = z2;
        return mainSettingsValuesResponseDto.copy(voiceDto, z, z10, z3, z9, z7, z8);
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component1, reason: from getter */
    public final com.truecaller.call_assistant.core.data.VoiceDto getVoice() {
        return this.voice;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getUseNamedIntroForUnknown() {
        return this.useNamedIntroForUnknown;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getHandleMissedCallsFromContacts() {
        return this.handleMissedCallsFromContacts;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getHandleMissedCallsFromUnknownNumbers() {
        return this.handleMissedCallsFromUnknownNumbers;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getAssistantTranscriptionEnabled() {
        return this.assistantTranscriptionEnabled;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getAnonymizedDataConsent() {
        return this.anonymizedDataConsent;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getShouldAutoScreenCallsFromUnknown() {
        return this.shouldAutoScreenCallsFromUnknown;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.call_assistant.core.data.MainSettingsValuesResponseDto copy(@org.jetbrains.annotations.NotNull com.truecaller.call_assistant.core.data.VoiceDto voice, boolean useNamedIntroForUnknown, boolean handleMissedCallsFromContacts, boolean handleMissedCallsFromUnknownNumbers, boolean assistantTranscriptionEnabled, boolean anonymizedDataConsent, boolean shouldAutoScreenCallsFromUnknown) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(voice, "voice");
        return new com.truecaller.call_assistant.core.data.MainSettingsValuesResponseDto(voice, useNamedIntroForUnknown, handleMissedCallsFromContacts, handleMissedCallsFromUnknownNumbers, assistantTranscriptionEnabled, anonymizedDataConsent, shouldAutoScreenCallsFromUnknown);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.call_assistant.core.data.MainSettingsValuesResponseDto)) {
            return false;
        }
        com.truecaller.call_assistant.core.data.MainSettingsValuesResponseDto mainSettingsValuesResponseDto = (com.truecaller.call_assistant.core.data.MainSettingsValuesResponseDto) other;
        return kotlin.jvm.internal.Intrinsics.b(this.voice, mainSettingsValuesResponseDto.voice) && this.useNamedIntroForUnknown == mainSettingsValuesResponseDto.useNamedIntroForUnknown && this.handleMissedCallsFromContacts == mainSettingsValuesResponseDto.handleMissedCallsFromContacts && this.handleMissedCallsFromUnknownNumbers == mainSettingsValuesResponseDto.handleMissedCallsFromUnknownNumbers && this.assistantTranscriptionEnabled == mainSettingsValuesResponseDto.assistantTranscriptionEnabled && this.anonymizedDataConsent == mainSettingsValuesResponseDto.anonymizedDataConsent && this.shouldAutoScreenCallsFromUnknown == mainSettingsValuesResponseDto.shouldAutoScreenCallsFromUnknown;
    }

    public final boolean getAnonymizedDataConsent() {
        return this.anonymizedDataConsent;
    }

    public final boolean getAssistantTranscriptionEnabled() {
        return this.assistantTranscriptionEnabled;
    }

    public final boolean getHandleMissedCallsFromContacts() {
        return this.handleMissedCallsFromContacts;
    }

    public final boolean getHandleMissedCallsFromUnknownNumbers() {
        return this.handleMissedCallsFromUnknownNumbers;
    }

    public final boolean getShouldAutoScreenCallsFromUnknown() {
        return this.shouldAutoScreenCallsFromUnknown;
    }

    public final boolean getUseNamedIntroForUnknown() {
        return this.useNamedIntroForUnknown;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.call_assistant.core.data.VoiceDto getVoice() {
        return this.voice;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int hashCode = this.voice.hashCode() * 31;
        int i6 = 1237;
        if (this.useNamedIntroForUnknown) {
            i = 1231;
        } else {
            i = 1237;
        }
        int i7 = (hashCode + i) * 31;
        if (this.handleMissedCallsFromContacts) {
            i2 = 1231;
        } else {
            i2 = 1237;
        }
        int i8 = (i7 + i2) * 31;
        if (this.handleMissedCallsFromUnknownNumbers) {
            i3 = 1231;
        } else {
            i3 = 1237;
        }
        int i9 = (i8 + i3) * 31;
        if (this.assistantTranscriptionEnabled) {
            i4 = 1231;
        } else {
            i4 = 1237;
        }
        int i11 = (i9 + i4) * 31;
        if (this.anonymizedDataConsent) {
            i5 = 1231;
        } else {
            i5 = 1237;
        }
        int i12 = (i11 + i5) * 31;
        if (this.shouldAutoScreenCallsFromUnknown) {
            i6 = 1231;
        }
        return i12 + i6;
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        com.truecaller.call_assistant.core.data.VoiceDto voiceDto = this.voice;
        boolean z = this.useNamedIntroForUnknown;
        boolean z2 = this.handleMissedCallsFromContacts;
        boolean z3 = this.handleMissedCallsFromUnknownNumbers;
        boolean z4 = this.assistantTranscriptionEnabled;
        boolean z5 = this.anonymizedDataConsent;
        boolean z6 = this.shouldAutoScreenCallsFromUnknown;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("MainSettingsValuesResponseDto(voice=");
        sb.append(voiceDto);
        sb.append(", useNamedIntroForUnknown=");
        sb.append(z);
        sb.append(", handleMissedCallsFromContacts=");
        nc0.k1.p(sb, z2, ", handleMissedCallsFromUnknownNumbers=", z3, ", assistantTranscriptionEnabled=");
        nc0.k1.p(sb, z4, ", anonymizedDataConsent=", z5, ", shouldAutoScreenCallsFromUnknown=");
        return h8.s0.s(sb, z6, ")");
    }

    public /* synthetic */ MainSettingsValuesResponseDto(com.truecaller.call_assistant.core.data.VoiceDto voiceDto, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(voiceDto, z, z2, z3, (i & 16) != 0 ? false : z4, (i & 32) != 0 ? false : z5, (i & 64) != 0 ? false : z6);
    }
}
