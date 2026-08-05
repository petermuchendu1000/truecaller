package com.truecaller.videocallerid.data;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/truecaller/videocallerid/data/VideoDetails;", "Landroid/os/Parcelable;", "video-caller-id_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final /* data */ class VideoDetails implements android.os.Parcelable {

    @org.jetbrains.annotations.NotNull
    public static final android.os.Parcelable.Creator<com.truecaller.videocallerid.data.VideoDetails> CREATOR = new f22.bar(1);
    public final java.lang.String a;
    public final java.lang.String b;
    public final long c;
    public final long d;
    public final boolean e;
    public final java.lang.String f;
    public final java.lang.String g;

    public VideoDetails(java.lang.String str, java.lang.String str2, long j, long j2, boolean z, java.lang.String str3, java.lang.String str4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "videoUrl");
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = j2;
        this.e = z;
        this.f = str3;
        this.g = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.truecaller.videocallerid.data.VideoDetails)) {
            return false;
        }
        com.truecaller.videocallerid.data.VideoDetails videoDetails = (com.truecaller.videocallerid.data.VideoDetails) obj;
        return kotlin.jvm.internal.Intrinsics.b(this.a, videoDetails.a) && kotlin.jvm.internal.Intrinsics.b(this.b, videoDetails.b) && this.c == videoDetails.c && this.d == videoDetails.d && this.e == videoDetails.e && kotlin.jvm.internal.Intrinsics.b(this.f, videoDetails.f) && kotlin.jvm.internal.Intrinsics.b(this.g, videoDetails.g);
    }

    public final int hashCode() {
        int hashCode;
        int i;
        int hashCode2;
        int hashCode3 = this.a.hashCode() * 31;
        int i2 = 0;
        java.lang.String str = this.b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i3 = (hashCode3 + hashCode) * 31;
        long j = this.c;
        int i4 = (i3 + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.d;
        int i5 = (i4 + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        if (this.e) {
            i = 1231;
        } else {
            i = 1237;
        }
        int i6 = (i5 + i) * 31;
        java.lang.String str2 = this.f;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i7 = (i6 + hashCode2) * 31;
        java.lang.String str3 = this.g;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        return i7 + i2;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder E = ro0.f.E("VideoDetails(videoUrl=", this.a, ", videoLandscapeUrl=", this.b, ", sizeBytes=");
        E.append(this.c);
        ro0.f.L(E, ", durationMillis=", this.d, ", mirrorPlayback=");
        ro0.f.J(", filterId=", this.f, ", filterName=", E, this.e);
        return bar.v(this.g, ")", E);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "dest");
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeLong(this.c);
        parcel.writeLong(this.d);
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
    }
}
