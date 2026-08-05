package com.truecaller.premium.billing;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/truecaller/premium/billing/AbandonedSubscriptionData;", "Ljava/io/Serializable;", "tierType", "Lcom/truecaller/premium/data/tier/PremiumTierType;", "productKind", "Lcom/truecaller/premium/data/ProductKind;", "<init>", "(Lcom/truecaller/premium/data/tier/PremiumTierType;Lcom/truecaller/premium/data/ProductKind;)V", "getTierType", "()Lcom/truecaller/premium/data/tier/PremiumTierType;", "getProductKind", "()Lcom/truecaller/premium/data/ProductKind;", "component1", "component2", "copy", "equals", "", com.ironsource.Y1.d, "", "hashCode", "", "toString", "", "legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes4.dex */
public final /* data */ class AbandonedSubscriptionData implements java.io.Serializable {
    public static final int $stable = 0;

    @org.jetbrains.annotations.NotNull
    private final com.truecaller.premium.data.ProductKind productKind;

    @org.jetbrains.annotations.Nullable
    private final com.truecaller.premium.data.tier.PremiumTierType tierType;

    public AbandonedSubscriptionData(@org.jetbrains.annotations.Nullable com.truecaller.premium.data.tier.PremiumTierType premiumTierType, @org.jetbrains.annotations.NotNull com.truecaller.premium.data.ProductKind productKind) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(productKind, "productKind");
        this.tierType = premiumTierType;
        this.productKind = productKind;
    }

    public static /* synthetic */ com.truecaller.premium.billing.AbandonedSubscriptionData copy$default(com.truecaller.premium.billing.AbandonedSubscriptionData abandonedSubscriptionData, com.truecaller.premium.data.tier.PremiumTierType premiumTierType, com.truecaller.premium.data.ProductKind productKind, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            premiumTierType = abandonedSubscriptionData.tierType;
        }
        if ((i & 2) != 0) {
            productKind = abandonedSubscriptionData.productKind;
        }
        return abandonedSubscriptionData.copy(premiumTierType, productKind);
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component1, reason: from getter */
    public final com.truecaller.premium.data.tier.PremiumTierType getTierType() {
        return this.tierType;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component2, reason: from getter */
    public final com.truecaller.premium.data.ProductKind getProductKind() {
        return this.productKind;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.premium.billing.AbandonedSubscriptionData copy(@org.jetbrains.annotations.Nullable com.truecaller.premium.data.tier.PremiumTierType tierType, @org.jetbrains.annotations.NotNull com.truecaller.premium.data.ProductKind productKind) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(productKind, "productKind");
        return new com.truecaller.premium.billing.AbandonedSubscriptionData(tierType, productKind);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.premium.billing.AbandonedSubscriptionData)) {
            return false;
        }
        com.truecaller.premium.billing.AbandonedSubscriptionData abandonedSubscriptionData = (com.truecaller.premium.billing.AbandonedSubscriptionData) other;
        return this.tierType == abandonedSubscriptionData.tierType && this.productKind == abandonedSubscriptionData.productKind;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.premium.data.ProductKind getProductKind() {
        return this.productKind;
    }

    @org.jetbrains.annotations.Nullable
    public final com.truecaller.premium.data.tier.PremiumTierType getTierType() {
        return this.tierType;
    }

    public int hashCode() {
        com.truecaller.premium.data.tier.PremiumTierType premiumTierType = this.tierType;
        return this.productKind.hashCode() + ((premiumTierType == null ? 0 : premiumTierType.hashCode()) * 31);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return "AbandonedSubscriptionData(tierType=" + this.tierType + ", productKind=" + this.productKind + ")";
    }
}
