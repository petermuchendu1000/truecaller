package com.truecaller.call_assistant.campaigns.display;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class bar implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final java.lang.Object createFromParcel(android.os.Parcel parcel) {
        com.truecaller.call_assistant.campaigns.display.AssistantCampaignViewButtonData createFromParcel;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "parcel");
        java.lang.String readString = parcel.readString();
        java.lang.String readString2 = parcel.readString();
        com.truecaller.call_assistant.campaigns.display.AssistantCampaignViewImageData createFromParcel2 = com.truecaller.call_assistant.campaigns.display.AssistantCampaignViewImageData.CREATOR.createFromParcel(parcel);
        java.lang.String readString3 = parcel.readString();
        java.lang.String readString4 = parcel.readString();
        android.os.Parcelable.Creator<com.truecaller.call_assistant.campaigns.display.AssistantCampaignViewButtonData> creator = com.truecaller.call_assistant.campaigns.display.AssistantCampaignViewButtonData.CREATOR;
        com.truecaller.call_assistant.campaigns.display.AssistantCampaignViewButtonData createFromParcel3 = creator.createFromParcel(parcel);
        if (parcel.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = creator.createFromParcel(parcel);
        }
        return new com.truecaller.call_assistant.campaigns.display.AssistantCampaignViewDisplayData.Banner(readString, readString2, createFromParcel2, readString3, readString4, createFromParcel3, createFromParcel, com.truecaller.call_assistant.campaigns.display.AssistantCampaignViewBackgroundColor.CREATOR.createFromParcel(parcel));
    }

    @Override // android.os.Parcelable.Creator
    public final java.lang.Object[] newArray(int i) {
        return new com.truecaller.call_assistant.campaigns.display.AssistantCampaignViewDisplayData.Banner[i];
    }
}
