package com.truecaller.ads.postclickexperience.dto;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/truecaller/ads/postclickexperience/dto/ImageItemUiComponent;", "Lcom/truecaller/ads/postclickexperience/dto/UiComponent;", "Landroid/os/Parcelable;", "ads-legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class ImageItemUiComponent extends com.truecaller.ads.postclickexperience.dto.UiComponent implements android.os.Parcelable {

    @org.jetbrains.annotations.NotNull
    public static final android.os.Parcelable.Creator<com.truecaller.ads.postclickexperience.dto.ImageItemUiComponent> CREATOR = new k90.bar(2);
    public final java.lang.String b;
    public final android.net.Uri c;
    public final java.lang.String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageItemUiComponent(android.net.Uri uri, java.lang.String str, java.lang.String str2) {
        super(str);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.TYPE_COLUMN);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri, "src");
        this.b = str;
        this.c = uri;
        this.d = str2;
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
        if (!(obj instanceof com.truecaller.ads.postclickexperience.dto.ImageItemUiComponent)) {
            return false;
        }
        com.truecaller.ads.postclickexperience.dto.ImageItemUiComponent imageItemUiComponent = (com.truecaller.ads.postclickexperience.dto.ImageItemUiComponent) obj;
        return kotlin.jvm.internal.Intrinsics.b(this.b, imageItemUiComponent.b) && kotlin.jvm.internal.Intrinsics.b(this.c, imageItemUiComponent.c) && kotlin.jvm.internal.Intrinsics.b(this.d, imageItemUiComponent.d);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + (this.b.hashCode() * 31)) * 31;
        java.lang.String str = this.d;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ImageItemUiComponent(type=");
        sb.append(this.b);
        sb.append(", src=");
        sb.append(this.c);
        sb.append(", altText=");
        return bar.v(this.d, ")", sb);
    }

    @Override // com.truecaller.ads.postclickexperience.dto.UiComponent, android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "dest");
        parcel.writeString(this.b);
        parcel.writeParcelable(this.c, i);
        parcel.writeString(this.d);
    }
}
