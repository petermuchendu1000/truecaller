package com.truecaller.blocking.ui;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class d implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.readInt();
        return com.truecaller.blocking.ui.BlockRequest.SuggestedNameReplacePolicy.Always.a;
    }

    @Override // android.os.Parcelable.Creator
    public final java.lang.Object[] newArray(int i) {
        return new com.truecaller.blocking.ui.BlockRequest.SuggestedNameReplacePolicy.Always[i];
    }
}
