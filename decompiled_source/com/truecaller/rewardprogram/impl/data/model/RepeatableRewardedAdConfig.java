package com.truecaller.rewardprogram.impl.data.model;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\b\u0081\b\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001eB%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ4\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0013\u0010\fJ\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001c\u0010\f¨\u0006\u001f"}, d2 = {"Lcom/truecaller/rewardprogram/impl/data/model/RepeatableRewardedAdConfig;", "", "", "", "rewardedAdXp", "completionXp", "cooldownPeriodMinutes", "<init>", "(Ljava/util/List;II)V", "component1", "()Ljava/util/List;", "component2", "()I", "component3", "copy", "(Ljava/util/List;II)Lcom/truecaller/rewardprogram/impl/data/model/RepeatableRewardedAdConfig;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getRewardedAdXp", "I", "getCompletionXp", "getCooldownPeriodMinutes", "Companion", "rk2/f", "impl_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final /* data */ class RepeatableRewardedAdConfig {
    public static final int $stable = 8;

    @org.jetbrains.annotations.NotNull
    public static final rk2.f Companion = new java.lang.Object();

    @org.jetbrains.annotations.NotNull
    private static final com.truecaller.rewardprogram.impl.data.model.RepeatableRewardedAdConfig Default = new com.truecaller.rewardprogram.impl.data.model.RepeatableRewardedAdConfig(kotlin.collections.y.j(new java.lang.Integer[]{20, 20, 20}), 50, 1440);
    private final int completionXp;
    private final int cooldownPeriodMinutes;

    @org.jetbrains.annotations.NotNull
    private final java.util.List<java.lang.Integer> rewardedAdXp;

    public RepeatableRewardedAdConfig(@org.jetbrains.annotations.NotNull java.util.List<java.lang.Integer> list, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "rewardedAdXp");
        this.rewardedAdXp = list;
        this.completionXp = i;
        this.cooldownPeriodMinutes = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.truecaller.rewardprogram.impl.data.model.RepeatableRewardedAdConfig copy$default(com.truecaller.rewardprogram.impl.data.model.RepeatableRewardedAdConfig repeatableRewardedAdConfig, java.util.List list, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            list = repeatableRewardedAdConfig.rewardedAdXp;
        }
        if ((i3 & 2) != 0) {
            i = repeatableRewardedAdConfig.completionXp;
        }
        if ((i3 & 4) != 0) {
            i2 = repeatableRewardedAdConfig.cooldownPeriodMinutes;
        }
        return repeatableRewardedAdConfig.copy(list, i, i2);
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.Integer> component1() {
        return this.rewardedAdXp;
    }

    /* renamed from: component2, reason: from getter */
    public final int getCompletionXp() {
        return this.completionXp;
    }

    /* renamed from: component3, reason: from getter */
    public final int getCooldownPeriodMinutes() {
        return this.cooldownPeriodMinutes;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.rewardprogram.impl.data.model.RepeatableRewardedAdConfig copy(@org.jetbrains.annotations.NotNull java.util.List<java.lang.Integer> rewardedAdXp, int completionXp, int cooldownPeriodMinutes) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rewardedAdXp, "rewardedAdXp");
        return new com.truecaller.rewardprogram.impl.data.model.RepeatableRewardedAdConfig(rewardedAdXp, completionXp, cooldownPeriodMinutes);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.rewardprogram.impl.data.model.RepeatableRewardedAdConfig)) {
            return false;
        }
        com.truecaller.rewardprogram.impl.data.model.RepeatableRewardedAdConfig repeatableRewardedAdConfig = (com.truecaller.rewardprogram.impl.data.model.RepeatableRewardedAdConfig) other;
        return kotlin.jvm.internal.Intrinsics.b(this.rewardedAdXp, repeatableRewardedAdConfig.rewardedAdXp) && this.completionXp == repeatableRewardedAdConfig.completionXp && this.cooldownPeriodMinutes == repeatableRewardedAdConfig.cooldownPeriodMinutes;
    }

    public final int getCompletionXp() {
        return this.completionXp;
    }

    public final int getCooldownPeriodMinutes() {
        return this.cooldownPeriodMinutes;
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.Integer> getRewardedAdXp() {
        return this.rewardedAdXp;
    }

    public int hashCode() {
        return (((this.rewardedAdXp.hashCode() * 31) + this.completionXp) * 31) + this.cooldownPeriodMinutes;
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        java.util.List<java.lang.Integer> list = this.rewardedAdXp;
        int i = this.completionXp;
        int i2 = this.cooldownPeriodMinutes;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("RepeatableRewardedAdConfig(rewardedAdXp=");
        sb.append(list);
        sb.append(", completionXp=");
        sb.append(i);
        sb.append(", cooldownPeriodMinutes=");
        return bar.m(i2, ")", sb);
    }
}
