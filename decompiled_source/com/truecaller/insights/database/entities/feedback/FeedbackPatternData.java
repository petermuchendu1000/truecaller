package com.truecaller.insights.database.entities.feedback;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J5\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/truecaller/insights/database/entities/feedback/FeedbackPatternData;", "", "feedbackType", "", "feedbackAction", "messagePattern", "llmPatternId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getFeedbackType", "()Ljava/lang/String;", "getFeedbackAction", "getMessagePattern", "getLlmPatternId", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "database_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final /* data */ class FeedbackPatternData {

    @org.jetbrains.annotations.NotNull
    private final java.lang.String feedbackAction;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String feedbackType;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String llmPatternId;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String messagePattern;

    public FeedbackPatternData() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ com.truecaller.insights.database.entities.feedback.FeedbackPatternData copy$default(com.truecaller.insights.database.entities.feedback.FeedbackPatternData feedbackPatternData, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = feedbackPatternData.feedbackType;
        }
        if ((i & 2) != 0) {
            str2 = feedbackPatternData.feedbackAction;
        }
        if ((i & 4) != 0) {
            str3 = feedbackPatternData.messagePattern;
        }
        if ((i & 8) != 0) {
            str4 = feedbackPatternData.llmPatternId;
        }
        return feedbackPatternData.copy(str, str2, str3, str4);
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component1, reason: from getter */
    public final java.lang.String getFeedbackType() {
        return this.feedbackType;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component2, reason: from getter */
    public final java.lang.String getFeedbackAction() {
        return this.feedbackAction;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component3, reason: from getter */
    public final java.lang.String getMessagePattern() {
        return this.messagePattern;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component4, reason: from getter */
    public final java.lang.String getLlmPatternId() {
        return this.llmPatternId;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.insights.database.entities.feedback.FeedbackPatternData copy(@org.jetbrains.annotations.NotNull java.lang.String feedbackType, @org.jetbrains.annotations.NotNull java.lang.String feedbackAction, @org.jetbrains.annotations.Nullable java.lang.String messagePattern, @org.jetbrains.annotations.Nullable java.lang.String llmPatternId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(feedbackType, "feedbackType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(feedbackAction, "feedbackAction");
        return new com.truecaller.insights.database.entities.feedback.FeedbackPatternData(feedbackType, feedbackAction, messagePattern, llmPatternId);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.insights.database.entities.feedback.FeedbackPatternData)) {
            return false;
        }
        com.truecaller.insights.database.entities.feedback.FeedbackPatternData feedbackPatternData = (com.truecaller.insights.database.entities.feedback.FeedbackPatternData) other;
        return kotlin.jvm.internal.Intrinsics.b(this.feedbackType, feedbackPatternData.feedbackType) && kotlin.jvm.internal.Intrinsics.b(this.feedbackAction, feedbackPatternData.feedbackAction) && kotlin.jvm.internal.Intrinsics.b(this.messagePattern, feedbackPatternData.messagePattern) && kotlin.jvm.internal.Intrinsics.b(this.llmPatternId, feedbackPatternData.llmPatternId);
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getFeedbackAction() {
        return this.feedbackAction;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getFeedbackType() {
        return this.feedbackType;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getLlmPatternId() {
        return this.llmPatternId;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getMessagePattern() {
        return this.messagePattern;
    }

    public int hashCode() {
        int hashCode;
        int e = ax1.bar.e(this.feedbackType.hashCode() * 31, 31, this.feedbackAction);
        java.lang.String str = this.messagePattern;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (e + hashCode) * 31;
        java.lang.String str2 = this.llmPatternId;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return i2 + i;
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        java.lang.String str = this.feedbackType;
        java.lang.String str2 = this.feedbackAction;
        return bar.x(ro0.f.E("FeedbackPatternData(feedbackType=", str, ", feedbackAction=", str2, ", messagePattern="), this.messagePattern, ", llmPatternId=", this.llmPatternId, ")");
    }

    public FeedbackPatternData(@org.jetbrains.annotations.NotNull java.lang.String str, @org.jetbrains.annotations.NotNull java.lang.String str2, @org.jetbrains.annotations.Nullable java.lang.String str3, @org.jetbrains.annotations.Nullable java.lang.String str4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "feedbackType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "feedbackAction");
        this.feedbackType = str;
        this.feedbackAction = str2;
        this.messagePattern = str3;
        this.llmPatternId = str4;
    }

    public /* synthetic */ FeedbackPatternData(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }
}
