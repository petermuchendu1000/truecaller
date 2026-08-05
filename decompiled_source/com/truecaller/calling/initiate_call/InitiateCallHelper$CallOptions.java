package com.truecaller.calling.initiate_call;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"com/truecaller/calling/initiate_call/InitiateCallHelper$CallOptions", "Landroid/os/Parcelable;", "com/truecaller/calling/initiate_call/qux", "calling_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class InitiateCallHelper$CallOptions implements android.os.Parcelable {

    @org.jetbrains.annotations.NotNull
    public static final android.os.Parcelable.Creator<com.truecaller.calling.initiate_call.InitiateCallHelper$CallOptions> CREATOR = new ks2.bar(22);
    public final java.lang.String a;
    public final java.lang.String b;
    public final java.lang.String c;
    public final java.lang.String d;
    public java.lang.Integer e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final android.telecom.PhoneAccountHandle j;
    public final boolean k;
    public final com.truecaller.calling.initiate_call.InitiateCallHelper$CallContextOption l;
    public final com.truecaller.calling.initiate_call.InitiateCallHelper$DialAssistOptions m;
    public final com.truecaller.calling.initiate_call.InitiateCallHelper$CallSource n;

    public InitiateCallHelper$CallOptions(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.Integer num, boolean z, boolean z2, boolean z3, boolean z4, android.telecom.PhoneAccountHandle phoneAccountHandle, boolean z5, com.truecaller.calling.initiate_call.InitiateCallHelper$CallContextOption initiateCallHelper$CallContextOption, com.truecaller.calling.initiate_call.InitiateCallHelper$DialAssistOptions initiateCallHelper$DialAssistOptions, com.truecaller.calling.initiate_call.InitiateCallHelper$CallSource initiateCallHelper$CallSource) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "analyticsContext");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "viewAnalyticsContext");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initiateCallHelper$CallContextOption, "callContextOption");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initiateCallHelper$CallSource, "source");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = num;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = z4;
        this.j = phoneAccountHandle;
        this.k = z5;
        this.l = initiateCallHelper$CallContextOption;
        this.m = initiateCallHelper$DialAssistOptions;
        this.n = initiateCallHelper$CallSource;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "dest");
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        java.lang.Integer num = this.e;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            z0.a0.j(parcel, 1, num);
        }
        parcel.writeInt(this.f ? 1 : 0);
        parcel.writeInt(this.g ? 1 : 0);
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeInt(this.i ? 1 : 0);
        parcel.writeParcelable(this.j, i);
        parcel.writeInt(this.k ? 1 : 0);
        parcel.writeParcelable(this.l, i);
        com.truecaller.calling.initiate_call.InitiateCallHelper$DialAssistOptions initiateCallHelper$DialAssistOptions = this.m;
        if (initiateCallHelper$DialAssistOptions == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            initiateCallHelper$DialAssistOptions.writeToParcel(parcel, i);
        }
        this.n.writeToParcel(parcel, i);
    }
}
