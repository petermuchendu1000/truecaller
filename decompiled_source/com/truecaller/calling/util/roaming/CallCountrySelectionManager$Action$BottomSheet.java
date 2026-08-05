package com.truecaller.calling.util.roaming;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"com/truecaller/calling/util/roaming/CallCountrySelectionManager$Action$BottomSheet", "Ldw0/c;", "Landroid/os/Parcelable;", "calling_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class CallCountrySelectionManager$Action$BottomSheet extends dw0.c implements android.os.Parcelable {

    @org.jetbrains.annotations.NotNull
    public static final android.os.Parcelable.Creator<com.truecaller.calling.util.roaming.CallCountrySelectionManager$Action$BottomSheet> CREATOR = new cb1.bar(16);
    public final java.lang.String a;
    public final java.lang.String b;
    public final java.lang.String c;
    public final java.lang.String d;
    public final java.lang.String e;
    public final java.lang.String f;
    public final java.lang.String g;
    public final java.lang.Integer h;

    public CallCountrySelectionManager$Action$BottomSheet(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.Integer num) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "originalNumber");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str6, "homeCountryCode");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str7, "roamingCountryCode");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = num;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.truecaller.calling.util.roaming.CallCountrySelectionManager$Action$BottomSheet)) {
            return false;
        }
        com.truecaller.calling.util.roaming.CallCountrySelectionManager$Action$BottomSheet callCountrySelectionManager$Action$BottomSheet = (com.truecaller.calling.util.roaming.CallCountrySelectionManager$Action$BottomSheet) obj;
        return kotlin.jvm.internal.Intrinsics.b(this.a, callCountrySelectionManager$Action$BottomSheet.a) && kotlin.jvm.internal.Intrinsics.b(this.b, callCountrySelectionManager$Action$BottomSheet.b) && kotlin.jvm.internal.Intrinsics.b(this.c, callCountrySelectionManager$Action$BottomSheet.c) && kotlin.jvm.internal.Intrinsics.b(this.d, callCountrySelectionManager$Action$BottomSheet.d) && kotlin.jvm.internal.Intrinsics.b(this.e, callCountrySelectionManager$Action$BottomSheet.e) && kotlin.jvm.internal.Intrinsics.b(this.f, callCountrySelectionManager$Action$BottomSheet.f) && kotlin.jvm.internal.Intrinsics.b(this.g, callCountrySelectionManager$Action$BottomSheet.g) && kotlin.jvm.internal.Intrinsics.b(this.h, callCountrySelectionManager$Action$BottomSheet.h);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5 = this.a.hashCode() * 31;
        int i = 0;
        java.lang.String str = this.b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode5 + hashCode) * 31;
        java.lang.String str2 = this.c;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        java.lang.String str3 = this.d;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        java.lang.String str4 = this.e;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int e = ax1.bar.e(ax1.bar.e((i4 + hashCode4) * 31, 31, this.f), 31, this.g);
        java.lang.Integer num = this.h;
        if (num != null) {
            i = num.hashCode();
        }
        return e + i;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder E = ro0.f.E("BottomSheet(originalNumber=", this.a, ", homeCountryNumber=", this.b, ", roamingCountryNumber=");
        bar.E(E, this.c, ", homeCountryDisplayNumber=", this.d, ", roamingCountryDisplayNumber=");
        bar.E(E, this.e, ", homeCountryCode=", this.f, ", roamingCountryCode=");
        E.append(this.g);
        E.append(", simSlotIndex=");
        E.append(this.h);
        E.append(")");
        return E.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "dest");
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
        java.lang.Integer num = this.h;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            z0.a0.j(parcel, 1, num);
        }
    }
}
