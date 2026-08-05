package com.truecaller.account.network;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0007\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0013\u0010\u0012R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0014\u001a\u0004\b\u001a\u0010\u0016¨\u0006\u001b"}, d2 = {"Lcom/truecaller/account/network/CheckCredentialsResponseSuccessDto;", "Lcom/truecaller/account/network/d;", "", "nextCallDuration", "", "domain", "installationId", "ttl", "", "suspended", "nextSuspensionCheck", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Long;)V", "J", "getNextCallDuration", "()J", "Ljava/lang/String;", "getDomain", "()Ljava/lang/String;", "getInstallationId", "Ljava/lang/Long;", "getTtl", "()Ljava/lang/Long;", "Ljava/lang/Boolean;", "getSuspended", "()Ljava/lang/Boolean;", "getNextSuspensionCheck", "account-network_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class CheckCredentialsResponseSuccessDto extends com.truecaller.account.network.d {

    @org.jetbrains.annotations.NotNull
    private final java.lang.String domain;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String installationId;
    private final long nextCallDuration;

    @org.jetbrains.annotations.Nullable
    private final java.lang.Long nextSuspensionCheck;

    @org.jetbrains.annotations.Nullable
    private final java.lang.Boolean suspended;

    @org.jetbrains.annotations.Nullable
    private final java.lang.Long ttl;

    public CheckCredentialsResponseSuccessDto(long j, @org.jetbrains.annotations.NotNull java.lang.String str, @org.jetbrains.annotations.Nullable java.lang.String str2, @org.jetbrains.annotations.Nullable java.lang.Long l, @org.jetbrains.annotations.Nullable java.lang.Boolean bool, @org.jetbrains.annotations.Nullable java.lang.Long l2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "domain");
        this.nextCallDuration = j;
        this.domain = str;
        this.installationId = str2;
        this.ttl = l;
        this.suspended = bool;
        this.nextSuspensionCheck = l2;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getDomain() {
        return this.domain;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getInstallationId() {
        return this.installationId;
    }

    public final long getNextCallDuration() {
        return this.nextCallDuration;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Long getNextSuspensionCheck() {
        return this.nextSuspensionCheck;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean getSuspended() {
        return this.suspended;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Long getTtl() {
        return this.ttl;
    }
}
