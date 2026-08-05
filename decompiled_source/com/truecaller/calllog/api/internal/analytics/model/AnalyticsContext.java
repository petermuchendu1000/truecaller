package com.truecaller.calllog.api.internal.analytics.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0014"}, d2 = {"Lcom/truecaller/calllog/api/internal/analytics/model/AnalyticsContext;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "CALL_TAB_RECENTS", "CALL_TAB_MORE_MENU", "CALL_LOG", "APP_OPEN", "CALLS_TAB", "CALL_TAB_MISSED", "CALL_TAB_INCOMING", "CALL_TAB_OUTGOING", "CALL_TAB_SPAM", "CALL_TAB_RECORDINGS", "CALL_TAB_VERIFIED_BUSINESS", "CALL_TAB_NOT_SPAM", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class AnalyticsContext {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.calllog.api.internal.analytics.model.AnalyticsContext[] $VALUES;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String value;
    public static final com.truecaller.calllog.api.internal.analytics.model.AnalyticsContext CALL_TAB_RECENTS = new com.truecaller.calllog.api.internal.analytics.model.AnalyticsContext("CALL_TAB_RECENTS", 0, "callTab_recents");
    public static final com.truecaller.calllog.api.internal.analytics.model.AnalyticsContext CALL_TAB_MORE_MENU = new com.truecaller.calllog.api.internal.analytics.model.AnalyticsContext("CALL_TAB_MORE_MENU", 1, "callTab_moreMenu");
    public static final com.truecaller.calllog.api.internal.analytics.model.AnalyticsContext CALL_LOG = new com.truecaller.calllog.api.internal.analytics.model.AnalyticsContext("CALL_LOG", 2, "callLog");
    public static final com.truecaller.calllog.api.internal.analytics.model.AnalyticsContext APP_OPEN = new com.truecaller.calllog.api.internal.analytics.model.AnalyticsContext("APP_OPEN", 3, "appOpen");
    public static final com.truecaller.calllog.api.internal.analytics.model.AnalyticsContext CALLS_TAB = new com.truecaller.calllog.api.internal.analytics.model.AnalyticsContext("CALLS_TAB", 4, "CallsTab");
    public static final com.truecaller.calllog.api.internal.analytics.model.AnalyticsContext CALL_TAB_MISSED = new com.truecaller.calllog.api.internal.analytics.model.AnalyticsContext("CALL_TAB_MISSED", 5, "callTab_missed");
    public static final com.truecaller.calllog.api.internal.analytics.model.AnalyticsContext CALL_TAB_INCOMING = new com.truecaller.calllog.api.internal.analytics.model.AnalyticsContext("CALL_TAB_INCOMING", 6, "callTab_incoming");
    public static final com.truecaller.calllog.api.internal.analytics.model.AnalyticsContext CALL_TAB_OUTGOING = new com.truecaller.calllog.api.internal.analytics.model.AnalyticsContext("CALL_TAB_OUTGOING", 7, "callTab_outgoing");
    public static final com.truecaller.calllog.api.internal.analytics.model.AnalyticsContext CALL_TAB_SPAM = new com.truecaller.calllog.api.internal.analytics.model.AnalyticsContext("CALL_TAB_SPAM", 8, "callTab_spam");
    public static final com.truecaller.calllog.api.internal.analytics.model.AnalyticsContext CALL_TAB_RECORDINGS = new com.truecaller.calllog.api.internal.analytics.model.AnalyticsContext("CALL_TAB_RECORDINGS", 9, "callTab_callRecording");
    public static final com.truecaller.calllog.api.internal.analytics.model.AnalyticsContext CALL_TAB_VERIFIED_BUSINESS = new com.truecaller.calllog.api.internal.analytics.model.AnalyticsContext("CALL_TAB_VERIFIED_BUSINESS", 10, "callTab_verifiedBusiness");
    public static final com.truecaller.calllog.api.internal.analytics.model.AnalyticsContext CALL_TAB_NOT_SPAM = new com.truecaller.calllog.api.internal.analytics.model.AnalyticsContext("CALL_TAB_NOT_SPAM", 11, "callTab_notSpam");

    private static final /* synthetic */ com.truecaller.calllog.api.internal.analytics.model.AnalyticsContext[] $values() {
        return new com.truecaller.calllog.api.internal.analytics.model.AnalyticsContext[]{CALL_TAB_RECENTS, CALL_TAB_MORE_MENU, CALL_LOG, APP_OPEN, CALLS_TAB, CALL_TAB_MISSED, CALL_TAB_INCOMING, CALL_TAB_OUTGOING, CALL_TAB_SPAM, CALL_TAB_RECORDINGS, CALL_TAB_VERIFIED_BUSINESS, CALL_TAB_NOT_SPAM};
    }

    static {
        com.truecaller.calllog.api.internal.analytics.model.AnalyticsContext[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private AnalyticsContext(java.lang.String str, int i, java.lang.String str2) {
        this.value = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.calllog.api.internal.analytics.model.AnalyticsContext valueOf(java.lang.String str) {
        return (com.truecaller.calllog.api.internal.analytics.model.AnalyticsContext) java.lang.Enum.valueOf(com.truecaller.calllog.api.internal.analytics.model.AnalyticsContext.class, str);
    }

    public static com.truecaller.calllog.api.internal.analytics.model.AnalyticsContext[] values() {
        return (com.truecaller.calllog.api.internal.analytics.model.AnalyticsContext[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getValue() {
        return this.value;
    }
}
