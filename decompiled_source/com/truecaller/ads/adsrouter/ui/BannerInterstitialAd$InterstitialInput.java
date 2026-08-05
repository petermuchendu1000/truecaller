package com.truecaller.ads.adsrouter.ui;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000B\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J$\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0012J\u0010\u0010\u0019\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0019\u0010\nJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010\u0014¨\u0006#"}, d2 = {"com/truecaller/ads/adsrouter/ui/BannerInterstitialAd$InterstitialInput", "Landroid/os/Parcelable;", "", "htmlContent", "Lcom/truecaller/ads/adsrouter/model/Size;", "maxSize", "<init>", "(Ljava/lang/String;Lcom/truecaller/ads/adsrouter/model/Size;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/truecaller/ads/adsrouter/model/Size;", "Lcom/truecaller/ads/adsrouter/ui/BannerInterstitialAd$InterstitialInput;", "copy", "(Ljava/lang/String;Lcom/truecaller/ads/adsrouter/model/Size;)Lcom/truecaller/ads/adsrouter/ui/BannerInterstitialAd$InterstitialInput;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getHtmlContent", "Lcom/truecaller/ads/adsrouter/model/Size;", "getMaxSize", "ads-legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class BannerInterstitialAd$InterstitialInput implements android.os.Parcelable {
    public static final int $stable = 0;

    @org.jetbrains.annotations.NotNull
    public static final android.os.Parcelable.Creator<com.truecaller.ads.adsrouter.ui.BannerInterstitialAd$InterstitialInput> CREATOR = new f22.bar(26);

    @org.jetbrains.annotations.NotNull
    private final java.lang.String htmlContent;

    @org.jetbrains.annotations.NotNull
    private final com.truecaller.ads.adsrouter.model.Size maxSize;

    public BannerInterstitialAd$InterstitialInput(@org.jetbrains.annotations.NotNull java.lang.String str, @org.jetbrains.annotations.NotNull com.truecaller.ads.adsrouter.model.Size size) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "htmlContent");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(size, "maxSize");
        this.htmlContent = str;
        this.maxSize = size;
    }

    public static /* synthetic */ com.truecaller.ads.adsrouter.ui.BannerInterstitialAd$InterstitialInput copy$default(com.truecaller.ads.adsrouter.ui.BannerInterstitialAd$InterstitialInput bannerInterstitialAd$InterstitialInput, java.lang.String str, com.truecaller.ads.adsrouter.model.Size size, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = bannerInterstitialAd$InterstitialInput.htmlContent;
        }
        if ((i & 2) != 0) {
            size = bannerInterstitialAd$InterstitialInput.maxSize;
        }
        return bannerInterstitialAd$InterstitialInput.copy(str, size);
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component1, reason: from getter */
    public final java.lang.String getHtmlContent() {
        return this.htmlContent;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component2, reason: from getter */
    public final com.truecaller.ads.adsrouter.model.Size getMaxSize() {
        return this.maxSize;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.ads.adsrouter.ui.BannerInterstitialAd$InterstitialInput copy(@org.jetbrains.annotations.NotNull java.lang.String htmlContent, @org.jetbrains.annotations.NotNull com.truecaller.ads.adsrouter.model.Size maxSize) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(htmlContent, "htmlContent");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(maxSize, "maxSize");
        return new com.truecaller.ads.adsrouter.ui.BannerInterstitialAd$InterstitialInput(htmlContent, maxSize);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.ads.adsrouter.ui.BannerInterstitialAd$InterstitialInput)) {
            return false;
        }
        com.truecaller.ads.adsrouter.ui.BannerInterstitialAd$InterstitialInput bannerInterstitialAd$InterstitialInput = (com.truecaller.ads.adsrouter.ui.BannerInterstitialAd$InterstitialInput) other;
        return kotlin.jvm.internal.Intrinsics.b(this.htmlContent, bannerInterstitialAd$InterstitialInput.htmlContent) && kotlin.jvm.internal.Intrinsics.b(this.maxSize, bannerInterstitialAd$InterstitialInput.maxSize);
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getHtmlContent() {
        return this.htmlContent;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.ads.adsrouter.model.Size getMaxSize() {
        return this.maxSize;
    }

    public int hashCode() {
        return this.maxSize.hashCode() + (this.htmlContent.hashCode() * 31);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return "InterstitialInput(htmlContent=" + this.htmlContent + ", maxSize=" + this.maxSize + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@org.jetbrains.annotations.NotNull android.os.Parcel dest, int flags) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.htmlContent);
        this.maxSize.writeToParcel(dest, flags);
    }
}
