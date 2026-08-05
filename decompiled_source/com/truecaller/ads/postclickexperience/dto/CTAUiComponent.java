package com.truecaller.ads.postclickexperience.dto;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/truecaller/ads/postclickexperience/dto/CTAUiComponent;", "Lcom/truecaller/ads/postclickexperience/dto/UiComponent;", "Landroid/os/Parcelable;", "ads-legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class CTAUiComponent extends com.truecaller.ads.postclickexperience.dto.UiComponent implements android.os.Parcelable {

    @org.jetbrains.annotations.NotNull
    public static final android.os.Parcelable.Creator<com.truecaller.ads.postclickexperience.dto.CTAUiComponent> CREATOR = new hn.bar(29);
    public final java.lang.String b;
    public final java.util.ArrayList c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CTAUiComponent(java.lang.String str, java.util.ArrayList arrayList) {
        super(str);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.TYPE_COLUMN);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(arrayList, "ctaComponents");
        this.b = str;
        this.c = arrayList;
    }

    @Override // com.truecaller.ads.postclickexperience.dto.UiComponent
    /* renamed from: a, reason: from getter */
    public final java.lang.String getB() {
        return this.b;
    }

    @Override // com.truecaller.ads.postclickexperience.dto.UiComponent, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.truecaller.ads.postclickexperience.dto.CTAUiComponent)) {
            return false;
        }
        com.truecaller.ads.postclickexperience.dto.CTAUiComponent cTAUiComponent = (com.truecaller.ads.postclickexperience.dto.CTAUiComponent) obj;
        return kotlin.jvm.internal.Intrinsics.b(this.b, cTAUiComponent.b) && kotlin.jvm.internal.Intrinsics.b(this.c, cTAUiComponent.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final java.lang.String toString() {
        return "CTAUiComponent(type=" + this.b + ", ctaComponents=" + this.c + ")";
    }

    @Override // com.truecaller.ads.postclickexperience.dto.UiComponent, android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "dest");
        parcel.writeString(this.b);
        java.util.ArrayList arrayList = this.c;
        parcel.writeInt(arrayList.size());
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            parcel.writeParcelable((android.os.Parcelable) it.next(), i);
        }
    }
}
