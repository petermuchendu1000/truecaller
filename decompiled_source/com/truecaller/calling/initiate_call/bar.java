package com.truecaller.calling.initiate_call;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class bar implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.readInt();
        return com.truecaller.calling.initiate_call.InitiateCallHelper$CallContextOption.ShowOnBoarded.a;
    }

    @Override // android.os.Parcelable.Creator
    public final java.lang.Object[] newArray(int i) {
        return new com.truecaller.calling.initiate_call.InitiateCallHelper$CallContextOption.ShowOnBoarded[i];
    }
}
