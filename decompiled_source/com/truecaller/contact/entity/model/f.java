package com.truecaller.contact.entity.model;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class f implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final java.lang.Object createFromParcel(android.os.Parcel parcel) {
        com.truecaller.contact.entity.model.DataEntityPrimaryFields createFromParcel;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "parcel");
        if (parcel.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = com.truecaller.contact.entity.model.DataEntityPrimaryFields.CREATOR.createFromParcel(parcel);
        }
        com.truecaller.contact.entity.model.DataEntityPrimaryFields dataEntityPrimaryFields = createFromParcel;
        java.lang.String readString = parcel.readString();
        int readInt = parcel.readInt();
        java.util.ArrayList arrayList = new java.util.ArrayList(readInt);
        int i = 0;
        while (i != readInt) {
            i = z0.a0.b(com.truecaller.contact.entity.model.SearchWarningEntity.Feature.CREATOR, parcel, arrayList, i, 1);
        }
        return new com.truecaller.contact.entity.model.SearchWarningEntity(dataEntityPrimaryFields, readString, arrayList, parcel.readString(), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final java.lang.Object[] newArray(int i) {
        return new com.truecaller.contact.entity.model.SearchWarningEntity[i];
    }
}
