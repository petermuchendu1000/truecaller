package com.truecaller.ads.postclickexperience.dto;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class qux implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final java.lang.Object createFromParcel(android.os.Parcel parcel) {
        java.util.ArrayList arrayList;
        com.truecaller.ads.postclickexperience.dto.Component.OnClick createFromParcel;
        boolean z;
        java.lang.Boolean valueOf;
        boolean z2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "parcel");
        java.lang.String readString = parcel.readString();
        java.lang.String readString2 = parcel.readString();
        java.lang.String readString3 = parcel.readString();
        java.lang.String readString4 = parcel.readString();
        java.lang.String readString5 = parcel.readString();
        java.lang.String readString6 = parcel.readString();
        java.lang.String readString7 = parcel.readString();
        java.lang.String readString8 = parcel.readString();
        java.util.ArrayList<java.lang.String> createStringArrayList = parcel.createStringArrayList();
        java.lang.Integer num = null;
        if (parcel.readInt() == 0) {
            arrayList = null;
        } else {
            int readInt = parcel.readInt();
            java.util.ArrayList arrayList2 = new java.util.ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = z0.a0.b(com.truecaller.ads.postclickexperience.dto.Component.CREATOR, parcel, arrayList2, i, 1);
            }
            arrayList = arrayList2;
        }
        if (parcel.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = com.truecaller.ads.postclickexperience.dto.Component.OnClick.CREATOR.createFromParcel(parcel);
        }
        com.truecaller.ads.postclickexperience.dto.Component.OnClick onClick = createFromParcel;
        java.lang.String readString9 = parcel.readString();
        if (parcel.readInt() == 0) {
            valueOf = null;
        } else {
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            valueOf = java.lang.Boolean.valueOf(z);
        }
        java.lang.String readString10 = parcel.readString();
        java.lang.String readString11 = parcel.readString();
        java.lang.String readString12 = parcel.readString();
        java.lang.String readString13 = parcel.readString();
        java.lang.String readString14 = parcel.readString();
        java.lang.String readString15 = parcel.readString();
        java.lang.String readString16 = parcel.readString();
        java.lang.String readString17 = parcel.readString();
        if (parcel.readInt() != 0) {
            num = java.lang.Integer.valueOf(parcel.readInt());
        }
        int readInt2 = parcel.readInt();
        if (parcel.readInt() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        return new com.truecaller.ads.postclickexperience.dto.Component(readString, readString2, readString3, readString4, readString5, readString6, readString7, readString8, createStringArrayList, arrayList, onClick, readString9, valueOf, readString10, readString11, readString12, readString13, readString14, readString15, readString16, readString17, num, readInt2, z2);
    }

    @Override // android.os.Parcelable.Creator
    public final java.lang.Object[] newArray(int i) {
        return new com.truecaller.ads.postclickexperience.dto.Component[i];
    }
}
