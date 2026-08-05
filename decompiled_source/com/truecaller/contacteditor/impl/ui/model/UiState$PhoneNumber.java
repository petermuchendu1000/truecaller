package com.truecaller.contacteditor.impl.ui.model;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/truecaller/contacteditor/impl/ui/model/UiState$PhoneNumber", "Landroid/os/Parcelable;", "impl_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final /* data */ class UiState$PhoneNumber implements android.os.Parcelable {

    @org.jetbrains.annotations.NotNull
    public static final android.os.Parcelable.Creator<com.truecaller.contacteditor.impl.ui.model.UiState$PhoneNumber> CREATOR = new java.lang.Object();
    public final int a;
    public final java.lang.String b;
    public final int c;
    public final java.lang.String d;
    public final boolean e;
    public final boolean f;

    public UiState$PhoneNumber(java.lang.String str, int i, int i2, java.lang.String str2, boolean z, boolean z2) {
        this.a = i;
        this.b = str;
        this.c = i2;
        this.d = str2;
        this.e = z;
        this.f = z2;
    }

    public static com.truecaller.contacteditor.impl.ui.model.UiState$PhoneNumber a(com.truecaller.contacteditor.impl.ui.model.UiState$PhoneNumber uiState$PhoneNumber, java.lang.String str, int i, java.lang.String str2, boolean z, boolean z2, int i2) {
        int i3 = i;
        int i4 = uiState$PhoneNumber.a;
        if ((i2 & 2) != 0) {
            str = uiState$PhoneNumber.b;
        }
        if ((i2 & 4) != 0) {
            i3 = uiState$PhoneNumber.c;
        }
        if ((i2 & 8) != 0) {
            str2 = uiState$PhoneNumber.d;
        }
        if ((i2 & 16) != 0) {
            z = uiState$PhoneNumber.e;
        }
        if ((i2 & 32) != 0) {
            z2 = uiState$PhoneNumber.f;
        }
        boolean z3 = z2;
        uiState$PhoneNumber.getClass();
        boolean z4 = z;
        return new com.truecaller.contacteditor.impl.ui.model.UiState$PhoneNumber(str, i4, i3, str2, z4, z3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.truecaller.contacteditor.impl.ui.model.UiState$PhoneNumber)) {
            return false;
        }
        com.truecaller.contacteditor.impl.ui.model.UiState$PhoneNumber uiState$PhoneNumber = (com.truecaller.contacteditor.impl.ui.model.UiState$PhoneNumber) obj;
        return this.a == uiState$PhoneNumber.a && kotlin.jvm.internal.Intrinsics.b(this.b, uiState$PhoneNumber.b) && this.c == uiState$PhoneNumber.c && kotlin.jvm.internal.Intrinsics.b(this.d, uiState$PhoneNumber.d) && this.e == uiState$PhoneNumber.e && this.f == uiState$PhoneNumber.f;
    }

    public final int hashCode() {
        int hashCode;
        int i;
        int i2 = this.a * 31;
        int i3 = 0;
        java.lang.String str = this.b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i4 = (((i2 + hashCode) * 31) + this.c) * 31;
        java.lang.String str2 = this.d;
        if (str2 != null) {
            i3 = str2.hashCode();
        }
        int i5 = (i4 + i3) * 31;
        int i6 = 1237;
        if (this.e) {
            i = 1231;
        } else {
            i = 1237;
        }
        int i7 = (i5 + i) * 31;
        if (this.f) {
            i6 = 1231;
        }
        return i7 + i6;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder r = qb.qux.r("PhoneNumber(id=", this.a, ", number=", this.b, ", telType=");
        uf.qux.q(this.c, ", telTypeLabel=", this.d, ", showPhoneIcon=", r);
        return ax1.bar.q(r, this.e, ", canBeRemoved=", this.f, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "dest");
        parcel.writeInt(this.a);
        parcel.writeString(this.b);
        parcel.writeInt(this.c);
        parcel.writeString(this.d);
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeInt(this.f ? 1 : 0);
    }

    public /* synthetic */ UiState$PhoneNumber(int i) {
        this(null, i, 2, null, true, false);
    }
}
