package com.truecaller.bizmon.callSurvey.analytic;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/truecaller/bizmon/callSurvey/analytic/BizCallSurveyAction;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "AUTO", "SHOWN", "ACTION_CLICKED", "DISMISSED", "NO_ACTION", "CLOSE", "RESPONSE_GENERATED", "SCROLL", "bizmon_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class BizCallSurveyAction {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.bizmon.callSurvey.analytic.BizCallSurveyAction[] $VALUES;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String value;
    public static final com.truecaller.bizmon.callSurvey.analytic.BizCallSurveyAction AUTO = new com.truecaller.bizmon.callSurvey.analytic.BizCallSurveyAction("AUTO", 0, "autoOpen");
    public static final com.truecaller.bizmon.callSurvey.analytic.BizCallSurveyAction SHOWN = new com.truecaller.bizmon.callSurvey.analytic.BizCallSurveyAction("SHOWN", 1, "shown");
    public static final com.truecaller.bizmon.callSurvey.analytic.BizCallSurveyAction ACTION_CLICKED = new com.truecaller.bizmon.callSurvey.analytic.BizCallSurveyAction("ACTION_CLICKED", 2, "clicked");
    public static final com.truecaller.bizmon.callSurvey.analytic.BizCallSurveyAction DISMISSED = new com.truecaller.bizmon.callSurvey.analytic.BizCallSurveyAction("DISMISSED", 3, "dismissed");
    public static final com.truecaller.bizmon.callSurvey.analytic.BizCallSurveyAction NO_ACTION = new com.truecaller.bizmon.callSurvey.analytic.BizCallSurveyAction("NO_ACTION", 4, "noAction");
    public static final com.truecaller.bizmon.callSurvey.analytic.BizCallSurveyAction CLOSE = new com.truecaller.bizmon.callSurvey.analytic.BizCallSurveyAction("CLOSE", 5, "close");
    public static final com.truecaller.bizmon.callSurvey.analytic.BizCallSurveyAction RESPONSE_GENERATED = new com.truecaller.bizmon.callSurvey.analytic.BizCallSurveyAction("RESPONSE_GENERATED", 6, "responseGenerated");
    public static final com.truecaller.bizmon.callSurvey.analytic.BizCallSurveyAction SCROLL = new com.truecaller.bizmon.callSurvey.analytic.BizCallSurveyAction("SCROLL", 7, "scroll");

    private static final /* synthetic */ com.truecaller.bizmon.callSurvey.analytic.BizCallSurveyAction[] $values() {
        return new com.truecaller.bizmon.callSurvey.analytic.BizCallSurveyAction[]{AUTO, SHOWN, ACTION_CLICKED, DISMISSED, NO_ACTION, CLOSE, RESPONSE_GENERATED, SCROLL};
    }

    static {
        com.truecaller.bizmon.callSurvey.analytic.BizCallSurveyAction[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private BizCallSurveyAction(java.lang.String str, int i, java.lang.String str2) {
        this.value = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.bizmon.callSurvey.analytic.BizCallSurveyAction valueOf(java.lang.String str) {
        return (com.truecaller.bizmon.callSurvey.analytic.BizCallSurveyAction) java.lang.Enum.valueOf(com.truecaller.bizmon.callSurvey.analytic.BizCallSurveyAction.class, str);
    }

    public static com.truecaller.bizmon.callSurvey.analytic.BizCallSurveyAction[] values() {
        return (com.truecaller.bizmon.callSurvey.analytic.BizCallSurveyAction[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getValue() {
        return this.value;
    }
}
