package com.truecaller.settings.impl.ui.general;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class a implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.readInt();
        return com.truecaller.settings.impl.ui.general.GeneralSettings.Appearance.Default.a;
    }

    @Override // android.os.Parcelable.Creator
    public final java.lang.Object[] newArray(int i) {
        return new com.truecaller.settings.impl.ui.general.GeneralSettings.Appearance.Default[i];
    }
}
