package com.truecaller.ai_voice_detection.ui;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0015\b\u0002\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/truecaller/ai_voice_detection/ui/ToolTipEvent;", "", "text", "", "<init>", "(Ljava/lang/String;ILjava/lang/Integer;)V", "getText", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "CONNECT_CALL", "FIRST_USE", "CALL_RECORDING_IN_PROGRESS", "CALL_IS_CONFERENCE", "DISMISS", "ai-voice-detection_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class ToolTipEvent {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.ai_voice_detection.ui.ToolTipEvent[] $VALUES;

    @org.jetbrains.annotations.Nullable
    private final java.lang.Integer text;
    public static final com.truecaller.ai_voice_detection.ui.ToolTipEvent CONNECT_CALL = new com.truecaller.ai_voice_detection.ui.ToolTipEvent("CONNECT_CALL", 0, 2132017186);
    public static final com.truecaller.ai_voice_detection.ui.ToolTipEvent FIRST_USE = new com.truecaller.ai_voice_detection.ui.ToolTipEvent("FIRST_USE", 1, 2132017188);
    public static final com.truecaller.ai_voice_detection.ui.ToolTipEvent CALL_RECORDING_IN_PROGRESS = new com.truecaller.ai_voice_detection.ui.ToolTipEvent("CALL_RECORDING_IN_PROGRESS", 2, 2132017179);
    public static final com.truecaller.ai_voice_detection.ui.ToolTipEvent CALL_IS_CONFERENCE = new com.truecaller.ai_voice_detection.ui.ToolTipEvent("CALL_IS_CONFERENCE", 3, 2132017180);
    public static final com.truecaller.ai_voice_detection.ui.ToolTipEvent DISMISS = new com.truecaller.ai_voice_detection.ui.ToolTipEvent("DISMISS", 4, null);

    private static final /* synthetic */ com.truecaller.ai_voice_detection.ui.ToolTipEvent[] $values() {
        return new com.truecaller.ai_voice_detection.ui.ToolTipEvent[]{CONNECT_CALL, FIRST_USE, CALL_RECORDING_IN_PROGRESS, CALL_IS_CONFERENCE, DISMISS};
    }

    static {
        com.truecaller.ai_voice_detection.ui.ToolTipEvent[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private ToolTipEvent(java.lang.String str, int i, java.lang.Integer num) {
        this.text = num;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.ai_voice_detection.ui.ToolTipEvent valueOf(java.lang.String str) {
        return (com.truecaller.ai_voice_detection.ui.ToolTipEvent) java.lang.Enum.valueOf(com.truecaller.ai_voice_detection.ui.ToolTipEvent.class, str);
    }

    public static com.truecaller.ai_voice_detection.ui.ToolTipEvent[] values() {
        return (com.truecaller.ai_voice_detection.ui.ToolTipEvent[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getText() {
        return this.text;
    }
}
