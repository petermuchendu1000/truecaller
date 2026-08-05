package com.truecaller.ads.provider;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/truecaller/ads/provider/PerformancePlacement;", "", "name", "", "performance", "", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getName", "()Ljava/lang/String;", "getPerformance", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class PerformancePlacement {
    public static final int $stable = 8;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String name;

    @org.jetbrains.annotations.NotNull
    private final java.util.List<java.lang.String> performance;

    public PerformancePlacement(@org.jetbrains.annotations.NotNull java.lang.String str, @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "name");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "performance");
        this.name = str;
        this.performance = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.truecaller.ads.provider.PerformancePlacement copy$default(com.truecaller.ads.provider.PerformancePlacement performancePlacement, java.lang.String str, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = performancePlacement.name;
        }
        if ((i & 2) != 0) {
            list = performancePlacement.performance;
        }
        return performancePlacement.copy(str, list);
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component1, reason: from getter */
    public final java.lang.String getName() {
        return this.name;
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.String> component2() {
        return this.performance;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.ads.provider.PerformancePlacement copy(@org.jetbrains.annotations.NotNull java.lang.String name, @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> performance) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(performance, "performance");
        return new com.truecaller.ads.provider.PerformancePlacement(name, performance);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.ads.provider.PerformancePlacement)) {
            return false;
        }
        com.truecaller.ads.provider.PerformancePlacement performancePlacement = (com.truecaller.ads.provider.PerformancePlacement) other;
        return kotlin.jvm.internal.Intrinsics.b(this.name, performancePlacement.name) && kotlin.jvm.internal.Intrinsics.b(this.performance, performancePlacement.performance);
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getName() {
        return this.name;
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.String> getPerformance() {
        return this.performance;
    }

    public int hashCode() {
        return this.performance.hashCode() + (this.name.hashCode() * 31);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return ro0.f.C("PerformancePlacement(name=", this.name, ", performance=", this.performance, ")");
    }

    public PerformancePlacement(java.lang.String str, java.util.List list, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? kotlin.collections.h0.a : list);
    }
}
