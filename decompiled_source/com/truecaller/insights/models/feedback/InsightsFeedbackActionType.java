package com.truecaller.insights.models.feedback;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/truecaller/insights/models/feedback/InsightsFeedbackActionType;", "", "<init>", "(Ljava/lang/String;I)V", "POSITIVE", "NEGATIVE", "REPORT", "CREATE", "NONE", "models_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class InsightsFeedbackActionType {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.insights.models.feedback.InsightsFeedbackActionType[] $VALUES;
    public static final com.truecaller.insights.models.feedback.InsightsFeedbackActionType POSITIVE = new com.truecaller.insights.models.feedback.InsightsFeedbackActionType("POSITIVE", 0);
    public static final com.truecaller.insights.models.feedback.InsightsFeedbackActionType NEGATIVE = new com.truecaller.insights.models.feedback.InsightsFeedbackActionType("NEGATIVE", 1);
    public static final com.truecaller.insights.models.feedback.InsightsFeedbackActionType REPORT = new com.truecaller.insights.models.feedback.InsightsFeedbackActionType("REPORT", 2);
    public static final com.truecaller.insights.models.feedback.InsightsFeedbackActionType CREATE = new com.truecaller.insights.models.feedback.InsightsFeedbackActionType("CREATE", 3);
    public static final com.truecaller.insights.models.feedback.InsightsFeedbackActionType NONE = new com.truecaller.insights.models.feedback.InsightsFeedbackActionType("NONE", 4);

    private static final /* synthetic */ com.truecaller.insights.models.feedback.InsightsFeedbackActionType[] $values() {
        return new com.truecaller.insights.models.feedback.InsightsFeedbackActionType[]{POSITIVE, NEGATIVE, REPORT, CREATE, NONE};
    }

    static {
        com.truecaller.insights.models.feedback.InsightsFeedbackActionType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private InsightsFeedbackActionType(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.insights.models.feedback.InsightsFeedbackActionType valueOf(java.lang.String str) {
        return (com.truecaller.insights.models.feedback.InsightsFeedbackActionType) java.lang.Enum.valueOf(com.truecaller.insights.models.feedback.InsightsFeedbackActionType.class, str);
    }

    public static com.truecaller.insights.models.feedback.InsightsFeedbackActionType[] values() {
        return (com.truecaller.insights.models.feedback.InsightsFeedbackActionType[]) $VALUES.clone();
    }
}
