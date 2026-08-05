package com.truecaller.ads.adsrouter.model;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001R\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\"\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0005\u001a\u0004\b\u000e\u0010\u0007R\"\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0005\u001a\u0004\b\u0010\u0010\u0007R\"\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0005\u001a\u0004\b\u0004\u0010\u0007¨\u0006\u0014"}, d2 = {"Lcom/truecaller/ads/adsrouter/model/VastAdConfig;", "Landroid/os/Parcelable;", "", "", "a", "Ljava/util/List;", "c", "()Ljava/util/List;", "impUrl", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "errorUrl", "Lcom/truecaller/ads/vast/Tracking;", "d", "trackingEvents", "e", "videoClicks", "Lcom/truecaller/ads/vast/Verification;", "adVerifications", "ads-legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class VastAdConfig implements android.os.Parcelable {

    @org.jetbrains.annotations.NotNull
    public static final android.os.Parcelable.Creator<com.truecaller.ads.adsrouter.model.VastAdConfig> CREATOR = new y02.t(21);

    /* renamed from: a, reason: from kotlin metadata */
    @bw.qux("impUrl")
    @org.jetbrains.annotations.Nullable
    private final java.util.List<java.lang.String> impUrl;

    /* renamed from: b, reason: from kotlin metadata */
    @bw.qux("errorUrl")
    @org.jetbrains.annotations.Nullable
    private final java.lang.String errorUrl;

    /* renamed from: c, reason: from kotlin metadata */
    @bw.qux("trackingEvents")
    @org.jetbrains.annotations.Nullable
    private final java.util.List<com.truecaller.ads.vast.Tracking> trackingEvents;

    /* renamed from: d, reason: from kotlin metadata */
    @bw.qux("videoClicks")
    @org.jetbrains.annotations.Nullable
    private final java.util.List<java.lang.String> videoClicks;

    /* renamed from: e, reason: from kotlin metadata */
    @bw.qux("adVerifications")
    @org.jetbrains.annotations.Nullable
    private final java.util.List<com.truecaller.ads.vast.Verification> adVerifications;

    public VastAdConfig(java.util.List list, java.lang.String str, java.util.List list2, java.util.List list3, java.util.List list4) {
        this.impUrl = list;
        this.errorUrl = str;
        this.trackingEvents = list2;
        this.videoClicks = list3;
        this.adVerifications = list4;
    }

    /* renamed from: a, reason: from getter */
    public final java.util.List getAdVerifications() {
        return this.adVerifications;
    }

    /* renamed from: b, reason: from getter */
    public final java.lang.String getErrorUrl() {
        return this.errorUrl;
    }

    /* renamed from: c, reason: from getter */
    public final java.util.List getImpUrl() {
        return this.impUrl;
    }

    /* renamed from: d, reason: from getter */
    public final java.util.List getTrackingEvents() {
        return this.trackingEvents;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* renamed from: e, reason: from getter */
    public final java.util.List getVideoClicks() {
        return this.videoClicks;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.truecaller.ads.adsrouter.model.VastAdConfig)) {
            return false;
        }
        com.truecaller.ads.adsrouter.model.VastAdConfig vastAdConfig = (com.truecaller.ads.adsrouter.model.VastAdConfig) obj;
        return kotlin.jvm.internal.Intrinsics.b(this.impUrl, vastAdConfig.impUrl) && kotlin.jvm.internal.Intrinsics.b(this.errorUrl, vastAdConfig.errorUrl) && kotlin.jvm.internal.Intrinsics.b(this.trackingEvents, vastAdConfig.trackingEvents) && kotlin.jvm.internal.Intrinsics.b(this.videoClicks, vastAdConfig.videoClicks) && kotlin.jvm.internal.Intrinsics.b(this.adVerifications, vastAdConfig.adVerifications);
    }

    public final int hashCode() {
        java.util.List<java.lang.String> list = this.impUrl;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        java.lang.String str = this.errorUrl;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        java.util.List<com.truecaller.ads.vast.Tracking> list2 = this.trackingEvents;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        java.util.List<java.lang.String> list3 = this.videoClicks;
        int hashCode4 = (hashCode3 + (list3 == null ? 0 : list3.hashCode())) * 31;
        java.util.List<com.truecaller.ads.vast.Verification> list4 = this.adVerifications;
        return hashCode4 + (list4 != null ? list4.hashCode() : 0);
    }

    public final java.lang.String toString() {
        java.util.List<java.lang.String> list = this.impUrl;
        java.lang.String str = this.errorUrl;
        java.util.List<com.truecaller.ads.vast.Tracking> list2 = this.trackingEvents;
        java.util.List<java.lang.String> list3 = this.videoClicks;
        java.util.List<com.truecaller.ads.vast.Verification> list4 = this.adVerifications;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("VastAdConfig(impUrl=");
        sb.append(list);
        sb.append(", errorUrl=");
        sb.append(str);
        sb.append(", trackingEvents=");
        com.ironsource.adqualitysdk.sdk.i.bar.y(sb, list2, ", videoClicks=", list3, ", adVerifications=");
        return y.o.g(sb, list4, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "dest");
        parcel.writeStringList(this.impUrl);
        parcel.writeString(this.errorUrl);
        java.util.List<com.truecaller.ads.vast.Tracking> list = this.trackingEvents;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            java.util.Iterator<com.truecaller.ads.vast.Tracking> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeStringList(this.videoClicks);
        java.util.List<com.truecaller.ads.vast.Verification> list2 = this.adVerifications;
        if (list2 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list2.size());
        java.util.Iterator<com.truecaller.ads.vast.Verification> it2 = list2.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
    }
}
