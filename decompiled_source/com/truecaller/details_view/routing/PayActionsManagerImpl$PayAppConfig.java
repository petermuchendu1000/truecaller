package com.truecaller.details_view.routing;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0081\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\n\u001a\u00020\t2\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\b¨\u0006\u0018"}, d2 = {"com/truecaller/details_view/routing/PayActionsManagerImpl$PayAppConfig", "", "", "Lcom/truecaller/details_view/routing/PayActionsManagerImpl$PayApp;", "availableApps", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "Lcom/truecaller/details_view/routing/PayActionsManagerImpl$PayAppConfig;", "copy", "(Ljava/util/List;)Lcom/truecaller/details_view/routing/PayActionsManagerImpl$PayAppConfig;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getAvailableApps", "details-view_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final /* data */ class PayActionsManagerImpl$PayAppConfig {
    public static final int $stable = 8;

    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.truecaller.details_view.routing.PayActionsManagerImpl$PayApp> availableApps;

    public PayActionsManagerImpl$PayAppConfig(@org.jetbrains.annotations.NotNull java.util.List<com.truecaller.details_view.routing.PayActionsManagerImpl$PayApp> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "availableApps");
        this.availableApps = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.truecaller.details_view.routing.PayActionsManagerImpl$PayAppConfig copy$default(com.truecaller.details_view.routing.PayActionsManagerImpl$PayAppConfig payActionsManagerImpl$PayAppConfig, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = payActionsManagerImpl$PayAppConfig.availableApps;
        }
        return payActionsManagerImpl$PayAppConfig.copy(list);
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.truecaller.details_view.routing.PayActionsManagerImpl$PayApp> component1() {
        return this.availableApps;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.details_view.routing.PayActionsManagerImpl$PayAppConfig copy(@org.jetbrains.annotations.NotNull java.util.List<com.truecaller.details_view.routing.PayActionsManagerImpl$PayApp> availableApps) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(availableApps, "availableApps");
        return new com.truecaller.details_view.routing.PayActionsManagerImpl$PayAppConfig(availableApps);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.truecaller.details_view.routing.PayActionsManagerImpl$PayAppConfig) && kotlin.jvm.internal.Intrinsics.b(this.availableApps, ((com.truecaller.details_view.routing.PayActionsManagerImpl$PayAppConfig) other).availableApps);
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.truecaller.details_view.routing.PayActionsManagerImpl$PayApp> getAvailableApps() {
        return this.availableApps;
    }

    public int hashCode() {
        return this.availableApps.hashCode();
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return com.appsflyer.internal.e.k("PayAppConfig(availableApps=", ")", this.availableApps);
    }
}
