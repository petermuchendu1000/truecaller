package com.truecaller.insights.feedbackrevamp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/truecaller/insights/feedbackrevamp/FeedbackOptionType;", "", "<init>", "(Ljava/lang/String;I)V", "INCORRECT_INFORMATION", "USEFUL_INFORMATION", "IS_PROMOTIONAL", "IS_SPAM", "core_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class FeedbackOptionType {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.insights.feedbackrevamp.FeedbackOptionType[] $VALUES;
    public static final com.truecaller.insights.feedbackrevamp.FeedbackOptionType INCORRECT_INFORMATION = new com.truecaller.insights.feedbackrevamp.FeedbackOptionType("INCORRECT_INFORMATION", 0);
    public static final com.truecaller.insights.feedbackrevamp.FeedbackOptionType USEFUL_INFORMATION = new com.truecaller.insights.feedbackrevamp.FeedbackOptionType("USEFUL_INFORMATION", 1);
    public static final com.truecaller.insights.feedbackrevamp.FeedbackOptionType IS_PROMOTIONAL = new com.truecaller.insights.feedbackrevamp.FeedbackOptionType("IS_PROMOTIONAL", 2);
    public static final com.truecaller.insights.feedbackrevamp.FeedbackOptionType IS_SPAM = new com.truecaller.insights.feedbackrevamp.FeedbackOptionType("IS_SPAM", 3);

    private static final /* synthetic */ com.truecaller.insights.feedbackrevamp.FeedbackOptionType[] $values() {
        return new com.truecaller.insights.feedbackrevamp.FeedbackOptionType[]{INCORRECT_INFORMATION, USEFUL_INFORMATION, IS_PROMOTIONAL, IS_SPAM};
    }

    static {
        com.truecaller.insights.feedbackrevamp.FeedbackOptionType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private FeedbackOptionType(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.insights.feedbackrevamp.FeedbackOptionType valueOf(java.lang.String str) {
        return (com.truecaller.insights.feedbackrevamp.FeedbackOptionType) java.lang.Enum.valueOf(com.truecaller.insights.feedbackrevamp.FeedbackOptionType.class, str);
    }

    public static com.truecaller.insights.feedbackrevamp.FeedbackOptionType[] values() {
        return (com.truecaller.insights.feedbackrevamp.FeedbackOptionType[]) $VALUES.clone();
    }
}
