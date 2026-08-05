package com.truecaller.ads.keywords.model;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/ads/keywords/model/AdCampaign;", "Landroid/os/Parcelable;", "Style", "CtaStyle", "ads-legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class AdCampaign implements android.os.Parcelable {

    @org.jetbrains.annotations.NotNull
    public static final android.os.Parcelable.Creator<com.truecaller.ads.keywords.model.AdCampaign> CREATOR = new java.lang.Object();
    public final java.lang.String a;
    public final com.truecaller.ads.keywords.model.AdCampaign.Style b;
    public final com.truecaller.ads.keywords.model.AdCampaign.CtaStyle c;

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/truecaller/ads/keywords/model/AdCampaign$CtaStyle;", "Landroid/os/Parcelable;", "ads-legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes5.dex */
    public static final /* data */ class CtaStyle implements android.os.Parcelable {

        @org.jetbrains.annotations.NotNull
        public static final android.os.Parcelable.Creator<com.truecaller.ads.keywords.model.AdCampaign.CtaStyle> CREATOR = new java.lang.Object();
        public final int a;
        public final int b;

        public CtaStyle(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof com.truecaller.ads.keywords.model.AdCampaign.CtaStyle)) {
                return false;
            }
            com.truecaller.ads.keywords.model.AdCampaign.CtaStyle ctaStyle = (com.truecaller.ads.keywords.model.AdCampaign.CtaStyle) obj;
            return this.a == ctaStyle.a && this.b == ctaStyle.b;
        }

        public final int hashCode() {
            return (this.a * 31) + this.b;
        }

        public final java.lang.String toString() {
            return h0.b.P(this.a, this.b, "CtaStyle(backgroundColor=", ", textColor=", ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int i) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "dest");
            parcel.writeInt(this.a);
            parcel.writeInt(this.b);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/truecaller/ads/keywords/model/AdCampaign$Style;", "Landroid/os/Parcelable;", "ads-legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes5.dex */
    public static final /* data */ class Style implements android.os.Parcelable {

        @org.jetbrains.annotations.NotNull
        public static final android.os.Parcelable.Creator<com.truecaller.ads.keywords.model.AdCampaign.Style> CREATOR = new java.lang.Object();
        public final int a;
        public final int b;
        public final int c;
        public final int d;
        public final java.lang.String e;
        public final java.lang.String f;

        public Style(java.lang.String str, java.lang.String str2, int i, int i2, int i3, int i4) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
            this.e = str;
            this.f = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof com.truecaller.ads.keywords.model.AdCampaign.Style)) {
                return false;
            }
            com.truecaller.ads.keywords.model.AdCampaign.Style style = (com.truecaller.ads.keywords.model.AdCampaign.Style) obj;
            return this.a == style.a && this.b == style.b && this.c == style.c && this.d == style.d && kotlin.jvm.internal.Intrinsics.b(this.e, style.e) && kotlin.jvm.internal.Intrinsics.b(this.f, style.f);
        }

        public final int hashCode() {
            int i = ((((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d) * 31;
            java.lang.String str = this.e;
            int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
            java.lang.String str2 = this.f;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder e = z0.a0.e(this.a, this.b, "Style(mainColor=", ", lightColor=", ", buttonColor=");
            os0.bar.A(this.c, this.d, ", bannerBackgroundColor=", ", imageUrl=", e);
            return bar.x(e, this.e, ", brandName=", this.f, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int i) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "dest");
            parcel.writeInt(this.a);
            parcel.writeInt(this.b);
            parcel.writeInt(this.c);
            parcel.writeInt(this.d);
            parcel.writeString(this.e);
            parcel.writeString(this.f);
        }
    }

    public AdCampaign(java.lang.String str, com.truecaller.ads.keywords.model.AdCampaign.Style style, com.truecaller.ads.keywords.model.AdCampaign.CtaStyle ctaStyle) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "campaignId");
        this.a = str;
        this.b = style;
        this.c = ctaStyle;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.truecaller.ads.keywords.model.AdCampaign)) {
            return false;
        }
        com.truecaller.ads.keywords.model.AdCampaign adCampaign = (com.truecaller.ads.keywords.model.AdCampaign) obj;
        return kotlin.jvm.internal.Intrinsics.b(this.a, adCampaign.a) && kotlin.jvm.internal.Intrinsics.b(this.b, adCampaign.b) && kotlin.jvm.internal.Intrinsics.b(this.c, adCampaign.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        com.truecaller.ads.keywords.model.AdCampaign.Style style = this.b;
        int hashCode2 = (hashCode + (style == null ? 0 : style.hashCode())) * 31;
        com.truecaller.ads.keywords.model.AdCampaign.CtaStyle ctaStyle = this.c;
        return hashCode2 + (ctaStyle != null ? ctaStyle.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "AdCampaign(campaignId=" + this.a + ", style=" + this.b + ", ctaStyle=" + this.c + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "dest");
        parcel.writeString(this.a);
        com.truecaller.ads.keywords.model.AdCampaign.Style style = this.b;
        if (style == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            style.writeToParcel(parcel, i);
        }
        com.truecaller.ads.keywords.model.AdCampaign.CtaStyle ctaStyle = this.c;
        if (ctaStyle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            ctaStyle.writeToParcel(parcel, i);
        }
    }
}
