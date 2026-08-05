package com.truecaller.analytics.common.event;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016¨\u0006\u0017"}, d2 = {"com/truecaller/analytics/common/event/ViewActionEvent$ContactDetailsAction", "", "Lcom/truecaller/analytics/common/event/ViewActionEvent$ContactDetailsAction;", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "CALL_HISTORY", "UNBLOCK_DIALOG", "NOT_SPAM_DIALOG", "TAG", "COPY", "COPY_NAME", "COPY_NUMBER", "SHARE", "MAP", "EMAIL", "BROWSER", "SWISH", "JOB", "common-analytics_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class ViewActionEvent$ContactDetailsAction {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.analytics.common.event.ViewActionEvent$ContactDetailsAction[] $VALUES;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String value;
    public static final com.truecaller.analytics.common.event.ViewActionEvent$ContactDetailsAction CALL_HISTORY = new com.truecaller.analytics.common.event.ViewActionEvent$ContactDetailsAction("CALL_HISTORY", 0, "callHistory");
    public static final com.truecaller.analytics.common.event.ViewActionEvent$ContactDetailsAction UNBLOCK_DIALOG = new com.truecaller.analytics.common.event.ViewActionEvent$ContactDetailsAction("UNBLOCK_DIALOG", 1, "UnblockDialogConfirm");
    public static final com.truecaller.analytics.common.event.ViewActionEvent$ContactDetailsAction NOT_SPAM_DIALOG = new com.truecaller.analytics.common.event.ViewActionEvent$ContactDetailsAction("NOT_SPAM_DIALOG", 2, "NotSpamDialogConfirm");
    public static final com.truecaller.analytics.common.event.ViewActionEvent$ContactDetailsAction TAG = new com.truecaller.analytics.common.event.ViewActionEvent$ContactDetailsAction("TAG", 3, "tag");
    public static final com.truecaller.analytics.common.event.ViewActionEvent$ContactDetailsAction COPY = new com.truecaller.analytics.common.event.ViewActionEvent$ContactDetailsAction("COPY", 4, "copy");
    public static final com.truecaller.analytics.common.event.ViewActionEvent$ContactDetailsAction COPY_NAME = new com.truecaller.analytics.common.event.ViewActionEvent$ContactDetailsAction("COPY_NAME", 5, "copyName");
    public static final com.truecaller.analytics.common.event.ViewActionEvent$ContactDetailsAction COPY_NUMBER = new com.truecaller.analytics.common.event.ViewActionEvent$ContactDetailsAction("COPY_NUMBER", 6, "copyNumber");
    public static final com.truecaller.analytics.common.event.ViewActionEvent$ContactDetailsAction SHARE = new com.truecaller.analytics.common.event.ViewActionEvent$ContactDetailsAction("SHARE", 7, "share");
    public static final com.truecaller.analytics.common.event.ViewActionEvent$ContactDetailsAction MAP = new com.truecaller.analytics.common.event.ViewActionEvent$ContactDetailsAction("MAP", 8, "map");
    public static final com.truecaller.analytics.common.event.ViewActionEvent$ContactDetailsAction EMAIL = new com.truecaller.analytics.common.event.ViewActionEvent$ContactDetailsAction("EMAIL", 9, "email");
    public static final com.truecaller.analytics.common.event.ViewActionEvent$ContactDetailsAction BROWSER = new com.truecaller.analytics.common.event.ViewActionEvent$ContactDetailsAction("BROWSER", 10, "browser");
    public static final com.truecaller.analytics.common.event.ViewActionEvent$ContactDetailsAction SWISH = new com.truecaller.analytics.common.event.ViewActionEvent$ContactDetailsAction("SWISH", 11, "swish");
    public static final com.truecaller.analytics.common.event.ViewActionEvent$ContactDetailsAction JOB = new com.truecaller.analytics.common.event.ViewActionEvent$ContactDetailsAction("JOB", 12, "job");

    private static final /* synthetic */ com.truecaller.analytics.common.event.ViewActionEvent$ContactDetailsAction[] $values() {
        return new com.truecaller.analytics.common.event.ViewActionEvent$ContactDetailsAction[]{CALL_HISTORY, UNBLOCK_DIALOG, NOT_SPAM_DIALOG, TAG, COPY, COPY_NAME, COPY_NUMBER, SHARE, MAP, EMAIL, BROWSER, SWISH, JOB};
    }

    static {
        com.truecaller.analytics.common.event.ViewActionEvent$ContactDetailsAction[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private ViewActionEvent$ContactDetailsAction(java.lang.String str, int i, java.lang.String str2) {
        this.value = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.analytics.common.event.ViewActionEvent$ContactDetailsAction valueOf(java.lang.String str) {
        return (com.truecaller.analytics.common.event.ViewActionEvent$ContactDetailsAction) java.lang.Enum.valueOf(com.truecaller.analytics.common.event.ViewActionEvent$ContactDetailsAction.class, str);
    }

    public static com.truecaller.analytics.common.event.ViewActionEvent$ContactDetailsAction[] values() {
        return (com.truecaller.analytics.common.event.ViewActionEvent$ContactDetailsAction[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getValue() {
        return this.value;
    }
}
