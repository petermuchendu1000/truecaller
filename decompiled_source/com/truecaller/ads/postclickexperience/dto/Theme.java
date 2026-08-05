package com.truecaller.ads.postclickexperience.dto;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\r\u001a\u00020\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001a"}, d2 = {"Lcom/truecaller/ads/postclickexperience/dto/Theme;", "Landroid/os/Parcelable;", "fgColor", "", "bgColor", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getFgColor", "()Ljava/lang/String;", "getBgColor", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ads-legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class Theme implements android.os.Parcelable {
    public static final int $stable = 0;

    @org.jetbrains.annotations.NotNull
    public static final android.os.Parcelable.Creator<com.truecaller.ads.postclickexperience.dto.Theme> CREATOR = new k90.bar(10);

    @bw.qux("bgColor")
    @org.jetbrains.annotations.NotNull
    private final java.lang.String bgColor;

    @bw.qux("fgColor")
    @org.jetbrains.annotations.NotNull
    private final java.lang.String fgColor;

    public Theme(@org.jetbrains.annotations.NotNull java.lang.String str, @org.jetbrains.annotations.NotNull java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "fgColor");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "bgColor");
        this.fgColor = str;
        this.bgColor = str2;
    }

    public static /* synthetic */ com.truecaller.ads.postclickexperience.dto.Theme copy$default(com.truecaller.ads.postclickexperience.dto.Theme theme, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = theme.fgColor;
        }
        if ((i & 2) != 0) {
            str2 = theme.bgColor;
        }
        return theme.copy(str, str2);
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component1, reason: from getter */
    public final java.lang.String getFgColor() {
        return this.fgColor;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component2, reason: from getter */
    public final java.lang.String getBgColor() {
        return this.bgColor;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.ads.postclickexperience.dto.Theme copy(@org.jetbrains.annotations.NotNull java.lang.String fgColor, @org.jetbrains.annotations.NotNull java.lang.String bgColor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fgColor, "fgColor");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bgColor, "bgColor");
        return new com.truecaller.ads.postclickexperience.dto.Theme(fgColor, bgColor);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.ads.postclickexperience.dto.Theme)) {
            return false;
        }
        com.truecaller.ads.postclickexperience.dto.Theme theme = (com.truecaller.ads.postclickexperience.dto.Theme) other;
        return kotlin.jvm.internal.Intrinsics.b(this.fgColor, theme.fgColor) && kotlin.jvm.internal.Intrinsics.b(this.bgColor, theme.bgColor);
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getBgColor() {
        return this.bgColor;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getFgColor() {
        return this.fgColor;
    }

    public int hashCode() {
        return this.bgColor.hashCode() + (this.fgColor.hashCode() * 31);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return y.o.e("Theme(fgColor=", this.fgColor, ", bgColor=", this.bgColor, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@org.jetbrains.annotations.NotNull android.os.Parcel dest, int flags) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.fgColor);
        dest.writeString(this.bgColor);
    }
}
