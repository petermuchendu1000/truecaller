package com.truecaller.videocallerid.utils.analytics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\u0011\u001a\u00020\u0012J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0012R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0018"}, d2 = {"Lcom/truecaller/videocallerid/utils/analytics/VideoPlayerContext;", "Landroid/os/Parcelable;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "INCALLUI", "POPUP_CALLER_ID", "FACS", "PACS", "ExpandingPACS", "PCID_LANDSCAPE", "INCALL_NOTIF_SERVICE", "DEBUG_DIALOG", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "video-caller-id_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class VideoPlayerContext implements android.os.Parcelable {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.videocallerid.utils.analytics.VideoPlayerContext[] $VALUES;

    @org.jetbrains.annotations.NotNull
    public static final android.os.Parcelable.Creator<com.truecaller.videocallerid.utils.analytics.VideoPlayerContext> CREATOR;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String value;
    public static final com.truecaller.videocallerid.utils.analytics.VideoPlayerContext INCALLUI = new com.truecaller.videocallerid.utils.analytics.VideoPlayerContext("INCALLUI", 0, "InCallUI");
    public static final com.truecaller.videocallerid.utils.analytics.VideoPlayerContext POPUP_CALLER_ID = new com.truecaller.videocallerid.utils.analytics.VideoPlayerContext("POPUP_CALLER_ID", 1, "PopUp");
    public static final com.truecaller.videocallerid.utils.analytics.VideoPlayerContext FACS = new com.truecaller.videocallerid.utils.analytics.VideoPlayerContext("FACS", 2, "FACS");
    public static final com.truecaller.videocallerid.utils.analytics.VideoPlayerContext PACS = new com.truecaller.videocallerid.utils.analytics.VideoPlayerContext("PACS", 3, "PACS");
    public static final com.truecaller.videocallerid.utils.analytics.VideoPlayerContext ExpandingPACS = new com.truecaller.videocallerid.utils.analytics.VideoPlayerContext("ExpandingPACS", 4, "ExpandingPACS");
    public static final com.truecaller.videocallerid.utils.analytics.VideoPlayerContext PCID_LANDSCAPE = new com.truecaller.videocallerid.utils.analytics.VideoPlayerContext("PCID_LANDSCAPE", 5, "PCID_Landscape");
    public static final com.truecaller.videocallerid.utils.analytics.VideoPlayerContext INCALL_NOTIF_SERVICE = new com.truecaller.videocallerid.utils.analytics.VideoPlayerContext("INCALL_NOTIF_SERVICE", 6, "InCallNotifService");
    public static final com.truecaller.videocallerid.utils.analytics.VideoPlayerContext DEBUG_DIALOG = new com.truecaller.videocallerid.utils.analytics.VideoPlayerContext("DEBUG_DIALOG", 7, "DebugDialog");

    private static final /* synthetic */ com.truecaller.videocallerid.utils.analytics.VideoPlayerContext[] $values() {
        return new com.truecaller.videocallerid.utils.analytics.VideoPlayerContext[]{INCALLUI, POPUP_CALLER_ID, FACS, PACS, ExpandingPACS, PCID_LANDSCAPE, INCALL_NOTIF_SERVICE, DEBUG_DIALOG};
    }

    static {
        com.truecaller.videocallerid.utils.analytics.VideoPlayerContext[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
        CREATOR = new rz0.b0(4);
    }

    private VideoPlayerContext(java.lang.String str, int i, java.lang.String str2) {
        this.value = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.videocallerid.utils.analytics.VideoPlayerContext valueOf(java.lang.String str) {
        return (com.truecaller.videocallerid.utils.analytics.VideoPlayerContext) java.lang.Enum.valueOf(com.truecaller.videocallerid.utils.analytics.VideoPlayerContext.class, str);
    }

    public static com.truecaller.videocallerid.utils.analytics.VideoPlayerContext[] values() {
        return (com.truecaller.videocallerid.utils.analytics.VideoPlayerContext[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getValue() {
        return this.value;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@org.jetbrains.annotations.NotNull android.os.Parcel dest, int flags) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(name());
    }
}
