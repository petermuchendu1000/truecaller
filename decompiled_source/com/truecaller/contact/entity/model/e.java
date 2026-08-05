package com.truecaller.contact.entity.model;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class e implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final java.lang.Object createFromParcel(android.os.Parcel parcel) {
        com.truecaller.contact.entity.model.DataEntityPrimaryFields createFromParcel;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "parcel");
        if (parcel.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = com.truecaller.contact.entity.model.DataEntityPrimaryFields.CREATOR.createFromParcel(parcel);
        }
        return new com.truecaller.contact.entity.model.FeedbackEntity.ReviewsEntity(createFromParcel);
    }

    @Override // android.os.Parcelable.Creator
    public final java.lang.Object[] newArray(int i) {
        return new com.truecaller.contact.entity.model.FeedbackEntity.ReviewsEntity[i];
    }
}
