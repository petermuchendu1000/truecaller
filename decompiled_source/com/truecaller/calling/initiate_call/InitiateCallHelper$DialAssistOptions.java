package com.truecaller.calling.initiate_call;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/truecaller/calling/initiate_call/InitiateCallHelper$DialAssistOptions", "Landroid/os/Parcelable;", "calling_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class InitiateCallHelper$DialAssistOptions implements android.os.Parcelable {

    @org.jetbrains.annotations.NotNull
    public static final android.os.Parcelable.Creator<com.truecaller.calling.initiate_call.InitiateCallHelper$DialAssistOptions> CREATOR = new ks2.bar(24);
    public final java.lang.String a;
    public final java.lang.String b;

    public InitiateCallHelper$DialAssistOptions(java.lang.String str, java.lang.String str2) {
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
        if (!(obj instanceof com.truecaller.calling.initiate_call.InitiateCallHelper$DialAssistOptions)) {
            return false;
        }
        com.truecaller.calling.initiate_call.InitiateCallHelper$DialAssistOptions initiateCallHelper$DialAssistOptions = (com.truecaller.calling.initiate_call.InitiateCallHelper$DialAssistOptions) obj;
        return kotlin.jvm.internal.Intrinsics.b(this.a, initiateCallHelper$DialAssistOptions.a) && kotlin.jvm.internal.Intrinsics.b(this.b, initiateCallHelper$DialAssistOptions.b);
    }

    public final int hashCode() {
        java.lang.String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.lang.String str2 = this.b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return y.o.e("DialAssistOptions(normalizedNumber=", this.a, ", countryCodeIso=", this.b, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "dest");
        parcel.writeString(this.a);
        parcel.writeString(this.b);
    }
}
