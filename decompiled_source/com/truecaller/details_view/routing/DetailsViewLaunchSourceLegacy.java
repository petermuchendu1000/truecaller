package com.truecaller.details_view.routing;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/truecaller/details_view/routing/DetailsViewLaunchSourceLegacy;", "Landroid/os/Parcelable;", "details-view_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final /* data */ class DetailsViewLaunchSourceLegacy implements android.os.Parcelable {

    @org.jetbrains.annotations.NotNull
    public static final android.os.Parcelable.Creator<com.truecaller.details_view.routing.DetailsViewLaunchSourceLegacy> CREATOR = new hn.bar(11);
    public final com.truecaller.details_view.analytics.SourceType a;
    public final java.lang.String b;

    public DetailsViewLaunchSourceLegacy(com.truecaller.details_view.analytics.SourceType sourceType, java.lang.String str) {
        this.a = sourceType;
        this.b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.truecaller.details_view.routing.DetailsViewLaunchSourceLegacy)) {
            return false;
        }
        com.truecaller.details_view.routing.DetailsViewLaunchSourceLegacy detailsViewLaunchSourceLegacy = (com.truecaller.details_view.routing.DetailsViewLaunchSourceLegacy) obj;
        return this.a == detailsViewLaunchSourceLegacy.a && kotlin.jvm.internal.Intrinsics.b(this.b, detailsViewLaunchSourceLegacy.b);
    }

    public final int hashCode() {
        com.truecaller.details_view.analytics.SourceType sourceType = this.a;
        int hashCode = (sourceType == null ? 0 : sourceType.hashCode()) * 31;
        java.lang.String str = this.b;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "DetailsViewLaunchSourceLegacy(sourceType=" + this.a + ", action=" + this.b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "dest");
        com.truecaller.details_view.analytics.SourceType sourceType = this.a;
        if (sourceType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(sourceType.name());
        }
        parcel.writeString(this.b);
    }
}
