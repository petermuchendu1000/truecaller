package com.truecaller.ads.mutliad.util;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J?\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\t2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0012¨\u0006\u001d"}, d2 = {"Lcom/truecaller/ads/mutliad/util/MultiAdRemoteConfigCard;", "", "index", "", "adUnitIdKey", "", "cacheAdUnitIdKey", "fallbackAdUnitIdKey", "isPrefetchEnabled", "", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getIndex", "()I", "getAdUnitIdKey", "()Ljava/lang/String;", "getCacheAdUnitIdKey", "getFallbackAdUnitIdKey", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "ads-legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class MultiAdRemoteConfigCard {
    public static final int $stable = 0;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String adUnitIdKey;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String cacheAdUnitIdKey;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String fallbackAdUnitIdKey;
    private final int index;
    private final boolean isPrefetchEnabled;

    public MultiAdRemoteConfigCard(int i, @org.jetbrains.annotations.NotNull java.lang.String str, @org.jetbrains.annotations.Nullable java.lang.String str2, @org.jetbrains.annotations.Nullable java.lang.String str3, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "adUnitIdKey");
        this.index = i;
        this.adUnitIdKey = str;
        this.cacheAdUnitIdKey = str2;
        this.fallbackAdUnitIdKey = str3;
        this.isPrefetchEnabled = z;
    }

    public static /* synthetic */ com.truecaller.ads.mutliad.util.MultiAdRemoteConfigCard copy$default(com.truecaller.ads.mutliad.util.MultiAdRemoteConfigCard multiAdRemoteConfigCard, int i, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = multiAdRemoteConfigCard.index;
        }
        if ((i2 & 2) != 0) {
            str = multiAdRemoteConfigCard.adUnitIdKey;
        }
        if ((i2 & 4) != 0) {
            str2 = multiAdRemoteConfigCard.cacheAdUnitIdKey;
        }
        if ((i2 & 8) != 0) {
            str3 = multiAdRemoteConfigCard.fallbackAdUnitIdKey;
        }
        if ((i2 & 16) != 0) {
            z = multiAdRemoteConfigCard.isPrefetchEnabled;
        }
        boolean z2 = z;
        java.lang.String str4 = str2;
        return multiAdRemoteConfigCard.copy(i, str, str4, str3, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component2, reason: from getter */
    public final java.lang.String getAdUnitIdKey() {
        return this.adUnitIdKey;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component3, reason: from getter */
    public final java.lang.String getCacheAdUnitIdKey() {
        return this.cacheAdUnitIdKey;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component4, reason: from getter */
    public final java.lang.String getFallbackAdUnitIdKey() {
        return this.fallbackAdUnitIdKey;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsPrefetchEnabled() {
        return this.isPrefetchEnabled;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.ads.mutliad.util.MultiAdRemoteConfigCard copy(int index, @org.jetbrains.annotations.NotNull java.lang.String adUnitIdKey, @org.jetbrains.annotations.Nullable java.lang.String cacheAdUnitIdKey, @org.jetbrains.annotations.Nullable java.lang.String fallbackAdUnitIdKey, boolean isPrefetchEnabled) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitIdKey, "adUnitIdKey");
        return new com.truecaller.ads.mutliad.util.MultiAdRemoteConfigCard(index, adUnitIdKey, cacheAdUnitIdKey, fallbackAdUnitIdKey, isPrefetchEnabled);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.ads.mutliad.util.MultiAdRemoteConfigCard)) {
            return false;
        }
        com.truecaller.ads.mutliad.util.MultiAdRemoteConfigCard multiAdRemoteConfigCard = (com.truecaller.ads.mutliad.util.MultiAdRemoteConfigCard) other;
        return this.index == multiAdRemoteConfigCard.index && kotlin.jvm.internal.Intrinsics.b(this.adUnitIdKey, multiAdRemoteConfigCard.adUnitIdKey) && kotlin.jvm.internal.Intrinsics.b(this.cacheAdUnitIdKey, multiAdRemoteConfigCard.cacheAdUnitIdKey) && kotlin.jvm.internal.Intrinsics.b(this.fallbackAdUnitIdKey, multiAdRemoteConfigCard.fallbackAdUnitIdKey) && this.isPrefetchEnabled == multiAdRemoteConfigCard.isPrefetchEnabled;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getAdUnitIdKey() {
        return this.adUnitIdKey;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getCacheAdUnitIdKey() {
        return this.cacheAdUnitIdKey;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getFallbackAdUnitIdKey() {
        return this.fallbackAdUnitIdKey;
    }

    public final int getIndex() {
        return this.index;
    }

    public int hashCode() {
        int hashCode;
        int i;
        int e = ax1.bar.e(this.index * 31, 31, this.adUnitIdKey);
        java.lang.String str = this.cacheAdUnitIdKey;
        int i2 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i3 = (e + hashCode) * 31;
        java.lang.String str2 = this.fallbackAdUnitIdKey;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        int i4 = (i3 + i2) * 31;
        if (this.isPrefetchEnabled) {
            i = 1231;
        } else {
            i = 1237;
        }
        return i4 + i;
    }

    public final boolean isPrefetchEnabled() {
        return this.isPrefetchEnabled;
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        int i = this.index;
        java.lang.String str = this.adUnitIdKey;
        java.lang.String str2 = this.cacheAdUnitIdKey;
        java.lang.String str3 = this.fallbackAdUnitIdKey;
        boolean z = this.isPrefetchEnabled;
        java.lang.StringBuilder r = qb.qux.r("MultiAdRemoteConfigCard(index=", i, ", adUnitIdKey=", str, ", cacheAdUnitIdKey=");
        bar.E(r, str2, ", fallbackAdUnitIdKey=", str3, ", isPrefetchEnabled=");
        return h8.s0.s(r, z, ")");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ MultiAdRemoteConfigCard(int i, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, str2, r6, r7);
        boolean z2;
        java.lang.String str4;
        str2 = (i2 & 4) != 0 ? null : str2;
        if ((i2 & 8) != 0) {
            z2 = z;
            str4 = null;
        } else {
            z2 = z;
            str4 = str3;
        }
    }
}
