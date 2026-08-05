package com.truecaller.call_assistant.core.data;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0007¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0007HÆ\u0003JM\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0007HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u00032\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013¨\u0006!"}, d2 = {"Lcom/truecaller/call_assistant/core/data/AssistantPresetResponsesResponseDto;", "", "success", "", com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.MESSAGE_COLUMN, "", "defaultPresets", "", "Lcom/truecaller/call_assistant/core/data/AssistantPresetResponse;", "presets", "staticPresets", "Lcom/truecaller/call_assistant/core/data/AssistantStaticPresetResponse;", "<init>", "(ZLjava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getSuccess", "()Z", "getMessage", "()Ljava/lang/String;", "getDefaultPresets", "()Ljava/util/List;", "getPresets", "getStaticPresets", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "core_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class AssistantPresetResponsesResponseDto {
    public static final int $stable = 8;

    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.truecaller.call_assistant.core.data.AssistantPresetResponse> defaultPresets;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String message;

    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.truecaller.call_assistant.core.data.AssistantPresetResponse> presets;

    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.truecaller.call_assistant.core.data.AssistantStaticPresetResponse> staticPresets;
    private final boolean success;

    public AssistantPresetResponsesResponseDto(boolean z, @org.jetbrains.annotations.NotNull java.lang.String str, @org.jetbrains.annotations.NotNull java.util.List<com.truecaller.call_assistant.core.data.AssistantPresetResponse> list, @org.jetbrains.annotations.NotNull java.util.List<com.truecaller.call_assistant.core.data.AssistantPresetResponse> list2, @org.jetbrains.annotations.NotNull java.util.List<com.truecaller.call_assistant.core.data.AssistantStaticPresetResponse> list3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.MESSAGE_COLUMN);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "defaultPresets");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "presets");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list3, "staticPresets");
        this.success = z;
        this.message = str;
        this.defaultPresets = list;
        this.presets = list2;
        this.staticPresets = list3;
    }

    public static /* synthetic */ com.truecaller.call_assistant.core.data.AssistantPresetResponsesResponseDto copy$default(com.truecaller.call_assistant.core.data.AssistantPresetResponsesResponseDto assistantPresetResponsesResponseDto, boolean z, java.lang.String str, java.util.List list, java.util.List list2, java.util.List list3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = assistantPresetResponsesResponseDto.success;
        }
        if ((i & 2) != 0) {
            str = assistantPresetResponsesResponseDto.message;
        }
        if ((i & 4) != 0) {
            list = assistantPresetResponsesResponseDto.defaultPresets;
        }
        if ((i & 8) != 0) {
            list2 = assistantPresetResponsesResponseDto.presets;
        }
        if ((i & 16) != 0) {
            list3 = assistantPresetResponsesResponseDto.staticPresets;
        }
        java.util.List list4 = list3;
        java.util.List list5 = list;
        return assistantPresetResponsesResponseDto.copy(z, str, list5, list2, list4);
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
        return this.defaultPresets;
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.truecaller.call_assistant.core.data.AssistantPresetResponse> component4() {
        return this.presets;
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.truecaller.call_assistant.core.data.AssistantStaticPresetResponse> component5() {
        return this.staticPresets;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.call_assistant.core.data.AssistantPresetResponsesResponseDto copy(boolean success, @org.jetbrains.annotations.NotNull java.lang.String message, @org.jetbrains.annotations.NotNull java.util.List<com.truecaller.call_assistant.core.data.AssistantPresetResponse> defaultPresets, @org.jetbrains.annotations.NotNull java.util.List<com.truecaller.call_assistant.core.data.AssistantPresetResponse> presets, @org.jetbrains.annotations.NotNull java.util.List<com.truecaller.call_assistant.core.data.AssistantStaticPresetResponse> staticPresets) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.MESSAGE_COLUMN);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(defaultPresets, "defaultPresets");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(presets, "presets");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(staticPresets, "staticPresets");
        return new com.truecaller.call_assistant.core.data.AssistantPresetResponsesResponseDto(success, message, defaultPresets, presets, staticPresets);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.call_assistant.core.data.AssistantPresetResponsesResponseDto)) {
            return false;
        }
        com.truecaller.call_assistant.core.data.AssistantPresetResponsesResponseDto assistantPresetResponsesResponseDto = (com.truecaller.call_assistant.core.data.AssistantPresetResponsesResponseDto) other;
        return this.success == assistantPresetResponsesResponseDto.success && kotlin.jvm.internal.Intrinsics.b(this.message, assistantPresetResponsesResponseDto.message) && kotlin.jvm.internal.Intrinsics.b(this.defaultPresets, assistantPresetResponsesResponseDto.defaultPresets) && kotlin.jvm.internal.Intrinsics.b(this.presets, assistantPresetResponsesResponseDto.presets) && kotlin.jvm.internal.Intrinsics.b(this.staticPresets, assistantPresetResponsesResponseDto.staticPresets);
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.truecaller.call_assistant.core.data.AssistantPresetResponse> getDefaultPresets() {
        return this.defaultPresets;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getMessage() {
        return this.message;
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.truecaller.call_assistant.core.data.AssistantPresetResponse> getPresets() {
        return this.presets;
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.truecaller.call_assistant.core.data.AssistantStaticPresetResponse> getStaticPresets() {
        return this.staticPresets;
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
        return this.staticPresets.hashCode() + uf.qux.g(uf.qux.g(ax1.bar.e(i * 31, 31, this.message), 31, this.defaultPresets), 31, this.presets);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        boolean z = this.success;
        java.lang.String str = this.message;
        java.util.List<com.truecaller.call_assistant.core.data.AssistantPresetResponse> list = this.defaultPresets;
        java.util.List<com.truecaller.call_assistant.core.data.AssistantPresetResponse> list2 = this.presets;
        java.util.List<com.truecaller.call_assistant.core.data.AssistantStaticPresetResponse> list3 = this.staticPresets;
        java.lang.StringBuilder u = bx.e1.u("AssistantPresetResponsesResponseDto(success=", ", message=", str, ", defaultPresets=", z);
        com.ironsource.adqualitysdk.sdk.i.bar.y(u, list, ", presets=", list2, ", staticPresets=");
        return y.o.g(u, list3, ")");
    }
}
