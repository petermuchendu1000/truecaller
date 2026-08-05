package com.truecaller.call_assistant.core.callchat.feedback;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/truecaller/call_assistant/core/callchat/feedback/ScreenedCallFeedbackType;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "SCREENING", "TRANSCRIPTION", "FRAUD", "core_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class ScreenedCallFeedbackType {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.call_assistant.core.callchat.feedback.ScreenedCallFeedbackType[] $VALUES;
    private final int value;
    public static final com.truecaller.call_assistant.core.callchat.feedback.ScreenedCallFeedbackType SCREENING = new com.truecaller.call_assistant.core.callchat.feedback.ScreenedCallFeedbackType("SCREENING", 0, 0);
    public static final com.truecaller.call_assistant.core.callchat.feedback.ScreenedCallFeedbackType TRANSCRIPTION = new com.truecaller.call_assistant.core.callchat.feedback.ScreenedCallFeedbackType("TRANSCRIPTION", 1, 1);
    public static final com.truecaller.call_assistant.core.callchat.feedback.ScreenedCallFeedbackType FRAUD = new com.truecaller.call_assistant.core.callchat.feedback.ScreenedCallFeedbackType("FRAUD", 2, 2);

    private static final /* synthetic */ com.truecaller.call_assistant.core.callchat.feedback.ScreenedCallFeedbackType[] $values() {
        return new com.truecaller.call_assistant.core.callchat.feedback.ScreenedCallFeedbackType[]{SCREENING, TRANSCRIPTION, FRAUD};
    }

    static {
        com.truecaller.call_assistant.core.callchat.feedback.ScreenedCallFeedbackType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private ScreenedCallFeedbackType(java.lang.String str, int i, int i2) {
        this.value = i2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.call_assistant.core.callchat.feedback.ScreenedCallFeedbackType valueOf(java.lang.String str) {
        return (com.truecaller.call_assistant.core.callchat.feedback.ScreenedCallFeedbackType) java.lang.Enum.valueOf(com.truecaller.call_assistant.core.callchat.feedback.ScreenedCallFeedbackType.class, str);
    }

    public static com.truecaller.call_assistant.core.callchat.feedback.ScreenedCallFeedbackType[] values() {
        return (com.truecaller.call_assistant.core.callchat.feedback.ScreenedCallFeedbackType[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }
}
