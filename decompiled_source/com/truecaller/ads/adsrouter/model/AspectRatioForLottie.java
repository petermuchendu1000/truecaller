package com.truecaller.ads.adsrouter.model;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\u0006\u0010\u0015\u001a\u00020\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0016HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e¨\u0006\""}, d2 = {"Lcom/truecaller/ads/adsrouter/model/AspectRatioForLottie;", "Landroid/os/Parcelable;", "width", "", "height", "w", "", "h", "<init>", "(Ljava/lang/String;Ljava/lang/String;FF)V", "getWidth", "()Ljava/lang/String;", "getHeight", "getW", "()F", "getH", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ads-legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class AspectRatioForLottie implements android.os.Parcelable {
    public static final int $stable = 0;

    @org.jetbrains.annotations.NotNull
    public static final android.os.Parcelable.Creator<com.truecaller.ads.adsrouter.model.AspectRatioForLottie> CREATOR = new y02.t(8);
    private final float h;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String height;
    private final float w;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String width;

    public AspectRatioForLottie(@org.jetbrains.annotations.NotNull java.lang.String str, @org.jetbrains.annotations.NotNull java.lang.String str2, float f, float f2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "width");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "height");
        this.width = str;
        this.height = str2;
        this.w = f;
        this.h = f2;
    }

    public static /* synthetic */ com.truecaller.ads.adsrouter.model.AspectRatioForLottie copy$default(com.truecaller.ads.adsrouter.model.AspectRatioForLottie aspectRatioForLottie, java.lang.String str, java.lang.String str2, float f, float f2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = aspectRatioForLottie.width;
        }
        if ((i & 2) != 0) {
            str2 = aspectRatioForLottie.height;
        }
        if ((i & 4) != 0) {
            f = aspectRatioForLottie.w;
        }
        if ((i & 8) != 0) {
            f2 = aspectRatioForLottie.h;
        }
        return aspectRatioForLottie.copy(str, str2, f, f2);
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component1, reason: from getter */
    public final java.lang.String getWidth() {
        return this.width;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component2, reason: from getter */
    public final java.lang.String getHeight() {
        return this.height;
    }

    /* renamed from: component3, reason: from getter */
    public final float getW() {
        return this.w;
    }

    /* renamed from: component4, reason: from getter */
    public final float getH() {
        return this.h;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.ads.adsrouter.model.AspectRatioForLottie copy(@org.jetbrains.annotations.NotNull java.lang.String width, @org.jetbrains.annotations.NotNull java.lang.String height, float w, float h) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(width, "width");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(height, "height");
        return new com.truecaller.ads.adsrouter.model.AspectRatioForLottie(width, height, w, h);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.ads.adsrouter.model.AspectRatioForLottie)) {
            return false;
        }
        com.truecaller.ads.adsrouter.model.AspectRatioForLottie aspectRatioForLottie = (com.truecaller.ads.adsrouter.model.AspectRatioForLottie) other;
        return kotlin.jvm.internal.Intrinsics.b(this.width, aspectRatioForLottie.width) && kotlin.jvm.internal.Intrinsics.b(this.height, aspectRatioForLottie.height) && java.lang.Float.compare(this.w, aspectRatioForLottie.w) == 0 && java.lang.Float.compare(this.h, aspectRatioForLottie.h) == 0;
    }

    public final float getH() {
        return this.h;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getHeight() {
        return this.height;
    }

    public final float getW() {
        return this.w;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getWidth() {
        return this.width;
    }

    public int hashCode() {
        return java.lang.Float.floatToIntBits(this.h) + ax1.bar.d(this.w, ax1.bar.e(this.width.hashCode() * 31, 31, this.height), 31);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        java.lang.String str = this.width;
        java.lang.String str2 = this.height;
        float f = this.w;
        float f2 = this.h;
        java.lang.StringBuilder E = ro0.f.E("AspectRatioForLottie(width=", str, ", height=", str2, ", w=");
        E.append(f);
        E.append(", h=");
        E.append(f2);
        E.append(")");
        return E.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@org.jetbrains.annotations.NotNull android.os.Parcel dest, int flags) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.width);
        dest.writeString(this.height);
        dest.writeFloat(this.w);
        dest.writeFloat(this.h);
    }
}
