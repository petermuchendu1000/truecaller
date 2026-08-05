package com.truecaller.call_assistant.core.playground.data.network;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, d2 = {"Lcom/truecaller/call_assistant/core/playground/data/network/AssistantPlaygroundInitiateRequest;", "", "languageCode", "", "name", "retryCount", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;I)V", "getLanguageCode", "()Ljava/lang/String;", "getName", "getRetryCount", "()I", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "core_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class AssistantPlaygroundInitiateRequest {
    public static final int $stable = 0;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String languageCode;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String name;
    private final int retryCount;

    public AssistantPlaygroundInitiateRequest(@org.jetbrains.annotations.NotNull java.lang.String str, @org.jetbrains.annotations.Nullable java.lang.String str2, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "languageCode");
        this.languageCode = str;
        this.name = str2;
        this.retryCount = i;
    }

    public static /* synthetic */ com.truecaller.call_assistant.core.playground.data.network.AssistantPlaygroundInitiateRequest copy$default(com.truecaller.call_assistant.core.playground.data.network.AssistantPlaygroundInitiateRequest assistantPlaygroundInitiateRequest, java.lang.String str, java.lang.String str2, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            str = assistantPlaygroundInitiateRequest.languageCode;
        }
        if ((i2 & 2) != 0) {
            str2 = assistantPlaygroundInitiateRequest.name;
        }
        if ((i2 & 4) != 0) {
            i = assistantPlaygroundInitiateRequest.retryCount;
        }
        return assistantPlaygroundInitiateRequest.copy(str, str2, i);
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component1, reason: from getter */
    public final java.lang.String getLanguageCode() {
        return this.languageCode;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component2, reason: from getter */
    public final java.lang.String getName() {
        return this.name;
    }

    /* renamed from: component3, reason: from getter */
    public final int getRetryCount() {
        return this.retryCount;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.call_assistant.core.playground.data.network.AssistantPlaygroundInitiateRequest copy(@org.jetbrains.annotations.NotNull java.lang.String languageCode, @org.jetbrains.annotations.Nullable java.lang.String name, int retryCount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(languageCode, "languageCode");
        return new com.truecaller.call_assistant.core.playground.data.network.AssistantPlaygroundInitiateRequest(languageCode, name, retryCount);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.call_assistant.core.playground.data.network.AssistantPlaygroundInitiateRequest)) {
            return false;
        }
        com.truecaller.call_assistant.core.playground.data.network.AssistantPlaygroundInitiateRequest assistantPlaygroundInitiateRequest = (com.truecaller.call_assistant.core.playground.data.network.AssistantPlaygroundInitiateRequest) other;
        return kotlin.jvm.internal.Intrinsics.b(this.languageCode, assistantPlaygroundInitiateRequest.languageCode) && kotlin.jvm.internal.Intrinsics.b(this.name, assistantPlaygroundInitiateRequest.name) && this.retryCount == assistantPlaygroundInitiateRequest.retryCount;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getLanguageCode() {
        return this.languageCode;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getName() {
        return this.name;
    }

    public final int getRetryCount() {
        return this.retryCount;
    }

    public int hashCode() {
        int hashCode = this.languageCode.hashCode() * 31;
        java.lang.String str = this.name;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.retryCount;
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return bar.m(this.retryCount, ")", ro0.f.E("AssistantPlaygroundInitiateRequest(languageCode=", this.languageCode, ", name=", this.name, ", retryCount="));
    }
}
