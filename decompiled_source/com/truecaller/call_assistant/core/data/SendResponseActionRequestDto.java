package com.truecaller.call_assistant.core.data;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J5\u0010\u0014\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u001a"}, d2 = {"Lcom/truecaller/call_assistant/core/data/SendResponseActionRequestDto;", "", "action", "", "callId", "", "customText", "presetResponseId", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAction", "()I", "getCallId", "()Ljava/lang/String;", "getCustomText", "getPresetResponseId", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "core_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class SendResponseActionRequestDto {
    public static final int $stable = 0;
    private final int action;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String callId;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String customText;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String presetResponseId;

    public SendResponseActionRequestDto(int i, @org.jetbrains.annotations.NotNull java.lang.String str, @org.jetbrains.annotations.Nullable java.lang.String str2, @org.jetbrains.annotations.Nullable java.lang.String str3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "callId");
        this.action = i;
        this.callId = str;
        this.customText = str2;
        this.presetResponseId = str3;
    }

    public static /* synthetic */ com.truecaller.call_assistant.core.data.SendResponseActionRequestDto copy$default(com.truecaller.call_assistant.core.data.SendResponseActionRequestDto sendResponseActionRequestDto, int i, java.lang.String str, java.lang.String str2, java.lang.String str3, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = sendResponseActionRequestDto.action;
        }
        if ((i2 & 2) != 0) {
            str = sendResponseActionRequestDto.callId;
        }
        if ((i2 & 4) != 0) {
            str2 = sendResponseActionRequestDto.customText;
        }
        if ((i2 & 8) != 0) {
            str3 = sendResponseActionRequestDto.presetResponseId;
        }
        return sendResponseActionRequestDto.copy(i, str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final int getAction() {
        return this.action;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component2, reason: from getter */
    public final java.lang.String getCallId() {
        return this.callId;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component3, reason: from getter */
    public final java.lang.String getCustomText() {
        return this.customText;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component4, reason: from getter */
    public final java.lang.String getPresetResponseId() {
        return this.presetResponseId;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.call_assistant.core.data.SendResponseActionRequestDto copy(int action, @org.jetbrains.annotations.NotNull java.lang.String callId, @org.jetbrains.annotations.Nullable java.lang.String customText, @org.jetbrains.annotations.Nullable java.lang.String presetResponseId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callId, "callId");
        return new com.truecaller.call_assistant.core.data.SendResponseActionRequestDto(action, callId, customText, presetResponseId);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.call_assistant.core.data.SendResponseActionRequestDto)) {
            return false;
        }
        com.truecaller.call_assistant.core.data.SendResponseActionRequestDto sendResponseActionRequestDto = (com.truecaller.call_assistant.core.data.SendResponseActionRequestDto) other;
        return this.action == sendResponseActionRequestDto.action && kotlin.jvm.internal.Intrinsics.b(this.callId, sendResponseActionRequestDto.callId) && kotlin.jvm.internal.Intrinsics.b(this.customText, sendResponseActionRequestDto.customText) && kotlin.jvm.internal.Intrinsics.b(this.presetResponseId, sendResponseActionRequestDto.presetResponseId);
    }

    public final int getAction() {
        return this.action;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getCallId() {
        return this.callId;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getCustomText() {
        return this.customText;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getPresetResponseId() {
        return this.presetResponseId;
    }

    public int hashCode() {
        int hashCode;
        int e = ax1.bar.e(this.action * 31, 31, this.callId);
        java.lang.String str = this.customText;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (e + hashCode) * 31;
        java.lang.String str2 = this.presetResponseId;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return i2 + i;
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        int i = this.action;
        java.lang.String str = this.callId;
        return bar.x(qb.qux.r("SendResponseActionRequestDto(action=", i, ", callId=", str, ", customText="), this.customText, ", presetResponseId=", this.presetResponseId, ")");
    }

    public /* synthetic */ SendResponseActionRequestDto(int i, java.lang.String str, java.lang.String str2, java.lang.String str3, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? null : str3);
    }
}
