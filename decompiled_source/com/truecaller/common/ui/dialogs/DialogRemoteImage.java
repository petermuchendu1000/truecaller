package com.truecaller.common.ui.dialogs;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001b"}, d2 = {"Lcom/truecaller/common/ui/dialogs/DialogRemoteImage;", "Landroid/os/Parcelable;", "imageUrl", "", "shouldCacheImage", "", "<init>", "(Ljava/lang/String;Z)V", "getImageUrl", "()Ljava/lang/String;", "getShouldCacheImage", "()Z", "component1", "component2", "copy", "describeContents", "", "equals", com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts.OTHER, "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "common-ui_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.LOWPOWERMODE_FIELD_NUMBER)
/* loaded from: /home/user/tc_decoded/classes2.dex */
public final /* data */ class DialogRemoteImage implements android.os.Parcelable {

    @org.jetbrains.annotations.NotNull
    public static final android.os.Parcelable.Creator<com.truecaller.common.ui.dialogs.DialogRemoteImage> CREATOR = new cb1.bar(19);

    @org.jetbrains.annotations.NotNull
    private final java.lang.String imageUrl;
    private final boolean shouldCacheImage;

    public DialogRemoteImage(@org.jetbrains.annotations.NotNull java.lang.String str, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "imageUrl");
        this.imageUrl = str;
        this.shouldCacheImage = z;
    }

    public static /* synthetic */ com.truecaller.common.ui.dialogs.DialogRemoteImage copy$default(com.truecaller.common.ui.dialogs.DialogRemoteImage dialogRemoteImage, java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = dialogRemoteImage.imageUrl;
        }
        if ((i & 2) != 0) {
            z = dialogRemoteImage.shouldCacheImage;
        }
        return dialogRemoteImage.copy(str, z);
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component1, reason: from getter */
    public final java.lang.String getImageUrl() {
        return this.imageUrl;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getShouldCacheImage() {
        return this.shouldCacheImage;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.common.ui.dialogs.DialogRemoteImage copy(@org.jetbrains.annotations.NotNull java.lang.String imageUrl, boolean shouldCacheImage) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        return new com.truecaller.common.ui.dialogs.DialogRemoteImage(imageUrl, shouldCacheImage);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.common.ui.dialogs.DialogRemoteImage)) {
            return false;
        }
        com.truecaller.common.ui.dialogs.DialogRemoteImage dialogRemoteImage = (com.truecaller.common.ui.dialogs.DialogRemoteImage) other;
        return kotlin.jvm.internal.Intrinsics.b(this.imageUrl, dialogRemoteImage.imageUrl) && this.shouldCacheImage == dialogRemoteImage.shouldCacheImage;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getImageUrl() {
        return this.imageUrl;
    }

    public final boolean getShouldCacheImage() {
        return this.shouldCacheImage;
    }

    public int hashCode() {
        return (this.imageUrl.hashCode() * 31) + (this.shouldCacheImage ? 1231 : 1237);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return bx.e1.p("DialogRemoteImage(imageUrl=", this.imageUrl, ", shouldCacheImage=", this.shouldCacheImage, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@org.jetbrains.annotations.NotNull android.os.Parcel dest, int flags) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.imageUrl);
        dest.writeInt(this.shouldCacheImage ? 1 : 0);
    }

    public /* synthetic */ DialogRemoteImage(java.lang.String str, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? false : z);
    }
}
