package com.truecaller.insights.database.entities.llm;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003JQ\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0016\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0016\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0016\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010¨\u0006$"}, d2 = {"Lcom/truecaller/insights/database/entities/llm/InsightsLlmActionEntity;", "", "useCaseActionId", "", "patternId", "", "useCaseId", "useCaseActionName", "useCaseActionValue", "useCaseActionType", "useCaseActionContent", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getUseCaseActionId", "()J", "getPatternId", "()Ljava/lang/String;", "getUseCaseId", "getUseCaseActionName", "getUseCaseActionValue", "getUseCaseActionType", "getUseCaseActionContent", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "database_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final /* data */ class InsightsLlmActionEntity {

    @org.jetbrains.annotations.NotNull
    private final java.lang.String patternId;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String useCaseActionContent;
    private final long useCaseActionId;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String useCaseActionName;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String useCaseActionType;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String useCaseActionValue;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String useCaseId;

    public InsightsLlmActionEntity(long j, @org.jetbrains.annotations.NotNull java.lang.String str, @org.jetbrains.annotations.Nullable java.lang.String str2, @org.jetbrains.annotations.NotNull java.lang.String str3, @org.jetbrains.annotations.NotNull java.lang.String str4, @org.jetbrains.annotations.NotNull java.lang.String str5, @org.jetbrains.annotations.NotNull java.lang.String str6) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "patternId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "useCaseActionName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "useCaseActionValue");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str5, "useCaseActionType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str6, "useCaseActionContent");
        this.useCaseActionId = j;
        this.patternId = str;
        this.useCaseId = str2;
        this.useCaseActionName = str3;
        this.useCaseActionValue = str4;
        this.useCaseActionType = str5;
        this.useCaseActionContent = str6;
    }

    public static /* synthetic */ com.truecaller.insights.database.entities.llm.InsightsLlmActionEntity copy$default(com.truecaller.insights.database.entities.llm.InsightsLlmActionEntity insightsLlmActionEntity, long j, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            j = insightsLlmActionEntity.useCaseActionId;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            str = insightsLlmActionEntity.patternId;
        }
        java.lang.String str7 = str;
        if ((i & 4) != 0) {
            str2 = insightsLlmActionEntity.useCaseId;
        }
        java.lang.String str8 = str2;
        if ((i & 8) != 0) {
            str3 = insightsLlmActionEntity.useCaseActionName;
        }
        java.lang.String str9 = str3;
        if ((i & 16) != 0) {
            str4 = insightsLlmActionEntity.useCaseActionValue;
        }
        return insightsLlmActionEntity.copy(j2, str7, str8, str9, str4, (i & 32) != 0 ? insightsLlmActionEntity.useCaseActionType : str5, (i & 64) != 0 ? insightsLlmActionEntity.useCaseActionContent : str6);
    }

    /* renamed from: component1, reason: from getter */
    public final long getUseCaseActionId() {
        return this.useCaseActionId;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component2, reason: from getter */
    public final java.lang.String getPatternId() {
        return this.patternId;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component3, reason: from getter */
    public final java.lang.String getUseCaseId() {
        return this.useCaseId;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component4, reason: from getter */
    public final java.lang.String getUseCaseActionName() {
        return this.useCaseActionName;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component5, reason: from getter */
    public final java.lang.String getUseCaseActionValue() {
        return this.useCaseActionValue;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component6, reason: from getter */
    public final java.lang.String getUseCaseActionType() {
        return this.useCaseActionType;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component7, reason: from getter */
    public final java.lang.String getUseCaseActionContent() {
        return this.useCaseActionContent;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.insights.database.entities.llm.InsightsLlmActionEntity copy(long useCaseActionId, @org.jetbrains.annotations.NotNull java.lang.String patternId, @org.jetbrains.annotations.Nullable java.lang.String useCaseId, @org.jetbrains.annotations.NotNull java.lang.String useCaseActionName, @org.jetbrains.annotations.NotNull java.lang.String useCaseActionValue, @org.jetbrains.annotations.NotNull java.lang.String useCaseActionType, @org.jetbrains.annotations.NotNull java.lang.String useCaseActionContent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(patternId, "patternId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(useCaseActionName, "useCaseActionName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(useCaseActionValue, "useCaseActionValue");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(useCaseActionType, "useCaseActionType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(useCaseActionContent, "useCaseActionContent");
        return new com.truecaller.insights.database.entities.llm.InsightsLlmActionEntity(useCaseActionId, patternId, useCaseId, useCaseActionName, useCaseActionValue, useCaseActionType, useCaseActionContent);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.insights.database.entities.llm.InsightsLlmActionEntity)) {
            return false;
        }
        com.truecaller.insights.database.entities.llm.InsightsLlmActionEntity insightsLlmActionEntity = (com.truecaller.insights.database.entities.llm.InsightsLlmActionEntity) other;
        return this.useCaseActionId == insightsLlmActionEntity.useCaseActionId && kotlin.jvm.internal.Intrinsics.b(this.patternId, insightsLlmActionEntity.patternId) && kotlin.jvm.internal.Intrinsics.b(this.useCaseId, insightsLlmActionEntity.useCaseId) && kotlin.jvm.internal.Intrinsics.b(this.useCaseActionName, insightsLlmActionEntity.useCaseActionName) && kotlin.jvm.internal.Intrinsics.b(this.useCaseActionValue, insightsLlmActionEntity.useCaseActionValue) && kotlin.jvm.internal.Intrinsics.b(this.useCaseActionType, insightsLlmActionEntity.useCaseActionType) && kotlin.jvm.internal.Intrinsics.b(this.useCaseActionContent, insightsLlmActionEntity.useCaseActionContent);
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getPatternId() {
        return this.patternId;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getUseCaseActionContent() {
        return this.useCaseActionContent;
    }

    public final long getUseCaseActionId() {
        return this.useCaseActionId;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getUseCaseActionName() {
        return this.useCaseActionName;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getUseCaseActionType() {
        return this.useCaseActionType;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getUseCaseActionValue() {
        return this.useCaseActionValue;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getUseCaseId() {
        return this.useCaseId;
    }

    public int hashCode() {
        int hashCode;
        long j = this.useCaseActionId;
        int e = ax1.bar.e(((int) (j ^ (j >>> 32))) * 31, 31, this.patternId);
        java.lang.String str = this.useCaseId;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return this.useCaseActionContent.hashCode() + ax1.bar.e(ax1.bar.e(ax1.bar.e((e + hashCode) * 31, 31, this.useCaseActionName), 31, this.useCaseActionValue), 31, this.useCaseActionType);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        long j = this.useCaseActionId;
        java.lang.String str = this.patternId;
        java.lang.String str2 = this.useCaseId;
        java.lang.String str3 = this.useCaseActionName;
        java.lang.String str4 = this.useCaseActionValue;
        java.lang.String str5 = this.useCaseActionType;
        java.lang.String str6 = this.useCaseActionContent;
        java.lang.StringBuilder p = com.appsflyer.internal.e.p("InsightsLlmActionEntity(useCaseActionId=", j, ", patternId=", str);
        bar.E(p, ", useCaseId=", str2, ", useCaseActionName=", str3);
        bar.E(p, ", useCaseActionValue=", str4, ", useCaseActionType=", str5);
        return y.o.f(", useCaseActionContent=", str6, ")", p);
    }

    public /* synthetic */ InsightsLlmActionEntity(long j, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, str, (i & 4) != 0 ? null : str2, str3, str4, str5, str6);
    }
}
