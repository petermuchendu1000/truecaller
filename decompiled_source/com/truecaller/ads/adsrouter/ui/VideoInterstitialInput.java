package com.truecaller.ads.adsrouter.ui;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/truecaller/ads/adsrouter/ui/VideoInterstitialInput;", "Landroid/os/Parcelable;", "transport", "Lcom/truecaller/ads/adsrouter/ui/VideoAdTransport;", "<init>", "(Lcom/truecaller/ads/adsrouter/ui/VideoAdTransport;)V", "getTransport", "()Lcom/truecaller/ads/adsrouter/ui/VideoAdTransport;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ads-legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class VideoInterstitialInput implements android.os.Parcelable {
    public static final int $stable = 8;

    @org.jetbrains.annotations.NotNull
    public static final android.os.Parcelable.Creator<com.truecaller.ads.adsrouter.ui.VideoInterstitialInput> CREATOR = new f22.bar(28);

    @org.jetbrains.annotations.NotNull
    private final com.truecaller.ads.adsrouter.ui.VideoAdTransport transport;

    public VideoInterstitialInput(@org.jetbrains.annotations.NotNull com.truecaller.ads.adsrouter.ui.VideoAdTransport videoAdTransport) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(videoAdTransport, "transport");
        this.transport = videoAdTransport;
    }

    public static /* synthetic */ com.truecaller.ads.adsrouter.ui.VideoInterstitialInput copy$default(com.truecaller.ads.adsrouter.ui.VideoInterstitialInput videoInterstitialInput, com.truecaller.ads.adsrouter.ui.VideoAdTransport videoAdTransport, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            videoAdTransport = videoInterstitialInput.transport;
        }
        return videoInterstitialInput.copy(videoAdTransport);
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component1, reason: from getter */
    public final com.truecaller.ads.adsrouter.ui.VideoAdTransport getTransport() {
        return this.transport;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.ads.adsrouter.ui.VideoInterstitialInput copy(@org.jetbrains.annotations.NotNull com.truecaller.ads.adsrouter.ui.VideoAdTransport transport) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transport, "transport");
        return new com.truecaller.ads.adsrouter.ui.VideoInterstitialInput(transport);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.truecaller.ads.adsrouter.ui.VideoInterstitialInput) && kotlin.jvm.internal.Intrinsics.b(this.transport, ((com.truecaller.ads.adsrouter.ui.VideoInterstitialInput) other).transport);
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.ads.adsrouter.ui.VideoAdTransport getTransport() {
        return this.transport;
    }

    public int hashCode() {
        return this.transport.hashCode();
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return "VideoInterstitialInput(transport=" + this.transport + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@org.jetbrains.annotations.NotNull android.os.Parcel dest, int flags) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dest, "dest");
        this.transport.writeToParcel(dest, flags);
    }
}
