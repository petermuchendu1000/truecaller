package com.truecaller.ai_voice_detection.ui;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0013\b\u0002\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/truecaller/ai_voice_detection/ui/SnackBarEvent;", "", "text", "", "<init>", "(Ljava/lang/String;II)V", "getText", "()I", "ERROR_USER_NOT_PREMIUM", "ERROR_TOO_MANY_ATTEMPTS", "ERROR_NETWORK", "ERROR_GENERAL", "ERROR_FAILED_TO_MERGE", "ai-voice-detection_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class SnackBarEvent {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.ai_voice_detection.ui.SnackBarEvent[] $VALUES;
    private final int text;
    public static final com.truecaller.ai_voice_detection.ui.SnackBarEvent ERROR_USER_NOT_PREMIUM = new com.truecaller.ai_voice_detection.ui.SnackBarEvent("ERROR_USER_NOT_PREMIUM", 0, 2132017192);
    public static final com.truecaller.ai_voice_detection.ui.SnackBarEvent ERROR_TOO_MANY_ATTEMPTS = new com.truecaller.ai_voice_detection.ui.SnackBarEvent("ERROR_TOO_MANY_ATTEMPTS", 1, 2132017191);
    public static final com.truecaller.ai_voice_detection.ui.SnackBarEvent ERROR_NETWORK = new com.truecaller.ai_voice_detection.ui.SnackBarEvent("ERROR_NETWORK", 2, 2132017187);
    public static final com.truecaller.ai_voice_detection.ui.SnackBarEvent ERROR_GENERAL = new com.truecaller.ai_voice_detection.ui.SnackBarEvent("ERROR_GENERAL", 3, 2132017189);
    public static final com.truecaller.ai_voice_detection.ui.SnackBarEvent ERROR_FAILED_TO_MERGE = new com.truecaller.ai_voice_detection.ui.SnackBarEvent("ERROR_FAILED_TO_MERGE", 4, 2132017189);

    private static final /* synthetic */ com.truecaller.ai_voice_detection.ui.SnackBarEvent[] $values() {
        return new com.truecaller.ai_voice_detection.ui.SnackBarEvent[]{ERROR_USER_NOT_PREMIUM, ERROR_TOO_MANY_ATTEMPTS, ERROR_NETWORK, ERROR_GENERAL, ERROR_FAILED_TO_MERGE};
    }

    static {
        com.truecaller.ai_voice_detection.ui.SnackBarEvent[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private SnackBarEvent(java.lang.String str, int i, int i2) {
        this.text = i2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.ai_voice_detection.ui.SnackBarEvent valueOf(java.lang.String str) {
        return (com.truecaller.ai_voice_detection.ui.SnackBarEvent) java.lang.Enum.valueOf(com.truecaller.ai_voice_detection.ui.SnackBarEvent.class, str);
    }

    public static com.truecaller.ai_voice_detection.ui.SnackBarEvent[] values() {
        return (com.truecaller.ai_voice_detection.ui.SnackBarEvent[]) $VALUES.clone();
    }

    public final int getText() {
        return this.text;
    }
}
