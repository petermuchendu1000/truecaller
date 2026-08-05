package com.truecaller.ads.vast;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0010\b\u0001\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\n\u001a\u00020\u00002\u0010\b\u0003\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0004HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0011"}, d2 = {"Lcom/truecaller/ads/vast/CreativeExtensions;", "", "creativeExtension", "", "", "<init>", "(Ljava/util/List;)V", "getCreativeExtension", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "ads-legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class CreativeExtensions {
    public static final int $stable = 8;

    @org.jetbrains.annotations.Nullable
    private final java.util.List<java.lang.String> creativeExtension;

    public CreativeExtensions(@ak.f0("CreativeExtension") @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> list) {
        this.creativeExtension = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.truecaller.ads.vast.CreativeExtensions copy$default(com.truecaller.ads.vast.CreativeExtensions creativeExtensions, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = creativeExtensions.creativeExtension;
        }
        return creativeExtensions.copy(list);
    }

    @org.jetbrains.annotations.Nullable
    public final java.util.List<java.lang.String> component1() {
        return this.creativeExtension;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.ads.vast.CreativeExtensions copy(@ak.f0("CreativeExtension") @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> creativeExtension) {
        return new com.truecaller.ads.vast.CreativeExtensions(creativeExtension);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.truecaller.ads.vast.CreativeExtensions) && kotlin.jvm.internal.Intrinsics.b(this.creativeExtension, ((com.truecaller.ads.vast.CreativeExtensions) other).creativeExtension);
    }

    @org.jetbrains.annotations.Nullable
    public final java.util.List<java.lang.String> getCreativeExtension() {
        return this.creativeExtension;
    }

    public int hashCode() {
        java.util.List<java.lang.String> list = this.creativeExtension;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return com.appsflyer.internal.e.k("CreativeExtensions(creativeExtension=", ")", this.creativeExtension);
    }
}
