package com.truecaller.ads.keywords.model;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/truecaller/ads/keywords/model/AdCampaigns;", "Landroid/os/Parcelable;", "ads-legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class AdCampaigns implements android.os.Parcelable {

    @org.jetbrains.annotations.NotNull
    public static final android.os.Parcelable.Creator<com.truecaller.ads.keywords.model.AdCampaigns> CREATOR = new hn.bar(10);
    public final java.lang.String a;
    public final java.util.List b;
    public final long c;

    public AdCampaigns(java.util.List list, long j, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "placement");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "campaigns");
        this.a = str;
        this.b = list;
        this.c = j;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.truecaller.ads.keywords.model.AdCampaigns)) {
            return false;
        }
        com.truecaller.ads.keywords.model.AdCampaigns adCampaigns = (com.truecaller.ads.keywords.model.AdCampaigns) obj;
        return kotlin.jvm.internal.Intrinsics.b(this.a, adCampaigns.a) && kotlin.jvm.internal.Intrinsics.b(this.b, adCampaigns.b) && this.c == adCampaigns.c;
    }

    public final int hashCode() {
        int g = uf.qux.g(this.a.hashCode() * 31, 31, this.b);
        long j = this.c;
        return g + ((int) (j ^ (j >>> 32)));
    }

    public final java.lang.String toString() {
        return bar.n(this.c, ")", com.appsflyer.internal.e.r("AdCampaigns(placement=", this.a, ", campaigns=", this.b, ", expiresAt="));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "dest");
        parcel.writeString(this.a);
        java.util.Iterator f = z0.a0.f(this.b, parcel);
        while (f.hasNext()) {
            ((com.truecaller.ads.keywords.model.AdCampaign) f.next()).writeToParcel(parcel, i);
        }
        parcel.writeLong(this.c);
    }
}
