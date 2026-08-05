package com.truecaller.analytics.common.event;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u001c\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001e¨\u0006\u001f"}, d2 = {"com/truecaller/analytics/common/event/ViewActionEvent$InCallUiAction", "", "Lcom/truecaller/analytics/common/event/ViewActionEvent$InCallUiAction;", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "MUTE", "UNMUTE", "OPEN_KEYPAD", "HOLD", "UNHOLD", "HANG_UP", "ACCEPT", "REJECT", "REJECT_WITH_MESSAGE", "ADD_CALL", "AUDIO_ROUTE", "MERGE", "SWAP", "CHANGE_SIM", "NOTIFICATION", "ANSWER", "DECLINE", "SPEAKER_ON", "SPEAKER_OFF", "VOIP", "ASSISTANT", "common-analytics_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class ViewActionEvent$InCallUiAction {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.analytics.common.event.ViewActionEvent$InCallUiAction[] $VALUES;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String value;
    public static final com.truecaller.analytics.common.event.ViewActionEvent$InCallUiAction MUTE = new com.truecaller.analytics.common.event.ViewActionEvent$InCallUiAction("MUTE", 0, "Mute");
    public static final com.truecaller.analytics.common.event.ViewActionEvent$InCallUiAction UNMUTE = new com.truecaller.analytics.common.event.ViewActionEvent$InCallUiAction("UNMUTE", 1, "Unmute");
    public static final com.truecaller.analytics.common.event.ViewActionEvent$InCallUiAction OPEN_KEYPAD = new com.truecaller.analytics.common.event.ViewActionEvent$InCallUiAction("OPEN_KEYPAD", 2, "OpenKeypad");
    public static final com.truecaller.analytics.common.event.ViewActionEvent$InCallUiAction HOLD = new com.truecaller.analytics.common.event.ViewActionEvent$InCallUiAction("HOLD", 3, "Hold");
    public static final com.truecaller.analytics.common.event.ViewActionEvent$InCallUiAction UNHOLD = new com.truecaller.analytics.common.event.ViewActionEvent$InCallUiAction("UNHOLD", 4, "Unhold");
    public static final com.truecaller.analytics.common.event.ViewActionEvent$InCallUiAction HANG_UP = new com.truecaller.analytics.common.event.ViewActionEvent$InCallUiAction("HANG_UP", 5, "Hangup");
    public static final com.truecaller.analytics.common.event.ViewActionEvent$InCallUiAction ACCEPT = new com.truecaller.analytics.common.event.ViewActionEvent$InCallUiAction("ACCEPT", 6, "Accept");
    public static final com.truecaller.analytics.common.event.ViewActionEvent$InCallUiAction REJECT = new com.truecaller.analytics.common.event.ViewActionEvent$InCallUiAction("REJECT", 7, "Reject");
    public static final com.truecaller.analytics.common.event.ViewActionEvent$InCallUiAction REJECT_WITH_MESSAGE = new com.truecaller.analytics.common.event.ViewActionEvent$InCallUiAction("REJECT_WITH_MESSAGE", 8, "RejectWithMessage");
    public static final com.truecaller.analytics.common.event.ViewActionEvent$InCallUiAction ADD_CALL = new com.truecaller.analytics.common.event.ViewActionEvent$InCallUiAction("ADD_CALL", 9, "AddCall");
    public static final com.truecaller.analytics.common.event.ViewActionEvent$InCallUiAction AUDIO_ROUTE = new com.truecaller.analytics.common.event.ViewActionEvent$InCallUiAction("AUDIO_ROUTE", 10, "AudioRoute");
    public static final com.truecaller.analytics.common.event.ViewActionEvent$InCallUiAction MERGE = new com.truecaller.analytics.common.event.ViewActionEvent$InCallUiAction("MERGE", 11, "Merge");
    public static final com.truecaller.analytics.common.event.ViewActionEvent$InCallUiAction SWAP = new com.truecaller.analytics.common.event.ViewActionEvent$InCallUiAction("SWAP", 12, "Swap");
    public static final com.truecaller.analytics.common.event.ViewActionEvent$InCallUiAction CHANGE_SIM = new com.truecaller.analytics.common.event.ViewActionEvent$InCallUiAction("CHANGE_SIM", 13, "ChangeSIM");
    public static final com.truecaller.analytics.common.event.ViewActionEvent$InCallUiAction NOTIFICATION = new com.truecaller.analytics.common.event.ViewActionEvent$InCallUiAction("NOTIFICATION", 14, "Notification");
    public static final com.truecaller.analytics.common.event.ViewActionEvent$InCallUiAction ANSWER = new com.truecaller.analytics.common.event.ViewActionEvent$InCallUiAction("ANSWER", 15, "Answer");
    public static final com.truecaller.analytics.common.event.ViewActionEvent$InCallUiAction DECLINE = new com.truecaller.analytics.common.event.ViewActionEvent$InCallUiAction("DECLINE", 16, "Decline");
    public static final com.truecaller.analytics.common.event.ViewActionEvent$InCallUiAction SPEAKER_ON = new com.truecaller.analytics.common.event.ViewActionEvent$InCallUiAction("SPEAKER_ON", 17, "SpeakerOn");
    public static final com.truecaller.analytics.common.event.ViewActionEvent$InCallUiAction SPEAKER_OFF = new com.truecaller.analytics.common.event.ViewActionEvent$InCallUiAction("SPEAKER_OFF", 18, "SpeakerOff");
    public static final com.truecaller.analytics.common.event.ViewActionEvent$InCallUiAction VOIP = new com.truecaller.analytics.common.event.ViewActionEvent$InCallUiAction("VOIP", 19, "SwitchToVoip");
    public static final com.truecaller.analytics.common.event.ViewActionEvent$InCallUiAction ASSISTANT = new com.truecaller.analytics.common.event.ViewActionEvent$InCallUiAction("ASSISTANT", 20, "Assistant");

    private static final /* synthetic */ com.truecaller.analytics.common.event.ViewActionEvent$InCallUiAction[] $values() {
        return new com.truecaller.analytics.common.event.ViewActionEvent$InCallUiAction[]{MUTE, UNMUTE, OPEN_KEYPAD, HOLD, UNHOLD, HANG_UP, ACCEPT, REJECT, REJECT_WITH_MESSAGE, ADD_CALL, AUDIO_ROUTE, MERGE, SWAP, CHANGE_SIM, NOTIFICATION, ANSWER, DECLINE, SPEAKER_ON, SPEAKER_OFF, VOIP, ASSISTANT};
    }

    static {
        com.truecaller.analytics.common.event.ViewActionEvent$InCallUiAction[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private ViewActionEvent$InCallUiAction(java.lang.String str, int i, java.lang.String str2) {
        this.value = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.analytics.common.event.ViewActionEvent$InCallUiAction valueOf(java.lang.String str) {
        return (com.truecaller.analytics.common.event.ViewActionEvent$InCallUiAction) java.lang.Enum.valueOf(com.truecaller.analytics.common.event.ViewActionEvent$InCallUiAction.class, str);
    }

    public static com.truecaller.analytics.common.event.ViewActionEvent$InCallUiAction[] values() {
        return (com.truecaller.analytics.common.event.ViewActionEvent$InCallUiAction[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getValue() {
        return this.value;
    }
}
