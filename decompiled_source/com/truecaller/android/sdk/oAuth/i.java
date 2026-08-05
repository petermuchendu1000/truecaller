package com.truecaller.android.sdk.oAuth;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class i implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.readInt();
        return com.truecaller.android.sdk.oAuth.TcOAuthError.DeviceNotSupported.INSTANCE;
    }

    @Override // android.os.Parcelable.Creator
    public final java.lang.Object[] newArray(int i) {
        return new com.truecaller.android.sdk.oAuth.TcOAuthError.DeviceNotSupported[i];
    }
}
