package com.truecaller.insights.models.feedback;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/truecaller/insights/models/feedback/InsightsFeedbackType;", "", "<init>", "(Ljava/lang/String;I)V", "CATEGORY_MODEL_FEEDBACK", "FRAUD_FEEDBACK", "FRAUD_URL_FEEDBACK", "SPAM_FEEDBACK", "NEW_SENDER_SPAM_FEEDBACK", "SPAMMER_FEEDBACK", "LLM_L1_FEEDBACK", "LLM_L2_FEEDBACK", "LLM_L3_FEEDBACK", "NO_FEEDBACK", "models_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class InsightsFeedbackType {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.insights.models.feedback.InsightsFeedbackType[] $VALUES;
    public static final com.truecaller.insights.models.feedback.InsightsFeedbackType CATEGORY_MODEL_FEEDBACK = new com.truecaller.insights.models.feedback.InsightsFeedbackType("CATEGORY_MODEL_FEEDBACK", 0);
    public static final com.truecaller.insights.models.feedback.InsightsFeedbackType FRAUD_FEEDBACK = new com.truecaller.insights.models.feedback.InsightsFeedbackType("FRAUD_FEEDBACK", 1);
    public static final com.truecaller.insights.models.feedback.InsightsFeedbackType FRAUD_URL_FEEDBACK = new com.truecaller.insights.models.feedback.InsightsFeedbackType("FRAUD_URL_FEEDBACK", 2);
    public static final com.truecaller.insights.models.feedback.InsightsFeedbackType SPAM_FEEDBACK = new com.truecaller.insights.models.feedback.InsightsFeedbackType("SPAM_FEEDBACK", 3);
    public static final com.truecaller.insights.models.feedback.InsightsFeedbackType NEW_SENDER_SPAM_FEEDBACK = new com.truecaller.insights.models.feedback.InsightsFeedbackType("NEW_SENDER_SPAM_FEEDBACK", 4);
    public static final com.truecaller.insights.models.feedback.InsightsFeedbackType SPAMMER_FEEDBACK = new com.truecaller.insights.models.feedback.InsightsFeedbackType("SPAMMER_FEEDBACK", 5);
    public static final com.truecaller.insights.models.feedback.InsightsFeedbackType LLM_L1_FEEDBACK = new com.truecaller.insights.models.feedback.InsightsFeedbackType("LLM_L1_FEEDBACK", 6);
    public static final com.truecaller.insights.models.feedback.InsightsFeedbackType LLM_L2_FEEDBACK = new com.truecaller.insights.models.feedback.InsightsFeedbackType("LLM_L2_FEEDBACK", 7);
    public static final com.truecaller.insights.models.feedback.InsightsFeedbackType LLM_L3_FEEDBACK = new com.truecaller.insights.models.feedback.InsightsFeedbackType("LLM_L3_FEEDBACK", 8);
    public static final com.truecaller.insights.models.feedback.InsightsFeedbackType NO_FEEDBACK = new com.truecaller.insights.models.feedback.InsightsFeedbackType("NO_FEEDBACK", 9);

    private static final /* synthetic */ com.truecaller.insights.models.feedback.InsightsFeedbackType[] $values() {
        return new com.truecaller.insights.models.feedback.InsightsFeedbackType[]{CATEGORY_MODEL_FEEDBACK, FRAUD_FEEDBACK, FRAUD_URL_FEEDBACK, SPAM_FEEDBACK, NEW_SENDER_SPAM_FEEDBACK, SPAMMER_FEEDBACK, LLM_L1_FEEDBACK, LLM_L2_FEEDBACK, LLM_L3_FEEDBACK, NO_FEEDBACK};
    }

    static {
        com.truecaller.insights.models.feedback.InsightsFeedbackType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private InsightsFeedbackType(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.insights.models.feedback.InsightsFeedbackType valueOf(java.lang.String str) {
        return (com.truecaller.insights.models.feedback.InsightsFeedbackType) java.lang.Enum.valueOf(com.truecaller.insights.models.feedback.InsightsFeedbackType.class, str);
    }

    public static com.truecaller.insights.models.feedback.InsightsFeedbackType[] values() {
        return (com.truecaller.insights.models.feedback.InsightsFeedbackType[]) $VALUES.clone();
    }
}
