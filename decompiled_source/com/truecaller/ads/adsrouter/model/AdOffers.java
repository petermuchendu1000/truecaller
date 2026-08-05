package com.truecaller.ads.adsrouter.model;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003J9\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0006\u0010\u0015\u001a\u00020\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0016HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0016R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\""}, d2 = {"Lcom/truecaller/ads/adsrouter/model/AdOffers;", "Landroid/os/Parcelable;", "params", "", "eventPixel", "title", "offersTemplate", "Lcom/truecaller/ads/adsrouter/model/AdOffersTemplate;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/truecaller/ads/adsrouter/model/AdOffersTemplate;)V", "getParams", "()Ljava/lang/String;", "getEventPixel", "getTitle", "getOffersTemplate", "()Lcom/truecaller/ads/adsrouter/model/AdOffersTemplate;", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ads-legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class AdOffers implements android.os.Parcelable {
    public static final int $stable = 0;

    @org.jetbrains.annotations.NotNull
    public static final android.os.Parcelable.Creator<com.truecaller.ads.adsrouter.model.AdOffers> CREATOR = new y02.t(6);

    @org.jetbrains.annotations.Nullable
    private final java.lang.String eventPixel;

    @bw.qux("templateType")
    @org.jetbrains.annotations.Nullable
    private final com.truecaller.ads.adsrouter.model.AdOffersTemplate offersTemplate;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String params;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String title;

    public AdOffers() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ com.truecaller.ads.adsrouter.model.AdOffers copy$default(com.truecaller.ads.adsrouter.model.AdOffers adOffers, java.lang.String str, java.lang.String str2, java.lang.String str3, com.truecaller.ads.adsrouter.model.AdOffersTemplate adOffersTemplate, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = adOffers.params;
        }
        if ((i & 2) != 0) {
            str2 = adOffers.eventPixel;
        }
        if ((i & 4) != 0) {
            str3 = adOffers.title;
        }
        if ((i & 8) != 0) {
            adOffersTemplate = adOffers.offersTemplate;
        }
        return adOffers.copy(str, str2, str3, adOffersTemplate);
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component1, reason: from getter */
    public final java.lang.String getParams() {
        return this.params;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component2, reason: from getter */
    public final java.lang.String getEventPixel() {
        return this.eventPixel;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component3, reason: from getter */
    public final java.lang.String getTitle() {
        return this.title;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component4, reason: from getter */
    public final com.truecaller.ads.adsrouter.model.AdOffersTemplate getOffersTemplate() {
        return this.offersTemplate;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.ads.adsrouter.model.AdOffers copy(@org.jetbrains.annotations.Nullable java.lang.String params, @org.jetbrains.annotations.Nullable java.lang.String eventPixel, @org.jetbrains.annotations.Nullable java.lang.String title, @org.jetbrains.annotations.Nullable com.truecaller.ads.adsrouter.model.AdOffersTemplate offersTemplate) {
        return new com.truecaller.ads.adsrouter.model.AdOffers(params, eventPixel, title, offersTemplate);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.ads.adsrouter.model.AdOffers)) {
            return false;
        }
        com.truecaller.ads.adsrouter.model.AdOffers adOffers = (com.truecaller.ads.adsrouter.model.AdOffers) other;
        return kotlin.jvm.internal.Intrinsics.b(this.params, adOffers.params) && kotlin.jvm.internal.Intrinsics.b(this.eventPixel, adOffers.eventPixel) && kotlin.jvm.internal.Intrinsics.b(this.title, adOffers.title) && this.offersTemplate == adOffers.offersTemplate;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getEventPixel() {
        return this.eventPixel;
    }

    @org.jetbrains.annotations.Nullable
    public final com.truecaller.ads.adsrouter.model.AdOffersTemplate getOffersTemplate() {
        return this.offersTemplate;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getParams() {
        return this.params;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getTitle() {
        return this.title;
    }

    public int hashCode() {
        java.lang.String str = this.params;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.lang.String str2 = this.eventPixel;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.title;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        com.truecaller.ads.adsrouter.model.AdOffersTemplate adOffersTemplate = this.offersTemplate;
        return hashCode3 + (adOffersTemplate != null ? adOffersTemplate.hashCode() : 0);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        java.lang.String str = this.params;
        java.lang.String str2 = this.eventPixel;
        java.lang.String str3 = this.title;
        com.truecaller.ads.adsrouter.model.AdOffersTemplate adOffersTemplate = this.offersTemplate;
        java.lang.StringBuilder E = ro0.f.E("AdOffers(params=", str, ", eventPixel=", str2, ", title=");
        E.append(str3);
        E.append(", offersTemplate=");
        E.append(adOffersTemplate);
        E.append(")");
        return E.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@org.jetbrains.annotations.NotNull android.os.Parcel dest, int flags) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.params);
        dest.writeString(this.eventPixel);
        dest.writeString(this.title);
        com.truecaller.ads.adsrouter.model.AdOffersTemplate adOffersTemplate = this.offersTemplate;
        if (adOffersTemplate == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(adOffersTemplate.name());
        }
    }

    public AdOffers(@org.jetbrains.annotations.Nullable java.lang.String str, @org.jetbrains.annotations.Nullable java.lang.String str2, @org.jetbrains.annotations.Nullable java.lang.String str3, @org.jetbrains.annotations.Nullable com.truecaller.ads.adsrouter.model.AdOffersTemplate adOffersTemplate) {
        this.params = str;
        this.eventPixel = str2;
        this.title = str3;
        this.offersTemplate = adOffersTemplate;
    }

    public /* synthetic */ AdOffers(java.lang.String str, java.lang.String str2, java.lang.String str3, com.truecaller.ads.adsrouter.model.AdOffersTemplate adOffersTemplate, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : adOffersTemplate);
    }
}
