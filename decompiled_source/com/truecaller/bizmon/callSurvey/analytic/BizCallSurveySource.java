package com.truecaller.bizmon.callSurvey.analytic;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/truecaller/bizmon/callSurvey/analytic/BizCallSurveySource;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "FACS_CALL_SURVEY", "PACS_CALL_SURVEY", "FACS_V2_CALL_SURVEY", "PACS_V2_CALL_SURVEY", "NEO_FACS_CALL_SURVEY", "NEO_PACS_CALL_SURVEY", "NEO_FACS_V2_CALL_SURVEY", "NEO_PACS_V2_CALL_SURVEY", "bizmon_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class BizCallSurveySource {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.bizmon.callSurvey.analytic.BizCallSurveySource[] $VALUES;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String value;
    public static final com.truecaller.bizmon.callSurvey.analytic.BizCallSurveySource FACS_CALL_SURVEY = new com.truecaller.bizmon.callSurvey.analytic.BizCallSurveySource("FACS_CALL_SURVEY", 0, "Facs");
    public static final com.truecaller.bizmon.callSurvey.analytic.BizCallSurveySource PACS_CALL_SURVEY = new com.truecaller.bizmon.callSurvey.analytic.BizCallSurveySource("PACS_CALL_SURVEY", 1, "Pacs");
    public static final com.truecaller.bizmon.callSurvey.analytic.BizCallSurveySource FACS_V2_CALL_SURVEY = new com.truecaller.bizmon.callSurvey.analytic.BizCallSurveySource("FACS_V2_CALL_SURVEY", 2, "FacsV2");
    public static final com.truecaller.bizmon.callSurvey.analytic.BizCallSurveySource PACS_V2_CALL_SURVEY = new com.truecaller.bizmon.callSurvey.analytic.BizCallSurveySource("PACS_V2_CALL_SURVEY", 3, "PacsV2");
    public static final com.truecaller.bizmon.callSurvey.analytic.BizCallSurveySource NEO_FACS_CALL_SURVEY = new com.truecaller.bizmon.callSurvey.analytic.BizCallSurveySource("NEO_FACS_CALL_SURVEY", 4, "NeoFacs");
    public static final com.truecaller.bizmon.callSurvey.analytic.BizCallSurveySource NEO_PACS_CALL_SURVEY = new com.truecaller.bizmon.callSurvey.analytic.BizCallSurveySource("NEO_PACS_CALL_SURVEY", 5, "NeoPacs");
    public static final com.truecaller.bizmon.callSurvey.analytic.BizCallSurveySource NEO_FACS_V2_CALL_SURVEY = new com.truecaller.bizmon.callSurvey.analytic.BizCallSurveySource("NEO_FACS_V2_CALL_SURVEY", 6, "NeoFacsV2");
    public static final com.truecaller.bizmon.callSurvey.analytic.BizCallSurveySource NEO_PACS_V2_CALL_SURVEY = new com.truecaller.bizmon.callSurvey.analytic.BizCallSurveySource("NEO_PACS_V2_CALL_SURVEY", 7, "NeoPacsV2");

    private static final /* synthetic */ com.truecaller.bizmon.callSurvey.analytic.BizCallSurveySource[] $values() {
        return new com.truecaller.bizmon.callSurvey.analytic.BizCallSurveySource[]{FACS_CALL_SURVEY, PACS_CALL_SURVEY, FACS_V2_CALL_SURVEY, PACS_V2_CALL_SURVEY, NEO_FACS_CALL_SURVEY, NEO_PACS_CALL_SURVEY, NEO_FACS_V2_CALL_SURVEY, NEO_PACS_V2_CALL_SURVEY};
    }

    static {
        com.truecaller.bizmon.callSurvey.analytic.BizCallSurveySource[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private BizCallSurveySource(java.lang.String str, int i, java.lang.String str2) {
        this.value = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.bizmon.callSurvey.analytic.BizCallSurveySource valueOf(java.lang.String str) {
        return (com.truecaller.bizmon.callSurvey.analytic.BizCallSurveySource) java.lang.Enum.valueOf(com.truecaller.bizmon.callSurvey.analytic.BizCallSurveySource.class, str);
    }

    public static com.truecaller.bizmon.callSurvey.analytic.BizCallSurveySource[] values() {
        return (com.truecaller.bizmon.callSurvey.analytic.BizCallSurveySource[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getValue() {
        return this.value;
    }
}
