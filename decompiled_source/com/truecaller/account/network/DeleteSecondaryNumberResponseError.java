package com.truecaller.account.network;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000fB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/truecaller/account/network/DeleteSecondaryNumberResponseError;", "Lcom/truecaller/account/network/f;", "", "status", "", com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.MESSAGE_COLUMN, "<init>", "(ILjava/lang/String;)V", "I", "getStatus", "()I", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "Companion", "com/truecaller/account/network/g", "account-network_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class DeleteSecondaryNumberResponseError extends com.truecaller.account.network.f {

    @org.jetbrains.annotations.NotNull
    public static final com.truecaller.account.network.g Companion = new java.lang.Object();
    public static final int STATUS_NUMBER_NOT_FOUND = 40406;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String message;
    private final int status;

    public DeleteSecondaryNumberResponseError(int i, @org.jetbrains.annotations.Nullable java.lang.String str) {
        this.status = i;
        this.message = str;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getMessage() {
        return this.message;
    }

    public final int getStatus() {
        return this.status;
    }
}
