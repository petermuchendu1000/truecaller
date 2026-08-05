package com.truecaller.call_assistant.core.playground.data.network;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0011\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0016\u001a\u00020\tHÆ\u0003J9\u0010\u0017\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, d2 = {"Lcom/truecaller/call_assistant/core/playground/data/network/AssistantPlaygroundInfoResponse;", "", "useCases", "", "Lcom/truecaller/call_assistant/core/playground/data/network/AssistantPlaygroundSuggestionsResponse;", "remainingDailyAttempts", "", "remainingTotalAttempts", "callDurationMillis", "", "<init>", "(Ljava/util/List;IIJ)V", "getUseCases", "()Ljava/util/List;", "getRemainingDailyAttempts", "()I", "getRemainingTotalAttempts", "getCallDurationMillis", "()J", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "core_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class AssistantPlaygroundInfoResponse {
    public static final int $stable = 8;

    @bw.qux("callDuration")
    private final long callDurationMillis;
    private final int remainingDailyAttempts;
    private final int remainingTotalAttempts;

    @org.jetbrains.annotations.Nullable
    private final java.util.List<com.truecaller.call_assistant.core.playground.data.network.AssistantPlaygroundSuggestionsResponse> useCases;

    public AssistantPlaygroundInfoResponse(@org.jetbrains.annotations.Nullable java.util.List<com.truecaller.call_assistant.core.playground.data.network.AssistantPlaygroundSuggestionsResponse> list, int i, int i2, long j) {
        this.useCases = list;
        this.remainingDailyAttempts = i;
        this.remainingTotalAttempts = i2;
        this.callDurationMillis = j;
    }

    public static /* synthetic */ com.truecaller.call_assistant.core.playground.data.network.AssistantPlaygroundInfoResponse copy$default(com.truecaller.call_assistant.core.playground.data.network.AssistantPlaygroundInfoResponse assistantPlaygroundInfoResponse, java.util.List list, int i, int i2, long j, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            list = assistantPlaygroundInfoResponse.useCases;
        }
        if ((i3 & 2) != 0) {
            i = assistantPlaygroundInfoResponse.remainingDailyAttempts;
        }
        if ((i3 & 4) != 0) {
            i2 = assistantPlaygroundInfoResponse.remainingTotalAttempts;
        }
        if ((i3 & 8) != 0) {
            j = assistantPlaygroundInfoResponse.callDurationMillis;
        }
        int i4 = i2;
        return assistantPlaygroundInfoResponse.copy(list, i, i4, j);
    }

    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.truecaller.call_assistant.core.playground.data.network.AssistantPlaygroundSuggestionsResponse> component1() {
        return this.useCases;
    }

    /* renamed from: component2, reason: from getter */
    public final int getRemainingDailyAttempts() {
        return this.remainingDailyAttempts;
    }

    /* renamed from: component3, reason: from getter */
    public final int getRemainingTotalAttempts() {
        return this.remainingTotalAttempts;
    }

    /* renamed from: component4, reason: from getter */
    public final long getCallDurationMillis() {
        return this.callDurationMillis;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.call_assistant.core.playground.data.network.AssistantPlaygroundInfoResponse copy(@org.jetbrains.annotations.Nullable java.util.List<com.truecaller.call_assistant.core.playground.data.network.AssistantPlaygroundSuggestionsResponse> useCases, int remainingDailyAttempts, int remainingTotalAttempts, long callDurationMillis) {
        return new com.truecaller.call_assistant.core.playground.data.network.AssistantPlaygroundInfoResponse(useCases, remainingDailyAttempts, remainingTotalAttempts, callDurationMillis);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.call_assistant.core.playground.data.network.AssistantPlaygroundInfoResponse)) {
            return false;
        }
        com.truecaller.call_assistant.core.playground.data.network.AssistantPlaygroundInfoResponse assistantPlaygroundInfoResponse = (com.truecaller.call_assistant.core.playground.data.network.AssistantPlaygroundInfoResponse) other;
        return kotlin.jvm.internal.Intrinsics.b(this.useCases, assistantPlaygroundInfoResponse.useCases) && this.remainingDailyAttempts == assistantPlaygroundInfoResponse.remainingDailyAttempts && this.remainingTotalAttempts == assistantPlaygroundInfoResponse.remainingTotalAttempts && this.callDurationMillis == assistantPlaygroundInfoResponse.callDurationMillis;
    }

    public final long getCallDurationMillis() {
        return this.callDurationMillis;
    }

    public final int getRemainingDailyAttempts() {
        return this.remainingDailyAttempts;
    }

    public final int getRemainingTotalAttempts() {
        return this.remainingTotalAttempts;
    }

    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.truecaller.call_assistant.core.playground.data.network.AssistantPlaygroundSuggestionsResponse> getUseCases() {
        return this.useCases;
    }

    public int hashCode() {
        java.util.List<com.truecaller.call_assistant.core.playground.data.network.AssistantPlaygroundSuggestionsResponse> list = this.useCases;
        int hashCode = (((((list == null ? 0 : list.hashCode()) * 31) + this.remainingDailyAttempts) * 31) + this.remainingTotalAttempts) * 31;
        long j = this.callDurationMillis;
        return hashCode + ((int) (j ^ (j >>> 32)));
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return "AssistantPlaygroundInfoResponse(useCases=" + this.useCases + ", remainingDailyAttempts=" + this.remainingDailyAttempts + ", remainingTotalAttempts=" + this.remainingTotalAttempts + ", callDurationMillis=" + this.callDurationMillis + ")";
    }
}
