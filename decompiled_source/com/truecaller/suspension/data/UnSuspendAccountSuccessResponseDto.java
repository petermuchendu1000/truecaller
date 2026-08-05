package com.truecaller.suspension.data;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0013\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0001\u0018B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/truecaller/suspension/data/UnSuspendAccountSuccessResponseDto;", "Lxv2/a;", "", "success", "", "reason", "", "ttl", "redirect", "<init>", "(ZLjava/lang/String;Ljava/lang/Long;Ljava/lang/Boolean;)V", "Z", "getSuccess", "()Z", "Ljava/lang/String;", "getReason", "()Ljava/lang/String;", "Ljava/lang/Long;", "getTtl", "()Ljava/lang/Long;", "Ljava/lang/Boolean;", "getRedirect", "()Ljava/lang/Boolean;", "Companion", "xv2/qux", "account-suspension_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class UnSuspendAccountSuccessResponseDto extends xv2.a {

    @org.jetbrains.annotations.NotNull
    public static final xv2.qux Companion = new java.lang.Object();

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String REASON_ERROR = "error";

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String REASON_INVALID = "invalid";

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String REASON_THROTTLED = "throttled";

    @org.jetbrains.annotations.Nullable
    private final java.lang.String reason;

    @org.jetbrains.annotations.Nullable
    private final java.lang.Boolean redirect;
    private final boolean success;

    @org.jetbrains.annotations.Nullable
    private final java.lang.Long ttl;

    public UnSuspendAccountSuccessResponseDto(boolean z, @org.jetbrains.annotations.Nullable java.lang.String str, @org.jetbrains.annotations.Nullable java.lang.Long l, @org.jetbrains.annotations.Nullable java.lang.Boolean bool) {
        this.success = z;
        this.reason = str;
        this.ttl = l;
        this.redirect = bool;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getReason() {
        return this.reason;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean getRedirect() {
        return this.redirect;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Long getTtl() {
        return this.ttl;
    }

    public /* synthetic */ UnSuspendAccountSuccessResponseDto(boolean z, java.lang.String str, java.lang.Long l, java.lang.Boolean bool, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(z, str, l, (i & 8) != 0 ? java.lang.Boolean.FALSE : bool);
    }
}
