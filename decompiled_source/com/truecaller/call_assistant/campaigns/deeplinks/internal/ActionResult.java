package com.truecaller.call_assistant.campaigns.deeplinks.internal;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/truecaller/call_assistant/campaigns/deeplinks/internal/ActionResult;", "Landroid/os/Parcelable;", "Navigation", "Action", "Skip", "Dismiss", "Unknown", "Lcom/truecaller/call_assistant/campaigns/deeplinks/internal/ActionResult$Action;", "Lcom/truecaller/call_assistant/campaigns/deeplinks/internal/ActionResult$Dismiss;", "Lcom/truecaller/call_assistant/campaigns/deeplinks/internal/ActionResult$Navigation;", "Lcom/truecaller/call_assistant/campaigns/deeplinks/internal/ActionResult$Skip;", "Lcom/truecaller/call_assistant/campaigns/deeplinks/internal/ActionResult$Unknown;", "campaigns_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public abstract class ActionResult implements android.os.Parcelable {

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/truecaller/call_assistant/campaigns/deeplinks/internal/ActionResult$Action;", "Lcom/truecaller/call_assistant/campaigns/deeplinks/internal/ActionResult;", "campaigns_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes5.dex */
    public static final /* data */ class Action extends com.truecaller.call_assistant.campaigns.deeplinks.internal.ActionResult {

        @org.jetbrains.annotations.NotNull
        public static final android.os.Parcelable.Creator<com.truecaller.call_assistant.campaigns.deeplinks.internal.ActionResult.Action> CREATOR = new java.lang.Object();
        public final com.truecaller.call_assistant.campaigns.deeplinks.internal.DeepLinkAction a;

        public Action(com.truecaller.call_assistant.campaigns.deeplinks.internal.DeepLinkAction deepLinkAction) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deepLinkAction, "action");
            this.a = deepLinkAction;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof com.truecaller.call_assistant.campaigns.deeplinks.internal.ActionResult.Action) && kotlin.jvm.internal.Intrinsics.b(this.a, ((com.truecaller.call_assistant.campaigns.deeplinks.internal.ActionResult.Action) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final java.lang.String toString() {
            return "Action(action=" + this.a + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int i) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "dest");
            parcel.writeParcelable(this.a, i);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/truecaller/call_assistant/campaigns/deeplinks/internal/ActionResult$Dismiss;", "Lcom/truecaller/call_assistant/campaigns/deeplinks/internal/ActionResult;", "campaigns_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes5.dex */
    public static final /* data */ class Dismiss extends com.truecaller.call_assistant.campaigns.deeplinks.internal.ActionResult {
        public static final com.truecaller.call_assistant.campaigns.deeplinks.internal.ActionResult.Dismiss a = new java.lang.Object();

        @org.jetbrains.annotations.NotNull
        public static final android.os.Parcelable.Creator<com.truecaller.call_assistant.campaigns.deeplinks.internal.ActionResult.Dismiss> CREATOR = new java.lang.Object();

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(java.lang.Object obj) {
            return this == obj || (obj instanceof com.truecaller.call_assistant.campaigns.deeplinks.internal.ActionResult.Dismiss);
        }

        public final int hashCode() {
            return -359878389;
        }

        public final java.lang.String toString() {
            return "Dismiss";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int i) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "dest");
            parcel.writeInt(1);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/truecaller/call_assistant/campaigns/deeplinks/internal/ActionResult$Navigation;", "Lcom/truecaller/call_assistant/campaigns/deeplinks/internal/ActionResult;", "campaigns_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes5.dex */
    public static final /* data */ class Navigation extends com.truecaller.call_assistant.campaigns.deeplinks.internal.ActionResult {

        @org.jetbrains.annotations.NotNull
        public static final android.os.Parcelable.Creator<com.truecaller.call_assistant.campaigns.deeplinks.internal.ActionResult.Navigation> CREATOR = new java.lang.Object();
        public final java.lang.String a;

        public Navigation(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "deeplink");
            this.a = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof com.truecaller.call_assistant.campaigns.deeplinks.internal.ActionResult.Navigation) && kotlin.jvm.internal.Intrinsics.b(this.a, ((com.truecaller.call_assistant.campaigns.deeplinks.internal.ActionResult.Navigation) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final java.lang.String toString() {
            return bar.t("Navigation(deeplink=", this.a, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int i) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "dest");
            parcel.writeString(this.a);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/truecaller/call_assistant/campaigns/deeplinks/internal/ActionResult$Skip;", "Lcom/truecaller/call_assistant/campaigns/deeplinks/internal/ActionResult;", "campaigns_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes5.dex */
    public static final /* data */ class Skip extends com.truecaller.call_assistant.campaigns.deeplinks.internal.ActionResult {

        @org.jetbrains.annotations.NotNull
        public static final android.os.Parcelable.Creator<com.truecaller.call_assistant.campaigns.deeplinks.internal.ActionResult.Skip> CREATOR = new java.lang.Object();
        public final java.lang.String a;

        public Skip(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.ID_COLUMN);
            this.a = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof com.truecaller.call_assistant.campaigns.deeplinks.internal.ActionResult.Skip) && kotlin.jvm.internal.Intrinsics.b(this.a, ((com.truecaller.call_assistant.campaigns.deeplinks.internal.ActionResult.Skip) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final java.lang.String toString() {
            return bar.t("Skip(id=", this.a, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int i) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "dest");
            parcel.writeString(this.a);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/truecaller/call_assistant/campaigns/deeplinks/internal/ActionResult$Unknown;", "Lcom/truecaller/call_assistant/campaigns/deeplinks/internal/ActionResult;", "campaigns_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes5.dex */
    public static final /* data */ class Unknown extends com.truecaller.call_assistant.campaigns.deeplinks.internal.ActionResult {
        public static final com.truecaller.call_assistant.campaigns.deeplinks.internal.ActionResult.Unknown a = new java.lang.Object();

        @org.jetbrains.annotations.NotNull
        public static final android.os.Parcelable.Creator<com.truecaller.call_assistant.campaigns.deeplinks.internal.ActionResult.Unknown> CREATOR = new java.lang.Object();

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(java.lang.Object obj) {
            return this == obj || (obj instanceof com.truecaller.call_assistant.campaigns.deeplinks.internal.ActionResult.Unknown);
        }

        public final int hashCode() {
            return 1978575563;
        }

        public final java.lang.String toString() {
            return "Unknown";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int i) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "dest");
            parcel.writeInt(1);
        }
    }
}
