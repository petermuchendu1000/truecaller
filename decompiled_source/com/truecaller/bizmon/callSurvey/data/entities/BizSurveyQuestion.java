package com.truecaller.bizmon.callSurvey.data.entities;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u000bHÆ\u0003JI\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020\u0003HÖ\u0001J\t\u0010%\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006&"}, d2 = {"Lcom/truecaller/bizmon/callSurvey/data/entities/BizSurveyQuestion;", "", com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.ID_COLUMN, "", "headerMessage", "", com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.TYPE_COLUMN, "choices", "", "Lcom/truecaller/bizmon/callSurvey/data/entities/BizSurveyChoice;", "freeText", "Lcom/truecaller/bizmon/callSurvey/data/entities/BizFreeText;", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/truecaller/bizmon/callSurvey/data/entities/BizFreeText;)V", "getId", "()I", "getHeaderMessage", "()Ljava/lang/String;", "getType", "getChoices", "()Ljava/util/List;", "setChoices", "(Ljava/util/List;)V", "getFreeText", "()Lcom/truecaller/bizmon/callSurvey/data/entities/BizFreeText;", "setFreeText", "(Lcom/truecaller/bizmon/callSurvey/data/entities/BizFreeText;)V", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "bizmon_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class BizSurveyQuestion {
    public static final int $stable = 8;

    @org.jetbrains.annotations.Nullable
    private java.util.List<com.truecaller.bizmon.callSurvey.data.entities.BizSurveyChoice> choices;

    @org.jetbrains.annotations.Nullable
    private com.truecaller.bizmon.callSurvey.data.entities.BizFreeText freeText;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String headerMessage;
    private final int id;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String type;

    public BizSurveyQuestion(int i, @org.jetbrains.annotations.Nullable java.lang.String str, @org.jetbrains.annotations.Nullable java.lang.String str2, @org.jetbrains.annotations.Nullable java.util.List<com.truecaller.bizmon.callSurvey.data.entities.BizSurveyChoice> list, @org.jetbrains.annotations.Nullable com.truecaller.bizmon.callSurvey.data.entities.BizFreeText bizFreeText) {
        this.id = i;
        this.headerMessage = str;
        this.type = str2;
        this.choices = list;
        this.freeText = bizFreeText;
    }

    public static /* synthetic */ com.truecaller.bizmon.callSurvey.data.entities.BizSurveyQuestion copy$default(com.truecaller.bizmon.callSurvey.data.entities.BizSurveyQuestion bizSurveyQuestion, int i, java.lang.String str, java.lang.String str2, java.util.List list, com.truecaller.bizmon.callSurvey.data.entities.BizFreeText bizFreeText, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = bizSurveyQuestion.id;
        }
        if ((i2 & 2) != 0) {
            str = bizSurveyQuestion.headerMessage;
        }
        if ((i2 & 4) != 0) {
            str2 = bizSurveyQuestion.type;
        }
        if ((i2 & 8) != 0) {
            list = bizSurveyQuestion.choices;
        }
        if ((i2 & 16) != 0) {
            bizFreeText = bizSurveyQuestion.freeText;
        }
        com.truecaller.bizmon.callSurvey.data.entities.BizFreeText bizFreeText2 = bizFreeText;
        java.lang.String str3 = str2;
        return bizSurveyQuestion.copy(i, str, str3, list, bizFreeText2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component2, reason: from getter */
    public final java.lang.String getHeaderMessage() {
        return this.headerMessage;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component3, reason: from getter */
    public final java.lang.String getType() {
        return this.type;
    }

    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.truecaller.bizmon.callSurvey.data.entities.BizSurveyChoice> component4() {
        return this.choices;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component5, reason: from getter */
    public final com.truecaller.bizmon.callSurvey.data.entities.BizFreeText getFreeText() {
        return this.freeText;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.bizmon.callSurvey.data.entities.BizSurveyQuestion copy(int id, @org.jetbrains.annotations.Nullable java.lang.String headerMessage, @org.jetbrains.annotations.Nullable java.lang.String type, @org.jetbrains.annotations.Nullable java.util.List<com.truecaller.bizmon.callSurvey.data.entities.BizSurveyChoice> choices, @org.jetbrains.annotations.Nullable com.truecaller.bizmon.callSurvey.data.entities.BizFreeText freeText) {
        return new com.truecaller.bizmon.callSurvey.data.entities.BizSurveyQuestion(id, headerMessage, type, choices, freeText);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.bizmon.callSurvey.data.entities.BizSurveyQuestion)) {
            return false;
        }
        com.truecaller.bizmon.callSurvey.data.entities.BizSurveyQuestion bizSurveyQuestion = (com.truecaller.bizmon.callSurvey.data.entities.BizSurveyQuestion) other;
        return this.id == bizSurveyQuestion.id && kotlin.jvm.internal.Intrinsics.b(this.headerMessage, bizSurveyQuestion.headerMessage) && kotlin.jvm.internal.Intrinsics.b(this.type, bizSurveyQuestion.type) && kotlin.jvm.internal.Intrinsics.b(this.choices, bizSurveyQuestion.choices) && kotlin.jvm.internal.Intrinsics.b(this.freeText, bizSurveyQuestion.freeText);
    }

    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.truecaller.bizmon.callSurvey.data.entities.BizSurveyChoice> getChoices() {
        return this.choices;
    }

    @org.jetbrains.annotations.Nullable
    public final com.truecaller.bizmon.callSurvey.data.entities.BizFreeText getFreeText() {
        return this.freeText;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getHeaderMessage() {
        return this.headerMessage;
    }

    public final int getId() {
        return this.id;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getType() {
        return this.type;
    }

    public int hashCode() {
        int i = this.id * 31;
        java.lang.String str = this.headerMessage;
        int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.type;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.util.List<com.truecaller.bizmon.callSurvey.data.entities.BizSurveyChoice> list = this.choices;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        com.truecaller.bizmon.callSurvey.data.entities.BizFreeText bizFreeText = this.freeText;
        return hashCode3 + (bizFreeText != null ? bizFreeText.hashCode() : 0);
    }

    public final void setChoices(@org.jetbrains.annotations.Nullable java.util.List<com.truecaller.bizmon.callSurvey.data.entities.BizSurveyChoice> list) {
        this.choices = list;
    }

    public final void setFreeText(@org.jetbrains.annotations.Nullable com.truecaller.bizmon.callSurvey.data.entities.BizFreeText bizFreeText) {
        this.freeText = bizFreeText;
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        int i = this.id;
        java.lang.String str = this.headerMessage;
        java.lang.String str2 = this.type;
        java.util.List<com.truecaller.bizmon.callSurvey.data.entities.BizSurveyChoice> list = this.choices;
        com.truecaller.bizmon.callSurvey.data.entities.BizFreeText bizFreeText = this.freeText;
        java.lang.StringBuilder r = qb.qux.r("BizSurveyQuestion(id=", i, ", headerMessage=", str, ", type=");
        f63.qux.w(str2, ", choices=", ", freeText=", r, list);
        r.append(bizFreeText);
        r.append(")");
        return r.toString();
    }

    public /* synthetic */ BizSurveyQuestion(int i, java.lang.String str, java.lang.String str2, java.util.List list, com.truecaller.bizmon.callSurvey.data.entities.BizFreeText bizFreeText, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, str2, (i2 & 8) != 0 ? null : list, (i2 & 16) != 0 ? null : bizFreeText);
    }
}
