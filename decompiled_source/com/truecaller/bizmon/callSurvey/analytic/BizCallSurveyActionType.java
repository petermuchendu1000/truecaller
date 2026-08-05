package com.truecaller.bizmon.callSurvey.analytic;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/truecaller/bizmon/callSurvey/analytic/BizCallSurveyActionType;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "LETS_START", "CONTINUE", "SURVEY_CARD", "bizmon_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class BizCallSurveyActionType {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.bizmon.callSurvey.analytic.BizCallSurveyActionType[] $VALUES;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String value;
    public static final com.truecaller.bizmon.callSurvey.analytic.BizCallSurveyActionType LETS_START = new com.truecaller.bizmon.callSurvey.analytic.BizCallSurveyActionType("LETS_START", 0, "letsStart");
    public static final com.truecaller.bizmon.callSurvey.analytic.BizCallSurveyActionType CONTINUE = new com.truecaller.bizmon.callSurvey.analytic.BizCallSurveyActionType("CONTINUE", 1, "continue");
    public static final com.truecaller.bizmon.callSurvey.analytic.BizCallSurveyActionType SURVEY_CARD = new com.truecaller.bizmon.callSurvey.analytic.BizCallSurveyActionType("SURVEY_CARD", 2, "surveyCard");

    private static final /* synthetic */ com.truecaller.bizmon.callSurvey.analytic.BizCallSurveyActionType[] $values() {
        return new com.truecaller.bizmon.callSurvey.analytic.BizCallSurveyActionType[]{LETS_START, CONTINUE, SURVEY_CARD};
    }

    static {
        com.truecaller.bizmon.callSurvey.analytic.BizCallSurveyActionType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private BizCallSurveyActionType(java.lang.String str, int i, java.lang.String str2) {
        this.value = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.bizmon.callSurvey.analytic.BizCallSurveyActionType valueOf(java.lang.String str) {
        return (com.truecaller.bizmon.callSurvey.analytic.BizCallSurveyActionType) java.lang.Enum.valueOf(com.truecaller.bizmon.callSurvey.analytic.BizCallSurveyActionType.class, str);
    }

    public static com.truecaller.bizmon.callSurvey.analytic.BizCallSurveyActionType[] values() {
        return (com.truecaller.bizmon.callSurvey.analytic.BizCallSurveyActionType[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getValue() {
        return this.value;
    }
}
