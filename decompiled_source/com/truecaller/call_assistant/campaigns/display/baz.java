package com.truecaller.call_assistant.campaigns.display;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class baz implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final java.lang.Object createFromParcel(android.os.Parcel parcel) {
        boolean z;
        boolean z2;
        boolean z3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "parcel");
        java.lang.String readString = parcel.readString();
        java.lang.String readString2 = parcel.readString();
        com.truecaller.call_assistant.campaigns.display.AssistantCampaignViewImageData createFromParcel = com.truecaller.call_assistant.campaigns.display.AssistantCampaignViewImageData.CREATOR.createFromParcel(parcel);
        java.lang.String readString3 = parcel.readString();
        java.lang.String readString4 = parcel.readString();
        com.truecaller.call_assistant.campaigns.display.AssistantCampaignViewButtonData createFromParcel2 = com.truecaller.call_assistant.campaigns.display.AssistantCampaignViewButtonData.CREATOR.createFromParcel(parcel);
        boolean z4 = false;
        if (parcel.readInt() != 0) {
            z = false;
            z4 = true;
            z2 = true;
        } else {
            z = false;
            z2 = true;
        }
        java.lang.String readString5 = parcel.readString();
        boolean z5 = z2;
        java.lang.String readString6 = parcel.readString();
        if (parcel.readInt() != 0) {
            z3 = z5;
        } else {
            z3 = z5;
            z5 = z;
        }
        if (parcel.readInt() == 0) {
            z3 = z;
        }
        return new com.truecaller.call_assistant.campaigns.display.AssistantCampaignViewDisplayData.Interstitial(readString, readString2, createFromParcel, readString3, readString4, createFromParcel2, z4, readString5, readString6, z5, z3);
    }

    @Override // android.os.Parcelable.Creator
    public final java.lang.Object[] newArray(int i) {
        return new com.truecaller.call_assistant.campaigns.display.AssistantCampaignViewDisplayData.Interstitial[i];
    }
}
