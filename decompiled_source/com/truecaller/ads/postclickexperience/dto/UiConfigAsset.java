package com.truecaller.ads.postclickexperience.dto;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001c"}, d2 = {"Lcom/truecaller/ads/postclickexperience/dto/UiConfigAsset;", "Landroid/os/Parcelable;", "key", "", "fileUri", "Landroid/net/Uri;", "<init>", "(Ljava/lang/String;Landroid/net/Uri;)V", "getKey", "()Ljava/lang/String;", "getFileUri", "()Landroid/net/Uri;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ads-legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class UiConfigAsset implements android.os.Parcelable {
    public static final int $stable = 8;

    @org.jetbrains.annotations.NotNull
    public static final android.os.Parcelable.Creator<com.truecaller.ads.postclickexperience.dto.UiConfigAsset> CREATOR = new k90.bar(12);

    @bw.qux("fileUri")
    @org.jetbrains.annotations.NotNull
    private final android.net.Uri fileUri;

    @bw.qux("key")
    @org.jetbrains.annotations.NotNull
    private final java.lang.String key;

    public UiConfigAsset(@org.jetbrains.annotations.NotNull java.lang.String str, @org.jetbrains.annotations.NotNull android.net.Uri uri) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "key");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri, "fileUri");
        this.key = str;
        this.fileUri = uri;
    }

    public static /* synthetic */ com.truecaller.ads.postclickexperience.dto.UiConfigAsset copy$default(com.truecaller.ads.postclickexperience.dto.UiConfigAsset uiConfigAsset, java.lang.String str, android.net.Uri uri, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = uiConfigAsset.key;
        }
        if ((i & 2) != 0) {
            uri = uiConfigAsset.fileUri;
        }
        return uiConfigAsset.copy(str, uri);
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component1, reason: from getter */
    public final java.lang.String getKey() {
        return this.key;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component2, reason: from getter */
    public final android.net.Uri getFileUri() {
        return this.fileUri;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.ads.postclickexperience.dto.UiConfigAsset copy(@org.jetbrains.annotations.NotNull java.lang.String key, @org.jetbrains.annotations.NotNull android.net.Uri fileUri) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileUri, "fileUri");
        return new com.truecaller.ads.postclickexperience.dto.UiConfigAsset(key, fileUri);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.ads.postclickexperience.dto.UiConfigAsset)) {
            return false;
        }
        com.truecaller.ads.postclickexperience.dto.UiConfigAsset uiConfigAsset = (com.truecaller.ads.postclickexperience.dto.UiConfigAsset) other;
        return kotlin.jvm.internal.Intrinsics.b(this.key, uiConfigAsset.key) && kotlin.jvm.internal.Intrinsics.b(this.fileUri, uiConfigAsset.fileUri);
    }

    @org.jetbrains.annotations.NotNull
    public final android.net.Uri getFileUri() {
        return this.fileUri;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getKey() {
        return this.key;
    }

    public int hashCode() {
        return this.fileUri.hashCode() + (this.key.hashCode() * 31);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return "UiConfigAsset(key=" + this.key + ", fileUri=" + this.fileUri + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@org.jetbrains.annotations.NotNull android.os.Parcel dest, int flags) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.key);
        dest.writeParcelable(this.fileUri, flags);
    }
}
