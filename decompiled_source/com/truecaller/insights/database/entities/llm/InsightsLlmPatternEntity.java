package com.truecaller.insights.database.entities.llm;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B{\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010*\u001a\u00020\fHÆ\u0003J\t\u0010+\u001a\u00020\u000eHÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\u0089\u0001\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u0003HÆ\u0001J\u0013\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00102\u001a\u000203HÖ\u0001J\t\u00104\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014R\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0014R\u0016\u0010\u0010\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0014¨\u00065"}, d2 = {"Lcom/truecaller/insights/database/entities/llm/InsightsLlmPatternEntity;", "", "patternId", "", "pattern", "patternStatus", "senderId", "category", "subCategory", "useCaseId", "summary", "ttl", "", "lastUpdated", "Ljava/util/Date;", "patternVersion", "patternType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/util/Date;Ljava/lang/String;Ljava/lang/String;)V", "getPatternId", "()Ljava/lang/String;", "getPattern", "getPatternStatus", "getSenderId", "getCategory", "getSubCategory", "getUseCaseId", "getSummary", "getTtl", "()J", "getLastUpdated", "()Ljava/util/Date;", "getPatternVersion", "getPatternType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "equals", "", "other", "hashCode", "", "toString", "database_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final /* data */ class InsightsLlmPatternEntity {

    @org.jetbrains.annotations.NotNull
    private final java.lang.String category;

    @org.jetbrains.annotations.NotNull
    private final java.util.Date lastUpdated;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String pattern;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String patternId;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String patternStatus;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String patternType;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String patternVersion;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String senderId;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String subCategory;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String summary;
    private final long ttl;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String useCaseId;

    public InsightsLlmPatternEntity(@org.jetbrains.annotations.NotNull java.lang.String str, @org.jetbrains.annotations.NotNull java.lang.String str2, @org.jetbrains.annotations.NotNull java.lang.String str3, @org.jetbrains.annotations.NotNull java.lang.String str4, @org.jetbrains.annotations.NotNull java.lang.String str5, @org.jetbrains.annotations.Nullable java.lang.String str6, @org.jetbrains.annotations.Nullable java.lang.String str7, @org.jetbrains.annotations.Nullable java.lang.String str8, long j, @org.jetbrains.annotations.NotNull java.util.Date date, @org.jetbrains.annotations.Nullable java.lang.String str9, @org.jetbrains.annotations.NotNull java.lang.String str10) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "patternId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "pattern");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "patternStatus");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "senderId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str5, "category");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(date, "lastUpdated");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str10, "patternType");
        this.patternId = str;
        this.pattern = str2;
        this.patternStatus = str3;
        this.senderId = str4;
        this.category = str5;
        this.subCategory = str6;
        this.useCaseId = str7;
        this.summary = str8;
        this.ttl = j;
        this.lastUpdated = date;
        this.patternVersion = str9;
        this.patternType = str10;
    }

    public static /* synthetic */ com.truecaller.insights.database.entities.llm.InsightsLlmPatternEntity copy$default(com.truecaller.insights.database.entities.llm.InsightsLlmPatternEntity insightsLlmPatternEntity, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, long j, java.util.Date date, java.lang.String str9, java.lang.String str10, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = insightsLlmPatternEntity.patternId;
        }
        return insightsLlmPatternEntity.copy(str, (i & 2) != 0 ? insightsLlmPatternEntity.pattern : str2, (i & 4) != 0 ? insightsLlmPatternEntity.patternStatus : str3, (i & 8) != 0 ? insightsLlmPatternEntity.senderId : str4, (i & 16) != 0 ? insightsLlmPatternEntity.category : str5, (i & 32) != 0 ? insightsLlmPatternEntity.subCategory : str6, (i & 64) != 0 ? insightsLlmPatternEntity.useCaseId : str7, (i & 128) != 0 ? insightsLlmPatternEntity.summary : str8, (i & 256) != 0 ? insightsLlmPatternEntity.ttl : j, (i & 512) != 0 ? insightsLlmPatternEntity.lastUpdated : date, (i & 1024) != 0 ? insightsLlmPatternEntity.patternVersion : str9, (i & 2048) != 0 ? insightsLlmPatternEntity.patternType : str10);
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component1, reason: from getter */
    public final java.lang.String getPatternId() {
        return this.patternId;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component10, reason: from getter */
    public final java.util.Date getLastUpdated() {
        return this.lastUpdated;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component11, reason: from getter */
    public final java.lang.String getPatternVersion() {
        return this.patternVersion;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component12, reason: from getter */
    public final java.lang.String getPatternType() {
        return this.patternType;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component2, reason: from getter */
    public final java.lang.String getPattern() {
        return this.pattern;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component3, reason: from getter */
    public final java.lang.String getPatternStatus() {
        return this.patternStatus;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component4, reason: from getter */
    public final java.lang.String getSenderId() {
        return this.senderId;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component5, reason: from getter */
    public final java.lang.String getCategory() {
        return this.category;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component6, reason: from getter */
    public final java.lang.String getSubCategory() {
        return this.subCategory;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component7, reason: from getter */
    public final java.lang.String getUseCaseId() {
        return this.useCaseId;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component8, reason: from getter */
    public final java.lang.String getSummary() {
        return this.summary;
    }

    /* renamed from: component9, reason: from getter */
    public final long getTtl() {
        return this.ttl;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.insights.database.entities.llm.InsightsLlmPatternEntity copy(@org.jetbrains.annotations.NotNull java.lang.String patternId, @org.jetbrains.annotations.NotNull java.lang.String pattern, @org.jetbrains.annotations.NotNull java.lang.String patternStatus, @org.jetbrains.annotations.NotNull java.lang.String senderId, @org.jetbrains.annotations.NotNull java.lang.String category, @org.jetbrains.annotations.Nullable java.lang.String subCategory, @org.jetbrains.annotations.Nullable java.lang.String useCaseId, @org.jetbrains.annotations.Nullable java.lang.String summary, long ttl, @org.jetbrains.annotations.NotNull java.util.Date lastUpdated, @org.jetbrains.annotations.Nullable java.lang.String patternVersion, @org.jetbrains.annotations.NotNull java.lang.String patternType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(patternId, "patternId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pattern, "pattern");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(patternStatus, "patternStatus");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(senderId, "senderId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(category, "category");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lastUpdated, "lastUpdated");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(patternType, "patternType");
        return new com.truecaller.insights.database.entities.llm.InsightsLlmPatternEntity(patternId, pattern, patternStatus, senderId, category, subCategory, useCaseId, summary, ttl, lastUpdated, patternVersion, patternType);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.insights.database.entities.llm.InsightsLlmPatternEntity)) {
            return false;
        }
        com.truecaller.insights.database.entities.llm.InsightsLlmPatternEntity insightsLlmPatternEntity = (com.truecaller.insights.database.entities.llm.InsightsLlmPatternEntity) other;
        return kotlin.jvm.internal.Intrinsics.b(this.patternId, insightsLlmPatternEntity.patternId) && kotlin.jvm.internal.Intrinsics.b(this.pattern, insightsLlmPatternEntity.pattern) && kotlin.jvm.internal.Intrinsics.b(this.patternStatus, insightsLlmPatternEntity.patternStatus) && kotlin.jvm.internal.Intrinsics.b(this.senderId, insightsLlmPatternEntity.senderId) && kotlin.jvm.internal.Intrinsics.b(this.category, insightsLlmPatternEntity.category) && kotlin.jvm.internal.Intrinsics.b(this.subCategory, insightsLlmPatternEntity.subCategory) && kotlin.jvm.internal.Intrinsics.b(this.useCaseId, insightsLlmPatternEntity.useCaseId) && kotlin.jvm.internal.Intrinsics.b(this.summary, insightsLlmPatternEntity.summary) && this.ttl == insightsLlmPatternEntity.ttl && kotlin.jvm.internal.Intrinsics.b(this.lastUpdated, insightsLlmPatternEntity.lastUpdated) && kotlin.jvm.internal.Intrinsics.b(this.patternVersion, insightsLlmPatternEntity.patternVersion) && kotlin.jvm.internal.Intrinsics.b(this.patternType, insightsLlmPatternEntity.patternType);
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getCategory() {
        return this.category;
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.Date getLastUpdated() {
        return this.lastUpdated;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getPattern() {
        return this.pattern;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getPatternId() {
        return this.patternId;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getPatternStatus() {
        return this.patternStatus;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getPatternType() {
        return this.patternType;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getPatternVersion() {
        return this.patternVersion;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getSenderId() {
        return this.senderId;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getSubCategory() {
        return this.subCategory;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getSummary() {
        return this.summary;
    }

    public final long getTtl() {
        return this.ttl;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getUseCaseId() {
        return this.useCaseId;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int e = ax1.bar.e(ax1.bar.e(ax1.bar.e(ax1.bar.e(this.patternId.hashCode() * 31, 31, this.pattern), 31, this.patternStatus), 31, this.senderId), 31, this.category);
        java.lang.String str = this.subCategory;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (e + hashCode) * 31;
        java.lang.String str2 = this.useCaseId;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        java.lang.String str3 = this.summary;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        long j = this.ttl;
        int h = uf.qux.h(this.lastUpdated, (((i3 + hashCode3) * 31) + ((int) (j ^ (j >>> 32)))) * 31, 31);
        java.lang.String str4 = this.patternVersion;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return this.patternType.hashCode() + ((h + i) * 31);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        java.lang.String str = this.patternId;
        java.lang.String str2 = this.pattern;
        java.lang.String str3 = this.patternStatus;
        java.lang.String str4 = this.senderId;
        java.lang.String str5 = this.category;
        java.lang.String str6 = this.subCategory;
        java.lang.String str7 = this.useCaseId;
        java.lang.String str8 = this.summary;
        long j = this.ttl;
        java.util.Date date = this.lastUpdated;
        java.lang.String str9 = this.patternVersion;
        java.lang.String str10 = this.patternType;
        java.lang.StringBuilder E = ro0.f.E("InsightsLlmPatternEntity(patternId=", str, ", pattern=", str2, ", patternStatus=");
        bar.E(E, str3, ", senderId=", str4, ", category=");
        bar.E(E, str5, ", subCategory=", str6, ", useCaseId=");
        bar.E(E, str7, ", summary=", str8, ", ttl=");
        E.append(j);
        E.append(", lastUpdated=");
        E.append(date);
        bar.E(E, ", patternVersion=", str9, ", patternType=", str10);
        E.append(")");
        return E.toString();
    }

    public /* synthetic */ InsightsLlmPatternEntity(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, long j, java.util.Date date, java.lang.String str9, java.lang.String str10, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? 0L : j, (i & 512) != 0 ? new java.util.Date() : date, (i & 1024) != 0 ? null : str9, str10);
    }
}
