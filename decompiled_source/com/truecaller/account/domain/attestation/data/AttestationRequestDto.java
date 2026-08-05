package com.truecaller.account.domain.attestation.data;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"Lcom/truecaller/account/domain/attestation/data/AttestationRequestDto;", "", "statement", "", "build", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getStatement", "()Ljava/lang/String;", "getBuild", "domain_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class AttestationRequestDto {

    @org.jetbrains.annotations.Nullable
    private final java.lang.String build;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String statement;

    public AttestationRequestDto(@org.jetbrains.annotations.NotNull java.lang.String str, @org.jetbrains.annotations.Nullable java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "statement");
        this.statement = str;
        this.build = str2;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getBuild() {
        return this.build;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getStatement() {
        return this.statement;
    }

    public /* synthetic */ AttestationRequestDto(java.lang.String str, java.lang.String str2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2);
    }
}
