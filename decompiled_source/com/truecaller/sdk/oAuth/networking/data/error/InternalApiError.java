package com.truecaller.sdk.oAuth.networking.data.error;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\fJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\fJ0\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0012\u0010\fJ\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\nJ\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001d\u0010\f¨\u0006\u001e"}, d2 = {"Lcom/truecaller/sdk/oAuth/networking/data/error/InternalApiError;", "Lxo2/bar;", "", "status", "", "message", "details", "<init>", "(ILjava/lang/String;Ljava/lang/String;)V", "errorCode", "()I", "errorMessage", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "(ILjava/lang/String;Ljava/lang/String;)Lcom/truecaller/sdk/oAuth/networking/data/error/InternalApiError;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getStatus", "Ljava/lang/String;", "getMessage", "getDetails", "sdk-internal_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final /* data */ class InternalApiError extends xo2.bar {
    public static final int $stable = 8;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String details;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String message;
    private final int status;

    public InternalApiError(int i, @org.jetbrains.annotations.NotNull java.lang.String str, @org.jetbrains.annotations.Nullable java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "message");
        this.status = i;
        this.message = str;
        this.details = str2;
    }

    public static /* synthetic */ com.truecaller.sdk.oAuth.networking.data.error.InternalApiError copy$default(com.truecaller.sdk.oAuth.networking.data.error.InternalApiError internalApiError, int i, java.lang.String str, java.lang.String str2, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = internalApiError.status;
        }
        if ((i2 & 2) != 0) {
            str = internalApiError.message;
        }
        if ((i2 & 4) != 0) {
            str2 = internalApiError.details;
        }
        return internalApiError.copy(i, str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component2, reason: from getter */
    public final java.lang.String getMessage() {
        return this.message;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component3, reason: from getter */
    public final java.lang.String getDetails() {
        return this.details;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.sdk.oAuth.networking.data.error.InternalApiError copy(int status, @org.jetbrains.annotations.NotNull java.lang.String message, @org.jetbrains.annotations.Nullable java.lang.String details) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        return new com.truecaller.sdk.oAuth.networking.data.error.InternalApiError(status, message, details);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.sdk.oAuth.networking.data.error.InternalApiError)) {
            return false;
        }
        com.truecaller.sdk.oAuth.networking.data.error.InternalApiError internalApiError = (com.truecaller.sdk.oAuth.networking.data.error.InternalApiError) other;
        return this.status == internalApiError.status && kotlin.jvm.internal.Intrinsics.b(this.message, internalApiError.message) && kotlin.jvm.internal.Intrinsics.b(this.details, internalApiError.details);
    }

    @Override // xo2.bar
    public int errorCode() {
        return this.status;
    }

    @Override // xo2.bar
    @org.jetbrains.annotations.NotNull
    public java.lang.String errorMessage() {
        java.lang.String str = this.details;
        if (str == null) {
            return this.message;
        }
        return str;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getDetails() {
        return this.details;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getMessage() {
        return this.message;
    }

    public final int getStatus() {
        return this.status;
    }

    public int hashCode() {
        int hashCode;
        int e = ax1.bar.e(this.status * 31, 31, this.message);
        java.lang.String str = this.details;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return e + hashCode;
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return bar.v(this.details, ")", qb.qux.r("InternalApiError(status=", this.status, ", message=", this.message, ", details="));
    }
}
