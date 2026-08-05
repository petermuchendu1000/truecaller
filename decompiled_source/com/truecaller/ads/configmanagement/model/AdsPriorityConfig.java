package com.truecaller.ads.configmanagement.model;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0004HÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0004HÖ\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/truecaller/ads/configmanagement/model/AdsPriorityConfig;", "", "adType", "", "", "priority", "Lcom/truecaller/ads/configmanagement/model/AdPriority;", "placement", "<init>", "(Ljava/util/List;Lcom/truecaller/ads/configmanagement/model/AdPriority;Ljava/lang/String;)V", "getAdType", "()Ljava/util/List;", "getPriority", "()Lcom/truecaller/ads/configmanagement/model/AdPriority;", "getPlacement", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "ads-legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class AdsPriorityConfig {
    public static final int $stable = 8;

    @bw.qux("adType")
    @org.jetbrains.annotations.NotNull
    private final java.util.List<java.lang.String> adType;

    @bw.qux("placement")
    @org.jetbrains.annotations.NotNull
    private final java.lang.String placement;

    @bw.qux("priority")
    @org.jetbrains.annotations.NotNull
    private final com.truecaller.ads.configmanagement.model.AdPriority priority;

    public AdsPriorityConfig(@org.jetbrains.annotations.NotNull java.util.List<java.lang.String> list, @org.jetbrains.annotations.NotNull com.truecaller.ads.configmanagement.model.AdPriority adPriority, @org.jetbrains.annotations.NotNull java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "adType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adPriority, "priority");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "placement");
        this.adType = list;
        this.priority = adPriority;
        this.placement = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.truecaller.ads.configmanagement.model.AdsPriorityConfig copy$default(com.truecaller.ads.configmanagement.model.AdsPriorityConfig adsPriorityConfig, java.util.List list, com.truecaller.ads.configmanagement.model.AdPriority adPriority, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = adsPriorityConfig.adType;
        }
        if ((i & 2) != 0) {
            adPriority = adsPriorityConfig.priority;
        }
        if ((i & 4) != 0) {
            str = adsPriorityConfig.placement;
        }
        return adsPriorityConfig.copy(list, adPriority, str);
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.String> component1() {
        return this.adType;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component2, reason: from getter */
    public final com.truecaller.ads.configmanagement.model.AdPriority getPriority() {
        return this.priority;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component3, reason: from getter */
    public final java.lang.String getPlacement() {
        return this.placement;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.ads.configmanagement.model.AdsPriorityConfig copy(@org.jetbrains.annotations.NotNull java.util.List<java.lang.String> adType, @org.jetbrains.annotations.NotNull com.truecaller.ads.configmanagement.model.AdPriority priority, @org.jetbrains.annotations.NotNull java.lang.String placement) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adType, "adType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(priority, "priority");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(placement, "placement");
        return new com.truecaller.ads.configmanagement.model.AdsPriorityConfig(adType, priority, placement);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.ads.configmanagement.model.AdsPriorityConfig)) {
            return false;
        }
        com.truecaller.ads.configmanagement.model.AdsPriorityConfig adsPriorityConfig = (com.truecaller.ads.configmanagement.model.AdsPriorityConfig) other;
        return kotlin.jvm.internal.Intrinsics.b(this.adType, adsPriorityConfig.adType) && this.priority == adsPriorityConfig.priority && kotlin.jvm.internal.Intrinsics.b(this.placement, adsPriorityConfig.placement);
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.String> getAdType() {
        return this.adType;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getPlacement() {
        return this.placement;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.ads.configmanagement.model.AdPriority getPriority() {
        return this.priority;
    }

    public int hashCode() {
        return this.placement.hashCode() + ((this.priority.hashCode() + (this.adType.hashCode() * 31)) * 31);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        java.util.List<java.lang.String> list = this.adType;
        com.truecaller.ads.configmanagement.model.AdPriority adPriority = this.priority;
        java.lang.String str = this.placement;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AdsPriorityConfig(adType=");
        sb.append(list);
        sb.append(", priority=");
        sb.append(adPriority);
        sb.append(", placement=");
        return bar.v(str, ")", sb);
    }

    public AdsPriorityConfig(java.util.List list, com.truecaller.ads.configmanagement.model.AdPriority adPriority, java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? kotlin.collections.h0.a : list, (i & 2) != 0 ? com.truecaller.ads.configmanagement.model.AdPriority.GAM : adPriority, str);
    }
}
