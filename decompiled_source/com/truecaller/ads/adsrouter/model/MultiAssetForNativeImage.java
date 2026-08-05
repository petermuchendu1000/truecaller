package com.truecaller.ads.adsrouter.model;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0006\u0010\u0010\u001a\u00020\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001d"}, d2 = {"Lcom/truecaller/ads/adsrouter/model/MultiAssetForNativeImage;", "Landroid/os/Parcelable;", "content", "", "sizeList", "", "Lcom/truecaller/ads/adsrouter/model/Size;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getContent", "()Ljava/lang/String;", "getSizeList", "()Ljava/util/List;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ads-legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class MultiAssetForNativeImage implements android.os.Parcelable {
    public static final int $stable = 8;

    @org.jetbrains.annotations.NotNull
    public static final android.os.Parcelable.Creator<com.truecaller.ads.adsrouter.model.MultiAssetForNativeImage> CREATOR = new y02.t(17);

    @org.jetbrains.annotations.NotNull
    private final java.lang.String content;

    @org.jetbrains.annotations.Nullable
    private final java.util.List<com.truecaller.ads.adsrouter.model.Size> sizeList;

    public MultiAssetForNativeImage(@org.jetbrains.annotations.NotNull java.lang.String str, @org.jetbrains.annotations.Nullable java.util.List<com.truecaller.ads.adsrouter.model.Size> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "content");
        this.content = str;
        this.sizeList = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.truecaller.ads.adsrouter.model.MultiAssetForNativeImage copy$default(com.truecaller.ads.adsrouter.model.MultiAssetForNativeImage multiAssetForNativeImage, java.lang.String str, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = multiAssetForNativeImage.content;
        }
        if ((i & 2) != 0) {
            list = multiAssetForNativeImage.sizeList;
        }
        return multiAssetForNativeImage.copy(str, list);
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component1, reason: from getter */
    public final java.lang.String getContent() {
        return this.content;
    }

    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.truecaller.ads.adsrouter.model.Size> component2() {
        return this.sizeList;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.ads.adsrouter.model.MultiAssetForNativeImage copy(@org.jetbrains.annotations.NotNull java.lang.String content, @org.jetbrains.annotations.Nullable java.util.List<com.truecaller.ads.adsrouter.model.Size> sizeList) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(content, "content");
        return new com.truecaller.ads.adsrouter.model.MultiAssetForNativeImage(content, sizeList);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.ads.adsrouter.model.MultiAssetForNativeImage)) {
            return false;
        }
        com.truecaller.ads.adsrouter.model.MultiAssetForNativeImage multiAssetForNativeImage = (com.truecaller.ads.adsrouter.model.MultiAssetForNativeImage) other;
        return kotlin.jvm.internal.Intrinsics.b(this.content, multiAssetForNativeImage.content) && kotlin.jvm.internal.Intrinsics.b(this.sizeList, multiAssetForNativeImage.sizeList);
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getContent() {
        return this.content;
    }

    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.truecaller.ads.adsrouter.model.Size> getSizeList() {
        return this.sizeList;
    }

    public int hashCode() {
        int hashCode = this.content.hashCode() * 31;
        java.util.List<com.truecaller.ads.adsrouter.model.Size> list = this.sizeList;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return ro0.f.C("MultiAssetForNativeImage(content=", this.content, ", sizeList=", this.sizeList, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@org.jetbrains.annotations.NotNull android.os.Parcel dest, int flags) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.content);
        java.util.List<com.truecaller.ads.adsrouter.model.Size> list = this.sizeList;
        if (list == null) {
            dest.writeInt(0);
            return;
        }
        dest.writeInt(1);
        dest.writeInt(list.size());
        java.util.Iterator<com.truecaller.ads.adsrouter.model.Size> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(dest, flags);
        }
    }

    public /* synthetic */ MultiAssetForNativeImage(java.lang.String str, java.util.List list, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : list);
    }
}
