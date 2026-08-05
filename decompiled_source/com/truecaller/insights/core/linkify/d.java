package com.truecaller.insights.core.linkify;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class d implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "parcel");
        return new com.truecaller.insights.core.linkify.InsightsSpanAction.OpenAction(parcel.readString(), com.truecaller.insights.core.linkify.UrlType.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final java.lang.Object[] newArray(int i) {
        return new com.truecaller.insights.core.linkify.InsightsSpanAction.OpenAction[i];
    }
}
