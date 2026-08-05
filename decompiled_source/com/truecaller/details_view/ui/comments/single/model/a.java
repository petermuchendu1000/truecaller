package com.truecaller.details_view.ui.comments.single.model;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class a implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "parcel");
        return new com.truecaller.details_view.ui.comments.single.model.ThumbState.ThumbUpPressed(parcel.readInt(), parcel.readString(), parcel.readInt(), parcel.readInt());
    }

    @Override // android.os.Parcelable.Creator
    public final java.lang.Object[] newArray(int i) {
        return new com.truecaller.details_view.ui.comments.single.model.ThumbState.ThumbUpPressed[i];
    }
}
