package com.truecaller.ads.vast;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0001\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0003\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0006HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/truecaller/ads/vast/Icon;", "", "iconClicks", "Lcom/truecaller/ads/vast/IconClicks;", "iconViewTracking", "", "", "<init>", "(Lcom/truecaller/ads/vast/IconClicks;Ljava/util/List;)V", "getIconClicks", "()Lcom/truecaller/ads/vast/IconClicks;", "getIconViewTracking", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "ads-legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class Icon {
    public static final int $stable = 8;

    @org.jetbrains.annotations.Nullable
    private final com.truecaller.ads.vast.IconClicks iconClicks;

    @org.jetbrains.annotations.Nullable
    private final java.util.List<java.lang.String> iconViewTracking;

    public Icon(@ak.f0("IconClicks") @org.jetbrains.annotations.Nullable com.truecaller.ads.vast.IconClicks iconClicks, @ak.f0("IconViewTracking") @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> list) {
        this.iconClicks = iconClicks;
        this.iconViewTracking = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.truecaller.ads.vast.Icon copy$default(com.truecaller.ads.vast.Icon icon, com.truecaller.ads.vast.IconClicks iconClicks, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            iconClicks = icon.iconClicks;
        }
        if ((i & 2) != 0) {
            list = icon.iconViewTracking;
        }
        return icon.copy(iconClicks, list);
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component1, reason: from getter */
    public final com.truecaller.ads.vast.IconClicks getIconClicks() {
        return this.iconClicks;
    }

    @org.jetbrains.annotations.Nullable
    public final java.util.List<java.lang.String> component2() {
        return this.iconViewTracking;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.ads.vast.Icon copy(@ak.f0("IconClicks") @org.jetbrains.annotations.Nullable com.truecaller.ads.vast.IconClicks iconClicks, @ak.f0("IconViewTracking") @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> iconViewTracking) {
        return new com.truecaller.ads.vast.Icon(iconClicks, iconViewTracking);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.ads.vast.Icon)) {
            return false;
        }
        com.truecaller.ads.vast.Icon icon = (com.truecaller.ads.vast.Icon) other;
        return kotlin.jvm.internal.Intrinsics.b(this.iconClicks, icon.iconClicks) && kotlin.jvm.internal.Intrinsics.b(this.iconViewTracking, icon.iconViewTracking);
    }

    @org.jetbrains.annotations.Nullable
    public final com.truecaller.ads.vast.IconClicks getIconClicks() {
        return this.iconClicks;
    }

    @org.jetbrains.annotations.Nullable
    public final java.util.List<java.lang.String> getIconViewTracking() {
        return this.iconViewTracking;
    }

    public int hashCode() {
        com.truecaller.ads.vast.IconClicks iconClicks = this.iconClicks;
        int hashCode = (iconClicks == null ? 0 : iconClicks.hashCode()) * 31;
        java.util.List<java.lang.String> list = this.iconViewTracking;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return "Icon(iconClicks=" + this.iconClicks + ", iconViewTracking=" + this.iconViewTracking + ")";
    }
}
