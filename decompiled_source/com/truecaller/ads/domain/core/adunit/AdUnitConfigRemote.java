package com.truecaller.ads.domain.core.adunit;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/truecaller/ads/domain/core/adunit/AdUnitConfigRemote;", "", "version", "", "adUnits", "", "Lcom/truecaller/ads/domain/core/adunit/AdUnitRemote;", "<init>", "(ILjava/util/List;)V", "getVersion", "()I", "getAdUnits", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "domain_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class AdUnitConfigRemote {

    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.truecaller.ads.domain.core.adunit.AdUnitRemote> adUnits;
    private final int version;

    public AdUnitConfigRemote(int i, @org.jetbrains.annotations.NotNull java.util.List<com.truecaller.ads.domain.core.adunit.AdUnitRemote> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "adUnits");
        this.version = i;
        this.adUnits = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.truecaller.ads.domain.core.adunit.AdUnitConfigRemote copy$default(com.truecaller.ads.domain.core.adunit.AdUnitConfigRemote adUnitConfigRemote, int i, java.util.List list, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = adUnitConfigRemote.version;
        }
        if ((i2 & 2) != 0) {
            list = adUnitConfigRemote.adUnits;
        }
        return adUnitConfigRemote.copy(i, list);
    }

    /* renamed from: component1, reason: from getter */
    public final int getVersion() {
        return this.version;
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.truecaller.ads.domain.core.adunit.AdUnitRemote> component2() {
        return this.adUnits;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.ads.domain.core.adunit.AdUnitConfigRemote copy(int version, @org.jetbrains.annotations.NotNull java.util.List<com.truecaller.ads.domain.core.adunit.AdUnitRemote> adUnits) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnits, "adUnits");
        return new com.truecaller.ads.domain.core.adunit.AdUnitConfigRemote(version, adUnits);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.ads.domain.core.adunit.AdUnitConfigRemote)) {
            return false;
        }
        com.truecaller.ads.domain.core.adunit.AdUnitConfigRemote adUnitConfigRemote = (com.truecaller.ads.domain.core.adunit.AdUnitConfigRemote) other;
        return this.version == adUnitConfigRemote.version && kotlin.jvm.internal.Intrinsics.b(this.adUnits, adUnitConfigRemote.adUnits);
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.truecaller.ads.domain.core.adunit.AdUnitRemote> getAdUnits() {
        return this.adUnits;
    }

    public final int getVersion() {
        return this.version;
    }

    public int hashCode() {
        return this.adUnits.hashCode() + (this.version * 31);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return "AdUnitConfigRemote(version=" + this.version + ", adUnits=" + this.adUnits + ")";
    }
}
