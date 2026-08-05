package com.truecaller.ads.postclickexperience.dto;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u0013\u001a\u00020\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0014HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0014R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006 "}, d2 = {"Lcom/truecaller/ads/postclickexperience/dto/ThankYouData;", "Landroid/os/Parcelable;", "title", "", "desc", "cta", "url", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getDesc", "getCta", "getUrl", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ads-legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class ThankYouData implements android.os.Parcelable {
    public static final int $stable = 0;

    @org.jetbrains.annotations.NotNull
    public static final android.os.Parcelable.Creator<com.truecaller.ads.postclickexperience.dto.ThankYouData> CREATOR = new k90.bar(9);

    @org.jetbrains.annotations.Nullable
    private final java.lang.String cta;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String desc;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String title;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String url;

    public ThankYouData(@org.jetbrains.annotations.Nullable java.lang.String str, @org.jetbrains.annotations.Nullable java.lang.String str2, @org.jetbrains.annotations.Nullable java.lang.String str3, @org.jetbrains.annotations.Nullable java.lang.String str4) {
        this.title = str;
        this.desc = str2;
        this.cta = str3;
        this.url = str4;
    }

    public static /* synthetic */ com.truecaller.ads.postclickexperience.dto.ThankYouData copy$default(com.truecaller.ads.postclickexperience.dto.ThankYouData thankYouData, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = thankYouData.title;
        }
        if ((i & 2) != 0) {
            str2 = thankYouData.desc;
        }
        if ((i & 4) != 0) {
            str3 = thankYouData.cta;
        }
        if ((i & 8) != 0) {
            str4 = thankYouData.url;
        }
        return thankYouData.copy(str, str2, str3, str4);
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component1, reason: from getter */
    public final java.lang.String getTitle() {
        return this.title;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component2, reason: from getter */
    public final java.lang.String getDesc() {
        return this.desc;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component3, reason: from getter */
    public final java.lang.String getCta() {
        return this.cta;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component4, reason: from getter */
    public final java.lang.String getUrl() {
        return this.url;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.ads.postclickexperience.dto.ThankYouData copy(@org.jetbrains.annotations.Nullable java.lang.String title, @org.jetbrains.annotations.Nullable java.lang.String desc, @org.jetbrains.annotations.Nullable java.lang.String cta, @org.jetbrains.annotations.Nullable java.lang.String url) {
        return new com.truecaller.ads.postclickexperience.dto.ThankYouData(title, desc, cta, url);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.ads.postclickexperience.dto.ThankYouData)) {
            return false;
        }
        com.truecaller.ads.postclickexperience.dto.ThankYouData thankYouData = (com.truecaller.ads.postclickexperience.dto.ThankYouData) other;
        return kotlin.jvm.internal.Intrinsics.b(this.title, thankYouData.title) && kotlin.jvm.internal.Intrinsics.b(this.desc, thankYouData.desc) && kotlin.jvm.internal.Intrinsics.b(this.cta, thankYouData.cta) && kotlin.jvm.internal.Intrinsics.b(this.url, thankYouData.url);
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getCta() {
        return this.cta;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getDesc() {
        return this.desc;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getTitle() {
        return this.title;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getUrl() {
        return this.url;
    }

    public int hashCode() {
        java.lang.String str = this.title;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.lang.String str2 = this.desc;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.cta;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        java.lang.String str4 = this.url;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        java.lang.String str = this.title;
        java.lang.String str2 = this.desc;
        return bar.x(ro0.f.E("ThankYouData(title=", str, ", desc=", str2, ", cta="), this.cta, ", url=", this.url, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@org.jetbrains.annotations.NotNull android.os.Parcel dest, int flags) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.title);
        dest.writeString(this.desc);
        dest.writeString(this.cta);
        dest.writeString(this.url);
    }
}
