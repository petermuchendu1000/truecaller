package com.truecaller.call_assistant.campaigns.display;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/truecaller/call_assistant/campaigns/display/AssistantCampaignViewDisplayData;", "Landroid/os/Parcelable;", "Popup", "Banner", "Interstitial", "Lcom/truecaller/call_assistant/campaigns/display/AssistantCampaignViewDisplayData$Banner;", "Lcom/truecaller/call_assistant/campaigns/display/AssistantCampaignViewDisplayData$Interstitial;", "Lcom/truecaller/call_assistant/campaigns/display/AssistantCampaignViewDisplayData$Popup;", "campaigns_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public abstract class AssistantCampaignViewDisplayData implements android.os.Parcelable {

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/truecaller/call_assistant/campaigns/display/AssistantCampaignViewDisplayData$Banner;", "Lcom/truecaller/call_assistant/campaigns/display/AssistantCampaignViewDisplayData;", "campaigns_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes5.dex */
    public static final /* data */ class Banner extends com.truecaller.call_assistant.campaigns.display.AssistantCampaignViewDisplayData {

        @org.jetbrains.annotations.NotNull
        public static final android.os.Parcelable.Creator<com.truecaller.call_assistant.campaigns.display.AssistantCampaignViewDisplayData.Banner> CREATOR = new java.lang.Object();
        public final java.lang.String a;
        public final java.lang.String b;
        public final com.truecaller.call_assistant.campaigns.display.AssistantCampaignViewImageData c;
        public final java.lang.String d;
        public final java.lang.String e;
        public final com.truecaller.call_assistant.campaigns.display.AssistantCampaignViewButtonData f;
        public final com.truecaller.call_assistant.campaigns.display.AssistantCampaignViewButtonData g;
        public final com.truecaller.call_assistant.campaigns.display.AssistantCampaignViewBackgroundColor h;

        public Banner(java.lang.String str, java.lang.String str2, com.truecaller.call_assistant.campaigns.display.AssistantCampaignViewImageData assistantCampaignViewImageData, java.lang.String str3, java.lang.String str4, com.truecaller.call_assistant.campaigns.display.AssistantCampaignViewButtonData assistantCampaignViewButtonData, com.truecaller.call_assistant.campaigns.display.AssistantCampaignViewButtonData assistantCampaignViewButtonData2, com.truecaller.call_assistant.campaigns.display.AssistantCampaignViewBackgroundColor assistantCampaignViewBackgroundColor) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.ID_COLUMN);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "name");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(assistantCampaignViewImageData, "imageData");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "title");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "subtitle");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(assistantCampaignViewButtonData, "primaryButton");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(assistantCampaignViewBackgroundColor, "backgroundColorData");
            this.a = str;
            this.b = str2;
            this.c = assistantCampaignViewImageData;
            this.d = str3;
            this.e = str4;
            this.f = assistantCampaignViewButtonData;
            this.g = assistantCampaignViewButtonData2;
            this.h = assistantCampaignViewBackgroundColor;
        }

        @Override // com.truecaller.call_assistant.campaigns.display.AssistantCampaignViewDisplayData
        /* renamed from: a, reason: from getter */
        public final java.lang.String getA() {
            return this.a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof com.truecaller.call_assistant.campaigns.display.AssistantCampaignViewDisplayData.Banner)) {
                return false;
            }
            com.truecaller.call_assistant.campaigns.display.AssistantCampaignViewDisplayData.Banner banner = (com.truecaller.call_assistant.campaigns.display.AssistantCampaignViewDisplayData.Banner) obj;
            return kotlin.jvm.internal.Intrinsics.b(this.a, banner.a) && kotlin.jvm.internal.Intrinsics.b(this.b, banner.b) && kotlin.jvm.internal.Intrinsics.b(this.c, banner.c) && kotlin.jvm.internal.Intrinsics.b(this.d, banner.d) && kotlin.jvm.internal.Intrinsics.b(this.e, banner.e) && kotlin.jvm.internal.Intrinsics.b(this.f, banner.f) && kotlin.jvm.internal.Intrinsics.b(this.g, banner.g) && kotlin.jvm.internal.Intrinsics.b(this.h, banner.h);
        }

        public final int hashCode() {
            int hashCode;
            int hashCode2 = (this.f.hashCode() + ax1.bar.e(ax1.bar.e((this.c.hashCode() + ax1.bar.e(this.a.hashCode() * 31, 31, this.b)) * 31, 31, this.d), 31, this.e)) * 31;
            com.truecaller.call_assistant.campaigns.display.AssistantCampaignViewButtonData assistantCampaignViewButtonData = this.g;
            if (assistantCampaignViewButtonData == null) {
                hashCode = 0;
            } else {
                hashCode = assistantCampaignViewButtonData.hashCode();
            }
            return this.h.hashCode() + ((hashCode2 + hashCode) * 31);
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder E = ro0.f.E("Banner(id=", this.a, ", name=", this.b, ", imageData=");
            E.append(this.c);
            E.append(", title=");
            E.append(this.d);
            E.append(", subtitle=");
            E.append(this.e);
            E.append(", primaryButton=");
            E.append(this.f);
            E.append(", secondaryButton=");
            E.append(this.g);
            E.append(", backgroundColorData=");
            E.append(this.h);
            E.append(")");
            return E.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int i) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "dest");
            parcel.writeString(this.a);
            parcel.writeString(this.b);
            this.c.writeToParcel(parcel, i);
            parcel.writeString(this.d);
            parcel.writeString(this.e);
            this.f.writeToParcel(parcel, i);
            com.truecaller.call_assistant.campaigns.display.AssistantCampaignViewButtonData assistantCampaignViewButtonData = this.g;
            if (assistantCampaignViewButtonData == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                assistantCampaignViewButtonData.writeToParcel(parcel, i);
            }
            this.h.writeToParcel(parcel, i);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/truecaller/call_assistant/campaigns/display/AssistantCampaignViewDisplayData$Interstitial;", "Lcom/truecaller/call_assistant/campaigns/display/AssistantCampaignViewDisplayData;", "campaigns_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes5.dex */
    public static final /* data */ class Interstitial extends com.truecaller.call_assistant.campaigns.display.AssistantCampaignViewDisplayData {

        @org.jetbrains.annotations.NotNull
        public static final android.os.Parcelable.Creator<com.truecaller.call_assistant.campaigns.display.AssistantCampaignViewDisplayData.Interstitial> CREATOR = new java.lang.Object();
        public final java.lang.String a;
        public final java.lang.String b;
        public final com.truecaller.call_assistant.campaigns.display.AssistantCampaignViewImageData c;
        public final java.lang.String d;
        public final java.lang.String e;
        public final com.truecaller.call_assistant.campaigns.display.AssistantCampaignViewButtonData f;
        public final boolean g;
        public final java.lang.String h;
        public final java.lang.String i;
        public final boolean j;
        public final boolean k;

        public Interstitial(java.lang.String str, java.lang.String str2, com.truecaller.call_assistant.campaigns.display.AssistantCampaignViewImageData assistantCampaignViewImageData, java.lang.String str3, java.lang.String str4, com.truecaller.call_assistant.campaigns.display.AssistantCampaignViewButtonData assistantCampaignViewButtonData, boolean z, java.lang.String str5, java.lang.String str6, boolean z2, boolean z3) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.ID_COLUMN);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "name");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(assistantCampaignViewImageData, "imageData");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "title");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "subtitle");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(assistantCampaignViewButtonData, "positiveButton");
            this.a = str;
            this.b = str2;
            this.c = assistantCampaignViewImageData;
            this.d = str3;
            this.e = str4;
            this.f = assistantCampaignViewButtonData;
            this.g = z;
            this.h = str5;
            this.i = str6;
            this.j = z2;
            this.k = z3;
        }

        @Override // com.truecaller.call_assistant.campaigns.display.AssistantCampaignViewDisplayData
        /* renamed from: a, reason: from getter */
        public final java.lang.String getA() {
            return this.a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof com.truecaller.call_assistant.campaigns.display.AssistantCampaignViewDisplayData.Interstitial)) {
                return false;
            }
            com.truecaller.call_assistant.campaigns.display.AssistantCampaignViewDisplayData.Interstitial interstitial = (com.truecaller.call_assistant.campaigns.display.AssistantCampaignViewDisplayData.Interstitial) obj;
            return kotlin.jvm.internal.Intrinsics.b(this.a, interstitial.a) && kotlin.jvm.internal.Intrinsics.b(this.b, interstitial.b) && kotlin.jvm.internal.Intrinsics.b(this.c, interstitial.c) && kotlin.jvm.internal.Intrinsics.b(this.d, interstitial.d) && kotlin.jvm.internal.Intrinsics.b(this.e, interstitial.e) && kotlin.jvm.internal.Intrinsics.b(this.f, interstitial.f) && this.g == interstitial.g && kotlin.jvm.internal.Intrinsics.b(this.h, interstitial.h) && kotlin.jvm.internal.Intrinsics.b(this.i, interstitial.i) && this.j == interstitial.j && this.k == interstitial.k;
        }

        public final int hashCode() {
            int i;
            int hashCode;
            int i2;
            int hashCode2 = (this.f.hashCode() + ax1.bar.e(ax1.bar.e((this.c.hashCode() + ax1.bar.e(this.a.hashCode() * 31, 31, this.b)) * 31, 31, this.d), 31, this.e)) * 31;
            int i3 = 1237;
            if (this.g) {
                i = 1231;
            } else {
                i = 1237;
            }
            int i4 = (hashCode2 + i) * 31;
            int i5 = 0;
            java.lang.String str = this.h;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i6 = (i4 + hashCode) * 31;
            java.lang.String str2 = this.i;
            if (str2 != null) {
                i5 = str2.hashCode();
            }
            int i7 = (i6 + i5) * 31;
            if (this.j) {
                i2 = 1231;
            } else {
                i2 = 1237;
            }
            int i8 = (i7 + i2) * 31;
            if (this.k) {
                i3 = 1231;
            }
            return i8 + i3;
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder E = ro0.f.E("Interstitial(id=", this.a, ", name=", this.b, ", imageData=");
            E.append(this.c);
            E.append(", title=");
            E.append(this.d);
            E.append(", subtitle=");
            E.append(this.e);
            E.append(", positiveButton=");
            E.append(this.f);
            E.append(", showCloseButton=");
            ro0.f.J(", lottie=", this.h, ", overlayLottie=", E, this.g);
            com.google.android.gms.internal.ads.yj.l(this.i, ", lottieLoop=", ", overlayLottieLoop=", E, this.j);
            return h8.s0.s(E, this.k, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int i) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "dest");
            parcel.writeString(this.a);
            parcel.writeString(this.b);
            this.c.writeToParcel(parcel, i);
            parcel.writeString(this.d);
            parcel.writeString(this.e);
            this.f.writeToParcel(parcel, i);
            parcel.writeInt(this.g ? 1 : 0);
            parcel.writeString(this.h);
            parcel.writeString(this.i);
            parcel.writeInt(this.j ? 1 : 0);
            parcel.writeInt(this.k ? 1 : 0);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/truecaller/call_assistant/campaigns/display/AssistantCampaignViewDisplayData$Popup;", "Lcom/truecaller/call_assistant/campaigns/display/AssistantCampaignViewDisplayData;", "campaigns_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes5.dex */
    public static final /* data */ class Popup extends com.truecaller.call_assistant.campaigns.display.AssistantCampaignViewDisplayData {

        @org.jetbrains.annotations.NotNull
        public static final android.os.Parcelable.Creator<com.truecaller.call_assistant.campaigns.display.AssistantCampaignViewDisplayData.Popup> CREATOR = new java.lang.Object();
        public final java.lang.String a;
        public final java.lang.String b;
        public final com.truecaller.call_assistant.campaigns.display.AssistantCampaignViewImageData c;
        public final java.lang.String d;
        public final java.lang.String e;
        public final com.truecaller.call_assistant.campaigns.display.AssistantCampaignViewButtonData f;
        public final com.truecaller.call_assistant.campaigns.display.AssistantCampaignViewButtonData g;

        public Popup(java.lang.String str, java.lang.String str2, com.truecaller.call_assistant.campaigns.display.AssistantCampaignViewImageData assistantCampaignViewImageData, java.lang.String str3, java.lang.String str4, com.truecaller.call_assistant.campaigns.display.AssistantCampaignViewButtonData assistantCampaignViewButtonData, com.truecaller.call_assistant.campaigns.display.AssistantCampaignViewButtonData assistantCampaignViewButtonData2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.ID_COLUMN);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "name");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(assistantCampaignViewImageData, "imageData");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "title");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "subtitle");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(assistantCampaignViewButtonData, "positiveButton");
            this.a = str;
            this.b = str2;
            this.c = assistantCampaignViewImageData;
            this.d = str3;
            this.e = str4;
            this.f = assistantCampaignViewButtonData;
            this.g = assistantCampaignViewButtonData2;
        }

        @Override // com.truecaller.call_assistant.campaigns.display.AssistantCampaignViewDisplayData
        /* renamed from: a, reason: from getter */
        public final java.lang.String getA() {
            return this.a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof com.truecaller.call_assistant.campaigns.display.AssistantCampaignViewDisplayData.Popup)) {
                return false;
            }
            com.truecaller.call_assistant.campaigns.display.AssistantCampaignViewDisplayData.Popup popup = (com.truecaller.call_assistant.campaigns.display.AssistantCampaignViewDisplayData.Popup) obj;
            return kotlin.jvm.internal.Intrinsics.b(this.a, popup.a) && kotlin.jvm.internal.Intrinsics.b(this.b, popup.b) && kotlin.jvm.internal.Intrinsics.b(this.c, popup.c) && kotlin.jvm.internal.Intrinsics.b(this.d, popup.d) && kotlin.jvm.internal.Intrinsics.b(this.e, popup.e) && kotlin.jvm.internal.Intrinsics.b(this.f, popup.f) && kotlin.jvm.internal.Intrinsics.b(this.g, popup.g);
        }

        public final int hashCode() {
            int hashCode;
            int hashCode2 = (this.f.hashCode() + ax1.bar.e(ax1.bar.e((this.c.hashCode() + ax1.bar.e(this.a.hashCode() * 31, 31, this.b)) * 31, 31, this.d), 31, this.e)) * 31;
            com.truecaller.call_assistant.campaigns.display.AssistantCampaignViewButtonData assistantCampaignViewButtonData = this.g;
            if (assistantCampaignViewButtonData == null) {
                hashCode = 0;
            } else {
                hashCode = assistantCampaignViewButtonData.hashCode();
            }
            return hashCode2 + hashCode;
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder E = ro0.f.E("Popup(id=", this.a, ", name=", this.b, ", imageData=");
            E.append(this.c);
            E.append(", title=");
            E.append(this.d);
            E.append(", subtitle=");
            E.append(this.e);
            E.append(", positiveButton=");
            E.append(this.f);
            E.append(", negativeButton=");
            E.append(this.g);
            E.append(")");
            return E.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int i) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "dest");
            parcel.writeString(this.a);
            parcel.writeString(this.b);
            this.c.writeToParcel(parcel, i);
            parcel.writeString(this.d);
            parcel.writeString(this.e);
            this.f.writeToParcel(parcel, i);
            com.truecaller.call_assistant.campaigns.display.AssistantCampaignViewButtonData assistantCampaignViewButtonData = this.g;
            if (assistantCampaignViewButtonData == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                assistantCampaignViewButtonData.writeToParcel(parcel, i);
            }
        }
    }

    /* renamed from: a */
    public abstract java.lang.String getA();
}
