package com.truecaller.call_assistant.campaigns.display;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/truecaller/call_assistant/campaigns/display/AssistantCampaignViewButtonData;", "Landroid/os/Parcelable;", "campaigns_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class AssistantCampaignViewButtonData implements android.os.Parcelable {

    @org.jetbrains.annotations.NotNull
    public static final android.os.Parcelable.Creator<com.truecaller.call_assistant.campaigns.display.AssistantCampaignViewButtonData> CREATOR = new om0.bar(1);
    public final java.lang.String a;
    public final java.lang.String b;
    public final java.lang.String c;
    public final java.lang.String d;

    public AssistantCampaignViewButtonData(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "text");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "url");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.truecaller.call_assistant.campaigns.display.AssistantCampaignViewButtonData)) {
            return false;
        }
        com.truecaller.call_assistant.campaigns.display.AssistantCampaignViewButtonData assistantCampaignViewButtonData = (com.truecaller.call_assistant.campaigns.display.AssistantCampaignViewButtonData) obj;
        return kotlin.jvm.internal.Intrinsics.b(this.a, assistantCampaignViewButtonData.a) && kotlin.jvm.internal.Intrinsics.b(this.b, assistantCampaignViewButtonData.b) && kotlin.jvm.internal.Intrinsics.b(this.c, assistantCampaignViewButtonData.c) && kotlin.jvm.internal.Intrinsics.b(this.d, assistantCampaignViewButtonData.d);
    }

    public final int hashCode() {
        int hashCode;
        int i = 0;
        java.lang.String str = this.a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int e = ax1.bar.e(ax1.bar.e(hashCode * 31, 31, this.b), 31, this.c);
        java.lang.String str2 = this.d;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return e + i;
    }

    public final java.lang.String toString() {
        return bar.x(ro0.f.E("AssistantCampaignViewButtonData(action=", this.a, ", text=", this.b, ", url="), this.c, ", name=", this.d, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "dest");
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
    }
}
