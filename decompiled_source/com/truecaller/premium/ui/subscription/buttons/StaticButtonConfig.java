package com.truecaller.premium.ui.subscription.buttons;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ,\u0010\r\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\f¨\u0006\u001c"}, d2 = {"Lcom/truecaller/premium/ui/subscription/buttons/StaticButtonConfig;", "", "", "", "launchContexts", "Lxe2/qux;", "buttonConfig", "<init>", "(Ljava/util/List;Lxe2/qux;)V", "component1", "()Ljava/util/List;", "component2", "()Lxe2/qux;", "copy", "(Ljava/util/List;Lxe2/qux;)Lcom/truecaller/premium/ui/subscription/buttons/StaticButtonConfig;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getLaunchContexts", "Lxe2/qux;", "getButtonConfig", "legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final /* data */ class StaticButtonConfig {
    public static final int $stable = 8;

    @bw.qux("button_data")
    @org.jetbrains.annotations.NotNull
    private final xe2.qux buttonConfig;

    @bw.qux("launch_contexts")
    @org.jetbrains.annotations.Nullable
    private final java.util.List<java.lang.String> launchContexts;

    public StaticButtonConfig(@org.jetbrains.annotations.Nullable java.util.List<java.lang.String> list, @org.jetbrains.annotations.NotNull xe2.qux quxVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(quxVar, "buttonConfig");
        this.launchContexts = list;
        this.buttonConfig = quxVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.truecaller.premium.ui.subscription.buttons.StaticButtonConfig copy$default(com.truecaller.premium.ui.subscription.buttons.StaticButtonConfig staticButtonConfig, java.util.List list, xe2.qux quxVar, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = staticButtonConfig.launchContexts;
        }
        if ((i & 2) != 0) {
            quxVar = staticButtonConfig.buttonConfig;
        }
        return staticButtonConfig.copy(list, quxVar);
    }

    @org.jetbrains.annotations.Nullable
    public final java.util.List<java.lang.String> component1() {
        return this.launchContexts;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component2, reason: from getter */
    public final xe2.qux getButtonConfig() {
        return this.buttonConfig;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.premium.ui.subscription.buttons.StaticButtonConfig copy(@org.jetbrains.annotations.Nullable java.util.List<java.lang.String> launchContexts, @org.jetbrains.annotations.NotNull xe2.qux buttonConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buttonConfig, "buttonConfig");
        return new com.truecaller.premium.ui.subscription.buttons.StaticButtonConfig(launchContexts, buttonConfig);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.premium.ui.subscription.buttons.StaticButtonConfig)) {
            return false;
        }
        com.truecaller.premium.ui.subscription.buttons.StaticButtonConfig staticButtonConfig = (com.truecaller.premium.ui.subscription.buttons.StaticButtonConfig) other;
        return kotlin.jvm.internal.Intrinsics.b(this.launchContexts, staticButtonConfig.launchContexts) && kotlin.jvm.internal.Intrinsics.b(this.buttonConfig, staticButtonConfig.buttonConfig);
    }

    @org.jetbrains.annotations.NotNull
    public final xe2.qux getButtonConfig() {
        return this.buttonConfig;
    }

    @org.jetbrains.annotations.Nullable
    public final java.util.List<java.lang.String> getLaunchContexts() {
        return this.launchContexts;
    }

    public int hashCode() {
        java.util.List<java.lang.String> list = this.launchContexts;
        return this.buttonConfig.hashCode() + ((list == null ? 0 : list.hashCode()) * 31);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return "StaticButtonConfig(launchContexts=" + this.launchContexts + ", buttonConfig=" + this.buttonConfig + ")";
    }
}
