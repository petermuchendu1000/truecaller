package com.truecaller.videocallerid.ui.fullscreenpopupvideo;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class b implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final java.lang.Object createFromParcel(android.os.Parcel parcel) {
        com.truecaller.videocallerid.utils.analytics.VideoPlayerAnalyticsInfo createFromParcel;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "parcel");
        java.lang.String readString = parcel.readString();
        if (parcel.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = com.truecaller.videocallerid.utils.analytics.VideoPlayerAnalyticsInfo.CREATOR.createFromParcel(parcel);
        }
        return new com.truecaller.videocallerid.ui.fullscreenpopupvideo.VideoExpansionType.P2pVideo(readString, createFromParcel);
    }

    @Override // android.os.Parcelable.Creator
    public final java.lang.Object[] newArray(int i) {
        return new com.truecaller.videocallerid.ui.fullscreenpopupvideo.VideoExpansionType.P2pVideo[i];
    }
}
