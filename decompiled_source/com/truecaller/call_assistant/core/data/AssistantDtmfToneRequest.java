package com.truecaller.call_assistant.core.data;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\f\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/truecaller/call_assistant/core/data/AssistantDtmfToneRequest;", "", "callId", "", "tone", "", "<init>", "(Ljava/lang/String;C)V", "getCallId", "()Ljava/lang/String;", "getTone", "()C", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "core_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class AssistantDtmfToneRequest {
    public static final int $stable = 0;

    @bw.qux("callId")
    @org.jetbrains.annotations.NotNull
    private final java.lang.String callId;

    @bw.qux("digit")
    private final char tone;

    public AssistantDtmfToneRequest(@org.jetbrains.annotations.NotNull java.lang.String str, char c) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "callId");
        this.callId = str;
        this.tone = c;
    }

    public static /* synthetic */ com.truecaller.call_assistant.core.data.AssistantDtmfToneRequest copy$default(com.truecaller.call_assistant.core.data.AssistantDtmfToneRequest assistantDtmfToneRequest, java.lang.String str, char c, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = assistantDtmfToneRequest.callId;
        }
        if ((i & 2) != 0) {
            c = assistantDtmfToneRequest.tone;
        }
        return assistantDtmfToneRequest.copy(str, c);
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component1, reason: from getter */
    public final java.lang.String getCallId() {
        return this.callId;
    }

    /* renamed from: component2, reason: from getter */
    public final char getTone() {
        return this.tone;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.call_assistant.core.data.AssistantDtmfToneRequest copy(@org.jetbrains.annotations.NotNull java.lang.String callId, char tone) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callId, "callId");
        return new com.truecaller.call_assistant.core.data.AssistantDtmfToneRequest(callId, tone);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.call_assistant.core.data.AssistantDtmfToneRequest)) {
            return false;
        }
        com.truecaller.call_assistant.core.data.AssistantDtmfToneRequest assistantDtmfToneRequest = (com.truecaller.call_assistant.core.data.AssistantDtmfToneRequest) other;
        return kotlin.jvm.internal.Intrinsics.b(this.callId, assistantDtmfToneRequest.callId) && this.tone == assistantDtmfToneRequest.tone;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getCallId() {
        return this.callId;
    }

    public final char getTone() {
        return this.tone;
    }

    public int hashCode() {
        return (this.callId.hashCode() * 31) + this.tone;
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return "AssistantDtmfToneRequest(callId=" + this.callId + ", tone=" + this.tone + ")";
    }
}
