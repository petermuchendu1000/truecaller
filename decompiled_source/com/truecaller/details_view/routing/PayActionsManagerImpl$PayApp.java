package com.truecaller.details_view.routing;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u000bJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u000b¨\u0006\u0019"}, d2 = {"com/truecaller/details_view/routing/PayActionsManagerImpl$PayApp", "", "", "packageName", "", "order", "<init>", "(Ljava/lang/String;I)V", "component1", "()Ljava/lang/String;", "component2", "()I", "Lcom/truecaller/details_view/routing/PayActionsManagerImpl$PayApp;", "copy", "(Ljava/lang/String;I)Lcom/truecaller/details_view/routing/PayActionsManagerImpl$PayApp;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPackageName", "I", "getOrder", "details-view_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final /* data */ class PayActionsManagerImpl$PayApp {
    public static final int $stable = 0;
    private final int order;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String packageName;

    public PayActionsManagerImpl$PayApp(@org.jetbrains.annotations.NotNull java.lang.String str, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "packageName");
        this.packageName = str;
        this.order = i;
    }

    public static /* synthetic */ com.truecaller.details_view.routing.PayActionsManagerImpl$PayApp copy$default(com.truecaller.details_view.routing.PayActionsManagerImpl$PayApp payActionsManagerImpl$PayApp, java.lang.String str, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            str = payActionsManagerImpl$PayApp.packageName;
        }
        if ((i2 & 2) != 0) {
            i = payActionsManagerImpl$PayApp.order;
        }
        return payActionsManagerImpl$PayApp.copy(str, i);
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component1, reason: from getter */
    public final java.lang.String getPackageName() {
        return this.packageName;
    }

    /* renamed from: component2, reason: from getter */
    public final int getOrder() {
        return this.order;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.details_view.routing.PayActionsManagerImpl$PayApp copy(@org.jetbrains.annotations.NotNull java.lang.String packageName, int order) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(packageName, "packageName");
        return new com.truecaller.details_view.routing.PayActionsManagerImpl$PayApp(packageName, order);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.details_view.routing.PayActionsManagerImpl$PayApp)) {
            return false;
        }
        com.truecaller.details_view.routing.PayActionsManagerImpl$PayApp payActionsManagerImpl$PayApp = (com.truecaller.details_view.routing.PayActionsManagerImpl$PayApp) other;
        return kotlin.jvm.internal.Intrinsics.b(this.packageName, payActionsManagerImpl$PayApp.packageName) && this.order == payActionsManagerImpl$PayApp.order;
    }

    public final int getOrder() {
        return this.order;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getPackageName() {
        return this.packageName;
    }

    public int hashCode() {
        return (this.packageName.hashCode() * 31) + this.order;
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return com.appsflyer.internal.e.i("PayApp(packageName=", this.order, this.packageName, ", order=", ")");
    }
}
