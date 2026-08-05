package com.truecaller.videocallerid.ui.fullscreenpopupvideo;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/truecaller/videocallerid/ui/fullscreenpopupvideo/VideoExpansionType;", "Landroid/os/Parcelable;", "BusinessVideoType", "BusinessVideo", "BusinessVideoWithUrl", "P2pVideo", "Lcom/truecaller/videocallerid/ui/fullscreenpopupvideo/VideoExpansionType$BusinessVideo;", "Lcom/truecaller/videocallerid/ui/fullscreenpopupvideo/VideoExpansionType$BusinessVideoWithUrl;", "Lcom/truecaller/videocallerid/ui/fullscreenpopupvideo/VideoExpansionType$P2pVideo;", "video-caller-id_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public abstract class VideoExpansionType implements android.os.Parcelable {
    public static final int $stable = 0;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/truecaller/videocallerid/ui/fullscreenpopupvideo/VideoExpansionType$BusinessVideoType;", "", "<init>", "(Ljava/lang/String;I)V", "LANDSCAPE", "PORTRAIT", "video-caller-id_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
    /* loaded from: /home/user/tc_decoded/classes7.dex */
    public static final class BusinessVideoType {
        private static final /* synthetic */ gf3.bar $ENTRIES;
        private static final /* synthetic */ com.truecaller.videocallerid.ui.fullscreenpopupvideo.VideoExpansionType.BusinessVideoType[] $VALUES;
        public static final com.truecaller.videocallerid.ui.fullscreenpopupvideo.VideoExpansionType.BusinessVideoType LANDSCAPE = new com.truecaller.videocallerid.ui.fullscreenpopupvideo.VideoExpansionType.BusinessVideoType("LANDSCAPE", 0);
        public static final com.truecaller.videocallerid.ui.fullscreenpopupvideo.VideoExpansionType.BusinessVideoType PORTRAIT = new com.truecaller.videocallerid.ui.fullscreenpopupvideo.VideoExpansionType.BusinessVideoType("PORTRAIT", 1);

        private static final /* synthetic */ com.truecaller.videocallerid.ui.fullscreenpopupvideo.VideoExpansionType.BusinessVideoType[] $values() {
            return new com.truecaller.videocallerid.ui.fullscreenpopupvideo.VideoExpansionType.BusinessVideoType[]{LANDSCAPE, PORTRAIT};
        }

        static {
            com.truecaller.videocallerid.ui.fullscreenpopupvideo.VideoExpansionType.BusinessVideoType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = ge0.i.u($values);
        }

        private BusinessVideoType(java.lang.String str, int i) {
        }

        @org.jetbrains.annotations.NotNull
        public static gf3.bar getEntries() {
            return $ENTRIES;
        }

        public static com.truecaller.videocallerid.ui.fullscreenpopupvideo.VideoExpansionType.BusinessVideoType valueOf(java.lang.String str) {
            return (com.truecaller.videocallerid.ui.fullscreenpopupvideo.VideoExpansionType.BusinessVideoType) java.lang.Enum.valueOf(com.truecaller.videocallerid.ui.fullscreenpopupvideo.VideoExpansionType.BusinessVideoType.class, str);
        }

        public static com.truecaller.videocallerid.ui.fullscreenpopupvideo.VideoExpansionType.BusinessVideoType[] values() {
            return (com.truecaller.videocallerid.ui.fullscreenpopupvideo.VideoExpansionType.BusinessVideoType[]) $VALUES.clone();
        }
    }

    @androidx.annotation.Keep
    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001c"}, d2 = {"Lcom/truecaller/videocallerid/ui/fullscreenpopupvideo/VideoExpansionType$P2pVideo;", "Lcom/truecaller/videocallerid/ui/fullscreenpopupvideo/VideoExpansionType;", "url", "", "videoPlayerAnalyticsInfo", "Lcom/truecaller/videocallerid/utils/analytics/VideoPlayerAnalyticsInfo;", "<init>", "(Ljava/lang/String;Lcom/truecaller/videocallerid/utils/analytics/VideoPlayerAnalyticsInfo;)V", "getUrl", "()Ljava/lang/String;", "getVideoPlayerAnalyticsInfo", "()Lcom/truecaller/videocallerid/utils/analytics/VideoPlayerAnalyticsInfo;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "video-caller-id_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
    /* loaded from: /home/user/tc_decoded/classes7.dex */
    public static final /* data */ class P2pVideo extends com.truecaller.videocallerid.ui.fullscreenpopupvideo.VideoExpansionType {
        public static final int $stable = 0;

        @org.jetbrains.annotations.NotNull
        public static final android.os.Parcelable.Creator<com.truecaller.videocallerid.ui.fullscreenpopupvideo.VideoExpansionType.P2pVideo> CREATOR = new java.lang.Object();

        @org.jetbrains.annotations.NotNull
        private final java.lang.String url;

        @org.jetbrains.annotations.Nullable
        private final com.truecaller.videocallerid.utils.analytics.VideoPlayerAnalyticsInfo videoPlayerAnalyticsInfo;

        public P2pVideo(@org.jetbrains.annotations.NotNull java.lang.String str, @org.jetbrains.annotations.Nullable com.truecaller.videocallerid.utils.analytics.VideoPlayerAnalyticsInfo videoPlayerAnalyticsInfo) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "url");
            this.url = str;
            this.videoPlayerAnalyticsInfo = videoPlayerAnalyticsInfo;
        }

        public static /* synthetic */ com.truecaller.videocallerid.ui.fullscreenpopupvideo.VideoExpansionType.P2pVideo copy$default(com.truecaller.videocallerid.ui.fullscreenpopupvideo.VideoExpansionType.P2pVideo p2pVideo, java.lang.String str, com.truecaller.videocallerid.utils.analytics.VideoPlayerAnalyticsInfo videoPlayerAnalyticsInfo, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = p2pVideo.url;
            }
            if ((i & 2) != 0) {
                videoPlayerAnalyticsInfo = p2pVideo.videoPlayerAnalyticsInfo;
            }
            return p2pVideo.copy(str, videoPlayerAnalyticsInfo);
        }

        @org.jetbrains.annotations.NotNull
        /* renamed from: component1, reason: from getter */
        public final java.lang.String getUrl() {
            return this.url;
        }

        @org.jetbrains.annotations.Nullable
        /* renamed from: component2, reason: from getter */
        public final com.truecaller.videocallerid.utils.analytics.VideoPlayerAnalyticsInfo getVideoPlayerAnalyticsInfo() {
            return this.videoPlayerAnalyticsInfo;
        }

        @org.jetbrains.annotations.NotNull
        public final com.truecaller.videocallerid.ui.fullscreenpopupvideo.VideoExpansionType.P2pVideo copy(@org.jetbrains.annotations.NotNull java.lang.String url, @org.jetbrains.annotations.Nullable com.truecaller.videocallerid.utils.analytics.VideoPlayerAnalyticsInfo videoPlayerAnalyticsInfo) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
            return new com.truecaller.videocallerid.ui.fullscreenpopupvideo.VideoExpansionType.P2pVideo(url, videoPlayerAnalyticsInfo);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.truecaller.videocallerid.ui.fullscreenpopupvideo.VideoExpansionType.P2pVideo)) {
                return false;
            }
            com.truecaller.videocallerid.ui.fullscreenpopupvideo.VideoExpansionType.P2pVideo p2pVideo = (com.truecaller.videocallerid.ui.fullscreenpopupvideo.VideoExpansionType.P2pVideo) other;
            return kotlin.jvm.internal.Intrinsics.b(this.url, p2pVideo.url) && kotlin.jvm.internal.Intrinsics.b(this.videoPlayerAnalyticsInfo, p2pVideo.videoPlayerAnalyticsInfo);
        }

        @org.jetbrains.annotations.NotNull
        public final java.lang.String getUrl() {
            return this.url;
        }

        @org.jetbrains.annotations.Nullable
        public final com.truecaller.videocallerid.utils.analytics.VideoPlayerAnalyticsInfo getVideoPlayerAnalyticsInfo() {
            return this.videoPlayerAnalyticsInfo;
        }

        public int hashCode() {
            int hashCode = this.url.hashCode() * 31;
            com.truecaller.videocallerid.utils.analytics.VideoPlayerAnalyticsInfo videoPlayerAnalyticsInfo = this.videoPlayerAnalyticsInfo;
            return hashCode + (videoPlayerAnalyticsInfo == null ? 0 : videoPlayerAnalyticsInfo.hashCode());
        }

        @org.jetbrains.annotations.NotNull
        public java.lang.String toString() {
            return "P2pVideo(url=" + this.url + ", videoPlayerAnalyticsInfo=" + this.videoPlayerAnalyticsInfo + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@org.jetbrains.annotations.NotNull android.os.Parcel dest, int flags) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.url);
            com.truecaller.videocallerid.utils.analytics.VideoPlayerAnalyticsInfo videoPlayerAnalyticsInfo = this.videoPlayerAnalyticsInfo;
            if (videoPlayerAnalyticsInfo == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                videoPlayerAnalyticsInfo.writeToParcel(dest, flags);
            }
        }
    }

    @androidx.annotation.Keep
    @kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003JA\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0006\u0010\u001a\u001a\u00020\u001bJ\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020\u001bHÖ\u0001J\t\u0010!\u001a\u00020\u0005HÖ\u0001J\u0016\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u001bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000f¨\u0006'"}, d2 = {"Lcom/truecaller/videocallerid/ui/fullscreenpopupvideo/VideoExpansionType$BusinessVideo;", "Lcom/truecaller/videocallerid/ui/fullscreenpopupvideo/VideoExpansionType;", "contact", "Lcom/truecaller/data/entity/Contact;", "normalizedNumber", "", com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_AD_TYPE, "Lcom/truecaller/videocallerid/ui/fullscreenpopupvideo/VideoExpansionType$BusinessVideoType;", "url", "identifier", "<init>", "(Lcom/truecaller/data/entity/Contact;Ljava/lang/String;Lcom/truecaller/videocallerid/ui/fullscreenpopupvideo/VideoExpansionType$BusinessVideoType;Ljava/lang/String;Ljava/lang/String;)V", "getContact", "()Lcom/truecaller/data/entity/Contact;", "getNormalizedNumber", "()Ljava/lang/String;", "getType", "()Lcom/truecaller/videocallerid/ui/fullscreenpopupvideo/VideoExpansionType$BusinessVideoType;", "getUrl", "getIdentifier", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "video-caller-id_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
    /* loaded from: /home/user/tc_decoded/classes7.dex */
    public static final /* data */ class BusinessVideo extends com.truecaller.videocallerid.ui.fullscreenpopupvideo.VideoExpansionType {
        public static final int $stable = 8;

        @org.jetbrains.annotations.NotNull
        public static final android.os.Parcelable.Creator<com.truecaller.videocallerid.ui.fullscreenpopupvideo.VideoExpansionType.BusinessVideo> CREATOR = new java.lang.Object();

        @org.jetbrains.annotations.NotNull
        private final com.truecaller.data.entity.Contact contact;

        @org.jetbrains.annotations.Nullable
        private final java.lang.String identifier;

        @org.jetbrains.annotations.Nullable
        private final java.lang.String normalizedNumber;

        @org.jetbrains.annotations.NotNull
        private final com.truecaller.videocallerid.ui.fullscreenpopupvideo.VideoExpansionType.BusinessVideoType type;

        @org.jetbrains.annotations.Nullable
        private final java.lang.String url;

        public BusinessVideo(@org.jetbrains.annotations.NotNull com.truecaller.data.entity.Contact contact, @org.jetbrains.annotations.Nullable java.lang.String str, @org.jetbrains.annotations.NotNull com.truecaller.videocallerid.ui.fullscreenpopupvideo.VideoExpansionType.BusinessVideoType businessVideoType, @org.jetbrains.annotations.Nullable java.lang.String str2, @org.jetbrains.annotations.Nullable java.lang.String str3) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contact, "contact");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(businessVideoType, com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_AD_TYPE);
            this.contact = contact;
            this.normalizedNumber = str;
            this.type = businessVideoType;
            this.url = str2;
            this.identifier = str3;
        }

        public static /* synthetic */ com.truecaller.videocallerid.ui.fullscreenpopupvideo.VideoExpansionType.BusinessVideo copy$default(com.truecaller.videocallerid.ui.fullscreenpopupvideo.VideoExpansionType.BusinessVideo businessVideo, com.truecaller.data.entity.Contact contact, java.lang.String str, com.truecaller.videocallerid.ui.fullscreenpopupvideo.VideoExpansionType.BusinessVideoType businessVideoType, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                contact = businessVideo.contact;
            }
            if ((i & 2) != 0) {
                str = businessVideo.normalizedNumber;
            }
            if ((i & 4) != 0) {
                businessVideoType = businessVideo.type;
            }
            if ((i & 8) != 0) {
                str2 = businessVideo.url;
            }
            if ((i & 16) != 0) {
                str3 = businessVideo.identifier;
            }
            java.lang.String str4 = str3;
            com.truecaller.videocallerid.ui.fullscreenpopupvideo.VideoExpansionType.BusinessVideoType businessVideoType2 = businessVideoType;
            return businessVideo.copy(contact, str, businessVideoType2, str2, str4);
        }

        @org.jetbrains.annotations.NotNull
        /* renamed from: component1, reason: from getter */
        public final com.truecaller.data.entity.Contact getContact() {
            return this.contact;
        }

        @org.jetbrains.annotations.Nullable
        /* renamed from: component2, reason: from getter */
        public final java.lang.String getNormalizedNumber() {
            return this.normalizedNumber;
        }

        @org.jetbrains.annotations.NotNull
        /* renamed from: component3, reason: from getter */
        public final com.truecaller.videocallerid.ui.fullscreenpopupvideo.VideoExpansionType.BusinessVideoType getType() {
            return this.type;
        }

        @org.jetbrains.annotations.Nullable
        /* renamed from: component4, reason: from getter */
        public final java.lang.String getUrl() {
            return this.url;
        }

        @org.jetbrains.annotations.Nullable
        /* renamed from: component5, reason: from getter */
        public final java.lang.String getIdentifier() {
            return this.identifier;
        }

        @org.jetbrains.annotations.NotNull
        public final com.truecaller.videocallerid.ui.fullscreenpopupvideo.VideoExpansionType.BusinessVideo copy(@org.jetbrains.annotations.NotNull com.truecaller.data.entity.Contact contact, @org.jetbrains.annotations.Nullable java.lang.String normalizedNumber, @org.jetbrains.annotations.NotNull com.truecaller.videocallerid.ui.fullscreenpopupvideo.VideoExpansionType.BusinessVideoType type, @org.jetbrains.annotations.Nullable java.lang.String url, @org.jetbrains.annotations.Nullable java.lang.String identifier) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contact, "contact");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_AD_TYPE);
            return new com.truecaller.videocallerid.ui.fullscreenpopupvideo.VideoExpansionType.BusinessVideo(contact, normalizedNumber, type, url, identifier);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.truecaller.videocallerid.ui.fullscreenpopupvideo.VideoExpansionType.BusinessVideo)) {
                return false;
            }
            com.truecaller.videocallerid.ui.fullscreenpopupvideo.VideoExpansionType.BusinessVideo businessVideo = (com.truecaller.videocallerid.ui.fullscreenpopupvideo.VideoExpansionType.BusinessVideo) other;
            return kotlin.jvm.internal.Intrinsics.b(this.contact, businessVideo.contact) && kotlin.jvm.internal.Intrinsics.b(this.normalizedNumber, businessVideo.normalizedNumber) && this.type == businessVideo.type && kotlin.jvm.internal.Intrinsics.b(this.url, businessVideo.url) && kotlin.jvm.internal.Intrinsics.b(this.identifier, businessVideo.identifier);
        }

        @org.jetbrains.annotations.NotNull
        public final com.truecaller.data.entity.Contact getContact() {
            return this.contact;
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.String getIdentifier() {
            return this.identifier;
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.String getNormalizedNumber() {
            return this.normalizedNumber;
        }

        @org.jetbrains.annotations.NotNull
        public final com.truecaller.videocallerid.ui.fullscreenpopupvideo.VideoExpansionType.BusinessVideoType getType() {
            return this.type;
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.String getUrl() {
            return this.url;
        }

        public int hashCode() {
            int hashCode = this.contact.hashCode() * 31;
            java.lang.String str = this.normalizedNumber;
            int hashCode2 = (this.type.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
            java.lang.String str2 = this.url;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            java.lang.String str3 = this.identifier;
            return hashCode3 + (str3 != null ? str3.hashCode() : 0);
        }

        @org.jetbrains.annotations.NotNull
        public java.lang.String toString() {
            com.truecaller.data.entity.Contact contact = this.contact;
            java.lang.String str = this.normalizedNumber;
            com.truecaller.videocallerid.ui.fullscreenpopupvideo.VideoExpansionType.BusinessVideoType businessVideoType = this.type;
            java.lang.String str2 = this.url;
            java.lang.String str3 = this.identifier;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("BusinessVideo(contact=");
            sb.append(contact);
            sb.append(", normalizedNumber=");
            sb.append(str);
            sb.append(", type=");
            sb.append(businessVideoType);
            sb.append(", url=");
            sb.append(str2);
            sb.append(", identifier=");
            return bar.v(str3, ")", sb);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@org.jetbrains.annotations.NotNull android.os.Parcel dest, int flags) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.contact, flags);
            dest.writeString(this.normalizedNumber);
            dest.writeString(this.type.name());
            dest.writeString(this.url);
            dest.writeString(this.identifier);
        }

        public /* synthetic */ BusinessVideo(com.truecaller.data.entity.Contact contact, java.lang.String str, com.truecaller.videocallerid.ui.fullscreenpopupvideo.VideoExpansionType.BusinessVideoType businessVideoType, java.lang.String str2, java.lang.String str3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(contact, str, businessVideoType, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3);
        }
    }

    @androidx.annotation.Keep
    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003JC\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u0018\u001a\u00020\u0019J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\u0016\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0019R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006%"}, d2 = {"Lcom/truecaller/videocallerid/ui/fullscreenpopupvideo/VideoExpansionType$BusinessVideoWithUrl;", "Lcom/truecaller/videocallerid/ui/fullscreenpopupvideo/VideoExpansionType;", "normalizedNumber", "", com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_AD_TYPE, "Lcom/truecaller/videocallerid/ui/fullscreenpopupvideo/VideoExpansionType$BusinessVideoType;", "url", "identifier", "businessVideoId", "<init>", "(Ljava/lang/String;Lcom/truecaller/videocallerid/ui/fullscreenpopupvideo/VideoExpansionType$BusinessVideoType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getNormalizedNumber", "()Ljava/lang/String;", "getType", "()Lcom/truecaller/videocallerid/ui/fullscreenpopupvideo/VideoExpansionType$BusinessVideoType;", "getUrl", "getIdentifier", "getBusinessVideoId", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "video-caller-id_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
    /* loaded from: /home/user/tc_decoded/classes7.dex */
    public static final /* data */ class BusinessVideoWithUrl extends com.truecaller.videocallerid.ui.fullscreenpopupvideo.VideoExpansionType {
        public static final int $stable = 8;

        @org.jetbrains.annotations.NotNull
        public static final android.os.Parcelable.Creator<com.truecaller.videocallerid.ui.fullscreenpopupvideo.VideoExpansionType.BusinessVideoWithUrl> CREATOR = new java.lang.Object();

        @org.jetbrains.annotations.Nullable
        private final java.lang.String businessVideoId;

        @org.jetbrains.annotations.Nullable
        private final java.lang.String identifier;

        @org.jetbrains.annotations.Nullable
        private final java.lang.String normalizedNumber;

        @org.jetbrains.annotations.NotNull
        private final com.truecaller.videocallerid.ui.fullscreenpopupvideo.VideoExpansionType.BusinessVideoType type;

        @org.jetbrains.annotations.Nullable
        private final java.lang.String url;

        public BusinessVideoWithUrl(@org.jetbrains.annotations.Nullable java.lang.String str, @org.jetbrains.annotations.NotNull com.truecaller.videocallerid.ui.fullscreenpopupvideo.VideoExpansionType.BusinessVideoType businessVideoType, @org.jetbrains.annotations.Nullable java.lang.String str2, @org.jetbrains.annotations.Nullable java.lang.String str3, @org.jetbrains.annotations.Nullable java.lang.String str4) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(businessVideoType, com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_AD_TYPE);
            this.normalizedNumber = str;
            this.type = businessVideoType;
            this.url = str2;
            this.identifier = str3;
            this.businessVideoId = str4;
        }

        public static /* synthetic */ com.truecaller.videocallerid.ui.fullscreenpopupvideo.VideoExpansionType.BusinessVideoWithUrl copy$default(com.truecaller.videocallerid.ui.fullscreenpopupvideo.VideoExpansionType.BusinessVideoWithUrl businessVideoWithUrl, java.lang.String str, com.truecaller.videocallerid.ui.fullscreenpopupvideo.VideoExpansionType.BusinessVideoType businessVideoType, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = businessVideoWithUrl.normalizedNumber;
            }
            if ((i & 2) != 0) {
                businessVideoType = businessVideoWithUrl.type;
            }
            if ((i & 4) != 0) {
                str2 = businessVideoWithUrl.url;
            }
            if ((i & 8) != 0) {
                str3 = businessVideoWithUrl.identifier;
            }
            if ((i & 16) != 0) {
                str4 = businessVideoWithUrl.businessVideoId;
            }
            java.lang.String str5 = str4;
            java.lang.String str6 = str2;
            return businessVideoWithUrl.copy(str, businessVideoType, str6, str3, str5);
        }

        @org.jetbrains.annotations.Nullable
        /* renamed from: component1, reason: from getter */
        public final java.lang.String getNormalizedNumber() {
            return this.normalizedNumber;
        }

        @org.jetbrains.annotations.NotNull
        /* renamed from: component2, reason: from getter */
        public final com.truecaller.videocallerid.ui.fullscreenpopupvideo.VideoExpansionType.BusinessVideoType getType() {
            return this.type;
        }

        @org.jetbrains.annotations.Nullable
        /* renamed from: component3, reason: from getter */
        public final java.lang.String getUrl() {
            return this.url;
        }

        @org.jetbrains.annotations.Nullable
        /* renamed from: component4, reason: from getter */
        public final java.lang.String getIdentifier() {
            return this.identifier;
        }

        @org.jetbrains.annotations.Nullable
        /* renamed from: component5, reason: from getter */
        public final java.lang.String getBusinessVideoId() {
            return this.businessVideoId;
        }

        @org.jetbrains.annotations.NotNull
        public final com.truecaller.videocallerid.ui.fullscreenpopupvideo.VideoExpansionType.BusinessVideoWithUrl copy(@org.jetbrains.annotations.Nullable java.lang.String normalizedNumber, @org.jetbrains.annotations.NotNull com.truecaller.videocallerid.ui.fullscreenpopupvideo.VideoExpansionType.BusinessVideoType type, @org.jetbrains.annotations.Nullable java.lang.String url, @org.jetbrains.annotations.Nullable java.lang.String identifier, @org.jetbrains.annotations.Nullable java.lang.String businessVideoId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_AD_TYPE);
            return new com.truecaller.videocallerid.ui.fullscreenpopupvideo.VideoExpansionType.BusinessVideoWithUrl(normalizedNumber, type, url, identifier, businessVideoId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.truecaller.videocallerid.ui.fullscreenpopupvideo.VideoExpansionType.BusinessVideoWithUrl)) {
                return false;
            }
            com.truecaller.videocallerid.ui.fullscreenpopupvideo.VideoExpansionType.BusinessVideoWithUrl businessVideoWithUrl = (com.truecaller.videocallerid.ui.fullscreenpopupvideo.VideoExpansionType.BusinessVideoWithUrl) other;
            return kotlin.jvm.internal.Intrinsics.b(this.normalizedNumber, businessVideoWithUrl.normalizedNumber) && this.type == businessVideoWithUrl.type && kotlin.jvm.internal.Intrinsics.b(this.url, businessVideoWithUrl.url) && kotlin.jvm.internal.Intrinsics.b(this.identifier, businessVideoWithUrl.identifier) && kotlin.jvm.internal.Intrinsics.b(this.businessVideoId, businessVideoWithUrl.businessVideoId);
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.String getBusinessVideoId() {
            return this.businessVideoId;
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.String getIdentifier() {
            return this.identifier;
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.String getNormalizedNumber() {
            return this.normalizedNumber;
        }

        @org.jetbrains.annotations.NotNull
        public final com.truecaller.videocallerid.ui.fullscreenpopupvideo.VideoExpansionType.BusinessVideoType getType() {
            return this.type;
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.String getUrl() {
            return this.url;
        }

        public int hashCode() {
            java.lang.String str = this.normalizedNumber;
            int hashCode = (this.type.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31;
            java.lang.String str2 = this.url;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            java.lang.String str3 = this.identifier;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            java.lang.String str4 = this.businessVideoId;
            return hashCode3 + (str4 != null ? str4.hashCode() : 0);
        }

        @org.jetbrains.annotations.NotNull
        public java.lang.String toString() {
            java.lang.String str = this.normalizedNumber;
            com.truecaller.videocallerid.ui.fullscreenpopupvideo.VideoExpansionType.BusinessVideoType businessVideoType = this.type;
            java.lang.String str2 = this.url;
            java.lang.String str3 = this.identifier;
            java.lang.String str4 = this.businessVideoId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("BusinessVideoWithUrl(normalizedNumber=");
            sb.append(str);
            sb.append(", type=");
            sb.append(businessVideoType);
            sb.append(", url=");
            bar.E(sb, str2, ", identifier=", str3, ", businessVideoId=");
            return bar.v(str4, ")", sb);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@org.jetbrains.annotations.NotNull android.os.Parcel dest, int flags) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.normalizedNumber);
            dest.writeString(this.type.name());
            dest.writeString(this.url);
            dest.writeString(this.identifier);
            dest.writeString(this.businessVideoId);
        }

        public /* synthetic */ BusinessVideoWithUrl(java.lang.String str, com.truecaller.videocallerid.ui.fullscreenpopupvideo.VideoExpansionType.BusinessVideoType businessVideoType, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, businessVideoType, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4);
        }
    }
}
