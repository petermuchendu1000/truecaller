package com.truecaller.ads.api.internal.dl.model;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b¨\u0006\u001a"}, d2 = {"Lcom/truecaller/ads/api/internal/dl/model/DlConnectConfig;", "", "", "connectId", "Lw20/f;", "scope", "<init>", "(Ljava/lang/String;Lw20/f;)V", "component1", "()Ljava/lang/String;", "component2", "()Lw20/f;", "copy", "(Ljava/lang/String;Lw20/f;)Lcom/truecaller/ads/api/internal/dl/model/DlConnectConfig;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getConnectId", "Lw20/f;", "getScope", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class DlConnectConfig {

    @org.jetbrains.annotations.NotNull
    private final java.lang.String connectId;

    @org.jetbrains.annotations.NotNull
    private final w20.f scope;

    public DlConnectConfig(@org.jetbrains.annotations.NotNull java.lang.String str, @org.jetbrains.annotations.NotNull w20.f fVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "connectId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fVar, "scope");
        this.connectId = str;
        this.scope = fVar;
    }

    public static /* synthetic */ com.truecaller.ads.api.internal.dl.model.DlConnectConfig copy$default(com.truecaller.ads.api.internal.dl.model.DlConnectConfig dlConnectConfig, java.lang.String str, w20.f fVar, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = dlConnectConfig.connectId;
        }
        if ((i & 2) != 0) {
            fVar = dlConnectConfig.scope;
        }
        return dlConnectConfig.copy(str, fVar);
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component1, reason: from getter */
    public final java.lang.String getConnectId() {
        return this.connectId;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component2, reason: from getter */
    public final w20.f getScope() {
        return this.scope;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.ads.api.internal.dl.model.DlConnectConfig copy(@org.jetbrains.annotations.NotNull java.lang.String connectId, @org.jetbrains.annotations.NotNull w20.f scope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connectId, "connectId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "scope");
        return new com.truecaller.ads.api.internal.dl.model.DlConnectConfig(connectId, scope);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.ads.api.internal.dl.model.DlConnectConfig)) {
            return false;
        }
        com.truecaller.ads.api.internal.dl.model.DlConnectConfig dlConnectConfig = (com.truecaller.ads.api.internal.dl.model.DlConnectConfig) other;
        return kotlin.jvm.internal.Intrinsics.b(this.connectId, dlConnectConfig.connectId) && kotlin.jvm.internal.Intrinsics.b(this.scope, dlConnectConfig.scope);
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getConnectId() {
        return this.connectId;
    }

    @org.jetbrains.annotations.NotNull
    public final w20.f getScope() {
        return this.scope;
    }

    public int hashCode() {
        return this.scope.hashCode() + (this.connectId.hashCode() * 31);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return "DlConnectConfig(connectId=" + this.connectId + ", scope=" + this.scope + ")";
    }
}
