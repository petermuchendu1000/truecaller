package com.truecaller.messaging.data.types;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class baz implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final java.lang.Object createFromParcel(android.os.Parcel parcel) {
        boolean z;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "parcel");
        long readLong = parcel.readLong();
        java.lang.String readString = parcel.readString();
        java.lang.String readString2 = parcel.readString();
        com.truecaller.messaging.data.types.ModalFormSerialized createFromParcel = com.truecaller.messaging.data.types.ModalFormSerialized.CREATOR.createFromParcel(parcel);
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        return new com.truecaller.messaging.data.types.QuickAction.ModalFormQuickAction(readLong, readString, readString2, createFromParcel, z);
    }

    @Override // android.os.Parcelable.Creator
    public final java.lang.Object[] newArray(int i) {
        return new com.truecaller.messaging.data.types.QuickAction.ModalFormQuickAction[i];
    }
}
