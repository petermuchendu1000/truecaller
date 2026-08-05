package com.truecaller.ai_voice_detection.ui;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\r\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/truecaller/ai_voice_detection/ui/AiDetectionButtonUiState;", "", "<init>", "(Ljava/lang/String;I)V", "READY", "DETECTING", "COUNT_DOWN", "LOADING", "HUMAN_DETECTED", "HUMAN_DETECTED_CHECK_AGAIN", "FAILED_TO_DETECT", "AI_VOICE_DETECTED", "DISABLED", "FEATURE_NOT_AVAILABLE", "ai-voice-detection_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class AiDetectionButtonUiState {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.ai_voice_detection.ui.AiDetectionButtonUiState[] $VALUES;
    public static final com.truecaller.ai_voice_detection.ui.AiDetectionButtonUiState READY = new com.truecaller.ai_voice_detection.ui.AiDetectionButtonUiState("READY", 0);
    public static final com.truecaller.ai_voice_detection.ui.AiDetectionButtonUiState DETECTING = new com.truecaller.ai_voice_detection.ui.AiDetectionButtonUiState("DETECTING", 1);
    public static final com.truecaller.ai_voice_detection.ui.AiDetectionButtonUiState COUNT_DOWN = new com.truecaller.ai_voice_detection.ui.AiDetectionButtonUiState("COUNT_DOWN", 2);
    public static final com.truecaller.ai_voice_detection.ui.AiDetectionButtonUiState LOADING = new com.truecaller.ai_voice_detection.ui.AiDetectionButtonUiState("LOADING", 3);
    public static final com.truecaller.ai_voice_detection.ui.AiDetectionButtonUiState HUMAN_DETECTED = new com.truecaller.ai_voice_detection.ui.AiDetectionButtonUiState("HUMAN_DETECTED", 4);
    public static final com.truecaller.ai_voice_detection.ui.AiDetectionButtonUiState HUMAN_DETECTED_CHECK_AGAIN = new com.truecaller.ai_voice_detection.ui.AiDetectionButtonUiState("HUMAN_DETECTED_CHECK_AGAIN", 5);
    public static final com.truecaller.ai_voice_detection.ui.AiDetectionButtonUiState FAILED_TO_DETECT = new com.truecaller.ai_voice_detection.ui.AiDetectionButtonUiState("FAILED_TO_DETECT", 6);
    public static final com.truecaller.ai_voice_detection.ui.AiDetectionButtonUiState AI_VOICE_DETECTED = new com.truecaller.ai_voice_detection.ui.AiDetectionButtonUiState("AI_VOICE_DETECTED", 7);
    public static final com.truecaller.ai_voice_detection.ui.AiDetectionButtonUiState DISABLED = new com.truecaller.ai_voice_detection.ui.AiDetectionButtonUiState("DISABLED", 8);
    public static final com.truecaller.ai_voice_detection.ui.AiDetectionButtonUiState FEATURE_NOT_AVAILABLE = new com.truecaller.ai_voice_detection.ui.AiDetectionButtonUiState("FEATURE_NOT_AVAILABLE", 9);

    private static final /* synthetic */ com.truecaller.ai_voice_detection.ui.AiDetectionButtonUiState[] $values() {
        return new com.truecaller.ai_voice_detection.ui.AiDetectionButtonUiState[]{READY, DETECTING, COUNT_DOWN, LOADING, HUMAN_DETECTED, HUMAN_DETECTED_CHECK_AGAIN, FAILED_TO_DETECT, AI_VOICE_DETECTED, DISABLED, FEATURE_NOT_AVAILABLE};
    }

    static {
        com.truecaller.ai_voice_detection.ui.AiDetectionButtonUiState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private AiDetectionButtonUiState(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.ai_voice_detection.ui.AiDetectionButtonUiState valueOf(java.lang.String str) {
        return (com.truecaller.ai_voice_detection.ui.AiDetectionButtonUiState) java.lang.Enum.valueOf(com.truecaller.ai_voice_detection.ui.AiDetectionButtonUiState.class, str);
    }

    public static com.truecaller.ai_voice_detection.ui.AiDetectionButtonUiState[] values() {
        return (com.truecaller.ai_voice_detection.ui.AiDetectionButtonUiState[]) $VALUES.clone();
    }
}
