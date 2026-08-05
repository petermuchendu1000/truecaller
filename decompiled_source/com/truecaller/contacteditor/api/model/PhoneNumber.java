package com.truecaller.contacteditor.api.model;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/truecaller/contacteditor/api/model/PhoneNumber;", "Landroid/os/Parcelable;", "api_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes.dex */
public final /* data */ class PhoneNumber implements android.os.Parcelable {

    @org.jetbrains.annotations.NotNull
    public static final android.os.Parcelable.Creator<com.truecaller.contacteditor.api.model.PhoneNumber> CREATOR = new y02.t(25);

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f4546a;
    public final int b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f4547c;

    public PhoneNumber(java.lang.String str, int i10, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "number");
        this.f4546a = str;
        this.b = i10;
        this.f4547c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.truecaller.contacteditor.api.model.PhoneNumber)) {
            return false;
        }
        com.truecaller.contacteditor.api.model.PhoneNumber phoneNumber = (com.truecaller.contacteditor.api.model.PhoneNumber) obj;
        return kotlin.jvm.internal.Intrinsics.b(this.f4546a, phoneNumber.f4546a) && this.b == phoneNumber.b && kotlin.jvm.internal.Intrinsics.b(this.f4547c, phoneNumber.f4547c);
    }

    public final int hashCode() {
        int hashCode = ((this.f4546a.hashCode() * 31) + this.b) * 31;
        java.lang.String str = this.f4547c;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final java.lang.String toString() {
        return defpackage.bar.v(this.f4547c, ")", defpackage.bar.z("PhoneNumber(number=", this.b, this.f4546a, ", type=", ", label="));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i10) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "dest");
        parcel.writeString(this.f4546a);
        parcel.writeInt(this.b);
        parcel.writeString(this.f4547c);
    }
}
