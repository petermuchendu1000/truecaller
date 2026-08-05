package com.truecaller.account.network;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0011\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0016B3\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010\u000e\u001a\u0004\b\u0014\u0010\u0010¨\u0006\u0017"}, d2 = {"Lcom/truecaller/account/network/TokenErrorResponseDto;", "", "", "status", "", com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.MESSAGE_COLUMN, "", "nextCallDuration", "domain", "<init>", "(ILjava/lang/String;Ljava/lang/Long;Ljava/lang/String;)V", "I", "getStatus", "()I", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "Ljava/lang/Long;", "getNextCallDuration", "()Ljava/lang/Long;", "getDomain", "Companion", "com/truecaller/account/network/o", "account-network_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class TokenErrorResponseDto {

    @org.jetbrains.annotations.NotNull
    public static final com.truecaller.account.network.o Companion = new java.lang.Object();
    public static final int STATUS_APPLICATION_NOT_SUPPORTED = 40002;
    public static final int STATUS_CLIENT_SECRET_WRONG = 40004;
    public static final int STATUS_INCORRECT_PRIVACY_SELECTION = 40012;
    public static final int STATUS_INTERNAL_SERVER_ERROR = 50002;
    public static final int STATUS_INVALID_BODY_FORMAT = 40001;
    public static final int STATUS_INVALID_PHONE_NUMBER = 40003;
    public static final int STATUS_MOBILE_SERVICES_MISSING = 40302;
    public static final int STATUS_NUMBER_ALREADY_REGISTERED = 40011;
    public static final int STATUS_NUMBER_BLOCKED = 40106;
    public static final int STATUS_NUMBER_MISMATCH = 24;
    public static final int STATUS_REVERSE_OTP_WAITING_TIMEOUT = 408;
    public static final int STATUS_SERVICE_UNAVAILABLE = 40306;
    public static final int STATUS_VERIFICATION_UNAVAILABLE_LEGAL = 45101;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String domain;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String message;

    @org.jetbrains.annotations.Nullable
    private final java.lang.Long nextCallDuration;
    private final int status;

    public TokenErrorResponseDto(int i, @org.jetbrains.annotations.Nullable java.lang.String str, @org.jetbrains.annotations.Nullable java.lang.Long l, @org.jetbrains.annotations.Nullable java.lang.String str2) {
        this.status = i;
        this.message = str;
        this.nextCallDuration = l;
        this.domain = str2;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getDomain() {
        return this.domain;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getMessage() {
        return this.message;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Long getNextCallDuration() {
        return this.nextCallDuration;
    }

    public final int getStatus() {
        return this.status;
    }

    public /* synthetic */ TokenErrorResponseDto(int i, java.lang.String str, java.lang.Long l, java.lang.String str2, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, (i2 & 4) != 0 ? null : l, (i2 & 8) != 0 ? null : str2);
    }
}
