package com.truecaller.cloudtelephony.callrecording.data;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\f\u0010\u000bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"com/truecaller/cloudtelephony/callrecording/data/CloudTelephonySignUpDtos$SignupResponseDto", "", "", "recordingNumber", "token", "", "tokenExp", "<init>", "(Ljava/lang/String;Ljava/lang/String;J)V", "Ljava/lang/String;", "getRecordingNumber", "()Ljava/lang/String;", "getToken", "J", "getTokenExp", "()J", "callrecording_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class CloudTelephonySignUpDtos$SignupResponseDto {
    public static final int $stable = 0;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String recordingNumber;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String token;
    private final long tokenExp;

    public CloudTelephonySignUpDtos$SignupResponseDto(@org.jetbrains.annotations.NotNull java.lang.String str, @org.jetbrains.annotations.NotNull java.lang.String str2, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "recordingNumber");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "token");
        this.recordingNumber = str;
        this.token = str2;
        this.tokenExp = j;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getRecordingNumber() {
        return this.recordingNumber;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getToken() {
        return this.token;
    }

    public final long getTokenExp() {
        return this.tokenExp;
    }
}
