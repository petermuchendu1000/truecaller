package com.truecaller.ads.mediation.model.rtb;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB1\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J.\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u000eJ\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b \u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010\u0011R\u0011\u0010\t\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b#\u0010\u000e¨\u0006$"}, d2 = {"com/truecaller/ads/mediation/model/rtb/Asset$ImageAsset", "Lz70/bar;", "", com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.ID_COLUMN, "required", "Lcom/truecaller/ads/mediation/model/rtb/Image;", "img", "<init>", "(IILcom/truecaller/ads/mediation/model/rtb/Image;)V", com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.TYPE_COLUMN, "wmin", "hmin", "(IIIII)V", "component1", "()I", "component2", "component3", "()Lcom/truecaller/ads/mediation/model/rtb/Image;", "Lcom/truecaller/ads/mediation/model/rtb/Asset$ImageAsset;", "copy", "(IILcom/truecaller/ads/mediation/model/rtb/Image;)Lcom/truecaller/ads/mediation/model/rtb/Asset$ImageAsset;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "getRequired", "Lcom/truecaller/ads/mediation/model/rtb/Image;", "getImg", "getType", "ads-legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class Asset$ImageAsset extends z70.bar {
    public static final int $stable = 0;
    private final int id;

    @org.jetbrains.annotations.NotNull
    private final com.truecaller.ads.mediation.model.rtb.Image img;
    private final int required;

    public Asset$ImageAsset(int i, int i2, @org.jetbrains.annotations.NotNull com.truecaller.ads.mediation.model.rtb.Image image) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(image, "img");
        this.id = i;
        this.required = i2;
        this.img = image;
    }

    public static /* synthetic */ com.truecaller.ads.mediation.model.rtb.Asset$ImageAsset copy$default(com.truecaller.ads.mediation.model.rtb.Asset$ImageAsset asset$ImageAsset, int i, int i2, com.truecaller.ads.mediation.model.rtb.Image image, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            i = asset$ImageAsset.id;
        }
        if ((i3 & 2) != 0) {
            i2 = asset$ImageAsset.required;
        }
        if ((i3 & 4) != 0) {
            image = asset$ImageAsset.img;
        }
        return asset$ImageAsset.copy(i, i2, image);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final int getRequired() {
        return this.required;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component3, reason: from getter */
    public final com.truecaller.ads.mediation.model.rtb.Image getImg() {
        return this.img;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.ads.mediation.model.rtb.Asset$ImageAsset copy(int id, int required, @org.jetbrains.annotations.NotNull com.truecaller.ads.mediation.model.rtb.Image img) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(img, "img");
        return new com.truecaller.ads.mediation.model.rtb.Asset$ImageAsset(id, required, img);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.ads.mediation.model.rtb.Asset$ImageAsset)) {
            return false;
        }
        com.truecaller.ads.mediation.model.rtb.Asset$ImageAsset asset$ImageAsset = (com.truecaller.ads.mediation.model.rtb.Asset$ImageAsset) other;
        return this.id == asset$ImageAsset.id && this.required == asset$ImageAsset.required && kotlin.jvm.internal.Intrinsics.b(this.img, asset$ImageAsset.img);
    }

    public int getId() {
        return this.id;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.ads.mediation.model.rtb.Image getImg() {
        return this.img;
    }

    public int getRequired() {
        return this.required;
    }

    public final int getType() {
        return this.img.getType();
    }

    public int hashCode() {
        return this.img.hashCode() + (((this.id * 31) + this.required) * 31);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        int i = this.id;
        int i2 = this.required;
        com.truecaller.ads.mediation.model.rtb.Image image = this.img;
        java.lang.StringBuilder e = z0.a0.e(i, i2, "ImageAsset(id=", ", required=", ", img=");
        e.append(image);
        e.append(")");
        return e.toString();
    }

    public Asset$ImageAsset(int i, int i2, int i3, int i4, int i5) {
        this(i, i2, new com.truecaller.ads.mediation.model.rtb.Image(i3, i4, i5));
    }
}
