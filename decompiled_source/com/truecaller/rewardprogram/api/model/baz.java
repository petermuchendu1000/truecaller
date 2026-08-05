package com.truecaller.rewardprogram.api.model;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class baz implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final java.lang.Object createFromParcel(android.os.Parcel parcel) {
        com.truecaller.rewardprogram.api.model.ProgressConfig.ClaimableRewardConfig createFromParcel;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "parcel");
        long readLong = parcel.readLong();
        if (parcel.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = com.truecaller.rewardprogram.api.model.ProgressConfig.ClaimableRewardConfig.CREATOR.createFromParcel(parcel);
        }
        return new com.truecaller.rewardprogram.api.model.ProgressConfig(readLong, createFromParcel, parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
    }

    @Override // android.os.Parcelable.Creator
    public final java.lang.Object[] newArray(int i) {
        return new com.truecaller.rewardprogram.api.model.ProgressConfig[i];
    }
}
