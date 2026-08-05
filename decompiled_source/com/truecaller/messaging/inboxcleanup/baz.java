package com.truecaller.messaging.inboxcleanup;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class baz implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.readInt();
        return com.truecaller.messaging.inboxcleanup.CleanupResult.NoPermissionsError.a;
    }

    @Override // android.os.Parcelable.Creator
    public final java.lang.Object[] newArray(int i) {
        return new com.truecaller.messaging.inboxcleanup.CleanupResult.NoPermissionsError[i];
    }
}
