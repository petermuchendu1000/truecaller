package com.truecaller.swish.deeplink.data;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\u000f\u001a\u00020\u0010J\u0016\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0010R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\r¨\u0006\u0016"}, d2 = {"Lcom/truecaller/swish/deeplink/data/SwishResultDto;", "Landroid/os/Parcelable;", "result", "", "payee", "amount", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;)V", "getResult", "()Ljava/lang/String;", "getPayee", "getAmount", "()Ljava/lang/Double;", "Ljava/lang/Double;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "swish-integration_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class SwishResultDto implements android.os.Parcelable {

    @org.jetbrains.annotations.NotNull
    public static final android.os.Parcelable.Creator<com.truecaller.swish.deeplink.data.SwishResultDto> CREATOR = new er2.d(24);

    @org.jetbrains.annotations.Nullable
    private final java.lang.Double amount;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String payee;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String result;

    public SwishResultDto(@org.jetbrains.annotations.Nullable java.lang.String str, @org.jetbrains.annotations.Nullable java.lang.String str2, @org.jetbrains.annotations.Nullable java.lang.Double d) {
        this.result = str;
        this.payee = str2;
        this.amount = d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Double getAmount() {
        return this.amount;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getPayee() {
        return this.payee;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getResult() {
        return this.result;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@org.jetbrains.annotations.NotNull android.os.Parcel dest, int flags) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.result);
        dest.writeString(this.payee);
        java.lang.Double d = this.amount;
        if (d == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeDouble(d.doubleValue());
        }
    }
}
