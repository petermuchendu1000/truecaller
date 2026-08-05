package com.truecaller.ads.adsrules.model;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/truecaller/ads/adsrules/model/NeoRuleCondition;", "", "value", "", "property", "", "Lcom/truecaller/ads/adsrules/model/NeoRuleProperty;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getValue", "()Ljava/lang/String;", "getProperty", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "ads-legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class NeoRuleCondition {
    public static final int $stable = 8;

    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.truecaller.ads.adsrules.model.NeoRuleProperty> property;

    @bw.qux("delay")
    @org.jetbrains.annotations.NotNull
    private final java.lang.String value;

    public NeoRuleCondition(@org.jetbrains.annotations.NotNull java.lang.String str, @org.jetbrains.annotations.NotNull java.util.List<com.truecaller.ads.adsrules.model.NeoRuleProperty> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "value");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "property");
        this.value = str;
        this.property = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.truecaller.ads.adsrules.model.NeoRuleCondition copy$default(com.truecaller.ads.adsrules.model.NeoRuleCondition neoRuleCondition, java.lang.String str, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = neoRuleCondition.value;
        }
        if ((i & 2) != 0) {
            list = neoRuleCondition.property;
        }
        return neoRuleCondition.copy(str, list);
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component1, reason: from getter */
    public final java.lang.String getValue() {
        return this.value;
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.truecaller.ads.adsrules.model.NeoRuleProperty> component2() {
        return this.property;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.ads.adsrules.model.NeoRuleCondition copy(@org.jetbrains.annotations.NotNull java.lang.String value, @org.jetbrains.annotations.NotNull java.util.List<com.truecaller.ads.adsrules.model.NeoRuleProperty> property) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(property, "property");
        return new com.truecaller.ads.adsrules.model.NeoRuleCondition(value, property);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.ads.adsrules.model.NeoRuleCondition)) {
            return false;
        }
        com.truecaller.ads.adsrules.model.NeoRuleCondition neoRuleCondition = (com.truecaller.ads.adsrules.model.NeoRuleCondition) other;
        return kotlin.jvm.internal.Intrinsics.b(this.value, neoRuleCondition.value) && kotlin.jvm.internal.Intrinsics.b(this.property, neoRuleCondition.property);
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.truecaller.ads.adsrules.model.NeoRuleProperty> getProperty() {
        return this.property;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.property.hashCode() + (this.value.hashCode() * 31);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return ro0.f.C("NeoRuleCondition(value=", this.value, ", property=", this.property, ")");
    }
}
