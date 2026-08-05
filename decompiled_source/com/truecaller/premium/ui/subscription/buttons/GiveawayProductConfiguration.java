package com.truecaller.premium.ui.subscription.buttons;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, d2 = {"Lcom/truecaller/premium/ui/subscription/buttons/GiveawayProductConfiguration;", "", "sku", "", "tierKind", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getSku", "()Ljava/lang/String;", "getTierKind", "premiumTierType", "Lcom/truecaller/premium/data/tier/PremiumTierType;", "getPremiumTierType", "()Lcom/truecaller/premium/data/tier/PremiumTierType;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final /* data */ class GiveawayProductConfiguration {
    public static final int $stable = 0;

    @bw.qux("sku")
    @org.jetbrains.annotations.Nullable
    private final java.lang.String sku;

    @bw.qux("tier_kind")
    @org.jetbrains.annotations.Nullable
    private final java.lang.String tierKind;

    public GiveawayProductConfiguration(@org.jetbrains.annotations.Nullable java.lang.String str, @org.jetbrains.annotations.Nullable java.lang.String str2) {
        this.sku = str;
        this.tierKind = str2;
    }

    public static /* synthetic */ com.truecaller.premium.ui.subscription.buttons.GiveawayProductConfiguration copy$default(com.truecaller.premium.ui.subscription.buttons.GiveawayProductConfiguration giveawayProductConfiguration, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = giveawayProductConfiguration.sku;
        }
        if ((i & 2) != 0) {
            str2 = giveawayProductConfiguration.tierKind;
        }
        return giveawayProductConfiguration.copy(str, str2);
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component1, reason: from getter */
    public final java.lang.String getSku() {
        return this.sku;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component2, reason: from getter */
    public final java.lang.String getTierKind() {
        return this.tierKind;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.premium.ui.subscription.buttons.GiveawayProductConfiguration copy(@org.jetbrains.annotations.Nullable java.lang.String sku, @org.jetbrains.annotations.Nullable java.lang.String tierKind) {
        return new com.truecaller.premium.ui.subscription.buttons.GiveawayProductConfiguration(sku, tierKind);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.premium.ui.subscription.buttons.GiveawayProductConfiguration)) {
            return false;
        }
        com.truecaller.premium.ui.subscription.buttons.GiveawayProductConfiguration giveawayProductConfiguration = (com.truecaller.premium.ui.subscription.buttons.GiveawayProductConfiguration) other;
        return kotlin.jvm.internal.Intrinsics.b(this.sku, giveawayProductConfiguration.sku) && kotlin.jvm.internal.Intrinsics.b(this.tierKind, giveawayProductConfiguration.tierKind);
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.premium.data.tier.PremiumTierType getPremiumTierType() {
        k92.m mVar = com.truecaller.premium.data.tier.PremiumTierType.Companion;
        java.lang.String str = this.tierKind;
        mVar.getClass();
        return k92.m.a(str);
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getSku() {
        return this.sku;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getTierKind() {
        return this.tierKind;
    }

    public int hashCode() {
        java.lang.String str = this.sku;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.lang.String str2 = this.tierKind;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return y.o.e("GiveawayProductConfiguration(sku=", this.sku, ", tierKind=", this.tierKind, ")");
    }
}
