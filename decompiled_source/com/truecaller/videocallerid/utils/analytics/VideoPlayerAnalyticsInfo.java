package com.truecaller.videocallerid.utils.analytics;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u0012\u001a\u00020\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001J\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u001f"}, d2 = {"Lcom/truecaller/videocallerid/utils/analytics/VideoPlayerAnalyticsInfo;", "Landroid/os/Parcelable;", "context", "Lcom/truecaller/videocallerid/utils/analytics/VideoPlayerContext;", "callId", "", "videoId", "<init>", "(Lcom/truecaller/videocallerid/utils/analytics/VideoPlayerContext;Ljava/lang/String;Ljava/lang/String;)V", "getContext", "()Lcom/truecaller/videocallerid/utils/analytics/VideoPlayerContext;", "getCallId", "()Ljava/lang/String;", "getVideoId", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "video-caller-id_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final /* data */ class VideoPlayerAnalyticsInfo implements android.os.Parcelable {
    public static final int $stable = 8;

    @org.jetbrains.annotations.NotNull
    public static final android.os.Parcelable.Creator<com.truecaller.videocallerid.utils.analytics.VideoPlayerAnalyticsInfo> CREATOR = new rz0.b0(3);

    @org.jetbrains.annotations.Nullable
    private final java.lang.String callId;

    @org.jetbrains.annotations.NotNull
    private final com.truecaller.videocallerid.utils.analytics.VideoPlayerContext context;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String videoId;

    public VideoPlayerAnalyticsInfo(@org.jetbrains.annotations.NotNull com.truecaller.videocallerid.utils.analytics.VideoPlayerContext videoPlayerContext, @org.jetbrains.annotations.Nullable java.lang.String str, @org.jetbrains.annotations.NotNull java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(videoPlayerContext, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "videoId");
        this.context = videoPlayerContext;
        this.callId = str;
        this.videoId = str2;
    }

    public static /* synthetic */ com.truecaller.videocallerid.utils.analytics.VideoPlayerAnalyticsInfo copy$default(com.truecaller.videocallerid.utils.analytics.VideoPlayerAnalyticsInfo videoPlayerAnalyticsInfo, com.truecaller.videocallerid.utils.analytics.VideoPlayerContext videoPlayerContext, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            videoPlayerContext = videoPlayerAnalyticsInfo.context;
        }
        if ((i & 2) != 0) {
            str = videoPlayerAnalyticsInfo.callId;
        }
        if ((i & 4) != 0) {
            str2 = videoPlayerAnalyticsInfo.videoId;
        }
        return videoPlayerAnalyticsInfo.copy(videoPlayerContext, str, str2);
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component1, reason: from getter */
    public final com.truecaller.videocallerid.utils.analytics.VideoPlayerContext getContext() {
        return this.context;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component2, reason: from getter */
    public final java.lang.String getCallId() {
        return this.callId;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component3, reason: from getter */
    public final java.lang.String getVideoId() {
        return this.videoId;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.videocallerid.utils.analytics.VideoPlayerAnalyticsInfo copy(@org.jetbrains.annotations.NotNull com.truecaller.videocallerid.utils.analytics.VideoPlayerContext context, @org.jetbrains.annotations.Nullable java.lang.String callId, @org.jetbrains.annotations.NotNull java.lang.String videoId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(videoId, "videoId");
        return new com.truecaller.videocallerid.utils.analytics.VideoPlayerAnalyticsInfo(context, callId, videoId);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.videocallerid.utils.analytics.VideoPlayerAnalyticsInfo)) {
            return false;
        }
        com.truecaller.videocallerid.utils.analytics.VideoPlayerAnalyticsInfo videoPlayerAnalyticsInfo = (com.truecaller.videocallerid.utils.analytics.VideoPlayerAnalyticsInfo) other;
        return this.context == videoPlayerAnalyticsInfo.context && kotlin.jvm.internal.Intrinsics.b(this.callId, videoPlayerAnalyticsInfo.callId) && kotlin.jvm.internal.Intrinsics.b(this.videoId, videoPlayerAnalyticsInfo.videoId);
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getCallId() {
        return this.callId;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.videocallerid.utils.analytics.VideoPlayerContext getContext() {
        return this.context;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getVideoId() {
        return this.videoId;
    }

    public int hashCode() {
        int hashCode = this.context.hashCode() * 31;
        java.lang.String str = this.callId;
        return this.videoId.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        com.truecaller.videocallerid.utils.analytics.VideoPlayerContext videoPlayerContext = this.context;
        java.lang.String str = this.callId;
        java.lang.String str2 = this.videoId;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("VideoPlayerAnalyticsInfo(context=");
        sb.append(videoPlayerContext);
        sb.append(", callId=");
        sb.append(str);
        sb.append(", videoId=");
        return bar.v(str2, ")", sb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@org.jetbrains.annotations.NotNull android.os.Parcel dest, int flags) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dest, "dest");
        this.context.writeToParcel(dest, flags);
        dest.writeString(this.callId);
        dest.writeString(this.videoId);
    }
}
