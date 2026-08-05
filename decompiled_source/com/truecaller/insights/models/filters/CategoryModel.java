package com.truecaller.insights.models.filters;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\bHÆ\u0003J\t\u0010\u001c\u001a\u00020\nHÆ\u0003J\t\u0010\u001d\u001a\u00020\fHÆ\u0003JA\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010\u001f\u001a\u00020\f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\nHÖ\u0001J\t\u0010\"\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006#"}, d2 = {"Lcom/truecaller/insights/models/filters/CategoryModel;", "", "tagCategory", "Lcom/truecaller/insights/models/smartcards/SmartCardCategory;", "updateCategories", "", "Lcom/truecaller/insights/models/updates/UpdateCategory;", "grammarCategory", "", com.truecaller.insights.database.models.analytics.AggregatedParserAnalytics.EVENT_COUNT, "", "useTagCategory", "", "<init>", "(Lcom/truecaller/insights/models/smartcards/SmartCardCategory;Ljava/util/Set;Ljava/lang/String;IZ)V", "getTagCategory", "()Lcom/truecaller/insights/models/smartcards/SmartCardCategory;", "getUpdateCategories", "()Ljava/util/Set;", "getGrammarCategory", "()Ljava/lang/String;", "getCount", "()I", "getUseTagCategory", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "models_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final /* data */ class CategoryModel {
    private final int count;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String grammarCategory;

    @org.jetbrains.annotations.NotNull
    private final com.truecaller.insights.models.smartcards.SmartCardCategory tagCategory;

    @org.jetbrains.annotations.NotNull
    private final java.util.Set<com.truecaller.insights.models.updates.UpdateCategory> updateCategories;
    private final boolean useTagCategory;

    /* JADX WARN: Multi-variable type inference failed */
    public CategoryModel(@org.jetbrains.annotations.NotNull com.truecaller.insights.models.smartcards.SmartCardCategory smartCardCategory, @org.jetbrains.annotations.NotNull java.util.Set<? extends com.truecaller.insights.models.updates.UpdateCategory> set, @org.jetbrains.annotations.NotNull java.lang.String str, int i, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(smartCardCategory, "tagCategory");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set, "updateCategories");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "grammarCategory");
        this.tagCategory = smartCardCategory;
        this.updateCategories = set;
        this.grammarCategory = str;
        this.count = i;
        this.useTagCategory = z;
    }

    public static /* synthetic */ com.truecaller.insights.models.filters.CategoryModel copy$default(com.truecaller.insights.models.filters.CategoryModel categoryModel, com.truecaller.insights.models.smartcards.SmartCardCategory smartCardCategory, java.util.Set set, java.lang.String str, int i, boolean z, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            smartCardCategory = categoryModel.tagCategory;
        }
        if ((i2 & 2) != 0) {
            set = categoryModel.updateCategories;
        }
        if ((i2 & 4) != 0) {
            str = categoryModel.grammarCategory;
        }
        if ((i2 & 8) != 0) {
            i = categoryModel.count;
        }
        if ((i2 & 16) != 0) {
            z = categoryModel.useTagCategory;
        }
        boolean z2 = z;
        java.lang.String str2 = str;
        return categoryModel.copy(smartCardCategory, set, str2, i, z2);
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component1, reason: from getter */
    public final com.truecaller.insights.models.smartcards.SmartCardCategory getTagCategory() {
        return this.tagCategory;
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.Set<com.truecaller.insights.models.updates.UpdateCategory> component2() {
        return this.updateCategories;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component3, reason: from getter */
    public final java.lang.String getGrammarCategory() {
        return this.grammarCategory;
    }

    /* renamed from: component4, reason: from getter */
    public final int getCount() {
        return this.count;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getUseTagCategory() {
        return this.useTagCategory;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.insights.models.filters.CategoryModel copy(@org.jetbrains.annotations.NotNull com.truecaller.insights.models.smartcards.SmartCardCategory tagCategory, @org.jetbrains.annotations.NotNull java.util.Set<? extends com.truecaller.insights.models.updates.UpdateCategory> updateCategories, @org.jetbrains.annotations.NotNull java.lang.String grammarCategory, int count, boolean useTagCategory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tagCategory, "tagCategory");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updateCategories, "updateCategories");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(grammarCategory, "grammarCategory");
        return new com.truecaller.insights.models.filters.CategoryModel(tagCategory, updateCategories, grammarCategory, count, useTagCategory);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.insights.models.filters.CategoryModel)) {
            return false;
        }
        com.truecaller.insights.models.filters.CategoryModel categoryModel = (com.truecaller.insights.models.filters.CategoryModel) other;
        return this.tagCategory == categoryModel.tagCategory && kotlin.jvm.internal.Intrinsics.b(this.updateCategories, categoryModel.updateCategories) && kotlin.jvm.internal.Intrinsics.b(this.grammarCategory, categoryModel.grammarCategory) && this.count == categoryModel.count && this.useTagCategory == categoryModel.useTagCategory;
    }

    public final int getCount() {
        return this.count;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getGrammarCategory() {
        return this.grammarCategory;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.insights.models.smartcards.SmartCardCategory getTagCategory() {
        return this.tagCategory;
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.Set<com.truecaller.insights.models.updates.UpdateCategory> getUpdateCategories() {
        return this.updateCategories;
    }

    public final boolean getUseTagCategory() {
        return this.useTagCategory;
    }

    public int hashCode() {
        int i;
        int e = (ax1.bar.e((this.updateCategories.hashCode() + (this.tagCategory.hashCode() * 31)) * 31, 31, this.grammarCategory) + this.count) * 31;
        if (this.useTagCategory) {
            i = 1231;
        } else {
            i = 1237;
        }
        return e + i;
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        com.truecaller.insights.models.smartcards.SmartCardCategory smartCardCategory = this.tagCategory;
        java.util.Set<com.truecaller.insights.models.updates.UpdateCategory> set = this.updateCategories;
        java.lang.String str = this.grammarCategory;
        int i = this.count;
        boolean z = this.useTagCategory;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CategoryModel(tagCategory=");
        sb.append(smartCardCategory);
        sb.append(", updateCategories=");
        sb.append(set);
        sb.append(", grammarCategory=");
        t.c.x(i, str, ", count=", ", useTagCategory=", sb);
        return h8.s0.s(sb, z, ")");
    }

    public /* synthetic */ CategoryModel(com.truecaller.insights.models.smartcards.SmartCardCategory smartCardCategory, java.util.Set set, java.lang.String str, int i, boolean z, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(smartCardCategory, set, str, (i2 & 8) != 0 ? 0 : i, (i2 & 16) != 0 ? false : z);
    }
}
