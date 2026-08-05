package com.truecaller.premium.provider;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/truecaller/premium/provider/WebPaymentDetails;", "", "paymentProvider", "", "pricingVariant", "shopDetails", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getPaymentProvider", "()Ljava/lang/String;", "getPricingVariant", "getShopDetails", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final /* data */ class WebPaymentDetails {
    public static final int $stable = 0;

    @bw.qux("paymentProvider")
    @org.jetbrains.annotations.Nullable
    private final java.lang.String paymentProvider;

    @bw.qux("pricingVariant")
    @org.jetbrains.annotations.Nullable
    private final java.lang.String pricingVariant;

    @bw.qux("shopDetails")
    @org.jetbrains.annotations.Nullable
    private final java.lang.String shopDetails;

    public WebPaymentDetails(@org.jetbrains.annotations.Nullable java.lang.String str, @org.jetbrains.annotations.Nullable java.lang.String str2, @org.jetbrains.annotations.Nullable java.lang.String str3) {
        this.paymentProvider = str;
        this.pricingVariant = str2;
        this.shopDetails = str3;
    }

    public static /* synthetic */ com.truecaller.premium.provider.WebPaymentDetails copy$default(com.truecaller.premium.provider.WebPaymentDetails webPaymentDetails, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = webPaymentDetails.paymentProvider;
        }
        if ((i & 2) != 0) {
            str2 = webPaymentDetails.pricingVariant;
        }
        if ((i & 4) != 0) {
            str3 = webPaymentDetails.shopDetails;
        }
        return webPaymentDetails.copy(str, str2, str3);
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component1, reason: from getter */
    public final java.lang.String getPaymentProvider() {
        return this.paymentProvider;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component2, reason: from getter */
    public final java.lang.String getPricingVariant() {
        return this.pricingVariant;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component3, reason: from getter */
    public final java.lang.String getShopDetails() {
        return this.shopDetails;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.premium.provider.WebPaymentDetails copy(@org.jetbrains.annotations.Nullable java.lang.String paymentProvider, @org.jetbrains.annotations.Nullable java.lang.String pricingVariant, @org.jetbrains.annotations.Nullable java.lang.String shopDetails) {
        return new com.truecaller.premium.provider.WebPaymentDetails(paymentProvider, pricingVariant, shopDetails);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.premium.provider.WebPaymentDetails)) {
            return false;
        }
        com.truecaller.premium.provider.WebPaymentDetails webPaymentDetails = (com.truecaller.premium.provider.WebPaymentDetails) other;
        return kotlin.jvm.internal.Intrinsics.b(this.paymentProvider, webPaymentDetails.paymentProvider) && kotlin.jvm.internal.Intrinsics.b(this.pricingVariant, webPaymentDetails.pricingVariant) && kotlin.jvm.internal.Intrinsics.b(this.shopDetails, webPaymentDetails.shopDetails);
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getPaymentProvider() {
        return this.paymentProvider;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getPricingVariant() {
        return this.pricingVariant;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getShopDetails() {
        return this.shopDetails;
    }

    public int hashCode() {
        java.lang.String str = this.paymentProvider;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.lang.String str2 = this.pricingVariant;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.shopDetails;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return bar.v(this.shopDetails, ")", ro0.f.E("WebPaymentDetails(paymentProvider=", this.paymentProvider, ", pricingVariant=", this.pricingVariant, ", shopDetails="));
    }
}
