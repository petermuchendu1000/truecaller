package com.truecaller.insights.categorizer.model;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0018\b\u0002\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\u0019\u0010\u001a\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\tHÆ\u0003J@\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0018\b\u0002\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u001dJ\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\u0003HÖ\u0001J\t\u0010\"\u001a\u00020#HÖ\u0001R\"\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR.\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R \u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006$"}, d2 = {"Lcom/truecaller/insights/categorizer/model/CategorizerFirebaseConfiguration;", "", "version", "", "configurations", "Ljava/util/ArrayList;", "Lcom/truecaller/insights/categorizer/model/CountryWiseCategorizerConfiguration;", "Lkotlin/collections/ArrayList;", "defaultCategorizerConfiguration", "Lcom/truecaller/insights/categorizer/model/DefaultCategorizerConfiguration;", "<init>", "(Ljava/lang/Integer;Ljava/util/ArrayList;Lcom/truecaller/insights/categorizer/model/DefaultCategorizerConfiguration;)V", "getVersion", "()Ljava/lang/Integer;", "setVersion", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getConfigurations", "()Ljava/util/ArrayList;", "setConfigurations", "(Ljava/util/ArrayList;)V", "getDefaultCategorizerConfiguration", "()Lcom/truecaller/insights/categorizer/model/DefaultCategorizerConfiguration;", "setDefaultCategorizerConfiguration", "(Lcom/truecaller/insights/categorizer/model/DefaultCategorizerConfiguration;)V", "component1", "component2", "component3", "copy", "(Ljava/lang/Integer;Ljava/util/ArrayList;Lcom/truecaller/insights/categorizer/model/DefaultCategorizerConfiguration;)Lcom/truecaller/insights/categorizer/model/CategorizerFirebaseConfiguration;", "equals", "", "other", "hashCode", "toString", "", "core_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final /* data */ class CategorizerFirebaseConfiguration {

    @bw.qux("configurations")
    @org.jetbrains.annotations.NotNull
    private java.util.ArrayList<com.truecaller.insights.categorizer.model.CountryWiseCategorizerConfiguration> configurations;

    @bw.qux("default_configuration")
    @org.jetbrains.annotations.Nullable
    private com.truecaller.insights.categorizer.model.DefaultCategorizerConfiguration defaultCategorizerConfiguration;

    @bw.qux("version")
    @org.jetbrains.annotations.Nullable
    private java.lang.Integer version;

    public CategorizerFirebaseConfiguration() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.truecaller.insights.categorizer.model.CategorizerFirebaseConfiguration copy$default(com.truecaller.insights.categorizer.model.CategorizerFirebaseConfiguration categorizerFirebaseConfiguration, java.lang.Integer num, java.util.ArrayList arrayList, com.truecaller.insights.categorizer.model.DefaultCategorizerConfiguration defaultCategorizerConfiguration, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            num = categorizerFirebaseConfiguration.version;
        }
        if ((i & 2) != 0) {
            arrayList = categorizerFirebaseConfiguration.configurations;
        }
        if ((i & 4) != 0) {
            defaultCategorizerConfiguration = categorizerFirebaseConfiguration.defaultCategorizerConfiguration;
        }
        return categorizerFirebaseConfiguration.copy(num, arrayList, defaultCategorizerConfiguration);
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component1, reason: from getter */
    public final java.lang.Integer getVersion() {
        return this.version;
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.ArrayList<com.truecaller.insights.categorizer.model.CountryWiseCategorizerConfiguration> component2() {
        return this.configurations;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component3, reason: from getter */
    public final com.truecaller.insights.categorizer.model.DefaultCategorizerConfiguration getDefaultCategorizerConfiguration() {
        return this.defaultCategorizerConfiguration;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.insights.categorizer.model.CategorizerFirebaseConfiguration copy(@org.jetbrains.annotations.Nullable java.lang.Integer version, @org.jetbrains.annotations.NotNull java.util.ArrayList<com.truecaller.insights.categorizer.model.CountryWiseCategorizerConfiguration> configurations, @org.jetbrains.annotations.Nullable com.truecaller.insights.categorizer.model.DefaultCategorizerConfiguration defaultCategorizerConfiguration) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configurations, "configurations");
        return new com.truecaller.insights.categorizer.model.CategorizerFirebaseConfiguration(version, configurations, defaultCategorizerConfiguration);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.insights.categorizer.model.CategorizerFirebaseConfiguration)) {
            return false;
        }
        com.truecaller.insights.categorizer.model.CategorizerFirebaseConfiguration categorizerFirebaseConfiguration = (com.truecaller.insights.categorizer.model.CategorizerFirebaseConfiguration) other;
        return kotlin.jvm.internal.Intrinsics.b(this.version, categorizerFirebaseConfiguration.version) && kotlin.jvm.internal.Intrinsics.b(this.configurations, categorizerFirebaseConfiguration.configurations) && kotlin.jvm.internal.Intrinsics.b(this.defaultCategorizerConfiguration, categorizerFirebaseConfiguration.defaultCategorizerConfiguration);
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.ArrayList<com.truecaller.insights.categorizer.model.CountryWiseCategorizerConfiguration> getConfigurations() {
        return this.configurations;
    }

    @org.jetbrains.annotations.Nullable
    public final com.truecaller.insights.categorizer.model.DefaultCategorizerConfiguration getDefaultCategorizerConfiguration() {
        return this.defaultCategorizerConfiguration;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getVersion() {
        return this.version;
    }

    public int hashCode() {
        java.lang.Integer num = this.version;
        int hashCode = (this.configurations.hashCode() + ((num == null ? 0 : num.hashCode()) * 31)) * 31;
        com.truecaller.insights.categorizer.model.DefaultCategorizerConfiguration defaultCategorizerConfiguration = this.defaultCategorizerConfiguration;
        return hashCode + (defaultCategorizerConfiguration != null ? defaultCategorizerConfiguration.hashCode() : 0);
    }

    public final void setConfigurations(@org.jetbrains.annotations.NotNull java.util.ArrayList<com.truecaller.insights.categorizer.model.CountryWiseCategorizerConfiguration> arrayList) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.configurations = arrayList;
    }

    public final void setDefaultCategorizerConfiguration(@org.jetbrains.annotations.Nullable com.truecaller.insights.categorizer.model.DefaultCategorizerConfiguration defaultCategorizerConfiguration) {
        this.defaultCategorizerConfiguration = defaultCategorizerConfiguration;
    }

    public final void setVersion(@org.jetbrains.annotations.Nullable java.lang.Integer num) {
        this.version = num;
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return "CategorizerFirebaseConfiguration(version=" + this.version + ", configurations=" + this.configurations + ", defaultCategorizerConfiguration=" + this.defaultCategorizerConfiguration + ")";
    }

    public CategorizerFirebaseConfiguration(@org.jetbrains.annotations.Nullable java.lang.Integer num, @org.jetbrains.annotations.NotNull java.util.ArrayList<com.truecaller.insights.categorizer.model.CountryWiseCategorizerConfiguration> arrayList, @org.jetbrains.annotations.Nullable com.truecaller.insights.categorizer.model.DefaultCategorizerConfiguration defaultCategorizerConfiguration) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(arrayList, "configurations");
        this.version = num;
        this.configurations = arrayList;
        this.defaultCategorizerConfiguration = defaultCategorizerConfiguration;
    }

    public /* synthetic */ CategorizerFirebaseConfiguration(java.lang.Integer num, java.util.ArrayList arrayList, com.truecaller.insights.categorizer.model.DefaultCategorizerConfiguration defaultCategorizerConfiguration, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? new java.util.ArrayList() : arrayList, (i & 4) != 0 ? new com.truecaller.insights.categorizer.model.DefaultCategorizerConfiguration(null, 1, null) : defaultCategorizerConfiguration);
    }
}
