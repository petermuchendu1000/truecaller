package com.truecaller.swish.deeplink.data;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\u0012\u001a\u00020\u000fJ\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0014\u0010\u000e\u001a\u00020\u000fX\u0082D¢\u0006\b\n\u0000\u0012\u0004\b\u0010\u0010\u0011¨\u0006\u0018"}, d2 = {"Lcom/truecaller/swish/deeplink/data/SwishDto;", "Landroid/os/Parcelable;", "payee", "Lcom/truecaller/swish/deeplink/data/SwishStringDto;", "amount", "Lcom/truecaller/swish/deeplink/data/SwishNumberDto;", "message", "<init>", "(Lcom/truecaller/swish/deeplink/data/SwishStringDto;Lcom/truecaller/swish/deeplink/data/SwishNumberDto;Lcom/truecaller/swish/deeplink/data/SwishStringDto;)V", "getPayee", "()Lcom/truecaller/swish/deeplink/data/SwishStringDto;", "getAmount", "()Lcom/truecaller/swish/deeplink/data/SwishNumberDto;", "getMessage", "version", "", "getVersion$annotations", "()V", "describeContents", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "swish-integration_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class SwishDto implements android.os.Parcelable {

    @org.jetbrains.annotations.NotNull
    public static final android.os.Parcelable.Creator<com.truecaller.swish.deeplink.data.SwishDto> CREATOR = new er2.d(22);

    @org.jetbrains.annotations.NotNull
    private final com.truecaller.swish.deeplink.data.SwishNumberDto amount;

    @org.jetbrains.annotations.NotNull
    private final com.truecaller.swish.deeplink.data.SwishStringDto message;

    @org.jetbrains.annotations.NotNull
    private final com.truecaller.swish.deeplink.data.SwishStringDto payee;
    private final int version;

    public SwishDto(@org.jetbrains.annotations.NotNull com.truecaller.swish.deeplink.data.SwishStringDto swishStringDto, @org.jetbrains.annotations.NotNull com.truecaller.swish.deeplink.data.SwishNumberDto swishNumberDto, @org.jetbrains.annotations.NotNull com.truecaller.swish.deeplink.data.SwishStringDto swishStringDto2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(swishStringDto, "payee");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(swishNumberDto, "amount");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(swishStringDto2, "message");
        this.payee = swishStringDto;
        this.amount = swishNumberDto;
        this.message = swishStringDto2;
        this.version = 1;
    }

    private static /* synthetic */ void getVersion$annotations() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.swish.deeplink.data.SwishNumberDto getAmount() {
        return this.amount;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.swish.deeplink.data.SwishStringDto getMessage() {
        return this.message;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.swish.deeplink.data.SwishStringDto getPayee() {
        return this.payee;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@org.jetbrains.annotations.NotNull android.os.Parcel dest, int flags) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dest, "dest");
        this.payee.writeToParcel(dest, flags);
        this.amount.writeToParcel(dest, flags);
        this.message.writeToParcel(dest, flags);
    }
}
