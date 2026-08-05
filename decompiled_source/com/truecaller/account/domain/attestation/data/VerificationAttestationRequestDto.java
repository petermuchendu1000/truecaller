package com.truecaller.account.domain.attestation.data;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/truecaller/account/domain/attestation/data/VerificationAttestationRequestDto;", "", "statement", "", "requestId", "phoneNumber", "", "build", "<init>", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)V", "getStatement", "()Ljava/lang/String;", "getRequestId", "getPhoneNumber", "()J", "getBuild", "domain_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class VerificationAttestationRequestDto {

    @org.jetbrains.annotations.Nullable
    private final java.lang.String build;
    private final long phoneNumber;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String requestId;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String statement;

    public VerificationAttestationRequestDto(@org.jetbrains.annotations.NotNull java.lang.String str, @org.jetbrains.annotations.NotNull java.lang.String str2, long j, @org.jetbrains.annotations.Nullable java.lang.String str3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "statement");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "requestId");
        this.statement = str;
        this.requestId = str2;
        this.phoneNumber = j;
        this.build = str3;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getBuild() {
        return this.build;
    }

    public final long getPhoneNumber() {
        return this.phoneNumber;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getRequestId() {
        return this.requestId;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getStatement() {
        return this.statement;
    }

    public /* synthetic */ VerificationAttestationRequestDto(java.lang.String str, java.lang.String str2, long j, java.lang.String str3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, j, (i & 8) != 0 ? null : str3);
    }
}
