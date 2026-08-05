package com.truecaller.ads.vast;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0012\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/truecaller/ads/vast/MediaFile;", "", "value", "", "delivery", com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.TYPE_COLUMN, "bitrate", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "getDelivery", "getType", "getBitrate", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "ads-legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class MediaFile {
    public static final int $stable = 0;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String bitrate;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String delivery;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String type;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String value;

    public MediaFile(@ak.f0("value") @hl.b @org.jetbrains.annotations.Nullable java.lang.String str, @ak.f0("delivery") @org.jetbrains.annotations.Nullable java.lang.String str2, @ak.f0("type") @org.jetbrains.annotations.Nullable java.lang.String str3, @ak.f0("bitrate") @org.jetbrains.annotations.Nullable java.lang.String str4) {
        this.value = str;
        this.delivery = str2;
        this.type = str3;
        this.bitrate = str4;
    }

    public static /* synthetic */ com.truecaller.ads.vast.MediaFile copy$default(com.truecaller.ads.vast.MediaFile mediaFile, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = mediaFile.value;
        }
        if ((i & 2) != 0) {
            str2 = mediaFile.delivery;
        }
        if ((i & 4) != 0) {
            str3 = mediaFile.type;
        }
        if ((i & 8) != 0) {
            str4 = mediaFile.bitrate;
        }
        return mediaFile.copy(str, str2, str3, str4);
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component1, reason: from getter */
    public final java.lang.String getValue() {
        return this.value;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component2, reason: from getter */
    public final java.lang.String getDelivery() {
        return this.delivery;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component3, reason: from getter */
    public final java.lang.String getType() {
        return this.type;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component4, reason: from getter */
    public final java.lang.String getBitrate() {
        return this.bitrate;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.ads.vast.MediaFile copy(@ak.f0("value") @hl.b @org.jetbrains.annotations.Nullable java.lang.String value, @ak.f0("delivery") @org.jetbrains.annotations.Nullable java.lang.String delivery, @ak.f0("type") @org.jetbrains.annotations.Nullable java.lang.String type, @ak.f0("bitrate") @org.jetbrains.annotations.Nullable java.lang.String bitrate) {
        return new com.truecaller.ads.vast.MediaFile(value, delivery, type, bitrate);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.ads.vast.MediaFile)) {
            return false;
        }
        com.truecaller.ads.vast.MediaFile mediaFile = (com.truecaller.ads.vast.MediaFile) other;
        return kotlin.jvm.internal.Intrinsics.b(this.value, mediaFile.value) && kotlin.jvm.internal.Intrinsics.b(this.delivery, mediaFile.delivery) && kotlin.jvm.internal.Intrinsics.b(this.type, mediaFile.type) && kotlin.jvm.internal.Intrinsics.b(this.bitrate, mediaFile.bitrate);
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getBitrate() {
        return this.bitrate;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getDelivery() {
        return this.delivery;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getType() {
        return this.type;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getValue() {
        return this.value;
    }

    public int hashCode() {
        java.lang.String str = this.value;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.lang.String str2 = this.delivery;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.type;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        java.lang.String str4 = this.bitrate;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        java.lang.String str = this.value;
        java.lang.String str2 = this.delivery;
        return bar.x(ro0.f.E("MediaFile(value=", str, ", delivery=", str2, ", type="), this.type, ", bitrate=", this.bitrate, ")");
    }
}
