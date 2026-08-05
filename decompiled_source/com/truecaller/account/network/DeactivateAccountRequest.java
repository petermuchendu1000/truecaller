package com.truecaller.account.network;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, d2 = {"Lcom/truecaller/account/network/DeactivateAccountRequest;", "", "changeNumber", "", "requestId", "", "phoneNumber", "", "<init>", "(ZLjava/lang/String;J)V", "getChangeNumber", "()Z", "getRequestId", "()Ljava/lang/String;", "getPhoneNumber", "()J", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "account-network_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class DeactivateAccountRequest {
    private final boolean changeNumber;
    private final long phoneNumber;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String requestId;

    public DeactivateAccountRequest(boolean z, @org.jetbrains.annotations.NotNull java.lang.String str, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "requestId");
        this.changeNumber = z;
        this.requestId = str;
        this.phoneNumber = j;
    }

    public static /* synthetic */ com.truecaller.account.network.DeactivateAccountRequest copy$default(com.truecaller.account.network.DeactivateAccountRequest deactivateAccountRequest, boolean z, java.lang.String str, long j, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = deactivateAccountRequest.changeNumber;
        }
        if ((i & 2) != 0) {
            str = deactivateAccountRequest.requestId;
        }
        if ((i & 4) != 0) {
            j = deactivateAccountRequest.phoneNumber;
        }
        return deactivateAccountRequest.copy(z, str, j);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getChangeNumber() {
        return this.changeNumber;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component2, reason: from getter */
    public final java.lang.String getRequestId() {
        return this.requestId;
    }

    /* renamed from: component3, reason: from getter */
    public final long getPhoneNumber() {
        return this.phoneNumber;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.account.network.DeactivateAccountRequest copy(boolean changeNumber, @org.jetbrains.annotations.NotNull java.lang.String requestId, long phoneNumber) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestId, "requestId");
        return new com.truecaller.account.network.DeactivateAccountRequest(changeNumber, requestId, phoneNumber);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.account.network.DeactivateAccountRequest)) {
            return false;
        }
        com.truecaller.account.network.DeactivateAccountRequest deactivateAccountRequest = (com.truecaller.account.network.DeactivateAccountRequest) other;
        return this.changeNumber == deactivateAccountRequest.changeNumber && kotlin.jvm.internal.Intrinsics.b(this.requestId, deactivateAccountRequest.requestId) && this.phoneNumber == deactivateAccountRequest.phoneNumber;
    }

    public final boolean getChangeNumber() {
        return this.changeNumber;
    }

    public final long getPhoneNumber() {
        return this.phoneNumber;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getRequestId() {
        return this.requestId;
    }

    public int hashCode() {
        int i;
        if (this.changeNumber) {
            i = 1231;
        } else {
            i = 1237;
        }
        int e = ax1.bar.e(i * 31, 31, this.requestId);
        long j = this.phoneNumber;
        return e + ((int) (j ^ (j >>> 32)));
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        boolean z = this.changeNumber;
        return bar.n(this.phoneNumber, ")", bx.e1.u("DeactivateAccountRequest(changeNumber=", ", requestId=", this.requestId, ", phoneNumber=", z));
    }
}
