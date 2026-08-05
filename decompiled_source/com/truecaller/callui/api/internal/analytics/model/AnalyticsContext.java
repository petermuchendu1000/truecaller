package com.truecaller.callui.api.internal.analytics.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lcom/truecaller/callui/api/internal/analytics/model/AnalyticsContext;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "DEFAULT_DIALER_IN_CALL", "NOTIFICATION_V2", "NOT_APPLICABLE", "DEFAULT_DIALER_INCOMING_CALL", "DEFAULT_DIALER_ONGOING_CALL", "DEFAULT_DIALER_OUTGOING_CALL", "FLOATING_CALL_SCREEN", "GHOST_CALL", "ANNOUNCE_CALL", "INCALLUI_DETAILSVIEW", "api_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class AnalyticsContext {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.callui.api.internal.analytics.model.AnalyticsContext[] $VALUES;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String value;
    public static final com.truecaller.callui.api.internal.analytics.model.AnalyticsContext DEFAULT_DIALER_IN_CALL = new com.truecaller.callui.api.internal.analytics.model.AnalyticsContext("DEFAULT_DIALER_IN_CALL", 0, "DefaultDialerInCall");
    public static final com.truecaller.callui.api.internal.analytics.model.AnalyticsContext NOTIFICATION_V2 = new com.truecaller.callui.api.internal.analytics.model.AnalyticsContext("NOTIFICATION_V2", 1, "InCallUINotificationV2");
    public static final com.truecaller.callui.api.internal.analytics.model.AnalyticsContext NOT_APPLICABLE = new com.truecaller.callui.api.internal.analytics.model.AnalyticsContext("NOT_APPLICABLE", 2, "n/a");
    public static final com.truecaller.callui.api.internal.analytics.model.AnalyticsContext DEFAULT_DIALER_INCOMING_CALL = new com.truecaller.callui.api.internal.analytics.model.AnalyticsContext("DEFAULT_DIALER_INCOMING_CALL", 3, "DefaultDialerIncomingCall");
    public static final com.truecaller.callui.api.internal.analytics.model.AnalyticsContext DEFAULT_DIALER_ONGOING_CALL = new com.truecaller.callui.api.internal.analytics.model.AnalyticsContext("DEFAULT_DIALER_ONGOING_CALL", 4, "DefaultDialerOngoingCall");
    public static final com.truecaller.callui.api.internal.analytics.model.AnalyticsContext DEFAULT_DIALER_OUTGOING_CALL = new com.truecaller.callui.api.internal.analytics.model.AnalyticsContext("DEFAULT_DIALER_OUTGOING_CALL", 5, "DefaultDialerOutgoingCall");
    public static final com.truecaller.callui.api.internal.analytics.model.AnalyticsContext FLOATING_CALL_SCREEN = new com.truecaller.callui.api.internal.analytics.model.AnalyticsContext("FLOATING_CALL_SCREEN", 6, "floatingCallScreen");
    public static final com.truecaller.callui.api.internal.analytics.model.AnalyticsContext GHOST_CALL = new com.truecaller.callui.api.internal.analytics.model.AnalyticsContext("GHOST_CALL", 7, "ghostCall");
    public static final com.truecaller.callui.api.internal.analytics.model.AnalyticsContext ANNOUNCE_CALL = new com.truecaller.callui.api.internal.analytics.model.AnalyticsContext("ANNOUNCE_CALL", 8, "announceCall");
    public static final com.truecaller.callui.api.internal.analytics.model.AnalyticsContext INCALLUI_DETAILSVIEW = new com.truecaller.callui.api.internal.analytics.model.AnalyticsContext("INCALLUI_DETAILSVIEW", 9, "InCallUIDetailsView");

    private static final /* synthetic */ com.truecaller.callui.api.internal.analytics.model.AnalyticsContext[] $values() {
        return new com.truecaller.callui.api.internal.analytics.model.AnalyticsContext[]{DEFAULT_DIALER_IN_CALL, NOTIFICATION_V2, NOT_APPLICABLE, DEFAULT_DIALER_INCOMING_CALL, DEFAULT_DIALER_ONGOING_CALL, DEFAULT_DIALER_OUTGOING_CALL, FLOATING_CALL_SCREEN, GHOST_CALL, ANNOUNCE_CALL, INCALLUI_DETAILSVIEW};
    }

    static {
        com.truecaller.callui.api.internal.analytics.model.AnalyticsContext[] $values = $values();
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

    public static com.truecaller.callui.api.internal.analytics.model.AnalyticsContext valueOf(java.lang.String str) {
        return (com.truecaller.callui.api.internal.analytics.model.AnalyticsContext) java.lang.Enum.valueOf(com.truecaller.callui.api.internal.analytics.model.AnalyticsContext.class, str);
    }

    public static com.truecaller.callui.api.internal.analytics.model.AnalyticsContext[] values() {
        return (com.truecaller.callui.api.internal.analytics.model.AnalyticsContext[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getValue() {
        return this.value;
    }
}
