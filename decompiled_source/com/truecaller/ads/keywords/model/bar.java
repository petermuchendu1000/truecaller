package com.truecaller.ads.keywords.model;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class bar implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final java.lang.Object createFromParcel(android.os.Parcel parcel) {
        com.truecaller.ads.keywords.model.AdCampaign.Style createFromParcel;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "parcel");
        java.lang.String readString = parcel.readString();
        com.truecaller.ads.keywords.model.AdCampaign.CtaStyle ctaStyle = null;
        if (parcel.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = com.truecaller.ads.keywords.model.AdCampaign.Style.CREATOR.createFromParcel(parcel);
        }
        com.truecaller.ads.keywords.model.AdCampaign.Style style = createFromParcel;
        if (parcel.readInt() != 0) {
            ctaStyle = com.truecaller.ads.keywords.model.AdCampaign.CtaStyle.CREATOR.createFromParcel(parcel);
        }
        return new com.truecaller.ads.keywords.model.AdCampaign(readString, style, ctaStyle);
    }

    @Override // android.os.Parcelable.Creator
    public final java.lang.Object[] newArray(int i) {
        return new com.truecaller.ads.keywords.model.AdCampaign[i];
    }
}
