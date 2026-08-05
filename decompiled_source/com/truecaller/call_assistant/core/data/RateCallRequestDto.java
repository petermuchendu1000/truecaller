package com.truecaller.call_assistant.core.data;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/truecaller/call_assistant/core/data/RateCallRequestDto;", "", "callId", "", "rating", "", com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.TYPE_COLUMN, "<init>", "(Ljava/lang/String;II)V", "getCallId", "()Ljava/lang/String;", "getRating", "()I", "getType", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "core_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class RateCallRequestDto {
    public static final int $stable = 0;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String callId;
    private final int rating;
    private final int type;

    public RateCallRequestDto(@org.jetbrains.annotations.NotNull java.lang.String str, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "callId");
        this.callId = str;
        this.rating = i;
        this.type = i2;
    }

    public static /* synthetic */ com.truecaller.call_assistant.core.data.RateCallRequestDto copy$default(com.truecaller.call_assistant.core.data.RateCallRequestDto rateCallRequestDto, java.lang.String str, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            str = rateCallRequestDto.callId;
        }
        if ((i3 & 2) != 0) {
            i = rateCallRequestDto.rating;
        }
        if ((i3 & 4) != 0) {
            i2 = rateCallRequestDto.type;
        }
        return rateCallRequestDto.copy(str, i, i2);
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component1, reason: from getter */
    public final java.lang.String getCallId() {
        return this.callId;
    }

    /* renamed from: component2, reason: from getter */
    public final int getRating() {
        return this.rating;
    }

    /* renamed from: component3, reason: from getter */
    public final int getType() {
        return this.type;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.call_assistant.core.data.RateCallRequestDto copy(@org.jetbrains.annotations.NotNull java.lang.String callId, int rating, int type) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callId, "callId");
        return new com.truecaller.call_assistant.core.data.RateCallRequestDto(callId, rating, type);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.call_assistant.core.data.RateCallRequestDto)) {
            return false;
        }
        com.truecaller.call_assistant.core.data.RateCallRequestDto rateCallRequestDto = (com.truecaller.call_assistant.core.data.RateCallRequestDto) other;
        return kotlin.jvm.internal.Intrinsics.b(this.callId, rateCallRequestDto.callId) && this.rating == rateCallRequestDto.rating && this.type == rateCallRequestDto.type;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getCallId() {
        return this.callId;
    }

    public final int getRating() {
        return this.rating;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        return (((this.callId.hashCode() * 31) + this.rating) * 31) + this.type;
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        java.lang.String str = this.callId;
        return bar.m(this.type, ")", bar.z("RateCallRequestDto(callId=", this.rating, str, ", rating=", ", type="));
    }
}
