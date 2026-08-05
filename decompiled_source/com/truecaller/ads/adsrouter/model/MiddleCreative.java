package com.truecaller.ads.adsrouter.model;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0011J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\tHÆ\u0003J>\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u001aJ\u0006\u0010\u001b\u001a\u00020\u0007J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020\u0007HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u0007R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006'"}, d2 = {"Lcom/truecaller/ads/adsrouter/model/MiddleCreative;", "Landroid/os/Parcelable;", "logo", "", "size", "Lcom/truecaller/ads/adsrouter/model/Size;", "delay", "", "position", "Lcom/truecaller/ads/adsrouter/model/MiddleCreativePosition;", "<init>", "(Ljava/lang/String;Lcom/truecaller/ads/adsrouter/model/Size;Ljava/lang/Integer;Lcom/truecaller/ads/adsrouter/model/MiddleCreativePosition;)V", "getLogo", "()Ljava/lang/String;", "getSize", "()Lcom/truecaller/ads/adsrouter/model/Size;", "getDelay", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getPosition", "()Lcom/truecaller/ads/adsrouter/model/MiddleCreativePosition;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Lcom/truecaller/ads/adsrouter/model/Size;Ljava/lang/Integer;Lcom/truecaller/ads/adsrouter/model/MiddleCreativePosition;)Lcom/truecaller/ads/adsrouter/model/MiddleCreative;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ads-legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class MiddleCreative implements android.os.Parcelable {
    public static final int $stable = 0;

    @org.jetbrains.annotations.NotNull
    public static final android.os.Parcelable.Creator<com.truecaller.ads.adsrouter.model.MiddleCreative> CREATOR = new y02.t(15);

    @bw.qux("delay")
    @org.jetbrains.annotations.Nullable
    private final java.lang.Integer delay;

    @bw.qux("logo")
    @org.jetbrains.annotations.Nullable
    private final java.lang.String logo;

    @bw.qux("position")
    @org.jetbrains.annotations.Nullable
    private final com.truecaller.ads.adsrouter.model.MiddleCreativePosition position;

    @bw.qux("size")
    @org.jetbrains.annotations.Nullable
    private final com.truecaller.ads.adsrouter.model.Size size;

    public MiddleCreative(@org.jetbrains.annotations.Nullable java.lang.String str, @org.jetbrains.annotations.Nullable com.truecaller.ads.adsrouter.model.Size size, @org.jetbrains.annotations.Nullable java.lang.Integer num, @org.jetbrains.annotations.Nullable com.truecaller.ads.adsrouter.model.MiddleCreativePosition middleCreativePosition) {
        this.logo = str;
        this.size = size;
        this.delay = num;
        this.position = middleCreativePosition;
    }

    public static /* synthetic */ com.truecaller.ads.adsrouter.model.MiddleCreative copy$default(com.truecaller.ads.adsrouter.model.MiddleCreative middleCreative, java.lang.String str, com.truecaller.ads.adsrouter.model.Size size, java.lang.Integer num, com.truecaller.ads.adsrouter.model.MiddleCreativePosition middleCreativePosition, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = middleCreative.logo;
        }
        if ((i & 2) != 0) {
            size = middleCreative.size;
        }
        if ((i & 4) != 0) {
            num = middleCreative.delay;
        }
        if ((i & 8) != 0) {
            middleCreativePosition = middleCreative.position;
        }
        return middleCreative.copy(str, size, num, middleCreativePosition);
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component1, reason: from getter */
    public final java.lang.String getLogo() {
        return this.logo;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component2, reason: from getter */
    public final com.truecaller.ads.adsrouter.model.Size getSize() {
        return this.size;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component3, reason: from getter */
    public final java.lang.Integer getDelay() {
        return this.delay;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component4, reason: from getter */
    public final com.truecaller.ads.adsrouter.model.MiddleCreativePosition getPosition() {
        return this.position;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.ads.adsrouter.model.MiddleCreative copy(@org.jetbrains.annotations.Nullable java.lang.String logo, @org.jetbrains.annotations.Nullable com.truecaller.ads.adsrouter.model.Size size, @org.jetbrains.annotations.Nullable java.lang.Integer delay, @org.jetbrains.annotations.Nullable com.truecaller.ads.adsrouter.model.MiddleCreativePosition position) {
        return new com.truecaller.ads.adsrouter.model.MiddleCreative(logo, size, delay, position);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.ads.adsrouter.model.MiddleCreative)) {
            return false;
        }
        com.truecaller.ads.adsrouter.model.MiddleCreative middleCreative = (com.truecaller.ads.adsrouter.model.MiddleCreative) other;
        return kotlin.jvm.internal.Intrinsics.b(this.logo, middleCreative.logo) && kotlin.jvm.internal.Intrinsics.b(this.size, middleCreative.size) && kotlin.jvm.internal.Intrinsics.b(this.delay, middleCreative.delay) && this.position == middleCreative.position;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getDelay() {
        return this.delay;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getLogo() {
        return this.logo;
    }

    @org.jetbrains.annotations.Nullable
    public final com.truecaller.ads.adsrouter.model.MiddleCreativePosition getPosition() {
        return this.position;
    }

    @org.jetbrains.annotations.Nullable
    public final com.truecaller.ads.adsrouter.model.Size getSize() {
        return this.size;
    }

    public int hashCode() {
        java.lang.String str = this.logo;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        com.truecaller.ads.adsrouter.model.Size size = this.size;
        int hashCode2 = (hashCode + (size == null ? 0 : size.hashCode())) * 31;
        java.lang.Integer num = this.delay;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        com.truecaller.ads.adsrouter.model.MiddleCreativePosition middleCreativePosition = this.position;
        return hashCode3 + (middleCreativePosition != null ? middleCreativePosition.hashCode() : 0);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return "MiddleCreative(logo=" + this.logo + ", size=" + this.size + ", delay=" + this.delay + ", position=" + this.position + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@org.jetbrains.annotations.NotNull android.os.Parcel dest, int flags) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.logo);
        com.truecaller.ads.adsrouter.model.Size size = this.size;
        if (size == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            size.writeToParcel(dest, flags);
        }
        java.lang.Integer num = this.delay;
        if (num == null) {
            dest.writeInt(0);
        } else {
            z0.a0.j(dest, 1, num);
        }
        com.truecaller.ads.adsrouter.model.MiddleCreativePosition middleCreativePosition = this.position;
        if (middleCreativePosition == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(middleCreativePosition.name());
        }
    }
}
