package com.truecaller.insights.repository;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007HÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, d2 = {"Lcom/truecaller/insights/repository/BrandSearchKeyword;", "", "version", "", "brandId", "", "keywordList", "", "<init>", "(ILjava/lang/String;Ljava/util/List;)V", "getVersion", "()I", "getBrandId", "()Ljava/lang/String;", "getKeywordList", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "core_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final /* data */ class BrandSearchKeyword {

    @bw.qux("brand_id")
    @org.jetbrains.annotations.NotNull
    private final java.lang.String brandId;

    @bw.qux("keyword_list")
    @org.jetbrains.annotations.NotNull
    private final java.util.List<java.lang.String> keywordList;

    @bw.qux("version")
    private final int version;

    public BrandSearchKeyword(int i, @org.jetbrains.annotations.NotNull java.lang.String str, @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "brandId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "keywordList");
        this.version = i;
        this.brandId = str;
        this.keywordList = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.truecaller.insights.repository.BrandSearchKeyword copy$default(com.truecaller.insights.repository.BrandSearchKeyword brandSearchKeyword, int i, java.lang.String str, java.util.List list, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = brandSearchKeyword.version;
        }
        if ((i2 & 2) != 0) {
            str = brandSearchKeyword.brandId;
        }
        if ((i2 & 4) != 0) {
            list = brandSearchKeyword.keywordList;
        }
        return brandSearchKeyword.copy(i, str, list);
    }

    /* renamed from: component1, reason: from getter */
    public final int getVersion() {
        return this.version;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component2, reason: from getter */
    public final java.lang.String getBrandId() {
        return this.brandId;
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.String> component3() {
        return this.keywordList;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.insights.repository.BrandSearchKeyword copy(int version, @org.jetbrains.annotations.NotNull java.lang.String brandId, @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> keywordList) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(brandId, "brandId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(keywordList, "keywordList");
        return new com.truecaller.insights.repository.BrandSearchKeyword(version, brandId, keywordList);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.insights.repository.BrandSearchKeyword)) {
            return false;
        }
        com.truecaller.insights.repository.BrandSearchKeyword brandSearchKeyword = (com.truecaller.insights.repository.BrandSearchKeyword) other;
        return this.version == brandSearchKeyword.version && kotlin.jvm.internal.Intrinsics.b(this.brandId, brandSearchKeyword.brandId) && kotlin.jvm.internal.Intrinsics.b(this.keywordList, brandSearchKeyword.keywordList);
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getBrandId() {
        return this.brandId;
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.String> getKeywordList() {
        return this.keywordList;
    }

    public final int getVersion() {
        return this.version;
    }

    public int hashCode() {
        return this.keywordList.hashCode() + ax1.bar.e(this.version * 31, 31, this.brandId);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        int i = this.version;
        java.lang.String str = this.brandId;
        return y.o.g(qb.qux.r("BrandSearchKeyword(version=", i, ", brandId=", str, ", keywordList="), this.keywordList, ")");
    }
}
