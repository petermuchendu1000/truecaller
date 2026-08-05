package com.truecaller.ads.adrequestflow;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, d2 = {"Lcom/truecaller/ads/adrequestflow/TasAdRequestTimeoutConfig;", "", "placement", "", "timeoutInMillis", "", "enableTimeout", "", "<init>", "(Ljava/lang/String;JZ)V", "getPlacement", "()Ljava/lang/String;", "getTimeoutInMillis", "()J", "getEnableTimeout", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "ads-legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class TasAdRequestTimeoutConfig {
    public static final int $stable = 0;
    private final boolean enableTimeout;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String placement;
    private final long timeoutInMillis;

    public TasAdRequestTimeoutConfig(@org.jetbrains.annotations.NotNull java.lang.String str, long j, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "placement");
        this.placement = str;
        this.timeoutInMillis = j;
        this.enableTimeout = z;
    }

    public static /* synthetic */ com.truecaller.ads.adrequestflow.TasAdRequestTimeoutConfig copy$default(com.truecaller.ads.adrequestflow.TasAdRequestTimeoutConfig tasAdRequestTimeoutConfig, java.lang.String str, long j, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = tasAdRequestTimeoutConfig.placement;
        }
        if ((i & 2) != 0) {
            j = tasAdRequestTimeoutConfig.timeoutInMillis;
        }
        if ((i & 4) != 0) {
            z = tasAdRequestTimeoutConfig.enableTimeout;
        }
        return tasAdRequestTimeoutConfig.copy(str, j, z);
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component1, reason: from getter */
    public final java.lang.String getPlacement() {
        return this.placement;
    }

    /* renamed from: component2, reason: from getter */
    public final long getTimeoutInMillis() {
        return this.timeoutInMillis;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getEnableTimeout() {
        return this.enableTimeout;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.ads.adrequestflow.TasAdRequestTimeoutConfig copy(@org.jetbrains.annotations.NotNull java.lang.String placement, long timeoutInMillis, boolean enableTimeout) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(placement, "placement");
        return new com.truecaller.ads.adrequestflow.TasAdRequestTimeoutConfig(placement, timeoutInMillis, enableTimeout);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.ads.adrequestflow.TasAdRequestTimeoutConfig)) {
            return false;
        }
        com.truecaller.ads.adrequestflow.TasAdRequestTimeoutConfig tasAdRequestTimeoutConfig = (com.truecaller.ads.adrequestflow.TasAdRequestTimeoutConfig) other;
        return kotlin.jvm.internal.Intrinsics.b(this.placement, tasAdRequestTimeoutConfig.placement) && this.timeoutInMillis == tasAdRequestTimeoutConfig.timeoutInMillis && this.enableTimeout == tasAdRequestTimeoutConfig.enableTimeout;
    }

    public final boolean getEnableTimeout() {
        return this.enableTimeout;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getPlacement() {
        return this.placement;
    }

    public final long getTimeoutInMillis() {
        return this.timeoutInMillis;
    }

    public int hashCode() {
        int i;
        int hashCode = this.placement.hashCode() * 31;
        long j = this.timeoutInMillis;
        int i2 = (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
        if (this.enableTimeout) {
            i = 1231;
        } else {
            i = 1237;
        }
        return i2 + i;
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        java.lang.String str = this.placement;
        long j = this.timeoutInMillis;
        return com.appsflyer.internal.e.n(com.appsflyer.internal.e.q("TasAdRequestTimeoutConfig(placement=", str, ", timeoutInMillis=", j), ", enableTimeout=", this.enableTimeout, ")");
    }

    public /* synthetic */ TasAdRequestTimeoutConfig(java.lang.String str, long j, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? 0L : j, (i & 4) != 0 ? false : z);
    }
}
