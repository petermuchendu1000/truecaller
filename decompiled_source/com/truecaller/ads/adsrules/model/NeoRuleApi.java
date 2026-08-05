package com.truecaller.ads.adsrules.model;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J-\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001a"}, d2 = {"Lcom/truecaller/ads/adsrules/model/NeoRuleApi;", "", "enable", "", "value", "", "conditions", "", "Lcom/truecaller/ads/adsrules/model/NeoRuleCondition;", "<init>", "(ZLjava/lang/String;Ljava/util/List;)V", "getEnable", "()Z", "getValue", "()Ljava/lang/String;", "getConditions", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "ads-legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class NeoRuleApi {
    public static final int $stable = 8;

    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.truecaller.ads.adsrules.model.NeoRuleCondition> conditions;
    private final boolean enable;

    @bw.qux("delay")
    @org.jetbrains.annotations.NotNull
    private final java.lang.String value;

    public NeoRuleApi(boolean z, @org.jetbrains.annotations.NotNull java.lang.String str, @org.jetbrains.annotations.NotNull java.util.List<com.truecaller.ads.adsrules.model.NeoRuleCondition> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "value");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "conditions");
        this.enable = z;
        this.value = str;
        this.conditions = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.truecaller.ads.adsrules.model.NeoRuleApi copy$default(com.truecaller.ads.adsrules.model.NeoRuleApi neoRuleApi, boolean z, java.lang.String str, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = neoRuleApi.enable;
        }
        if ((i & 2) != 0) {
            str = neoRuleApi.value;
        }
        if ((i & 4) != 0) {
            list = neoRuleApi.conditions;
        }
        return neoRuleApi.copy(z, str, list);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getEnable() {
        return this.enable;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component2, reason: from getter */
    public final java.lang.String getValue() {
        return this.value;
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.truecaller.ads.adsrules.model.NeoRuleCondition> component3() {
        return this.conditions;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.ads.adsrules.model.NeoRuleApi copy(boolean enable, @org.jetbrains.annotations.NotNull java.lang.String value, @org.jetbrains.annotations.NotNull java.util.List<com.truecaller.ads.adsrules.model.NeoRuleCondition> conditions) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(conditions, "conditions");
        return new com.truecaller.ads.adsrules.model.NeoRuleApi(enable, value, conditions);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.ads.adsrules.model.NeoRuleApi)) {
            return false;
        }
        com.truecaller.ads.adsrules.model.NeoRuleApi neoRuleApi = (com.truecaller.ads.adsrules.model.NeoRuleApi) other;
        return this.enable == neoRuleApi.enable && kotlin.jvm.internal.Intrinsics.b(this.value, neoRuleApi.value) && kotlin.jvm.internal.Intrinsics.b(this.conditions, neoRuleApi.conditions);
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.truecaller.ads.adsrules.model.NeoRuleCondition> getConditions() {
        return this.conditions;
    }

    public final boolean getEnable() {
        return this.enable;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getValue() {
        return this.value;
    }

    public int hashCode() {
        int i;
        if (this.enable) {
            i = 1231;
        } else {
            i = 1237;
        }
        return this.conditions.hashCode() + ax1.bar.e(i * 31, 31, this.value);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        boolean z = this.enable;
        java.lang.String str = this.value;
        return y.o.g(bx.e1.u("NeoRuleApi(enable=", ", value=", str, ", conditions=", z), this.conditions, ")");
    }
}
