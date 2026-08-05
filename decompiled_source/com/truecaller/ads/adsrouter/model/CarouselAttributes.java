package com.truecaller.ads.adsrouter.model;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J3\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u000f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, d2 = {"Lcom/truecaller/ads/adsrouter/model/CarouselAttributes;", "", "imageUrl", "", "landingUrl", "cta", "headLine", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getImageUrl", "()Ljava/lang/String;", "getLandingUrl", "getCta", "getHeadLine", "isEventPixelRecorded", "", "()Z", "setEventPixelRecorded", "(Z)V", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "ads-legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class CarouselAttributes {
    public static final int $stable = 8;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String cta;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String headLine;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String imageUrl;
    private boolean isEventPixelRecorded;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String landingUrl;

    public CarouselAttributes(@org.jetbrains.annotations.NotNull java.lang.String str, @org.jetbrains.annotations.NotNull java.lang.String str2, @org.jetbrains.annotations.NotNull java.lang.String str3, @org.jetbrains.annotations.Nullable java.lang.String str4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "imageUrl");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "landingUrl");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "cta");
        this.imageUrl = str;
        this.landingUrl = str2;
        this.cta = str3;
        this.headLine = str4;
    }

    public static /* synthetic */ com.truecaller.ads.adsrouter.model.CarouselAttributes copy$default(com.truecaller.ads.adsrouter.model.CarouselAttributes carouselAttributes, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = carouselAttributes.imageUrl;
        }
        if ((i & 2) != 0) {
            str2 = carouselAttributes.landingUrl;
        }
        if ((i & 4) != 0) {
            str3 = carouselAttributes.cta;
        }
        if ((i & 8) != 0) {
            str4 = carouselAttributes.headLine;
        }
        return carouselAttributes.copy(str, str2, str3, str4);
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component1, reason: from getter */
    public final java.lang.String getImageUrl() {
        return this.imageUrl;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component2, reason: from getter */
    public final java.lang.String getLandingUrl() {
        return this.landingUrl;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component3, reason: from getter */
    public final java.lang.String getCta() {
        return this.cta;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component4, reason: from getter */
    public final java.lang.String getHeadLine() {
        return this.headLine;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.ads.adsrouter.model.CarouselAttributes copy(@org.jetbrains.annotations.NotNull java.lang.String imageUrl, @org.jetbrains.annotations.NotNull java.lang.String landingUrl, @org.jetbrains.annotations.NotNull java.lang.String cta, @org.jetbrains.annotations.Nullable java.lang.String headLine) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(landingUrl, "landingUrl");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cta, "cta");
        return new com.truecaller.ads.adsrouter.model.CarouselAttributes(imageUrl, landingUrl, cta, headLine);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.ads.adsrouter.model.CarouselAttributes)) {
            return false;
        }
        com.truecaller.ads.adsrouter.model.CarouselAttributes carouselAttributes = (com.truecaller.ads.adsrouter.model.CarouselAttributes) other;
        return kotlin.jvm.internal.Intrinsics.b(this.imageUrl, carouselAttributes.imageUrl) && kotlin.jvm.internal.Intrinsics.b(this.landingUrl, carouselAttributes.landingUrl) && kotlin.jvm.internal.Intrinsics.b(this.cta, carouselAttributes.cta) && kotlin.jvm.internal.Intrinsics.b(this.headLine, carouselAttributes.headLine);
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getCta() {
        return this.cta;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getHeadLine() {
        return this.headLine;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getImageUrl() {
        return this.imageUrl;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getLandingUrl() {
        return this.landingUrl;
    }

    public int hashCode() {
        int hashCode;
        int e = ax1.bar.e(ax1.bar.e(this.imageUrl.hashCode() * 31, 31, this.landingUrl), 31, this.cta);
        java.lang.String str = this.headLine;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return e + hashCode;
    }

    /* renamed from: isEventPixelRecorded, reason: from getter */
    public final boolean getIsEventPixelRecorded() {
        return this.isEventPixelRecorded;
    }

    public final void setEventPixelRecorded(boolean z) {
        this.isEventPixelRecorded = z;
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        java.lang.String str = this.imageUrl;
        java.lang.String str2 = this.landingUrl;
        return bar.x(ro0.f.E("CarouselAttributes(imageUrl=", str, ", landingUrl=", str2, ", cta="), this.cta, ", headLine=", this.headLine, ")");
    }
}
