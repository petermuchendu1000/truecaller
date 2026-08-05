package com.truecaller.ads.domain.core.multiad.remoteconfig;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J5\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u001a"}, d2 = {"Lcom/truecaller/ads/domain/core/multiad/remoteconfig/MultiAdCardRemote;", "", "index", "", "adUnitId", "", "cacheAdUnitId", "fallbackAdUnitId", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getIndex", "()I", "getAdUnitId", "()Ljava/lang/String;", "getCacheAdUnitId", "getFallbackAdUnitId", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "domain_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class MultiAdCardRemote {

    @org.jetbrains.annotations.NotNull
    private final java.lang.String adUnitId;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String cacheAdUnitId;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String fallbackAdUnitId;
    private final int index;

    public MultiAdCardRemote(int i, @org.jetbrains.annotations.NotNull java.lang.String str, @org.jetbrains.annotations.Nullable java.lang.String str2, @org.jetbrains.annotations.Nullable java.lang.String str3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "adUnitId");
        this.index = i;
        this.adUnitId = str;
        this.cacheAdUnitId = str2;
        this.fallbackAdUnitId = str3;
    }

    public static /* synthetic */ com.truecaller.ads.domain.core.multiad.remoteconfig.MultiAdCardRemote copy$default(com.truecaller.ads.domain.core.multiad.remoteconfig.MultiAdCardRemote multiAdCardRemote, int i, java.lang.String str, java.lang.String str2, java.lang.String str3, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = multiAdCardRemote.index;
        }
        if ((i2 & 2) != 0) {
            str = multiAdCardRemote.adUnitId;
        }
        if ((i2 & 4) != 0) {
            str2 = multiAdCardRemote.cacheAdUnitId;
        }
        if ((i2 & 8) != 0) {
            str3 = multiAdCardRemote.fallbackAdUnitId;
        }
        return multiAdCardRemote.copy(i, str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component2, reason: from getter */
    public final java.lang.String getAdUnitId() {
        return this.adUnitId;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component3, reason: from getter */
    public final java.lang.String getCacheAdUnitId() {
        return this.cacheAdUnitId;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component4, reason: from getter */
    public final java.lang.String getFallbackAdUnitId() {
        return this.fallbackAdUnitId;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.ads.domain.core.multiad.remoteconfig.MultiAdCardRemote copy(int index, @org.jetbrains.annotations.NotNull java.lang.String adUnitId, @org.jetbrains.annotations.Nullable java.lang.String cacheAdUnitId, @org.jetbrains.annotations.Nullable java.lang.String fallbackAdUnitId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        return new com.truecaller.ads.domain.core.multiad.remoteconfig.MultiAdCardRemote(index, adUnitId, cacheAdUnitId, fallbackAdUnitId);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.ads.domain.core.multiad.remoteconfig.MultiAdCardRemote)) {
            return false;
        }
        com.truecaller.ads.domain.core.multiad.remoteconfig.MultiAdCardRemote multiAdCardRemote = (com.truecaller.ads.domain.core.multiad.remoteconfig.MultiAdCardRemote) other;
        return this.index == multiAdCardRemote.index && kotlin.jvm.internal.Intrinsics.b(this.adUnitId, multiAdCardRemote.adUnitId) && kotlin.jvm.internal.Intrinsics.b(this.cacheAdUnitId, multiAdCardRemote.cacheAdUnitId) && kotlin.jvm.internal.Intrinsics.b(this.fallbackAdUnitId, multiAdCardRemote.fallbackAdUnitId);
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getAdUnitId() {
        return this.adUnitId;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getCacheAdUnitId() {
        return this.cacheAdUnitId;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getFallbackAdUnitId() {
        return this.fallbackAdUnitId;
    }

    public final int getIndex() {
        return this.index;
    }

    public int hashCode() {
        int hashCode;
        int e = ax1.bar.e(this.index * 31, 31, this.adUnitId);
        java.lang.String str = this.cacheAdUnitId;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (e + hashCode) * 31;
        java.lang.String str2 = this.fallbackAdUnitId;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return i2 + i;
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        int i = this.index;
        java.lang.String str = this.adUnitId;
        return bar.x(qb.qux.r("MultiAdCardRemote(index=", i, ", adUnitId=", str, ", cacheAdUnitId="), this.cacheAdUnitId, ", fallbackAdUnitId=", this.fallbackAdUnitId, ")");
    }

    public /* synthetic */ MultiAdCardRemote(int i, java.lang.String str, java.lang.String str2, java.lang.String str3, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? null : str3);
    }
}
