package com.truecaller.ads.api.internal.dl.model;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\nHÆ\u0003J9\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006 "}, d2 = {"Lcom/truecaller/ads/api/internal/dl/model/DlFlow;", "", com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.ID_COLUMN, "", "timeout", "", "dlPlacements", "", "Lcom/truecaller/ads/api/internal/dl/model/DlPlacement;", "connectConfig", "Lcom/truecaller/ads/api/internal/dl/model/DlConnectConfig;", "<init>", "(Ljava/lang/String;JLjava/util/List;Lcom/truecaller/ads/api/internal/dl/model/DlConnectConfig;)V", "getId", "()Ljava/lang/String;", "getTimeout", "()J", "getDlPlacements", "()Ljava/util/List;", "getConnectConfig", "()Lcom/truecaller/ads/api/internal/dl/model/DlConnectConfig;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class DlFlow {

    @org.jetbrains.annotations.Nullable
    private final com.truecaller.ads.api.internal.dl.model.DlConnectConfig connectConfig;

    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.truecaller.ads.api.internal.dl.model.DlPlacement> dlPlacements;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String id;
    private final long timeout;

    public DlFlow(@org.jetbrains.annotations.NotNull java.lang.String str, long j, @org.jetbrains.annotations.NotNull java.util.List<com.truecaller.ads.api.internal.dl.model.DlPlacement> list, @org.jetbrains.annotations.Nullable com.truecaller.ads.api.internal.dl.model.DlConnectConfig dlConnectConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.ID_COLUMN);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "dlPlacements");
        this.id = str;
        this.timeout = j;
        this.dlPlacements = list;
        this.connectConfig = dlConnectConfig;
    }

    public static /* synthetic */ com.truecaller.ads.api.internal.dl.model.DlFlow copy$default(com.truecaller.ads.api.internal.dl.model.DlFlow dlFlow, java.lang.String str, long j, java.util.List list, com.truecaller.ads.api.internal.dl.model.DlConnectConfig dlConnectConfig, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = dlFlow.id;
        }
        if ((i & 2) != 0) {
            j = dlFlow.timeout;
        }
        if ((i & 4) != 0) {
            list = dlFlow.dlPlacements;
        }
        if ((i & 8) != 0) {
            dlConnectConfig = dlFlow.connectConfig;
        }
        return dlFlow.copy(str, j, list, dlConnectConfig);
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final long getTimeout() {
        return this.timeout;
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.truecaller.ads.api.internal.dl.model.DlPlacement> component3() {
        return this.dlPlacements;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component4, reason: from getter */
    public final com.truecaller.ads.api.internal.dl.model.DlConnectConfig getConnectConfig() {
        return this.connectConfig;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.ads.api.internal.dl.model.DlFlow copy(@org.jetbrains.annotations.NotNull java.lang.String id, long timeout, @org.jetbrains.annotations.NotNull java.util.List<com.truecaller.ads.api.internal.dl.model.DlPlacement> dlPlacements, @org.jetbrains.annotations.Nullable com.truecaller.ads.api.internal.dl.model.DlConnectConfig connectConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.ID_COLUMN);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dlPlacements, "dlPlacements");
        return new com.truecaller.ads.api.internal.dl.model.DlFlow(id, timeout, dlPlacements, connectConfig);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.ads.api.internal.dl.model.DlFlow)) {
            return false;
        }
        com.truecaller.ads.api.internal.dl.model.DlFlow dlFlow = (com.truecaller.ads.api.internal.dl.model.DlFlow) other;
        return kotlin.jvm.internal.Intrinsics.b(this.id, dlFlow.id) && this.timeout == dlFlow.timeout && kotlin.jvm.internal.Intrinsics.b(this.dlPlacements, dlFlow.dlPlacements) && kotlin.jvm.internal.Intrinsics.b(this.connectConfig, dlFlow.connectConfig);
    }

    @org.jetbrains.annotations.Nullable
    public final com.truecaller.ads.api.internal.dl.model.DlConnectConfig getConnectConfig() {
        return this.connectConfig;
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.truecaller.ads.api.internal.dl.model.DlPlacement> getDlPlacements() {
        return this.dlPlacements;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getId() {
        return this.id;
    }

    public final long getTimeout() {
        return this.timeout;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.id.hashCode() * 31;
        long j = this.timeout;
        int g = uf.qux.g((hashCode2 + ((int) (j ^ (j >>> 32)))) * 31, 31, this.dlPlacements);
        com.truecaller.ads.api.internal.dl.model.DlConnectConfig dlConnectConfig = this.connectConfig;
        if (dlConnectConfig == null) {
            hashCode = 0;
        } else {
            hashCode = dlConnectConfig.hashCode();
        }
        return g + hashCode;
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        java.lang.String str = this.id;
        long j = this.timeout;
        java.util.List<com.truecaller.ads.api.internal.dl.model.DlPlacement> list = this.dlPlacements;
        com.truecaller.ads.api.internal.dl.model.DlConnectConfig dlConnectConfig = this.connectConfig;
        java.lang.StringBuilder q = com.appsflyer.internal.e.q("DlFlow(id=", str, ", timeout=", j);
        q.append(", dlPlacements=");
        q.append(list);
        q.append(", connectConfig=");
        q.append(dlConnectConfig);
        q.append(")");
        return q.toString();
    }

    public /* synthetic */ DlFlow(java.lang.String str, long j, java.util.List list, com.truecaller.ads.api.internal.dl.model.DlConnectConfig dlConnectConfig, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j, list, (i & 8) != 0 ? null : dlConnectConfig);
    }
}
