package com.truecaller.calling.missedcallreminder;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public class MissedCallReminder implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.truecaller.calling.missedcallreminder.MissedCallReminder> CREATOR = new cb1.bar(9);
    public static int e;

    @bw.qux(alternate = {"a"}, value = "rawNumber")
    public java.lang.String a;

    @bw.qux(alternate = {"b"}, value = "normalizedNumber")
    public java.lang.String b;

    @bw.qux(alternate = {"c"}, value = "timestamp")
    public long c;

    @bw.qux(alternate = {"d"}, value = "notificationId")
    public int d;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeLong(this.c);
        parcel.writeInt(this.d);
    }
}
