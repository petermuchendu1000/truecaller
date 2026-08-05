package com.truecaller.incallui.analytics.events;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/truecaller/incallui/analytics/events/NotificationUIEvent;", "", "<init>", "(Ljava/lang/String;I)V", "CONTENT_CLICK", "ANSWER_CLICK", "DECLINE_CLICK", "HANGUP_CLICK", "MUTE_CLICK", "UNMUTE_CLICK", "SPEAKER_ON_CLICK", "SPEAKER_OFF_CLICK", "ASSISTANT", "incallui_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class NotificationUIEvent {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.incallui.analytics.events.NotificationUIEvent[] $VALUES;
    public static final com.truecaller.incallui.analytics.events.NotificationUIEvent CONTENT_CLICK = new com.truecaller.incallui.analytics.events.NotificationUIEvent("CONTENT_CLICK", 0);
    public static final com.truecaller.incallui.analytics.events.NotificationUIEvent ANSWER_CLICK = new com.truecaller.incallui.analytics.events.NotificationUIEvent("ANSWER_CLICK", 1);
    public static final com.truecaller.incallui.analytics.events.NotificationUIEvent DECLINE_CLICK = new com.truecaller.incallui.analytics.events.NotificationUIEvent("DECLINE_CLICK", 2);
    public static final com.truecaller.incallui.analytics.events.NotificationUIEvent HANGUP_CLICK = new com.truecaller.incallui.analytics.events.NotificationUIEvent("HANGUP_CLICK", 3);
    public static final com.truecaller.incallui.analytics.events.NotificationUIEvent MUTE_CLICK = new com.truecaller.incallui.analytics.events.NotificationUIEvent("MUTE_CLICK", 4);
    public static final com.truecaller.incallui.analytics.events.NotificationUIEvent UNMUTE_CLICK = new com.truecaller.incallui.analytics.events.NotificationUIEvent("UNMUTE_CLICK", 5);
    public static final com.truecaller.incallui.analytics.events.NotificationUIEvent SPEAKER_ON_CLICK = new com.truecaller.incallui.analytics.events.NotificationUIEvent("SPEAKER_ON_CLICK", 6);
    public static final com.truecaller.incallui.analytics.events.NotificationUIEvent SPEAKER_OFF_CLICK = new com.truecaller.incallui.analytics.events.NotificationUIEvent("SPEAKER_OFF_CLICK", 7);
    public static final com.truecaller.incallui.analytics.events.NotificationUIEvent ASSISTANT = new com.truecaller.incallui.analytics.events.NotificationUIEvent("ASSISTANT", 8);

    private static final /* synthetic */ com.truecaller.incallui.analytics.events.NotificationUIEvent[] $values() {
        return new com.truecaller.incallui.analytics.events.NotificationUIEvent[]{CONTENT_CLICK, ANSWER_CLICK, DECLINE_CLICK, HANGUP_CLICK, MUTE_CLICK, UNMUTE_CLICK, SPEAKER_ON_CLICK, SPEAKER_OFF_CLICK, ASSISTANT};
    }

    static {
        com.truecaller.incallui.analytics.events.NotificationUIEvent[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private NotificationUIEvent(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.incallui.analytics.events.NotificationUIEvent valueOf(java.lang.String str) {
        return (com.truecaller.incallui.analytics.events.NotificationUIEvent) java.lang.Enum.valueOf(com.truecaller.incallui.analytics.events.NotificationUIEvent.class, str);
    }

    public static com.truecaller.incallui.analytics.events.NotificationUIEvent[] values() {
        return (com.truecaller.incallui.analytics.events.NotificationUIEvent[]) $VALUES.clone();
    }
}
