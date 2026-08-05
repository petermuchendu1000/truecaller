package com.truecaller.ads.api.internal.dl.model;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J7\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006 "}, d2 = {"Lcom/truecaller/ads/api/internal/dl/model/DlRequestSource;", "", "adRequestSource", "Lcom/truecaller/ads/api/model/ad/AdRequestSource;", com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.TYPE_COLUMN, "Lcom/truecaller/ads/api/internal/dl/model/DlRequestSourceType;", "uuid", "", "flows", "", "Lcom/truecaller/ads/api/internal/dl/model/DlFlow;", "<init>", "(Lcom/truecaller/ads/api/model/ad/AdRequestSource;Lcom/truecaller/ads/api/internal/dl/model/DlRequestSourceType;Ljava/lang/String;Ljava/util/List;)V", "getAdRequestSource", "()Lcom/truecaller/ads/api/model/ad/AdRequestSource;", "getType", "()Lcom/truecaller/ads/api/internal/dl/model/DlRequestSourceType;", "getUuid", "()Ljava/lang/String;", "getFlows", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class DlRequestSource {

    @org.jetbrains.annotations.NotNull
    private final com.truecaller.ads.api.model.ad.AdRequestSource adRequestSource;

    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.truecaller.ads.api.internal.dl.model.DlFlow> flows;

    @org.jetbrains.annotations.NotNull
    private final com.truecaller.ads.api.internal.dl.model.DlRequestSourceType type;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String uuid;

    public DlRequestSource(@org.jetbrains.annotations.NotNull com.truecaller.ads.api.model.ad.AdRequestSource adRequestSource, @org.jetbrains.annotations.NotNull com.truecaller.ads.api.internal.dl.model.DlRequestSourceType dlRequestSourceType, @org.jetbrains.annotations.NotNull java.lang.String str, @org.jetbrains.annotations.NotNull java.util.List<com.truecaller.ads.api.internal.dl.model.DlFlow> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adRequestSource, "adRequestSource");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dlRequestSourceType, com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.TYPE_COLUMN);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "uuid");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "flows");
        this.adRequestSource = adRequestSource;
        this.type = dlRequestSourceType;
        this.uuid = str;
        this.flows = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.truecaller.ads.api.internal.dl.model.DlRequestSource copy$default(com.truecaller.ads.api.internal.dl.model.DlRequestSource dlRequestSource, com.truecaller.ads.api.model.ad.AdRequestSource adRequestSource, com.truecaller.ads.api.internal.dl.model.DlRequestSourceType dlRequestSourceType, java.lang.String str, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            adRequestSource = dlRequestSource.adRequestSource;
        }
        if ((i & 2) != 0) {
            dlRequestSourceType = dlRequestSource.type;
        }
        if ((i & 4) != 0) {
            str = dlRequestSource.uuid;
        }
        if ((i & 8) != 0) {
            list = dlRequestSource.flows;
        }
        return dlRequestSource.copy(adRequestSource, dlRequestSourceType, str, list);
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component1, reason: from getter */
    public final com.truecaller.ads.api.model.ad.AdRequestSource getAdRequestSource() {
        return this.adRequestSource;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component2, reason: from getter */
    public final com.truecaller.ads.api.internal.dl.model.DlRequestSourceType getType() {
        return this.type;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component3, reason: from getter */
    public final java.lang.String getUuid() {
        return this.uuid;
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.truecaller.ads.api.internal.dl.model.DlFlow> component4() {
        return this.flows;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.ads.api.internal.dl.model.DlRequestSource copy(@org.jetbrains.annotations.NotNull com.truecaller.ads.api.model.ad.AdRequestSource adRequestSource, @org.jetbrains.annotations.NotNull com.truecaller.ads.api.internal.dl.model.DlRequestSourceType r3, @org.jetbrains.annotations.NotNull java.lang.String uuid, @org.jetbrains.annotations.NotNull java.util.List<com.truecaller.ads.api.internal.dl.model.DlFlow> flows) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adRequestSource, "adRequestSource");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.TYPE_COLUMN);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uuid, "uuid");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flows, "flows");
        return new com.truecaller.ads.api.internal.dl.model.DlRequestSource(adRequestSource, r3, uuid, flows);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.ads.api.internal.dl.model.DlRequestSource)) {
            return false;
        }
        com.truecaller.ads.api.internal.dl.model.DlRequestSource dlRequestSource = (com.truecaller.ads.api.internal.dl.model.DlRequestSource) other;
        return kotlin.jvm.internal.Intrinsics.b(this.adRequestSource, dlRequestSource.adRequestSource) && this.type == dlRequestSource.type && kotlin.jvm.internal.Intrinsics.b(this.uuid, dlRequestSource.uuid) && kotlin.jvm.internal.Intrinsics.b(this.flows, dlRequestSource.flows);
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.ads.api.model.ad.AdRequestSource getAdRequestSource() {
        return this.adRequestSource;
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.truecaller.ads.api.internal.dl.model.DlFlow> getFlows() {
        return this.flows;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.ads.api.internal.dl.model.DlRequestSourceType getType() {
        return this.type;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getUuid() {
        return this.uuid;
    }

    public int hashCode() {
        return this.flows.hashCode() + ax1.bar.e((this.type.hashCode() + (this.adRequestSource.hashCode() * 31)) * 31, 31, this.uuid);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        com.truecaller.ads.api.model.ad.AdRequestSource adRequestSource = this.adRequestSource;
        com.truecaller.ads.api.internal.dl.model.DlRequestSourceType dlRequestSourceType = this.type;
        java.lang.String str = this.uuid;
        java.util.List<com.truecaller.ads.api.internal.dl.model.DlFlow> list = this.flows;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DlRequestSource(adRequestSource=");
        sb.append(adRequestSource);
        sb.append(", type=");
        sb.append(dlRequestSourceType);
        sb.append(", uuid=");
        return z0.a0.d(str, ", flows=", ")", sb, list);
    }

    public /* synthetic */ DlRequestSource(com.truecaller.ads.api.model.ad.AdRequestSource adRequestSource, com.truecaller.ads.api.internal.dl.model.DlRequestSourceType dlRequestSourceType, java.lang.String str, java.util.List list, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(adRequestSource, (i & 2) != 0 ? com.truecaller.ads.api.internal.dl.model.DlRequestSourceType.Live : dlRequestSourceType, (i & 4) != 0 ? "" : str, list);
    }
}
