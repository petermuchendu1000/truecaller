package com.truecaller.data.entity;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/truecaller/data/entity/CallRecording;", "Landroid/os/Parcelable;", "data_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final /* data */ class CallRecording implements android.os.Parcelable {

    @org.jetbrains.annotations.NotNull
    public static final android.os.Parcelable.Creator<com.truecaller.data.entity.CallRecording> CREATOR = new om0.bar(9);
    public final long a;
    public final java.lang.String b;
    public final java.lang.String c;

    public CallRecording(long j, java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "absolutePath");
        this.a = j;
        this.b = str;
        this.c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.truecaller.data.entity.CallRecording)) {
            return false;
        }
        com.truecaller.data.entity.CallRecording callRecording = (com.truecaller.data.entity.CallRecording) obj;
        return this.a == callRecording.a && kotlin.jvm.internal.Intrinsics.b(this.b, callRecording.b) && kotlin.jvm.internal.Intrinsics.b(this.c, callRecording.c);
    }

    public final int hashCode() {
        int hashCode;
        long j = this.a;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        java.lang.String str = this.b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return this.c.hashCode() + ((i + hashCode) * 31);
    }

    public final java.lang.String toString() {
        return y.o.f(", absolutePath=", this.c, ")", com.appsflyer.internal.e.p("CallRecording(rowId=", this.a, ", historyEventId=", this.b));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "dest");
        parcel.writeLong(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
    }
}
