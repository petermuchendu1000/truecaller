package com.truecaller.ads.api.internal.dl.model;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\bHÆ\u0003J/\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\bHÖ\u0001J\t\u0010\u0019\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001a"}, d2 = {"Lcom/truecaller/ads/api/internal/dl/model/DlPriorityEntry;", "", "adSource", "Lcom/truecaller/ads/api/model/ad/AdSource;", "partnerFilter", "", "", "tier", "", "<init>", "(Lcom/truecaller/ads/api/model/ad/AdSource;Ljava/util/List;I)V", "getAdSource", "()Lcom/truecaller/ads/api/model/ad/AdSource;", "getPartnerFilter", "()Ljava/util/List;", "getTier", "()I", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class DlPriorityEntry {

    @org.jetbrains.annotations.NotNull
    private final com.truecaller.ads.api.model.ad.AdSource adSource;

    @org.jetbrains.annotations.Nullable
    private final java.util.List<java.lang.String> partnerFilter;
    private final int tier;

    public DlPriorityEntry(@org.jetbrains.annotations.NotNull com.truecaller.ads.api.model.ad.AdSource adSource, @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> list, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adSource, "adSource");
        this.adSource = adSource;
        this.partnerFilter = list;
        this.tier = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.truecaller.ads.api.internal.dl.model.DlPriorityEntry copy$default(com.truecaller.ads.api.internal.dl.model.DlPriorityEntry dlPriorityEntry, com.truecaller.ads.api.model.ad.AdSource adSource, java.util.List list, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            adSource = dlPriorityEntry.adSource;
        }
        if ((i2 & 2) != 0) {
            list = dlPriorityEntry.partnerFilter;
        }
        if ((i2 & 4) != 0) {
            i = dlPriorityEntry.tier;
        }
        return dlPriorityEntry.copy(adSource, list, i);
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component1, reason: from getter */
    public final com.truecaller.ads.api.model.ad.AdSource getAdSource() {
        return this.adSource;
    }

    @org.jetbrains.annotations.Nullable
    public final java.util.List<java.lang.String> component2() {
        return this.partnerFilter;
    }

    /* renamed from: component3, reason: from getter */
    public final int getTier() {
        return this.tier;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.ads.api.internal.dl.model.DlPriorityEntry copy(@org.jetbrains.annotations.NotNull com.truecaller.ads.api.model.ad.AdSource adSource, @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> partnerFilter, int tier) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adSource, "adSource");
        return new com.truecaller.ads.api.internal.dl.model.DlPriorityEntry(adSource, partnerFilter, tier);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.ads.api.internal.dl.model.DlPriorityEntry)) {
            return false;
        }
        com.truecaller.ads.api.internal.dl.model.DlPriorityEntry dlPriorityEntry = (com.truecaller.ads.api.internal.dl.model.DlPriorityEntry) other;
        return this.adSource == dlPriorityEntry.adSource && kotlin.jvm.internal.Intrinsics.b(this.partnerFilter, dlPriorityEntry.partnerFilter) && this.tier == dlPriorityEntry.tier;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.ads.api.model.ad.AdSource getAdSource() {
        return this.adSource;
    }

    @org.jetbrains.annotations.Nullable
    public final java.util.List<java.lang.String> getPartnerFilter() {
        return this.partnerFilter;
    }

    public final int getTier() {
        return this.tier;
    }

    public int hashCode() {
        int hashCode = this.adSource.hashCode() * 31;
        java.util.List<java.lang.String> list = this.partnerFilter;
        return ((hashCode + (list == null ? 0 : list.hashCode())) * 31) + this.tier;
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        com.truecaller.ads.api.model.ad.AdSource adSource = this.adSource;
        java.util.List<java.lang.String> list = this.partnerFilter;
        int i = this.tier;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DlPriorityEntry(adSource=");
        sb.append(adSource);
        sb.append(", partnerFilter=");
        sb.append(list);
        sb.append(", tier=");
        return bar.m(i, ")", sb);
    }

    public /* synthetic */ DlPriorityEntry(com.truecaller.ads.api.model.ad.AdSource adSource, java.util.List list, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(adSource, (i2 & 2) != 0 ? null : list, (i2 & 4) != 0 ? 0 : i);
    }
}
