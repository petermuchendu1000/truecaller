package com.truecaller.account.network;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u000e\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0001\u0013B-\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\r\u0010\fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\n\u001a\u0004\b\u000e\u0010\fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/truecaller/account/network/ExchangeCredentialsResponseDto;", "", "", "installationId", "state", "domain", "", "ttl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V", "Ljava/lang/String;", "getInstallationId", "()Ljava/lang/String;", "getState", "getDomain", "J", "getTtl", "()J", "Companion", "com/truecaller/account/network/j", "account-network_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class ExchangeCredentialsResponseDto {

    @org.jetbrains.annotations.NotNull
    public static final com.truecaller.account.network.j Companion = new java.lang.Object();

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String STATE_ACCEPTED = "accepted";

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String STATE_EXCHANGED = "exchanged";

    @org.jetbrains.annotations.Nullable
    private final java.lang.String domain;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String installationId;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String state;
    private final long ttl;

    public ExchangeCredentialsResponseDto(@org.jetbrains.annotations.Nullable java.lang.String str, @org.jetbrains.annotations.NotNull java.lang.String str2, @org.jetbrains.annotations.Nullable java.lang.String str3, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "state");
        this.installationId = str;
        this.state = str2;
        this.domain = str3;
        this.ttl = j;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getDomain() {
        return this.domain;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getInstallationId() {
        return this.installationId;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getState() {
        return this.state;
    }

    public final long getTtl() {
        return this.ttl;
    }
}
