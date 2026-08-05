package com.truecaller.ads.mutliad.util;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/truecaller/ads/mutliad/util/MultiAdRemoteConfigAutoScroll;", "", "isEnabled", "", "interval", "", "<init>", "(ZJ)V", "()Z", "getInterval", "()J", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "ads-legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class MultiAdRemoteConfigAutoScroll {
    public static final int $stable = 0;
    private final long interval;
    private final boolean isEnabled;

    public MultiAdRemoteConfigAutoScroll() {
        this(false, 0L, 3, null);
    }

    public static /* synthetic */ com.truecaller.ads.mutliad.util.MultiAdRemoteConfigAutoScroll copy$default(com.truecaller.ads.mutliad.util.MultiAdRemoteConfigAutoScroll multiAdRemoteConfigAutoScroll, boolean z, long j, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = multiAdRemoteConfigAutoScroll.isEnabled;
        }
        if ((i & 2) != 0) {
            j = multiAdRemoteConfigAutoScroll.interval;
        }
        return multiAdRemoteConfigAutoScroll.copy(z, j);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsEnabled() {
        return this.isEnabled;
    }

    /* renamed from: component2, reason: from getter */
    public final long getInterval() {
        return this.interval;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.ads.mutliad.util.MultiAdRemoteConfigAutoScroll copy(boolean isEnabled, long interval) {
        return new com.truecaller.ads.mutliad.util.MultiAdRemoteConfigAutoScroll(isEnabled, interval);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.ads.mutliad.util.MultiAdRemoteConfigAutoScroll)) {
            return false;
        }
        com.truecaller.ads.mutliad.util.MultiAdRemoteConfigAutoScroll multiAdRemoteConfigAutoScroll = (com.truecaller.ads.mutliad.util.MultiAdRemoteConfigAutoScroll) other;
        return this.isEnabled == multiAdRemoteConfigAutoScroll.isEnabled && this.interval == multiAdRemoteConfigAutoScroll.interval;
    }

    public final long getInterval() {
        return this.interval;
    }

    public int hashCode() {
        int i;
        if (this.isEnabled) {
            i = 1231;
        } else {
            i = 1237;
        }
        long j = this.interval;
        return (i * 31) + ((int) (j ^ (j >>> 32)));
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return "MultiAdRemoteConfigAutoScroll(isEnabled=" + this.isEnabled + ", interval=" + this.interval + ")";
    }

    public MultiAdRemoteConfigAutoScroll(boolean z, long j) {
        this.isEnabled = z;
        this.interval = j;
    }

    public /* synthetic */ MultiAdRemoteConfigAutoScroll(boolean z, long j, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? 5000L : j);
    }
}
