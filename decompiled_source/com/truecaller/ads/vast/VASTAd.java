package com.truecaller.ads.vast;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0001\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J3\u0010\u0012\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0003\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000b¨\u0006\u0019"}, d2 = {"Lcom/truecaller/ads/vast/VASTAd;", "", "version", "", "ad", "", "Lcom/truecaller/ads/vast/Ad;", "error", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getVersion", "()Ljava/lang/String;", "getAd", "()Ljava/util/List;", "getError", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "ads-legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class VASTAd {
    public static final int $stable = 8;

    @org.jetbrains.annotations.Nullable
    private final java.util.List<com.truecaller.ads.vast.Ad> ad;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String error;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String version;

    public VASTAd(@ak.f0("version") @org.jetbrains.annotations.Nullable java.lang.String str, @ak.f0("Ad") @org.jetbrains.annotations.Nullable java.util.List<com.truecaller.ads.vast.Ad> list, @ak.f0("Error") @org.jetbrains.annotations.Nullable java.lang.String str2) {
        this.version = str;
        this.ad = list;
        this.error = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.truecaller.ads.vast.VASTAd copy$default(com.truecaller.ads.vast.VASTAd vASTAd, java.lang.String str, java.util.List list, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = vASTAd.version;
        }
        if ((i & 2) != 0) {
            list = vASTAd.ad;
        }
        if ((i & 4) != 0) {
            str2 = vASTAd.error;
        }
        return vASTAd.copy(str, list, str2);
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component1, reason: from getter */
    public final java.lang.String getVersion() {
        return this.version;
    }

    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.truecaller.ads.vast.Ad> component2() {
        return this.ad;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component3, reason: from getter */
    public final java.lang.String getError() {
        return this.error;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.ads.vast.VASTAd copy(@ak.f0("version") @org.jetbrains.annotations.Nullable java.lang.String version, @ak.f0("Ad") @org.jetbrains.annotations.Nullable java.util.List<com.truecaller.ads.vast.Ad> ad, @ak.f0("Error") @org.jetbrains.annotations.Nullable java.lang.String error) {
        return new com.truecaller.ads.vast.VASTAd(version, ad, error);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.ads.vast.VASTAd)) {
            return false;
        }
        com.truecaller.ads.vast.VASTAd vASTAd = (com.truecaller.ads.vast.VASTAd) other;
        return kotlin.jvm.internal.Intrinsics.b(this.version, vASTAd.version) && kotlin.jvm.internal.Intrinsics.b(this.ad, vASTAd.ad) && kotlin.jvm.internal.Intrinsics.b(this.error, vASTAd.error);
    }

    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.truecaller.ads.vast.Ad> getAd() {
        return this.ad;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getError() {
        return this.error;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getVersion() {
        return this.version;
    }

    public int hashCode() {
        java.lang.String str = this.version;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.util.List<com.truecaller.ads.vast.Ad> list = this.ad;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        java.lang.String str2 = this.error;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return bar.v(this.error, ")", com.appsflyer.internal.e.r("VASTAd(version=", this.version, ", ad=", this.ad, ", error="));
    }
}
