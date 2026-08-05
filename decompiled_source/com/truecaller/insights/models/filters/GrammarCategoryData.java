package com.truecaller.insights.models.filters;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/truecaller/insights/models/filters/GrammarCategoryData;", "", "domain", "", com.truecaller.insights.database.models.analytics.AggregatedParserAnalytics.EVENT_COUNT, "", "<init>", "(Ljava/lang/String;I)V", "getDomain", "()Ljava/lang/String;", "getCount", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "models_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final /* data */ class GrammarCategoryData {
    private final int count;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String domain;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public GrammarCategoryData() {
        this(r2, 0, 3, r2);
        java.lang.String str = null;
    }

    public static /* synthetic */ com.truecaller.insights.models.filters.GrammarCategoryData copy$default(com.truecaller.insights.models.filters.GrammarCategoryData grammarCategoryData, java.lang.String str, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            str = grammarCategoryData.domain;
        }
        if ((i2 & 2) != 0) {
            i = grammarCategoryData.count;
        }
        return grammarCategoryData.copy(str, i);
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component1, reason: from getter */
    public final java.lang.String getDomain() {
        return this.domain;
    }

    /* renamed from: component2, reason: from getter */
    public final int getCount() {
        return this.count;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.insights.models.filters.GrammarCategoryData copy(@org.jetbrains.annotations.NotNull java.lang.String domain, int count) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(domain, "domain");
        return new com.truecaller.insights.models.filters.GrammarCategoryData(domain, count);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.insights.models.filters.GrammarCategoryData)) {
            return false;
        }
        com.truecaller.insights.models.filters.GrammarCategoryData grammarCategoryData = (com.truecaller.insights.models.filters.GrammarCategoryData) other;
        return kotlin.jvm.internal.Intrinsics.b(this.domain, grammarCategoryData.domain) && this.count == grammarCategoryData.count;
    }

    public final int getCount() {
        return this.count;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getDomain() {
        return this.domain;
    }

    public int hashCode() {
        return (this.domain.hashCode() * 31) + this.count;
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return com.appsflyer.internal.e.i("GrammarCategoryData(domain=", this.count, this.domain, ", count=", ")");
    }

    public GrammarCategoryData(@org.jetbrains.annotations.NotNull java.lang.String str, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "domain");
        this.domain = str;
        this.count = i;
    }

    public /* synthetic */ GrammarCategoryData(java.lang.String str, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? 0 : i);
    }
}
