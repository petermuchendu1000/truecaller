package com.truecaller.contact.entity.model;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class a implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final java.lang.Object createFromParcel(android.os.Parcel parcel) {
        com.truecaller.contact.entity.model.DataEntityPrimaryFields createFromParcel;
        java.util.ArrayList arrayList;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "parcel");
        com.truecaller.contact.entity.model.BusinessProfileEntity.MessageCta messageCta = null;
        if (parcel.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = com.truecaller.contact.entity.model.DataEntityPrimaryFields.CREATOR.createFromParcel(parcel);
        }
        com.truecaller.contact.entity.model.DataEntityPrimaryFields dataEntityPrimaryFields = createFromParcel;
        int readInt = parcel.readInt();
        java.util.ArrayList arrayList2 = new java.util.ArrayList(readInt);
        int i = 0;
        int i2 = 0;
        while (i2 != readInt) {
            i2 = z0.a0.b(com.truecaller.contact.entity.model.BusinessProfileEntity.MediaCallerId.CREATOR, parcel, arrayList2, i2, 1);
        }
        int readInt2 = parcel.readInt();
        java.util.ArrayList arrayList3 = new java.util.ArrayList(readInt2);
        int i3 = 0;
        while (i3 != readInt2) {
            i3 = z0.a0.b(com.truecaller.contact.entity.model.BusinessProfileEntity.AppStore.CREATOR, parcel, arrayList3, i3, 1);
        }
        int readInt3 = parcel.readInt();
        java.util.ArrayList arrayList4 = new java.util.ArrayList(readInt3);
        int i4 = 0;
        while (i4 != readInt3) {
            i4 = z0.a0.b(com.truecaller.contact.entity.model.BusinessProfileEntity.BrandedMedia.CREATOR, parcel, arrayList4, i4, 1);
        }
        java.lang.String readString = parcel.readString();
        if (parcel.readInt() == 0) {
            arrayList = null;
        } else {
            int readInt4 = parcel.readInt();
            java.util.ArrayList arrayList5 = new java.util.ArrayList(readInt4);
            while (i != readInt4) {
                i = z0.a0.b(com.truecaller.contact.entity.model.BusinessProfileEntity.AlternatePhoneNumber.CREATOR, parcel, arrayList5, i, 1);
            }
            arrayList = arrayList5;
        }
        if (parcel.readInt() != 0) {
            messageCta = com.truecaller.contact.entity.model.BusinessProfileEntity.MessageCta.CREATOR.createFromParcel(parcel);
        }
        return new com.truecaller.contact.entity.model.BusinessProfileEntity(dataEntityPrimaryFields, arrayList2, arrayList3, arrayList4, readString, arrayList, messageCta);
    }

    @Override // android.os.Parcelable.Creator
    public final java.lang.Object[] newArray(int i) {
        return new com.truecaller.contact.entity.model.BusinessProfileEntity[i];
    }
}
