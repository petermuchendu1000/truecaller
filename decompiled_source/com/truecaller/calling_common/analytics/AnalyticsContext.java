package com.truecaller.calling_common.analytics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/truecaller/calling_common/analytics/AnalyticsContext;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "SETTINGS_SCREEN", "CALLS_SETTINGS", "CALL_TAB_MORE_MENU", "CALL_LOG", "GO_TO_PHONE_SETTINGS_DIALOGUE", "CALL_TAB_RECENTS", "SET_DEFAULT_DIALER_ALERT_SHORT", "SET_DEFAULT_DIALER_ALERT_LONG", "calling-common_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class AnalyticsContext {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.calling_common.analytics.AnalyticsContext[] $VALUES;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String value;
    public static final com.truecaller.calling_common.analytics.AnalyticsContext SETTINGS_SCREEN = new com.truecaller.calling_common.analytics.AnalyticsContext("SETTINGS_SCREEN", 0, "settings_screen");
    public static final com.truecaller.calling_common.analytics.AnalyticsContext CALLS_SETTINGS = new com.truecaller.calling_common.analytics.AnalyticsContext("CALLS_SETTINGS", 1, "callsSettings");
    public static final com.truecaller.calling_common.analytics.AnalyticsContext CALL_TAB_MORE_MENU = new com.truecaller.calling_common.analytics.AnalyticsContext("CALL_TAB_MORE_MENU", 2, "callTab_moreMenu");
    public static final com.truecaller.calling_common.analytics.AnalyticsContext CALL_LOG = new com.truecaller.calling_common.analytics.AnalyticsContext("CALL_LOG", 3, "callLog");
    public static final com.truecaller.calling_common.analytics.AnalyticsContext GO_TO_PHONE_SETTINGS_DIALOGUE = new com.truecaller.calling_common.analytics.AnalyticsContext("GO_TO_PHONE_SETTINGS_DIALOGUE", 4, "goToPhoneSettingsDialogue");
    public static final com.truecaller.calling_common.analytics.AnalyticsContext CALL_TAB_RECENTS = new com.truecaller.calling_common.analytics.AnalyticsContext("CALL_TAB_RECENTS", 5, "callTab_recents");
    public static final com.truecaller.calling_common.analytics.AnalyticsContext SET_DEFAULT_DIALER_ALERT_SHORT = new com.truecaller.calling_common.analytics.AnalyticsContext("SET_DEFAULT_DIALER_ALERT_SHORT", 6, "setDefaultDialerAlertShort");
    public static final com.truecaller.calling_common.analytics.AnalyticsContext SET_DEFAULT_DIALER_ALERT_LONG = new com.truecaller.calling_common.analytics.AnalyticsContext("SET_DEFAULT_DIALER_ALERT_LONG", 7, "setDefaultDialerAlertLong");

    private static final /* synthetic */ com.truecaller.calling_common.analytics.AnalyticsContext[] $values() {
        return new com.truecaller.calling_common.analytics.AnalyticsContext[]{SETTINGS_SCREEN, CALLS_SETTINGS, CALL_TAB_MORE_MENU, CALL_LOG, GO_TO_PHONE_SETTINGS_DIALOGUE, CALL_TAB_RECENTS, SET_DEFAULT_DIALER_ALERT_SHORT, SET_DEFAULT_DIALER_ALERT_LONG};
    }

    static {
        com.truecaller.calling_common.analytics.AnalyticsContext[] $values = $values();
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

    public static com.truecaller.calling_common.analytics.AnalyticsContext valueOf(java.lang.String str) {
        return (com.truecaller.calling_common.analytics.AnalyticsContext) java.lang.Enum.valueOf(com.truecaller.calling_common.analytics.AnalyticsContext.class, str);
    }

    public static com.truecaller.calling_common.analytics.AnalyticsContext[] values() {
        return (com.truecaller.calling_common.analytics.AnalyticsContext[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getValue() {
        return this.value;
    }
}
