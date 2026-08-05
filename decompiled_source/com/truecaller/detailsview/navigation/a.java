package com.truecaller.detailsview.navigation;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class a implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.readInt();
        return com.truecaller.detailsview.navigation.DetailsViewIntentBuilder$Action.SaveToHistory.INSTANCE;
    }

    @Override // android.os.Parcelable.Creator
    public final java.lang.Object[] newArray(int i) {
        return new com.truecaller.detailsview.navigation.DetailsViewIntentBuilder$Action.SaveToHistory[i];
    }
}
