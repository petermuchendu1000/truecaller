package com.truecaller.wizard.profile;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/truecaller/wizard/profile/ManualInputArgs;", "Landroid/os/Parcelable;", "domain_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final /* data */ class ManualInputArgs implements android.os.Parcelable {

    @org.jetbrains.annotations.NotNull
    public static final android.os.Parcelable.Creator<com.truecaller.wizard.profile.ManualInputArgs> CREATOR = new a11.bar(29);
    public final android.net.Uri a;
    public final java.lang.String b;
    public final java.lang.String c;
    public final java.lang.String d;
    public final java.lang.String e;
    public final boolean f;

    public ManualInputArgs(android.net.Uri uri, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z) {
        this.a = uri;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.truecaller.wizard.profile.ManualInputArgs)) {
            return false;
        }
        com.truecaller.wizard.profile.ManualInputArgs manualInputArgs = (com.truecaller.wizard.profile.ManualInputArgs) obj;
        return kotlin.jvm.internal.Intrinsics.b(this.a, manualInputArgs.a) && kotlin.jvm.internal.Intrinsics.b(this.b, manualInputArgs.b) && kotlin.jvm.internal.Intrinsics.b(this.c, manualInputArgs.c) && kotlin.jvm.internal.Intrinsics.b(this.d, manualInputArgs.d) && kotlin.jvm.internal.Intrinsics.b(this.e, manualInputArgs.e) && this.f == manualInputArgs.f;
    }

    public final int hashCode() {
        android.net.Uri uri = this.a;
        int hashCode = (uri == null ? 0 : uri.hashCode()) * 31;
        java.lang.String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.d;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        java.lang.String str4 = this.e;
        return ((hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31) + (this.f ? 1231 : 1237);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ManualInputArgs(photoUri=");
        sb.append(this.a);
        sb.append(", firstName=");
        sb.append(this.b);
        sb.append(", lastName=");
        bar.E(sb, this.c, ", email=", this.d, ", googleTokenId=");
        return ax1.bar.m(this.e, ", newDesign=", ")", sb, this.f);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "dest");
        parcel.writeParcelable(this.a, i);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeInt(this.f ? 1 : 0);
    }
}
