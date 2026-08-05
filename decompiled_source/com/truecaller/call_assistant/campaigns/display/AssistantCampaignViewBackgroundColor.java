package com.truecaller.call_assistant.campaigns.display;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/truecaller/call_assistant/campaigns/display/AssistantCampaignViewBackgroundColor;", "Landroid/os/Parcelable;", "campaigns_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class AssistantCampaignViewBackgroundColor implements android.os.Parcelable {

    @org.jetbrains.annotations.NotNull
    public static final android.os.Parcelable.Creator<com.truecaller.call_assistant.campaigns.display.AssistantCampaignViewBackgroundColor> CREATOR = new om0.bar(0);
    public final java.lang.String a;
    public final java.lang.String b;

    public AssistantCampaignViewBackgroundColor(java.lang.String str, java.lang.String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.truecaller.call_assistant.campaigns.display.AssistantCampaignViewBackgroundColor)) {
            return false;
        }
        com.truecaller.call_assistant.campaigns.display.AssistantCampaignViewBackgroundColor assistantCampaignViewBackgroundColor = (com.truecaller.call_assistant.campaigns.display.AssistantCampaignViewBackgroundColor) obj;
        return kotlin.jvm.internal.Intrinsics.b(this.a, assistantCampaignViewBackgroundColor.a) && kotlin.jvm.internal.Intrinsics.b(this.b, assistantCampaignViewBackgroundColor.b);
    }

    public final int hashCode() {
        java.lang.String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.lang.String str2 = this.b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return y.o.e("AssistantCampaignViewBackgroundColor(darkBackground=", this.a, ", lightBackground=", this.b, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "dest");
        parcel.writeString(this.a);
        parcel.writeString(this.b);
    }
}
