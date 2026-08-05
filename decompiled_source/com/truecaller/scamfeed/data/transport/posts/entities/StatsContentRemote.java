package com.truecaller.scamfeed.data.transport.posts.entities;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003JI\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006!"}, d2 = {"Lcom/truecaller/scamfeed/data/transport/posts/entities/StatsContentRemote;", "", com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_AD_TYPE, "Lcom/truecaller/scamfeed/data/transport/posts/entities/StatsTypeRemote;", "headerTitle", "", "headerSubtitle", "period", "items", "", "Lcom/truecaller/scamfeed/data/transport/posts/entities/StatsContentItemRemote;", "<init>", "(Lcom/truecaller/scamfeed/data/transport/posts/entities/StatsTypeRemote;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getType", "()Lcom/truecaller/scamfeed/data/transport/posts/entities/StatsTypeRemote;", "getHeaderTitle", "()Ljava/lang/String;", "getHeaderSubtitle", "getPeriod", "getItems", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "scam-feed_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final /* data */ class StatsContentRemote {
    public static final int $stable = 8;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String headerSubtitle;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String headerTitle;

    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.truecaller.scamfeed.data.transport.posts.entities.StatsContentItemRemote> items;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String period;

    @org.jetbrains.annotations.Nullable
    private final com.truecaller.scamfeed.data.transport.posts.entities.StatsTypeRemote type;

    public StatsContentRemote() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ com.truecaller.scamfeed.data.transport.posts.entities.StatsContentRemote copy$default(com.truecaller.scamfeed.data.transport.posts.entities.StatsContentRemote statsContentRemote, com.truecaller.scamfeed.data.transport.posts.entities.StatsTypeRemote statsTypeRemote, java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            statsTypeRemote = statsContentRemote.type;
        }
        if ((i & 2) != 0) {
            str = statsContentRemote.headerTitle;
        }
        if ((i & 4) != 0) {
            str2 = statsContentRemote.headerSubtitle;
        }
        if ((i & 8) != 0) {
            str3 = statsContentRemote.period;
        }
        if ((i & 16) != 0) {
            list = statsContentRemote.items;
        }
        java.util.List list2 = list;
        java.lang.String str4 = str2;
        return statsContentRemote.copy(statsTypeRemote, str, str4, str3, list2);
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component1, reason: from getter */
    public final com.truecaller.scamfeed.data.transport.posts.entities.StatsTypeRemote getType() {
        return this.type;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component2, reason: from getter */
    public final java.lang.String getHeaderTitle() {
        return this.headerTitle;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component3, reason: from getter */
    public final java.lang.String getHeaderSubtitle() {
        return this.headerSubtitle;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component4, reason: from getter */
    public final java.lang.String getPeriod() {
        return this.period;
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.truecaller.scamfeed.data.transport.posts.entities.StatsContentItemRemote> component5() {
        return this.items;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.scamfeed.data.transport.posts.entities.StatsContentRemote copy(@org.jetbrains.annotations.Nullable com.truecaller.scamfeed.data.transport.posts.entities.StatsTypeRemote type, @org.jetbrains.annotations.Nullable java.lang.String headerTitle, @org.jetbrains.annotations.Nullable java.lang.String headerSubtitle, @org.jetbrains.annotations.Nullable java.lang.String period, @org.jetbrains.annotations.NotNull java.util.List<com.truecaller.scamfeed.data.transport.posts.entities.StatsContentItemRemote> items) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(items, "items");
        return new com.truecaller.scamfeed.data.transport.posts.entities.StatsContentRemote(type, headerTitle, headerSubtitle, period, items);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.scamfeed.data.transport.posts.entities.StatsContentRemote)) {
            return false;
        }
        com.truecaller.scamfeed.data.transport.posts.entities.StatsContentRemote statsContentRemote = (com.truecaller.scamfeed.data.transport.posts.entities.StatsContentRemote) other;
        return this.type == statsContentRemote.type && kotlin.jvm.internal.Intrinsics.b(this.headerTitle, statsContentRemote.headerTitle) && kotlin.jvm.internal.Intrinsics.b(this.headerSubtitle, statsContentRemote.headerSubtitle) && kotlin.jvm.internal.Intrinsics.b(this.period, statsContentRemote.period) && kotlin.jvm.internal.Intrinsics.b(this.items, statsContentRemote.items);
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getHeaderSubtitle() {
        return this.headerSubtitle;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getHeaderTitle() {
        return this.headerTitle;
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.truecaller.scamfeed.data.transport.posts.entities.StatsContentItemRemote> getItems() {
        return this.items;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getPeriod() {
        return this.period;
    }

    @org.jetbrains.annotations.Nullable
    public final com.truecaller.scamfeed.data.transport.posts.entities.StatsTypeRemote getType() {
        return this.type;
    }

    public int hashCode() {
        com.truecaller.scamfeed.data.transport.posts.entities.StatsTypeRemote statsTypeRemote = this.type;
        int hashCode = (statsTypeRemote == null ? 0 : statsTypeRemote.hashCode()) * 31;
        java.lang.String str = this.headerTitle;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.headerSubtitle;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.period;
        return this.items.hashCode() + ((hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        com.truecaller.scamfeed.data.transport.posts.entities.StatsTypeRemote statsTypeRemote = this.type;
        java.lang.String str = this.headerTitle;
        java.lang.String str2 = this.headerSubtitle;
        java.lang.String str3 = this.period;
        java.util.List<com.truecaller.scamfeed.data.transport.posts.entities.StatsContentItemRemote> list = this.items;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("StatsContentRemote(type=");
        sb.append(statsTypeRemote);
        sb.append(", headerTitle=");
        sb.append(str);
        sb.append(", headerSubtitle=");
        bar.E(sb, str2, ", period=", str3, ", items=");
        return y.o.g(sb, list, ")");
    }

    public StatsContentRemote(@org.jetbrains.annotations.Nullable com.truecaller.scamfeed.data.transport.posts.entities.StatsTypeRemote statsTypeRemote, @org.jetbrains.annotations.Nullable java.lang.String str, @org.jetbrains.annotations.Nullable java.lang.String str2, @org.jetbrains.annotations.Nullable java.lang.String str3, @org.jetbrains.annotations.NotNull java.util.List<com.truecaller.scamfeed.data.transport.posts.entities.StatsContentItemRemote> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "items");
        this.type = statsTypeRemote;
        this.headerTitle = str;
        this.headerSubtitle = str2;
        this.period = str3;
        this.items = list;
    }

    public StatsContentRemote(com.truecaller.scamfeed.data.transport.posts.entities.StatsTypeRemote statsTypeRemote, java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.List list, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : statsTypeRemote, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? kotlin.collections.h0.a : list);
    }
}
