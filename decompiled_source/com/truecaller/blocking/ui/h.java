package com.truecaller.blocking.ui;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class h implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final java.lang.Object createFromParcel(android.os.Parcel parcel) {
        boolean z;
        boolean z2;
        boolean z3;
        java.lang.Long valueOf;
        boolean z4;
        boolean z5;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "parcel");
        java.lang.String readString = parcel.readString();
        int readInt = parcel.readInt();
        int readInt2 = parcel.readInt();
        java.util.ArrayList arrayList = new java.util.ArrayList(readInt2);
        int i = 0;
        while (true) {
            z = true;
            if (i == readInt2) {
                break;
            }
            i = z0.a0.b(com.truecaller.blocking.ui.BlockResult.BlockedData.CREATOR, parcel, arrayList, i, 1);
        }
        java.lang.String readString2 = parcel.readString();
        if (parcel.readInt() != 0) {
            z2 = true;
        } else {
            z2 = true;
            z = false;
        }
        if (parcel.readInt() != 0) {
            z3 = z2;
        } else {
            z3 = false;
        }
        if (parcel.readInt() == 0) {
            valueOf = null;
        } else {
            valueOf = java.lang.Long.valueOf(parcel.readLong());
        }
        java.lang.String readString3 = parcel.readString();
        if (parcel.readInt() != 0) {
            z4 = z2;
        } else {
            z4 = false;
        }
        if (parcel.readInt() != 0) {
            z5 = z2;
        } else {
            z5 = false;
        }
        return new com.truecaller.blocking.ui.BlockResult(readString, readInt, arrayList, readString2, z, z3, valueOf, readString3, z4, z5, parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final java.lang.Object[] newArray(int i) {
        return new com.truecaller.blocking.ui.BlockResult[i];
    }
}
