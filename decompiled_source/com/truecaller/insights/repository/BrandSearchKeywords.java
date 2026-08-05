package com.truecaller.insights.repository;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/truecaller/insights/repository/BrandSearchKeywords;", "", "brands", "", "Lcom/truecaller/insights/repository/BrandSearchKeyword;", "<init>", "(Ljava/util/List;)V", "getBrands", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "core_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final /* data */ class BrandSearchKeywords {

    @bw.qux("brands")
    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.truecaller.insights.repository.BrandSearchKeyword> brands;

    public BrandSearchKeywords(@org.jetbrains.annotations.NotNull java.util.List<com.truecaller.insights.repository.BrandSearchKeyword> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "brands");
        this.brands = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.truecaller.insights.repository.BrandSearchKeywords copy$default(com.truecaller.insights.repository.BrandSearchKeywords brandSearchKeywords, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = brandSearchKeywords.brands;
        }
        return brandSearchKeywords.copy(list);
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.truecaller.insights.repository.BrandSearchKeyword> component1() {
        return this.brands;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.insights.repository.BrandSearchKeywords copy(@org.jetbrains.annotations.NotNull java.util.List<com.truecaller.insights.repository.BrandSearchKeyword> brands) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(brands, "brands");
        return new com.truecaller.insights.repository.BrandSearchKeywords(brands);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.truecaller.insights.repository.BrandSearchKeywords) && kotlin.jvm.internal.Intrinsics.b(this.brands, ((com.truecaller.insights.repository.BrandSearchKeywords) other).brands);
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.truecaller.insights.repository.BrandSearchKeyword> getBrands() {
        return this.brands;
    }

    public int hashCode() {
        return this.brands.hashCode();
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return com.appsflyer.internal.e.k("BrandSearchKeywords(brands=", ")", this.brands);
    }
}
