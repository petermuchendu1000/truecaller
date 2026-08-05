package com.truecaller.incallui.analytics.events;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/truecaller/incallui/analytics/events/AnalyticsContext;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "NOTIFICATION", "NOTIFICATION_V2", "INCOMING_NOTIFICATION", "ONGOING_NOTIFICATION", "incallui_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class AnalyticsContext {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.incallui.analytics.events.AnalyticsContext[] $VALUES;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String value;
    public static final com.truecaller.incallui.analytics.events.AnalyticsContext NOTIFICATION = new com.truecaller.incallui.analytics.events.AnalyticsContext("NOTIFICATION", 0, "InCallUINotification");
    public static final com.truecaller.incallui.analytics.events.AnalyticsContext NOTIFICATION_V2 = new com.truecaller.incallui.analytics.events.AnalyticsContext("NOTIFICATION_V2", 1, "InCallUINotificationV2");
    public static final com.truecaller.incallui.analytics.events.AnalyticsContext INCOMING_NOTIFICATION = new com.truecaller.incallui.analytics.events.AnalyticsContext("INCOMING_NOTIFICATION", 2, "InCallUIIncomingNotification");
    public static final com.truecaller.incallui.analytics.events.AnalyticsContext ONGOING_NOTIFICATION = new com.truecaller.incallui.analytics.events.AnalyticsContext("ONGOING_NOTIFICATION", 3, "InCallUIOngoingNotification");

    private static final /* synthetic */ com.truecaller.incallui.analytics.events.AnalyticsContext[] $values() {
        return new com.truecaller.incallui.analytics.events.AnalyticsContext[]{NOTIFICATION, NOTIFICATION_V2, INCOMING_NOTIFICATION, ONGOING_NOTIFICATION};
    }

    static {
        com.truecaller.incallui.analytics.events.AnalyticsContext[] $values = $values();
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

    public static com.truecaller.incallui.analytics.events.AnalyticsContext valueOf(java.lang.String str) {
        return (com.truecaller.incallui.analytics.events.AnalyticsContext) java.lang.Enum.valueOf(com.truecaller.incallui.analytics.events.AnalyticsContext.class, str);
    }

    public static com.truecaller.incallui.analytics.events.AnalyticsContext[] values() {
        return (com.truecaller.incallui.analytics.events.AnalyticsContext[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getValue() {
        return this.value;
    }
}
