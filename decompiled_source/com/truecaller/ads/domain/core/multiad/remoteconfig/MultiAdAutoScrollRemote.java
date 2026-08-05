package com.truecaller.ads.domain.core.multiad.remoteconfig;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0017"}, d2 = {"Lcom/truecaller/ads/domain/core/multiad/remoteconfig/MultiAdAutoScrollRemote;", "", "isEnabled", "", "interval", "", "showPageIndicator", "<init>", "(ZJZ)V", "()Z", "getInterval", "()J", "getShowPageIndicator", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "domain_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class MultiAdAutoScrollRemote {
    private final long interval;
    private final boolean isEnabled;
    private final boolean showPageIndicator;

    public MultiAdAutoScrollRemote() {
        this(false, 0L, false, 7, null);
    }

    public static /* synthetic */ com.truecaller.ads.domain.core.multiad.remoteconfig.MultiAdAutoScrollRemote copy$default(com.truecaller.ads.domain.core.multiad.remoteconfig.MultiAdAutoScrollRemote multiAdAutoScrollRemote, boolean z, long j, boolean z2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = multiAdAutoScrollRemote.isEnabled;
        }
        if ((i & 2) != 0) {
            j = multiAdAutoScrollRemote.interval;
        }
        if ((i & 4) != 0) {
            z2 = multiAdAutoScrollRemote.showPageIndicator;
        }
        return multiAdAutoScrollRemote.copy(z, j, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsEnabled() {
        return this.isEnabled;
    }

    /* renamed from: component2, reason: from getter */
    public final long getInterval() {
        return this.interval;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getShowPageIndicator() {
        return this.showPageIndicator;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.ads.domain.core.multiad.remoteconfig.MultiAdAutoScrollRemote copy(boolean isEnabled, long interval, boolean showPageIndicator) {
        return new com.truecaller.ads.domain.core.multiad.remoteconfig.MultiAdAutoScrollRemote(isEnabled, interval, showPageIndicator);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.ads.domain.core.multiad.remoteconfig.MultiAdAutoScrollRemote)) {
            return false;
        }
        com.truecaller.ads.domain.core.multiad.remoteconfig.MultiAdAutoScrollRemote multiAdAutoScrollRemote = (com.truecaller.ads.domain.core.multiad.remoteconfig.MultiAdAutoScrollRemote) other;
        return this.isEnabled == multiAdAutoScrollRemote.isEnabled && this.interval == multiAdAutoScrollRemote.interval && this.showPageIndicator == multiAdAutoScrollRemote.showPageIndicator;
    }

    public final long getInterval() {
        return this.interval;
    }

    public final boolean getShowPageIndicator() {
        return this.showPageIndicator;
    }

    public int hashCode() {
        int i;
        int i2 = 1237;
        if (this.isEnabled) {
            i = 1231;
        } else {
            i = 1237;
        }
        long j = this.interval;
        int i3 = ((i * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        if (this.showPageIndicator) {
            i2 = 1231;
        }
        return i3 + i2;
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        boolean z = this.isEnabled;
        long j = this.interval;
        boolean z2 = this.showPageIndicator;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("MultiAdAutoScrollRemote(isEnabled=");
        sb.append(z);
        sb.append(", interval=");
        sb.append(j);
        return com.appsflyer.internal.e.n(sb, ", showPageIndicator=", z2, ")");
    }

    public MultiAdAutoScrollRemote(boolean z, long j, boolean z2) {
        this.isEnabled = z;
        this.interval = j;
        this.showPageIndicator = z2;
    }

    public /* synthetic */ MultiAdAutoScrollRemote(boolean z, long j, boolean z2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? 5000L : j, (i & 4) != 0 ? true : z2);
    }
}
