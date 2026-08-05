package com.truecaller.ads.vast;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0010\b\u0001\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\n\u001a\u00020\u00002\u0010\b\u0003\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/truecaller/ads/vast/Creatives;", "", "creative", "", "Lcom/truecaller/ads/vast/Creative;", "<init>", "(Ljava/util/List;)V", "getCreative", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ads-legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class Creatives {
    public static final int $stable = 8;

    @org.jetbrains.annotations.Nullable
    private final java.util.List<com.truecaller.ads.vast.Creative> creative;

    public Creatives(@ak.f0("Creative") @org.jetbrains.annotations.Nullable java.util.List<com.truecaller.ads.vast.Creative> list) {
        this.creative = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.truecaller.ads.vast.Creatives copy$default(com.truecaller.ads.vast.Creatives creatives, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = creatives.creative;
        }
        return creatives.copy(list);
    }

    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.truecaller.ads.vast.Creative> component1() {
        return this.creative;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.ads.vast.Creatives copy(@ak.f0("Creative") @org.jetbrains.annotations.Nullable java.util.List<com.truecaller.ads.vast.Creative> creative) {
        return new com.truecaller.ads.vast.Creatives(creative);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.truecaller.ads.vast.Creatives) && kotlin.jvm.internal.Intrinsics.b(this.creative, ((com.truecaller.ads.vast.Creatives) other).creative);
    }

    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.truecaller.ads.vast.Creative> getCreative() {
        return this.creative;
    }

    public int hashCode() {
        java.util.List<com.truecaller.ads.vast.Creative> list = this.creative;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return com.appsflyer.internal.e.k("Creatives(creative=", ")", this.creative);
    }
}
