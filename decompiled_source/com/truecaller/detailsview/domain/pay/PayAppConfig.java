package com.truecaller.detailsview.domain.pay;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0012B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/truecaller/detailsview/domain/pay/PayAppConfig;", "", "availableApps", "", "Lcom/truecaller/detailsview/domain/pay/PayAppConfig$DefaultPayApp;", "<init>", "(Ljava/util/List;)V", "getAvailableApps", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "DefaultPayApp", "domain_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final /* data */ class PayAppConfig {

    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.truecaller.detailsview.domain.pay.PayAppConfig.DefaultPayApp> availableApps;

    @androidx.annotation.Keep
    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u000f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u000bJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u000b¨\u0006\u0019"}, d2 = {"Lcom/truecaller/detailsview/domain/pay/PayAppConfig$DefaultPayApp;", "Llc1/bar;", "", "packageName", "", "order", "<init>", "(Ljava/lang/String;I)V", "component1", "()Ljava/lang/String;", "component2", "()I", "copy", "(Ljava/lang/String;I)Lcom/truecaller/detailsview/domain/pay/PayAppConfig$DefaultPayApp;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPackageName", "I", "getOrder", "domain_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes6.dex */
    public static final /* data */ class DefaultPayApp implements lc1.bar {
        private final int order;

        @org.jetbrains.annotations.NotNull
        private final java.lang.String packageName;

        public DefaultPayApp(@org.jetbrains.annotations.NotNull java.lang.String str, int i) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "packageName");
            this.packageName = str;
            this.order = i;
        }

        public static /* synthetic */ com.truecaller.detailsview.domain.pay.PayAppConfig.DefaultPayApp copy$default(com.truecaller.detailsview.domain.pay.PayAppConfig.DefaultPayApp defaultPayApp, java.lang.String str, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                str = defaultPayApp.packageName;
            }
            if ((i2 & 2) != 0) {
                i = defaultPayApp.order;
            }
            return defaultPayApp.copy(str, i);
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
        public final com.truecaller.detailsview.domain.pay.PayAppConfig.DefaultPayApp copy(@org.jetbrains.annotations.NotNull java.lang.String packageName, int order) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(packageName, "packageName");
            return new com.truecaller.detailsview.domain.pay.PayAppConfig.DefaultPayApp(packageName, order);
        }

        public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.truecaller.detailsview.domain.pay.PayAppConfig.DefaultPayApp)) {
                return false;
            }
            com.truecaller.detailsview.domain.pay.PayAppConfig.DefaultPayApp defaultPayApp = (com.truecaller.detailsview.domain.pay.PayAppConfig.DefaultPayApp) other;
            return kotlin.jvm.internal.Intrinsics.b(this.packageName, defaultPayApp.packageName) && this.order == defaultPayApp.order;
        }

        public int getOrder() {
            return this.order;
        }

        @Override // lc1.bar
        @org.jetbrains.annotations.NotNull
        public java.lang.String getPackageName() {
            return this.packageName;
        }

        public int hashCode() {
            return (this.packageName.hashCode() * 31) + this.order;
        }

        @org.jetbrains.annotations.NotNull
        public java.lang.String toString() {
            return com.appsflyer.internal.e.i("DefaultPayApp(packageName=", this.order, this.packageName, ", order=", ")");
        }
    }

    public PayAppConfig(@org.jetbrains.annotations.NotNull java.util.List<com.truecaller.detailsview.domain.pay.PayAppConfig.DefaultPayApp> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "availableApps");
        this.availableApps = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.truecaller.detailsview.domain.pay.PayAppConfig copy$default(com.truecaller.detailsview.domain.pay.PayAppConfig payAppConfig, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = payAppConfig.availableApps;
        }
        return payAppConfig.copy(list);
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.truecaller.detailsview.domain.pay.PayAppConfig.DefaultPayApp> component1() {
        return this.availableApps;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.detailsview.domain.pay.PayAppConfig copy(@org.jetbrains.annotations.NotNull java.util.List<com.truecaller.detailsview.domain.pay.PayAppConfig.DefaultPayApp> availableApps) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(availableApps, "availableApps");
        return new com.truecaller.detailsview.domain.pay.PayAppConfig(availableApps);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.truecaller.detailsview.domain.pay.PayAppConfig) && kotlin.jvm.internal.Intrinsics.b(this.availableApps, ((com.truecaller.detailsview.domain.pay.PayAppConfig) other).availableApps);
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.truecaller.detailsview.domain.pay.PayAppConfig.DefaultPayApp> getAvailableApps() {
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
