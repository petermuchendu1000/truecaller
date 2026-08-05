package com.truecaller.premium.insurance.data;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006HÆ\u0003J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0012J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0012JP\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u001e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0014\u0010\u0012¨\u0006\""}, d2 = {"Lcom/truecaller/premium/insurance/data/InsurancePartnerDetails;", "Ljava/io/Serializable;", "partner", "", "coverage", "productKind", "", "replaceInsuranceLabel", "", "showInsuranceDetails", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getPartner", "()Ljava/lang/String;", "getCoverage", "getProductKind", "()Ljava/util/List;", "getReplaceInsuranceLabel", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getShowInsuranceDetails", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/truecaller/premium/insurance/data/InsurancePartnerDetails;", "equals", "other", "", "hashCode", "", "toString", "legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final /* data */ class InsurancePartnerDetails implements java.io.Serializable {
    public static final int $stable = 8;

    @bw.qux("coverage")
    @org.jetbrains.annotations.Nullable
    private final java.lang.String coverage;

    @bw.qux("partner")
    @org.jetbrains.annotations.Nullable
    private final java.lang.String partner;

    @bw.qux("productKind")
    @org.jetbrains.annotations.Nullable
    private final java.util.List<java.lang.String> productKind;

    @bw.qux("replaceInsuranceLabel")
    @org.jetbrains.annotations.Nullable
    private final java.lang.Boolean replaceInsuranceLabel;

    @bw.qux("showInsuranceDetails")
    @org.jetbrains.annotations.Nullable
    private final java.lang.Boolean showInsuranceDetails;

    public InsurancePartnerDetails() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ com.truecaller.premium.insurance.data.InsurancePartnerDetails copy$default(com.truecaller.premium.insurance.data.InsurancePartnerDetails insurancePartnerDetails, java.lang.String str, java.lang.String str2, java.util.List list, java.lang.Boolean bool, java.lang.Boolean bool2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = insurancePartnerDetails.partner;
        }
        if ((i & 2) != 0) {
            str2 = insurancePartnerDetails.coverage;
        }
        if ((i & 4) != 0) {
            list = insurancePartnerDetails.productKind;
        }
        if ((i & 8) != 0) {
            bool = insurancePartnerDetails.replaceInsuranceLabel;
        }
        if ((i & 16) != 0) {
            bool2 = insurancePartnerDetails.showInsuranceDetails;
        }
        java.lang.Boolean bool3 = bool2;
        java.util.List list2 = list;
        return insurancePartnerDetails.copy(str, str2, list2, bool, bool3);
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component1, reason: from getter */
    public final java.lang.String getPartner() {
        return this.partner;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component2, reason: from getter */
    public final java.lang.String getCoverage() {
        return this.coverage;
    }

    @org.jetbrains.annotations.Nullable
    public final java.util.List<java.lang.String> component3() {
        return this.productKind;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component4, reason: from getter */
    public final java.lang.Boolean getReplaceInsuranceLabel() {
        return this.replaceInsuranceLabel;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component5, reason: from getter */
    public final java.lang.Boolean getShowInsuranceDetails() {
        return this.showInsuranceDetails;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.premium.insurance.data.InsurancePartnerDetails copy(@org.jetbrains.annotations.Nullable java.lang.String partner, @org.jetbrains.annotations.Nullable java.lang.String coverage, @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> productKind, @org.jetbrains.annotations.Nullable java.lang.Boolean replaceInsuranceLabel, @org.jetbrains.annotations.Nullable java.lang.Boolean showInsuranceDetails) {
        return new com.truecaller.premium.insurance.data.InsurancePartnerDetails(partner, coverage, productKind, replaceInsuranceLabel, showInsuranceDetails);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.premium.insurance.data.InsurancePartnerDetails)) {
            return false;
        }
        com.truecaller.premium.insurance.data.InsurancePartnerDetails insurancePartnerDetails = (com.truecaller.premium.insurance.data.InsurancePartnerDetails) other;
        return kotlin.jvm.internal.Intrinsics.b(this.partner, insurancePartnerDetails.partner) && kotlin.jvm.internal.Intrinsics.b(this.coverage, insurancePartnerDetails.coverage) && kotlin.jvm.internal.Intrinsics.b(this.productKind, insurancePartnerDetails.productKind) && kotlin.jvm.internal.Intrinsics.b(this.replaceInsuranceLabel, insurancePartnerDetails.replaceInsuranceLabel) && kotlin.jvm.internal.Intrinsics.b(this.showInsuranceDetails, insurancePartnerDetails.showInsuranceDetails);
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getCoverage() {
        return this.coverage;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getPartner() {
        return this.partner;
    }

    @org.jetbrains.annotations.Nullable
    public final java.util.List<java.lang.String> getProductKind() {
        return this.productKind;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean getReplaceInsuranceLabel() {
        return this.replaceInsuranceLabel;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean getShowInsuranceDetails() {
        return this.showInsuranceDetails;
    }

    public int hashCode() {
        java.lang.String str = this.partner;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.lang.String str2 = this.coverage;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.util.List<java.lang.String> list = this.productKind;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        java.lang.Boolean bool = this.replaceInsuranceLabel;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        java.lang.Boolean bool2 = this.showInsuranceDetails;
        return hashCode4 + (bool2 != null ? bool2.hashCode() : 0);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        java.lang.String str = this.partner;
        java.lang.String str2 = this.coverage;
        java.util.List<java.lang.String> list = this.productKind;
        java.lang.Boolean bool = this.replaceInsuranceLabel;
        java.lang.Boolean bool2 = this.showInsuranceDetails;
        java.lang.StringBuilder E = ro0.f.E("InsurancePartnerDetails(partner=", str, ", coverage=", str2, ", productKind=");
        E.append(list);
        E.append(", replaceInsuranceLabel=");
        E.append(bool);
        E.append(", showInsuranceDetails=");
        E.append(bool2);
        E.append(")");
        return E.toString();
    }

    public InsurancePartnerDetails(@org.jetbrains.annotations.Nullable java.lang.String str, @org.jetbrains.annotations.Nullable java.lang.String str2, @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> list, @org.jetbrains.annotations.Nullable java.lang.Boolean bool, @org.jetbrains.annotations.Nullable java.lang.Boolean bool2) {
        this.partner = str;
        this.coverage = str2;
        this.productKind = list;
        this.replaceInsuranceLabel = bool;
        this.showInsuranceDetails = bool2;
    }

    public /* synthetic */ InsurancePartnerDetails(java.lang.String str, java.lang.String str2, java.util.List list, java.lang.Boolean bool, java.lang.Boolean bool2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : bool, (i & 16) != 0 ? null : bool2);
    }
}
