package com.truecaller.ads.mutliad.util;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u000b\u0010\fJ\u0006\u0010\u0014\u001a\u00020\u0015J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J7\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u00052\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0015HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, d2 = {"Lcom/truecaller/ads/mutliad/util/MultiAdRemoteConfig;", "", "placement", "", "isPrefetchEnabled", "", "autoScrollConfig", "Lcom/truecaller/ads/mutliad/util/MultiAdRemoteConfigAutoScroll;", "cards", "", "Lcom/truecaller/ads/mutliad/util/MultiAdRemoteConfigCard;", "<init>", "(Ljava/lang/String;ZLcom/truecaller/ads/mutliad/util/MultiAdRemoteConfigAutoScroll;Ljava/util/List;)V", "getPlacement", "()Ljava/lang/String;", "()Z", "getAutoScrollConfig", "()Lcom/truecaller/ads/mutliad/util/MultiAdRemoteConfigAutoScroll;", "getCards", "()Ljava/util/List;", "getCount", "", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "ads-legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class MultiAdRemoteConfig {
    public static final int $stable = 8;

    @org.jetbrains.annotations.NotNull
    private final com.truecaller.ads.mutliad.util.MultiAdRemoteConfigAutoScroll autoScrollConfig;

    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.truecaller.ads.mutliad.util.MultiAdRemoteConfigCard> cards;
    private final boolean isPrefetchEnabled;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String placement;

    public MultiAdRemoteConfig(@org.jetbrains.annotations.NotNull java.lang.String str, boolean z, @org.jetbrains.annotations.NotNull com.truecaller.ads.mutliad.util.MultiAdRemoteConfigAutoScroll multiAdRemoteConfigAutoScroll, @org.jetbrains.annotations.NotNull java.util.List<com.truecaller.ads.mutliad.util.MultiAdRemoteConfigCard> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "placement");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(multiAdRemoteConfigAutoScroll, "autoScrollConfig");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "cards");
        this.placement = str;
        this.isPrefetchEnabled = z;
        this.autoScrollConfig = multiAdRemoteConfigAutoScroll;
        this.cards = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.truecaller.ads.mutliad.util.MultiAdRemoteConfig copy$default(com.truecaller.ads.mutliad.util.MultiAdRemoteConfig multiAdRemoteConfig, java.lang.String str, boolean z, com.truecaller.ads.mutliad.util.MultiAdRemoteConfigAutoScroll multiAdRemoteConfigAutoScroll, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = multiAdRemoteConfig.placement;
        }
        if ((i & 2) != 0) {
            z = multiAdRemoteConfig.isPrefetchEnabled;
        }
        if ((i & 4) != 0) {
            multiAdRemoteConfigAutoScroll = multiAdRemoteConfig.autoScrollConfig;
        }
        if ((i & 8) != 0) {
            list = multiAdRemoteConfig.cards;
        }
        return multiAdRemoteConfig.copy(str, z, multiAdRemoteConfigAutoScroll, list);
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component1, reason: from getter */
    public final java.lang.String getPlacement() {
        return this.placement;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsPrefetchEnabled() {
        return this.isPrefetchEnabled;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component3, reason: from getter */
    public final com.truecaller.ads.mutliad.util.MultiAdRemoteConfigAutoScroll getAutoScrollConfig() {
        return this.autoScrollConfig;
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.truecaller.ads.mutliad.util.MultiAdRemoteConfigCard> component4() {
        return this.cards;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.ads.mutliad.util.MultiAdRemoteConfig copy(@org.jetbrains.annotations.NotNull java.lang.String placement, boolean isPrefetchEnabled, @org.jetbrains.annotations.NotNull com.truecaller.ads.mutliad.util.MultiAdRemoteConfigAutoScroll autoScrollConfig, @org.jetbrains.annotations.NotNull java.util.List<com.truecaller.ads.mutliad.util.MultiAdRemoteConfigCard> cards) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(placement, "placement");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(autoScrollConfig, "autoScrollConfig");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cards, "cards");
        return new com.truecaller.ads.mutliad.util.MultiAdRemoteConfig(placement, isPrefetchEnabled, autoScrollConfig, cards);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.ads.mutliad.util.MultiAdRemoteConfig)) {
            return false;
        }
        com.truecaller.ads.mutliad.util.MultiAdRemoteConfig multiAdRemoteConfig = (com.truecaller.ads.mutliad.util.MultiAdRemoteConfig) other;
        return kotlin.jvm.internal.Intrinsics.b(this.placement, multiAdRemoteConfig.placement) && this.isPrefetchEnabled == multiAdRemoteConfig.isPrefetchEnabled && kotlin.jvm.internal.Intrinsics.b(this.autoScrollConfig, multiAdRemoteConfig.autoScrollConfig) && kotlin.jvm.internal.Intrinsics.b(this.cards, multiAdRemoteConfig.cards);
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.ads.mutliad.util.MultiAdRemoteConfigAutoScroll getAutoScrollConfig() {
        return this.autoScrollConfig;
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.truecaller.ads.mutliad.util.MultiAdRemoteConfigCard> getCards() {
        return this.cards;
    }

    public final int getCount() {
        return this.cards.size();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getPlacement() {
        return this.placement;
    }

    public int hashCode() {
        int i;
        int hashCode = this.placement.hashCode() * 31;
        if (this.isPrefetchEnabled) {
            i = 1231;
        } else {
            i = 1237;
        }
        return this.cards.hashCode() + ((this.autoScrollConfig.hashCode() + ((hashCode + i) * 31)) * 31);
    }

    public final boolean isPrefetchEnabled() {
        return this.isPrefetchEnabled;
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        java.lang.String str = this.placement;
        boolean z = this.isPrefetchEnabled;
        com.truecaller.ads.mutliad.util.MultiAdRemoteConfigAutoScroll multiAdRemoteConfigAutoScroll = this.autoScrollConfig;
        java.util.List<com.truecaller.ads.mutliad.util.MultiAdRemoteConfigCard> list = this.cards;
        java.lang.StringBuilder t = ax1.bar.t("MultiAdRemoteConfig(placement=", str, ", isPrefetchEnabled=", ", autoScrollConfig=", z);
        t.append(multiAdRemoteConfigAutoScroll);
        t.append(", cards=");
        t.append(list);
        t.append(")");
        return t.toString();
    }

    public /* synthetic */ MultiAdRemoteConfig(java.lang.String str, boolean z, com.truecaller.ads.mutliad.util.MultiAdRemoteConfigAutoScroll multiAdRemoteConfigAutoScroll, java.util.List list, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z, (i & 4) != 0 ? new com.truecaller.ads.mutliad.util.MultiAdRemoteConfigAutoScroll(false, 0L, 3, null) : multiAdRemoteConfigAutoScroll, list);
    }
}
