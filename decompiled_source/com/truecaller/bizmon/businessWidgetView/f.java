package com.truecaller.bizmon.businessWidgetView;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class f implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final java.lang.Object createFromParcel(android.os.Parcel parcel) {
        boolean z;
        boolean z2;
        boolean z3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "parcel");
        com.truecaller.data.entity.Contact readParcelable = parcel.readParcelable(com.truecaller.bizmon.businessWidgetView.BizMultiViewConfig.BizViewAcsConfig.class.getClassLoader());
        java.lang.String readString = parcel.readString();
        boolean z4 = false;
        if (parcel.readInt() != 0) {
            z = false;
            z4 = true;
            z2 = true;
        } else {
            z = false;
            z2 = true;
        }
        int readInt = parcel.readInt();
        if (parcel.readInt() != 0) {
            z3 = z2;
        } else {
            z3 = z2;
            z2 = z;
        }
        if (parcel.readInt() == 0) {
            z3 = z;
        }
        return new com.truecaller.bizmon.businessWidgetView.BizMultiViewConfig.BizViewAcsConfig(readParcelable, readString, z4, readInt, z2, z3);
    }

    @Override // android.os.Parcelable.Creator
    public final java.lang.Object[] newArray(int i) {
        return new com.truecaller.bizmon.businessWidgetView.BizMultiViewConfig.BizViewAcsConfig[i];
    }
}
