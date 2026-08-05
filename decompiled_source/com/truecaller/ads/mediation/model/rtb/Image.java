package com.truecaller.ads.mediation.model.rtb;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/truecaller/ads/mediation/model/rtb/Image;", "", com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.TYPE_COLUMN, "", "wmin", "hmin", "<init>", "(III)V", "getType", "()I", "getWmin", "getHmin", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "ads-legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class Image {
    public static final int $stable = 0;
    private final int hmin;
    private final int type;
    private final int wmin;

    public Image(int i, int i2, int i3) {
        this.type = i;
        this.wmin = i2;
        this.hmin = i3;
    }

    public static /* synthetic */ com.truecaller.ads.mediation.model.rtb.Image copy$default(com.truecaller.ads.mediation.model.rtb.Image image, int i, int i2, int i3, int i4, java.lang.Object obj) {
        if ((i4 & 1) != 0) {
            i = image.type;
        }
        if ((i4 & 2) != 0) {
            i2 = image.wmin;
        }
        if ((i4 & 4) != 0) {
            i3 = image.hmin;
        }
        return image.copy(i, i2, i3);
    }

    /* renamed from: component1, reason: from getter */
    public final int getType() {
        return this.type;
    }

    /* renamed from: component2, reason: from getter */
    public final int getWmin() {
        return this.wmin;
    }

    /* renamed from: component3, reason: from getter */
    public final int getHmin() {
        return this.hmin;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.ads.mediation.model.rtb.Image copy(int type, int wmin, int hmin) {
        return new com.truecaller.ads.mediation.model.rtb.Image(type, wmin, hmin);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.ads.mediation.model.rtb.Image)) {
            return false;
        }
        com.truecaller.ads.mediation.model.rtb.Image image = (com.truecaller.ads.mediation.model.rtb.Image) other;
        return this.type == image.type && this.wmin == image.wmin && this.hmin == image.hmin;
    }

    public final int getHmin() {
        return this.hmin;
    }

    public final int getType() {
        return this.type;
    }

    public final int getWmin() {
        return this.wmin;
    }

    public int hashCode() {
        return (((this.type * 31) + this.wmin) * 31) + this.hmin;
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return bar.m(this.hmin, ")", z0.a0.e(this.type, this.wmin, "Image(type=", ", wmin=", ", hmin="));
    }
}
