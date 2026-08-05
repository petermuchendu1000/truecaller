package com.truecaller.ads.postclickexperience.dto;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class c implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "parcel");
        return new com.truecaller.ads.postclickexperience.dto.HtmlPageUiComponent.OnClick(parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final java.lang.Object[] newArray(int i) {
        return new com.truecaller.ads.postclickexperience.dto.HtmlPageUiComponent.OnClick[i];
    }
}
