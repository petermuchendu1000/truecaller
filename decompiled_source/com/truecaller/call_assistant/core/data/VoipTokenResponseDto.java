package com.truecaller.call_assistant.core.data;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, d2 = {"Lcom/truecaller/call_assistant/core/data/VoipTokenResponseDto;", "", "success", "", "rtc", "", "expiry", "", "<init>", "(ZLjava/lang/String;J)V", "getSuccess", "()Z", "getRtc", "()Ljava/lang/String;", "getExpiry", "()J", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "core_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class VoipTokenResponseDto {
    public static final int $stable = 0;
    private final long expiry;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String rtc;
    private final boolean success;

    public VoipTokenResponseDto(boolean z, @org.jetbrains.annotations.NotNull java.lang.String str, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "rtc");
        this.success = z;
        this.rtc = str;
        this.expiry = j;
    }

    public static /* synthetic */ com.truecaller.call_assistant.core.data.VoipTokenResponseDto copy$default(com.truecaller.call_assistant.core.data.VoipTokenResponseDto voipTokenResponseDto, boolean z, java.lang.String str, long j, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = voipTokenResponseDto.success;
        }
        if ((i & 2) != 0) {
            str = voipTokenResponseDto.rtc;
        }
        if ((i & 4) != 0) {
            j = voipTokenResponseDto.expiry;
        }
        return voipTokenResponseDto.copy(z, str, j);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getSuccess() {
        return this.success;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component2, reason: from getter */
    public final java.lang.String getRtc() {
        return this.rtc;
    }

    /* renamed from: component3, reason: from getter */
    public final long getExpiry() {
        return this.expiry;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.call_assistant.core.data.VoipTokenResponseDto copy(boolean success, @org.jetbrains.annotations.NotNull java.lang.String rtc, long expiry) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rtc, "rtc");
        return new com.truecaller.call_assistant.core.data.VoipTokenResponseDto(success, rtc, expiry);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.call_assistant.core.data.VoipTokenResponseDto)) {
            return false;
        }
        com.truecaller.call_assistant.core.data.VoipTokenResponseDto voipTokenResponseDto = (com.truecaller.call_assistant.core.data.VoipTokenResponseDto) other;
        return this.success == voipTokenResponseDto.success && kotlin.jvm.internal.Intrinsics.b(this.rtc, voipTokenResponseDto.rtc) && this.expiry == voipTokenResponseDto.expiry;
    }

    public final long getExpiry() {
        return this.expiry;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getRtc() {
        return this.rtc;
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
        int e = ax1.bar.e(i * 31, 31, this.rtc);
        long j = this.expiry;
        return e + ((int) (j ^ (j >>> 32)));
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        boolean z = this.success;
        return bar.n(this.expiry, ")", bx.e1.u("VoipTokenResponseDto(success=", ", rtc=", this.rtc, ", expiry=", z));
    }
}
