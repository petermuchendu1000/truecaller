package com.truecaller.detailsview.api.analytics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"com/truecaller/detailsview/api/analytics/DetailsViewStateEventProperty$FeedbackButtonType", "", "Lcom/truecaller/detailsview/api/analytics/DetailsViewStateEventProperty$FeedbackButtonType;", "<init>", "(Ljava/lang/String;I)V", "FEEDBACK_SUGGEST", "FEEDBACK_COMMENT", "FEEDBACK_REPORT", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class DetailsViewStateEventProperty$FeedbackButtonType {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.detailsview.api.analytics.DetailsViewStateEventProperty$FeedbackButtonType[] $VALUES;
    public static final com.truecaller.detailsview.api.analytics.DetailsViewStateEventProperty$FeedbackButtonType FEEDBACK_SUGGEST = new com.truecaller.detailsview.api.analytics.DetailsViewStateEventProperty$FeedbackButtonType("FEEDBACK_SUGGEST", 0);
    public static final com.truecaller.detailsview.api.analytics.DetailsViewStateEventProperty$FeedbackButtonType FEEDBACK_COMMENT = new com.truecaller.detailsview.api.analytics.DetailsViewStateEventProperty$FeedbackButtonType("FEEDBACK_COMMENT", 1);
    public static final com.truecaller.detailsview.api.analytics.DetailsViewStateEventProperty$FeedbackButtonType FEEDBACK_REPORT = new com.truecaller.detailsview.api.analytics.DetailsViewStateEventProperty$FeedbackButtonType("FEEDBACK_REPORT", 2);

    private static final /* synthetic */ com.truecaller.detailsview.api.analytics.DetailsViewStateEventProperty$FeedbackButtonType[] $values() {
        return new com.truecaller.detailsview.api.analytics.DetailsViewStateEventProperty$FeedbackButtonType[]{FEEDBACK_SUGGEST, FEEDBACK_COMMENT, FEEDBACK_REPORT};
    }

    static {
        com.truecaller.detailsview.api.analytics.DetailsViewStateEventProperty$FeedbackButtonType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private DetailsViewStateEventProperty$FeedbackButtonType(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.detailsview.api.analytics.DetailsViewStateEventProperty$FeedbackButtonType valueOf(java.lang.String str) {
        return (com.truecaller.detailsview.api.analytics.DetailsViewStateEventProperty$FeedbackButtonType) java.lang.Enum.valueOf(com.truecaller.detailsview.api.analytics.DetailsViewStateEventProperty$FeedbackButtonType.class, str);
    }

    public static com.truecaller.detailsview.api.analytics.DetailsViewStateEventProperty$FeedbackButtonType[] values() {
        return (com.truecaller.detailsview.api.analytics.DetailsViewStateEventProperty$FeedbackButtonType[]) $VALUES.clone();
    }
}
