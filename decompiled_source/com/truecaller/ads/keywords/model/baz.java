package com.truecaller.ads.keywords.model;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class baz implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "parcel");
        return new com.truecaller.ads.keywords.model.AdCampaign.CtaStyle(parcel.readInt(), parcel.readInt());
    }

    @Override // android.os.Parcelable.Creator
    public final java.lang.Object[] newArray(int i) {
        return new com.truecaller.ads.keywords.model.AdCampaign.CtaStyle[i];
    }
}
