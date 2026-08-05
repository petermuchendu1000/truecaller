package com.truecaller.analytics.common.event;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"com/truecaller/analytics/common/event/ViewActionEvent$VoIPAction", "", "Lcom/truecaller/analytics/common/event/ViewActionEvent$VoIPAction;", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "NOTIFICATION", "ANSWER", "DECLINE", "HANG_UP", "MUTE", "UNMUTE", "SPEAKER_ON", "SPEAKER_OFF", "common-analytics_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class ViewActionEvent$VoIPAction {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.analytics.common.event.ViewActionEvent$VoIPAction[] $VALUES;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String value;
    public static final com.truecaller.analytics.common.event.ViewActionEvent$VoIPAction NOTIFICATION = new com.truecaller.analytics.common.event.ViewActionEvent$VoIPAction("NOTIFICATION", 0, "Notification");
    public static final com.truecaller.analytics.common.event.ViewActionEvent$VoIPAction ANSWER = new com.truecaller.analytics.common.event.ViewActionEvent$VoIPAction("ANSWER", 1, "Answer");
    public static final com.truecaller.analytics.common.event.ViewActionEvent$VoIPAction DECLINE = new com.truecaller.analytics.common.event.ViewActionEvent$VoIPAction("DECLINE", 2, "Decline");
    public static final com.truecaller.analytics.common.event.ViewActionEvent$VoIPAction HANG_UP = new com.truecaller.analytics.common.event.ViewActionEvent$VoIPAction("HANG_UP", 3, "Hangup");
    public static final com.truecaller.analytics.common.event.ViewActionEvent$VoIPAction MUTE = new com.truecaller.analytics.common.event.ViewActionEvent$VoIPAction("MUTE", 4, "Mute");
    public static final com.truecaller.analytics.common.event.ViewActionEvent$VoIPAction UNMUTE = new com.truecaller.analytics.common.event.ViewActionEvent$VoIPAction("UNMUTE", 5, "Unmute");
    public static final com.truecaller.analytics.common.event.ViewActionEvent$VoIPAction SPEAKER_ON = new com.truecaller.analytics.common.event.ViewActionEvent$VoIPAction("SPEAKER_ON", 6, "SpeakerOn");
    public static final com.truecaller.analytics.common.event.ViewActionEvent$VoIPAction SPEAKER_OFF = new com.truecaller.analytics.common.event.ViewActionEvent$VoIPAction("SPEAKER_OFF", 7, "SpeakerOff");

    private static final /* synthetic */ com.truecaller.analytics.common.event.ViewActionEvent$VoIPAction[] $values() {
        return new com.truecaller.analytics.common.event.ViewActionEvent$VoIPAction[]{NOTIFICATION, ANSWER, DECLINE, HANG_UP, MUTE, UNMUTE, SPEAKER_ON, SPEAKER_OFF};
    }

    static {
        com.truecaller.analytics.common.event.ViewActionEvent$VoIPAction[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private ViewActionEvent$VoIPAction(java.lang.String str, int i, java.lang.String str2) {
        this.value = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.analytics.common.event.ViewActionEvent$VoIPAction valueOf(java.lang.String str) {
        return (com.truecaller.analytics.common.event.ViewActionEvent$VoIPAction) java.lang.Enum.valueOf(com.truecaller.analytics.common.event.ViewActionEvent$VoIPAction.class, str);
    }

    public static com.truecaller.analytics.common.event.ViewActionEvent$VoIPAction[] values() {
        return (com.truecaller.analytics.common.event.ViewActionEvent$VoIPAction[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getValue() {
        return this.value;
    }
}
