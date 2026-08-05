package com.truecaller.call_assistant.core.playground.data.network;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u001a\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0014J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0017JJ\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u0010\u001fJ\u0013\u0010 \u001a\u00020\u00032\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020\bHÖ\u0001J\t\u0010#\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017¨\u0006$"}, d2 = {"Lcom/truecaller/call_assistant/core/playground/data/network/AssistantPlaygroundInitiateResponse;", "", "success", "", "agoraToken", "", "agoraChannel", "maxRetries", "", "delaySeconds", "", "<init>", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Long;)V", "getSuccess", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getAgoraToken", "()Ljava/lang/String;", "getAgoraChannel", "getMaxRetries", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getDelaySeconds", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Long;)Lcom/truecaller/call_assistant/core/playground/data/network/AssistantPlaygroundInitiateResponse;", "equals", "other", "hashCode", "toString", "core_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class AssistantPlaygroundInitiateResponse {
    public static final int $stable = 0;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String agoraChannel;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String agoraToken;

    @bw.qux("delayInSec")
    @org.jetbrains.annotations.Nullable
    private final java.lang.Long delaySeconds;

    @org.jetbrains.annotations.Nullable
    private final java.lang.Integer maxRetries;

    @org.jetbrains.annotations.Nullable
    private final java.lang.Boolean success;

    public AssistantPlaygroundInitiateResponse(@org.jetbrains.annotations.Nullable java.lang.Boolean bool, @org.jetbrains.annotations.Nullable java.lang.String str, @org.jetbrains.annotations.Nullable java.lang.String str2, @org.jetbrains.annotations.Nullable java.lang.Integer num, @org.jetbrains.annotations.Nullable java.lang.Long l) {
        this.success = bool;
        this.agoraToken = str;
        this.agoraChannel = str2;
        this.maxRetries = num;
        this.delaySeconds = l;
    }

    public static /* synthetic */ com.truecaller.call_assistant.core.playground.data.network.AssistantPlaygroundInitiateResponse copy$default(com.truecaller.call_assistant.core.playground.data.network.AssistantPlaygroundInitiateResponse assistantPlaygroundInitiateResponse, java.lang.Boolean bool, java.lang.String str, java.lang.String str2, java.lang.Integer num, java.lang.Long l, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            bool = assistantPlaygroundInitiateResponse.success;
        }
        if ((i & 2) != 0) {
            str = assistantPlaygroundInitiateResponse.agoraToken;
        }
        if ((i & 4) != 0) {
            str2 = assistantPlaygroundInitiateResponse.agoraChannel;
        }
        if ((i & 8) != 0) {
            num = assistantPlaygroundInitiateResponse.maxRetries;
        }
        if ((i & 16) != 0) {
            l = assistantPlaygroundInitiateResponse.delaySeconds;
        }
        java.lang.Long l2 = l;
        java.lang.String str3 = str2;
        return assistantPlaygroundInitiateResponse.copy(bool, str, str3, num, l2);
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component1, reason: from getter */
    public final java.lang.Boolean getSuccess() {
        return this.success;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component2, reason: from getter */
    public final java.lang.String getAgoraToken() {
        return this.agoraToken;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component3, reason: from getter */
    public final java.lang.String getAgoraChannel() {
        return this.agoraChannel;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component4, reason: from getter */
    public final java.lang.Integer getMaxRetries() {
        return this.maxRetries;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component5, reason: from getter */
    public final java.lang.Long getDelaySeconds() {
        return this.delaySeconds;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.call_assistant.core.playground.data.network.AssistantPlaygroundInitiateResponse copy(@org.jetbrains.annotations.Nullable java.lang.Boolean success, @org.jetbrains.annotations.Nullable java.lang.String agoraToken, @org.jetbrains.annotations.Nullable java.lang.String agoraChannel, @org.jetbrains.annotations.Nullable java.lang.Integer maxRetries, @org.jetbrains.annotations.Nullable java.lang.Long delaySeconds) {
        return new com.truecaller.call_assistant.core.playground.data.network.AssistantPlaygroundInitiateResponse(success, agoraToken, agoraChannel, maxRetries, delaySeconds);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.call_assistant.core.playground.data.network.AssistantPlaygroundInitiateResponse)) {
            return false;
        }
        com.truecaller.call_assistant.core.playground.data.network.AssistantPlaygroundInitiateResponse assistantPlaygroundInitiateResponse = (com.truecaller.call_assistant.core.playground.data.network.AssistantPlaygroundInitiateResponse) other;
        return kotlin.jvm.internal.Intrinsics.b(this.success, assistantPlaygroundInitiateResponse.success) && kotlin.jvm.internal.Intrinsics.b(this.agoraToken, assistantPlaygroundInitiateResponse.agoraToken) && kotlin.jvm.internal.Intrinsics.b(this.agoraChannel, assistantPlaygroundInitiateResponse.agoraChannel) && kotlin.jvm.internal.Intrinsics.b(this.maxRetries, assistantPlaygroundInitiateResponse.maxRetries) && kotlin.jvm.internal.Intrinsics.b(this.delaySeconds, assistantPlaygroundInitiateResponse.delaySeconds);
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getAgoraChannel() {
        return this.agoraChannel;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getAgoraToken() {
        return this.agoraToken;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Long getDelaySeconds() {
        return this.delaySeconds;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getMaxRetries() {
        return this.maxRetries;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean getSuccess() {
        return this.success;
    }

    public int hashCode() {
        java.lang.Boolean bool = this.success;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        java.lang.String str = this.agoraToken;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.agoraChannel;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.Integer num = this.maxRetries;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        java.lang.Long l = this.delaySeconds;
        return hashCode4 + (l != null ? l.hashCode() : 0);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        java.lang.Boolean bool = this.success;
        java.lang.String str = this.agoraToken;
        java.lang.String str2 = this.agoraChannel;
        java.lang.Integer num = this.maxRetries;
        java.lang.Long l = this.delaySeconds;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AssistantPlaygroundInitiateResponse(success=");
        sb.append(bool);
        sb.append(", agoraToken=");
        sb.append(str);
        sb.append(", agoraChannel=");
        wi0.bar.x(num, str2, ", maxRetries=", ", delaySeconds=", sb);
        return bar.w(sb, l, ")");
    }
}
