package com.truecaller.ads.adsrouter.ui.offers;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\tHÆ\u0003JM\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0006\u0010\u001b\u001a\u00020\u001cJ\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\u001cHÖ\u0001J\t\u0010\"\u001a\u00020\tHÖ\u0001J\u0016\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u001cR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013¨\u0006("}, d2 = {"Lcom/truecaller/ads/adsrouter/ui/offers/OfferConfig;", "Landroid/os/Parcelable;", "offers", "Lcom/truecaller/ads/adsrouter/model/AdOffers;", "usedAds", "", "Lcom/truecaller/ads/adsrouter/model/App;", "ads", "placement", "", "campaignId", "<init>", "(Lcom/truecaller/ads/adsrouter/model/AdOffers;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "getOffers", "()Lcom/truecaller/ads/adsrouter/model/AdOffers;", "getUsedAds", "()Ljava/util/List;", "getAds", "getPlacement", "()Ljava/lang/String;", "getCampaignId", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ads-legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class OfferConfig implements android.os.Parcelable {
    public static final int $stable = 8;

    @org.jetbrains.annotations.NotNull
    public static final android.os.Parcelable.Creator<com.truecaller.ads.adsrouter.ui.offers.OfferConfig> CREATOR = new ks2.bar(14);

    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.truecaller.ads.adsrouter.model.App> ads;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String campaignId;

    @org.jetbrains.annotations.NotNull
    private final com.truecaller.ads.adsrouter.model.AdOffers offers;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String placement;

    @org.jetbrains.annotations.Nullable
    private final java.util.List<com.truecaller.ads.adsrouter.model.App> usedAds;

    public OfferConfig(@org.jetbrains.annotations.NotNull com.truecaller.ads.adsrouter.model.AdOffers adOffers, @org.jetbrains.annotations.Nullable java.util.List<com.truecaller.ads.adsrouter.model.App> list, @org.jetbrains.annotations.NotNull java.util.List<com.truecaller.ads.adsrouter.model.App> list2, @org.jetbrains.annotations.Nullable java.lang.String str, @org.jetbrains.annotations.Nullable java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adOffers, "offers");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "ads");
        this.offers = adOffers;
        this.usedAds = list;
        this.ads = list2;
        this.placement = str;
        this.campaignId = str2;
    }

    public static /* synthetic */ com.truecaller.ads.adsrouter.ui.offers.OfferConfig copy$default(com.truecaller.ads.adsrouter.ui.offers.OfferConfig offerConfig, com.truecaller.ads.adsrouter.model.AdOffers adOffers, java.util.List list, java.util.List list2, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            adOffers = offerConfig.offers;
        }
        if ((i & 2) != 0) {
            list = offerConfig.usedAds;
        }
        if ((i & 4) != 0) {
            list2 = offerConfig.ads;
        }
        if ((i & 8) != 0) {
            str = offerConfig.placement;
        }
        if ((i & 16) != 0) {
            str2 = offerConfig.campaignId;
        }
        java.lang.String str3 = str2;
        java.util.List list3 = list2;
        return offerConfig.copy(adOffers, list, list3, str, str3);
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component1, reason: from getter */
    public final com.truecaller.ads.adsrouter.model.AdOffers getOffers() {
        return this.offers;
    }

    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.truecaller.ads.adsrouter.model.App> component2() {
        return this.usedAds;
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.truecaller.ads.adsrouter.model.App> component3() {
        return this.ads;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component4, reason: from getter */
    public final java.lang.String getPlacement() {
        return this.placement;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component5, reason: from getter */
    public final java.lang.String getCampaignId() {
        return this.campaignId;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.ads.adsrouter.ui.offers.OfferConfig copy(@org.jetbrains.annotations.NotNull com.truecaller.ads.adsrouter.model.AdOffers offers, @org.jetbrains.annotations.Nullable java.util.List<com.truecaller.ads.adsrouter.model.App> usedAds, @org.jetbrains.annotations.NotNull java.util.List<com.truecaller.ads.adsrouter.model.App> ads, @org.jetbrains.annotations.Nullable java.lang.String placement, @org.jetbrains.annotations.Nullable java.lang.String campaignId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(offers, "offers");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ads, "ads");
        return new com.truecaller.ads.adsrouter.ui.offers.OfferConfig(offers, usedAds, ads, placement, campaignId);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.ads.adsrouter.ui.offers.OfferConfig)) {
            return false;
        }
        com.truecaller.ads.adsrouter.ui.offers.OfferConfig offerConfig = (com.truecaller.ads.adsrouter.ui.offers.OfferConfig) other;
        return kotlin.jvm.internal.Intrinsics.b(this.offers, offerConfig.offers) && kotlin.jvm.internal.Intrinsics.b(this.usedAds, offerConfig.usedAds) && kotlin.jvm.internal.Intrinsics.b(this.ads, offerConfig.ads) && kotlin.jvm.internal.Intrinsics.b(this.placement, offerConfig.placement) && kotlin.jvm.internal.Intrinsics.b(this.campaignId, offerConfig.campaignId);
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.truecaller.ads.adsrouter.model.App> getAds() {
        return this.ads;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getCampaignId() {
        return this.campaignId;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.ads.adsrouter.model.AdOffers getOffers() {
        return this.offers;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getPlacement() {
        return this.placement;
    }

    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.truecaller.ads.adsrouter.model.App> getUsedAds() {
        return this.usedAds;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = this.offers.hashCode() * 31;
        java.util.List<com.truecaller.ads.adsrouter.model.App> list = this.usedAds;
        int i = 0;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        int g = uf.qux.g((hashCode3 + hashCode) * 31, 31, this.ads);
        java.lang.String str = this.placement;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i2 = (g + hashCode2) * 31;
        java.lang.String str2 = this.campaignId;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return i2 + i;
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        com.truecaller.ads.adsrouter.model.AdOffers adOffers = this.offers;
        java.util.List<com.truecaller.ads.adsrouter.model.App> list = this.usedAds;
        java.util.List<com.truecaller.ads.adsrouter.model.App> list2 = this.ads;
        java.lang.String str = this.placement;
        java.lang.String str2 = this.campaignId;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("OfferConfig(offers=");
        sb.append(adOffers);
        sb.append(", usedAds=");
        sb.append(list);
        sb.append(", ads=");
        os0.bar.B(", placement=", str, ", campaignId=", sb, list2);
        return bar.v(str2, ")", sb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@org.jetbrains.annotations.NotNull android.os.Parcel dest, int flags) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dest, "dest");
        this.offers.writeToParcel(dest, flags);
        java.util.List<com.truecaller.ads.adsrouter.model.App> list = this.usedAds;
        if (list == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(list.size());
            java.util.Iterator<com.truecaller.ads.adsrouter.model.App> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(dest, flags);
            }
        }
        java.util.Iterator f = z0.a0.f(this.ads, dest);
        while (f.hasNext()) {
            ((com.truecaller.ads.adsrouter.model.App) f.next()).writeToParcel(dest, flags);
        }
        dest.writeString(this.placement);
        dest.writeString(this.campaignId);
    }

    public /* synthetic */ OfferConfig(com.truecaller.ads.adsrouter.model.AdOffers adOffers, java.util.List list, java.util.List list2, java.lang.String str, java.lang.String str2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(adOffers, (i & 2) != 0 ? null : list, list2, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : str2);
    }
}
