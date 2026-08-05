package com.truecaller.blocking.ui;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class c implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "parcel");
        return new com.truecaller.blocking.ui.BlockRequest.BlockPolicy.NumbersAndNames.Data(parcel.readSerializable(), (com.truecaller.blocking.ui.BlockRequest.SuggestedNameReplacePolicy) parcel.readParcelable(com.truecaller.blocking.ui.BlockRequest.BlockPolicy.NumbersAndNames.Data.class.getClassLoader()));
    }

    @Override // android.os.Parcelable.Creator
    public final java.lang.Object[] newArray(int i) {
        return new com.truecaller.blocking.ui.BlockRequest.BlockPolicy.NumbersAndNames.Data[i];
    }
}
