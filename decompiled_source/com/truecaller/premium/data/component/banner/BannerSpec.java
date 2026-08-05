package com.truecaller.premium.data.component.banner;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/truecaller/premium/data/component/banner/BannerSpec;", "", "launchContext", "", "banner", "", "Lcom/truecaller/premium/data/component/banner/Banner;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getLaunchContext", "()Ljava/lang/String;", "getBanner", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final /* data */ class BannerSpec {
    public static final int $stable = 8;

    @bw.qux("banner")
    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.truecaller.premium.data.component.banner.Banner> banner;

    @bw.qux("launch_context")
    @org.jetbrains.annotations.NotNull
    private final java.lang.String launchContext;

    public BannerSpec(@org.jetbrains.annotations.NotNull java.lang.String str, @org.jetbrains.annotations.NotNull java.util.List<com.truecaller.premium.data.component.banner.Banner> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "launchContext");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "banner");
        this.launchContext = str;
        this.banner = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.truecaller.premium.data.component.banner.BannerSpec copy$default(com.truecaller.premium.data.component.banner.BannerSpec bannerSpec, java.lang.String str, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = bannerSpec.launchContext;
        }
        if ((i & 2) != 0) {
            list = bannerSpec.banner;
        }
        return bannerSpec.copy(str, list);
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component1, reason: from getter */
    public final java.lang.String getLaunchContext() {
        return this.launchContext;
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.truecaller.premium.data.component.banner.Banner> component2() {
        return this.banner;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.premium.data.component.banner.BannerSpec copy(@org.jetbrains.annotations.NotNull java.lang.String launchContext, @org.jetbrains.annotations.NotNull java.util.List<com.truecaller.premium.data.component.banner.Banner> banner) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(launchContext, "launchContext");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(banner, "banner");
        return new com.truecaller.premium.data.component.banner.BannerSpec(launchContext, banner);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.premium.data.component.banner.BannerSpec)) {
            return false;
        }
        com.truecaller.premium.data.component.banner.BannerSpec bannerSpec = (com.truecaller.premium.data.component.banner.BannerSpec) other;
        return kotlin.jvm.internal.Intrinsics.b(this.launchContext, bannerSpec.launchContext) && kotlin.jvm.internal.Intrinsics.b(this.banner, bannerSpec.banner);
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.truecaller.premium.data.component.banner.Banner> getBanner() {
        return this.banner;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getLaunchContext() {
        return this.launchContext;
    }

    public int hashCode() {
        return this.banner.hashCode() + (this.launchContext.hashCode() * 31);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return ro0.f.C("BannerSpec(launchContext=", this.launchContext, ", banner=", this.banner, ")");
    }
}
