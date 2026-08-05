package com.truecaller.detailsview.api.analytics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"com/truecaller/detailsview/api/analytics/DetailsViewStateEventProperty$ActionButtonType", "", "Lcom/truecaller/detailsview/api/analytics/DetailsViewStateEventProperty$ActionButtonType;", "<init>", "(Ljava/lang/String;I)V", "CALL", "MESSAGE", "SAVE", "EDIT", "UNBLOCK", "BLOCK", "NOT_SPAM", "PAY", "WHATS_APP", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class DetailsViewStateEventProperty$ActionButtonType {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.detailsview.api.analytics.DetailsViewStateEventProperty$ActionButtonType[] $VALUES;
    public static final com.truecaller.detailsview.api.analytics.DetailsViewStateEventProperty$ActionButtonType CALL = new com.truecaller.detailsview.api.analytics.DetailsViewStateEventProperty$ActionButtonType("CALL", 0);
    public static final com.truecaller.detailsview.api.analytics.DetailsViewStateEventProperty$ActionButtonType MESSAGE = new com.truecaller.detailsview.api.analytics.DetailsViewStateEventProperty$ActionButtonType("MESSAGE", 1);
    public static final com.truecaller.detailsview.api.analytics.DetailsViewStateEventProperty$ActionButtonType SAVE = new com.truecaller.detailsview.api.analytics.DetailsViewStateEventProperty$ActionButtonType("SAVE", 2);
    public static final com.truecaller.detailsview.api.analytics.DetailsViewStateEventProperty$ActionButtonType EDIT = new com.truecaller.detailsview.api.analytics.DetailsViewStateEventProperty$ActionButtonType("EDIT", 3);
    public static final com.truecaller.detailsview.api.analytics.DetailsViewStateEventProperty$ActionButtonType UNBLOCK = new com.truecaller.detailsview.api.analytics.DetailsViewStateEventProperty$ActionButtonType("UNBLOCK", 4);
    public static final com.truecaller.detailsview.api.analytics.DetailsViewStateEventProperty$ActionButtonType BLOCK = new com.truecaller.detailsview.api.analytics.DetailsViewStateEventProperty$ActionButtonType("BLOCK", 5);
    public static final com.truecaller.detailsview.api.analytics.DetailsViewStateEventProperty$ActionButtonType NOT_SPAM = new com.truecaller.detailsview.api.analytics.DetailsViewStateEventProperty$ActionButtonType("NOT_SPAM", 6);
    public static final com.truecaller.detailsview.api.analytics.DetailsViewStateEventProperty$ActionButtonType PAY = new com.truecaller.detailsview.api.analytics.DetailsViewStateEventProperty$ActionButtonType("PAY", 7);
    public static final com.truecaller.detailsview.api.analytics.DetailsViewStateEventProperty$ActionButtonType WHATS_APP = new com.truecaller.detailsview.api.analytics.DetailsViewStateEventProperty$ActionButtonType("WHATS_APP", 8);

    private static final /* synthetic */ com.truecaller.detailsview.api.analytics.DetailsViewStateEventProperty$ActionButtonType[] $values() {
        return new com.truecaller.detailsview.api.analytics.DetailsViewStateEventProperty$ActionButtonType[]{CALL, MESSAGE, SAVE, EDIT, UNBLOCK, BLOCK, NOT_SPAM, PAY, WHATS_APP};
    }

    static {
        com.truecaller.detailsview.api.analytics.DetailsViewStateEventProperty$ActionButtonType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private DetailsViewStateEventProperty$ActionButtonType(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.detailsview.api.analytics.DetailsViewStateEventProperty$ActionButtonType valueOf(java.lang.String str) {
        return (com.truecaller.detailsview.api.analytics.DetailsViewStateEventProperty$ActionButtonType) java.lang.Enum.valueOf(com.truecaller.detailsview.api.analytics.DetailsViewStateEventProperty$ActionButtonType.class, str);
    }

    public static com.truecaller.detailsview.api.analytics.DetailsViewStateEventProperty$ActionButtonType[] values() {
        return (com.truecaller.detailsview.api.analytics.DetailsViewStateEventProperty$ActionButtonType[]) $VALUES.clone();
    }
}
