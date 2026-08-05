package com.truecaller.call_assistant.campaigns.deeplinks.external;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/truecaller/call_assistant/campaigns/deeplinks/external/AssistantCampaignInfo;", "Landroid/os/Parcelable;", "campaigns_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class AssistantCampaignInfo implements android.os.Parcelable {

    @org.jetbrains.annotations.NotNull
    public static final android.os.Parcelable.Creator<com.truecaller.call_assistant.campaigns.deeplinks.external.AssistantCampaignInfo> CREATOR = new ks2.bar(7);
    public final java.lang.String a;
    public final com.truecaller.call_assistant.campaigns.data.CampaignViewType b;
    public final java.lang.String c;

    public AssistantCampaignInfo(java.lang.String str, com.truecaller.call_assistant.campaigns.data.CampaignViewType campaignViewType, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "campaignId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(campaignViewType, "viewType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "viewId");
        this.a = str;
        this.b = campaignViewType;
        this.c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.truecaller.call_assistant.campaigns.deeplinks.external.AssistantCampaignInfo)) {
            return false;
        }
        com.truecaller.call_assistant.campaigns.deeplinks.external.AssistantCampaignInfo assistantCampaignInfo = (com.truecaller.call_assistant.campaigns.deeplinks.external.AssistantCampaignInfo) obj;
        return kotlin.jvm.internal.Intrinsics.b(this.a, assistantCampaignInfo.a) && this.b == assistantCampaignInfo.b && kotlin.jvm.internal.Intrinsics.b(this.c, assistantCampaignInfo.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AssistantCampaignInfo(campaignId=");
        sb.append(this.a);
        sb.append(", viewType=");
        sb.append(this.b);
        sb.append(", viewId=");
        return bar.v(this.c, ")", sb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "dest");
        parcel.writeString(this.a);
        parcel.writeString(this.b.name());
        parcel.writeString(this.c);
    }
}
