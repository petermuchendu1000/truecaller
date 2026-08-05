package com.truecaller.android.sdk.oAuth;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class g implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "parcel");
        return new com.truecaller.android.sdk.oAuth.TcOAuthError.ApiError(parcel.readInt(), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final java.lang.Object[] newArray(int i) {
        return new com.truecaller.android.sdk.oAuth.TcOAuthError.ApiError[i];
    }
}
