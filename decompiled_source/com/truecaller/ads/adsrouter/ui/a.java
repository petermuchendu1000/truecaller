package com.truecaller.ads.adsrouter.ui;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class a implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.readInt();
        return com.truecaller.ads.adsrouter.ui.AdSource.NetworkCache.b;
    }

    @Override // android.os.Parcelable.Creator
    public final java.lang.Object[] newArray(int i) {
        return new com.truecaller.ads.adsrouter.ui.AdSource.NetworkCache[i];
    }
}
