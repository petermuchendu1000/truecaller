package com.truecaller.account.network;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\b\u0007\u0018\u0000 52\u00020\u0001:\u00016B¥\u0001\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b#\u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b$\u0010\u001fR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u001d\u001a\u0004\b%\u0010\u001fR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001d\u001a\u0004\b&\u0010\u001fR\u0019\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\f\u0010 \u001a\u0004\b'\u0010\"R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\r\u0010 \u001a\u0004\b(\u0010\"R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001d\u001a\u0004\b)\u0010\u001fR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001d\u001a\u0004\b*\u0010\u001fR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0010\u0010 \u001a\u0004\b+\u0010\"R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010,\u001a\u0004\b-\u0010.R\u001f\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0015\u0010/\u001a\u0004\b0\u00101R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u00102\u001a\u0004\b3\u00104¨\u00067"}, d2 = {"Lcom/truecaller/account/network/TokenResponseDto;", "", "", "status", "", com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.MESSAGE_COLUMN, "", "parsedPhoneNumber", "parsedCountryCode", "domain", "requestId", "method", "tokenTtl", "ttl", "pattern", "installationId", "userId", "", "suspended", "", "Lcom/truecaller/account/network/VerificationPhoneNumber;", "phones", "Lcom/truecaller/account/network/AccessTokenDetails;", "accessTokenDetails", "<init>", "(ILjava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/util/List;Lcom/truecaller/account/network/AccessTokenDetails;)V", "I", "getStatus", "()I", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "Ljava/lang/Long;", "getParsedPhoneNumber", "()Ljava/lang/Long;", "getParsedCountryCode", "getDomain", "getRequestId", "getMethod", "getTokenTtl", "getTtl", "getPattern", "getInstallationId", "getUserId", "Ljava/lang/Boolean;", "getSuspended", "()Ljava/lang/Boolean;", "Ljava/util/List;", "getPhones", "()Ljava/util/List;", "Lcom/truecaller/account/network/AccessTokenDetails;", "getAccessTokenDetails", "()Lcom/truecaller/account/network/AccessTokenDetails;", "Companion", "com/truecaller/account/network/q", "account-network_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class TokenResponseDto {

    @org.jetbrains.annotations.NotNull
    public static final com.truecaller.account.network.q Companion = new java.lang.Object();

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String METHOD_CALL = "call";

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String METHOD_REVERSE_OTP = "reverse_otp";

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String METHOD_REVERSE_WHATSAPP = "reverse_whatsapp";

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String METHOD_SMS = "sms";

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String METHOD_WHATSAPP = "whatsapp";
    public static final int STATUS_ALREADY_VERIFIED = 3;
    public static final int STATUS_ALREADY_VERIFIED_SAME_PHONE_NUMBER = 700;
    public static final int STATUS_ATTESTATION_REQUIRED = 20001;
    public static final int STATUS_PHONE_NUMBER_BLOCKED = 21;
    public static final int STATUS_PHONE_NUMBER_BLOCKED_REUSE = 6;
    public static final int STATUS_PHONE_NUMBER_LIMIT_REACHED = 5;
    public static final int STATUS_REQUEST_ID_LIMIT_REACHED = 4;
    public static final int STATUS_SUCCESS_NOT_STORED = 12;
    public static final int STATUS_TOKEN_INVALID = 11;
    public static final int STATUS_TOKEN_PENDING = 9;
    public static final int STATUS_TOKEN_RETRY_LIMIT_REACHED = 7;
    public static final int STATUS_TOKEN_SENT = 1;
    public static final int STATUS_TOKEN_TIMED_OUT = 8;
    public static final int STATUS_VERIFICATION_FAILED = 20003;
    public static final int STATUS_VERIFICATION_FAILED_THROTTLED = 20002;
    public static final int STATUS_VERIFIED = 2;

    @org.jetbrains.annotations.Nullable
    private final com.truecaller.account.network.AccessTokenDetails accessTokenDetails;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String domain;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String installationId;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String message;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String method;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String parsedCountryCode;

    @org.jetbrains.annotations.Nullable
    private final java.lang.Long parsedPhoneNumber;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String pattern;

    @org.jetbrains.annotations.Nullable
    private final java.util.List<com.truecaller.account.network.VerificationPhoneNumber> phones;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String requestId;
    private final int status;

    @org.jetbrains.annotations.Nullable
    private final java.lang.Boolean suspended;

    @org.jetbrains.annotations.Nullable
    private final java.lang.Long tokenTtl;

    @org.jetbrains.annotations.Nullable
    private final java.lang.Long ttl;

    @org.jetbrains.annotations.Nullable
    private final java.lang.Long userId;

    public TokenResponseDto(int i, @org.jetbrains.annotations.Nullable java.lang.String str, @org.jetbrains.annotations.Nullable java.lang.Long l, @org.jetbrains.annotations.Nullable java.lang.String str2, @org.jetbrains.annotations.Nullable java.lang.String str3, @org.jetbrains.annotations.Nullable java.lang.String str4, @org.jetbrains.annotations.Nullable java.lang.String str5, @org.jetbrains.annotations.Nullable java.lang.Long l2, @org.jetbrains.annotations.Nullable java.lang.Long l3, @org.jetbrains.annotations.Nullable java.lang.String str6, @org.jetbrains.annotations.Nullable java.lang.String str7, @org.jetbrains.annotations.Nullable java.lang.Long l4, @org.jetbrains.annotations.Nullable java.lang.Boolean bool, @org.jetbrains.annotations.Nullable java.util.List<com.truecaller.account.network.VerificationPhoneNumber> list, @org.jetbrains.annotations.Nullable com.truecaller.account.network.AccessTokenDetails accessTokenDetails) {
        this.status = i;
        this.message = str;
        this.parsedPhoneNumber = l;
        this.parsedCountryCode = str2;
        this.domain = str3;
        this.requestId = str4;
        this.method = str5;
        this.tokenTtl = l2;
        this.ttl = l3;
        this.pattern = str6;
        this.installationId = str7;
        this.userId = l4;
        this.suspended = bool;
        this.phones = list;
        this.accessTokenDetails = accessTokenDetails;
    }

    @org.jetbrains.annotations.Nullable
    public final com.truecaller.account.network.AccessTokenDetails getAccessTokenDetails() {
        return this.accessTokenDetails;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getDomain() {
        return this.domain;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getInstallationId() {
        return this.installationId;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getMessage() {
        return this.message;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getMethod() {
        return this.method;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getParsedCountryCode() {
        return this.parsedCountryCode;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Long getParsedPhoneNumber() {
        return this.parsedPhoneNumber;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getPattern() {
        return this.pattern;
    }

    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.truecaller.account.network.VerificationPhoneNumber> getPhones() {
        return this.phones;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getRequestId() {
        return this.requestId;
    }

    public final int getStatus() {
        return this.status;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean getSuspended() {
        return this.suspended;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Long getTokenTtl() {
        return this.tokenTtl;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Long getTtl() {
        return this.ttl;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Long getUserId() {
        return this.userId;
    }
}
