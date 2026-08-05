package com.truecaller.calling.util.roaming;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/truecaller/calling/util/roaming/CallCountrySelectionManager$Result", "Landroid/os/Parcelable;", "calling_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class CallCountrySelectionManager$Result implements android.os.Parcelable {

    @org.jetbrains.annotations.NotNull
    public static final android.os.Parcelable.Creator<com.truecaller.calling.util.roaming.CallCountrySelectionManager$Result> CREATOR = new cb1.bar(17);
    public final java.lang.Integer a;
    public final java.lang.String b;
    public final java.lang.Boolean c;

    public CallCountrySelectionManager$Result(java.lang.Boolean bool, java.lang.Integer num, java.lang.String str) {
        this.a = num;
        this.b = str;
        this.c = bool;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.truecaller.calling.util.roaming.CallCountrySelectionManager$Result)) {
            return false;
        }
        com.truecaller.calling.util.roaming.CallCountrySelectionManager$Result callCountrySelectionManager$Result = (com.truecaller.calling.util.roaming.CallCountrySelectionManager$Result) obj;
        return kotlin.jvm.internal.Intrinsics.b(this.a, callCountrySelectionManager$Result.a) && kotlin.jvm.internal.Intrinsics.b(this.b, callCountrySelectionManager$Result.b) && kotlin.jvm.internal.Intrinsics.b(this.c, callCountrySelectionManager$Result.c);
    }

    public final int hashCode() {
        java.lang.Integer num = this.a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        java.lang.String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.Boolean bool = this.c;
        return hashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "Result(simSlotIndex=" + this.a + ", numberToCall=" + this.b + ", shouldLogTapToPasteDismissed=" + this.c + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "dest");
        java.lang.Integer num = this.a;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            z0.a0.j(parcel, 1, num);
        }
        parcel.writeString(this.b);
        java.lang.Boolean bool = this.c;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
    }
}
