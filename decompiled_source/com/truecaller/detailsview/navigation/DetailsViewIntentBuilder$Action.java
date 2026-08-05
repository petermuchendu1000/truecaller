package com.truecaller.detailsview.navigation;

@kotlin.Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"com/truecaller/detailsview/navigation/DetailsViewIntentBuilder$Action", "Landroid/os/Parcelable;", "None", "SaveToHistory", "RegisterForInterstitialLauncher", "CallLog", "ShowCallMeBackBottomSheet", "Lcom/truecaller/detailsview/navigation/DetailsViewIntentBuilder$Action$CallLog;", "Lcom/truecaller/detailsview/navigation/DetailsViewIntentBuilder$Action$None;", "Lcom/truecaller/detailsview/navigation/DetailsViewIntentBuilder$Action$RegisterForInterstitialLauncher;", "Lcom/truecaller/detailsview/navigation/DetailsViewIntentBuilder$Action$SaveToHistory;", "Lcom/truecaller/detailsview/navigation/DetailsViewIntentBuilder$Action$ShowCallMeBackBottomSheet;", "navigation_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public interface DetailsViewIntentBuilder$Action extends android.os.Parcelable {

    @androidx.annotation.Keep
    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, d2 = {"Lcom/truecaller/detailsview/navigation/DetailsViewIntentBuilder$Action$CallLog;", "Lcom/truecaller/detailsview/navigation/DetailsViewIntentBuilder$Action;", "action", "", "<init>", "(Ljava/lang/String;)V", "getAction", "()Ljava/lang/String;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "navigation_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes6.dex */
    public static final /* data */ class CallLog implements com.truecaller.detailsview.navigation.DetailsViewIntentBuilder$Action {
        public static final int $stable = 0;

        @org.jetbrains.annotations.NotNull
        public static final android.os.Parcelable.Creator<com.truecaller.detailsview.navigation.DetailsViewIntentBuilder$Action.CallLog> CREATOR = new java.lang.Object();

        @org.jetbrains.annotations.NotNull
        private final java.lang.String action;

        public CallLog(@org.jetbrains.annotations.NotNull java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "action");
            this.action = str;
        }

        public static /* synthetic */ com.truecaller.detailsview.navigation.DetailsViewIntentBuilder$Action.CallLog copy$default(com.truecaller.detailsview.navigation.DetailsViewIntentBuilder$Action.CallLog callLog, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = callLog.action;
            }
            return callLog.copy(str);
        }

        @org.jetbrains.annotations.NotNull
        /* renamed from: component1, reason: from getter */
        public final java.lang.String getAction() {
            return this.action;
        }

        @org.jetbrains.annotations.NotNull
        public final com.truecaller.detailsview.navigation.DetailsViewIntentBuilder$Action.CallLog copy(@org.jetbrains.annotations.NotNull java.lang.String action) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "action");
            return new com.truecaller.detailsview.navigation.DetailsViewIntentBuilder$Action.CallLog(action);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.truecaller.detailsview.navigation.DetailsViewIntentBuilder$Action.CallLog) && kotlin.jvm.internal.Intrinsics.b(this.action, ((com.truecaller.detailsview.navigation.DetailsViewIntentBuilder$Action.CallLog) other).action);
        }

        @org.jetbrains.annotations.NotNull
        public final java.lang.String getAction() {
            return this.action;
        }

        public int hashCode() {
            return this.action.hashCode();
        }

        @org.jetbrains.annotations.NotNull
        public java.lang.String toString() {
            return bar.t("CallLog(action=", this.action, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@org.jetbrains.annotations.NotNull android.os.Parcel dest, int flags) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.action);
        }
    }

    @androidx.annotation.Keep
    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0012"}, d2 = {"Lcom/truecaller/detailsview/navigation/DetailsViewIntentBuilder$Action$None;", "Lcom/truecaller/detailsview/navigation/DetailsViewIntentBuilder$Action;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "navigation_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes6.dex */
    public static final /* data */ class None implements com.truecaller.detailsview.navigation.DetailsViewIntentBuilder$Action {
        public static final int $stable = 0;

        @org.jetbrains.annotations.NotNull
        public static final com.truecaller.detailsview.navigation.DetailsViewIntentBuilder$Action.None INSTANCE = new com.truecaller.detailsview.navigation.DetailsViewIntentBuilder$Action.None();

        @org.jetbrains.annotations.NotNull
        public static final android.os.Parcelable.Creator<com.truecaller.detailsview.navigation.DetailsViewIntentBuilder$Action.None> CREATOR = new java.lang.Object();

        private None() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
            return this == other || (other instanceof com.truecaller.detailsview.navigation.DetailsViewIntentBuilder$Action.None);
        }

        public int hashCode() {
            return 1867141765;
        }

        @org.jetbrains.annotations.NotNull
        public java.lang.String toString() {
            return "None";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@org.jetbrains.annotations.NotNull android.os.Parcel dest, int flags) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @androidx.annotation.Keep
    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/truecaller/detailsview/navigation/DetailsViewIntentBuilder$Action$RegisterForInterstitialLauncher;", "Lcom/truecaller/detailsview/navigation/DetailsViewIntentBuilder$Action;", "outgoingCallSource", "Lcom/truecaller/detailsview/navigation/DetailsViewIntentBuilder$OutgoingCallSource;", "<init>", "(Lcom/truecaller/detailsview/navigation/DetailsViewIntentBuilder$OutgoingCallSource;)V", "getOutgoingCallSource", "()Lcom/truecaller/detailsview/navigation/DetailsViewIntentBuilder$OutgoingCallSource;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "navigation_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes6.dex */
    public static final /* data */ class RegisterForInterstitialLauncher implements com.truecaller.detailsview.navigation.DetailsViewIntentBuilder$Action {
        public static final int $stable = 0;

        @org.jetbrains.annotations.NotNull
        public static final android.os.Parcelable.Creator<com.truecaller.detailsview.navigation.DetailsViewIntentBuilder$Action.RegisterForInterstitialLauncher> CREATOR = new java.lang.Object();

        @org.jetbrains.annotations.NotNull
        private final com.truecaller.detailsview.navigation.DetailsViewIntentBuilder$OutgoingCallSource outgoingCallSource;

        public RegisterForInterstitialLauncher(@org.jetbrains.annotations.NotNull com.truecaller.detailsview.navigation.DetailsViewIntentBuilder$OutgoingCallSource detailsViewIntentBuilder$OutgoingCallSource) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(detailsViewIntentBuilder$OutgoingCallSource, "outgoingCallSource");
            this.outgoingCallSource = detailsViewIntentBuilder$OutgoingCallSource;
        }

        public static /* synthetic */ com.truecaller.detailsview.navigation.DetailsViewIntentBuilder$Action.RegisterForInterstitialLauncher copy$default(com.truecaller.detailsview.navigation.DetailsViewIntentBuilder$Action.RegisterForInterstitialLauncher registerForInterstitialLauncher, com.truecaller.detailsview.navigation.DetailsViewIntentBuilder$OutgoingCallSource detailsViewIntentBuilder$OutgoingCallSource, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                detailsViewIntentBuilder$OutgoingCallSource = registerForInterstitialLauncher.outgoingCallSource;
            }
            return registerForInterstitialLauncher.copy(detailsViewIntentBuilder$OutgoingCallSource);
        }

        @org.jetbrains.annotations.NotNull
        /* renamed from: component1, reason: from getter */
        public final com.truecaller.detailsview.navigation.DetailsViewIntentBuilder$OutgoingCallSource getOutgoingCallSource() {
            return this.outgoingCallSource;
        }

        @org.jetbrains.annotations.NotNull
        public final com.truecaller.detailsview.navigation.DetailsViewIntentBuilder$Action.RegisterForInterstitialLauncher copy(@org.jetbrains.annotations.NotNull com.truecaller.detailsview.navigation.DetailsViewIntentBuilder$OutgoingCallSource outgoingCallSource) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(outgoingCallSource, "outgoingCallSource");
            return new com.truecaller.detailsview.navigation.DetailsViewIntentBuilder$Action.RegisterForInterstitialLauncher(outgoingCallSource);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.truecaller.detailsview.navigation.DetailsViewIntentBuilder$Action.RegisterForInterstitialLauncher) && this.outgoingCallSource == ((com.truecaller.detailsview.navigation.DetailsViewIntentBuilder$Action.RegisterForInterstitialLauncher) other).outgoingCallSource;
        }

        @org.jetbrains.annotations.NotNull
        public final com.truecaller.detailsview.navigation.DetailsViewIntentBuilder$OutgoingCallSource getOutgoingCallSource() {
            return this.outgoingCallSource;
        }

        public int hashCode() {
            return this.outgoingCallSource.hashCode();
        }

        @org.jetbrains.annotations.NotNull
        public java.lang.String toString() {
            return "RegisterForInterstitialLauncher(outgoingCallSource=" + this.outgoingCallSource + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@org.jetbrains.annotations.NotNull android.os.Parcel dest, int flags) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.outgoingCallSource.name());
        }
    }

    @androidx.annotation.Keep
    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0012"}, d2 = {"Lcom/truecaller/detailsview/navigation/DetailsViewIntentBuilder$Action$SaveToHistory;", "Lcom/truecaller/detailsview/navigation/DetailsViewIntentBuilder$Action;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "navigation_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes6.dex */
    public static final /* data */ class SaveToHistory implements com.truecaller.detailsview.navigation.DetailsViewIntentBuilder$Action {
        public static final int $stable = 0;

        @org.jetbrains.annotations.NotNull
        public static final com.truecaller.detailsview.navigation.DetailsViewIntentBuilder$Action.SaveToHistory INSTANCE = new com.truecaller.detailsview.navigation.DetailsViewIntentBuilder$Action.SaveToHistory();

        @org.jetbrains.annotations.NotNull
        public static final android.os.Parcelable.Creator<com.truecaller.detailsview.navigation.DetailsViewIntentBuilder$Action.SaveToHistory> CREATOR = new java.lang.Object();

        private SaveToHistory() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
            return this == other || (other instanceof com.truecaller.detailsview.navigation.DetailsViewIntentBuilder$Action.SaveToHistory);
        }

        public int hashCode() {
            return -1008288785;
        }

        @org.jetbrains.annotations.NotNull
        public java.lang.String toString() {
            return "SaveToHistory";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@org.jetbrains.annotations.NotNull android.os.Parcel dest, int flags) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @androidx.annotation.Keep
    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0012"}, d2 = {"Lcom/truecaller/detailsview/navigation/DetailsViewIntentBuilder$Action$ShowCallMeBackBottomSheet;", "Lcom/truecaller/detailsview/navigation/DetailsViewIntentBuilder$Action;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "navigation_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes6.dex */
    public static final /* data */ class ShowCallMeBackBottomSheet implements com.truecaller.detailsview.navigation.DetailsViewIntentBuilder$Action {
        public static final int $stable = 0;

        @org.jetbrains.annotations.NotNull
        public static final com.truecaller.detailsview.navigation.DetailsViewIntentBuilder$Action.ShowCallMeBackBottomSheet INSTANCE = new com.truecaller.detailsview.navigation.DetailsViewIntentBuilder$Action.ShowCallMeBackBottomSheet();

        @org.jetbrains.annotations.NotNull
        public static final android.os.Parcelable.Creator<com.truecaller.detailsview.navigation.DetailsViewIntentBuilder$Action.ShowCallMeBackBottomSheet> CREATOR = new java.lang.Object();

        private ShowCallMeBackBottomSheet() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
            return this == other || (other instanceof com.truecaller.detailsview.navigation.DetailsViewIntentBuilder$Action.ShowCallMeBackBottomSheet);
        }

        public int hashCode() {
            return -2112410899;
        }

        @org.jetbrains.annotations.NotNull
        public java.lang.String toString() {
            return "ShowCallMeBackBottomSheet";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@org.jetbrains.annotations.NotNull android.os.Parcel dest, int flags) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }
}
