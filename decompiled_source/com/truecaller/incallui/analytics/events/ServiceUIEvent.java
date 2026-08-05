package com.truecaller.incallui.analytics.events;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/truecaller/incallui/analytics/events/ServiceUIEvent;", "", "<init>", "(Ljava/lang/String;I)V", "INITIAL", "INCOMING_NOTIFICATION_SHOWN", "ONGOING_NOTIFICATION_SHOWN", "NOTIFICATION_GONE", "incallui_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class ServiceUIEvent {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.incallui.analytics.events.ServiceUIEvent[] $VALUES;
    public static final com.truecaller.incallui.analytics.events.ServiceUIEvent INITIAL = new com.truecaller.incallui.analytics.events.ServiceUIEvent("INITIAL", 0);
    public static final com.truecaller.incallui.analytics.events.ServiceUIEvent INCOMING_NOTIFICATION_SHOWN = new com.truecaller.incallui.analytics.events.ServiceUIEvent("INCOMING_NOTIFICATION_SHOWN", 1);
    public static final com.truecaller.incallui.analytics.events.ServiceUIEvent ONGOING_NOTIFICATION_SHOWN = new com.truecaller.incallui.analytics.events.ServiceUIEvent("ONGOING_NOTIFICATION_SHOWN", 2);
    public static final com.truecaller.incallui.analytics.events.ServiceUIEvent NOTIFICATION_GONE = new com.truecaller.incallui.analytics.events.ServiceUIEvent("NOTIFICATION_GONE", 3);

    private static final /* synthetic */ com.truecaller.incallui.analytics.events.ServiceUIEvent[] $values() {
        return new com.truecaller.incallui.analytics.events.ServiceUIEvent[]{INITIAL, INCOMING_NOTIFICATION_SHOWN, ONGOING_NOTIFICATION_SHOWN, NOTIFICATION_GONE};
    }

    static {
        com.truecaller.incallui.analytics.events.ServiceUIEvent[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private ServiceUIEvent(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.incallui.analytics.events.ServiceUIEvent valueOf(java.lang.String str) {
        return (com.truecaller.incallui.analytics.events.ServiceUIEvent) java.lang.Enum.valueOf(com.truecaller.incallui.analytics.events.ServiceUIEvent.class, str);
    }

    public static com.truecaller.incallui.analytics.events.ServiceUIEvent[] values() {
        return (com.truecaller.incallui.analytics.events.ServiceUIEvent[]) $VALUES.clone();
    }
}
