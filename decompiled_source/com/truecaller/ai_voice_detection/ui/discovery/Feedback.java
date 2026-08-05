package com.truecaller.ai_voice_detection.ui.discovery;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/truecaller/ai_voice_detection/ui/discovery/Feedback;", "", "numericValue", "", "<init>", "(Ljava/lang/String;II)V", "getNumericValue", "()I", "POSITIVE", "NEGATIVE", "ai-voice-detection_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class Feedback {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.ai_voice_detection.ui.discovery.Feedback[] $VALUES;
    private final int numericValue;
    public static final com.truecaller.ai_voice_detection.ui.discovery.Feedback POSITIVE = new com.truecaller.ai_voice_detection.ui.discovery.Feedback("POSITIVE", 0, 1);
    public static final com.truecaller.ai_voice_detection.ui.discovery.Feedback NEGATIVE = new com.truecaller.ai_voice_detection.ui.discovery.Feedback("NEGATIVE", 1, -1);

    private static final /* synthetic */ com.truecaller.ai_voice_detection.ui.discovery.Feedback[] $values() {
        return new com.truecaller.ai_voice_detection.ui.discovery.Feedback[]{POSITIVE, NEGATIVE};
    }

    static {
        com.truecaller.ai_voice_detection.ui.discovery.Feedback[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private Feedback(java.lang.String str, int i, int i2) {
        this.numericValue = i2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.ai_voice_detection.ui.discovery.Feedback valueOf(java.lang.String str) {
        return (com.truecaller.ai_voice_detection.ui.discovery.Feedback) java.lang.Enum.valueOf(com.truecaller.ai_voice_detection.ui.discovery.Feedback.class, str);
    }

    public static com.truecaller.ai_voice_detection.ui.discovery.Feedback[] values() {
        return (com.truecaller.ai_voice_detection.ui.discovery.Feedback[]) $VALUES.clone();
    }

    public final int getNumericValue() {
        return this.numericValue;
    }
}
