package com.truecaller.call_assistant.campaigns.deeplinks.internal;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/truecaller/call_assistant/campaigns/deeplinks/internal/DeepLinkAction;", "Landroid/os/Parcelable;", "ActivateAssistantAirtel", "ReactivateVoicemail", "Lcom/truecaller/call_assistant/campaigns/deeplinks/internal/DeepLinkAction$ActivateAssistantAirtel;", "Lcom/truecaller/call_assistant/campaigns/deeplinks/internal/DeepLinkAction$ReactivateVoicemail;", "campaigns_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public abstract class DeepLinkAction implements android.os.Parcelable {

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/truecaller/call_assistant/campaigns/deeplinks/internal/DeepLinkAction$ActivateAssistantAirtel;", "Lcom/truecaller/call_assistant/campaigns/deeplinks/internal/DeepLinkAction;", "campaigns_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes5.dex */
    public static final /* data */ class ActivateAssistantAirtel extends com.truecaller.call_assistant.campaigns.deeplinks.internal.DeepLinkAction {

        @org.jetbrains.annotations.NotNull
        public static final android.os.Parcelable.Creator<com.truecaller.call_assistant.campaigns.deeplinks.internal.DeepLinkAction.ActivateAssistantAirtel> CREATOR = new java.lang.Object();
        public final java.lang.String a;
        public final java.lang.String b;

        public ActivateAssistantAirtel(java.lang.String str, java.lang.String str2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "numberToDial1");
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
            if (!(obj instanceof com.truecaller.call_assistant.campaigns.deeplinks.internal.DeepLinkAction.ActivateAssistantAirtel)) {
                return false;
            }
            com.truecaller.call_assistant.campaigns.deeplinks.internal.DeepLinkAction.ActivateAssistantAirtel activateAssistantAirtel = (com.truecaller.call_assistant.campaigns.deeplinks.internal.DeepLinkAction.ActivateAssistantAirtel) obj;
            return kotlin.jvm.internal.Intrinsics.b(this.a, activateAssistantAirtel.a) && kotlin.jvm.internal.Intrinsics.b(this.b, activateAssistantAirtel.b);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            java.lang.String str = this.b;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final java.lang.String toString() {
            return y.o.e("ActivateAssistantAirtel(numberToDial1=", this.a, ", numberToDial2=", this.b, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int i) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "dest");
            parcel.writeString(this.a);
            parcel.writeString(this.b);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/truecaller/call_assistant/campaigns/deeplinks/internal/DeepLinkAction$ReactivateVoicemail;", "Lcom/truecaller/call_assistant/campaigns/deeplinks/internal/DeepLinkAction;", "campaigns_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes5.dex */
    public static final /* data */ class ReactivateVoicemail extends com.truecaller.call_assistant.campaigns.deeplinks.internal.DeepLinkAction {
        public static final com.truecaller.call_assistant.campaigns.deeplinks.internal.DeepLinkAction.ReactivateVoicemail a = new java.lang.Object();

        @org.jetbrains.annotations.NotNull
        public static final android.os.Parcelable.Creator<com.truecaller.call_assistant.campaigns.deeplinks.internal.DeepLinkAction.ReactivateVoicemail> CREATOR = new java.lang.Object();

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(java.lang.Object obj) {
            return this == obj || (obj instanceof com.truecaller.call_assistant.campaigns.deeplinks.internal.DeepLinkAction.ReactivateVoicemail);
        }

        public final int hashCode() {
            return -1369125171;
        }

        public final java.lang.String toString() {
            return "ReactivateVoicemail";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int i) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "dest");
            parcel.writeInt(1);
        }
    }
}
