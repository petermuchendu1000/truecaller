package com.truecaller.data.entity.assistant;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/truecaller/data/entity/assistant/ScreenedCallAcsDetails;", "Landroid/os/Parcelable;", "data_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final /* data */ class ScreenedCallAcsDetails implements android.os.Parcelable {

    @org.jetbrains.annotations.NotNull
    public static final android.os.Parcelable.Creator<com.truecaller.data.entity.assistant.ScreenedCallAcsDetails> CREATOR = new om0.bar(25);

    @org.jetbrains.annotations.NotNull
    public static final android.os.Parcelable.Creator<com.truecaller.data.entity.assistant.ScreenedCallAcsDetails> Creator = new om0.bar(24);
    public final java.lang.String a;
    public final java.lang.String b;
    public final java.lang.String c;
    public final java.lang.String d;

    public ScreenedCallAcsDetails(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "id");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "fromNumber");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.truecaller.data.entity.assistant.ScreenedCallAcsDetails)) {
            return false;
        }
        com.truecaller.data.entity.assistant.ScreenedCallAcsDetails screenedCallAcsDetails = (com.truecaller.data.entity.assistant.ScreenedCallAcsDetails) obj;
        return kotlin.jvm.internal.Intrinsics.b(this.a, screenedCallAcsDetails.a) && kotlin.jvm.internal.Intrinsics.b(this.b, screenedCallAcsDetails.b) && kotlin.jvm.internal.Intrinsics.b(this.c, screenedCallAcsDetails.c) && kotlin.jvm.internal.Intrinsics.b(this.d, screenedCallAcsDetails.d);
    }

    public final int hashCode() {
        int hashCode;
        int e = ax1.bar.e(this.a.hashCode() * 31, 31, this.b);
        int i = 0;
        java.lang.String str = this.c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (e + hashCode) * 31;
        java.lang.String str2 = this.d;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return i2 + i;
    }

    public final java.lang.String toString() {
        return bar.x(ro0.f.E("ScreenedCallAcsDetails(id=", this.a, ", fromNumber=", this.b, ", terminationReason="), this.c, ", messageText=", this.d, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "dest");
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
    }
}
