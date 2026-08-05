package com.truecaller.social_login;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/truecaller/social_login/SocialAccountProfile;", "Landroid/os/Parcelable;", "social-login_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final /* data */ class SocialAccountProfile implements android.os.Parcelable {

    @org.jetbrains.annotations.NotNull
    public static final android.os.Parcelable.Creator<com.truecaller.social_login.SocialAccountProfile> CREATOR = new a11.bar(7);
    public final java.lang.String a;
    public final java.lang.String b;
    public final java.lang.String c;
    public final java.lang.String d;
    public final java.lang.String e;

    public SocialAccountProfile(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.truecaller.social_login.SocialAccountProfile)) {
            return false;
        }
        com.truecaller.social_login.SocialAccountProfile socialAccountProfile = (com.truecaller.social_login.SocialAccountProfile) obj;
        return kotlin.jvm.internal.Intrinsics.b(this.a, socialAccountProfile.a) && kotlin.jvm.internal.Intrinsics.b(this.b, socialAccountProfile.b) && kotlin.jvm.internal.Intrinsics.b(this.c, socialAccountProfile.c) && kotlin.jvm.internal.Intrinsics.b(this.d, socialAccountProfile.d) && kotlin.jvm.internal.Intrinsics.b(this.e, socialAccountProfile.e);
    }

    public final int hashCode() {
        java.lang.String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.lang.String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        java.lang.String str4 = this.d;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        java.lang.String str5 = this.e;
        return hashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder E = ro0.f.E("SocialAccountProfile(firstName=", this.a, ", lastName=", this.b, ", email=");
        bar.E(E, this.c, ", profilePicture=", this.d, ", idToken=");
        return bar.v(this.e, ")", E);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "dest");
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
    }
}
