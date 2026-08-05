package com.truecaller.ads.postclickexperience.dto;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/truecaller/ads/postclickexperience/dto/UiConfigViewDto;", "Landroid/os/Parcelable;", "ads-legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class UiConfigViewDto implements android.os.Parcelable {

    @org.jetbrains.annotations.NotNull
    public static final android.os.Parcelable.Creator<com.truecaller.ads.postclickexperience.dto.UiConfigViewDto> CREATOR = new k90.bar(14);
    public final java.util.ArrayList a;

    public UiConfigViewDto(java.util.ArrayList arrayList) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(arrayList, "components");
        this.a = arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            if (!(obj instanceof com.truecaller.ads.postclickexperience.dto.UiConfigViewDto) || !this.a.equals(((com.truecaller.ads.postclickexperience.dto.UiConfigViewDto) obj).a)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return bx.e1.q("UiConfigViewDto(components=", ")", this.a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "dest");
        java.util.ArrayList arrayList = this.a;
        parcel.writeInt(arrayList.size());
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            parcel.writeParcelable((android.os.Parcelable) it.next(), i);
        }
    }
}
