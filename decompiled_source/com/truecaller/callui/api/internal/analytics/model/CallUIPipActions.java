package com.truecaller.callui.api.internal.analytics.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/truecaller/callui/api/internal/analytics/model/CallUIPipActions;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "REJECT", "ACCEPT", "HANGUP", "MUTE", "UNMUTE", "SPEAKER_ON", "SPEAKER_OFF", "AUDIO_ROUTE_PICKER", "api_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class CallUIPipActions {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.callui.api.internal.analytics.model.CallUIPipActions[] $VALUES;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String value;
    public static final com.truecaller.callui.api.internal.analytics.model.CallUIPipActions REJECT = new com.truecaller.callui.api.internal.analytics.model.CallUIPipActions("REJECT", 0, "Reject");
    public static final com.truecaller.callui.api.internal.analytics.model.CallUIPipActions ACCEPT = new com.truecaller.callui.api.internal.analytics.model.CallUIPipActions("ACCEPT", 1, "Accept");
    public static final com.truecaller.callui.api.internal.analytics.model.CallUIPipActions HANGUP = new com.truecaller.callui.api.internal.analytics.model.CallUIPipActions("HANGUP", 2, "Hangup");
    public static final com.truecaller.callui.api.internal.analytics.model.CallUIPipActions MUTE = new com.truecaller.callui.api.internal.analytics.model.CallUIPipActions("MUTE", 3, "Mute");
    public static final com.truecaller.callui.api.internal.analytics.model.CallUIPipActions UNMUTE = new com.truecaller.callui.api.internal.analytics.model.CallUIPipActions("UNMUTE", 4, "Unmute");
    public static final com.truecaller.callui.api.internal.analytics.model.CallUIPipActions SPEAKER_ON = new com.truecaller.callui.api.internal.analytics.model.CallUIPipActions("SPEAKER_ON", 5, "SpeakerOn");
    public static final com.truecaller.callui.api.internal.analytics.model.CallUIPipActions SPEAKER_OFF = new com.truecaller.callui.api.internal.analytics.model.CallUIPipActions("SPEAKER_OFF", 6, "SpeakerOff");
    public static final com.truecaller.callui.api.internal.analytics.model.CallUIPipActions AUDIO_ROUTE_PICKER = new com.truecaller.callui.api.internal.analytics.model.CallUIPipActions("AUDIO_ROUTE_PICKER", 7, "AudioRoutePicker");

    private static final /* synthetic */ com.truecaller.callui.api.internal.analytics.model.CallUIPipActions[] $values() {
        return new com.truecaller.callui.api.internal.analytics.model.CallUIPipActions[]{REJECT, ACCEPT, HANGUP, MUTE, UNMUTE, SPEAKER_ON, SPEAKER_OFF, AUDIO_ROUTE_PICKER};
    }

    static {
        com.truecaller.callui.api.internal.analytics.model.CallUIPipActions[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private CallUIPipActions(java.lang.String str, int i, java.lang.String str2) {
        this.value = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.callui.api.internal.analytics.model.CallUIPipActions valueOf(java.lang.String str) {
        return (com.truecaller.callui.api.internal.analytics.model.CallUIPipActions) java.lang.Enum.valueOf(com.truecaller.callui.api.internal.analytics.model.CallUIPipActions.class, str);
    }

    public static com.truecaller.callui.api.internal.analytics.model.CallUIPipActions[] values() {
        return (com.truecaller.callui.api.internal.analytics.model.CallUIPipActions[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getValue() {
        return this.value;
    }
}
