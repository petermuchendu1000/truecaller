package com.truecaller.sdk;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/truecaller/sdk/TrueProfileResponseWrapper;", "", "trueResponse", "Lcom/truecaller/android/sdk/legacy/TrueResponse;", "wrapperExtras", "Lcom/truecaller/sdk/WrapperExtras;", "<init>", "(Lcom/truecaller/android/sdk/legacy/TrueResponse;Lcom/truecaller/sdk/WrapperExtras;)V", "getTrueResponse", "()Lcom/truecaller/android/sdk/legacy/TrueResponse;", "getWrapperExtras", "()Lcom/truecaller/sdk/WrapperExtras;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "sdk-internal_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final /* data */ class TrueProfileResponseWrapper {
    public static final int $stable = 8;

    @org.jetbrains.annotations.NotNull
    private final com.truecaller.android.sdk.legacy.TrueResponse trueResponse;

    @org.jetbrains.annotations.Nullable
    private final com.truecaller.sdk.WrapperExtras wrapperExtras;

    public TrueProfileResponseWrapper(@org.jetbrains.annotations.NotNull com.truecaller.android.sdk.legacy.TrueResponse trueResponse, @org.jetbrains.annotations.Nullable com.truecaller.sdk.WrapperExtras wrapperExtras) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(trueResponse, "trueResponse");
        this.trueResponse = trueResponse;
        this.wrapperExtras = wrapperExtras;
    }

    public static /* synthetic */ com.truecaller.sdk.TrueProfileResponseWrapper copy$default(com.truecaller.sdk.TrueProfileResponseWrapper trueProfileResponseWrapper, com.truecaller.android.sdk.legacy.TrueResponse trueResponse, com.truecaller.sdk.WrapperExtras wrapperExtras, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            trueResponse = trueProfileResponseWrapper.trueResponse;
        }
        if ((i & 2) != 0) {
            wrapperExtras = trueProfileResponseWrapper.wrapperExtras;
        }
        return trueProfileResponseWrapper.copy(trueResponse, wrapperExtras);
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component1, reason: from getter */
    public final com.truecaller.android.sdk.legacy.TrueResponse getTrueResponse() {
        return this.trueResponse;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component2, reason: from getter */
    public final com.truecaller.sdk.WrapperExtras getWrapperExtras() {
        return this.wrapperExtras;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.sdk.TrueProfileResponseWrapper copy(@org.jetbrains.annotations.NotNull com.truecaller.android.sdk.legacy.TrueResponse trueResponse, @org.jetbrains.annotations.Nullable com.truecaller.sdk.WrapperExtras wrapperExtras) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(trueResponse, "trueResponse");
        return new com.truecaller.sdk.TrueProfileResponseWrapper(trueResponse, wrapperExtras);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.sdk.TrueProfileResponseWrapper)) {
            return false;
        }
        com.truecaller.sdk.TrueProfileResponseWrapper trueProfileResponseWrapper = (com.truecaller.sdk.TrueProfileResponseWrapper) other;
        return kotlin.jvm.internal.Intrinsics.b(this.trueResponse, trueProfileResponseWrapper.trueResponse) && kotlin.jvm.internal.Intrinsics.b(this.wrapperExtras, trueProfileResponseWrapper.wrapperExtras);
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.android.sdk.legacy.TrueResponse getTrueResponse() {
        return this.trueResponse;
    }

    @org.jetbrains.annotations.Nullable
    public final com.truecaller.sdk.WrapperExtras getWrapperExtras() {
        return this.wrapperExtras;
    }

    public int hashCode() {
        int hashCode = this.trueResponse.hashCode() * 31;
        com.truecaller.sdk.WrapperExtras wrapperExtras = this.wrapperExtras;
        return hashCode + (wrapperExtras == null ? 0 : wrapperExtras.hashCode());
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return "TrueProfileResponseWrapper(trueResponse=" + this.trueResponse + ", wrapperExtras=" + this.wrapperExtras + ")";
    }
}
