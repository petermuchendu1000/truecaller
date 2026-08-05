package com.truecaller.call_assistant.core.data;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/truecaller/call_assistant/core/data/ListVoicesResponseDto;", "", "success", "", "voices", "", "Lcom/truecaller/call_assistant/core/data/CallAssistantVoice;", "<init>", "(ZLjava/util/List;)V", "getSuccess", "()Z", "getVoices", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "core_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class ListVoicesResponseDto {
    public static final int $stable = 8;
    private final boolean success;

    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.truecaller.call_assistant.core.data.CallAssistantVoice> voices;

    public ListVoicesResponseDto(boolean z, @org.jetbrains.annotations.NotNull java.util.List<com.truecaller.call_assistant.core.data.CallAssistantVoice> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "voices");
        this.success = z;
        this.voices = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.truecaller.call_assistant.core.data.ListVoicesResponseDto copy$default(com.truecaller.call_assistant.core.data.ListVoicesResponseDto listVoicesResponseDto, boolean z, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = listVoicesResponseDto.success;
        }
        if ((i & 2) != 0) {
            list = listVoicesResponseDto.voices;
        }
        return listVoicesResponseDto.copy(z, list);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getSuccess() {
        return this.success;
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.truecaller.call_assistant.core.data.CallAssistantVoice> component2() {
        return this.voices;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.call_assistant.core.data.ListVoicesResponseDto copy(boolean success, @org.jetbrains.annotations.NotNull java.util.List<com.truecaller.call_assistant.core.data.CallAssistantVoice> voices) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(voices, "voices");
        return new com.truecaller.call_assistant.core.data.ListVoicesResponseDto(success, voices);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.call_assistant.core.data.ListVoicesResponseDto)) {
            return false;
        }
        com.truecaller.call_assistant.core.data.ListVoicesResponseDto listVoicesResponseDto = (com.truecaller.call_assistant.core.data.ListVoicesResponseDto) other;
        return this.success == listVoicesResponseDto.success && kotlin.jvm.internal.Intrinsics.b(this.voices, listVoicesResponseDto.voices);
    }

    public final boolean getSuccess() {
        return this.success;
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.truecaller.call_assistant.core.data.CallAssistantVoice> getVoices() {
        return this.voices;
    }

    public int hashCode() {
        int i;
        if (this.success) {
            i = 1231;
        } else {
            i = 1237;
        }
        return this.voices.hashCode() + (i * 31);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return "ListVoicesResponseDto(success=" + this.success + ", voices=" + this.voices + ")";
    }
}
