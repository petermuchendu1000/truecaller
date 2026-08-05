package com.truecaller.blocking.ui;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class b implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "parcel");
        int readInt = parcel.readInt();
        java.util.ArrayList arrayList = new java.util.ArrayList(readInt);
        int i = 0;
        while (i != readInt) {
            i = z0.a0.b(com.truecaller.blocking.ui.BlockRequest.BlockPolicy.NumbersAndNames.Data.CREATOR, parcel, arrayList, i, 1);
        }
        return new com.truecaller.blocking.ui.BlockRequest.BlockPolicy.NumbersAndNames(arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final java.lang.Object[] newArray(int i) {
        return new com.truecaller.blocking.ui.BlockRequest.BlockPolicy.NumbersAndNames[i];
    }
}
