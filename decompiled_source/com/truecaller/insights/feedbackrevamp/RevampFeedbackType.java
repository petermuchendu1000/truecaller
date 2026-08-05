package com.truecaller.insights.feedbackrevamp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0010\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lcom/truecaller/insights/feedbackrevamp/RevampFeedbackType;", "", "<init>", "(Ljava/lang/String;I)V", "NOT_SPAM_TO_SPAM", "SPAM_TO_NOT_SPAM", "NOT_PROMOTION_TO_PROMOTION", "PROMOTION_TO_NOT_PROMOTION", "SPAM_TO_SPAM", "NOT_SPAM_TO_NOT_SPAM", "PROMOTION_TO_PROMOTION", "NOT_PROMOTION_TO_NOT_PROMOTION", "SEND_FEEDBACK", "BUSINESS_IM_NOTIFICATION_SPAM", "FRAUD", "DISMISS_FEEDBACK", "CATEGORY_MODEL_FEEDBACK", "core_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class RevampFeedbackType {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.insights.feedbackrevamp.RevampFeedbackType[] $VALUES;
    public static final com.truecaller.insights.feedbackrevamp.RevampFeedbackType NOT_SPAM_TO_SPAM = new com.truecaller.insights.feedbackrevamp.RevampFeedbackType("NOT_SPAM_TO_SPAM", 0);
    public static final com.truecaller.insights.feedbackrevamp.RevampFeedbackType SPAM_TO_NOT_SPAM = new com.truecaller.insights.feedbackrevamp.RevampFeedbackType("SPAM_TO_NOT_SPAM", 1);
    public static final com.truecaller.insights.feedbackrevamp.RevampFeedbackType NOT_PROMOTION_TO_PROMOTION = new com.truecaller.insights.feedbackrevamp.RevampFeedbackType("NOT_PROMOTION_TO_PROMOTION", 2);
    public static final com.truecaller.insights.feedbackrevamp.RevampFeedbackType PROMOTION_TO_NOT_PROMOTION = new com.truecaller.insights.feedbackrevamp.RevampFeedbackType("PROMOTION_TO_NOT_PROMOTION", 3);
    public static final com.truecaller.insights.feedbackrevamp.RevampFeedbackType SPAM_TO_SPAM = new com.truecaller.insights.feedbackrevamp.RevampFeedbackType("SPAM_TO_SPAM", 4);
    public static final com.truecaller.insights.feedbackrevamp.RevampFeedbackType NOT_SPAM_TO_NOT_SPAM = new com.truecaller.insights.feedbackrevamp.RevampFeedbackType("NOT_SPAM_TO_NOT_SPAM", 5);
    public static final com.truecaller.insights.feedbackrevamp.RevampFeedbackType PROMOTION_TO_PROMOTION = new com.truecaller.insights.feedbackrevamp.RevampFeedbackType("PROMOTION_TO_PROMOTION", 6);
    public static final com.truecaller.insights.feedbackrevamp.RevampFeedbackType NOT_PROMOTION_TO_NOT_PROMOTION = new com.truecaller.insights.feedbackrevamp.RevampFeedbackType("NOT_PROMOTION_TO_NOT_PROMOTION", 7);
    public static final com.truecaller.insights.feedbackrevamp.RevampFeedbackType SEND_FEEDBACK = new com.truecaller.insights.feedbackrevamp.RevampFeedbackType("SEND_FEEDBACK", 8);
    public static final com.truecaller.insights.feedbackrevamp.RevampFeedbackType BUSINESS_IM_NOTIFICATION_SPAM = new com.truecaller.insights.feedbackrevamp.RevampFeedbackType("BUSINESS_IM_NOTIFICATION_SPAM", 9);
    public static final com.truecaller.insights.feedbackrevamp.RevampFeedbackType FRAUD = new com.truecaller.insights.feedbackrevamp.RevampFeedbackType("FRAUD", 10);
    public static final com.truecaller.insights.feedbackrevamp.RevampFeedbackType DISMISS_FEEDBACK = new com.truecaller.insights.feedbackrevamp.RevampFeedbackType("DISMISS_FEEDBACK", 11);
    public static final com.truecaller.insights.feedbackrevamp.RevampFeedbackType CATEGORY_MODEL_FEEDBACK = new com.truecaller.insights.feedbackrevamp.RevampFeedbackType("CATEGORY_MODEL_FEEDBACK", 12);

    private static final /* synthetic */ com.truecaller.insights.feedbackrevamp.RevampFeedbackType[] $values() {
        return new com.truecaller.insights.feedbackrevamp.RevampFeedbackType[]{NOT_SPAM_TO_SPAM, SPAM_TO_NOT_SPAM, NOT_PROMOTION_TO_PROMOTION, PROMOTION_TO_NOT_PROMOTION, SPAM_TO_SPAM, NOT_SPAM_TO_NOT_SPAM, PROMOTION_TO_PROMOTION, NOT_PROMOTION_TO_NOT_PROMOTION, SEND_FEEDBACK, BUSINESS_IM_NOTIFICATION_SPAM, FRAUD, DISMISS_FEEDBACK, CATEGORY_MODEL_FEEDBACK};
    }

    static {
        com.truecaller.insights.feedbackrevamp.RevampFeedbackType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private RevampFeedbackType(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.insights.feedbackrevamp.RevampFeedbackType valueOf(java.lang.String str) {
        return (com.truecaller.insights.feedbackrevamp.RevampFeedbackType) java.lang.Enum.valueOf(com.truecaller.insights.feedbackrevamp.RevampFeedbackType.class, str);
    }

    public static com.truecaller.insights.feedbackrevamp.RevampFeedbackType[] values() {
        return (com.truecaller.insights.feedbackrevamp.RevampFeedbackType[]) $VALUES.clone();
    }
}
