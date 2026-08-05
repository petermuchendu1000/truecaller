package com.truecaller.videocallerid.ui.fullscreenpopupvideo;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class qux implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "parcel");
        return new com.truecaller.videocallerid.ui.fullscreenpopupvideo.VideoExpansionType.BusinessVideo(parcel.readParcelable(com.truecaller.videocallerid.ui.fullscreenpopupvideo.VideoExpansionType.BusinessVideo.class.getClassLoader()), parcel.readString(), com.truecaller.videocallerid.ui.fullscreenpopupvideo.VideoExpansionType.BusinessVideoType.valueOf(parcel.readString()), parcel.readString(), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final java.lang.Object[] newArray(int i) {
        return new com.truecaller.videocallerid.ui.fullscreenpopupvideo.VideoExpansionType.BusinessVideo[i];
    }
}
