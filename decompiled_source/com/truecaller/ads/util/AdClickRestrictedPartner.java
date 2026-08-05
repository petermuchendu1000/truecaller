package com.truecaller.ads.util;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J3\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/truecaller/ads/util/AdClickRestrictedPartner;", "", "name", "", "views", "", "placements", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "getName", "()Ljava/lang/String;", "getViews", "()Ljava/util/List;", "getPlacements", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "ads-legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class AdClickRestrictedPartner {
    public static final int $stable = 8;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String name;

    @org.jetbrains.annotations.NotNull
    private final java.util.List<java.lang.String> placements;

    @org.jetbrains.annotations.NotNull
    private final java.util.List<java.lang.String> views;

    public AdClickRestrictedPartner(@org.jetbrains.annotations.NotNull java.lang.String str, @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> list, @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> list2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "name");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "views");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "placements");
        this.name = str;
        this.views = list;
        this.placements = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.truecaller.ads.util.AdClickRestrictedPartner copy$default(com.truecaller.ads.util.AdClickRestrictedPartner adClickRestrictedPartner, java.lang.String str, java.util.List list, java.util.List list2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = adClickRestrictedPartner.name;
        }
        if ((i & 2) != 0) {
            list = adClickRestrictedPartner.views;
        }
        if ((i & 4) != 0) {
            list2 = adClickRestrictedPartner.placements;
        }
        return adClickRestrictedPartner.copy(str, list, list2);
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component1, reason: from getter */
    public final java.lang.String getName() {
        return this.name;
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.String> component2() {
        return this.views;
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.String> component3() {
        return this.placements;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.ads.util.AdClickRestrictedPartner copy(@org.jetbrains.annotations.NotNull java.lang.String name, @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> views, @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> placements) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(views, "views");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(placements, "placements");
        return new com.truecaller.ads.util.AdClickRestrictedPartner(name, views, placements);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.ads.util.AdClickRestrictedPartner)) {
            return false;
        }
        com.truecaller.ads.util.AdClickRestrictedPartner adClickRestrictedPartner = (com.truecaller.ads.util.AdClickRestrictedPartner) other;
        return kotlin.jvm.internal.Intrinsics.b(this.name, adClickRestrictedPartner.name) && kotlin.jvm.internal.Intrinsics.b(this.views, adClickRestrictedPartner.views) && kotlin.jvm.internal.Intrinsics.b(this.placements, adClickRestrictedPartner.placements);
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getName() {
        return this.name;
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.String> getPlacements() {
        return this.placements;
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.String> getViews() {
        return this.views;
    }

    public int hashCode() {
        return this.placements.hashCode() + uf.qux.g(this.name.hashCode() * 31, 31, this.views);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        java.lang.String str = this.name;
        java.util.List<java.lang.String> list = this.views;
        return y.o.g(com.appsflyer.internal.e.r("AdClickRestrictedPartner(name=", str, ", views=", list, ", placements="), this.placements, ")");
    }
}
