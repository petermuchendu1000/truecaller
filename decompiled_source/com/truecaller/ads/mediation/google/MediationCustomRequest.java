package com.truecaller.ads.mediation.google;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\b\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR$\u0010\u0013\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0018\u00010\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u001bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001c\u0010 \u001a\u0004\u0018\u00010\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001a\u0010%\u001a\u00020\u001bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u001d\"\u0004\b'\u0010\u001fR\u001a\u0010(\u001a\u00020\u001bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u001d\"\u0004\b*\u0010\u001fR\u001a\u0010+\u001a\u00020,X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001a\u00101\u001a\u00020,X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010.\"\u0004\b3\u00100¨\u00064"}, d2 = {"Lcom/truecaller/ads/mediation/google/MediationCustomRequest;", "", "<init>", "()V", "adSize", "Lcom/google/android/gms/ads/AdSize;", "getAdSize", "()Lcom/google/android/gms/ads/AdSize;", "setAdSize", "(Lcom/google/android/gms/ads/AdSize;)V", "serverParams", "Landroid/os/Bundle;", "getServerParams", "()Landroid/os/Bundle;", "setServerParams", "(Landroid/os/Bundle;)V", "eventExtras", "getEventExtras", "setEventExtras", "keywords", "", "", "getKeywords", "()Ljava/util/Set;", "setKeywords", "(Ljava/util/Set;)V", "useTesting", "", "getUseTesting", "()Z", "setUseTesting", "(Z)V", "bidResponse", "getBidResponse", "()Ljava/lang/String;", "setBidResponse", "(Ljava/lang/String;)V", "shouldDownloadImages", "getShouldDownloadImages", "setShouldDownloadImages", "shouldDownloadMultipleImages", "getShouldDownloadMultipleImages", "setShouldDownloadMultipleImages", "imageOrientation", "", "getImageOrientation", "()I", "setImageOrientation", "(I)V", "adChoicesPlacement", "getAdChoicesPlacement", "setAdChoicesPlacement", "ads-legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public class MediationCustomRequest {
    public static final int $stable = 8;
    private int adChoicesPlacement;

    @org.jetbrains.annotations.Nullable
    private com.google.android.gms.ads.AdSize adSize;

    @org.jetbrains.annotations.Nullable
    private java.lang.String bidResponse;

    @org.jetbrains.annotations.Nullable
    private android.os.Bundle eventExtras;
    private int imageOrientation;

    @org.jetbrains.annotations.Nullable
    private java.util.Set<java.lang.String> keywords;

    @org.jetbrains.annotations.Nullable
    private android.os.Bundle serverParams;
    private boolean shouldDownloadImages = true;
    private boolean shouldDownloadMultipleImages = true;
    private boolean useTesting;

    public final int getAdChoicesPlacement() {
        return this.adChoicesPlacement;
    }

    @org.jetbrains.annotations.Nullable
    public final com.google.android.gms.ads.AdSize getAdSize() {
        return this.adSize;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getBidResponse() {
        return this.bidResponse;
    }

    @org.jetbrains.annotations.Nullable
    public final android.os.Bundle getEventExtras() {
        return this.eventExtras;
    }

    public final int getImageOrientation() {
        return this.imageOrientation;
    }

    @org.jetbrains.annotations.Nullable
    public final java.util.Set<java.lang.String> getKeywords() {
        return this.keywords;
    }

    @org.jetbrains.annotations.Nullable
    public final android.os.Bundle getServerParams() {
        return this.serverParams;
    }

    public final boolean getShouldDownloadImages() {
        return this.shouldDownloadImages;
    }

    public final boolean getShouldDownloadMultipleImages() {
        return this.shouldDownloadMultipleImages;
    }

    public final boolean getUseTesting() {
        return this.useTesting;
    }

    public final void setAdChoicesPlacement(int i) {
        this.adChoicesPlacement = i;
    }

    public final void setAdSize(@org.jetbrains.annotations.Nullable com.google.android.gms.ads.AdSize adSize) {
        this.adSize = adSize;
    }

    public final void setBidResponse(@org.jetbrains.annotations.Nullable java.lang.String str) {
        this.bidResponse = str;
    }

    public final void setEventExtras(@org.jetbrains.annotations.Nullable android.os.Bundle bundle) {
        this.eventExtras = bundle;
    }

    public final void setImageOrientation(int i) {
        this.imageOrientation = i;
    }

    public final void setKeywords(@org.jetbrains.annotations.Nullable java.util.Set<java.lang.String> set) {
        this.keywords = set;
    }

    public final void setServerParams(@org.jetbrains.annotations.Nullable android.os.Bundle bundle) {
        this.serverParams = bundle;
    }

    public final void setShouldDownloadImages(boolean z) {
        this.shouldDownloadImages = z;
    }

    public final void setShouldDownloadMultipleImages(boolean z) {
        this.shouldDownloadMultipleImages = z;
    }

    public final void setUseTesting(boolean z) {
        this.useTesting = z;
    }
}
