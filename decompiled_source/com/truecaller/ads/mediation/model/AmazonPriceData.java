package com.truecaller.ads.mediation.model;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0018"}, d2 = {"Lcom/truecaller/ads/mediation/model/AmazonPriceData;", "", "slotSize", "", "cpm", "", "pricePoints", "<init>", "(Ljava/lang/String;DLjava/lang/String;)V", "getSlotSize", "()Ljava/lang/String;", "getCpm", "()D", "getPricePoints", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "ads-legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class AmazonPriceData {
    public static final int $stable = 0;
    private final double cpm;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String pricePoints;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String slotSize;

    public AmazonPriceData(@org.jetbrains.annotations.NotNull java.lang.String str, double d, @org.jetbrains.annotations.NotNull java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "slotSize");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "pricePoints");
        this.slotSize = str;
        this.cpm = d;
        this.pricePoints = str2;
    }

    public static /* synthetic */ com.truecaller.ads.mediation.model.AmazonPriceData copy$default(com.truecaller.ads.mediation.model.AmazonPriceData amazonPriceData, java.lang.String str, double d, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = amazonPriceData.slotSize;
        }
        if ((i & 2) != 0) {
            d = amazonPriceData.cpm;
        }
        if ((i & 4) != 0) {
            str2 = amazonPriceData.pricePoints;
        }
        return amazonPriceData.copy(str, d, str2);
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component1, reason: from getter */
    public final java.lang.String getSlotSize() {
        return this.slotSize;
    }

    /* renamed from: component2, reason: from getter */
    public final double getCpm() {
        return this.cpm;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component3, reason: from getter */
    public final java.lang.String getPricePoints() {
        return this.pricePoints;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.ads.mediation.model.AmazonPriceData copy(@org.jetbrains.annotations.NotNull java.lang.String slotSize, double cpm, @org.jetbrains.annotations.NotNull java.lang.String pricePoints) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(slotSize, "slotSize");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pricePoints, "pricePoints");
        return new com.truecaller.ads.mediation.model.AmazonPriceData(slotSize, cpm, pricePoints);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.ads.mediation.model.AmazonPriceData)) {
            return false;
        }
        com.truecaller.ads.mediation.model.AmazonPriceData amazonPriceData = (com.truecaller.ads.mediation.model.AmazonPriceData) other;
        return kotlin.jvm.internal.Intrinsics.b(this.slotSize, amazonPriceData.slotSize) && java.lang.Double.compare(this.cpm, amazonPriceData.cpm) == 0 && kotlin.jvm.internal.Intrinsics.b(this.pricePoints, amazonPriceData.pricePoints);
    }

    public final double getCpm() {
        return this.cpm;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getPricePoints() {
        return this.pricePoints;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getSlotSize() {
        return this.slotSize;
    }

    public int hashCode() {
        int hashCode = this.slotSize.hashCode() * 31;
        long doubleToLongBits = java.lang.Double.doubleToLongBits(this.cpm);
        return this.pricePoints.hashCode() + ((hashCode + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        java.lang.String str = this.slotSize;
        double d = this.cpm;
        java.lang.String str2 = this.pricePoints;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AmazonPriceData(slotSize=");
        sb.append(str);
        sb.append(", cpm=");
        sb.append(d);
        return y.o.f(", pricePoints=", str2, ")", sb);
    }
}
