package com.truecaller.ads.util;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/truecaller/ads/util/GamSdkInitConfig;", "", "minRam", "", "appFromGooglePlayStoreCheck", "", "<init>", "(JZ)V", "getMinRam", "()J", "getAppFromGooglePlayStoreCheck", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "ads-legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class GamSdkInitConfig {
    public static final int $stable = 0;
    private final boolean appFromGooglePlayStoreCheck;
    private final long minRam;

    public GamSdkInitConfig(long j, boolean z) {
        this.minRam = j;
        this.appFromGooglePlayStoreCheck = z;
    }

    public static /* synthetic */ com.truecaller.ads.util.GamSdkInitConfig copy$default(com.truecaller.ads.util.GamSdkInitConfig gamSdkInitConfig, long j, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            j = gamSdkInitConfig.minRam;
        }
        if ((i & 2) != 0) {
            z = gamSdkInitConfig.appFromGooglePlayStoreCheck;
        }
        return gamSdkInitConfig.copy(j, z);
    }

    /* renamed from: component1, reason: from getter */
    public final long getMinRam() {
        return this.minRam;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getAppFromGooglePlayStoreCheck() {
        return this.appFromGooglePlayStoreCheck;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.ads.util.GamSdkInitConfig copy(long minRam, boolean appFromGooglePlayStoreCheck) {
        return new com.truecaller.ads.util.GamSdkInitConfig(minRam, appFromGooglePlayStoreCheck);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.ads.util.GamSdkInitConfig)) {
            return false;
        }
        com.truecaller.ads.util.GamSdkInitConfig gamSdkInitConfig = (com.truecaller.ads.util.GamSdkInitConfig) other;
        return this.minRam == gamSdkInitConfig.minRam && this.appFromGooglePlayStoreCheck == gamSdkInitConfig.appFromGooglePlayStoreCheck;
    }

    public final boolean getAppFromGooglePlayStoreCheck() {
        return this.appFromGooglePlayStoreCheck;
    }

    public final long getMinRam() {
        return this.minRam;
    }

    public int hashCode() {
        int i;
        long j = this.minRam;
        int i2 = ((int) (j ^ (j >>> 32))) * 31;
        if (this.appFromGooglePlayStoreCheck) {
            i = 1231;
        } else {
            i = 1237;
        }
        return i2 + i;
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return "GamSdkInitConfig(minRam=" + this.minRam + ", appFromGooglePlayStoreCheck=" + this.appFromGooglePlayStoreCheck + ")";
    }
}
