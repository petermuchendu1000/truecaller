package com.truecaller.call_assistant.core.data;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J-\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001a"}, d2 = {"Lcom/truecaller/call_assistant/core/data/AssistantUpdatePresetResponseDto;", "", "success", "", com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.MESSAGE_COLUMN, "", "presets", "", "Lcom/truecaller/call_assistant/core/data/AssistantPresetResponse;", "<init>", "(ZLjava/lang/String;Ljava/util/List;)V", "getSuccess", "()Z", "getMessage", "()Ljava/lang/String;", "getPresets", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "core_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class AssistantUpdatePresetResponseDto {
    public static final int $stable = 8;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String message;

    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.truecaller.call_assistant.core.data.AssistantPresetResponse> presets;
    private final boolean success;

    public AssistantUpdatePresetResponseDto(boolean z, @org.jetbrains.annotations.NotNull java.lang.String str, @org.jetbrains.annotations.NotNull java.util.List<com.truecaller.call_assistant.core.data.AssistantPresetResponse> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.MESSAGE_COLUMN);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "presets");
        this.success = z;
        this.message = str;
        this.presets = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.truecaller.call_assistant.core.data.AssistantUpdatePresetResponseDto copy$default(com.truecaller.call_assistant.core.data.AssistantUpdatePresetResponseDto assistantUpdatePresetResponseDto, boolean z, java.lang.String str, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = assistantUpdatePresetResponseDto.success;
        }
        if ((i & 2) != 0) {
            str = assistantUpdatePresetResponseDto.message;
        }
        if ((i & 4) != 0) {
            list = assistantUpdatePresetResponseDto.presets;
        }
        return assistantUpdatePresetResponseDto.copy(z, str, list);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getSuccess() {
        return this.success;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component2, reason: from getter */
    public final java.lang.String getMessage() {
        return this.message;
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.truecaller.call_assistant.core.data.AssistantPresetResponse> component3() {
        return this.presets;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.call_assistant.core.data.AssistantUpdatePresetResponseDto copy(boolean success, @org.jetbrains.annotations.NotNull java.lang.String message, @org.jetbrains.annotations.NotNull java.util.List<com.truecaller.call_assistant.core.data.AssistantPresetResponse> presets) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.MESSAGE_COLUMN);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(presets, "presets");
        return new com.truecaller.call_assistant.core.data.AssistantUpdatePresetResponseDto(success, message, presets);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.call_assistant.core.data.AssistantUpdatePresetResponseDto)) {
            return false;
        }
        com.truecaller.call_assistant.core.data.AssistantUpdatePresetResponseDto assistantUpdatePresetResponseDto = (com.truecaller.call_assistant.core.data.AssistantUpdatePresetResponseDto) other;
        return this.success == assistantUpdatePresetResponseDto.success && kotlin.jvm.internal.Intrinsics.b(this.message, assistantUpdatePresetResponseDto.message) && kotlin.jvm.internal.Intrinsics.b(this.presets, assistantUpdatePresetResponseDto.presets);
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getMessage() {
        return this.message;
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.truecaller.call_assistant.core.data.AssistantPresetResponse> getPresets() {
        return this.presets;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    public int hashCode() {
        int i;
        if (this.success) {
            i = 1231;
        } else {
            i = 1237;
        }
        return this.presets.hashCode() + ax1.bar.e(i * 31, 31, this.message);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        boolean z = this.success;
        java.lang.String str = this.message;
        return y.o.g(bx.e1.u("AssistantUpdatePresetResponseDto(success=", ", message=", str, ", presets=", z), this.presets, ")");
    }
}
