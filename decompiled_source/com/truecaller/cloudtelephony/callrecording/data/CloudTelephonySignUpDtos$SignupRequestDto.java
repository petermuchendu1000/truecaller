package com.truecaller.cloudtelephony.callrecording.data;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\f\u001a\u0004\b\u0015\u0010\u000eR\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\t\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014¨\u0006\u0017"}, d2 = {"com/truecaller/cloudtelephony/callrecording/data/CloudTelephonySignUpDtos$SignupRequestDto", "", "", "tcToken", "", "timezone", "", com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.TYPE_COLUMN, "number", "platform", "<init>", "(Ljava/lang/String;JILjava/lang/String;I)V", "Ljava/lang/String;", "getTcToken", "()Ljava/lang/String;", "J", "getTimezone", "()J", "I", "getType", "()I", "getNumber", "getPlatform", "callrecording_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class CloudTelephonySignUpDtos$SignupRequestDto {
    public static final int $stable = 0;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String number;
    private final int platform;

    @bw.qux("TCToken")
    @org.jetbrains.annotations.NotNull
    private final java.lang.String tcToken;
    private final long timezone;
    private final int type;

    public CloudTelephonySignUpDtos$SignupRequestDto(@org.jetbrains.annotations.NotNull java.lang.String str, long j, int i, @org.jetbrains.annotations.NotNull java.lang.String str2, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "tcToken");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "number");
        this.tcToken = str;
        this.timezone = j;
        this.type = i;
        this.number = str2;
        this.platform = i2;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getNumber() {
        return this.number;
    }

    public final int getPlatform() {
        return this.platform;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getTcToken() {
        return this.tcToken;
    }

    public final long getTimezone() {
        return this.timezone;
    }

    public final int getType() {
        return this.type;
    }
}
