package com.truecaller.ads.vast;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001a"}, d2 = {"Lcom/truecaller/ads/vast/VastAdFirebaseConfig;", "", "enableWrapper", "", "wrapperDepth", "", "enableVideoCache", "enablePixelParallelism", "<init>", "(ZIZZ)V", "getEnableWrapper", "()Z", "getWrapperDepth", "()I", "getEnableVideoCache", "getEnablePixelParallelism", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "", "ads-legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class VastAdFirebaseConfig {
    public static final int $stable = 0;
    private final boolean enablePixelParallelism;
    private final boolean enableVideoCache;
    private final boolean enableWrapper;
    private final int wrapperDepth;

    public VastAdFirebaseConfig(boolean z, int i, boolean z2, boolean z3) {
        this.enableWrapper = z;
        this.wrapperDepth = i;
        this.enableVideoCache = z2;
        this.enablePixelParallelism = z3;
    }

    public static /* synthetic */ com.truecaller.ads.vast.VastAdFirebaseConfig copy$default(com.truecaller.ads.vast.VastAdFirebaseConfig vastAdFirebaseConfig, boolean z, int i, boolean z2, boolean z3, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            z = vastAdFirebaseConfig.enableWrapper;
        }
        if ((i2 & 2) != 0) {
            i = vastAdFirebaseConfig.wrapperDepth;
        }
        if ((i2 & 4) != 0) {
            z2 = vastAdFirebaseConfig.enableVideoCache;
        }
        if ((i2 & 8) != 0) {
            z3 = vastAdFirebaseConfig.enablePixelParallelism;
        }
        return vastAdFirebaseConfig.copy(z, i, z2, z3);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getEnableWrapper() {
        return this.enableWrapper;
    }

    /* renamed from: component2, reason: from getter */
    public final int getWrapperDepth() {
        return this.wrapperDepth;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getEnableVideoCache() {
        return this.enableVideoCache;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getEnablePixelParallelism() {
        return this.enablePixelParallelism;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.ads.vast.VastAdFirebaseConfig copy(boolean enableWrapper, int wrapperDepth, boolean enableVideoCache, boolean enablePixelParallelism) {
        return new com.truecaller.ads.vast.VastAdFirebaseConfig(enableWrapper, wrapperDepth, enableVideoCache, enablePixelParallelism);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.ads.vast.VastAdFirebaseConfig)) {
            return false;
        }
        com.truecaller.ads.vast.VastAdFirebaseConfig vastAdFirebaseConfig = (com.truecaller.ads.vast.VastAdFirebaseConfig) other;
        return this.enableWrapper == vastAdFirebaseConfig.enableWrapper && this.wrapperDepth == vastAdFirebaseConfig.wrapperDepth && this.enableVideoCache == vastAdFirebaseConfig.enableVideoCache && this.enablePixelParallelism == vastAdFirebaseConfig.enablePixelParallelism;
    }

    public final boolean getEnablePixelParallelism() {
        return this.enablePixelParallelism;
    }

    public final boolean getEnableVideoCache() {
        return this.enableVideoCache;
    }

    public final boolean getEnableWrapper() {
        return this.enableWrapper;
    }

    public final int getWrapperDepth() {
        return this.wrapperDepth;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3 = 1237;
        if (this.enableWrapper) {
            i = 1231;
        } else {
            i = 1237;
        }
        int i4 = ((i * 31) + this.wrapperDepth) * 31;
        if (this.enableVideoCache) {
            i2 = 1231;
        } else {
            i2 = 1237;
        }
        int i5 = (i4 + i2) * 31;
        if (this.enablePixelParallelism) {
            i3 = 1231;
        }
        return i5 + i3;
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        boolean z = this.enableWrapper;
        int i = this.wrapperDepth;
        boolean z2 = this.enableVideoCache;
        boolean z3 = this.enablePixelParallelism;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("VastAdFirebaseConfig(enableWrapper=");
        sb.append(z);
        sb.append(", wrapperDepth=");
        sb.append(i);
        sb.append(", enableVideoCache=");
        return ax1.bar.q(sb, z2, ", enablePixelParallelism=", z3, ")");
    }

    public /* synthetic */ VastAdFirebaseConfig(boolean z, int i, boolean z2, boolean z3, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i2 & 2) != 0 ? 5 : i, z2, (i2 & 8) != 0 ? false : z3);
    }
}
