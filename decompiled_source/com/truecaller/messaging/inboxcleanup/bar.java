package com.truecaller.messaging.inboxcleanup;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class bar implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final java.lang.Object createFromParcel(android.os.Parcel parcel) {
        boolean z;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "parcel");
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        return new com.truecaller.messaging.inboxcleanup.CleanupResult.GeneralError(z);
    }

    @Override // android.os.Parcelable.Creator
    public final java.lang.Object[] newArray(int i) {
        return new com.truecaller.messaging.inboxcleanup.CleanupResult.GeneralError[i];
    }
}
