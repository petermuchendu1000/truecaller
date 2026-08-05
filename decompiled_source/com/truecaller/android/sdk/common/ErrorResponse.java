package com.truecaller.android.sdk.common;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/truecaller/android/sdk/common/ErrorResponse;", "", "code", "", com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.MESSAGE_COLUMN, "", "<init>", "(ILjava/lang/String;)V", "getCode", "()I", "getMessage", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "sdk-external_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class ErrorResponse {
    private final int code;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String message;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ErrorResponse() {
        this(0, r0, 3, r0);
        java.lang.String str = null;
    }

    public static /* synthetic */ com.truecaller.android.sdk.common.ErrorResponse copy$default(com.truecaller.android.sdk.common.ErrorResponse errorResponse, int i, java.lang.String str, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = errorResponse.code;
        }
        if ((i2 & 2) != 0) {
            str = errorResponse.message;
        }
        return errorResponse.copy(i, str);
    }

    /* renamed from: component1, reason: from getter */
    public final int getCode() {
        return this.code;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component2, reason: from getter */
    public final java.lang.String getMessage() {
        return this.message;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.android.sdk.common.ErrorResponse copy(int code, @org.jetbrains.annotations.NotNull java.lang.String message) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.MESSAGE_COLUMN);
        return new com.truecaller.android.sdk.common.ErrorResponse(code, message);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.android.sdk.common.ErrorResponse)) {
            return false;
        }
        com.truecaller.android.sdk.common.ErrorResponse errorResponse = (com.truecaller.android.sdk.common.ErrorResponse) other;
        return this.code == errorResponse.code && kotlin.jvm.internal.Intrinsics.b(this.message, errorResponse.message);
    }

    public final int getCode() {
        return this.code;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getMessage() {
        return this.message;
    }

    public int hashCode() {
        return this.message.hashCode() + (this.code * 31);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return bx.e1.n("ErrorResponse(code=", this.code, ", message=", this.message, ")");
    }

    public ErrorResponse(int i, @org.jetbrains.annotations.NotNull java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.MESSAGE_COLUMN);
        this.code = i;
        this.message = str;
    }

    public /* synthetic */ ErrorResponse(int i, java.lang.String str, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 1 : i, (i2 & 2) != 0 ? com.truecaller.android.sdk.common.TrueException.TYPE_UNKNOWN_MESSAGE : str);
    }
}
