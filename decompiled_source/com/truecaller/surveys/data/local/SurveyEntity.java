package com.truecaller.surveys.data.local;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\bHÆ\u0003J\t\u0010\u001b\u001a\u00020\nHÆ\u0003JE\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\nHÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\""}, d2 = {"Lcom/truecaller/surveys/data/local/SurveyEntity;", "", "id", "", "flow", "questions", "bottomSheetQuestionsIds", "lastTimeSeen", "", "context", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JI)V", "getId", "()Ljava/lang/String;", "getFlow", "getQuestions", "getBottomSheetQuestionsIds", "getLastTimeSeen", "()J", "getContext", "()I", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "surveys_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final /* data */ class SurveyEntity {
    public static final int $stable = 0;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String bottomSheetQuestionsIds;
    private final int context;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String flow;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String id;
    private final long lastTimeSeen;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String questions;

    public SurveyEntity(@org.jetbrains.annotations.NotNull java.lang.String str, @org.jetbrains.annotations.NotNull java.lang.String str2, @org.jetbrains.annotations.NotNull java.lang.String str3, @org.jetbrains.annotations.NotNull java.lang.String str4, long j, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "id");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "flow");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "questions");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "bottomSheetQuestionsIds");
        this.id = str;
        this.flow = str2;
        this.questions = str3;
        this.bottomSheetQuestionsIds = str4;
        this.lastTimeSeen = j;
        this.context = i;
    }

    public static /* synthetic */ com.truecaller.surveys.data.local.SurveyEntity copy$default(com.truecaller.surveys.data.local.SurveyEntity surveyEntity, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, long j, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            str = surveyEntity.id;
        }
        if ((i2 & 2) != 0) {
            str2 = surveyEntity.flow;
        }
        if ((i2 & 4) != 0) {
            str3 = surveyEntity.questions;
        }
        if ((i2 & 8) != 0) {
            str4 = surveyEntity.bottomSheetQuestionsIds;
        }
        if ((i2 & 16) != 0) {
            j = surveyEntity.lastTimeSeen;
        }
        if ((i2 & 32) != 0) {
            i = surveyEntity.context;
        }
        int i3 = i;
        long j2 = j;
        return surveyEntity.copy(str, str2, str3, str4, j2, i3);
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component2, reason: from getter */
    public final java.lang.String getFlow() {
        return this.flow;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component3, reason: from getter */
    public final java.lang.String getQuestions() {
        return this.questions;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component4, reason: from getter */
    public final java.lang.String getBottomSheetQuestionsIds() {
        return this.bottomSheetQuestionsIds;
    }

    /* renamed from: component5, reason: from getter */
    public final long getLastTimeSeen() {
        return this.lastTimeSeen;
    }

    /* renamed from: component6, reason: from getter */
    public final int getContext() {
        return this.context;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.surveys.data.local.SurveyEntity copy(@org.jetbrains.annotations.NotNull java.lang.String id, @org.jetbrains.annotations.NotNull java.lang.String flow, @org.jetbrains.annotations.NotNull java.lang.String questions, @org.jetbrains.annotations.NotNull java.lang.String bottomSheetQuestionsIds, long lastTimeSeen, int context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "id");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flow, "flow");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(questions, "questions");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bottomSheetQuestionsIds, "bottomSheetQuestionsIds");
        return new com.truecaller.surveys.data.local.SurveyEntity(id, flow, questions, bottomSheetQuestionsIds, lastTimeSeen, context);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.surveys.data.local.SurveyEntity)) {
            return false;
        }
        com.truecaller.surveys.data.local.SurveyEntity surveyEntity = (com.truecaller.surveys.data.local.SurveyEntity) other;
        return kotlin.jvm.internal.Intrinsics.b(this.id, surveyEntity.id) && kotlin.jvm.internal.Intrinsics.b(this.flow, surveyEntity.flow) && kotlin.jvm.internal.Intrinsics.b(this.questions, surveyEntity.questions) && kotlin.jvm.internal.Intrinsics.b(this.bottomSheetQuestionsIds, surveyEntity.bottomSheetQuestionsIds) && this.lastTimeSeen == surveyEntity.lastTimeSeen && this.context == surveyEntity.context;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getBottomSheetQuestionsIds() {
        return this.bottomSheetQuestionsIds;
    }

    public final int getContext() {
        return this.context;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getFlow() {
        return this.flow;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getId() {
        return this.id;
    }

    public final long getLastTimeSeen() {
        return this.lastTimeSeen;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getQuestions() {
        return this.questions;
    }

    public int hashCode() {
        int e = ax1.bar.e(ax1.bar.e(ax1.bar.e(this.id.hashCode() * 31, 31, this.flow), 31, this.questions), 31, this.bottomSheetQuestionsIds);
        long j = this.lastTimeSeen;
        return ((e + ((int) (j ^ (j >>> 32)))) * 31) + this.context;
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        java.lang.String str = this.id;
        java.lang.String str2 = this.flow;
        java.lang.String str3 = this.questions;
        java.lang.String str4 = this.bottomSheetQuestionsIds;
        long j = this.lastTimeSeen;
        int i = this.context;
        java.lang.StringBuilder E = ro0.f.E("SurveyEntity(id=", str, ", flow=", str2, ", questions=");
        bar.E(E, str3, ", bottomSheetQuestionsIds=", str4, ", lastTimeSeen=");
        h8.s0.y(i, j, ", context=", E);
        E.append(")");
        return E.toString();
    }

    public /* synthetic */ SurveyEntity(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, long j, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, (i2 & 16) != 0 ? 0L : j, i);
    }
}
