package com.truecaller.calling.initiate_call;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"com/truecaller/calling/initiate_call/InitiateCallHelper$CallContextOption", "Landroid/os/Parcelable;", "Skip", "ShowOnBoarded", "Lcom/truecaller/calling/initiate_call/InitiateCallHelper$CallContextOption$ShowOnBoarded;", "Lcom/truecaller/calling/initiate_call/InitiateCallHelper$CallContextOption$Skip;", "calling_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public abstract class InitiateCallHelper$CallContextOption implements android.os.Parcelable {

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/truecaller/calling/initiate_call/InitiateCallHelper$CallContextOption$ShowOnBoarded;", "Lcom/truecaller/calling/initiate_call/InitiateCallHelper$CallContextOption;", "calling_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes5.dex */
    public static final class ShowOnBoarded extends com.truecaller.calling.initiate_call.InitiateCallHelper$CallContextOption {
        public static final com.truecaller.calling.initiate_call.InitiateCallHelper$CallContextOption.ShowOnBoarded a = new java.lang.Object();

        @org.jetbrains.annotations.NotNull
        public static final android.os.Parcelable.Creator<com.truecaller.calling.initiate_call.InitiateCallHelper$CallContextOption.ShowOnBoarded> CREATOR = new java.lang.Object();

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int i) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "dest");
            parcel.writeInt(1);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/truecaller/calling/initiate_call/InitiateCallHelper$CallContextOption$Skip;", "Lcom/truecaller/calling/initiate_call/InitiateCallHelper$CallContextOption;", "calling_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes5.dex */
    public static final class Skip extends com.truecaller.calling.initiate_call.InitiateCallHelper$CallContextOption {
        public static final com.truecaller.calling.initiate_call.InitiateCallHelper$CallContextOption.Skip a = new java.lang.Object();

        @org.jetbrains.annotations.NotNull
        public static final android.os.Parcelable.Creator<com.truecaller.calling.initiate_call.InitiateCallHelper$CallContextOption.Skip> CREATOR = new java.lang.Object();

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int i) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "dest");
            parcel.writeInt(1);
        }
    }
}
