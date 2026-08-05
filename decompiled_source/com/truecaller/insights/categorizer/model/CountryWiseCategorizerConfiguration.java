package com.truecaller.insights.categorizer.model;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0018\b\u0002\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005HÆ\u0003J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\rJ4\u0010\u0013\u001a\u00020\u00002\u0018\b\u0002\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0004HÖ\u0001R&\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/truecaller/insights/categorizer/model/CountryWiseCategorizerConfiguration;", "", "countries", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "minWordsIdentified", "", "<init>", "(Ljava/util/ArrayList;Ljava/lang/Integer;)V", "getCountries", "()Ljava/util/ArrayList;", "getMinWordsIdentified", "()Ljava/lang/Integer;", "setMinWordsIdentified", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "component1", "component2", "copy", "(Ljava/util/ArrayList;Ljava/lang/Integer;)Lcom/truecaller/insights/categorizer/model/CountryWiseCategorizerConfiguration;", "equals", "", "other", "hashCode", "toString", "core_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final /* data */ class CountryWiseCategorizerConfiguration {

    @bw.qux("countries")
    @org.jetbrains.annotations.NotNull
    private final java.util.ArrayList<java.lang.String> countries;

    @bw.qux("minWordsIdentified")
    @org.jetbrains.annotations.Nullable
    private java.lang.Integer minWordsIdentified;

    /* JADX WARN: Multi-variable type inference failed */
    public CountryWiseCategorizerConfiguration() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.truecaller.insights.categorizer.model.CountryWiseCategorizerConfiguration copy$default(com.truecaller.insights.categorizer.model.CountryWiseCategorizerConfiguration countryWiseCategorizerConfiguration, java.util.ArrayList arrayList, java.lang.Integer num, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            arrayList = countryWiseCategorizerConfiguration.countries;
        }
        if ((i & 2) != 0) {
            num = countryWiseCategorizerConfiguration.minWordsIdentified;
        }
        return countryWiseCategorizerConfiguration.copy(arrayList, num);
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.ArrayList<java.lang.String> component1() {
        return this.countries;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component2, reason: from getter */
    public final java.lang.Integer getMinWordsIdentified() {
        return this.minWordsIdentified;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.insights.categorizer.model.CountryWiseCategorizerConfiguration copy(@org.jetbrains.annotations.NotNull java.util.ArrayList<java.lang.String> countries, @org.jetbrains.annotations.Nullable java.lang.Integer minWordsIdentified) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(countries, "countries");
        return new com.truecaller.insights.categorizer.model.CountryWiseCategorizerConfiguration(countries, minWordsIdentified);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.insights.categorizer.model.CountryWiseCategorizerConfiguration)) {
            return false;
        }
        com.truecaller.insights.categorizer.model.CountryWiseCategorizerConfiguration countryWiseCategorizerConfiguration = (com.truecaller.insights.categorizer.model.CountryWiseCategorizerConfiguration) other;
        return kotlin.jvm.internal.Intrinsics.b(this.countries, countryWiseCategorizerConfiguration.countries) && kotlin.jvm.internal.Intrinsics.b(this.minWordsIdentified, countryWiseCategorizerConfiguration.minWordsIdentified);
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.ArrayList<java.lang.String> getCountries() {
        return this.countries;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getMinWordsIdentified() {
        return this.minWordsIdentified;
    }

    public int hashCode() {
        int hashCode = this.countries.hashCode() * 31;
        java.lang.Integer num = this.minWordsIdentified;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final void setMinWordsIdentified(@org.jetbrains.annotations.Nullable java.lang.Integer num) {
        this.minWordsIdentified = num;
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return "CountryWiseCategorizerConfiguration(countries=" + this.countries + ", minWordsIdentified=" + this.minWordsIdentified + ")";
    }

    public CountryWiseCategorizerConfiguration(@org.jetbrains.annotations.NotNull java.util.ArrayList<java.lang.String> arrayList, @org.jetbrains.annotations.Nullable java.lang.Integer num) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(arrayList, "countries");
        this.countries = arrayList;
        this.minWordsIdentified = num;
    }

    public /* synthetic */ CountryWiseCategorizerConfiguration(java.util.ArrayList arrayList, java.lang.Integer num, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new java.util.ArrayList() : arrayList, (i & 2) != 0 ? null : num);
    }
}
