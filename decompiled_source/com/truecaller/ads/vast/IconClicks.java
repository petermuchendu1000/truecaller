package com.truecaller.ads.vast;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0001\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0003\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/truecaller/ads/vast/IconClicks;", "", "iconClickThrough", "", "iconClickTracking", "", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getIconClickThrough", "()Ljava/lang/String;", "getIconClickTracking", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "ads-legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class IconClicks {
    public static final int $stable = 8;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String iconClickThrough;

    @org.jetbrains.annotations.Nullable
    private final java.util.List<java.lang.String> iconClickTracking;

    public IconClicks(@ak.f0("IconClickThrough") @org.jetbrains.annotations.Nullable java.lang.String str, @ak.f0("IconClickTracking") @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> list) {
        this.iconClickThrough = str;
        this.iconClickTracking = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.truecaller.ads.vast.IconClicks copy$default(com.truecaller.ads.vast.IconClicks iconClicks, java.lang.String str, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = iconClicks.iconClickThrough;
        }
        if ((i & 2) != 0) {
            list = iconClicks.iconClickTracking;
        }
        return iconClicks.copy(str, list);
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component1, reason: from getter */
    public final java.lang.String getIconClickThrough() {
        return this.iconClickThrough;
    }

    @org.jetbrains.annotations.Nullable
    public final java.util.List<java.lang.String> component2() {
        return this.iconClickTracking;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.ads.vast.IconClicks copy(@ak.f0("IconClickThrough") @org.jetbrains.annotations.Nullable java.lang.String iconClickThrough, @ak.f0("IconClickTracking") @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> iconClickTracking) {
        return new com.truecaller.ads.vast.IconClicks(iconClickThrough, iconClickTracking);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.ads.vast.IconClicks)) {
            return false;
        }
        com.truecaller.ads.vast.IconClicks iconClicks = (com.truecaller.ads.vast.IconClicks) other;
        return kotlin.jvm.internal.Intrinsics.b(this.iconClickThrough, iconClicks.iconClickThrough) && kotlin.jvm.internal.Intrinsics.b(this.iconClickTracking, iconClicks.iconClickTracking);
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getIconClickThrough() {
        return this.iconClickThrough;
    }

    @org.jetbrains.annotations.Nullable
    public final java.util.List<java.lang.String> getIconClickTracking() {
        return this.iconClickTracking;
    }

    public int hashCode() {
        java.lang.String str = this.iconClickThrough;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.util.List<java.lang.String> list = this.iconClickTracking;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return ro0.f.C("IconClicks(iconClickThrough=", this.iconClickThrough, ", iconClickTracking=", this.iconClickTracking, ")");
    }
}
