package com.truecaller.call_assistant.core.utils;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/truecaller/call_assistant/core/utils/ClonedVoiceFeatureAvailabilityDTO;", "", "customQuickResponses", "", "customText", "customGreeting", "voicemail", "<init>", "(IIII)V", "getCustomQuickResponses", "()I", "getCustomText", "getCustomGreeting", "getVoicemail", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "core_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class ClonedVoiceFeatureAvailabilityDTO {
    public static final int $stable = 0;
    private final int customGreeting;
    private final int customQuickResponses;
    private final int customText;
    private final int voicemail;

    public ClonedVoiceFeatureAvailabilityDTO() {
        this(0, 0, 0, 0, 15, null);
    }

    public static /* synthetic */ com.truecaller.call_assistant.core.utils.ClonedVoiceFeatureAvailabilityDTO copy$default(com.truecaller.call_assistant.core.utils.ClonedVoiceFeatureAvailabilityDTO clonedVoiceFeatureAvailabilityDTO, int i, int i2, int i3, int i4, int i5, java.lang.Object obj) {
        if ((i5 & 1) != 0) {
            i = clonedVoiceFeatureAvailabilityDTO.customQuickResponses;
        }
        if ((i5 & 2) != 0) {
            i2 = clonedVoiceFeatureAvailabilityDTO.customText;
        }
        if ((i5 & 4) != 0) {
            i3 = clonedVoiceFeatureAvailabilityDTO.customGreeting;
        }
        if ((i5 & 8) != 0) {
            i4 = clonedVoiceFeatureAvailabilityDTO.voicemail;
        }
        return clonedVoiceFeatureAvailabilityDTO.copy(i, i2, i3, i4);
    }

    /* renamed from: component1, reason: from getter */
    public final int getCustomQuickResponses() {
        return this.customQuickResponses;
    }

    /* renamed from: component2, reason: from getter */
    public final int getCustomText() {
        return this.customText;
    }

    /* renamed from: component3, reason: from getter */
    public final int getCustomGreeting() {
        return this.customGreeting;
    }

    /* renamed from: component4, reason: from getter */
    public final int getVoicemail() {
        return this.voicemail;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.call_assistant.core.utils.ClonedVoiceFeatureAvailabilityDTO copy(int customQuickResponses, int customText, int customGreeting, int voicemail) {
        return new com.truecaller.call_assistant.core.utils.ClonedVoiceFeatureAvailabilityDTO(customQuickResponses, customText, customGreeting, voicemail);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.call_assistant.core.utils.ClonedVoiceFeatureAvailabilityDTO)) {
            return false;
        }
        com.truecaller.call_assistant.core.utils.ClonedVoiceFeatureAvailabilityDTO clonedVoiceFeatureAvailabilityDTO = (com.truecaller.call_assistant.core.utils.ClonedVoiceFeatureAvailabilityDTO) other;
        return this.customQuickResponses == clonedVoiceFeatureAvailabilityDTO.customQuickResponses && this.customText == clonedVoiceFeatureAvailabilityDTO.customText && this.customGreeting == clonedVoiceFeatureAvailabilityDTO.customGreeting && this.voicemail == clonedVoiceFeatureAvailabilityDTO.voicemail;
    }

    public final int getCustomGreeting() {
        return this.customGreeting;
    }

    public final int getCustomQuickResponses() {
        return this.customQuickResponses;
    }

    public final int getCustomText() {
        return this.customText;
    }

    public final int getVoicemail() {
        return this.voicemail;
    }

    public int hashCode() {
        return (((((this.customQuickResponses * 31) + this.customText) * 31) + this.customGreeting) * 31) + this.voicemail;
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return h8.s0.l(this.customGreeting, this.voicemail, ", voicemail=", ")", z0.a0.e(this.customQuickResponses, this.customText, "ClonedVoiceFeatureAvailabilityDTO(customQuickResponses=", ", customText=", ", customGreeting="));
    }

    public ClonedVoiceFeatureAvailabilityDTO(int i, int i2, int i3, int i4) {
        this.customQuickResponses = i;
        this.customText = i2;
        this.customGreeting = i3;
        this.voicemail = i4;
    }

    public /* synthetic */ ClonedVoiceFeatureAvailabilityDTO(int i, int i2, int i3, int i4, int i5, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? 1 : i, (i5 & 2) != 0 ? 1 : i2, (i5 & 4) != 0 ? 1 : i3, (i5 & 8) != 0 ? 1 : i4);
    }
}
