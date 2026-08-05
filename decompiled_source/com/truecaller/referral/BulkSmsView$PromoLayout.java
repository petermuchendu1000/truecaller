package com.truecaller.referral;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public class BulkSmsView$PromoLayout implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.truecaller.referral.BulkSmsView$PromoLayout> CREATOR = new cb1.bar(15);
    public final int a;
    public final int[] b;
    public final java.lang.String[] c;
    public final int[] d;
    public final int[] e;
    public final int[] f;

    public BulkSmsView$PromoLayout(int i, int[] iArr, java.lang.String[] strArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        this.a = i;
        this.b = iArr;
        this.c = strArr;
        this.d = iArr2;
        this.e = iArr3;
        this.f = iArr4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeIntArray(this.b);
        parcel.writeStringArray(this.c);
        parcel.writeIntArray(this.d);
        parcel.writeIntArray(this.e);
        parcel.writeIntArray(this.f);
    }

    public BulkSmsView$PromoLayout(android.os.Parcel parcel) {
        this.a = parcel.readInt();
        this.b = parcel.createIntArray();
        this.c = parcel.createStringArray();
        this.d = parcel.createIntArray();
        this.e = parcel.createIntArray();
        this.f = parcel.createIntArray();
    }
}
