package com.truecaller.common.ui.avatar;

/* loaded from: /home/user/tc_decoded/classes2.dex */
public final class bar implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.readInt();
        return com.truecaller.common.ui.avatar.ManualBlockAvatarPolicy.BlockIconManualBlockAvatarPolicy.a;
    }

    @Override // android.os.Parcelable.Creator
    public final java.lang.Object[] newArray(int i) {
        return new com.truecaller.common.ui.avatar.ManualBlockAvatarPolicy.BlockIconManualBlockAvatarPolicy[i];
    }
}
