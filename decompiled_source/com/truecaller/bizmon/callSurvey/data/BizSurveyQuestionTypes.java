package com.truecaller.bizmon.callSurvey.data;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/truecaller/bizmon/callSurvey/data/BizSurveyQuestionTypes;", "", com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.TYPE_COLUMN, "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getType", "()Ljava/lang/String;", "SINGLE_ANSWER", "SINGLE_ANSWER_LIST", "RATING", "FREE_TEXT", "INVALID_TYPE", "bizmon_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class BizSurveyQuestionTypes {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.bizmon.callSurvey.data.BizSurveyQuestionTypes[] $VALUES;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String type;
    public static final com.truecaller.bizmon.callSurvey.data.BizSurveyQuestionTypes SINGLE_ANSWER = new com.truecaller.bizmon.callSurvey.data.BizSurveyQuestionTypes("SINGLE_ANSWER", 0, "SingleAnswer");
    public static final com.truecaller.bizmon.callSurvey.data.BizSurveyQuestionTypes SINGLE_ANSWER_LIST = new com.truecaller.bizmon.callSurvey.data.BizSurveyQuestionTypes("SINGLE_ANSWER_LIST", 1, "SingleAnswerList");
    public static final com.truecaller.bizmon.callSurvey.data.BizSurveyQuestionTypes RATING = new com.truecaller.bizmon.callSurvey.data.BizSurveyQuestionTypes("RATING", 2, "Rating");
    public static final com.truecaller.bizmon.callSurvey.data.BizSurveyQuestionTypes FREE_TEXT = new com.truecaller.bizmon.callSurvey.data.BizSurveyQuestionTypes("FREE_TEXT", 3, "FreeText");
    public static final com.truecaller.bizmon.callSurvey.data.BizSurveyQuestionTypes INVALID_TYPE = new com.truecaller.bizmon.callSurvey.data.BizSurveyQuestionTypes("INVALID_TYPE", 4, "InvalidType");

    private static final /* synthetic */ com.truecaller.bizmon.callSurvey.data.BizSurveyQuestionTypes[] $values() {
        return new com.truecaller.bizmon.callSurvey.data.BizSurveyQuestionTypes[]{SINGLE_ANSWER, SINGLE_ANSWER_LIST, RATING, FREE_TEXT, INVALID_TYPE};
    }

    static {
        com.truecaller.bizmon.callSurvey.data.BizSurveyQuestionTypes[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private BizSurveyQuestionTypes(java.lang.String str, int i, java.lang.String str2) {
        this.type = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.bizmon.callSurvey.data.BizSurveyQuestionTypes valueOf(java.lang.String str) {
        return (com.truecaller.bizmon.callSurvey.data.BizSurveyQuestionTypes) java.lang.Enum.valueOf(com.truecaller.bizmon.callSurvey.data.BizSurveyQuestionTypes.class, str);
    }

    public static com.truecaller.bizmon.callSurvey.data.BizSurveyQuestionTypes[] values() {
        return (com.truecaller.bizmon.callSurvey.data.BizSurveyQuestionTypes[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getType() {
        return this.type;
    }
}
